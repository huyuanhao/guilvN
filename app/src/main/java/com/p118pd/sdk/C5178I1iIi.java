package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1iIi  reason: case insensitive filesystem */
public class C5178I1iIi extends AbstractC5738Lil implements AbstractC5462Ilil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6052i1l f15366OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15367OooO00o;

    public C5178I1iIi(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C5178I1iIi(C6052i1l r1) {
        this.f15366OooO00o = r1;
    }

    public C5178I1iIi(AbstractC6804llL1ii r1) {
        this.f15367OooO00o = r1;
    }

    public C5178I1iIi(C1706l r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public C5178I1iIi(byte[] bArr) {
        this.f15367OooO00o = new C6487lIIiIlL(bArr);
    }

    public C5178I1iIi(C1706l[] r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C5178I1iIi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C5178I1iIi OooO00o(Object obj) {
        if (obj instanceof C5178I1iIi) {
            return (C5178I1iIi) obj;
        }
        if (obj instanceof AbstractC6804llL1ii) {
            return new C5178I1iIi((AbstractC6804llL1ii) obj);
        }
        if (obj instanceof I11li1) {
            return new C5178I1iIi(C6052i1l.OooO00o(obj));
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C5178I1iIi(I11li1.OooO00o((AbstractC5903LlLLL) obj, false));
        }
        throw new IllegalArgumentException("Unknown object submitted to getInstance: " + obj.getClass().getName());
    }

    public C6052i1l OooO00o() {
        return this.f15366OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15289OooO00o() {
        return this.f15367OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1706l[] m15290OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C1706l[] r1 = new C1706l[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C1706l.OooO00o((Object) this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        AbstractC6804llL1ii r0 = this.f15367OooO00o;
        if (r0 != null) {
            return r0.m17017OooO0O0();
        }
        C6052i1l r02 = this.f15366OooO00o;
        return r02 != null ? r02.OooO0O0() : new ILI1Ll(false, 0, this.OooO00o);
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        if (this.f15367OooO00o != null) {
            sb = new StringBuilder();
            sb.append("Data {\n");
            obj = this.f15367OooO00o;
        } else if (this.f15366OooO00o != null) {
            sb = new StringBuilder();
            sb.append("Data {\n");
            obj = this.f15366OooO00o;
        } else {
            sb = new StringBuilder();
            sb.append("Data {\n");
            obj = this.OooO00o;
        }
        sb.append(obj);
        sb.append("}\n");
        return sb.toString();
    }
}
