package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIL  reason: case insensitive filesystem */
public class C6091iIL extends AbstractC5738Lil {
    public C5178I1iIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f17505OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6207iLLILi f17506OooO00o;

    public C6091iIL(I11li1 i11li1) {
        this.f17506OooO00o = C6207iLLILi.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = C5178I1iIi.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() > 2) {
            this.f17505OooO00o = ILI.OooO00o(i11li1.OooO00o(2));
        }
    }

    public C6091iIL(C6207iLLILi r2, C5178I1iIi i1iIi) {
        this(r2, i1iIi, null);
    }

    public C6091iIL(C6207iLLILi r1, C5178I1iIi i1iIi, ILI ili) {
        this.f17506OooO00o = r1;
        this.OooO00o = i1iIi;
        this.f17505OooO00o = ili;
    }

    public static C6091iIL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6091iIL OooO00o(Object obj) {
        if (obj instanceof C6091iIL) {
            return (C6091iIL) obj;
        }
        if (obj != null) {
            return new C6091iIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5178I1iIi OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILI m16953OooO00o() {
        return this.f17505OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6207iLLILi m16954OooO00o() {
        return this.f17506OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17506OooO00o);
        r0.OooO00o(this.OooO00o);
        ILI ili = this.f17505OooO00o;
        if (ili != null) {
            r0.OooO00o(ili);
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DVCSRequest {\nrequestInformation: ");
        sb.append(this.f17506OooO00o);
        sb.append("\ndata: ");
        sb.append(this.OooO00o);
        sb.append("\n");
        if (this.f17505OooO00o != null) {
            str = "transactionIdentifier: " + this.f17505OooO00o + "\n";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("}\n");
        return sb.toString();
    }
}
