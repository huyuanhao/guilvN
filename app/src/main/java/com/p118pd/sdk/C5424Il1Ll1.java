package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Il1丨Ll丨1  reason: invalid class name and case insensitive filesystem */
public class C5424Il1Ll1 extends AbstractC5738Lil {
    public II1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f15810OooO00o;

    public C5424Il1Ll1(I11li1 i11li1) {
        this.OooO00o = II1LL.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.f15810OooO00o = ILI.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C5424Il1Ll1(II1LL r2) {
        this(r2, null);
    }

    public C5424Il1Ll1(II1LL r1, ILI ili) {
        this.OooO00o = r1;
        this.f15810OooO00o = ili;
    }

    public static C5424Il1Ll1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5424Il1Ll1 OooO00o(Object obj) {
        if (obj instanceof C5424Il1Ll1) {
            return (C5424Il1Ll1) obj;
        }
        if (obj != null) {
            return new C5424Il1Ll1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public II1LL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILI m15657OooO00o() {
        return this.f15810OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        ILI ili = this.f15810OooO00o;
        if (ili != null) {
            r0.OooO00o(ili);
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DVCSErrorNotice {\ntransactionStatus: ");
        sb.append(this.OooO00o);
        sb.append("\n");
        if (this.f15810OooO00o != null) {
            str = "transactionIdentifier: " + this.f15810OooO00o + "\n";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("}\n");
        return sb.toString();
    }
}
