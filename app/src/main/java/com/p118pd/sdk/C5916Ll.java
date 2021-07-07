package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨丨l  reason: invalid class name and case insensitive filesystem */
public class C5916Ll implements AbstractC5516ILIL1l {
    public final C6257iiL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6772llLil f16931OooO00o;

    /* renamed from: com.pd.sdk.L丨丨l$OooO00o */
    public class OooO00o implements AbstractC9696lLl1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6186iLi1 f16932OooO00o;

        public OooO00o(AbstractC6186iLi1 r2) {
            this.f16932OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC9696lLl1
        public AbstractC6436l11LI OooO00o() {
            return (AbstractC6436l11LI) this.f16932OooO00o.OooO00o();
        }
    }

    public C5916Ll(AbstractC6436l11LI r3) {
        if (r3 instanceof AbstractC6186iLi1) {
            this.OooO00o = new C6257iiL1L(new OooO00o(((AbstractC6186iLi1) r3).OooO00o()));
            return;
        }
        throw new IllegalArgumentException("digest must implement Memoable");
    }

    @Override // com.p118pd.sdk.AbstractC5516ILIL1l
    public C6213iL11I OooO00o() {
        C6772llLil lllil = this.f16931OooO00o;
        this.f16931OooO00o = null;
        return lllil;
    }

    @Override // com.p118pd.sdk.l1lILl
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        if (z) {
            this.f16931OooO00o = r3 instanceof liLL1l ? (C6772llLil) ((liLL1l) r3).OooO00o() : (C6772llLil) r3;
        }
        this.OooO00o.OooO00o(z, r3);
    }

    @Override // com.p118pd.sdk.l1lILl
    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        return this.OooO00o.OooO00o(bArr, bArr2);
    }

    @Override // com.p118pd.sdk.l1lILl
    public byte[] OooO00o(byte[] bArr) {
        if (this.f16931OooO00o != null) {
            byte[] OooO00o2 = this.OooO00o.OooO00o(bArr);
            this.f16931OooO00o = this.f16931OooO00o.OooO00o();
            return OooO00o2;
        }
        throw new IllegalStateException("signing key no longer usable");
    }
}
