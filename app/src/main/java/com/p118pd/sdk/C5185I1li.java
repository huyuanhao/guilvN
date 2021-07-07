package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.I1li  reason: case insensitive filesystem */
public class C5185I1li implements AbstractC9425Ili1lI {
    public static final int OooO = 13772;
    public static final int OooO0Oo = 188;
    public static final int OooO0o = 13004;
    public static final int OooO0o0 = 12748;
    public static final int OooO0oO = 13260;
    public static final int OooO0oo = 13516;
    public static final int OooOO0 = 14028;
    public static final int OooOO0O = 14284;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f15398OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f15399OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15400OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15401OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15402OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15403OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f15404OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public byte[] f15405OooO0o0;

    public C5185I1li(Ii1IliL r2, AbstractC6436l11LI r3) {
        this(r2, r3, false);
    }

    public C5185I1li(Ii1IliL r2, AbstractC6436l11LI r3, boolean z) {
        int intValue;
        this.f15399OooO00o = r2;
        this.f15398OooO00o = r3;
        if (z) {
            intValue = 188;
        } else {
            Integer OooO00o2 = I11.OooO00o(r3);
            if (OooO00o2 != null) {
                intValue = OooO00o2.intValue();
            } else {
                throw new IllegalArgumentException("no valid trailer for digest: " + r3.OooO00o());
            }
        }
        this.OooO00o = intValue;
    }

    private boolean OooO00o(byte[] bArr, byte[] bArr2) {
        int i = this.OooO0OO;
        byte[] bArr3 = this.f15402OooO0O0;
        boolean z = true;
        if (i > bArr3.length) {
            if (bArr3.length > bArr2.length) {
                z = false;
            }
            for (int i2 = 0; i2 != this.f15402OooO0O0.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
        } else {
            if (i != bArr2.length) {
                z = false;
            }
            for (int i3 = 0; i3 != bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    z = false;
                }
            }
        }
        return z;
    }

