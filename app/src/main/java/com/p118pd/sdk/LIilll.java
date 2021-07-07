package com.p118pd.sdk;

import com.taobao.accs.flowcontrol.FlowControl;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Vector;

/* renamed from: com.pd.sdk.LIilll */
public class LIilll extends lLiLLl1 {
    public static final int OooO0o0 = 64;
    public int[][] OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public LIilll(int i, SecureRandom secureRandom) throws RuntimeException {
        super(secureRandom);
        if (i >= 3) {
            ((lLiLLl1) this).OooO00o = i;
            int i2 = i / 64;
            this.OooO0O0 = i2;
            int i3 = i & 63;
            this.OooO0OO = i3;
            if (i3 == 0) {
                this.OooO0OO = 64;
            } else {
                this.OooO0O0 = i2 + 1;
            }
            OooO0OO();
            if (this.OooO0Oo < 3) {
                int i4 = ((lLiLLl1) this).OooO00o;
                int[] iArr = new int[2];
                iArr[1] = 2;
                iArr[0] = i4;
                this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
                for (int i5 = 0; i5 < ((lLiLLl1) this).OooO00o; i5++) {
                    int[][] iArr2 = this.OooO00o;
                    iArr2[i5][0] = -1;
                    iArr2[i5][1] = -1;
                }
                OooO0O0();
                OooO00o();
                ((lLiLLl1) this).f18574OooO00o = new Vector();
                super.OooO0O0 = new Vector();
                return;
            }
            throw new RuntimeException("\nThe type of this field is " + this.OooO0Oo);
        }
        throw new IllegalArgumentException("k must be at least 3");
    }

    private int OooO00o(int i, int i2) {
        int OooO0Oo2;
        Random random = new Random();
        int i3 = 0;
        while (i3 == 0) {
            int i4 = i2 - 1;
            i3 = random.nextInt() % i4;
            if (i3 < 0) {
                i3 += i4;
            }
        }
        while (true) {
            OooO0Oo2 = C6356i1IiI1.OooO0Oo(i3, i2);
            if (OooO0Oo2 % i == 0 && OooO0Oo2 != 0) {
                break;
            }
            while (i3 == 0) {
                int i5 = i2 - 1;
                i3 = random.nextInt() % i5;
                if (i3 < 0) {
                    i3 += i5;
                }
            }
        }
        int i6 = i3;
        for (int i7 = 2; i7 <= i / OooO0Oo2; i7++) {
            i6 *= i3;
        }
        return i6;
    }

