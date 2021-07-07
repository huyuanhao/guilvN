package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.LIll  reason: case insensitive filesystem */
public class C5643LIll implements AbstractC9425Ili1lI {
    public static final int OooO = 12748;
    public static final int OooO0oo = 188;
    public static final int OooOO0 = 13004;
    public static final int OooOO0O = 13260;
    public static final int OooOO0o = 13516;
    public static final int OooOOO = 14028;
    public static final int OooOOO0 = 13772;
    public static final int OooOOOO = 14284;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f16354OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f16355OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16356OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16357OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16358OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16359OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16360OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f16361OooO0Oo;
    public int OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public byte[] f16362OooO0o;
    public int OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public byte[] f16363OooO0o0;
    public int OooO0oO;

    public C5643LIll(Ii1IliL r2, AbstractC6436l11LI r3, int i) {
        this(r2, r3, i, false);
    }

    public C5643LIll(Ii1IliL r1, AbstractC6436l11LI r2, int i, boolean z) {
        int intValue;
        this.f16355OooO00o = r1;
        this.f16354OooO00o = r2;
        this.OooO00o = r2.OooO0O0();
        this.OooO0o0 = i;
        if (z) {
            intValue = 188;
        } else {
            Integer OooO00o2 = I11.OooO00o(r2);
            if (OooO00o2 != null) {
                intValue = OooO00o2.intValue();
            } else {
                throw new IllegalArgumentException("no valid trailer for digest: " + r2.OooO00o());
            }
        }
        this.OooO0O0 = intValue;
    }

    private void OooO00o(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    private void OooO00o(long j, byte[] bArr) {
        bArr[0] = (byte) ((int) (j >>> 56));
        bArr[1] = (byte) ((int) (j >>> 48));
        bArr[2] = (byte) ((int) (j >>> 40));
        bArr[3] = (byte) ((int) (j >>> 32));
        bArr[4] = (byte) ((int) (j >>> 24));
        bArr[5] = (byte) ((int) (j >>> 16));
        bArr[6] = (byte) ((int) (j >>> 8));
        bArr[7] = (byte) ((int) (j >>> 0));
    }

    private boolean OooO00o(byte[] bArr, byte[] bArr2) {
        boolean z = this.OooO0Oo == bArr2.length;
        for (int i = 0; i != bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                z = false;
            }
        }
        return z;
    }

