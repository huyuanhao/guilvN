package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;

/* renamed from: com.pd.sdk.ilL  reason: case insensitive filesystem */
public class C6312ilL implements AbstractC6863liiI {
    public static final long OooO0O0 = 2147483648L;
    public static final long OooO0OO = 140737488355328L;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final byte[] f18008OooO0OO = C6472l1l1l.OooO00o("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    public static final int OooO0Oo = 4096;
    public static final int OooO0o0 = 262144;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18009OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5552Iil f18010OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f18011OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18012OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18013OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f18014OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18015OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f18016OooO0OO;

    public C6312ilL(li1l11I1 li1l11i1, int i, int i2, AbstractC5552Iil r6, byte[] bArr, byte[] bArr2) {
        this.f18010OooO00o = r6;
        this.f18011OooO00o = li1l11i1;
        this.OooO00o = i;
        this.f18016OooO0OO = i2;
        this.f18014OooO0O0 = (li1l11i1.OooO00o() * 8) + i;
        this.f18012OooO00o = OooO00o(li1l11i1);
        if (i2 > 256) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        } else if (OooO00o(li1l11i1, i) < i2) {
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        } else if (r6.OooO00o() >= i2) {
            OooO00o(OooO00o(), bArr2, bArr);
        } else {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
    }

    private int OooO00o(li1l11I1 li1l11i1, int i) {
        if (OooO00o(li1l11i1) && i == 168) {
            return 112;
        }
        if (li1l11i1.m17732OooO00o().equals("AES")) {
            return i;
        }
        return -1;
    }

    private void OooO00o(byte[] bArr, int i, int i2) {
        bArr[i2 + 0] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = i + 0;
        bArr2[i2 + 0] = (byte) (bArr[i3] & 254);
        int i4 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i3] << 7) | ((bArr[i4] & C5576L11i.OooO00o) >>> 1));
        int i5 = i + 2;
        bArr2[i2 + 2] = (byte) ((bArr[i4] << 6) | ((bArr[i5] & 248) >>> 2));
        int i6 = i + 3;
        bArr2[i2 + 3] = (byte) ((bArr[i5] << 5) | ((bArr[i6] & 240) >>> 3));
        int i7 = i + 4;
        bArr2[i2 + 4] = (byte) ((bArr[i6] << 4) | ((bArr[i7] & C3571am.f9205k) >>> 4));
        int i8 = i + 5;
        bArr2[i2 + 5] = (byte) ((bArr[i7] << 3) | ((bArr[i8] & ExifInterface.OooO0Oo) >>> 5));
        int i9 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i8] << 2) | ((bArr[i9] & O0O00O.OooO00o) >>> 6));
        int i10 = i2 + 7;
        bArr2[i10] = (byte) (bArr[i9] << 1);
        while (i2 <= i10) {
            byte b = bArr2[i2];
            bArr2[i2] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
            i2++;
        }
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] OooO00o2 = OooO00o(C9586iIILl.OooO00o(bArr, bArr2, bArr3), this.f18014OooO0O0);
        int OooO00o3 = this.f18011OooO00o.OooO00o();
        byte[] bArr4 = new byte[((this.OooO00o + 7) / 8)];
        this.f18013OooO00o = bArr4;
        byte[] bArr5 = new byte[OooO00o3];
        this.f18015OooO0O0 = bArr5;
        OooO0O0(OooO00o2, bArr4, bArr5);
        this.f18009OooO00o = 1;
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr2[i2] ^ bArr3[i2 + i]);
        }
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int OooO00o2 = this.f18011OooO00o.OooO00o();
        byte[] bArr5 = new byte[OooO00o2];
        int length = bArr4.length / OooO00o2;
        byte[] bArr6 = new byte[OooO00o2];
        this.f18011OooO00o.OooO00o(true, new C6642li1LI(m17354OooO00o(bArr2)));
        this.f18011OooO00o.OooO00o(bArr3, 0, bArr5, 0);
        for (int i = 0; i < length; i++) {
            OooO00o(bArr6, bArr5, bArr4, i * OooO00o2);
            this.f18011OooO00o.OooO00o(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private boolean OooO00o(li1l11I1 li1l11i1) {
        return li1l11i1.m17732OooO00o().equals("DESede") || li1l11i1.m17732OooO00o().equals("TDEA");
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    private byte[] OooO00o() {
        byte[] OooO00o2 = this.f18010OooO00o.m15831OooO00o();
        if (OooO00o2.length >= (this.f18016OooO0OO + 7) / 8) {
            return OooO00o2;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private byte[] OooO00o(byte[] bArr, int i) {
        int OooO00o2 = this.f18011OooO00o.OooO00o();
        int length = bArr.length;
        int i2 = i / 8;
        int i3 = length + 8;
        byte[] bArr2 = new byte[(((((i3 + 1) + OooO00o2) - 1) / OooO00o2) * OooO00o2)];
        OooO00o(bArr2, length, 0);
        OooO00o(bArr2, i2, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[i3] = O0O00O.OooO00o;
        int i4 = this.OooO00o;
        int i5 = (i4 / 8) + OooO00o2;
        byte[] bArr3 = new byte[i5];
        byte[] bArr4 = new byte[OooO00o2];
        byte[] bArr5 = new byte[OooO00o2];
        int i6 = i4 / 8;
        byte[] bArr6 = new byte[i6];
        System.arraycopy(f18008OooO0OO, 0, bArr6, 0, i6);
        int i7 = 0;
        while (true) {
            int i8 = i7 * OooO00o2;
            if (i8 * 8 >= this.OooO00o + (OooO00o2 * 8)) {
                break;
            }
            OooO00o(bArr5, i7, 0);
            OooO00o(bArr4, bArr6, bArr5, bArr2);
            int i9 = i5 - i8;
            if (i9 > OooO00o2) {
                i9 = OooO00o2;
            }
            System.arraycopy(bArr4, 0, bArr3, i8, i9);
            i7++;
        }
        byte[] bArr7 = new byte[OooO00o2];
        System.arraycopy(bArr3, 0, bArr6, 0, i6);
        System.arraycopy(bArr3, i6, bArr7, 0, OooO00o2);
        byte[] bArr8 = new byte[i2];
        this.f18011OooO00o.OooO00o(true, new C6642li1LI(m17354OooO00o(bArr6)));
        int i10 = 0;
        while (true) {
            int i11 = i10 * OooO00o2;
            if (i11 >= i2) {
                return bArr8;
            }
            this.f18011OooO00o.OooO00o(bArr7, 0, bArr7, 0);
            int i12 = i2 - i11;
            if (i12 > OooO00o2) {
                i12 = OooO00o2;
            }
            System.arraycopy(bArr7, 0, bArr8, i11, i12);
            i10++;
        }
    }

    private void OooO0O0(byte[] bArr) {
        OooO0O0(OooO00o(C9586iIILl.m21645OooO0O0(OooO00o(), bArr), this.f18014OooO0O0), this.f18013OooO00o, this.f18015OooO0O0);
        this.f18009OooO00o = 1;
    }

    private void OooO0O0(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this.f18011OooO00o.OooO00o()];
        int OooO00o2 = this.f18011OooO00o.OooO00o();
        this.f18011OooO00o.OooO00o(true, new C6642li1LI(m17354OooO00o(bArr2)));
        int i = 0;
        while (true) {
            int i2 = i * OooO00o2;
            if (i2 < bArr.length) {
                OooO0OO(bArr3);
                this.f18011OooO00o.OooO00o(bArr3, 0, bArr5, 0);
                int i3 = length - i2;
                if (i3 > OooO00o2) {
                    i3 = OooO00o2;
                }
                System.arraycopy(bArr5, 0, bArr4, i2, i3);
                i++;
            } else {
                OooO00o(bArr4, bArr, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            }
        }
    }

    private void OooO0OO(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17353OooO00o() {
        return this.f18015OooO0O0.length * 8;
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    public int OooO00o(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArr3;
        boolean z2 = this.f18012OooO00o;
        long j = this.f18009OooO00o;
        if (z2) {
            if (j > 2147483648L) {
                return -1;
            }
            if (C9510Lii1L.OooO00o(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else if (j > 140737488355328L) {
            return -1;
        } else {
            if (C9510Lii1L.OooO00o(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z) {
            OooO0O0(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArr3 = OooO00o(bArr2, this.f18014OooO0O0);
            OooO0O0(bArr3, this.f18013OooO00o, this.f18015OooO0O0);
        } else {
            bArr3 = new byte[(this.f18014OooO0O0 / 8)];
        }
        int length = this.f18015OooO0O0.length;
        byte[] bArr4 = new byte[length];
        this.f18011OooO00o.OooO00o(true, new C6642li1LI(m17354OooO00o(this.f18013OooO00o)));
        for (int i = 0; i <= bArr.length / length; i++) {
            int i2 = i * length;
            int length2 = bArr.length - i2 > length ? length : bArr.length - (this.f18015OooO0O0.length * i);
            if (length2 != 0) {
                OooO0OO(this.f18015OooO0O0);
                this.f18011OooO00o.OooO00o(this.f18015OooO0O0, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr, i2, length2);
            }
        }
        OooO0O0(bArr3, this.f18013OooO00o, this.f18015OooO0O0);
        this.f18009OooO00o++;
        return bArr.length * 8;
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    public void OooO00o(byte[] bArr) {
        OooO0O0(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17354OooO00o(byte[] bArr) {
        if (!this.f18012OooO00o) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        OooO00o(bArr, 0, bArr2, 0);
        OooO00o(bArr, 7, bArr2, 8);
        OooO00o(bArr, 14, bArr2, 16);
        return bArr2;
    }
}
