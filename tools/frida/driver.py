import os
import sys
import time
import frida

HOST = "127.0.0.1:27042"
JS = sys.argv[1] if len(sys.argv) > 1 else os.path.join(os.path.dirname(os.path.abspath(__file__)), "hook_sig.js")
WAIT = float(sys.argv[2]) if len(sys.argv) > 2 else 20.0

dev = frida.get_device_manager().add_remote_device(HOST)
print("[driver] device:", dev, flush=True)

session = None
deadline = time.time() + 10
last = None
while time.time() < deadline:
    try:
        session = dev.attach("Gadget")
        break
    except Exception as e:
        last = e
        time.sleep(0.25)
if session is None:
    print("[driver] attach failed:", last, flush=True)
    sys.exit(1)
print("[driver] attached pid", session.pid, flush=True)

with open(JS, "r") as f:
    source = f.read()

script = session.create_script(source)
script.on("message", lambda msg, data: print("[script]", msg, flush=True))
try:
    script.load()
    print("[driver] script loaded", flush=True)
except Exception as e:
    print("[driver] script load error:", e, flush=True)

try:
    session.resume()
    print("[driver] resumed", flush=True)
except Exception as e:
    print("[driver] resume error:", e, flush=True)

time.sleep(WAIT)
try:
    session.detach()
except Exception:
    pass
print("[driver] done", flush=True)
