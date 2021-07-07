package com.p118pd.sdk;

import java.security.SecureRandom;
import java.util.Vector;

/* renamed from: com.pd.sdk.l丨il11  reason: invalid class name and case insensitive filesystem */
public class C6865lil11 extends lLiLLl1 {
    public boolean OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f18946OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1IilLL[] f18947OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18948OooO0O0;

    public C6865lil11(int i, SecureRandom secureRandom) {
        super(secureRandom);
        this.OooO00o = false;
        this.f18948OooO0O0 = false;
        this.f18946OooO00o = new int[3];
        if (i >= 3) {
            ((lLiLLl1) this).OooO00o = i;
            OooO00o();
            OooO0OO();
            ((lLiLLl1) this).f18574OooO00o = new Vector();
            ((lLiLLl1) this).OooO0O0 = new Vector();
            return;
        }
        throw new IllegalArgumentException("k must be at least 3");
    }

    public C6865lil11(int i, SecureRandom secureRandom, C1IilLL r6) throws RuntimeException {
        super(secureRandom);
        this.OooO00o = false;
        this.f18948OooO0O0 = false;
        this.f18946OooO00o = new int[3];
        if (i < 3) {
            throw new IllegalArgumentException("degree must be at least 3");
        } else if (r6.OooO00o() != i + 1) {
            throw new RuntimeException();
        } else if (r6.m21280OooO00o()) {
            ((lLiLLl1) this).OooO00o = i;
            ((lLiLLl1) this).f18572OooO00o = r6;
            OooO0OO();
            int i2 = 2;
            for (int i3 = 1; i3 < ((lLiLLl1) this).f18572OooO00o.OooO00o() - 1; i3++) {
                if (((lLiLLl1) this).f18572OooO00o.m21281OooO00o(i3)) {
                    i2++;
                    if (i2 == 3) {
                        this.OooO0O0 = i3;
                    }
                    if (i2 <= 5) {
                        this.f18946OooO00o[i2 - 3] = i3;
                    }
                }
            }
            if (i2 == 3) {
                this.OooO00o = true;
            }
            if (i2 == 5) {
                this.f18948OooO0O0 = true;
            }
            ((lLiLLl1) this).f18574OooO00o = new Vector();
            ((lLiLLl1) this).OooO0O0 = new Vector();
        } else {
            throw new RuntimeException();
        }
    }

    public C6865lil11(int i, SecureRandom secureRandom, boolean z) {
        super(secureRandom);
        this.OooO00o = false;
        this.f18948OooO0O0 = false;
        this.f18946OooO00o = new int[3];
        if (i >= 3) {
            ((lLiLLl1) this).OooO00o = i;
            if (z) {
                OooO00o();
            } else {
                m18023OooO0O0();
            }
            OooO0OO();
            ((lLiLLl1) this).f18574OooO00o = new Vector();
            ((lLiLLl1) this).OooO0O0 = new Vector();
            return;
        }
        throw new IllegalArgumentException("k must be at least 3");
    }

