package com.p118pd.sdk;

/* renamed from: com.pd.sdk.il */
public class C1690il extends AbstractC5738Lil implements AbstractC5462Ilil {
    public C5187I1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9826LllL f17970OooO00o;

    public C1690il(C5187I1l r2) {
        if (r2 != null) {
            this.OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("'encryptedCert' cannot be null");
    }

    public C1690il(AbstractC5903LlLLL r4) {
        if (r4.OooO00o() == 0) {
            this.f17970OooO00o = C9826LllL.OooO00o(r4.OooO0o());
        } else if (r4.OooO00o() == 1) {
            this.OooO00o = C5187I1l.OooO00o(r4.OooO0o());
        } else {
            throw new IllegalArgumentException("unknown tag: " + r4.OooO00o());
        }
    }

    public C1690il(C9826LllL r2) {
        if (r2 != null) {
            this.f17970OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("'certificate' cannot be null");
    }

    public static C1690il OooO00o(Object obj) {
        if (obj instanceof C1690il) {
            return (C1690il) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C1690il((AbstractC5903LlLLL) obj);
        }
        return null;
    }

    public C5187I1l OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9826LllL m17316OooO00o() {
        return this.f17970OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.f17970OooO00o != null ? new ILI1Ll(true, 0, this.f17970OooO00o) : new ILI1Ll(true, 1, this.OooO00o);
    }
}
