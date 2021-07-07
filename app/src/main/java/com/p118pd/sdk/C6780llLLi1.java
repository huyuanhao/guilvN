package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Vector;

/* renamed from: com.pd.sdk.llL丨Li1  reason: invalid class name and case insensitive filesystem */
public class C6780llLLi1 extends AbstractC5738Lil {
    public AbstractC6122iIlLiL OooO00o;

    public C6780llLLi1(I11li1 i11li1) {
        I11li1 i11li12 = (I11li1) i11li1.OooO00o(0);
        int[] iArr = new int[i11li12.size()];
        for (int i = 0; i < i11li12.size(); i++) {
            iArr[i] = OooO00o(i11li12.OooO00o(i));
        }
        I11li1 i11li13 = (I11li1) i11li1.OooO00o(1);
        int size = i11li13.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((C6487lIIiIlL) i11li13.OooO00o(i2)).m17938OooO00o();
        }
        I11li1 i11li14 = (I11li1) i11li1.OooO00o(2);
        int size2 = i11li14.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            bArr2[i3] = ((C6487lIIiIlL) i11li14.OooO00o(i3)).m17938OooO00o();
        }
        I11li1 i11li15 = (I11li1) i11li1.OooO00o(3);
        int size3 = i11li15.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i4 = 0; i4 < size3; i4++) {
            I11li1 i11li16 = (I11li1) i11li15.OooO00o(i4);
            bArr3[i4] = new byte[i11li16.size()][];
            for (int i5 = 0; i5 < bArr3[i4].length; i5++) {
                bArr3[i4][i5] = ((C6487lIIiIlL) i11li16.OooO00o(i5)).m17938OooO00o();
            }
        }
        I11li1 i11li17 = (I11li1) i11li1.OooO00o(4);
        int size4 = i11li17.size();
        byte[][][] bArr4 = new byte[size4][][];
        for (int i6 = 0; i6 < size4; i6++) {
            I11li1 i11li18 = (I11li1) i11li17.OooO00o(i6);
            bArr4[i6] = new byte[i11li18.size()][];
            for (int i7 = 0; i7 < bArr4[i6].length; i7++) {
                bArr4[i6][i7] = ((C6487lIIiIlL) i11li18.OooO00o(i7)).m17938OooO00o();
            }
        }
        I1I1LIl[][] r10 = new I1I1LIl[((I11li1) i11li1.OooO00o(5)).size()][];
    }

    public C6780llLLi1(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, I1I1LIl[][] r31, I1I1LIl[][] r32, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, iil1iLIl[] iil1ililArr, iil1iLIl[] iil1ililArr2, iil1iLIl[] iil1ililArr3, int[] iArr2, byte[][] bArr6, C9356IIlL[] r43, byte[][] bArr7, C6206iLL[] r45, C5673LLll r46, C6456l1ilL r47) {
        this.OooO00o = OooO00o(iArr, bArr, bArr2, bArr3, bArr4, bArr5, r31, r32, vectorArr, vectorArr2, vectorArr3, vectorArr4, iil1ililArr, iil1ililArr2, iil1ililArr3, iArr2, bArr6, r43, bArr7, r45, r46, new C6456l1ilL[]{r47});
    }

    public static int OooO00o(AbstractC6854lLi1LL r3) {
        BigInteger OooO0O0 = ((C6513lIiI) r3).m17647OooO0O0();
        if (OooO0O0.compareTo(BigInteger.valueOf(2147483647L)) <= 0 && OooO0O0.compareTo(BigInteger.valueOf(-2147483648L)) >= 0) {
            return OooO0O0.intValue();
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + OooO0O0.toString());
    }

    private AbstractC6122iIlLiL OooO00o(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, I1I1LIl[][] r28, I1I1LIl[][] r29, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, iil1iLIl[] iil1ililArr, iil1iLIl[] iil1ililArr2, iil1iLIl[] iil1ililArr3, int[] iArr2, byte[][] bArr6, C9356IIlL[] r39, byte[][] bArr7, C6206iLL[] r41, C5673LLll r42, C6456l1ilL[] r43) {
        I1I1LIl[][] r6 = r28;
        iILLL1 r14 = new iILLL1();
        iILLL1 r13 = new iILLL1();
        for (int i : iArr) {
            r13.OooO00o(new C6513lIiI((long) i));
        }
        r14.OooO00o(new C5707LiL1(r13));
        iILLL1 r0 = new iILLL1();
        for (byte[] bArr8 : bArr) {
            r0.OooO00o(new C6487lIIiIlL(bArr8));
        }
        r14.OooO00o(new C5707LiL1(r0));
        iILLL1 r02 = new iILLL1();
        for (byte[] bArr9 : bArr2) {
            r02.OooO00o(new C6487lIIiIlL(bArr9));
        }
        r14.OooO00o(new C5707LiL1(r02));
        iILLL1 r03 = new iILLL1();
        iILLL1 r1 = new iILLL1();
        for (int i2 = 0; i2 < bArr3.length; i2++) {
            for (int i3 = 0; i3 < bArr3[i2].length; i3++) {
                r03.OooO00o(new C6487lIIiIlL(bArr3[i2][i3]));
            }
            r1.OooO00o(new C5707LiL1(r03));
            r03 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r1));
        iILLL1 r04 = new iILLL1();
        iILLL1 r12 = new iILLL1();
        for (int i4 = 0; i4 < bArr4.length; i4++) {
            for (int i5 = 0; i5 < bArr4[i4].length; i5++) {
                r04.OooO00o(new C6487lIIiIlL(bArr4[i4][i5]));
            }
            r12.OooO00o(new C5707LiL1(r04));
            r04 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r12));
        iILLL1 r05 = new iILLL1();
        iILLL1 r15 = new iILLL1();
        iILLL1 r2 = new iILLL1();
        iILLL1 r3 = new iILLL1();
        iILLL1 r4 = new iILLL1();
        int i6 = 0;
        while (i6 < r6.length) {
            int i7 = 0;
            while (i7 < r6[i6].length) {
                r2.OooO00o(new C5707LiL1(r43[0]));
                int i8 = r6[i6][i7].m15244OooO00o()[1];
                r3.OooO00o(new C6487lIIiIlL(r6[i6][i7].m15245OooO00o()[0]));
                r3.OooO00o(new C6487lIIiIlL(r6[i6][i7].m15245OooO00o()[1]));
                r3.OooO00o(new C6487lIIiIlL(r6[i6][i7].m15245OooO00o()[2]));
                for (int i9 = 0; i9 < i8; i9++) {
                    r3.OooO00o(new C6487lIIiIlL(r6[i6][i7].m15245OooO00o()[i9 + 3]));
                }
                r2.OooO00o(new C5707LiL1(r3));
                r3 = new iILLL1();
                r4.OooO00o(new C6513lIiI((long) r6[i6][i7].m15244OooO00o()[0]));
                r4.OooO00o(new C6513lIiI((long) i8));
                r4.OooO00o(new C6513lIiI((long) r6[i6][i7].m15244OooO00o()[2]));
                r4.OooO00o(new C6513lIiI((long) r6[i6][i7].m15244OooO00o()[3]));
                r4.OooO00o(new C6513lIiI((long) r6[i6][i7].m15244OooO00o()[4]));
                r4.OooO00o(new C6513lIiI((long) r6[i6][i7].m15244OooO00o()[5]));
                int i10 = 0;
                while (i10 < i8) {
                    r4.OooO00o(new C6513lIiI((long) r6[i6][i7].m15244OooO00o()[i10 + 6]));
                    i10++;
                    r6 = r28;
                }
                r2.OooO00o(new C5707LiL1(r4));
                r4 = new iILLL1();
                r15.OooO00o(new C5707LiL1(r2));
                r2 = new iILLL1();
                i7++;
                r6 = r28;
            }
            r05.OooO00o(new C5707LiL1(r15));
            r15 = new iILLL1();
            i6++;
            r6 = r28;
        }
        r14.OooO00o(new C5707LiL1(r05));
        iILLL1 r06 = new iILLL1();
        iILLL1 r16 = new iILLL1();
        iILLL1 r22 = new iILLL1();
        iILLL1 r32 = new iILLL1();
        iILLL1 r44 = new iILLL1();
        for (int i11 = 0; i11 < r29.length; i11++) {
            for (int i12 = 0; i12 < r29[i11].length; i12++) {
                r22.OooO00o(new C5707LiL1(r43[0]));
                int i13 = r29[i11][i12].m15244OooO00o()[1];
                r32.OooO00o(new C6487lIIiIlL(r29[i11][i12].m15245OooO00o()[0]));
                r32.OooO00o(new C6487lIIiIlL(r29[i11][i12].m15245OooO00o()[1]));
                r32.OooO00o(new C6487lIIiIlL(r29[i11][i12].m15245OooO00o()[2]));
                for (int i14 = 0; i14 < i13; i14++) {
                    r32.OooO00o(new C6487lIIiIlL(r29[i11][i12].m15245OooO00o()[i14 + 3]));
                }
                r22.OooO00o(new C5707LiL1(r32));
                r32 = new iILLL1();
                r44.OooO00o(new C6513lIiI((long) r29[i11][i12].m15244OooO00o()[0]));
                r44.OooO00o(new C6513lIiI((long) i13));
                r44.OooO00o(new C6513lIiI((long) r29[i11][i12].m15244OooO00o()[2]));
                r44.OooO00o(new C6513lIiI((long) r29[i11][i12].m15244OooO00o()[3]));
                r44.OooO00o(new C6513lIiI((long) r29[i11][i12].m15244OooO00o()[4]));
                r44.OooO00o(new C6513lIiI((long) r29[i11][i12].m15244OooO00o()[5]));
                for (int i15 = 0; i15 < i13; i15++) {
                    r44.OooO00o(new C6513lIiI((long) r29[i11][i12].m15244OooO00o()[i15 + 6]));
                }
                r22.OooO00o(new C5707LiL1(r44));
                r44 = new iILLL1();
                r16.OooO00o(new C5707LiL1(r22));
                r22 = new iILLL1();
            }
            r06.OooO00o(new C5707LiL1(new C5707LiL1(r16)));
            r16 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r06));
        iILLL1 r07 = new iILLL1();
        iILLL1 r17 = new iILLL1();
        for (int i16 = 0; i16 < bArr5.length; i16++) {
            for (int i17 = 0; i17 < bArr5[i16].length; i17++) {
                r07.OooO00o(new C6487lIIiIlL(bArr5[i16][i17]));
            }
            r17.OooO00o(new C5707LiL1(r07));
            r07 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r17));
        iILLL1 r08 = new iILLL1();
        iILLL1 r18 = new iILLL1();
        for (int i18 = 0; i18 < vectorArr.length; i18++) {
            for (int i19 = 0; i19 < vectorArr[i18].size(); i19++) {
                r08.OooO00o(new C6487lIIiIlL((byte[]) vectorArr[i18].elementAt(i19)));
            }
            r18.OooO00o(new C5707LiL1(r08));
            r08 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r18));
        iILLL1 r09 = new iILLL1();
        iILLL1 r19 = new iILLL1();
        for (int i20 = 0; i20 < vectorArr2.length; i20++) {
            for (int i21 = 0; i21 < vectorArr2[i20].size(); i21++) {
                r09.OooO00o(new C6487lIIiIlL((byte[]) vectorArr2[i20].elementAt(i21)));
            }
            r19.OooO00o(new C5707LiL1(r09));
            r09 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r19));
        iILLL1 r010 = new iILLL1();
        iILLL1 r110 = new iILLL1();
        iILLL1 r23 = new iILLL1();
        for (int i22 = 0; i22 < vectorArr3.length; i22++) {
            for (int i23 = 0; i23 < vectorArr3[i22].length; i23++) {
                for (int i24 = 0; i24 < vectorArr3[i22][i23].size(); i24++) {
                    r010.OooO00o(new C6487lIIiIlL((byte[]) vectorArr3[i22][i23].elementAt(i24)));
                }
                r110.OooO00o(new C5707LiL1(r010));
                r010 = new iILLL1();
            }
            r23.OooO00o(new C5707LiL1(r110));
            r110 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r23));
        iILLL1 r011 = new iILLL1();
        iILLL1 r111 = new iILLL1();
        iILLL1 r24 = new iILLL1();
        for (int i25 = 0; i25 < vectorArr4.length; i25++) {
            for (int i26 = 0; i26 < vectorArr4[i25].length; i26++) {
                for (int i27 = 0; i27 < vectorArr4[i25][i26].size(); i27++) {
                    r011.OooO00o(new C6487lIIiIlL((byte[]) vectorArr4[i25][i26].elementAt(i27)));
                }
                r111.OooO00o(new C5707LiL1(r011));
                r011 = new iILLL1();
            }
            r24.OooO00o(new C5707LiL1(r111));
            r111 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r24));
        iILLL1 r012 = new iILLL1();
        iILLL1 r112 = new iILLL1();
        iILLL1 r25 = new iILLL1();
        iILLL1 r33 = new iILLL1();
        for (int i28 = 0; i28 < iil1ililArr.length; i28++) {
            r112.OooO00o(new C5707LiL1(r43[0]));
            byte[][] OooO00o2 = iil1ililArr[i28].m17297OooO00o();
            r25.OooO00o(new C6487lIIiIlL(OooO00o2[0]));
            r25.OooO00o(new C6487lIIiIlL(OooO00o2[1]));
            r25.OooO00o(new C6487lIIiIlL(OooO00o2[2]));
            r25.OooO00o(new C6487lIIiIlL(OooO00o2[3]));
            r112.OooO00o(new C5707LiL1(r25));
            r25 = new iILLL1();
            int[] OooO00o3 = iil1ililArr[i28].m17296OooO00o();
            r33.OooO00o(new C6513lIiI((long) OooO00o3[0]));
            r33.OooO00o(new C6513lIiI((long) OooO00o3[1]));
            r33.OooO00o(new C6513lIiI((long) OooO00o3[2]));
            r33.OooO00o(new C6513lIiI((long) OooO00o3[3]));
            r112.OooO00o(new C5707LiL1(r33));
            r33 = new iILLL1();
            r012.OooO00o(new C5707LiL1(r112));
            r112 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r012));
        iILLL1 r013 = new iILLL1();
        iILLL1 r113 = new iILLL1();
        iILLL1 r26 = new iILLL1();
        iILLL1 r34 = new iILLL1();
        for (int i29 = 0; i29 < iil1ililArr2.length; i29++) {
            r113.OooO00o(new C5707LiL1(r43[0]));
            byte[][] OooO00o4 = iil1ililArr2[i29].m17297OooO00o();
            r26.OooO00o(new C6487lIIiIlL(OooO00o4[0]));
            r26.OooO00o(new C6487lIIiIlL(OooO00o4[1]));
            r26.OooO00o(new C6487lIIiIlL(OooO00o4[2]));
            r26.OooO00o(new C6487lIIiIlL(OooO00o4[3]));
            r113.OooO00o(new C5707LiL1(r26));
            r26 = new iILLL1();
            int[] OooO00o5 = iil1ililArr2[i29].m17296OooO00o();
            r34.OooO00o(new C6513lIiI((long) OooO00o5[0]));
            r34.OooO00o(new C6513lIiI((long) OooO00o5[1]));
            r34.OooO00o(new C6513lIiI((long) OooO00o5[2]));
            r34.OooO00o(new C6513lIiI((long) OooO00o5[3]));
            r113.OooO00o(new C5707LiL1(r34));
            r34 = new iILLL1();
            r013.OooO00o(new C5707LiL1(r113));
            r113 = new iILLL1();
        }
        r14.OooO00o(new C5707LiL1(r013));
        iILLL1 r014 = new iILLL1();
        iILLL1 r114 = new iILLL1();
        iILLL1 r27 = new iILLL1();
        iILLL1 r35 = new iILLL1();
        iILLL1 r5 = r14;
        for (int i30 = 0; i30 < iil1ililArr3.length; i30++) {
            r114.OooO00o(new C5707LiL1(r43[0]));
            byte[][] OooO00o6 = iil1ililArr3[i30].m17297OooO00o();
            r27.OooO00o(new C6487lIIiIlL(OooO00o6[0]));
            r27.OooO00o(new C6487lIIiIlL(OooO00o6[1]));
            r27.OooO00o(new C6487lIIiIlL(OooO00o6[2]));
            r27.OooO00o(new C6487lIIiIlL(OooO00o6[3]));
            r114.OooO00o(new C5707LiL1(r27));
            r27 = new iILLL1();
            int[] OooO00o7 = iil1ililArr3[i30].m17296OooO00o();
            r35.OooO00o(new C6513lIiI((long) OooO00o7[0]));
            r35.OooO00o(new C6513lIiI((long) OooO00o7[1]));
            r35.OooO00o(new C6513lIiI((long) OooO00o7[2]));
            r35.OooO00o(new C6513lIiI((long) OooO00o7[3]));
            r114.OooO00o(new C5707LiL1(r35));
            r35 = new iILLL1();
            r014.OooO00o(new C5707LiL1(r114));
            r114 = new iILLL1();
        }
        r5.OooO00o(new C5707LiL1(r014));
        iILLL1 r015 = new iILLL1();
        for (int i31 : iArr2) {
            r015.OooO00o(new C6513lIiI((long) i31));
        }
        r5.OooO00o(new C5707LiL1(r015));
        iILLL1 r016 = new iILLL1();
        for (byte[] bArr10 : bArr6) {
            r016.OooO00o(new C6487lIIiIlL(bArr10));
        }
        r5.OooO00o(new C5707LiL1(r016));
        iILLL1 r017 = new iILLL1();
        iILLL1 r115 = new iILLL1();
        new iILLL1();
        iILLL1 r36 = new iILLL1();
        iILLL1 r45 = new iILLL1();
        iILLL1 r62 = new iILLL1();
        iILLL1 r7 = new iILLL1();
        int i32 = 0;
        while (i32 < r39.length) {
            r115.OooO00o(new C5707LiL1(r43[0]));
            new iILLL1();
            int i33 = r39[i32].m21415OooO00o()[0];
            int i34 = r39[i32].m21415OooO00o()[7];
            r36.OooO00o(new C6487lIIiIlL(r39[i32].m21419OooO0O0()[0]));
            int i35 = 0;
            while (i35 < i33) {
                i35++;
                r36.OooO00o(new C6487lIIiIlL(r39[i32].m21419OooO0O0()[i35]));
            }
            for (int i36 = 0; i36 < i34; i36++) {
                r36.OooO00o(new C6487lIIiIlL(r39[i32].m21419OooO0O0()[i33 + 1 + i36]));
            }
            r115.OooO00o(new C5707LiL1(r36));
            iILLL1 r37 = new iILLL1();
            r45.OooO00o(new C6513lIiI((long) i33));
            r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[1]));
            r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[2]));
            r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[3]));
            r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[4]));
            r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[5]));
            r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[6]));
            r45.OooO00o(new C6513lIiI((long) i34));
            for (int i37 = 0; i37 < i33; i37++) {
                r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[i37 + 8]));
            }
            for (int i38 = 0; i38 < i34; i38++) {
                r45.OooO00o(new C6513lIiI((long) r39[i32].m21415OooO00o()[i33 + 8 + i38]));
            }
            r115.OooO00o(new C5707LiL1(r45));
            iILLL1 r46 = new iILLL1();
            iILLL1 r10 = new iILLL1();
            iILLL1 r11 = new iILLL1();
            iILLL1 r122 = new iILLL1();
            if (r39[i32].m21416OooO00o() != null) {
                int i39 = 0;
                while (i39 < r39[i32].m21416OooO00o().length) {
                    r10.OooO00o(new C5707LiL1(r43[0]));
                    int i40 = r39[i32].m21416OooO00o()[i39].m15244OooO00o()[1];
                    r11.OooO00o(new C6487lIIiIlL(r39[i32].m21416OooO00o()[i39].m15245OooO00o()[0]));
                    r11.OooO00o(new C6487lIIiIlL(r39[i32].m21416OooO00o()[i39].m15245OooO00o()[1]));
                    r11.OooO00o(new C6487lIIiIlL(r39[i32].m21416OooO00o()[i39].m15245OooO00o()[2]));
                    int i41 = 0;
                    while (i41 < i40) {
                        r11.OooO00o(new C6487lIIiIlL(r39[i32].m21416OooO00o()[i39].m15245OooO00o()[i41 + 3]));
                        i41++;
                        r46 = r46;
                    }
                    r10.OooO00o(new C5707LiL1(r11));
                    r11 = new iILLL1();
                    iILLL1 r152 = r5;
                    r122.OooO00o(new C6513lIiI((long) r39[i32].m21416OooO00o()[i39].m15244OooO00o()[0]));
                    r122.OooO00o(new C6513lIiI((long) i40));
                    r122.OooO00o(new C6513lIiI((long) r39[i32].m21416OooO00o()[i39].m15244OooO00o()[2]));
                    r122.OooO00o(new C6513lIiI((long) r39[i32].m21416OooO00o()[i39].m15244OooO00o()[3]));
                    r122.OooO00o(new C6513lIiI((long) r39[i32].m21416OooO00o()[i39].m15244OooO00o()[4]));
                    r122.OooO00o(new C6513lIiI((long) r39[i32].m21416OooO00o()[i39].m15244OooO00o()[5]));
                    int i42 = 0;
                    while (i42 < i40) {
                        r122.OooO00o(new C6513lIiI((long) r39[i32].m21416OooO00o()[i39].m15244OooO00o()[i42 + 6]));
                        i42++;
                        i40 = i40;
                        r152 = r152;
                    }
                    r10.OooO00o(new C5707LiL1(r122));
                    r122 = new iILLL1();
                    r62.OooO00o(new C5707LiL1(r10));
                    r10 = new iILLL1();
                    i39++;
                    r37 = r37;
                    r46 = r46;
                    r5 = r152;
                }
            }
            r115.OooO00o(new C5707LiL1(r62));
            r62 = new iILLL1();
            iILLL1 r38 = new iILLL1();
            if (r39[i32].m21417OooO00o() != null) {
                for (int i43 = 0; i43 < r39[i32].m21417OooO00o().length; i43++) {
                    for (int i44 = 0; i44 < r39[i32].m21417OooO00o()[i43].size(); i44++) {
                        r38.OooO00o(new C6487lIIiIlL((byte[]) r39[i32].m21417OooO00o()[i43].elementAt(i44)));
                    }
                    r7.OooO00o(new C5707LiL1(r38));
                    r38 = new iILLL1();
                }
            }
            r115.OooO00o(new C5707LiL1(r7));
            r7 = new iILLL1();
            r017.OooO00o(new C5707LiL1(r115));
            r115 = new iILLL1();
            i32++;
            r36 = r37;
            r45 = r46;
            r5 = r5;
        }
        r5.OooO00o(new C5707LiL1(r017));
        iILLL1 r116 = new iILLL1();
        for (byte[] bArr11 : bArr7) {
            r116.OooO00o(new C6487lIIiIlL(bArr11));
        }
        r5.OooO00o(new C5707LiL1(r116));
        iILLL1 r117 = new iILLL1();
        iILLL1 r310 = new iILLL1();
        new iILLL1();
        iILLL1 r47 = new iILLL1();
        iILLL1 r52 = new iILLL1();
        for (int i45 = 0; i45 < r41.length; i45++) {
            r310.OooO00o(new C5707LiL1(r43[0]));
            new iILLL1();
            r47.OooO00o(new C6487lIIiIlL(r41[i45].m17185OooO00o()[0]));
            r47.OooO00o(new C6487lIIiIlL(r41[i45].m17185OooO00o()[1]));
            r47.OooO00o(new C6487lIIiIlL(r41[i45].m17185OooO00o()[2]));
            r47.OooO00o(new C6487lIIiIlL(r41[i45].m17185OooO00o()[3]));
            r47.OooO00o(new C6487lIIiIlL(r41[i45].m17185OooO00o()[4]));
            r310.OooO00o(new C5707LiL1(r47));
            r47 = new iILLL1();
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[0]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[1]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[2]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[3]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[4]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[5]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[6]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[7]));
            r52.OooO00o(new C6513lIiI((long) r41[i45].m17184OooO00o()[8]));
            r310.OooO00o(new C5707LiL1(r52));
            r52 = new iILLL1();
            r117.OooO00o(new C5707LiL1(r310));
            r310 = new iILLL1();
        }
        r5.OooO00o(new C5707LiL1(r117));
        iILLL1 r118 = new iILLL1();
        iILLL1 r311 = new iILLL1();
        iILLL1 r48 = new iILLL1();
        iILLL1 r53 = new iILLL1();
        for (int i46 = 0; i46 < r42.m16250OooO00o().length; i46++) {
            r311.OooO00o(new C6513lIiI((long) r42.m16250OooO00o()[i46]));
            r48.OooO00o(new C6513lIiI((long) r42.OooO0OO()[i46]));
            r53.OooO00o(new C6513lIiI((long) r42.OooO0O0()[i46]));
        }
        r118.OooO00o(new C6513lIiI((long) r42.OooO00o()));
        r118.OooO00o(new C5707LiL1(r311));
        r118.OooO00o(new C5707LiL1(r48));
        r118.OooO00o(new C5707LiL1(r53));
        r5.OooO00o(new C5707LiL1(r118));
        iILLL1 r119 = new iILLL1();
        for (C6456l1ilL r49 : r43) {
            r119.OooO00o(r49);
        }
        r5.OooO00o(new C5707LiL1(r119));
        return new C5707LiL1(r5);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