    private byte[] OooO00o(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.OooO00o];
        byte[] bArr4 = new byte[4];
        this.f16354OooO00o.reset();
        int i5 = 0;
        while (true) {
            i4 = this.OooO00o;
            if (i5 >= i3 / i4) {
                break;
            }
            OooO00o(i5, bArr4);
            this.f16354OooO00o.update(bArr, i, i2);
            this.f16354OooO00o.update(bArr4, 0, 4);
            this.f16354OooO00o.OooO00o(bArr3, 0);
            int i6 = this.OooO00o;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            OooO00o(i5, bArr4);
            this.f16354OooO00o.update(bArr, i, i2);
            this.f16354OooO00o.update(bArr4, 0, 4);
            this.f16354OooO00o.OooO00o(bArr3, 0);
            int i7 = this.OooO00o;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    private void OooO0O0(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    @Override // com.p118pd.sdk.AbstractC93171I1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(boolean r4, com.p118pd.sdk.AbstractC6370iIIIl r5) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5643LIll.OooO00o(boolean, com.pd.sdk.i丨IIIl):void");
    }

    @Override // com.p118pd.sdk.AbstractC93171I1, com.p118pd.sdk.AbstractC9425Ili1lI
    public void OooO00o(byte[] bArr) throws InvalidCipherTextException {
        byte[] OooO00o2 = this.f16355OooO00o.OooO00o(bArr, 0, bArr.length);
        int length = OooO00o2.length;
        int i = this.OooO0OO;
        if (length < (i + 7) / 8) {
            int i2 = (i + 7) / 8;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(OooO00o2, 0, bArr2, i2 - OooO00o2.length, OooO00o2.length);
            OooO0O0(OooO00o2);
            OooO00o2 = bArr2;
        }
        boolean z = true;
        int i3 = 2;
        if (((OooO00o2[OooO00o2.length - 1] & 255) ^ 188) == 0) {
            i3 = 1;
        } else {
            int i4 = ((OooO00o2[OooO00o2.length - 2] & 255) << 8) | (OooO00o2[OooO00o2.length - 1] & 255);
            Integer OooO00o3 = I11.OooO00o(this.f16354OooO00o);
            if (OooO00o3 != null) {
                int intValue = OooO00o3.intValue();
                if (!(i4 == intValue || (intValue == 15052 && i4 == 16588))) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i4);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        this.f16354OooO00o.OooO00o(new byte[this.OooO00o], 0);
        int length2 = OooO00o2.length;
        int i5 = this.OooO00o;
        byte[] OooO00o4 = OooO00o(OooO00o2, (length2 - i5) - i3, i5, (OooO00o2.length - i5) - i3);
        for (int i6 = 0; i6 != OooO00o4.length; i6++) {
            OooO00o2[i6] = (byte) (OooO00o2[i6] ^ OooO00o4[i6]);
        }
        OooO00o2[0] = (byte) (OooO00o2[0] & O0O00O.OooO0O0);
        int i7 = 0;
        while (i7 != OooO00o2.length && OooO00o2[i7] != 1) {
            i7++;
        }
        int i8 = i7 + 1;
        if (i8 >= OooO00o2.length) {
            OooO0O0(OooO00o2);
        }
        if (i8 <= 1) {
            z = false;
        }
        this.f16357OooO00o = z;
        byte[] bArr3 = new byte[((OooO00o4.length - i8) - this.OooO0o0)];
        this.f16361OooO0Oo = bArr3;
        System.arraycopy(OooO00o2, i8, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.f16361OooO0Oo;
        System.arraycopy(bArr4, 0, this.f16360OooO0OO, 0, bArr4.length);
        this.f16363OooO0o0 = bArr;
        this.f16362OooO0o = OooO00o2;
        this.OooO0o = i8;
        this.OooO0oO = i3;
    }

    @Override // com.p118pd.sdk.AbstractC9425Ili1lI, com.p118pd.sdk.AbstractC9425Ili1lI
    public boolean OooO00o() {
        return this.f16357OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1, com.p118pd.sdk.AbstractC9425Ili1lI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16138OooO00o(byte[] bArr) {
        int i = this.OooO00o;
        byte[] bArr2 = new byte[i];
        this.f16354OooO00o.OooO00o(bArr2, 0);
        byte[] bArr3 = this.f16363OooO0o0;
        if (bArr3 == null) {
            try {
                OooO00o(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!C9586iIILl.m21627OooO00o(bArr3, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.f16362OooO0o;
        int i2 = this.OooO0o;
        int i3 = this.OooO0oO;
        this.f16363OooO0o0 = null;
        this.f16362OooO0o = null;
        byte[] bArr5 = new byte[8];
        OooO00o((long) (this.f16361OooO0Oo.length * 8), bArr5);
        this.f16354OooO00o.update(bArr5, 0, 8);
        byte[] bArr6 = this.f16361OooO0Oo;
        if (bArr6.length != 0) {
            this.f16354OooO00o.update(bArr6, 0, bArr6.length);
        }
        this.f16354OooO00o.update(bArr2, 0, i);
        byte[] bArr7 = this.f16358OooO00o;
        if (bArr7 != null) {
            this.f16354OooO00o.update(bArr7, 0, bArr7.length);
        } else {
            this.f16354OooO00o.update(bArr4, i2 + this.f16361OooO0Oo.length, this.OooO0o0);
        }
        int OooO0O02 = this.f16354OooO00o.OooO0O0();
        byte[] bArr8 = new byte[OooO0O02];
        this.f16354OooO00o.OooO00o(bArr8, 0);
        int length = (bArr4.length - i3) - OooO0O02;
        boolean z = true;
        for (int i4 = 0; i4 != OooO0O02; i4++) {
            if (bArr8[i4] != bArr4[length + i4]) {
                z = false;
            }
        }
        OooO0O0(bArr4);
        OooO0O0(bArr8);
        if (!z) {
            this.f16357OooO00o = false;
            this.OooO0Oo = 0;
            OooO0O0(this.f16361OooO0Oo);
            return false;
        } else if (this.OooO0Oo == 0 || OooO00o(this.f16360OooO0OO, this.f16361OooO0Oo)) {
            this.OooO0Oo = 0;
            OooO0O0(this.f16360OooO0OO);
            return true;
        } else {
            this.OooO0Oo = 0;
            OooO0O0(this.f16360OooO0OO);
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC9425Ili1lI, com.p118pd.sdk.AbstractC9425Ili1lI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16139OooO00o() {
        return this.f16361OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException {
        int OooO0O02 = this.f16354OooO00o.OooO0O0();
        byte[] bArr = new byte[OooO0O02];
        this.f16354OooO00o.OooO00o(bArr, 0);
        byte[] bArr2 = new byte[8];
        OooO00o((long) (this.OooO0Oo * 8), bArr2);
        this.f16354OooO00o.update(bArr2, 0, 8);
        this.f16354OooO00o.update(this.f16360OooO0OO, 0, this.OooO0Oo);
        this.f16354OooO00o.update(bArr, 0, OooO0O02);
        byte[] bArr3 = this.f16358OooO00o;
        if (bArr3 == null) {
            bArr3 = new byte[this.OooO0o0];
            this.f16356OooO00o.nextBytes(bArr3);
        }
        this.f16354OooO00o.update(bArr3, 0, bArr3.length);
        int OooO0O03 = this.f16354OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O03];
        this.f16354OooO00o.OooO00o(bArr4, 0);
        boolean z = true;
        int i = this.OooO0O0 == 188 ? 1 : 2;
        byte[] bArr5 = this.f16359OooO0O0;
        int length = bArr5.length;
        int i2 = this.OooO0Oo;
        int length2 = ((((length - i2) - bArr3.length) - this.OooO00o) - i) - 1;
        bArr5[length2] = 1;
        int i3 = length2 + 1;
        System.arraycopy(this.f16360OooO0OO, 0, bArr5, i3, i2);
        System.arraycopy(bArr3, 0, this.f16359OooO0O0, i3 + this.OooO0Oo, bArr3.length);
        byte[] OooO00o2 = OooO00o(bArr4, 0, OooO0O03, (this.f16359OooO0O0.length - this.OooO00o) - i);
        for (int i4 = 0; i4 != OooO00o2.length; i4++) {
            byte[] bArr6 = this.f16359OooO0O0;
            bArr6[i4] = (byte) (bArr6[i4] ^ OooO00o2[i4]);
        }
        byte[] bArr7 = this.f16359OooO0O0;
        int length3 = bArr7.length;
        int i5 = this.OooO00o;
        System.arraycopy(bArr4, 0, bArr7, (length3 - i5) - i, i5);
        int i6 = this.OooO0O0;
        if (i6 == 188) {
            byte[] bArr8 = this.f16359OooO0O0;
            bArr8[bArr8.length - 1] = C9684lIl.OooO0O0;
        } else {
            byte[] bArr9 = this.f16359OooO0O0;
            bArr9[bArr9.length - 2] = (byte) (i6 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i6;
        }
        byte[] bArr10 = this.f16359OooO0O0;
        bArr10[0] = (byte) (bArr10[0] & O0O00O.OooO0O0);
        byte[] OooO00o3 = this.f16355OooO00o.OooO00o(bArr10, 0, bArr10.length);
        int i7 = this.OooO0Oo;
        this.f16361OooO0Oo = new byte[i7];
        if (i7 > this.f16360OooO0OO.length) {
            z = false;
        }
        this.f16357OooO00o = z;
        byte[] bArr11 = this.f16360OooO0OO;
        byte[] bArr12 = this.f16361OooO0Oo;
        System.arraycopy(bArr11, 0, bArr12, 0, bArr12.length);
        OooO0O0(this.f16360OooO0OO);
        OooO0O0(this.f16359OooO0O0);
        this.OooO0Oo = 0;
        return OooO00o3;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.f16354OooO00o.reset();
        this.OooO0Oo = 0;
        byte[] bArr = this.f16360OooO0OO;
        if (bArr != null) {
            OooO0O0(bArr);
        }
        byte[] bArr2 = this.f16361OooO0Oo;
        if (bArr2 != null) {
            OooO0O0(bArr2);
            this.f16361OooO0Oo = null;
        }
        this.f16357OooO00o = false;
        if (this.f16363OooO0o0 != null) {
            this.f16363OooO0o0 = null;
            OooO0O0(this.f16362OooO0o);
            this.f16362OooO0o = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        if (this.f16363OooO0o0 == null) {
            int i = this.OooO0Oo;
            byte[] bArr = this.f16360OooO0OO;
            if (i < bArr.length) {
                this.OooO0Oo = i + 1;
                bArr[i] = b;
                return;
            }
        }
        this.f16354OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        if (this.f16363OooO0o0 == null) {
            while (i2 > 0 && this.OooO0Oo < this.f16360OooO0OO.length) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }
        if (i2 > 0) {
            this.f16354OooO00o.update(bArr, i, i2);
        }
    }
}
