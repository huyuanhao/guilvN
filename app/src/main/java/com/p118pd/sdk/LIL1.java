package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.LIL1 */
public class LIL1 extends OutputStream {
    public AbstractC6769llL1L OooO00o;

    public LIL1(AbstractC6769llL1L lll1l) {
        this.OooO00o = lll1l;
    }

    public byte[] OooO0O0() {
        byte[] bArr = new byte[this.OooO00o.OooO00o()];
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