    private void OooO0O0(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private boolean m15307OooO0O0(byte[] bArr) {
        this.OooO0OO = 0;
        OooO0O0(this.f15402OooO0O0);
        OooO0O0(bArr);
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        liLI1l1i lili1l1i = (liLI1l1i) r3;
        this.f15399OooO00o.OooO00o(z, lili1l1i);
        int bitLength = lili1l1i.OooO0O0().bitLength();
        this.OooO0O0 = bitLength;
        byte[] bArr = new byte[((bitLength + 7) / 8)];
        this.f15401OooO00o = bArr;
        int i = this.OooO00o;
        int length = bArr.length;
        if (i == 188) {
            this.f15402OooO0O0 = new byte[((length - this.f15398OooO00o.OooO0O0()) - 2)];
        } else {
            this.f15402OooO0O0 = new byte[((length - this.f15398OooO00o.OooO0O0()) - 3)];
        }
        reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1, com.p118pd.sdk.AbstractC9425Ili1lI
    public void OooO00o(byte[] bArr) throws InvalidCipherTextException {
        byte[] OooO00o2 = this.f15399OooO00o.OooO00o(bArr, 0, bArr.length);
        if (((OooO00o2[0] & ExifInterface.OooO0Oo) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        } else if (((OooO00o2[OooO00o2.length - 1] & 15) ^ 12) == 0) {
            int i = 2;
            if (((OooO00o2[OooO00o2.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                int i2 = ((OooO00o2[OooO00o2.length - 2] & 255) << 8) | (OooO00o2[OooO00o2.length - 1] & 255);
                Integer OooO00o3 = I11.OooO00o(this.f15398OooO00o);
                if (OooO00o3 != null) {
                    int intValue = OooO00o3.intValue();
                    if (!(i2 == intValue || (intValue == 15052 && i2 == 16588))) {
                        throw new IllegalStateException("signer initialised with wrong digest for trailer " + i2);
                    }
                } else {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
            }
            int i3 = 0;
            while (i3 != OooO00o2.length && ((OooO00o2[i3] & 15) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            int length = ((OooO00o2.length - i) - this.f15398OooO00o.OooO0O0()) - i4;
            if (length > 0) {
                if ((OooO00o2[0] & 32) == 0) {
                    this.f15400OooO00o = true;
                    byte[] bArr2 = new byte[length];
                    this.f15403OooO0OO = bArr2;
                    System.arraycopy(OooO00o2, i4, bArr2, 0, bArr2.length);
                } else {
                    this.f15400OooO00o = false;
                    byte[] bArr3 = new byte[length];
                    this.f15403OooO0OO = bArr3;
                    System.arraycopy(OooO00o2, i4, bArr3, 0, bArr3.length);
                }
                this.f15404OooO0Oo = bArr;
                this.f15405OooO0o0 = OooO00o2;
                AbstractC6436l11LI r8 = this.f15398OooO00o;
                byte[] bArr4 = this.f15403OooO0OO;
                r8.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = this.f15403OooO0OO;
                this.OooO0OO = bArr5.length;
                System.arraycopy(bArr5, 0, this.f15402OooO0O0, 0, bArr5.length);
                return;
            }
            throw new InvalidCipherTextException("malformed block");
        } else {
            throw new InvalidCipherTextException("malformed signature");
        }
    }

    @Override // com.p118pd.sdk.AbstractC9425Ili1lI, com.p118pd.sdk.AbstractC9425Ili1lI
    public boolean OooO00o() {
        return this.f15400OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1, com.p118pd.sdk.AbstractC9425Ili1lI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15308OooO00o(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = this.f15404OooO0Oo;
        if (bArr3 == null) {
            try {
                bArr2 = this.f15399OooO00o.OooO00o(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (C9586iIILl.m21627OooO00o(bArr3, bArr)) {
            bArr2 = this.f15405OooO0o0;
            this.f15404OooO0Oo = null;
            this.f15405OooO0o0 = null;
        } else {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        if (((bArr2[0] & ExifInterface.OooO0Oo) ^ 64) != 0) {
            return m15307OooO0O0(bArr2);
        }
        if (((bArr2[bArr2.length - 1] & 15) ^ 12) != 0) {
            return m15307OooO0O0(bArr2);
        }
        int i = 2;
        if (((bArr2[bArr2.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            int i2 = ((bArr2[bArr2.length - 2] & 255) << 8) | (bArr2[bArr2.length - 1] & 255);
            Integer OooO00o2 = I11.OooO00o(this.f15398OooO00o);
            if (OooO00o2 != null) {
                int intValue = OooO00o2.intValue();
                if (!(i2 == intValue || (intValue == 15052 && i2 == 16588))) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i2);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        int i3 = 0;
        while (i3 != bArr2.length && ((bArr2[i3] & 15) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int OooO0O02 = this.f15398OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O02];
        int length = (bArr2.length - i) - OooO0O02;
        int i5 = length - i4;
        if (i5 <= 0) {
            return m15307OooO0O0(bArr2);
        }
        if ((bArr2[0] & 32) == 0) {
            this.f15400OooO00o = true;
            if (this.OooO0OO > i5) {
                return m15307OooO0O0(bArr2);
            }
            this.f15398OooO00o.reset();
            this.f15398OooO00o.update(bArr2, i4, i5);
            this.f15398OooO00o.OooO00o(bArr4, 0);
            boolean z = true;
            for (int i6 = 0; i6 != OooO0O02; i6++) {
                int i7 = length + i6;
                bArr2[i7] = (byte) (bArr2[i7] ^ bArr4[i6]);
                if (bArr2[i7] != 0) {
                    z = false;
                }
            }
            if (!z) {
                return m15307OooO0O0(bArr2);
            }
            byte[] bArr5 = new byte[i5];
            this.f15403OooO0OO = bArr5;
            System.arraycopy(bArr2, i4, bArr5, 0, bArr5.length);
        } else {
            this.f15400OooO00o = false;
            this.f15398OooO00o.OooO00o(bArr4, 0);
            boolean z2 = true;
            for (int i8 = 0; i8 != OooO0O02; i8++) {
                int i9 = length + i8;
                bArr2[i9] = (byte) (bArr2[i9] ^ bArr4[i8]);
                if (bArr2[i9] != 0) {
                    z2 = false;
                }
            }
            if (!z2) {
                return m15307OooO0O0(bArr2);
            }
            byte[] bArr6 = new byte[i5];
            this.f15403OooO0OO = bArr6;
            System.arraycopy(bArr2, i4, bArr6, 0, bArr6.length);
        }
        if (!(this.OooO0OO == 0 || OooO00o(this.f15402OooO0O0, this.f15403OooO0OO))) {
            return m15307OooO0O0(bArr2);
        }
        OooO0O0(this.f15402OooO0O0);
        OooO0O0(bArr2);
        this.OooO0OO = 0;
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC9425Ili1lI, com.p118pd.sdk.AbstractC9425Ili1lI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15309OooO00o() {
        return this.f15403OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException {
        int i;
        int i2;
        int i3;
        byte b;
        int OooO0O02 = this.f15398OooO00o.OooO0O0();
        boolean z = true;
        if (this.OooO00o == 188) {
            byte[] bArr = this.f15401OooO00o;
            i = (bArr.length - OooO0O02) - 1;
            this.f15398OooO00o.OooO00o(bArr, i);
            byte[] bArr2 = this.f15401OooO00o;
            bArr2[bArr2.length - 1] = C9684lIl.OooO0O0;
            i2 = 8;
        } else {
            i2 = 16;
            byte[] bArr3 = this.f15401OooO00o;
            int length = (bArr3.length - OooO0O02) - 2;
            this.f15398OooO00o.OooO00o(bArr3, length);
            byte[] bArr4 = this.f15401OooO00o;
            int i4 = this.OooO00o;
            bArr4[bArr4.length - 2] = (byte) (i4 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i4;
            i = length;
        }
        int i5 = this.OooO0OO;
        int i6 = ((((OooO0O02 + i5) * 8) + i2) + 4) - this.OooO0O0;
        if (i6 > 0) {
            int i7 = i5 - ((i6 + 7) / 8);
            b = 96;
            i3 = i - i7;
            System.arraycopy(this.f15402OooO0O0, 0, this.f15401OooO00o, i3, i7);
            this.f15403OooO0OO = new byte[i7];
        } else {
            b = 64;
            i3 = i - i5;
            System.arraycopy(this.f15402OooO0O0, 0, this.f15401OooO00o, i3, i5);
            this.f15403OooO0OO = new byte[this.OooO0OO];
        }
        int i8 = i3 - 1;
        if (i8 > 0) {
            for (int i9 = i8; i9 != 0; i9--) {
                this.f15401OooO00o[i9] = -69;
            }
            byte[] bArr5 = this.f15401OooO00o;
            bArr5[i8] = (byte) (bArr5[i8] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (bArr5[0] | b);
        } else {
            byte[] bArr6 = this.f15401OooO00o;
            bArr6[0] = 10;
            bArr6[0] = (byte) (bArr6[0] | b);
        }
        Ii1IliL r2 = this.f15399OooO00o;
        byte[] bArr7 = this.f15401OooO00o;
        byte[] OooO00o2 = r2.OooO00o(bArr7, 0, bArr7.length);
        if ((b & 32) != 0) {
            z = false;
        }
        this.f15400OooO00o = z;
        byte[] bArr8 = this.f15402OooO0O0;
        byte[] bArr9 = this.f15403OooO0OO;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.OooO0OO = 0;
        OooO0O0(this.f15402OooO0O0);
        OooO0O0(this.f15401OooO00o);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.f15398OooO00o.reset();
        this.OooO0OO = 0;
        OooO0O0(this.f15402OooO0O0);
        byte[] bArr = this.f15403OooO0OO;
        if (bArr != null) {
            OooO0O0(bArr);
        }
        this.f15403OooO0OO = null;
        this.f15400OooO00o = false;
        if (this.f15404OooO0Oo != null) {
            this.f15404OooO0Oo = null;
            OooO0O0(this.f15405OooO0o0);
            this.f15405OooO0o0 = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.f15398OooO00o.update(b);
        int i = this.OooO0OO;
        byte[] bArr = this.f15402OooO0O0;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.OooO0OO++;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.OooO0OO < this.f15402OooO0O0.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.f15398OooO00o.update(bArr, i, i2);
        this.OooO0OO += i2;
    }
}
