package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.l1LIL丨I1  reason: invalid class name */
public class l1LILI1 extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static AbstractC5662LLi OooO0O0 = C9388IiLL.OooO00o;
    public AbstractC5662LLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LILlIL[] f18270OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18271OooO0O0;
    public int o00oO0O;

    public l1LILI1(I11li1 i11li1) {
        this(OooO0O0, i11li1);
    }

    public l1LILI1(AbstractC5662LLi lLi, I11li1 i11li1) {
        this.OooO00o = lLi;
        this.f18270OooO00o = new LILlIL[i11li1.size()];
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            this.f18270OooO00o[i] = LILlIL.OooO00o(OooO00o2.nextElement());
            i++;
        }
    }

    public l1LILI1(AbstractC5662LLi lLi, l1LILI1 r2) {
        this.f18270OooO00o = r2.f18270OooO00o;
        this.OooO00o = lLi;
    }

    public l1LILI1(AbstractC5662LLi lLi, String str) {
        this(lLi.m16232OooO00o(str));
        this.OooO00o = lLi;
    }

    public l1LILI1(AbstractC5662LLi lLi, LILlIL[] lILlILArr) {
        this.f18270OooO00o = lILlILArr;
        this.OooO00o = lLi;
    }

    public l1LILI1(String str) {
        this(OooO0O0, str);
    }

    public l1LILI1(LILlIL[] lILlILArr) {
        this(OooO0O0, lILlILArr);
    }

    public static AbstractC5662LLi OooO00o() {
        return OooO0O0;
    }

    public static l1LILI1 OooO00o(AbstractC5662LLi lLi, Object obj) {
        if (obj instanceof l1LILI1) {
            return new l1LILI1(lLi, (l1LILI1) obj);
        }
        if (obj != null) {
            return new l1LILI1(lLi, I11li1.OooO00o(obj));
        }
        return null;
    }

    public static l1LILI1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, true));
    }

    public static l1LILI1 OooO00o(Object obj) {
        if (obj instanceof l1LILI1) {
            return (l1LILI1) obj;
        }
        if (obj != null) {
            return new l1LILI1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static void OooO00o(AbstractC5662LLi lLi) {
        if (lLi != null) {
            OooO0O0 = lLi;
            return;
        }
        throw new NullPointerException("cannot set style to null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LILlIL[] m17571OooO00o() {
        LILlIL[] lILlILArr = this.f18270OooO00o;
        int length = lILlILArr.length;
        LILlIL[] lILlILArr2 = new LILlIL[length];
        System.arraycopy(lILlILArr, 0, lILlILArr2, 0, length);
        return lILlILArr2;
    }

    public LILlIL[] OooO00o(LlLI1 llLI1) {
        int i;
        LILlIL[] lILlILArr = new LILlIL[this.f18270OooO00o.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            LILlIL[] lILlILArr2 = this.f18270OooO00o;
            if (i2 != lILlILArr2.length) {
                LILlIL lILlIL = lILlILArr2[i2];
                if (lILlIL.m16060OooO00o()) {
                    C5605L1ll[] OooO00o2 = lILlIL.m16061OooO00o();
                    int i4 = 0;
                    while (true) {
                        if (i4 == OooO00o2.length) {
                            break;
                        } else if (OooO00o2[i4].OooO00o().equals(llLI1)) {
                            i = i3 + 1;
                            lILlILArr[i3] = lILlIL;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    i2++;
                } else if (lILlIL.OooO00o().OooO00o().equals(llLI1)) {
                    i = i3 + 1;
                    lILlILArr[i3] = lILlIL;
                } else {
                    i2++;
                }
                i3 = i;
                i2++;
            } else {
                LILlIL[] lILlILArr3 = new LILlIL[i3];
                System.arraycopy(lILlILArr, 0, lILlILArr3, 0, i3);
                return lILlILArr3;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1[] m17572OooO00o() {
        int i = 0;
        int i2 = 0;
        while (true) {
            LILlIL[] lILlILArr = this.f18270OooO00o;
            if (i == lILlILArr.length) {
                break;
            }
            i2 += lILlILArr[i].size();
            i++;
        }
        LlLI1[] llLI1Arr = new LlLI1[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            LILlIL[] lILlILArr2 = this.f18270OooO00o;
            if (i3 == lILlILArr2.length) {
                return llLI1Arr;
            }
            LILlIL lILlIL = lILlILArr2[i3];
            if (lILlIL.m16060OooO00o()) {
                C5605L1ll[] OooO00o2 = lILlIL.m16061OooO00o();
                int i5 = 0;
                while (i5 != OooO00o2.length) {
                    llLI1Arr[i4] = OooO00o2[i5].OooO00o();
                    i5++;
                    i4++;
                }
            } else if (lILlIL.size() != 0) {
                llLI1Arr[i4] = lILlIL.OooO00o().OooO00o();
                i4++;
            }
            i3++;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.f18270OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1LILI1) && !(obj instanceof I11li1)) {
            return false;
        }
        if (OooO0O0().equals(((AbstractC6854lLi1LL) obj).OooO0O0())) {
            return true;
        }
        try {
            return this.OooO00o.OooO00o(this, new l1LILI1(I11li1.OooO00o((Object) ((AbstractC6854lLi1LL) obj).OooO0O0())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int hashCode() {
        if (this.f18271OooO0O0) {
            return this.o00oO0O;
        }
        this.f18271OooO0O0 = true;
        int OooO00o2 = this.OooO00o.OooO00o(this);
        this.o00oO0O = OooO00o2;
        return OooO00o2;
    }

    public String toString() {
        return this.OooO00o.m16231OooO00o(this);
    }
}
