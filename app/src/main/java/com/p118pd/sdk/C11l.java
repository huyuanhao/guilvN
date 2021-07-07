package com.p118pd.sdk;

import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨11l丨丨  reason: invalid class name */
public class C11l implements AbstractC9875iiI {
    public C5539Iil OooO00o = new C5539Iil();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5910L1I f22737OooO00o = new C5910L1I();

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return "GOST28147Wrap";
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof liLL1l) {
            r4 = ((liLL1l) r4).OooO00o();
        }
        C6403ii r42 = (C6403ii) r4;
        this.OooO00o.OooO00o(z, r42.OooO00o());
        this.f22737OooO00o.OooO00o(new C6274iilL1L((C6642li1LI) (r42.OooO00o() instanceof C9374IiI ? ((C9374IiI) r42.OooO00o()).OooO00o() : r42.OooO00o()), r42.m17518OooO00o()));
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        this.f22737OooO00o.update(bArr, i, i2);
        byte[] bArr2 = new byte[(this.f22737OooO00o.OooO00o() + i2)];
        this.OooO00o.OooO00o(bArr, i, bArr2, 0);
        this.OooO00o.OooO00o(bArr, i + 8, bArr2, 8);
        this.OooO00o.OooO00o(bArr, i + 16, bArr2, 16);
        this.OooO00o.OooO00o(bArr, i + 24, bArr2, 24);
        this.f22737OooO00o.OooO00o(bArr2, i2);
        return bArr2;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int OooO00o2 = i2 - this.f22737OooO00o.OooO00o();
        byte[] bArr2 = new byte[OooO00o2];
        this.OooO00o.OooO00o(bArr, i, bArr2, 0);
        this.OooO00o.OooO00o(bArr, i + 8, bArr2, 8);
        this.OooO00o.OooO00o(bArr, i + 16, bArr2, 16);
        this.OooO00o.OooO00o(bArr, i + 24, bArr2, 24);
        byte[] bArr3 = new byte[this.f22737OooO00o.OooO00o()];
        this.f22737OooO00o.update(bArr2, 0, OooO00o2);
        this.f22737OooO00o.OooO00o(bArr3, 0);
        byte[] bArr4 = new byte[this.f22737OooO00o.OooO00o()];
        System.arraycopy(bArr, (i + i2) - 4, bArr4, 0, this.f22737OooO00o.OooO00o());
        if (C9586iIILl.OooO0O0(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }
}
