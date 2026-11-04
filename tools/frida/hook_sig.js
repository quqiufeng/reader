var ORIG_B64 = "MIIDDzCCAfegAwIBAgIEPNi+yzANBgkqhkiG9w0BAQsFADA4MRAwDgYDVQQIEwdiZWlqaW5nMRAwDgYDVQQHEwdiZWlqaW5nMRIwEAYDVQQDEwlaZW50cmFlZGkwHhcNMTkxMTIyMTAwNTU4WhcNNDQxMTE1MTAwNTU4WjA4MRAwDgYDVQQIEwdiZWlqaW5nMRAwDgYDVQQHEwdiZWlqaW5nMRIwEAYDVQQDEwlaZW50cmFlZGkwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDJ3+oqMNgxDHqowxkYP7NGokwvScCh7ZF+/3DSRuC3hhwrKBFQvod9NlayP/RDVQN//2rUB+WaB9UG9/MEr1NF9f95blckCUryDbo7Y4X2d8kBJcPbpSearQsb4kynVe5eW1j8hmQdJwDGkReYHeOktBA8d6mJA9CXvc/Rbej3c5QZ2lIE1k26mZyEMitcpYtbCoRo8lr58DMsSFNMmkEDs7d+m0JPSzv1VPgcLvLVNM7srButyZEdP2L74b8t9kOkQnJF+UrAr37D8/l0uXpNihWLOJ95YECfJyFDBC+3NQ9E295MAcLayzCoDKx9UNIwa8HMkNWWSZhX6GPrOFI/AgMBAAGjITAfMB0GA1UdDgQWBBRqJQ25gNJtsPbJj/WdoLv1U0e7fzANBgkqhkiG9w0BAQsFAAOCAQEAFxJWmNdHGPI4wC8nX3/G0A46a6a3YcWGOW/8/3PaNHGYDn39FMwdxw/LMEsmAJXr7SawdwMfecEh2dJvmcDfWZsFOVLh4Pmw6xyRqWMqPTXIiyBDSsjGOYLhsbxWZQzI0j6Xs08cF87i2s+DS6v2bB8gorEPLtgOvoCzCS28YVw3gV6lq5FhDnx5PMTWC2OcXpNqsh7bCtrTMo4kHpezZSabcVRqOiDP8HkO5BIWUNkIluRc6x+FAecuLcs+MpqGioWQbSGU61PnxHO/GPT0rnBQM0lbEov67Bb2qrL0DijLj4KfbsMjyf1n06I4T8H6E28ekie5vK79xzRLxKrUIQ==";
var PKG = "com.zentraedi.zspace";

function b64ToJavaBytes(b64) {
    var bin = atob(b64);
    var arr = [];
    for (var i = 0; i < bin.length; i++) arr.push(bin.charCodeAt(i));
    return Java.array('byte', arr);
}

Java.perform(function () {
    var Signature = Java.use('android.content.pm.Signature');
    var sig = Signature.$new(b64ToJavaBytes(ORIG_B64));
    var sigArr = Java.array('android.content.pm.Signature', [sig]);
    console.log('[hook] original signature ready');

    function patchInfo(pi) {
        if (pi === null || pi === undefined) return pi;
        try {
            pi.signatures.value = sigArr;
            console.log('[hook] patched PackageInfo.signatures');
        } catch (e) {
            console.log('[hook] patch signatures failed: ' + e);
        }
        return pi;
    }

    var APM = Java.use('android.app.ApplicationPackageManager');
    ['getPackageInfo', 'getPackageInfoAsUser', 'getPackageInfoAsUserCached'].forEach(function (name) {
        try {
            var m = APM[name];
            if (!m) return;
            m.overloads.forEach(function (ov) {
                ov.implementation = function () {
                    var args = Array.prototype.slice.call(arguments);
                    var ret = ov.call(this, ...args);
                    if (args[0] === PKG) {
                        console.log('[hook] ' + name + '(' + args[0] + ', ' + args[1] + ')');
                        return patchInfo(ret);
                    }
                    return ret;
                };
            });
            console.log('[hook] hooked ' + name);
        } catch (e) {
            console.log('[hook] ' + name + ' not hooked: ' + e);
        }
    });

    try {
        var SI = Java.use('android.content.pm.SigningInfo');
        SI.getApkContentsSigners.implementation = function () {
            console.log('[hook] getApkContentsSigners -> orig');
            return sigArr;
        };
        SI.getSigningCertificateHistory.implementation = function () {
            console.log('[hook] getSigningCertificateHistory -> orig');
            return sigArr;
        };
        console.log('[hook] hooked SigningInfo');
    } catch (e) {
        console.log('[hook] SigningInfo not hooked: ' + e);
    }

    console.log('[hook] done');
});
