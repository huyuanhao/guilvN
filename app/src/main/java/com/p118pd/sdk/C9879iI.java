package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨丨丨丨iI  reason: invalid class name and case insensitive filesystem */
public class C9879iI extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public LlLI1 o00OoOOo;

    public C9879iI(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C9879iI(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    public C9879iI(LlLI1 llLI1, I11li1 i11li1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = i11li1;
    }

    public static C9879iI OooO00o(Object obj) {
        return (obj == null || (obj instanceof C9879iI)) ? (C9879iI) obj : new C9879iI(I11li1.OooO00o(obj));
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m21960OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Policy information: ");
        stringBuffer.append(this.o00OoOOo);
        if (this.OooO00o != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < this.OooO00o.size(); i++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                stringBuffer2.append(C5472Illii.OooO00o(this.OooO00o.OooO00o(i)));
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
