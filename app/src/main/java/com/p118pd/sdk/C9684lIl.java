package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.丨lIl  reason: invalid class name and case insensitive filesystem */
public class C9684lIl implements AbstractC93171I1 {
    public static final byte OooO0O0 = -68;
    public byte OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23290OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f23291OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f23292OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23293OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23294OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23295OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f23296OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC6436l11LI f23297OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23298OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f23299OooO0OO;
    public int OooO0Oo;

    public C9684lIl(Ii1IliL r2, AbstractC6436l11LI r3, int i) {
        this(r2, r3, i, (byte) OooO0O0);
    }

    public C9684lIl(Ii1IliL r7, AbstractC6436l11LI r8, int i, byte b) {
        this(r7, r8, r8, i, b);
    }

    public C9684lIl(Ii1IliL r7, AbstractC6436l11LI r8, AbstractC6436l11LI r9, int i) {
        this(r7, r8, r9, i, (byte) OooO0O0);
    }

    public C9684lIl(Ii1IliL r1, AbstractC6436l11LI r2, AbstractC6436l11LI r3, int i, byte b) {
        this.f23292OooO00o = r1;
        this.f23291OooO00o = r2;
        this.f23297OooO0O0 = r3;
        this.f23290OooO00o = r2.OooO0O0();
        this.f23296OooO0O0 = r3.OooO0O0();
        this.f23294OooO00o = false;
        this.OooO0OO = i;
        this.f23295OooO00o = new byte[i];
        this.f23298OooO0O0 = new byte[(i + 8 + this.f23290OooO00o)];
        this.OooO00o = b;
    }

    public C9684lIl(Ii1IliL r7, AbstractC6436l11LI r8, AbstractC6436l11LI r9, byte[] bArr) {
        this(r7, r8, r9, bArr, (byte) OooO0O0);
    }

    public C9684lIl(Ii1IliL r1, AbstractC6436l11LI r2, AbstractC6436l11LI r3, byte[] bArr, byte b) {
        this.f23292OooO00o = r1;
        this.f23291OooO00o = r2;
        this.f23297OooO0O0 = r3;
        this.f23290OooO00o = r2.OooO0O0();
        this.f23296OooO0O0 = r3.OooO0O0();
        this.f23294OooO00o = true;
        int length = bArr.length;
        this.OooO0OO = length;
        this.f23295OooO00o = bArr;
        this.f23298OooO0O0 = new byte[(length + 8 + this.f23290OooO00o)];
        this.OooO00o = b;
    }

    public C9684lIl(Ii1IliL r7, AbstractC6436l11LI r8, byte[] bArr) {
        this(r7, r8, r8, bArr, (byte) OooO0O0);
    }

