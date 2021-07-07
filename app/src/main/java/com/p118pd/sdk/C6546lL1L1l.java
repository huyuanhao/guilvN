package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.lL1L1l  reason: case insensitive filesystem */
public class C6546lL1L1l implements AbstractC5474IllI1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f18450OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f18451OooO00o;

    public C6546lL1L1l(lIL1i11 r1, SecureRandom secureRandom) {
        this.f18450OooO00o = r1;
        this.OooO00o = r1.OooO00o();
        this.f18451OooO00o = secureRandom;
    }

    private byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.f18450OooO00o.OooO0O0()];
        this.f18450OooO00o.update(bArr, 0, bArr.length);
        this.f18450OooO00o.update(bArr2, 0, bArr2.length);
        this.f18450OooO00o.OooO00o(bArr3, 0);
        return bArr3;
    }

    @Override // com.p118pd.sdk.AbstractC5474IllI1
    public C9676lI1ilI OooO00o(byte[] bArr) {
        int length = bArr.length;
        int i = this.OooO00o;
        if (length <= i / 2) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            this.f18451OooO00o.nextBytes(bArr2);
            return new C9676lI1ilI(bArr2, OooO00o(bArr2, bArr));
        }
        throw new DataLengthException("Message to be committed to too large for digest.");
    }

    @Override // com.p118pd.sdk.AbstractC5474IllI1
    public boolean OooO00o(C9676lI1ilI r3, byte[] bArr) {
        if (bArr.length + r3.OooO0O0().length == this.OooO00o) {
            return C9586iIILl.OooO0O0(r3.OooO00o(), OooO00o(r3.OooO0O0(), bArr));
        }
        throw new DataLengthException("Message and witness secret lengths do not match.");
    }
}
