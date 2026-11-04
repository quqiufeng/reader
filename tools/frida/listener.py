import os
import socket, sys
port = int(sys.argv[1]) if len(sys.argv) > 1 else 27099
out = sys.argv[2] if len(sys.argv) > 2 else os.path.join(os.path.dirname(os.path.abspath(__file__)), 'sock.log')
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
s.bind(('127.0.0.1', port))
s.listen(5)
print('listening', port, flush=True)
while True:
    c, a = s.accept()
    with open(out, 'ab') as f:
        while True:
            d = c.recv(65536)
            if not d:
                break
            f.write(d); f.flush()
    c.close()
