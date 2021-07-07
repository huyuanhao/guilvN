package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1Ll  reason: invalid class name and case insensitive filesystem */
public class C93011Ll implements AbstractC9643iIi {
    public C6512lIilLl OooO00o;

    @Override // com.p118pd.sdk.AbstractC9643iIi
    public AbstractC9738llL1L OooO00o(C6238iiL1 iil1) {
        C6512lIilLl r0 = this.OooO00o;
        if (r0 != null) {
            IIiLIli OooO00o2 = r0.OooO00o().OooO00o();
            return Lii1I.OooO00o(OooO00o2, iil1.OooO0O0()).OooO0O0(Lii1I.OooO00o(OooO00o2, iil1.OooO00o()).OooO00o(this.OooO00o.OooO00o())).OooO0Oo();
        }
        throw new IllegalStateException("ECElGamalDecryptor not initialised");
    }

    @Override // com.p118pd.sdk.AbstractC9643iIi
    public void OooO00o(AbstractC6370iIIIl r2) {
        if (r2 instanceof C6512lIilLl) {
            this.OooO00o = (C6512lIilLl) r2;
            return;
        }
        throw new IllegalArgumentException("ECPrivateKeyParameters are required for decryption.");
    }
}
