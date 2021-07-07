package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.iL丨LILi丨  reason: invalid class name and case insensitive filesystem */
public class C6207iLLILi extends AbstractC5738Lil {
    public static final int o0OO00O = 4;
    public static final int o0OOO0o = 2;
    public static final int o0Oo0oo = 3;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 0;
    public static final int o0ooOoO = 1;
    public IiIllLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5509IIiI f17816OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5845LIillll f17817OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f17818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9879iI f17819OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f17820OooO00o;
    public C5845LIillll OooO0O0;
    public C5845LIillll OooO0OO;
    public int o00oO0O = 1;

    public C6207iLLILi(I11li1 i11li1) {
        int i;
        if (i11li1.OooO00o(0) instanceof C6513lIiI) {
            this.o00oO0O = C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0().intValue();
            i = 1;
        } else {
            this.o00oO0O = 1;
            i = 0;
        }
        this.OooO00o = IiIllLI.OooO00o(i11li1.OooO00o(i));
        for (int i2 = i + 1; i2 < i11li1.size(); i2++) {
            AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(i2);
            if (OooO00o2 instanceof C6513lIiI) {
                this.f17820OooO00o = C6513lIiI.OooO00o(OooO00o2).m17647OooO0O0();
            } else if (!(OooO00o2 instanceof C9623il) && (OooO00o2 instanceof AbstractC5903LlLLL)) {
                AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2);
                int OooO00o4 = OooO00o3.OooO00o();
                if (OooO00o4 == 0) {
                    this.f17817OooO00o = C5845LIillll.OooO00o(OooO00o3, false);
                } else if (OooO00o4 == 1) {
                    this.f17819OooO00o = C9879iI.OooO00o(I11li1.OooO00o(OooO00o3, false));
                } else if (OooO00o4 == 2) {
                    this.OooO0O0 = C5845LIillll.OooO00o(OooO00o3, false);
                } else if (OooO00o4 == 3) {
                    this.OooO0OO = C5845LIillll.OooO00o(OooO00o3, false);
                } else if (OooO00o4 == 4) {
                    this.f17818OooO00o = iI11IL.OooO00o(OooO00o3, false);
                } else {
                    throw new IllegalArgumentException("unknown tag number encountered: " + OooO00o4);
                }
            } else {
                this.f17816OooO00o = C5509IIiI.OooO00o(OooO00o2);
            }
        }
    }

    public static C6207iLLILi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6207iLLILi OooO00o(Object obj) {
        if (obj instanceof C6207iLLILi) {
            return (C6207iLLILi) obj;
        }
        if (obj != null) {
            return new C6207iLLILi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public IiIllLI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5509IIiI m17186OooO00o() {
        return this.f17816OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5845LIillll m17187OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17188OooO00o() {
        return this.f17818OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI m17189OooO00o() {
        return this.f17819OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17190OooO00o() {
        return this.f17820OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5845LIillll m17191OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17192OooO0O0() {
        iILLL1 r0 = new iILLL1();
        int i = this.o00oO0O;
        if (i != 1) {
            r0.OooO00o(new C6513lIiI((long) i));
        }
        r0.OooO00o(this.OooO00o);
        BigInteger bigInteger = this.f17820OooO00o;
        if (bigInteger != null) {
            r0.OooO00o(new C6513lIiI(bigInteger));
        }
        C5509IIiI r1 = this.f17816OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        AbstractC6854lLi1LL[] r4 = {this.f17817OooO00o, this.f17819OooO00o, this.OooO0O0, this.OooO0OO, this.f17818OooO00o};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            AbstractC6854lLi1LL r7 = r4[i2];
            if (r7 != null) {
                r0.OooO00o(new ILI1Ll(false, i3, r7));
            }
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C5845LIillll OooO0OO() {
        return this.f17817OooO00o;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DVCSRequestInformation {\n");
        if (this.o00oO0O != 1) {
            stringBuffer.append("version: " + this.o00oO0O + "\n");
        }
        stringBuffer.append("service: " + this.OooO00o + "\n");
        if (this.f17820OooO00o != null) {
            stringBuffer.append("nonce: " + this.f17820OooO00o + "\n");
        }
        if (this.f17816OooO00o != null) {
            stringBuffer.append("requestTime: " + this.f17816OooO00o + "\n");
        }
        if (this.f17817OooO00o != null) {
            stringBuffer.append("requester: " + this.f17817OooO00o + "\n");
        }
        if (this.f17819OooO00o != null) {
            stringBuffer.append("requestPolicy: " + this.f17819OooO00o + "\n");
        }
        if (this.OooO0O0 != null) {
            stringBuffer.append("dvcs: " + this.OooO0O0 + "\n");
        }
        if (this.OooO0OO != null) {
            stringBuffer.append("dataLocations: " + this.OooO0OO + "\n");
        }
        if (this.f17818OooO00o != null) {
            stringBuffer.append("extensions: " + this.f17818OooO00o + "\n");
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }
}
