package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lIiLIIi  reason: case insensitive filesystem */
public class C6509lIiLIIi extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18392OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6179iLiL[] f18393OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f18394OooO00o;
    public byte[] OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[][] f18395OooO0O0;
    public byte[] OooO0OO;
    public LlLI1 o00OoOOo;

    public C6509lIiLIIi(I11li1 i11li1) {
        int i = 0;
        if (i11li1.OooO00o(0) instanceof C6513lIiI) {
            this.OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        } else {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        }
        I11li1 i11li12 = (I11li1) i11li1.OooO00o(1);
        this.f18394OooO00o = new byte[i11li12.size()][];
        for (int i2 = 0; i2 < i11li12.size(); i2++) {
            this.f18394OooO00o[i2] = ((AbstractC6804llL1ii) i11li12.OooO00o(i2)).m17938OooO00o();
        }
        this.f18392OooO00o = ((AbstractC6804llL1ii) ((I11li1) i11li1.OooO00o(2)).OooO00o(0)).m17938OooO00o();
        I11li1 i11li13 = (I11li1) i11li1.OooO00o(3);
        this.f18395OooO0O0 = new byte[i11li13.size()][];
        for (int i3 = 0; i3 < i11li13.size(); i3++) {
            this.f18395OooO0O0[i3] = ((AbstractC6804llL1ii) i11li13.OooO00o(i3)).m17938OooO00o();
        }
        this.OooO0O0 = ((AbstractC6804llL1ii) ((I11li1) i11li1.OooO00o(4)).OooO00o(0)).m17938OooO00o();
        this.OooO0OO = ((AbstractC6804llL1ii) ((I11li1) i11li1.OooO00o(5)).OooO00o(0)).m17938OooO00o();
        I11li1 i11li14 = (I11li1) i11li1.OooO00o(6);
        byte[][][][] bArr = new byte[i11li14.size()][][][];
        byte[][][][] bArr2 = new byte[i11li14.size()][][][];
        byte[][][] bArr3 = new byte[i11li14.size()][][];
        byte[][] bArr4 = new byte[i11li14.size()][];
        int i4 = 0;
        while (i4 < i11li14.size()) {
            I11li1 i11li15 = (I11li1) i11li14.OooO00o(i4);
            I11li1 i11li16 = (I11li1) i11li15.OooO00o(i);
            bArr[i4] = new byte[i11li16.size()][][];
            for (int i5 = 0; i5 < i11li16.size(); i5++) {
                I11li1 i11li17 = (I11li1) i11li16.OooO00o(i5);
                bArr[i4][i5] = new byte[i11li17.size()][];
                for (int i6 = 0; i6 < i11li17.size(); i6++) {
                    bArr[i4][i5][i6] = ((AbstractC6804llL1ii) i11li17.OooO00o(i6)).m17938OooO00o();
                }
            }
            I11li1 i11li18 = (I11li1) i11li15.OooO00o(1);
            bArr2[i4] = new byte[i11li18.size()][][];
            for (int i7 = 0; i7 < i11li18.size(); i7++) {
                I11li1 i11li19 = (I11li1) i11li18.OooO00o(i7);
                bArr2[i4][i7] = new byte[i11li19.size()][];
                for (int i8 = 0; i8 < i11li19.size(); i8++) {
                    bArr2[i4][i7][i8] = ((AbstractC6804llL1ii) i11li19.OooO00o(i8)).m17938OooO00o();
                }
            }
            I11li1 i11li110 = (I11li1) i11li15.OooO00o(2);
            bArr3[i4] = new byte[i11li110.size()][];
            for (int i9 = 0; i9 < i11li110.size(); i9++) {
                bArr3[i4][i9] = ((AbstractC6804llL1ii) i11li110.OooO00o(i9)).m17938OooO00o();
            }
            bArr4[i4] = ((AbstractC6804llL1ii) i11li15.OooO00o(3)).m17938OooO00o();
            i4++;
            i = 0;
        }
        int length = this.OooO0OO.length - 1;
        this.f18393OooO00o = new C6179iLiL[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.OooO0OO;
            int i11 = i10 + 1;
            this.f18393OooO00o[i10] = new C6179iLiL(bArr5[i10], bArr5[i11], C5601L1i.OooO00o(bArr[i10]), C5601L1i.OooO00o(bArr2[i10]), C5601L1i.OooO00o(bArr3[i10]), C5601L1i.m16006OooO00o(bArr4[i10]));
            i10 = i11;
        }
    }

    public C6509lIiLIIi(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C6179iLiL[] ililArr) {
        this.OooO00o = new C6513lIiI(1);
        this.f18394OooO00o = C5601L1i.OooO00o(sArr);
        this.f18392OooO00o = C5601L1i.OooO00o(sArr2);
        this.f18395OooO0O0 = C5601L1i.OooO00o(sArr3);
        this.OooO0O0 = C5601L1i.OooO00o(sArr4);
        this.OooO0OO = C5601L1i.OooO00o(iArr);
        this.f18393OooO00o = ililArr;
    }

    public static C6509lIiLIIi OooO00o(Object obj) {
        if (obj instanceof C6509lIiLIIi) {
            return (C6509lIiLIIi) obj;
        }
        if (obj != null) {
            return new C6509lIiLIIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17639OooO00o() {
        return C5601L1i.OooO00o(this.OooO0OO);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6179iLiL[] m17640OooO00o() {
        return this.f18393OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[] m17641OooO00o() {
        return C5601L1i.m16006OooO00o(this.f18392OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[][] m17642OooO00o() {
        return C5601L1i.OooO00o(this.f18394OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        AbstractC6854lLi1LL r1 = this.OooO00o;
        if (r1 == null) {
            r1 = this.o00OoOOo;
        }
        r0.OooO00o(r1);
        iILLL1 r12 = new iILLL1();
        int i = 0;
        while (true) {
            byte[][] bArr = this.f18394OooO00o;
            if (i >= bArr.length) {
                break;
            }
            r12.OooO00o(new C6487lIIiIlL(bArr[i]));
            i++;
        }
        r0.OooO00o(new C5707LiL1(r12));
        iILLL1 r13 = new iILLL1();
        r13.OooO00o(new C6487lIIiIlL(this.f18392OooO00o));
        r0.OooO00o(new C5707LiL1(r13));
        iILLL1 r14 = new iILLL1();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f18395OooO0O0;
            if (i2 >= bArr2.length) {
                break;
            }
            r14.OooO00o(new C6487lIIiIlL(bArr2[i2]));
            i2++;
        }
        r0.OooO00o(new C5707LiL1(r14));
        iILLL1 r15 = new iILLL1();
        r15.OooO00o(new C6487lIIiIlL(this.OooO0O0));
        r0.OooO00o(new C5707LiL1(r15));
        iILLL1 r16 = new iILLL1();
        r16.OooO00o(new C6487lIIiIlL(this.OooO0OO));
        r0.OooO00o(new C5707LiL1(r16));
        iILLL1 r17 = new iILLL1();
        for (int i3 = 0; i3 < this.f18393OooO00o.length; i3++) {
            iILLL1 r4 = new iILLL1();
            byte[][][] OooO00o2 = C5601L1i.OooO00o(this.f18393OooO00o[i3].m17137OooO00o());
            iILLL1 r6 = new iILLL1();
            for (int i4 = 0; i4 < OooO00o2.length; i4++) {
                iILLL1 r8 = new iILLL1();
                for (int i5 = 0; i5 < OooO00o2[i4].length; i5++) {
                    r8.OooO00o(new C6487lIIiIlL(OooO00o2[i4][i5]));
                }
                r6.OooO00o(new C5707LiL1(r8));
            }
            r4.OooO00o(new C5707LiL1(r6));
            byte[][][] OooO00o3 = C5601L1i.OooO00o(this.f18393OooO00o[i3].m17138OooO0O0());
            iILLL1 r62 = new iILLL1();
            for (int i6 = 0; i6 < OooO00o3.length; i6++) {
                iILLL1 r82 = new iILLL1();
                for (int i7 = 0; i7 < OooO00o3[i6].length; i7++) {
                    r82.OooO00o(new C6487lIIiIlL(OooO00o3[i6][i7]));
                }
                r62.OooO00o(new C5707LiL1(r82));
            }
            r4.OooO00o(new C5707LiL1(r62));
            byte[][] OooO00o4 = C5601L1i.OooO00o(this.f18393OooO00o[i3].m17136OooO00o());
            iILLL1 r63 = new iILLL1();
            for (byte[] bArr3 : OooO00o4) {
                r63.OooO00o(new C6487lIIiIlL(bArr3));
            }
            r4.OooO00o(new C5707LiL1(r63));
            r4.OooO00o(new C6487lIIiIlL(C5601L1i.OooO00o(this.f18393OooO00o[i3].m17135OooO00o())));
            r17.OooO00o(new C5707LiL1(r4));
        }
        r0.OooO00o(new C5707LiL1(r17));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public short[] m17643OooO0O0() {
        return C5601L1i.m16006OooO00o(this.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public short[][] m17644OooO0O0() {
        return C5601L1i.OooO00o(this.f18395OooO0O0);
    }
}
