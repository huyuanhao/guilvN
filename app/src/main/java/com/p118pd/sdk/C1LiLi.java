package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨1LiLi  reason: invalid class name */
public class C1LiLi extends AbstractC5738Lil {
    public static final LlLI1 o00OoOOo = new LlLI1(II1lI.o00OoOo0 + ".1");
    public static final LlLI1 o00OoOo = new LlLI1(II1lI.o00OoOo0 + ".3");
    public static final LlLI1 o00OoOo0 = new LlLI1(II1lI.o00OoOo0 + ".2");
    public static final LlLI1 o00OoOoo = new LlLI1(II1lI.o00OoOo0 + ".4");
    public static final LlLI1 o00Ooo0 = new LlLI1(II1lI.o00OoOo0 + ".6");
    public static final LlLI1 o00Ooo00 = new LlLI1(II1lI.o00OoOo0 + ".5");
    public static final LlLI1 o00Ooo0O = new LlLI1(II1lI.o00OoOo0 + ".7");
    public static final LlLI1 o00Ooo0o = new LlLI1(II1lI.o00OoOo0 + ".8");
    public static final LlLI1 o00OooO = new LlLI1(II1lI.o00OoOo0 + ".10");
    public static final LlLI1 o00OooO0 = new LlLI1(II1lI.o00OoOo0 + ".9");
    public static final LlLI1 o00OooOO = new LlLI1(II1lI.o00OoOo0 + ".11");
    public static final LlLI1 o00OooOo = new LlLI1(II1lI.o00OoOo0 + ".12");
    public static final LlLI1 o00OoooO = new LlLI1(II1lI.o00OoOo0 + ".14");
    public static final LlLI1 o00Ooooo = new LlLI1(II1lI.o00OoOo0 + ".15");
    public static final LlLI1 o00o000 = new LlLI1(II1lI.o00OoOo0 + ".17");
    public static final LlLI1 o00o0000 = new LlLI1(II1lI.o00OoOo0 + ".16");
    public static final LlLI1 o00o000O = new LlLI1(II1lI.o00OoOo0 + ".18");
    public static final LlLI1 o00o000o = new LlLI1(II1lI.o00OoOo0 + ".19");
    public static final LlLI1 o0O00o0 = new LlLI1(II1lI.o00OoOo0 + ".13");
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public II1lI f22783OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f22784OooO00o;
    public I11li1 OooO0O0;
    public String o0ooOOo;

    public C1LiLi(I11li1 i11li1) {
        if (i11li1.size() <= 5) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if (r0 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r02 = (AbstractC5903LlLLL) r0;
                if (r02.OooO00o() == 0) {
                    this.f22783OooO00o = II1lI.OooO00o(r02, true);
                    r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + r02.OooO00o());
                }
            }
            this.OooO00o = I11li1.OooO00o(r0);
            if (OooO00o2.hasMoreElements()) {
                AbstractC6854lLi1LL r03 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                if (r03 instanceof I11li1) {
                    this.OooO0O0 = I11li1.OooO00o(r03);
                } else if (r03 instanceof LI11) {
                    this.o0ooOOo = LI11.OooO00o(r03).OooO00o();
                } else if (r03 instanceof AbstractC6804llL1ii) {
                    this.f22784OooO00o = AbstractC6804llL1ii.OooO00o(r03);
                } else {
                    throw new IllegalArgumentException("Bad object encountered: " + r03.getClass());
                }
            }
            if (OooO00o2.hasMoreElements()) {
                AbstractC6854lLi1LL r04 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                if (r04 instanceof LI11) {
                    this.o0ooOOo = LI11.OooO00o(r04).OooO00o();
                } else if (r04 instanceof C6487lIIiIlL) {
                    this.f22784OooO00o = (C6487lIIiIlL) r04;
                } else {
                    throw new IllegalArgumentException("Bad object encountered: " + r04.getClass());
                }
            }
            if (OooO00o2.hasMoreElements()) {
                AbstractC6854lLi1LL r4 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
                if (r4 instanceof C6487lIIiIlL) {
                    this.f22784OooO00o = (C6487lIIiIlL) r4;
                    return;
                }
                throw new IllegalArgumentException("Bad object encountered: " + r4.getClass());
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C1LiLi(II1lI iI1lI, C6310ilIL[] r5, LlLI1[] llLI1Arr, String str, AbstractC6804llL1ii r8) {
        this.f22783OooO00o = iI1lI;
        iILLL1 r4 = new iILLL1();
        for (int i = 0; i != r5.length; i++) {
            r4.OooO00o(r5[i]);
        }
        this.OooO00o = new C5707LiL1(r4);
        if (llLI1Arr != null) {
            iILLL1 r42 = new iILLL1();
            for (int i2 = 0; i2 != llLI1Arr.length; i2++) {
                r42.OooO00o(llLI1Arr[i2]);
            }
            this.OooO0O0 = new C5707LiL1(r42);
        }
        this.o0ooOOo = str;
        this.f22784OooO00o = r8;
    }

    public static C1LiLi OooO00o(Object obj) {
        if (obj == null || (obj instanceof C1LiLi)) {
            return (C1LiLi) obj;
        }
        if (obj instanceof I11li1) {
            return new C1LiLi((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public II1lI OooO00o() {
        return this.f22783OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21301OooO00o() {
        return this.f22784OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1[] m21302OooO00o() {
        I11li1 i11li1 = this.OooO0O0;
        int i = 0;
        if (i11li1 == null) {
            return new LlLI1[0];
        }
        LlLI1[] llLI1Arr = new LlLI1[i11li1.size()];
        Enumeration OooO00o2 = this.OooO0O0.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            llLI1Arr[i] = LlLI1.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return llLI1Arr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL[] m21303OooO00o() {
        C6310ilIL[] r0 = new C6310ilIL[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = C6310ilIL.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f22783OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f22783OooO00o));
        }
        r0.OooO00o(this.OooO00o);
        I11li1 i11li1 = this.OooO0O0;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        String str = this.o0ooOOo;
        if (str != null) {
            r0.OooO00o(new LI11(str, true));
        }
        AbstractC6804llL1ii r1 = this.f22784OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m21304OooO0O0() {
        return this.o0ooOOo;
    }
}
