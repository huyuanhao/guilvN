package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨I丨il丨  reason: invalid class name and case insensitive filesystem */
public class C9446Iil implements l1lILl {
    public static final int OooO0O0 = 65536;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5592L1llII f22994OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLL1 f22995OooO00o = new LLLL1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f22996OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f22997OooO00o;

    @Override // com.p118pd.sdk.l1lILl
    private short[] OooO00o(byte[] bArr) {
        int i = this.OooO00o;
        short[] sArr = new short[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            sArr[i2] = (short) bArr[i3];
            sArr[i2] = (short) (sArr[i2] & 255);
            i3++;
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return sArr;
    }

    private short[] OooO00o(C6179iLiL[] ililArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] OooO00o2 = this.f22995OooO00o.OooO00o(((iiLIiL) this.f22994OooO00o).m17256OooO00o(), this.f22995OooO00o.OooO00o(((iiLIiL) this.f22994OooO00o).m17255OooO00o(), sArr));
        for (int i = 0; i < ililArr[0].OooO0O0(); i++) {
            this.f22997OooO00o[i] = (short) this.f22996OooO00o.nextInt();
            short[] sArr3 = this.f22997OooO00o;
            sArr3[i] = (short) (sArr3[i] & 255);
        }
        return OooO00o2;
    }

    private short[] OooO00o(short[] sArr) {
        short[][] OooO00o2 = ((C6195iLllLLIi) this.f22994OooO00o).m17167OooO00o();
        short[][] OooO0O02 = ((C6195iLllLLIi) this.f22994OooO00o).OooO0O0();
        short[] OooO00o3 = ((C6195iLllLLIi) this.f22994OooO00o).OooO00o();
        short[] sArr2 = new short[OooO00o2.length];
        int length = OooO0O02[0].length;
        for (int i = 0; i < OooO00o2.length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                for (int i4 = i3; i4 < length; i4++) {
                    sArr2[i] = C6275iili.OooO00o(sArr2[i], C6275iili.OooO0O0(OooO00o2[i][i2], C6275iili.OooO0O0(sArr[i3], sArr[i4])));
                    i2++;
                }
                sArr2[i] = C6275iili.OooO00o(sArr2[i], C6275iili.OooO0O0(OooO0O02[i][i3], sArr[i3]));
            }
            sArr2[i] = C6275iili.OooO00o(sArr2[i], OooO00o3[i]);
        }
        return sArr2;
    }

    @Override // com.p118pd.sdk.l1lILl
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        C5592L1llII r22;
        if (!z) {
            r22 = (C6195iLllLLIi) r2;
        } else if (r2 instanceof liLL1l) {
            liLL1l r23 = (liLL1l) r2;
            this.f22996OooO00o = r23.m17752OooO00o();
            this.f22994OooO00o = (iiLIiL) r23.OooO00o();
            this.OooO00o = this.f22994OooO00o.OooO00o();
        } else {
            this.f22996OooO00o = IIllii.OooO00o();
            r22 = (iiLIiL) r2;
        }
        this.f22994OooO00o = r22;
        this.OooO00o = this.f22994OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.l1lILl
    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        for (int i = 0; i < bArr2.length; i++) {
            sArr[i] = (short) (((short) bArr2[i]) & 255);
        }
        short[] OooO00o2 = OooO00o(bArr);
        short[] OooO00o3 = OooO00o(sArr);
        if (OooO00o2.length != OooO00o3.length) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < OooO00o2.length; i2++) {
            z = z && OooO00o2[i2] == OooO00o3[i2];
        }
        return z;
    }

    @Override // com.p118pd.sdk.l1lILl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21485OooO00o(byte[] bArr) {
        boolean z;
        C6179iLiL[] OooO00o2 = ((iiLIiL) this.f22994OooO00o).m17254OooO00o();
        int length = OooO00o2.length;
        this.f22997OooO00o = new short[((iiLIiL) this.f22994OooO00o).m17257OooO0O0().length];
        int OooO0OO = OooO00o2[length - 1].OooO0OO();
        byte[] bArr2 = new byte[OooO0OO];
        short[] OooO00o3 = OooO00o(bArr);
        int i = 0;
        do {
            try {
                short[] OooO00o4 = OooO00o(OooO00o2, OooO00o3);
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    short[] sArr = new short[OooO00o2[i3].OooO00o()];
                    short[] sArr2 = new short[OooO00o2[i3].OooO00o()];
                    for (int i4 = 0; i4 < OooO00o2[i3].OooO00o(); i4++) {
                        sArr[i4] = OooO00o4[i2];
                        i2++;
                    }
                    short[] OooO0O02 = this.f22995OooO00o.OooO0O0(OooO00o2[i3].OooO00o(this.f22997OooO00o), sArr);
                    if (OooO0O02 != null) {
                        for (int i5 = 0; i5 < OooO0O02.length; i5++) {
                            this.f22997OooO00o[OooO00o2[i3].OooO0O0() + i5] = OooO0O02[i5];
                        }
                    } else {
                        throw new Exception("LES is not solveable!");
                    }
                }
                short[] OooO00o5 = this.f22995OooO00o.OooO00o(((iiLIiL) this.f22994OooO00o).m17257OooO0O0(), this.f22995OooO00o.OooO00o(((iiLIiL) this.f22994OooO00o).OooO0O0(), this.f22997OooO00o));
                for (int i6 = 0; i6 < OooO0OO; i6++) {
                    bArr2[i6] = (byte) OooO00o5[i6];
                }
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        } while (i < 65536);
        if (i != 65536) {
            return bArr2;
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }
}
