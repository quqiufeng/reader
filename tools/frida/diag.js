console.log('[diag] Script.runtime=' + Script.runtime);
console.log('[diag] typeof Java=' + (typeof Java));
console.log('[diag] typeof Process=' + (typeof Process));
try { var jb = require('frida-java-bridge'); console.log('[diag] require bridge ok ' + (typeof jb)); } catch (e) { console.log('[diag] require bridge err ' + e); }
try { console.log('[diag] Android=' + (typeof Android)); } catch (e) {}
