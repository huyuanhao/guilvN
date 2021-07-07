package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.security.SecureRandom;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.I丨丨1I  reason: invalid class name and case insensitive filesystem */
public class C5565I1I implements AbstractC9875iiI {
    public static final byte[] OooO0OO = {74, -35, -94, 44, 121, -24, PublicSuffixDatabase.EXCEPTION_MARKER, 5};
    public C6274iilL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6370iIIIl f16092OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f16093OooO00o = C5427IlI1.OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6927lll1 f16094OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16095OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16096OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16097OooO00o;
    public byte[] OooO0O0 = new byte[20];

    private boolean OooO00o(byte[] bArr, byte[] bArr2) {
        return C9586iIILl.OooO0O0(OooO00o(bArr), bArr2);
    }

    private byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f16093OooO00o.update(bArr, 0, bArr.length);
        this.f16093OooO00o.OooO00o(this.OooO0O0, 0);
        System.arraycopy(this.OooO0O0, 0, bArr2, 0, 8);
        return bArr2;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return "RC2";
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        this.f16096OooO00o = z;
        this.f16094OooO00o = new C6927lll1(new C5591L1l());
        if (r3 instanceof liLL1l) {
            liLL1l r32 = (liLL1l) r3;
            this.f16095OooO00o = r32.m17752OooO00o();
            r3 = r32.OooO00o();
        } else {
            this.f16095OooO00o = IIllii.OooO00o();
        }
        if (r3 instanceof C6274iilL1L) {
            C6274iilL1L r33 = (C6274iilL1L) r3;
            this.OooO00o = r33;
            this.f16097OooO00o = r33.m17301OooO00o();
            this.f16092OooO00o = this.OooO00o.OooO00o();
            if (this.f16096OooO00o) {
                byte[] bArr = this.f16097OooO00o;
                if (bArr == null || bArr.length != 8) {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
                return;
            }
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        this.f16092OooO00o = r3;
        if (this.f16096OooO00o) {
            byte[] bArr2 = new byte[8];
            this.f16097OooO00o = bArr2;
            this.f16095OooO00o.nextBytes(bArr2);
            this.OooO00o = new C6274iilL1L(this.f16092OooO00o, this.f16097OooO00o);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (this.f16096OooO00o) {
            int i3 = i2 + 1;
            int i4 = i3 % 8;
            int i5 = i4 != 0 ? (8 - i4) + i3 : i3;
            byte[] bArr2 = new byte[i5];
            bArr2[0] = (byte) i2;
            System.arraycopy(bArr, i, bArr2, 1, i2);
            int i6 = (i5 - i2) - 1;
            byte[] bArr3 = new byte[i6];
            if (i6 > 0) {
                this.f16095OooO00o.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i3, i6);
            }
            byte[] OooO00o2 = OooO00o(bArr2);
            int length = OooO00o2.length + i5;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, i5);
            System.arraycopy(OooO00o2, 0, bArr4, i5, OooO00o2.length);
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr4, 0, bArr5, 0, length);
            int OooO00o3 = length / this.f16094OooO00o.OooO00o();
            if (length % this.f16094OooO00o.OooO00o() == 0) {
                this.f16094OooO00o.OooO00o(true, this.OooO00o);
                for (int i7 = 0; i7 < OooO00o3; i7++) {
                    int OooO00o4 = this.f16094OooO00o.OooO00o() * i7;
                    this.f16094OooO00o.OooO00o(bArr5, OooO00o4, bArr5, OooO00o4);
                }
                byte[] bArr6 = this.f16097OooO00o;
                int length2 = bArr6.length + length;
                byte[] bArr7 = new byte[length2];
                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                System.arraycopy(bArr5, 0, bArr7, this.f16097OooO00o.length, length);
                byte[] bArr8 = new byte[length2];
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = i8 + 1;
                    bArr8[i8] = bArr7[length2 - i9];
                    i8 = i9;
                }
                this.f16094OooO00o.OooO00o(true, new C6274iilL1L(this.f16092OooO00o, OooO0OO));
                for (int i10 = 0; i10 < OooO00o3 + 1; i10++) {
                    int OooO00o5 = this.f16094OooO00o.OooO00o() * i10;
                    this.f16094OooO00o.OooO00o(bArr8, OooO00o5, bArr8, OooO00o5);
                }
                return bArr8;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f16096OooO00o) {
            throw new IllegalStateException("Not set for unwrapping");
        } else if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        } else if (i2 % this.f16094OooO00o.OooO00o() == 0) {
            this.f16094OooO00o.OooO00o(false, new C6274iilL1L(this.f16092OooO00o, OooO0OO));
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            for (int i3 = 0; i3 < i2 / this.f16094OooO00o.OooO00o(); i3++) {
                int OooO00o2 = this.f16094OooO00o.OooO00o() * i3;
                this.f16094OooO00o.OooO00o(bArr2, OooO00o2, bArr2, OooO00o2);
            }
            byte[] bArr3 = new byte[i2];
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                bArr3[i4] = bArr2[i2 - i5];
                i4 = i5;
            }
            byte[] bArr4 = new byte[8];
            this.f16097OooO00o = bArr4;
            int i6 = i2 - 8;
            byte[] bArr5 = new byte[i6];
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            System.arraycopy(bArr3, 8, bArr5, 0, i6);
            C6274iilL1L r5 = new C6274iilL1L(this.f16092OooO00o, this.f16097OooO00o);
            this.OooO00o = r5;
            this.f16094OooO00o.OooO00o(false, r5);
            byte[] bArr6 = new byte[i6];
            System.arraycopy(bArr5, 0, bArr6, 0, i6);
            for (int i7 = 0; i7 < i6 / this.f16094OooO00o.OooO00o(); i7++) {
                int OooO00o3 = this.f16094OooO00o.OooO00o() * i7;
                this.f16094OooO00o.OooO00o(bArr6, OooO00o3, bArr6, OooO00o3);
            }
            int i8 = i6 - 8;
            byte[] bArr7 = new byte[i8];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr6, 0, bArr7, 0, i8);
            System.arraycopy(bArr6, i8, bArr8, 0, 8);
            if (!OooO00o(bArr7, bArr8)) {
                throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
            } else if (i8 - ((bArr7[0] & 255) + 1) <= 7) {
                byte b = bArr7[0];
                byte[] bArr9 = new byte[b];
                System.arraycopy(bArr7, 1, bArr9, 0, b);
                return bArr9;
            } else {
                throw new InvalidCipherTextException("too many pad bytes (" + (i8 - ((bArr7[0] & 255) + 1)) + C3848l.f10402t);
            }
        } else {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.f16094OooO00o.OooO00o());
        }
    }
}