    private void OooO0OO() {
        int i = ((lLiLLl1) this).OooO00o;
        C1IilLL[] r1 = new C1IilLL[(i - 1)];
        this.f18947OooO00o = new C1IilLL[i];
        int i2 = 0;
        while (true) {
            C1IilLL[] r3 = this.f18947OooO00o;
            if (i2 >= r3.length) {
                break;
            }
            r3[i2] = new C1IilLL(((lLiLLl1) this).OooO00o, "ZERO");
            i2++;
        }
        for (int i3 = 0; i3 < ((lLiLLl1) this).OooO00o - 1; i3++) {
            r1[i3] = new C1IilLL(1, "ONE").m21273OooO00o(((lLiLLl1) this).OooO00o + i3).OooO0o(((lLiLLl1) this).f18572OooO00o);
        }
        for (int i4 = 1; i4 <= Math.abs(((lLiLLl1) this).OooO00o >> 1); i4++) {
            int i5 = 1;
            while (true) {
                int i6 = ((lLiLLl1) this).OooO00o;
                if (i5 > i6) {
                    break;
                }
                if (r1[i6 - (i4 << 1)].m21281OooO00o(i6 - i5)) {
                    this.f18947OooO00o[i5 - 1].m21291OooO0OO(((lLiLLl1) this).OooO00o - i4);
                }
                i5++;
            }
        }
        int abs = Math.abs(((lLiLLl1) this).OooO00o >> 1) + 1;
        while (true) {
            int i7 = ((lLiLLl1) this).OooO00o;
            if (abs <= i7) {
                this.f18947OooO00o[((abs << 1) - i7) - 1].m21291OooO0OO(i7 - abs);
                abs++;
            } else {
                return;
            }
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private boolean m18020OooO0OO() {
        C1IilLL r0 = new C1IilLL(((lLiLLl1) this).OooO00o + 1);
        ((lLiLLl1) this).f18572OooO00o = r0;
        r0.m21291OooO0OO(0);
        ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(((lLiLLl1) this).OooO00o);
        int i = 1;
        boolean z = false;
        while (i <= ((lLiLLl1) this).OooO00o - 3 && !z) {
            ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(i);
            int i2 = i + 1;
            int i3 = i2;
            while (i3 <= ((lLiLLl1) this).OooO00o - 2 && !z) {
                ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(i3);
                int i4 = i3 + 1;
                for (int i5 = i4; i5 <= ((lLiLLl1) this).OooO00o - 1 && !z; i5++) {
                    ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(i5);
                    if (((!(((((lLiLLl1) this).OooO00o & 1) != 0) | ((i & 1) != 0)) && !((i3 & 1) != 0)) && !((i5 & 1) != 0)) || !(z = ((lLiLLl1) this).f18572OooO00o.m21280OooO00o())) {
                        ((lLiLLl1) this).f18572OooO00o.m21287OooO0O0(i5);
                    } else {
                        this.f18948OooO0O0 = true;
                        int[] iArr = this.f18946OooO00o;
                        iArr[0] = i;
                        iArr[1] = i3;
                        iArr[2] = i5;
                        return z;
                    }
                }
                ((lLiLLl1) this).f18572OooO00o.m21287OooO0O0(i3);
                i3 = i4;
            }
            ((lLiLLl1) this).f18572OooO00o.m21287OooO0O0(i);
            i = i2;
        }
        return z;
    }

    private boolean OooO0Oo() {
        ((lLiLLl1) this).f18572OooO00o = new C1IilLL(((lLiLLl1) this).OooO00o + 1);
        do {
            ((lLiLLl1) this).f18572OooO00o.OooO0o();
            ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(((lLiLLl1) this).OooO00o);
            ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(0);
        } while (!((lLiLLl1) this).f18572OooO00o.m21280OooO00o());
        return true;
    }

    private boolean OooO0o0() {
        C1IilLL r0 = new C1IilLL(((lLiLLl1) this).OooO00o + 1);
        ((lLiLLl1) this).f18572OooO00o = r0;
        boolean z = false;
        r0.m21291OooO0OO(0);
        ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(((lLiLLl1) this).OooO00o);
        for (int i = 1; i < ((lLiLLl1) this).OooO00o && !z; i++) {
            ((lLiLLl1) this).f18572OooO00o.m21291OooO0OO(i);
            boolean OooO00o2 = ((lLiLLl1) this).f18572OooO00o.m21280OooO00o();
            if (OooO00o2) {
                this.OooO00o = true;
                this.OooO0O0 = i;
                return OooO00o2;
            }
            ((lLiLLl1) this).f18572OooO00o.m21287OooO0O0(i);
            z = ((lLiLLl1) this).f18572OooO00o.m21280OooO00o();
        }
        return z;
    }

    public C1IilLL OooO00o(int i) {
        return new C1IilLL(this.f18947OooO00o[i]);
    }

    @Override // com.p118pd.sdk.lLiLLl1
    public AbstractC9726llL OooO00o(C1IilLL r6) {
        Li11L1 OooO0O02;
        int OooO00o2;
        int OooO00o3;
        Li11L1 li11L1 = new Li11L1(r6, this);
        while (li11L1.OooO00o() > 1) {
            while (true) {
                i1IIiLL r62 = new i1IIiLL(this, ((lLiLLl1) this).f18573OooO00o);
                Li11L1 li11L12 = new Li11L1(2, i1IIiLL.OooO0O0(this));
                li11L12.OooO00o(1, r62);
                Li11L1 li11L13 = new Li11L1(li11L12);
                for (int i = 1; i <= ((lLiLLl1) this).OooO00o - 1; i++) {
                    li11L13 = li11L13.OooO00o(li11L13, li11L1).OooO00o(li11L12);
                }
                OooO0O02 = li11L13.OooO0O0(li11L1);
                OooO00o2 = OooO0O02.OooO00o();
                OooO00o3 = li11L1.OooO00o();
                if (!(OooO00o2 == 0 || OooO00o2 == OooO00o3)) {
                    break;
                }
            }
            li11L1 = (OooO00o2 << 1) > OooO00o3 ? li11L1.OooO0Oo(OooO0O02) : new Li11L1(OooO0O02);
        }
        return li11L1.m16274OooO00o(0);
    }

    @Override // com.p118pd.sdk.lLiLLl1, com.p118pd.sdk.lLiLLl1, com.p118pd.sdk.lLiLLl1
    public void OooO00o() {
        if (!OooO0o0() && !m18020OooO0OO()) {
            OooO0Oo();
        }
    }

    @Override // com.p118pd.sdk.lLiLLl1
    public void OooO00o(lLiLLl1 r8) {
        AbstractC9726llL OooO00o2;
        AbstractC9726llL[] r5;
        int i = ((lLiLLl1) this).OooO00o;
        if (i == r8.OooO00o) {
            boolean z = r8 instanceof LIilll;
            if (z) {
                r8.OooO00o(this);
                return;
            }
            C1IilLL[] r0 = new C1IilLL[i];
            for (int i2 = 0; i2 < ((lLiLLl1) this).OooO00o; i2++) {
                r0[i2] = new C1IilLL(((lLiLLl1) this).OooO00o);
            }
            do {
                OooO00o2 = r8.OooO00o(((lLiLLl1) this).f18572OooO00o);
            } while (OooO00o2.m21441OooO00o());
            if (OooO00o2 instanceof C5160I11L) {
                int i3 = ((lLiLLl1) this).OooO00o;
                r5 = new C5160I11L[i3];
                r5[i3 - 1] = C5160I11L.OooO00o((LIilll) r8);
            } else {
                int i4 = ((lLiLLl1) this).OooO00o;
                r5 = new i1IIiLL[i4];
                r5[i4 - 1] = i1IIiLL.OooO00o((C6865lil11) r8);
            }
            int i5 = ((lLiLLl1) this).OooO00o;
            r5[i5 - 2] = OooO00o2;
            for (int i6 = i5 - 3; i6 >= 0; i6--) {
                r5[i6] = (AbstractC9726llL) r5[i6 + 1].OooO0OO((AbstractC9371Ii11) OooO00o2);
            }
            if (z) {
                for (int i7 = 0; i7 < ((lLiLLl1) this).OooO00o; i7++) {
                    int i8 = 0;
                    while (true) {
                        int i9 = ((lLiLLl1) this).OooO00o;
                        if (i8 >= i9) {
                            break;
                        }
                        if (r5[i7].OooO00o((i9 - i8) - 1)) {
                            int i10 = ((lLiLLl1) this).OooO00o;
                            r0[(i10 - i8) - 1].m21291OooO0OO((i10 - i7) - 1);
                        }
                        i8++;
                    }
                }
            } else {
                for (int i11 = 0; i11 < ((lLiLLl1) this).OooO00o; i11++) {
                    for (int i12 = 0; i12 < ((lLiLLl1) this).OooO00o; i12++) {
                        if (r5[i11].OooO00o(i12)) {
                            int i13 = ((lLiLLl1) this).OooO00o;
                            r0[(i13 - i12) - 1].m21291OooO0OO((i13 - i11) - 1);
                        }
                    }
                }
            }
            ((lLiLLl1) this).f18574OooO00o.addElement(r8);
            ((lLiLLl1) this).OooO0O0.addElement(r0);
            r8.f18574OooO00o.addElement(this);
            r8.OooO0O0.addElement(OooO00o(r0));
            return;
        }
        throw new IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
    }

    @Override // com.p118pd.sdk.lLiLLl1, com.p118pd.sdk.lLiLLl1, com.p118pd.sdk.lLiLLl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18021OooO00o() {
        return this.f18948OooO0O0;
    }

    @Override // com.p118pd.sdk.lLiLLl1, com.p118pd.sdk.lLiLLl1, com.p118pd.sdk.lLiLLl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m18022OooO00o() throws RuntimeException {
        if (this.f18948OooO0O0) {
            int[] iArr = new int[3];
            System.arraycopy(this.f18946OooO00o, 0, iArr, 0, 3);
            return iArr;
        }
        throw new RuntimeException();
    }

    public int OooO0O0() throws RuntimeException {
        if (this.OooO00o) {
            return this.OooO0O0;
        }
        throw new RuntimeException();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18023OooO0O0() {
        if (!OooO0o0() && !m18020OooO0OO()) {
            OooO0Oo();
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18024OooO0O0() {
        return this.OooO00o;
    }
}
