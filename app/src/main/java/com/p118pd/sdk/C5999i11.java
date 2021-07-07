package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import java.util.Vector;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.i11  reason: case insensitive filesystem */
public class C5999i11 implements LLLi1iII {
    public static final int OooO0Oo = 16;
    public byte[] OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f17313OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f17314OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f17315OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17316OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17317OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f17318OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public li1l11I1 f17319OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17320OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17321OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f17322OooO0Oo = null;
    public byte[] OooO0o = new byte[16];
    public byte[] OooO0o0 = new byte[24];
    public byte[] OooO0oO;
    public byte[] OooO0oo;
    public byte[] OooOO0;
    public byte[] OooOO0O = new byte[16];
    public byte[] OooOO0o;
    public byte[] OooOOO0;

    public C5999i11(li1l11I1 li1l11i1, li1l11I1 li1l11i12) {
        if (li1l11i1 == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        } else if (li1l11i1.OooO00o() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        } else if (li1l11i12 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        } else if (li1l11i12.OooO00o() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        } else if (li1l11i1.m17732OooO00o().equals(li1l11i12.m17732OooO00o())) {
            this.f17314OooO00o = li1l11i1;
            this.f17319OooO0O0 = li1l11i12;
        } else {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
    }

    public static int OooO00o(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>>= 1;
        }
        return i;
    }

