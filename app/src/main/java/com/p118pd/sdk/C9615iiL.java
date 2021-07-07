package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

/* renamed from: com.pd.sdk.丨iiL  reason: invalid class name and case insensitive filesystem */
public final class C9615iiL extends OutputStream {
    public Mac OooO00o;

    public C9615iiL(Mac mac) {
        this.OooO00o = mac;
    }

    public byte[] OooO0O0() {
        return this.OooO00o.doFinal();
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
