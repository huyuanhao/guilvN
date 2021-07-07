package com.taobao.accs.utl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.taobao.accs.utl.s */
public class C3189s extends ByteArrayInputStream {
    public C3189s(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public int mo37788a() {
        return read() & 255;
    }

    /* renamed from: b */
    public int mo37790b() {
        return (mo37788a() << 8) | mo37788a();
    }

    /* renamed from: c */
    public byte[] mo37791c() throws IOException {
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }

    /* renamed from: a */
    public String mo37789a(int i) throws IOException {
        byte[] bArr = new byte[i];
        int read = read(bArr);
        if (read == i) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i + " but read for " + read);
    }
}
