import sys, struct, zlib, hashlib, os
def fix(path):
    d = bytearray(open(path,'rb').read())
    if d[:4] != b'dex\n':
        return False
    d[12:32] = hashlib.sha1(d[32:]).digest()
    d[8:12] = struct.pack('<I', zlib.adler32(bytes(d[12:])) & 0xffffffff)
    open(path,'wb').write(d)
    return True
for p in sys.argv[1:]:
    print(p, fix(p))
