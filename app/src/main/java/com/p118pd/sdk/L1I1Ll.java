package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L1I1Ll  reason: invalid class name */
public class L1I1Ll extends AbstractC5738Lil {
    public Ll11 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23012OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f23013OooO00o;

    public L1I1Ll(I11li1 i11li1) {
        this.f23012OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0));
        int size = i11li1.size();
        if (size != 1) {
            if (size != 2) {
                if (size == 3) {
                    this.f23013OooO00o = C9623il.OooO00o(i11li1.OooO00o(1));
                } else {
                    throw new IllegalArgumentException("Invalid RecipientKeyIdentifier");
                }
            } else if (i11li1.OooO00o(1) instanceof C9623il) {
                this.f23013OooO00o = C9623il.OooO00o(i11li1.OooO00o(1));
                return;
            }
            this.OooO00o = Ll11.OooO00o(i11li1.OooO00o(2));
        }
    }

    public L1I1Ll(AbstractC6804llL1ii r1, C9623il r2, Ll11 ll11) {
        this.f23012OooO00o = r1;
        this.f23013OooO00o = r2;
        this.OooO00o = ll11;
    }

    public L1I1Ll(byte[] bArr) {
        this(bArr, (C9623il) null, (Ll11) null);
    }

    public L1I1Ll(byte[] bArr, C9623il r3, Ll11 ll11) {
        this.f23012OooO00o = new C6487lIIiIlL(bArr);
        this.f23013OooO00o = r3;
        this.OooO00o = ll11;
    }

    public static L1I1Ll OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static L1I1Ll OooO00o(Object obj) {
        if (obj instanceof L1I1Ll) {
            return (L1I1Ll) obj;
        }
        if (obj != null) {
            return new L1I1Ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Ll11 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21507OooO00o() {
        return this.f23012OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m21508OooO00o() {
        return this.f23013OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23012OooO00o);
        C9623il r1 = this.f23013OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        Ll11 ll11 = this.OooO00o;
        if (ll11 != null) {
            r0.OooO00o(ll11);
        }
        return new C5707LiL1(r0);
    }
}
