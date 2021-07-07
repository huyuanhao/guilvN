package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iILI丨i丨  reason: invalid class name and case insensitive filesystem */
public class C6093iILIi extends AbstractC5738Lil {
    public final C9879iI[] OooO00o;

    public C6093iILIi(I11li1 i11li1) {
        this.OooO00o = new C9879iI[i11li1.size()];
        for (int i = 0; i != i11li1.size(); i++) {
            this.OooO00o[i] = C9879iI.OooO00o(i11li1.OooO00o(i));
        }
    }

    public C6093iILIi(C9879iI r3) {
        this.OooO00o = new C9879iI[]{r3};
    }

    public C6093iILIi(C9879iI[] r1) {
        this.OooO00o = r1;
    }

    public static C6093iILIi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6093iILIi OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00o000O));
    }

    public static C6093iILIi OooO00o(Object obj) {
        if (obj instanceof C6093iILIi) {
            return (C6093iILIi) obj;
        }
        if (obj != null) {
            return new C6093iILIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9879iI OooO00o(LlLI1 llLI1) {
        int i = 0;
        while (true) {
            C9879iI[] r1 = this.OooO00o;
            if (i == r1.length) {
                return null;
            }
            if (llLI1.equals(r1[i].m21960OooO00o())) {
                return this.OooO00o[i];
            }
            i++;
        }
    }

    public C9879iI[] OooO00o() {
        C9879iI[] r0 = this.OooO00o;
        C9879iI[] r1 = new C9879iI[r0.length];
        System.arraycopy(r0, 0, r1, 0, r0.length);
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.OooO00o.length; i++) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.OooO00o[i]);
        }
        return "CertificatePolicies: [" + ((Object) stringBuffer) + "]";
    }
}
