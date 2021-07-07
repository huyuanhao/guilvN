package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LlLi  reason: invalid class name and case insensitive filesystem */
public class C9530LlLi extends C6588lLLii {
    public C9530LlLi(AbstractC5649LIlI r1, AbstractC6427ii r2, AbstractC6769llL1L lll1l) {
        super(r1, r2, lll1l);
    }

    public C9530LlLi(AbstractC5649LIlI r1, AbstractC6427ii r2, AbstractC6769llL1L lll1l, C6744ll1L r4) {
        super(r1, r2, lll1l, r4);
    }

    @Override // com.p118pd.sdk.C6588lLLii
    public byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            AbstractC6464l1l.OooO00o(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }
}
