package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨l */
public class C1706l extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6258iii f23258OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9856lLILiL f23259OooO00o;

    public C1706l(I11li1 i11li1) {
        this.f23258OooO00o = C6258iii.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(1);
            if (OooO00o2 instanceof AbstractC5903LlLLL) {
                OooO00o(OooO00o2);
                return;
            }
            this.OooO00o = I11li1.OooO00o(OooO00o2);
            if (i11li1.size() > 2) {
                OooO00o(i11li1.OooO00o(2));
            }
        }
    }

    public C1706l(C6258iii iii) {
        this(iii, null, null);
    }

    public C1706l(C6258iii iii, C9856lLILiL r3) {
        this(iii, null, r3);
    }

    public C1706l(C6258iii iii, C6258iii[] iiiArr) {
        this(iii, iiiArr, null);
    }

    public C1706l(C6258iii iii, C6258iii[] iiiArr, C9856lLILiL r3) {
        this.f23258OooO00o = iii;
        if (iiiArr != null) {
            this.OooO00o = new C5707LiL1(iiiArr);
        }
        this.f23259OooO00o = r3;
    }

    public static C1706l OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o((Object) I11li1.OooO00o(r0, z));
    }

    public static C1706l OooO00o(Object obj) {
        if (obj instanceof C1706l) {
            return (C1706l) obj;
        }
        if (obj != null) {
            return new C1706l(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(AbstractC6854lLi1LL r4) {
        AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(r4);
        if (OooO00o2.OooO00o() == 0) {
            this.f23259OooO00o = C9856lLILiL.OooO00o(OooO00o2, false);
            return;
        }
        throw new IllegalArgumentException("Unknown tag encountered: " + OooO00o2.OooO00o());
    }

    public static C1706l[] OooO00o(I11li1 i11li1) {
        int size = i11li1.size();
        C1706l[] r1 = new C1706l[size];
        for (int i = 0; i != size; i++) {
            r1[i] = OooO00o((Object) i11li1.OooO00o(i));
        }
        return r1;
    }

    public C6258iii OooO00o() {
        return this.f23258OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9856lLILiL m21715OooO00o() {
        return this.f23259OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6258iii[] m21716OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            return C6258iii.OooO00o(i11li1);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23258OooO00o);
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        if (this.f23259OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f23259OooO00o));
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TargetEtcChain {\n");
        stringBuffer.append("target: " + this.f23258OooO00o + "\n");
        if (this.OooO00o != null) {
            stringBuffer.append("chain: " + this.OooO00o + "\n");
        }
        if (this.f23259OooO00o != null) {
            stringBuffer.append("pathProcInput: " + this.f23259OooO00o + "\n");
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }
}
