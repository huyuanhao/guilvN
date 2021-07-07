package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.li1l1iL */
public class li1l1iL extends OutputStream {
    public AbstractC93171I1 OooO00o;

    public li1l1iL(AbstractC93171I1 r1) {
        this.OooO00o = r1;
    }

    public boolean OooO00o(byte[] bArr) {
        return this.OooO00o.OooO00o(bArr);
    }

    public byte[] OooO0O0() throws CryptoException {
        return this.OooO00o.OooO0O0();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.OooO00o.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.OooO00o.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.update(bArr, i, i2);
    }
}