    private void OooO0O0() {
        int i;
        int i2 = this.OooO0Oo;
        if ((i2 & 7) != 0) {
            int i3 = (((lLiLLl1) this).OooO00o * i2) + 1;
            int[] iArr = new int[i3];
            int OooO00o2 = i2 == 1 ? 1 : i2 == 2 ? i3 - 1 : OooO00o(i2, i3);
            int i4 = 0;
            int i5 = 1;
            while (true) {
                i = this.OooO0Oo;
                if (i4 >= i) {
                    break;
                }
                int i6 = i5;
                for (int i7 = 0; i7 < ((lLiLLl1) this).OooO00o; i7++) {
                    iArr[i6] = i7;
                    i6 = (i6 << 1) % i3;
                    if (i6 < 0) {
                        i6 += i3;
                    }
                }
                i5 = (i5 * OooO00o2) % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                i4++;
            }
            if (i == 1) {
                int i8 = 1;
                while (i8 < i3 - 1) {
                    int[][] iArr2 = this.OooO00o;
                    int i9 = i8 + 1;
                    if (iArr2[iArr[i9]][0] == -1) {
                        iArr2[iArr[i9]][0] = iArr[i3 - i8];
                    } else {
                        iArr2[iArr[i9]][1] = iArr[i3 - i8];
                    }
                    i8 = i9;
                }
                int i10 = ((lLiLLl1) this).OooO00o >> 1;
                for (int i11 = 1; i11 <= i10; i11++) {
                    int[][] iArr3 = this.OooO00o;
                    int i12 = i11 - 1;
                    if (iArr3[i12][0] == -1) {
                        iArr3[i12][0] = (i10 + i11) - 1;
                    } else {
                        iArr3[i12][1] = (i10 + i11) - 1;
                    }
                    int[][] iArr4 = this.OooO00o;
                    int i13 = (i10 + i11) - 1;
                    if (iArr4[i13][0] == -1) {
                        iArr4[i13][0] = i12;
                    } else {
                        iArr4[i13][1] = i12;
                    }
                }
            } else if (i == 2) {
                int i14 = 1;
                while (i14 < i3 - 1) {
                    int[][] iArr5 = this.OooO00o;
                    int i15 = i14 + 1;
                    if (iArr5[iArr[i15]][0] == -1) {
                        iArr5[iArr[i15]][0] = iArr[i3 - i14];
                    } else {
                        iArr5[iArr[i15]][1] = iArr[i3 - i14];
                    }
                    i14 = i15;
                }
            } else {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
        } else {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
    }

    private void OooO0OO() throws RuntimeException {
        if ((((lLiLLl1) this).OooO00o & 7) != 0) {
            this.OooO0Oo = 1;
            int i = 0;
            while (i != 1) {
                int i2 = (this.OooO0Oo * ((lLiLLl1) this).OooO00o) + 1;
                if (C6356i1IiI1.m17454OooO00o(i2)) {
                    int OooO0Oo2 = C6356i1IiI1.OooO0Oo(2, i2);
                    int i3 = this.OooO0Oo;
                    int i4 = ((lLiLLl1) this).OooO00o;
                    i = C6356i1IiI1.m17448OooO00o((i3 * i4) / OooO0Oo2, i4);
                }
                this.OooO0Oo++;
            }
            int i5 = this.OooO0Oo - 1;
            this.OooO0Oo = i5;
            if (i5 == 1) {
                int i6 = (((lLiLLl1) this).OooO00o << 1) + 1;
                if (C6356i1IiI1.m17454OooO00o(i6)) {
                    int OooO0Oo3 = C6356i1IiI1.OooO0Oo(2, i6);
                    int i7 = ((lLiLLl1) this).OooO00o;
                    if (C6356i1IiI1.m17448OooO00o((i7 << 1) / OooO0Oo3, i7) == 1) {
                        this.OooO0Oo++;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("The extension degree is divisible by 8!");
    }

    @Override // com.p118pd.sdk.lLiLLl1
    public AbstractC9726llL OooO00o(C1IilLL r6) {
        Li11L1 OooO0O02;
        int OooO00o2;
        int OooO00o3;
        Li11L1 li11L1 = new Li11L1(r6, this);
        while (li11L1.OooO00o() > 1) {
            while (true) {
                C5160I11L r62 = new C5160I11L(this, ((lLiLLl1) this).f18573OooO00o);
                Li11L1 li11L12 = new Li11L1(2, C5160I11L.OooO0O0(this));
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
        C1IilLL r0;
        int i = this.OooO0Oo;
        if (i == 1) {
            r0 = new C1IilLL(((lLiLLl1) this).OooO00o + 1, FlowControl.SERVICE_ALL);
        } else if (i == 2) {
            C1IilLL r02 = new C1IilLL(((lLiLLl1) this).OooO00o + 1, "ONE");
            C1IilLL r2 = new C1IilLL(((lLiLLl1) this).OooO00o + 1, "X");
            r2.m21279OooO00o(r02);
            C1IilLL r1 = r02;
            r0 = r2;
            int i2 = 1;
            while (i2 < ((lLiLLl1) this).OooO00o) {
                C1IilLL OooO0O02 = r0.OooO0O0();
                OooO0O02.m21279OooO00o(r1);
                i2++;
                r1 = r0;
                r0 = OooO0O02;
            }
        } else {
            return;
        }
        ((lLiLLl1) this).f18572OooO00o = r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: com.pd.sdk.i丨1IIiLL[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: com.pd.sdk.i丨1IIiLL */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: com.pd.sdk.i丨1IIiLL */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.lLiLLl1
    public void OooO00o(lLiLLl1 r9) {
        AbstractC9726llL OooO00o2;
        int i = ((lLiLLl1) this).OooO00o;
        if (i == r9.OooO00o) {
            C1IilLL[] r0 = new C1IilLL[i];
            for (int i2 = 0; i2 < ((lLiLLl1) this).OooO00o; i2++) {
                r0[i2] = new C1IilLL(((lLiLLl1) this).OooO00o);
            }
            do {
                OooO00o2 = r9.OooO00o(((lLiLLl1) this).f18572OooO00o);
            } while (OooO00o2.m21441OooO00o());
            i1IIiLL[] r3 = new i1IIiLL[((lLiLLl1) this).OooO00o];
            r3[0] = (AbstractC9726llL) OooO00o2.clone();
            for (int i3 = 1; i3 < ((lLiLLl1) this).OooO00o; i3++) {
                r3[i3] = r3[i3 - 1].m17439OooO0OO();
            }
            for (int i4 = 0; i4 < ((lLiLLl1) this).OooO00o; i4++) {
                for (int i5 = 0; i5 < ((lLiLLl1) this).OooO00o; i5++) {
                    if (r3[i4].m17434OooO00o(i5)) {
                        int i6 = ((lLiLLl1) this).OooO00o;
                        r0[(i6 - i5) - 1].m21291OooO0OO((i6 - i4) - 1);
                    }
                }
            }
            ((lLiLLl1) this).f18574OooO00o.addElement(r9);
            super.OooO0O0.addElement(r0);
            r9.f18574OooO00o.addElement(this);
            r9.OooO0O0.addElement(OooO00o(r0));
            return;
        }
        throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
    }

    public int[][] OooO00o(int[][] iArr) {
        int i = ((lLiLLl1) this).OooO00o;
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
        int i2 = ((lLiLLl1) this).OooO00o;
        int[] iArr4 = new int[2];
        iArr4[1] = i2;
        iArr4[0] = i2;
        int[][] iArr5 = (int[][]) Array.newInstance(int.class, iArr4);
        for (int i3 = 0; i3 < ((lLiLLl1) this).OooO00o; i3++) {
            iArr5[i3][i3] = 1;
        }
        for (int i4 = 0; i4 < ((lLiLLl1) this).OooO00o; i4++) {
            int i5 = i4;
            while (true) {
                int i6 = ((lLiLLl1) this).OooO00o;
                if (i5 >= i6) {
                    break;
                }
                iArr[(i6 - 1) - i4][i5] = iArr[i4][i4];
                i5++;
            }
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m16108OooO0O0() {
        return this.OooO0OO;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m16109OooO0OO() {
        return this.OooO0O0;
    }
}
