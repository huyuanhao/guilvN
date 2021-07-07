package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.l丨ll  reason: invalid class name and case insensitive filesystem */
public class C6883lll {
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 0;
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 3;
    public static final int OooO0o0 = 2;
    public static final int OooO0oO = 4;
    public int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final IiIllLI f18969OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5509IIiI f18970OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5845LIillll f18971OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6207iLLILi f18972OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f18973OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9879iI f18974OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18975OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C5845LIillll f18976OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public C5845LIillll f18977OooO0OO;

    public C6883lll(IiIllLI iiIllLI) {
        this.f18969OooO00o = iiIllLI;
    }

    public C6883lll(C6207iLLILi r2) {
        this.f18972OooO00o = r2;
        this.f18969OooO00o = r2.OooO00o();
        this.OooO00o = r2.OooO0O0();
        this.f18975OooO00o = r2.m17190OooO00o();
        this.f18970OooO00o = r2.m17186OooO00o();
        this.f18974OooO00o = r2.m17189OooO00o();
        this.f18976OooO0O0 = r2.m17187OooO00o();
        this.f18977OooO0OO = r2.m17191OooO0O0();
    }

    public C6207iLLILi OooO00o() {
        iILLL1 r0 = new iILLL1();
        int i = this.OooO00o;
        if (i != 1) {
            r0.OooO00o(new C6513lIiI((long) i));
        }
        r0.OooO00o(this.f18969OooO00o);
        BigInteger bigInteger = this.f18975OooO00o;
        if (bigInteger != null) {
            r0.OooO00o(new C6513lIiI(bigInteger));
        }
        C5509IIiI r1 = this.f18970OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        AbstractC6854lLi1LL[] r4 = {this.f18971OooO00o, this.f18974OooO00o, this.f18976OooO0O0, this.f18977OooO0OO, this.f18973OooO00o};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            AbstractC6854lLi1LL r7 = r4[i2];
            if (r7 != null) {
                r0.OooO00o(new ILI1Ll(false, i3, r7));
            }
        }
        return C6207iLLILi.OooO00o(new C5707LiL1(r0));
    }

    public void OooO00o(int i) {
        if (this.f18972OooO00o == null) {
            this.OooO00o = i;
            return;
        }
        throw new IllegalStateException("cannot change version in existing DVCSRequestInformation");
    }

    public void OooO00o(ILI ili) {
        OooO00o(new C5845LIillll(ili));
    }

    public void OooO00o(C5509IIiI r2) {
        if (this.f18972OooO00o == null) {
            this.f18970OooO00o = r2;
            return;
        }
        throw new IllegalStateException("cannot change request time in existing DVCSRequestInformation");
    }

    public void OooO00o(C5845LIillll r1) {
        this.f18976OooO0O0 = r1;
    }

    public void OooO00o(iI11IL r2) {
        if (this.f18972OooO00o == null) {
            this.f18973OooO00o = r2;
            return;
        }
        throw new IllegalStateException("cannot change extensions in existing DVCSRequestInformation");
    }

    public void OooO00o(C9879iI r2) {
        if (this.f18972OooO00o == null) {
            this.f18974OooO00o = r2;
            return;
        }
        throw new IllegalStateException("cannot change request policy in existing DVCSRequestInformation");
    }

    public void OooO00o(BigInteger bigInteger) {
        C6207iLLILi r0 = this.f18972OooO00o;
        if (r0 != null) {
            if (r0.m17190OooO00o() == null) {
                this.f18975OooO00o = bigInteger;
            } else {
                byte[] byteArray = this.f18972OooO00o.m17190OooO00o().toByteArray();
                byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
                byte[] bArr = new byte[(byteArray.length + OooO00o2.length)];
                System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
                System.arraycopy(OooO00o2, 0, bArr, byteArray.length, OooO00o2.length);
                this.f18975OooO00o = new BigInteger(bArr);
            }
        }
        this.f18975OooO00o = bigInteger;
    }

    public void OooO0O0(ILI ili) {
        OooO0O0(new C5845LIillll(ili));
    }

    public void OooO0O0(C5845LIillll r1) {
        this.f18977OooO0OO = r1;
    }

    public void OooO0OO(ILI ili) {
        OooO0OO(new C5845LIillll(ili));
    }

    public void OooO0OO(C5845LIillll r1) {
        this.f18971OooO00o = r1;
    }
}
