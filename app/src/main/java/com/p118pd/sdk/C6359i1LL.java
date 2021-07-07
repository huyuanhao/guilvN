package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.i丨1LL  reason: invalid class name and case insensitive filesystem */
public class C6359i1LL implements AbstractC93131l {
    public C5600L1iLL OooO00o;

    public C6359i1LL(C5600L1iLL r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC93131l
    public C6213iL11I OooO00o(InputStream inputStream) throws IOException {
        byte[] bArr;
        int read = inputStream.read();
        if (read != 0) {
            if (read == 2 || read == 3) {
                bArr = new byte[(((this.OooO00o.OooO00o().OooO0O0() + 7) / 8) + 1)];
            } else if (read == 4 || read == 6 || read == 7) {
                bArr = new byte[((((this.OooO00o.OooO00o().OooO0O0() + 7) / 8) * 2) + 1)];
            } else {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(read, 16));
            }
            bArr[0] = (byte) read;
            C6304ilIi1.OooO00o(inputStream, bArr, 1, bArr.length - 1);
            return new LL1ii1l(this.OooO00o.OooO00o().OooO00o(bArr), this.OooO00o);
        }
        throw new IOException("Sender's public key invalid.");
    }
}
