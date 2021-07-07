package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1IL1I  reason: invalid class name */
public class C1IL1I extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5845LIillll f22754OooO00o;

    public C1IL1I(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        for (int i = 0; i != i11li1.size(); i++) {
            AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(i));
            int OooO00o3 = OooO00o2.OooO00o();
            if (OooO00o3 == 0) {
                this.f22754OooO00o = C5845LIillll.OooO00o(OooO00o2, false);
            } else if (OooO00o3 == 1) {
                this.OooO00o = ILI.OooO00o(OooO00o2, true);
            } else {
                throw new IllegalArgumentException("Unknown tag in RoleSyntax");
            }
        }
    }

    public C1IL1I(ILI ili) {
        this(null, ili);
    }

    public C1IL1I(C5845LIillll r3, ILI ili) {
        if (ili == null || ili.OooO00o() != 6 || ((AbstractC98681) ili.m15483OooO0O0()).OooO00o().equals("")) {
            throw new IllegalArgumentException("the role name MUST be non empty and MUST use the URI option of GeneralName");
        }
        this.f22754OooO00o = r3;
        this.OooO00o = ili;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1IL1I(String str) {
        this(new ILI(6, str == null ? "" : str));
    }

    public static C1IL1I OooO00o(Object obj) {
        if (obj instanceof C1IL1I) {
            return (C1IL1I) obj;
        }
        if (obj != null) {
            return new C1IL1I(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5845LIillll m21267OooO00o() {
        return this.f22754OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String[] m21268OooO00o() {
        C5845LIillll r0 = this.f22754OooO00o;
        if (r0 == null) {
            return new String[0];
        }
        ILI[] OooO00o2 = r0.OooO00o();
        String[] strArr = new String[OooO00o2.length];
        for (int i = 0; i < OooO00o2.length; i++) {
            AbstractC6854lLi1LL OooO0O0 = OooO00o2[i].m15483OooO0O0();
            if (OooO0O0 instanceof AbstractC98681) {
                strArr[i] = ((AbstractC98681) OooO0O0).OooO00o();
            } else {
                strArr[i] = OooO0O0.toString();
            }
        }
        return strArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f22754OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f22754OooO00o));
        }
        r0.OooO00o(new ILI1Ll(true, 1, this.OooO00o));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m21269OooO0O0() {
        return ((AbstractC98681) this.OooO00o.m15483OooO0O0()).OooO00o();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Name: " + m21269OooO0O0() + " - Auth: ");
        C5845LIillll r1 = this.f22754OooO00o;
        if (r1 == null || r1.OooO00o().length == 0) {
            stringBuffer.append("N/A");
        } else {
            String[] OooO00o2 = m21268OooO00o();
            stringBuffer.append('[');
            stringBuffer.append(OooO00o2[0]);
            for (int i = 1; i < OooO00o2.length; i++) {
                stringBuffer.append(", ");
                stringBuffer.append(OooO00o2[i]);
            }
            stringBuffer.append(']');
        }
        return stringBuffer.toString();
    }
}