    public static int OooO00o(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m16836OooO00o(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public static byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - OooO00o(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OooO0O0(byte[] bArr, int i) {
        bArr[i] = O0O00O.OooO00o;
        while (true) {
            i++;
            if (i < 16) {
                bArr[i] = 0;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException {
        byte[] bArr2 = this.OooO0oo;
        int i2 = this.OooO0OO;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.OooO0OO = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        m16841OooO00o(bArr, i);
        return 16;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(int i) {
        int i2 = i + this.OooO0OO;
        if (this.f17316OooO00o) {
            return i2 + this.OooO00o;
        }
        int i3 = this.OooO00o;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16837OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.OooO00o << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i2 = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & ExifInterface.OooO0Oo);
        byte[] bArr3 = this.f17322OooO0Oo;
        if (bArr3 == null || !C9586iIILl.m21627OooO00o(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.f17322OooO0Oo = bArr2;
            this.f17314OooO00o.OooO00o(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.OooO0o0, 0, 16);
            while (i < 8) {
                byte[] bArr5 = this.OooO0o0;
                int i3 = i + 16;
                byte b = bArr4[i];
                i++;
                bArr5[i3] = (byte) (b ^ bArr4[i]);
            }
        }
        return i2;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        if (!this.f17316OooO00o) {
            int i2 = this.OooO0OO;
            int i3 = this.OooO00o;
            if (i2 >= i3) {
                int i4 = i2 - i3;
                this.OooO0OO = i4;
                bArr2 = new byte[i3];
                System.arraycopy(this.OooO0oo, i4, bArr2, 0, i3);
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        } else {
            bArr2 = null;
        }
        int i5 = this.OooO0O0;
        if (i5 > 0) {
            OooO0O0(this.OooO0oO, i5);
            OooO0O0(this.f17320OooO0O0);
        }
        int i6 = this.OooO0OO;
        if (i6 > 0) {
            if (this.f17316OooO00o) {
                OooO0O0(this.OooO0oo, i6);
                m16836OooO00o(this.OooOO0o, this.OooO0oo);
            }
            m16836OooO00o(this.OooOO0O, this.f17320OooO0O0);
            byte[] bArr3 = new byte[16];
            this.f17314OooO00o.OooO00o(this.OooOO0O, 0, bArr3, 0);
            m16836OooO00o(this.OooO0oo, bArr3);
            int length = bArr.length;
            int i7 = this.OooO0OO;
            if (length >= i + i7) {
                System.arraycopy(this.OooO0oo, 0, bArr, i, i7);
                if (!this.f17316OooO00o) {
                    OooO0O0(this.OooO0oo, this.OooO0OO);
                    m16836OooO00o(this.OooOO0o, this.OooO0oo);
                }
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        }
        m16836OooO00o(this.OooOO0o, this.OooOO0O);
        m16836OooO00o(this.OooOO0o, this.f17321OooO0OO);
        li1l11I1 li1l11i1 = this.f17314OooO00o;
        byte[] bArr4 = this.OooOO0o;
        li1l11i1.OooO00o(bArr4, 0, bArr4, 0);
        m16836OooO00o(this.OooOO0o, this.OooOO0);
        int i8 = this.OooO00o;
        byte[] bArr5 = new byte[i8];
        this.OooOOO0 = bArr5;
        System.arraycopy(this.OooOO0o, 0, bArr5, 0, i8);
        int i9 = this.OooO0OO;
        if (this.f17316OooO00o) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.OooO00o;
            if (length2 >= i10 + i11) {
                System.arraycopy(this.OooOOO0, 0, bArr, i10, i11);
                i9 += this.OooO00o;
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (!C9586iIILl.OooO0O0(this.OooOOO0, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        OooO00o(false);
        return i9;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr3 = this.OooO0oo;
                int i6 = this.OooO0OO;
                bArr3[i6] = bArr[i + i5];
                int i7 = i6 + 1;
                this.OooO0OO = i7;
                if (i7 == bArr3.length) {
                    m16841OooO00o(bArr2, i3 + i4);
                    i4 += 16;
                }
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    public li1l11I1 OooO00o() {
        return this.f17319OooO0O0;
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16838OooO00o() {
        return this.f17319OooO0O0.m17732OooO00o() + "/OCB";
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16839OooO00o() {
        long j = this.f17313OooO00o + 1;
        this.f17313OooO00o = j;
        OooO0O0(m16843OooO00o(OooO00o(j)));
        this.OooO0O0 = 0;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte b) {
        byte[] bArr = this.OooO0oO;
        int i = this.OooO0O0;
        bArr[i] = b;
        int i2 = i + 1;
        this.OooO0O0 = i2;
        if (i2 == bArr.length) {
            m16839OooO00o();
        }
    }

    public void OooO00o(boolean z) {
        this.f17314OooO00o.reset();
        this.f17319OooO0O0.reset();
        m16840OooO00o(this.OooO0oO);
        m16840OooO00o(this.OooO0oo);
        this.OooO0O0 = 0;
        this.OooO0OO = 0;
        this.f17313OooO00o = 0;
        this.f17318OooO0O0 = 0;
        m16840OooO00o(this.OooO);
        m16840OooO00o(this.OooOO0);
        System.arraycopy(this.OooO0o, 0, this.OooOO0O, 0, 16);
        m16840OooO00o(this.OooOO0o);
        if (z) {
            this.OooOOO0 = null;
        }
        byte[] bArr = this.f17317OooO00o;
        if (bArr != null) {
            OooO00o(bArr, 0, bArr.length);
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(boolean z, AbstractC6370iIIIl r10) throws IllegalArgumentException {
        C6642li1LI r102;
        byte[] bArr;
        boolean z2 = this.f17316OooO00o;
        this.f17316OooO00o = z;
        this.OooOOO0 = null;
        if (r10 instanceof C5553Iili) {
            C5553Iili r103 = (C5553Iili) r10;
            bArr = r103.OooO0O0();
            this.f17317OooO00o = r103.m15833OooO00o();
            int OooO00o2 = r103.OooO00o();
            if (OooO00o2 < 64 || OooO00o2 > 128 || OooO00o2 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + OooO00o2);
            }
            this.OooO00o = OooO00o2 / 8;
            r102 = r103.m15832OooO00o();
        } else if (r10 instanceof C6274iilL1L) {
            C6274iilL1L r104 = (C6274iilL1L) r10;
            bArr = r104.m17301OooO00o();
            this.f17317OooO00o = null;
            this.OooO00o = 16;
            r102 = (C6642li1LI) r104.OooO00o();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        }
        this.OooO0oO = new byte[16];
        this.OooO0oo = new byte[(z ? 16 : this.OooO00o + 16)];
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length <= 15) {
            if (r102 != null) {
                this.f17314OooO00o.OooO00o(true, r102);
                this.f17319OooO0O0.OooO00o(z, r102);
                this.f17322OooO0Oo = null;
            } else if (z2 != z) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            byte[] bArr2 = new byte[16];
            this.f17320OooO0O0 = bArr2;
            this.f17314OooO00o.OooO00o(bArr2, 0, bArr2, 0);
            this.f17321OooO0OO = OooO00o(this.f17320OooO0O0);
            Vector vector = new Vector();
            this.f17315OooO00o = vector;
            vector.addElement(OooO00o(this.f17321OooO0OO));
            int OooO00o3 = m16837OooO00o(bArr);
            int i = OooO00o3 % 8;
            int i2 = OooO00o3 / 8;
            if (i == 0) {
                System.arraycopy(this.OooO0o0, i2, this.OooO0o, 0, 16);
            } else {
                for (int i3 = 0; i3 < 16; i3++) {
                    byte[] bArr3 = this.OooO0o0;
                    i2++;
                    this.OooO0o[i3] = (byte) (((bArr3[i2] & 255) >>> (8 - i)) | ((bArr3[i2] & 255) << i));
                }
            }
            this.OooO0O0 = 0;
            this.OooO0OO = 0;
            this.f17313OooO00o = 0;
            this.f17318OooO0O0 = 0;
            this.OooO = new byte[16];
            this.OooOO0 = new byte[16];
            System.arraycopy(this.OooO0o, 0, this.OooOO0O, 0, 16);
            this.OooOO0o = new byte[16];
            byte[] bArr4 = this.f17317OooO00o;
            if (bArr4 != null) {
                OooO00o(bArr4, 0, bArr4.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("IV must be no more than 15 bytes");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16840OooO00o(byte[] bArr) {
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16841OooO00o(byte[] bArr, int i) {
        if (bArr.length >= i + 16) {
            if (this.f17316OooO00o) {
                m16836OooO00o(this.OooOO0o, this.OooO0oo);
                this.OooO0OO = 0;
            }
            byte[] bArr2 = this.OooOO0O;
            long j = this.f17318OooO0O0 + 1;
            this.f17318OooO0O0 = j;
            m16836OooO00o(bArr2, m16843OooO00o(OooO00o(j)));
            m16836OooO00o(this.OooO0oo, this.OooOO0O);
            li1l11I1 li1l11i1 = this.f17319OooO0O0;
            byte[] bArr3 = this.OooO0oo;
            li1l11i1.OooO00o(bArr3, 0, bArr3, 0);
            m16836OooO00o(this.OooO0oo, this.OooOO0O);
            System.arraycopy(this.OooO0oo, 0, bArr, i, 16);
            if (!this.f17316OooO00o) {
                m16836OooO00o(this.OooOO0o, this.OooO0oo);
                byte[] bArr4 = this.OooO0oo;
                System.arraycopy(bArr4, 16, bArr4, 0, this.OooO00o);
                this.OooO0OO = this.OooO00o;
                return;
            }
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.OooO0oO;
            int i4 = this.OooO0O0;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.OooO0O0 = i5;
            if (i5 == bArr2.length) {
                m16839OooO00o();
            }
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16842OooO00o() {
        byte[] bArr = this.OooOOO0;
        return bArr == null ? new byte[this.OooO00o] : C9586iIILl.m21630OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16843OooO00o(int i) {
        while (i >= this.f17315OooO00o.size()) {
            Vector vector = this.f17315OooO00o;
            vector.addElement(OooO00o((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f17315OooO00o.elementAt(i);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO0O0(int i) {
        int i2 = i + this.OooO0OO;
        if (!this.f17316OooO00o) {
            int i3 = this.OooO00o;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    public void OooO0O0(byte[] bArr) {
        m16836OooO00o(this.OooO, bArr);
        m16836OooO00o(this.OooO0oO, this.OooO);
        li1l11I1 li1l11i1 = this.f17314OooO00o;
        byte[] bArr2 = this.OooO0oO;
        li1l11i1.OooO00o(bArr2, 0, bArr2, 0);
        m16836OooO00o(this.OooOO0, this.OooO0oO);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void reset() {
        OooO00o(true);
    }
}
