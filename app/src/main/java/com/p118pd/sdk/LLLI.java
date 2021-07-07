package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.LLLI */
public class LLLI implements LLIiLl {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.4.2.3";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f16451OooO00o = "a predetermined public constant".getBytes();
    public static final String OooO0O0 = "SHA1PRNG";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f16452OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5768Ll1L f16453OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f16454OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16455OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16456OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f16457OooO0O0;
    public int OooO0OO;

    private void OooO00o(C93221 r2) {
        this.f16454OooO00o = C5790LlLlI1.OooO00o(r2.OooO00o());
        this.f16452OooO00o = r2.OooO0O0();
        this.f16457OooO0O0 = r2.OooO00o();
        this.OooO0OO = r2.OooO0OO();
    }

    private void OooO00o(C9844iLi r2) {
        this.f16454OooO00o = C5790LlLlI1.OooO00o(r2.OooO00o());
        this.f16452OooO00o = r2.OooO0O0();
        this.f16457OooO0O0 = r2.OooO00o();
        this.OooO0OO = r2.OooO0OO();
    }

    public int OooO00o(C5768Ll1L r2) {
        if (r2 instanceof C93221) {
            return ((C93221) r2).OooO0O0();
        }
        if (r2 instanceof C9844iLi) {
            return ((C9844iLi) r2).OooO0O0();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // com.p118pd.sdk.LLIiLl
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        this.f16456OooO00o = z;
        if (!z) {
            C9844iLi r22 = (C9844iLi) r2;
            this.f16453OooO00o = r22;
            OooO00o(r22);
        } else if (r2 instanceof liLL1l) {
            liLL1l r23 = (liLL1l) r2;
            this.f16455OooO00o = r23.m17752OooO00o();
            C93221 r1 = (C93221) r23.OooO00o();
            this.f16453OooO00o = r1;
            OooO00o(r1);
        } else {
            this.f16455OooO00o = IIllii.OooO00o();
            C93221 r24 = (C93221) r2;
            this.f16453OooO00o = r24;
            OooO00o(r24);
        }
    }

    @Override // com.p118pd.sdk.LLIiLl
    public byte[] OooO00o(byte[] bArr) {
        if (this.f16456OooO00o) {
            int OooO0O02 = this.f16454OooO00o.OooO0O0();
            int i = this.f16457OooO0O0 >> 3;
            int bitLength = (C6356i1IiI1.m17450OooO00o(this.f16452OooO00o, this.OooO0OO).bitLength() - 1) >> 3;
            int length = ((i + bitLength) - OooO0O02) - f16451OooO00o.length;
            if (bArr.length > length) {
                length = bArr.length;
            }
            int length2 = f16451OooO00o.length + length;
            int i2 = ((length2 + OooO0O02) - i) - bitLength;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = f16451OooO00o;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            byte[] bArr4 = new byte[OooO0O02];
            this.f16455OooO00o.nextBytes(bArr4);
            lL1iii r3 = new lL1iii(new C6461l1liI());
            r3.OooO00o(bArr4);
            byte[] bArr5 = new byte[length2];
            r3.OooO0O0(bArr5);
            for (int i3 = length2 - 1; i3 >= 0; i3--) {
                bArr5[i3] = (byte) (bArr5[i3] ^ bArr2[i3]);
            }
            byte[] bArr6 = new byte[this.f16454OooO00o.OooO0O0()];
            this.f16454OooO00o.update(bArr5, 0, length2);
            this.f16454OooO00o.OooO00o(bArr6, 0);
            for (int i4 = OooO0O02 - 1; i4 >= 0; i4--) {
                bArr6[i4] = (byte) (bArr6[i4] ^ bArr4[i4]);
            }
            byte[] OooO00o2 = C5191I1ll.m15333OooO00o(bArr6, bArr5);
            byte[] bArr7 = new byte[0];
            if (i2 > 0) {
                bArr7 = new byte[i2];
                System.arraycopy(OooO00o2, 0, bArr7, 0, i2);
            }
            byte[] bArr8 = new byte[bitLength];
            System.arraycopy(OooO00o2, i2, bArr8, 0, bitLength);
            byte[] bArr9 = new byte[i];
            System.arraycopy(OooO00o2, bitLength + i2, bArr9, 0, i);
            byte[] OooO00o3 = Ll1L1L.OooO00o((C93221) this.f16453OooO00o, l11ILi.OooO00o(this.f16457OooO0O0, bArr9), C9823LiIl.OooO00o(this.f16452OooO00o, this.OooO0OO, bArr8)).m17552OooO00o();
            return i2 > 0 ? C5191I1ll.m15333OooO00o(bArr7, OooO00o3) : OooO00o3;
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    @Override // com.p118pd.sdk.LLIiLl
    public byte[] OooO0O0(byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        if (!this.f16456OooO00o) {
            int i = this.f16452OooO00o >> 3;
            if (bArr.length >= i) {
                int OooO0O02 = this.f16454OooO00o.OooO0O0();
                int i2 = this.f16457OooO0O0 >> 3;
                int length = bArr.length - i;
                if (length > 0) {
                    byte[][] OooO00o2 = C5191I1ll.m15336OooO00o(bArr, length);
                    bArr2 = OooO00o2[0];
                    bArr = OooO00o2[1];
                } else {
                    bArr2 = new byte[0];
                }
                l11ILi[] OooO00o3 = Ll1L1L.OooO00o((C9844iLi) this.f16453OooO00o, l11ILi.OooO00o(this.f16452OooO00o, bArr));
                byte[] OooO00o4 = OooO00o3[0].m17552OooO00o();
                l11ILi l11ili = OooO00o3[1];
                if (OooO00o4.length > i2) {
                    OooO00o4 = C5191I1ll.OooO00o(OooO00o4, 0, i2);
                }
                byte[] OooO00o5 = C5191I1ll.m15333OooO00o(C5191I1ll.m15333OooO00o(bArr2, C9823LiIl.OooO00o(this.f16452OooO00o, this.OooO0OO, l11ili)), OooO00o4);
                int length2 = OooO00o5.length - OooO0O02;
                byte[][] OooO00o6 = C5191I1ll.m15336OooO00o(OooO00o5, OooO0O02);
                byte[] bArr3 = OooO00o6[0];
                byte[] bArr4 = OooO00o6[1];
                byte[] bArr5 = new byte[this.f16454OooO00o.OooO0O0()];
                this.f16454OooO00o.update(bArr4, 0, bArr4.length);
                this.f16454OooO00o.OooO00o(bArr5, 0);
                for (int i3 = OooO0O02 - 1; i3 >= 0; i3--) {
                    bArr5[i3] = (byte) (bArr5[i3] ^ bArr3[i3]);
                }
                lL1iii r1 = new lL1iii(new C6461l1liI());
                r1.OooO00o(bArr5);
                byte[] bArr6 = new byte[length2];
                r1.OooO0O0(bArr6);
                for (int i4 = length2 - 1; i4 >= 0; i4--) {
                    bArr6[i4] = (byte) (bArr6[i4] ^ bArr4[i4]);
                }
                if (length2 >= length2) {
                    byte[][] OooO00o7 = C5191I1ll.m15336OooO00o(bArr6, length2 - f16451OooO00o.length);
                    byte[] bArr7 = OooO00o7[0];
                    if (C5191I1ll.OooO00o(OooO00o7[1], f16451OooO00o)) {
                        return bArr7;
                    }
                    throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
                }
                throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
            }
            throw new InvalidCipherTextException("Bad Padding: Ciphertext too short.");
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}
