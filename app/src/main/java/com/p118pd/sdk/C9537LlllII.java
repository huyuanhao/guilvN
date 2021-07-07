package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.丨LlllII  reason: invalid class name and case insensitive filesystem */
public class C9537LlllII extends OutputStream {
    public AbstractC6436l11LI OooO00o;

    public C9537LlllII(AbstractC6436l11LI r1) {
        this.OooO00o = r1;
    }

    public byte[] OooO0O0() {
        byte[] bArr = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.OooO00o.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.update(bArr, i, i2);
    }
}
