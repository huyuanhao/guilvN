package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.I丨1  reason: invalid class name and case insensitive filesystem */
public class C5492I1 {
    public static final I11li1[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5432IlIlIlL f15932OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iILLL1 f15933OooO00o = new iILLL1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f15934OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f15935OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15936OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15937OooO00o = new C6513lIiI(1);
    public C5432IlIlIlL OooO0O0 = null;

    static {
        I11li1[] i11li1Arr = new I11li1[11];
        OooO00o = i11li1Arr;
        i11li1Arr[0] = OooO00o(0);
        OooO00o[1] = OooO00o(1);
        OooO00o[2] = OooO00o(2);
        OooO00o[3] = OooO00o(3);
        OooO00o[4] = OooO00o(4);
        OooO00o[5] = OooO00o(5);
        OooO00o[6] = OooO00o(6);
        OooO00o[7] = OooO00o(7);
        OooO00o[8] = OooO00o(8);
        OooO00o[9] = OooO00o(9);
        OooO00o[10] = OooO00o(10);
    }

    public static I11li1 OooO00o(int i) {
        iILLL1 r0 = new iILLL1();
        LLl111 OooO00o2 = LLl111.OooO00o(i);
        try {
            r0.OooO00o(C5237III.o00OooO);
            r0.OooO00o(new C6487lIIiIlL(OooO00o2.getEncoded()));
            return new C5707LiL1(r0);
        } catch (IOException e) {
            throw new IllegalArgumentException("error encoding reason: " + e);
        }
    }

    public static I11li1 OooO00o(C9623il r3) {
        iILLL1 r0 = new iILLL1();
        try {
            r0.OooO00o(C5237III.o00OooOo);
            r0.OooO00o(new C6487lIIiIlL(r3.getEncoded()));
            return new C5707LiL1(r0);
        } catch (IOException e) {
            throw new IllegalArgumentException("error encoding reason: " + e);
        }
    }

    private void OooO00o(C6513lIiI r2, C5432IlIlIlL r3, I11li1 i11li1) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(r2);
        r0.OooO00o(r3);
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        OooO00o(new C5707LiL1(r0));
    }

    public C6782lli11 OooO00o() {
        if (this.f15936OooO00o == null || this.f15935OooO00o == null || this.f15932OooO00o == null) {
            throw new IllegalStateException("Not all mandatory fields set in V2 TBSCertList generator.");
        }
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15937OooO00o);
        r0.OooO00o(this.f15936OooO00o);
        r0.OooO00o(this.f15935OooO00o);
        r0.OooO00o(this.f15932OooO00o);
        C5432IlIlIlL r1 = this.OooO0O0;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        if (this.f15933OooO00o.OooO00o() != 0) {
            r0.OooO00o(new C5707LiL1(this.f15933OooO00o));
        }
        if (this.f15934OooO00o != null) {
            r0.OooO00o(new ILI1Ll(0, this.f15934OooO00o));
        }
        return new C6782lli11(new C5707LiL1(r0));
    }

    public void OooO00o(I11li1 i11li1) {
        this.f15933OooO00o.OooO00o(i11li1);
    }

    public void OooO00o(C5432IlIlIlL r1) {
        this.OooO0O0 = r1;
    }

    public void OooO00o(LL1IL ll1il) {
        this.OooO0O0 = new C5432IlIlIlL(ll1il);
    }

    public void OooO00o(iI11IL r1) {
        this.f15934OooO00o = r1;
    }

    public void OooO00o(l1LILI1 r1) {
        this.f15935OooO00o = r1;
    }

    public void OooO00o(C6456l1ilL r1) {
        this.f15936OooO00o = r1;
    }

    public void OooO00o(C6513lIiI r2, C5432IlIlIlL r3, int i) {
        OooO00o(r2, r3, i, null);
    }

    public void OooO00o(C6513lIiI r4, C5432IlIlIlL r5, int i, C9623il r7) {
        I11li1 i11li1;
        if (i != 0) {
            iILLL1 r0 = new iILLL1();
            I11li1[] i11li1Arr = OooO00o;
            if (i >= i11li1Arr.length) {
                i11li1 = OooO00o(i);
            } else if (i >= 0) {
                i11li1 = i11li1Arr[i];
            } else {
                throw new IllegalArgumentException("invalid reason value: " + i);
            }
            r0.OooO00o(i11li1);
            if (r7 != null) {
                r0.OooO00o(OooO00o(r7));
            }
            OooO00o(r4, r5, new C5707LiL1(r0));
        } else if (r7 != null) {
            iILLL1 r6 = new iILLL1();
            r6.OooO00o(OooO00o(r7));
            OooO00o(r4, r5, new C5707LiL1(r6));
        } else {
            OooO00o(r4, r5, (iI11IL) null);
        }
    }

    public void OooO00o(C6513lIiI r2, C5432IlIlIlL r3, iI11IL r4) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(r2);
        r0.OooO00o(r3);
        if (r4 != null) {
            r0.OooO00o(r4);
        }
        OooO00o(new C5707LiL1(r0));
    }

    public void OooO00o(C6513lIiI r2, LL1IL ll1il, int i) {
        OooO00o(r2, new C5432IlIlIlL(ll1il), i);
    }

    public void OooO00o(C929811Li1 r1) {
        this.f15935OooO00o = l1LILI1.OooO00o(r1.OooO0O0());
    }

    public void OooO00o(C9431I r1) {
        OooO00o(iI11IL.OooO00o(r1));
    }

    public void OooO0O0(C5432IlIlIlL r1) {
        this.f15932OooO00o = r1;
    }

    public void OooO0O0(LL1IL ll1il) {
        this.f15932OooO00o = new C5432IlIlIlL(ll1il);
    }
}
