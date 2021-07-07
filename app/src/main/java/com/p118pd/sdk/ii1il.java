package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ii丨丨1il丨  reason: invalid class name */
public class ii1il extends AbstractC5738Lil {
    public ILI[] OooO00o;
    public LlLI1 o00OoOOo;

    public ii1il(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        if (i11li1.size() >= 1) {
            Object nextElement = OooO00o2.nextElement();
            if (nextElement instanceof LlLI1) {
                this.o00OoOOo = LlLI1.OooO00o(nextElement);
                nextElement = OooO00o2.hasMoreElements() ? OooO00o2.nextElement() : null;
            }
            if (nextElement != null) {
                I11li1 OooO00o3 = I11li1.OooO00o(nextElement);
                this.OooO00o = new ILI[OooO00o3.size()];
                for (int i = 0; i < OooO00o3.size(); i++) {
                    this.OooO00o[i] = ILI.OooO00o(OooO00o3.OooO00o(i));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("no objects in SemanticsInformation");
    }

    public ii1il(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = null;
    }

    public ii1il(LlLI1 llLI1, ILI[] iliArr) {
        this.o00OoOOo = llLI1;
        this.OooO00o = OooO00o(iliArr);
    }

    public ii1il(ILI[] iliArr) {
        this.o00OoOOo = null;
        this.OooO00o = OooO00o(iliArr);
    }

    public static ii1il OooO00o(Object obj) {
        if (obj instanceof ii1il) {
            return (ii1il) obj;
        }
        if (obj != null) {
            return new ii1il(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static ILI[] OooO00o(ILI[] iliArr) {
        if (iliArr == null) {
            return null;
        }
        ILI[] iliArr2 = new ILI[iliArr.length];
        System.arraycopy(iliArr, 0, iliArr2, 0, iliArr.length);
        return iliArr2;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILI[] m17313OooO00o() {
        return OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            r0.OooO00o(llLI1);
        }
        if (this.OooO00o != null) {
            iILLL1 r1 = new iILLL1();
            int i = 0;
            while (true) {
                ILI[] iliArr = this.OooO00o;
                if (i >= iliArr.length) {
                    break;
                }
                r1.OooO00o(iliArr[i]);
                i++;
            }
            r0.OooO00o(new C5707LiL1(r1));
        }
        return new C5707LiL1(r0);
    }
}