    private void OooO00o(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    private byte[] OooO00o(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.f23296OooO0O0];
        byte[] bArr4 = new byte[4];
        this.f23297OooO0O0.reset();
        int i5 = 0;
        while (true) {
            i4 = this.f23296OooO0O0;
            if (i5 >= i3 / i4) {
                break;
            }
            OooO00o(i5, bArr4);
            this.f23297OooO0O0.update(bArr, i, i2);
            this.f23297OooO0O0.update(bArr4, 0, 4);
            this.f23297OooO0O0.OooO00o(bArr3, 0);
            int i6 = this.f23296OooO0O0;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            OooO00o(i5, bArr4);
            this.f23297OooO0O0.update(bArr, i, i2);
            this.f23297OooO0O0.update(bArr4, 0, 4);
            this.f23297OooO0O0.OooO00o(bArr3, 0);
            int i7 = this.f23296OooO0O0;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    private void OooO0O0(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        AbstractC6370iIIIl r1;
        liLI1l1i lili1l1i;
        if (r4 instanceof liLL1l) {
            liLL1l r0 = (liLL1l) r4;
            r1 = r0.OooO00o();
            this.f23293OooO00o = r0.m17752OooO00o();
        } else {
            if (z) {
                this.f23293OooO00o = IIllii.OooO00o();
            }
            r1 = r4;
        }
        if (r1 instanceof C6316ilLLi1) {
            lili1l1i = ((C6316ilLLi1) r1).OooO00o();
            this.f23292OooO00o.OooO00o(z, r4);
        } else {
            lili1l1i = (liLI1l1i) r1;
            this.f23292OooO00o.OooO00o(z, r1);
        }
        int bitLength = lili1l1i.OooO0O0().bitLength() - 1;
        this.OooO0Oo = bitLength;
        if (bitLength >= (this.f23290OooO00o * 8) + (this.OooO0OO * 8) + 9) {
            this.f23299OooO0OO = new byte[((bitLength + 7) / 8)];
            reset();
            return;
        }
        throw new IllegalArgumentException("key too small for specified hash and salt lengths");
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public boolean OooO00o(byte[] bArr) {
        AbstractC6436l11LI r0 = this.f23291OooO00o;
        byte[] bArr2 = this.f23298OooO0O0;
        r0.OooO00o(bArr2, (bArr2.length - this.f23290OooO00o) - this.OooO0OO);
        try {
            byte[] OooO00o2 = this.f23292OooO00o.OooO00o(bArr, 0, bArr.length);
            System.arraycopy(OooO00o2, 0, this.f23299OooO0OO, this.f23299OooO0OO.length - OooO00o2.length, OooO00o2.length);
            byte[] bArr3 = this.f23299OooO0OO;
            if (bArr3[bArr3.length - 1] != this.OooO00o) {
                OooO0O0(bArr3);
                return false;
            }
            int length = bArr3.length;
            int i = this.f23290OooO00o;
            byte[] OooO00o3 = OooO00o(bArr3, (length - i) - 1, i, (bArr3.length - i) - 1);
            for (int i2 = 0; i2 != OooO00o3.length; i2++) {
                byte[] bArr4 = this.f23299OooO0OO;
                bArr4[i2] = (byte) (bArr4[i2] ^ OooO00o3[i2]);
            }
            byte[] bArr5 = this.f23299OooO0OO;
            bArr5[0] = (byte) (bArr5[0] & (255 >> ((bArr5.length * 8) - this.OooO0Oo)));
            int i3 = 0;
            while (true) {
                byte[] bArr6 = this.f23299OooO0OO;
                int length2 = bArr6.length;
                int i4 = this.f23290OooO00o;
                int i5 = this.OooO0OO;
                if (i3 != ((length2 - i4) - i5) - 2) {
                    if (bArr6[i3] != 0) {
                        OooO0O0(bArr6);
                        return false;
                    }
                    i3++;
                } else if (bArr6[((bArr6.length - i4) - i5) - 2] != 1) {
                    OooO0O0(bArr6);
                    return false;
                } else {
                    if (this.f23294OooO00o) {
                        byte[] bArr7 = this.f23295OooO00o;
                        byte[] bArr8 = this.f23298OooO0O0;
                        System.arraycopy(bArr7, 0, bArr8, bArr8.length - i5, i5);
                    } else {
                        byte[] bArr9 = this.f23298OooO0O0;
                        System.arraycopy(bArr6, ((bArr6.length - i5) - i4) - 1, bArr9, bArr9.length - i5, i5);
                    }
                    AbstractC6436l11LI r7 = this.f23291OooO00o;
                    byte[] bArr10 = this.f23298OooO0O0;
                    r7.update(bArr10, 0, bArr10.length);
                    AbstractC6436l11LI r72 = this.f23291OooO00o;
                    byte[] bArr11 = this.f23298OooO0O0;
                    r72.OooO00o(bArr11, bArr11.length - this.f23290OooO00o);
                    int length3 = this.f23299OooO0OO.length;
                    int i6 = this.f23290OooO00o;
                    int i7 = (length3 - i6) - 1;
                    int length4 = this.f23298OooO0O0.length - i6;
                    while (true) {
                        byte[] bArr12 = this.f23298OooO0O0;
                        if (length4 == bArr12.length) {
                            OooO0O0(bArr12);
                            OooO0O0(this.f23299OooO0OO);
                            return true;
                        } else if ((this.f23299OooO0OO[i7] ^ bArr12[length4]) != 0) {
                            OooO0O0(bArr12);
                            OooO0O0(this.f23299OooO0OO);
                            return false;
                        } else {
                            i7++;
                            length4++;
                        }
                    }
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException, DataLengthException {
        AbstractC6436l11LI r0 = this.f23291OooO00o;
        byte[] bArr = this.f23298OooO0O0;
        r0.OooO00o(bArr, (bArr.length - this.f23290OooO00o) - this.OooO0OO);
        if (this.OooO0OO != 0) {
            if (!this.f23294OooO00o) {
                this.f23293OooO00o.nextBytes(this.f23295OooO00o);
            }
            byte[] bArr2 = this.f23295OooO00o;
            byte[] bArr3 = this.f23298OooO0O0;
            int length = bArr3.length;
            int i = this.OooO0OO;
            System.arraycopy(bArr2, 0, bArr3, length - i, i);
        }
        int i2 = this.f23290OooO00o;
        byte[] bArr4 = new byte[i2];
        AbstractC6436l11LI r3 = this.f23291OooO00o;
        byte[] bArr5 = this.f23298OooO0O0;
        r3.update(bArr5, 0, bArr5.length);
        this.f23291OooO00o.OooO00o(bArr4, 0);
        byte[] bArr6 = this.f23299OooO0OO;
        int length2 = bArr6.length;
        int i3 = this.OooO0OO;
        int i4 = this.f23290OooO00o;
        bArr6[(((length2 - i3) - 1) - i4) - 1] = 1;
        System.arraycopy(this.f23295OooO00o, 0, bArr6, ((bArr6.length - i3) - i4) - 1, i3);
        byte[] OooO00o2 = OooO00o(bArr4, 0, i2, (this.f23299OooO0OO.length - this.f23290OooO00o) - 1);
        for (int i5 = 0; i5 != OooO00o2.length; i5++) {
            byte[] bArr7 = this.f23299OooO0OO;
            bArr7[i5] = (byte) (bArr7[i5] ^ OooO00o2[i5]);
        }
        byte[] bArr8 = this.f23299OooO0OO;
        bArr8[0] = (byte) (bArr8[0] & (255 >> ((bArr8.length * 8) - this.OooO0Oo)));
        int length3 = bArr8.length;
        int i6 = this.f23290OooO00o;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i6) - 1, i6);
        byte[] bArr9 = this.f23299OooO0OO;
        bArr9[bArr9.length - 1] = this.OooO00o;
        byte[] OooO00o3 = this.f23292OooO00o.OooO00o(bArr9, 0, bArr9.length);
        OooO0O0(this.f23299OooO0OO);
        return OooO00o3;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.f23291OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.f23291OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.f23291OooO00o.update(bArr, i, i2);
    }
}
