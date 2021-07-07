package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.ii丨L  reason: invalid class name and case insensitive filesystem */
public class C6284iiL extends OutputStream {
    public C5802Llli OooO00o = new C5802Llli();

    public C5802Llli OooO00o() {
        return this.OooO00o;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.OooO00o.OooO00o(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.OooO00o(bArr, i, i2);
    }
}
