package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨iLlI丨  reason: invalid class name and case insensitive filesystem */
public class C9611iLlI implements i1IIi1 {
    public static final byte[] OooO0O0 = Strings.m22985OooO00o("expand 32-byte k");
    public static final byte[] OooO0OO = Strings.m22985OooO00o("expand 16-byte k");

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f23188OooO0OO = AbstractC6464l1l.OooO00o(Strings.m22985OooO00o("expand 16-byte kexpand 32-byte k"), 0, 8);
    public static final int OooO0o = 20;
    public static final int OooO0oO = 16;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23189OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23190OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f23191OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f23192OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f23193OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f23194OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public C9611iLlI() {
        this(20);
    }

    public C9611iLlI(int i) {
        this.f23192OooO0O0 = 0;
        this.f23191OooO00o = new int[16];
        this.f23193OooO0O0 = new int[16];
        this.f23190OooO00o = new byte[64];
        this.f23189OooO00o = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.OooO00o = i;
    }

    public static int OooO00o(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static void OooO00o(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            int i6 = iArr[4];
            int i7 = iArr[5];
            int i8 = iArr[6];
            int i9 = 7;
            int i10 = iArr[7];
            int i11 = iArr[8];
            int i12 = 9;
            int i13 = iArr[9];
            int i14 = iArr[10];
            int i15 = iArr[11];
            int i16 = iArr[12];
            int i17 = 13;
            int i18 = iArr[13];
            int i19 = iArr[14];
            int i20 = iArr[15];
            int i21 = i19;
            int i22 = i18;
            int i23 = i16;
            int i24 = i15;
            int i25 = i14;
            int i26 = i13;
            int i27 = i11;
            int i28 = i10;
            int i29 = i8;
            int i30 = i7;
            int i31 = i6;
            int i32 = i5;
            int i33 = i4;
            int i34 = i3;
            int i35 = i2;
            for (int i36 = i; i36 > 0; i36 -= 2) {
                int OooO00o2 = OooO00o(i35 + i23, i9) ^ i31;
                int OooO00o3 = i27 ^ OooO00o(OooO00o2 + i35, i12);
                int OooO00o4 = i23 ^ OooO00o(OooO00o3 + OooO00o2, i17);
                int OooO00o5 = OooO00o(OooO00o4 + OooO00o3, 18) ^ i35;
                int OooO00o6 = i26 ^ OooO00o(i30 + i34, i9);
                int OooO00o7 = i22 ^ OooO00o(OooO00o6 + i30, i12);
                int OooO00o8 = i34 ^ OooO00o(OooO00o7 + OooO00o6, i17);
                int OooO00o9 = OooO00o(OooO00o8 + OooO00o7, 18) ^ i30;
                int OooO00o10 = i21 ^ OooO00o(i25 + i29, 7);
                int OooO00o11 = i33 ^ OooO00o(OooO00o10 + i25, 9);
                int OooO00o12 = i29 ^ OooO00o(OooO00o11 + OooO00o10, 13);
                int OooO00o13 = i25 ^ OooO00o(OooO00o12 + OooO00o11, 18);
                int OooO00o14 = i32 ^ OooO00o(i20 + i24, 7);
                int OooO00o15 = i28 ^ OooO00o(OooO00o14 + i20, 9);
                int OooO00o16 = i24 ^ OooO00o(OooO00o15 + OooO00o14, 13);
                int OooO00o17 = i20 ^ OooO00o(OooO00o16 + OooO00o15, 18);
                i34 = OooO00o8 ^ OooO00o(OooO00o5 + OooO00o14, 7);
                i33 = OooO00o11 ^ OooO00o(i34 + OooO00o5, 9);
                int OooO00o18 = OooO00o14 ^ OooO00o(i33 + i34, 13);
                int OooO00o19 = OooO00o5 ^ OooO00o(OooO00o18 + i33, 18);
                i29 = OooO00o12 ^ OooO00o(OooO00o9 + OooO00o2, 7);
                i28 = OooO00o15 ^ OooO00o(i29 + OooO00o9, 9);
                int OooO00o20 = OooO00o(i28 + i29, 13) ^ OooO00o2;
                i30 = OooO00o9 ^ OooO00o(OooO00o20 + i28, 18);
                i24 = OooO00o16 ^ OooO00o(OooO00o13 + OooO00o6, 7);
                int OooO00o21 = OooO00o(i24 + OooO00o13, 9) ^ OooO00o3;
                i26 = OooO00o6 ^ OooO00o(OooO00o21 + i24, 13);
                i25 = OooO00o13 ^ OooO00o(i26 + OooO00o21, 18);
                i23 = OooO00o4 ^ OooO00o(OooO00o17 + OooO00o10, 7);
                i22 = OooO00o7 ^ OooO00o(i23 + OooO00o17, 9);
                i21 = OooO00o10 ^ OooO00o(i22 + i23, 13);
                i20 = OooO00o17 ^ OooO00o(i21 + i22, 18);
                i32 = OooO00o18;
                i27 = OooO00o21;
                i35 = OooO00o19;
                i31 = OooO00o20;
                i17 = 13;
                i12 = 9;
                i9 = 7;
            }
            iArr2[0] = i35 + iArr[0];
            iArr2[1] = i34 + iArr[1];
            iArr2[2] = i33 + iArr[2];
            iArr2[3] = i32 + iArr[3];
            iArr2[4] = i31 + iArr[4];
            iArr2[5] = i30 + iArr[5];
            iArr2[6] = i29 + iArr[6];
            iArr2[7] = i28 + iArr[7];
            iArr2[8] = i27 + iArr[8];
            iArr2[9] = i26 + iArr[9];
            iArr2[10] = i25 + iArr[10];
            iArr2[11] = i24 + iArr[11];
            iArr2[12] = i23 + iArr[12];
            iArr2[13] = i22 + iArr[13];
            iArr2[14] = i21 + iArr[14];
            iArr2[15] = i20 + iArr[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.I1LLllll
    private boolean OooO00o() {
        int i = this.f23194OooO0OO + 1;
        this.f23194OooO0OO = i;
        if (i == 0) {
            int i2 = this.OooO0Oo + 1;
            this.OooO0Oo = i2;
            if (i2 == 0) {
                int i3 = this.OooO0o0 + 1;
                this.OooO0o0 = i3;
                return (i3 & 32) != 0;
            }
        }
        return false;
    }

    private boolean OooO00o(int i) {
        int i2 = this.f23194OooO0OO + i;
        this.f23194OooO0OO = i2;
        if (i2 >= i || i2 < 0) {
            return false;
        }
        int i3 = this.OooO0Oo + 1;
        this.OooO0Oo = i3;
        if (i3 != 0) {
            return false;
        }
        int i4 = this.OooO0o0 + 1;
        this.OooO0o0 = i4;
        return (i4 & 32) != 0;
    }

    private void OooO0Oo() {
        this.f23194OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        if (!OooO00o()) {
            byte[] bArr = this.f23190OooO00o;
            int i = this.f23192OooO0O0;
            byte b2 = (byte) (b ^ bArr[i]);
            int i2 = (i + 1) & 63;
            this.f23192OooO0O0 = i2;
            if (i2 == 0) {
                m21672OooO00o();
                OooO00o(this.f23190OooO00o);
            }
            return b2;
        }
        throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m21669OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f23189OooO00o) {
            throw new IllegalStateException(m21671OooO00o() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (!OooO00o(i2)) {
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr3 = this.f23190OooO00o;
                int i5 = this.f23192OooO0O0;
                bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
                int i6 = (i5 + 1) & 63;
                this.f23192OooO0O0 = i6;
                if (i6 == 0) {
                    m21672OooO00o();
                    OooO00o(this.f23190OooO00o);
                }
            }
            return i2;
        } else {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m21670OooO00o() {
        return (OooO0O0() * 64) + ((long) this.f23192OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1
    public long OooO00o(long j) {
        reset();
        return skip(j);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21671OooO00o() {
        if (this.OooO00o == 20) {
            return "Salsa20";
        }
        return "Salsa20" + C8932ooOOO0o.OooO0OO + this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21672OooO00o() {
        int[] iArr = this.f23191OooO00o;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void OooO00o(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        int[] iArr2 = f23188OooO0OO;
        iArr[i2] = iArr2[i3];
        iArr[i2 + 1] = iArr2[i3 + 1];
        iArr[i2 + 2] = iArr2[i3 + 2];
        iArr[i2 + 3] = iArr2[i3 + 3];
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21673OooO00o(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            int[] iArr = this.f23191OooO00o;
            iArr[9] = iArr[9] + i;
        }
        int[] iArr2 = this.f23191OooO00o;
        int i3 = iArr2[8];
        iArr2[8] = iArr2[8] + i2;
        if (i3 != 0 && iArr2[8] < i3) {
            iArr2[9] = iArr2[9] + 1;
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r42 = (C6274iilL1L) r4;
            byte[] OooO00o2 = r42.m17301OooO00o();
            if (OooO00o2 == null || OooO00o2.length != m21669OooO00o()) {
                throw new IllegalArgumentException(m21671OooO00o() + " requires exactly " + m21669OooO00o() + " bytes of IV");
            }
            AbstractC6370iIIIl OooO00o3 = r42.OooO00o();
            if (OooO00o3 == null) {
                if (this.f23189OooO00o) {
                    OooO00o((byte[]) null, OooO00o2);
                } else {
                    throw new IllegalStateException(m21671OooO00o() + " KeyParameter can not be null for first initialisation");
                }
            } else if (OooO00o3 instanceof C6642li1LI) {
                OooO00o(((C6642li1LI) OooO00o3).OooO00o(), OooO00o2);
            } else {
                throw new IllegalArgumentException(m21671OooO00o() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            reset();
            this.f23189OooO00o = true;
            return;
        }
        throw new IllegalArgumentException(m21671OooO00o() + " Init parameters must include an IV");
    }

    public void OooO00o(byte[] bArr) {
        OooO00o(this.OooO00o, this.f23191OooO00o, this.f23193OooO0O0);
        AbstractC6464l1l.OooO0O0(this.f23193OooO0O0, bArr, 0);
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 16 || bArr.length == 32) {
                int length = (bArr.length - 16) / 4;
                int[] iArr = this.f23191OooO00o;
                int[] iArr2 = f23188OooO0OO;
                iArr[0] = iArr2[length];
                iArr[5] = iArr2[length + 1];
                iArr[10] = iArr2[length + 2];
                iArr[15] = iArr2[length + 3];
                AbstractC6464l1l.OooO00o(bArr, 0, iArr, 1, 4);
                AbstractC6464l1l.OooO00o(bArr, bArr.length - 16, this.f23191OooO00o, 11, 4);
            } else {
                throw new IllegalArgumentException(m21671OooO00o() + " requires 128 bit or 256 bit key");
            }
        }
        AbstractC6464l1l.OooO00o(bArr2, 0, this.f23191OooO00o, 6, 2);
    }

    public long OooO0O0() {
        int[] iArr = this.f23191OooO00o;
        return (((long) iArr[9]) << 32) | (((long) iArr[8]) & 4294967295L);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21674OooO0O0() {
        int[] iArr = this.f23191OooO00o;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void OooO0O0(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            int[] iArr = this.f23191OooO00o;
            if ((((long) iArr[9]) & 4294967295L) >= (((long) i) & 4294967295L)) {
                iArr[9] = iArr[9] - i;
            } else {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }
        int[] iArr2 = this.f23191OooO00o;
        if ((((long) iArr2[8]) & 4294967295L) >= (4294967295L & ((long) i2))) {
            iArr2[8] = iArr2[8] - i2;
        } else if (iArr2[9] != 0) {
            iArr2[9] = iArr2[9] - 1;
            iArr2[8] = iArr2[8] - i2;
        } else {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
    }

    public void OooO0OO() {
        int[] iArr = this.f23191OooO00o;
        if (iArr[8] == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int[] iArr2 = this.f23191OooO00o;
        int i = iArr2[8] - 1;
        iArr2[8] = i;
        if (i == -1) {
            iArr2[9] = iArr2[9] - 1;
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        this.f23192OooO0O0 = 0;
        OooO0Oo();
        m21674OooO0O0();
        OooO00o(this.f23190OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1
    public long skip(long j) {
        long j2;
        if (j >= 0) {
            if (j >= 64) {
                long j3 = j / 64;
                m21673OooO00o(j3);
                j2 = j - (j3 * 64);
            } else {
                j2 = j;
            }
            int i = this.f23192OooO0O0;
            int i2 = (((int) j2) + i) & 63;
            this.f23192OooO0O0 = i2;
            if (i2 < i) {
                m21672OooO00o();
            }
        } else {
            long j4 = -j;
            if (j4 >= 64) {
                long j5 = j4 / 64;
                OooO0O0(j5);
                j4 -= j5 * 64;
            }
            for (long j6 = 0; j6 < j4; j6++) {
                if (this.f23192OooO0O0 == 0) {
                    OooO0OO();
                }
                this.f23192OooO0O0 = (this.f23192OooO0O0 - 1) & 63;
            }
        }
        OooO00o(this.f23190OooO00o);
        return j;
    }
}
