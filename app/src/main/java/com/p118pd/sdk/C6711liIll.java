package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.li丨Ill丨  reason: invalid class name and case insensitive filesystem */
public class C6711liIll implements AbstractC5599L1Ii {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IL1lLLI f18655OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18656OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18657OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f18658OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6179iLiL[] f18659OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f18660OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[][] f18661OooO00o;
    public short[] OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public short[][] f18662OooO0O0;
    public short[] OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public short[][] f18663OooO0OO;
    public short[][] OooO0Oo;
    public short[][] OooO0o;
    public short[][] OooO0o0;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    private void OooO00o() {
        Class<short> cls = short.class;
        LLLL1 llll1 = new LLLL1();
        int[] iArr = this.f18658OooO00o;
        int i = 0;
        int i2 = iArr[iArr.length - 1] - iArr[0];
        int i3 = iArr[iArr.length - 1];
        int[] iArr2 = new int[3];
        iArr2[2] = i3;
        iArr2[1] = i3;
        iArr2[0] = i2;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, iArr2);
        int[] iArr3 = new int[2];
        iArr3[1] = i3;
        iArr3[0] = i2;
        this.OooO0o = (short[][]) Array.newInstance((Class<?>) cls, iArr3);
        this.OooO0OO = new short[i2];
        short[] sArr2 = new short[i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            C6179iLiL[] ililArr = this.f18659OooO00o;
            if (i4 >= ililArr.length) {
                break;
            }
            short[][][] OooO00o2 = ililArr[i4].m17137OooO00o();
            short[][][] OooO0O02 = this.f18659OooO00o[i4].m17138OooO0O0();
            short[][] OooO00o3 = this.f18659OooO00o[i4].m17136OooO00o();
            short[] OooO00o4 = this.f18659OooO00o[i4].m17135OooO00o();
            int length = OooO00o2[i].length;
            int length2 = OooO0O02[i].length;
            while (i < length) {
                int i6 = 0;
                while (i6 < length) {
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = i6 + length2;
                        short[] OooO00o5 = llll1.OooO00o(OooO00o2[i][i6][i7], this.f18663OooO0OO[i8]);
                        int i9 = i5 + i;
                        sArr[i9] = llll1.OooO00o(sArr[i9], llll1.m16222OooO00o(OooO00o5, this.f18663OooO0OO[i7]));
                        short[] OooO00o6 = llll1.OooO00o(this.OooO0O0[i7], OooO00o5);
                        short[][] sArr3 = this.OooO0o;
                        sArr3[i9] = llll1.OooO00o(OooO00o6, sArr3[i9]);
                        short[] OooO00o7 = llll1.OooO00o(this.OooO0O0[i8], llll1.OooO00o(OooO00o2[i][i6][i7], this.f18663OooO0OO[i7]));
                        short[][] sArr4 = this.OooO0o;
                        sArr4[i9] = llll1.OooO00o(OooO00o7, sArr4[i9]);
                        short OooO0O03 = C6275iili.OooO0O0(OooO00o2[i][i6][i7], this.OooO0O0[i8]);
                        short[] sArr5 = this.OooO0OO;
                        sArr5[i9] = C6275iili.OooO00o(sArr5[i9], C6275iili.OooO0O0(OooO0O03, this.OooO0O0[i7]));
                        i7++;
                        i3 = i3;
                        i2 = i2;
                        OooO00o2 = OooO00o2;
                        i4 = i4;
                        OooO00o4 = OooO00o4;
                    }
                    i6++;
                    cls = cls;
                }
                for (int i10 = 0; i10 < length2; i10++) {
                    for (int i11 = 0; i11 < length2; i11++) {
                        short[] OooO00o8 = llll1.OooO00o(OooO0O02[i][i10][i11], this.f18663OooO0OO[i10]);
                        int i12 = i5 + i;
                        sArr[i12] = llll1.OooO00o(sArr[i12], llll1.m16222OooO00o(OooO00o8, this.f18663OooO0OO[i11]));
                        short[] OooO00o9 = llll1.OooO00o(this.OooO0O0[i11], OooO00o8);
                        short[][] sArr6 = this.OooO0o;
                        sArr6[i12] = llll1.OooO00o(OooO00o9, sArr6[i12]);
                        short[] OooO00o10 = llll1.OooO00o(this.OooO0O0[i10], llll1.OooO00o(OooO0O02[i][i10][i11], this.f18663OooO0OO[i11]));
                        short[][] sArr7 = this.OooO0o;
                        sArr7[i12] = llll1.OooO00o(OooO00o10, sArr7[i12]);
                        short OooO0O04 = C6275iili.OooO0O0(OooO0O02[i][i10][i11], this.OooO0O0[i10]);
                        short[] sArr8 = this.OooO0OO;
                        sArr8[i12] = C6275iili.OooO00o(sArr8[i12], C6275iili.OooO0O0(OooO0O04, this.OooO0O0[i11]));
                    }
                }
                for (int i13 = 0; i13 < length2 + length; i13++) {
                    short[] OooO00o11 = llll1.OooO00o(OooO00o3[i][i13], this.f18663OooO0OO[i13]);
                    short[][] sArr9 = this.OooO0o;
                    int i14 = i5 + i;
                    sArr9[i14] = llll1.OooO00o(OooO00o11, sArr9[i14]);
                    short[] sArr10 = this.OooO0OO;
                    sArr10[i14] = C6275iili.OooO00o(sArr10[i14], C6275iili.OooO0O0(OooO00o3[i][i13], this.OooO0O0[i13]));
                }
                short[] sArr11 = this.OooO0OO;
                int i15 = i5 + i;
                sArr11[i15] = C6275iili.OooO00o(sArr11[i15], OooO00o4[i]);
                i++;
                cls = cls;
                i3 = i3;
                i2 = i2;
                OooO00o2 = OooO00o2;
                i4 = i4;
                OooO00o4 = OooO00o4;
            }
            i5 += length;
            i4++;
            i = 0;
        }
        int[] iArr4 = new int[3];
        iArr4[2] = i3;
        iArr4[1] = i3;
        iArr4[0] = i2;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) cls, iArr4);
        int[] iArr5 = new int[2];
        iArr5[1] = i3;
        iArr5[0] = i2;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, iArr5);
        short[] sArr14 = new short[i2];
        for (int i16 = 0; i16 < i2; i16++) {
            int i17 = 0;
            while (true) {
                short[][] sArr15 = this.f18661OooO00o;
                if (i17 >= sArr15.length) {
                    break;
                }
                sArr12[i16] = llll1.OooO00o(sArr12[i16], llll1.OooO00o(sArr15[i16][i17], sArr[i17]));
                sArr13[i16] = llll1.OooO00o(sArr13[i16], llll1.OooO00o(this.f18661OooO00o[i16][i17], this.OooO0o[i17]));
                sArr14[i16] = C6275iili.OooO00o(sArr14[i16], C6275iili.OooO0O0(this.f18661OooO00o[i16][i17], this.OooO0OO[i17]));
                i17++;
            }
            sArr14[i16] = C6275iili.OooO00o(sArr14[i16], this.f18660OooO00o[i16]);
        }
        this.OooO0o = sArr13;
        this.OooO0OO = sArr14;
        OooO00o(sArr12);
    }

    private void OooO00o(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = ((length2 + 1) * length2) / 2;
        iArr[0] = length;
        this.OooO0o0 = (short[][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                for (int i4 = i3; i4 < length2; i4++) {
                    short[][] sArr2 = this.OooO0o0;
                    if (i4 == i3) {
                        sArr2[i][i2] = sArr[i][i3][i4];
                    } else {
                        sArr2[i][i2] = C6275iili.OooO00o(sArr[i][i3][i4], sArr[i][i4][i3]);
                    }
                    i2++;
                }
            }
        }
    }

    private void OooO0O0() {
        this.f18659OooO00o = new C6179iLiL[this.OooO00o];
        int i = 0;
        while (i < this.OooO00o) {
            C6179iLiL[] ililArr = this.f18659OooO00o;
            int[] iArr = this.f18658OooO00o;
            int i2 = i + 1;
            ililArr[i] = new C6179iLiL(iArr[i], iArr[i2], this.f18656OooO00o);
            i = i2;
        }
    }

    private void OooO0OO() {
        int[] iArr = this.f18658OooO00o;
        int i = iArr[iArr.length - 1] - iArr[0];
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        this.f18661OooO00o = (short[][]) Array.newInstance(short.class, iArr2);
        this.f18662OooO0O0 = null;
        LLLL1 llll1 = new LLLL1();
        while (this.f18662OooO0O0 == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.f18661OooO00o[i2][i3] = (short) (this.f18656OooO00o.nextInt() & 255);
                }
            }
            this.f18662OooO0O0 = llll1.OooO00o(this.f18661OooO00o);
        }
        this.f18660OooO00o = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f18660OooO00o[i4] = (short) (this.f18656OooO00o.nextInt() & 255);
        }
    }

    private void OooO0Oo() {
        int[] iArr = this.f18658OooO00o;
        int i = iArr[iArr.length - 1];
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        this.f18663OooO0OO = (short[][]) Array.newInstance(short.class, iArr2);
        this.OooO0Oo = null;
        LLLL1 llll1 = new LLLL1();
        while (this.OooO0Oo == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.f18663OooO0OO[i2][i3] = (short) (this.f18656OooO00o.nextInt() & 255);
                }
            }
            this.OooO0Oo = llll1.OooO00o(this.f18663OooO0OO);
        }
        this.OooO0O0 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.OooO0O0[i4] = (short) (this.f18656OooO00o.nextInt() & 255);
        }
    }

    private void OooO0o() {
        OooO0OO();
        OooO0Oo();
        OooO0O0();
        OooO00o();
    }

    private void OooO0o0() {
        OooO0O0(new IL1lLLI(IIllii.OooO00o(), new C6216iLLL1()));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1LLl1L m17809OooO00o() {
        return m17810OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        OooO0O0(r1);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public i1LLl1L m17810OooO0O0() {
        if (!this.f18657OooO00o) {
            OooO0o0();
        }
        OooO0o();
        iiLIiL r0 = new iiLIiL(this.f18662OooO0O0, this.f18660OooO00o, this.OooO0Oo, this.OooO0O0, this.f18658OooO00o, this.f18659OooO00o);
        int[] iArr = this.f18658OooO00o;
        return new i1LLl1L((C6213iL11I) new C6195iLllLLIi(iArr[iArr.length - 1] - iArr[0], this.OooO0o0, this.OooO0o, this.OooO0OO), (C6213iL11I) r0);
    }

    public void OooO0O0(C6470l1i r1) {
        IL1lLLI r12 = (IL1lLLI) r1;
        this.f18655OooO00o = r12;
        this.f18656OooO00o = r12.m17607OooO00o();
        this.f18658OooO00o = this.f18655OooO00o.OooO00o().m17200OooO00o();
        this.OooO00o = this.f18655OooO00o.OooO00o().OooO0O0();
        this.f18657OooO00o = true;
    }
}
