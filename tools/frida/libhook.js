var PKG = "com.zentraedi.zspace";
var ORIG_B64 = "MIIDDzCCAfegAwIBAgIEPNi+yzANBgkqhkiG9w0BAQsFADA4MRAwDgYDVQQIEwdiZWlqaW5nMRAwDgYDVQQHEwdiZWlqaW5nMRIwEAYDVQQDEwlaZW50cmFlZGkwHhcNMTkxMTIyMTAwNTU4WhcNNDQxMTE1MTAwNTU4WjA4MRAwDgYDVQQIEwdiZWlqaW5nMRAwDgYDVQQHEwdiZWlqaW5nMRIwEAYDVQQDEwlaZW50cmFlZGkwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDJ3+oqMNgxDHqowxkYP7NGokwvScCh7ZF+/3DSRuC3hhwrKBFQvod9NlayP/RDVQN//2rUB+WaB9UG9/MEr1NF9f95blckCUryDbo7Y4X2d8kBJcPbpSearQsb4kynVe5eW1j8hmQdJwDGkReYHeOktBA8d6mJA9CXvc/Rbej3c5QZ2lIE1k26mZyEMitcpYtbCoRo8lr58DMsSFNMmkEDs7d+m0JPSzv1VPgcLvLVNM7srButyZEdP2L74b8t9kOkQnJF+UrAr37D8/l0uXpNihWLOJ95YECfJyFDBC+3NQ9E295MAcLayzCoDKx9UNIwa8HMkNWWSZhX6GPrOFI/AgMBAAGjITAfMB0GA1UdDgQWBBRqJQ25gNJtsPbJj/WdoLv1U0e7fzANBgkqhkiG9w0BAQsFAAOCAQEAFxJWmNdHGPI4wC8nX3/G0A46a6a3YcWGOW/8/3PaNHGYDn39FMwdxw/LMEsmAJXr7SawdwMfecEh2dJvmcDfWZsFOVLh4Pmw6xyRqWMqPTXIiyBDSsjGOYLhsbxWZQzI0j6Xs08cF87i2s+DS6v2bB8gorEPLtgOvoCzCS28YVw3gV6lq5FhDnx5PMTWC2OcXpNqsh7bCtrTMo4kHpezZSabcVRqOiDP8HkO5BIWUNkIluRc6x+FAecuLcs+MpqGioWQbSGU61PnxHO/GPT0rnBQM0lbEov67Bb2qrL0DijLj4KfbsMjyf1n06I4T8H6E28ekie5vK79xzRLxKrUIQ==";

var conn = null;
var queue = [];
function send(s) {
    if (conn !== null) {
        try { conn.write(s + "\n"); } catch (e) {}
    } else {
        queue.push(s);
    }
    try { console.log(s); } catch (e) {}
}

Socket.connect({ family: 'ipv4', host: '127.0.0.1', port: 27099 })
    .then(function (c) {
        conn = c;
        send('[hook] socket connected runtime=' + Script.runtime);
        while (queue.length > 0) {
            var s = queue.shift();
            try { c.write(s + "\n"); } catch (e) {}
        }
    })
    .catch(function (e) {
        try { console.log('[hook] socket error ' + e); } catch (x) {}
    });

send('[hook] evaluating runtime=' + Script.runtime + ' Java=' + (typeof Java));

function b64ToJavaBytes(b64) {
    var bin = atob(b64);
    var arr = [];
    for (var i = 0; i < bin.length; i++) arr.push(bin.charCodeAt(i));
    return Java.array('byte', arr);
}

Java.perform(function () {
    send('[hook] inside Java.perform');
    var Signature = Java.use('android.content.pm.Signature');
    var sig = Signature.$new(b64ToJavaBytes(ORIG_B64));
    var sigArr = Java.array('android.content.pm.Signature', [sig]);
    send('[hook] original signature ready');

    function patchInfo(pi, tag) {
        if (pi === null || pi === undefined) return pi;
        try {
            pi.signatures.value = sigArr;
            send('[hook] patched signatures via ' + tag);
        } catch (e) {
            send('[hook] patch failed ' + tag + ': ' + e);
        }
        return pi;
    }

    var APM = Java.use('android.app.ApplicationPackageManager');
    ['getPackageInfo', 'getPackageInfoAsUser'].forEach(function (name) {
        try {
            var m = APM[name];
            if (!m) { send('[hook] no method ' + name); return; }
            m.overloads.forEach(function (ov) {
                ov.implementation = function () {
                    var args = Array.prototype.slice.call(arguments);
                    var ret = ov.call(this, ...args);
                    if (args[0] === PKG) {
                        send('[hook] ' + name + ' pkg=' + args[0] + ' flags=' + args[1]);
                        return patchInfo(ret, name);
                    }
                    return ret;
                };
            });
            send('[hook] hooked ' + name);
        } catch (e) {
            send('[hook] ' + name + ' hook error: ' + e);
        }
    });

    try {
        var SI = Java.use('android.content.pm.SigningInfo');
        SI.getApkContentsSigners.implementation = function () {
            send('[hook] getApkContentsSigners -> orig');
            return sigArr;
        };
        SI.getSigningCertificateHistory.implementation = function () {
            send('[hook] getSigningCertificateHistory -> orig');
            return sigArr;
        };
        send('[hook] hooked SigningInfo');
    } catch (e) {
        send('[hook] SigningInfo error: ' + e);
    }
    send('[hook] hooks installed');
});
