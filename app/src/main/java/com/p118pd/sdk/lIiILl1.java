package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.lIiILl丨1  reason: invalid class name */
public class lIiILl1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public II1LL f18388OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9826LllL f18389OooO00o;
    public I11li1 OooO0O0;

    public lIiILl1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f18388OooO00o = II1LL.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
            int OooO00o4 = OooO00o3.OooO00o();
            if (OooO00o4 == 0) {
                this.f18389OooO00o = C9826LllL.OooO00o(OooO00o3.OooO0o());
            } else if (OooO00o4 == 1) {
                this.OooO00o = I11li1.OooO00o((Object) OooO00o3.OooO0o());
            } else if (OooO00o4 == 2) {
                this.OooO0O0 = I11li1.OooO00o((Object) OooO00o3.OooO0o());
            } else {
                throw new IllegalArgumentException("unknown tag number: " + OooO00o3.OooO00o());
            }
        }
    }

    public static lIiILl1 OooO00o(Object obj) {
        if (obj instanceof lIiILl1) {
            return (lIiILl1) obj;
        }
        if (obj != null) {
            return new lIiILl1(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r3, int i, AbstractC6854lLi1LL r5) {
        if (r5 != null) {
            r3.OooO00o(new ILI1Ll(true, i, r5));
        }
    }

    public II1LL OooO00o() {
        return this.f18388OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9826LllL m17634OooO00o() {
        return this.f18389OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5414IiLi[] m17635OooO00o() {
        I11li1 i11li1 = this.OooO0O0;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C5414IiLi[] r1 = new C5414IiLi[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C5414IiLi.OooO00o(this.OooO0O0.OooO00o(i));
        }
        return r1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9826LllL[] m17636OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C9826LllL[] r1 = new C9826LllL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C9826LllL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18388OooO00o);
        OooO00o(r0, 0, this.f18389OooO00o);
        OooO00o(r0, 1, this.OooO00o);
        OooO00o(r0, 2, this.OooO0O0);
        return new C5707LiL1(r0);
    }
}
