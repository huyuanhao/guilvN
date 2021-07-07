package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II1 */
public class II1 extends AbstractC5738Lil {
    public Ll11 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15433OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f15434OooO00o;

    public II1(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2;
        this.f15433OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(0);
        int size = i11li1.size();
        if (size != 1) {
            if (size == 2) {
                boolean z = i11li1.OooO00o(1) instanceof C9623il;
                OooO00o2 = i11li1.OooO00o(1);
                if (z) {
                    this.f15434OooO00o = (C9623il) OooO00o2;
                    return;
                }
            } else if (size == 3) {
                this.f15434OooO00o = (C9623il) i11li1.OooO00o(1);
                OooO00o2 = i11li1.OooO00o(2);
            } else {
                throw new IllegalArgumentException("Invalid KEKIdentifier");
            }
            this.OooO00o = Ll11.OooO00o(OooO00o2);
        }
    }

    public II1(byte[] bArr, C9623il r3, Ll11 ll11) {
        this.f15433OooO00o = new C6487lIIiIlL(bArr);
        this.f15434OooO00o = r3;
        this.OooO00o = ll11;
    }

    public static II1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static II1 OooO00o(Object obj) {
        if (obj == null || (obj instanceof II1)) {
            return (II1) obj;
        }
        if (obj instanceof I11li1) {
            return new II1((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid KEKIdentifier: " + obj.getClass().getName());
    }

    public Ll11 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15347OooO00o() {
        return this.f15433OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m15348OooO00o() {
        return this.f15434OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15433OooO00o);
        C9623il r1 = this.f15434OooO00o;
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
