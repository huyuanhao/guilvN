package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii丨丨Li  reason: invalid class name and case insensitive filesystem */
public class C5414IiLi extends AbstractC5738Lil {
    public C5187I1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1690il f15775OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6360i1i f15776OooO00o;

    public C5414IiLi(I11li1 i11li1) {
        AbstractC6122iIlLiL iillil;
        this.f15775OooO00o = C1690il.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() >= 2) {
            if (i11li1.size() == 2) {
                AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1));
                int OooO00o3 = OooO00o2.OooO00o();
                iillil = OooO00o2.OooO0o();
                if (OooO00o3 == 0) {
                    this.OooO00o = C5187I1l.OooO00o(iillil);
                    return;
                }
            } else {
                this.OooO00o = C5187I1l.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1)));
                iillil = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(2));
            }
            this.f15776OooO00o = C6360i1i.OooO00o(iillil);
        }
    }

    public C5414IiLi(C1690il ilVar) {
        this(ilVar, null, null);
    }

    public C5414IiLi(C1690il ilVar, C5187I1l r2, C6360i1i r3) {
        if (ilVar != null) {
            this.f15775OooO00o = ilVar;
            this.OooO00o = r2;
            this.f15776OooO00o = r3;
            return;
        }
        throw new IllegalArgumentException("'certOrEncCert' cannot be null");
    }

    public static C5414IiLi OooO00o(Object obj) {
        if (obj instanceof C5414IiLi) {
            return (C5414IiLi) obj;
        }
        if (obj != null) {
            return new C5414IiLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5187I1l OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1690il m15638OooO00o() {
        return this.f15775OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6360i1i m15639OooO00o() {
        return this.f15776OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15775OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (this.f15776OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f15776OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
