package com.p118pd.sdk;

import java.security.SecureRandom;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨liLI丨  reason: invalid class name and case insensitive filesystem */
public class C9705liLI implements AbstractC9875iiI {
    public static final byte[] OooO0OO = {74, -35, -94, 44, 121, -24, PublicSuffixDatabase.EXCEPTION_MARKER, 5};
    public C6274iilL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f23335OooO00o = C5427IlI1.OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6642li1LI f23336OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6927lll1 f23337OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23338OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23339OooO00o;
    public byte[] OooO0O0 = new byte[20];

    private boolean OooO00o(byte[] bArr, byte[] bArr2) {
        return C9586iIILl.OooO0O0(OooO00o(bArr), bArr2);
    }

    private byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f23335OooO00o.update(bArr, 0, bArr.length);
        this.f23335OooO00o.OooO00o(this.OooO0O0, 0);
        System.arraycopy(this.OooO0O0, 0, bArr2, 0, 8);
        return bArr2;
    }

    public static byte[] OooO0O0(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            bArr2[i] = bArr[bArr.length - i2];
            i = i2;
        }
        return bArr2;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return "DESede";
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r5) {
        SecureRandom secureRandom;
        this.f23338OooO00o = z;
        this.f23337OooO00o = new C6927lll1(new C1LliI());
        if (r5 instanceof liLL1l) {
            liLL1l r52 = (liLL1l) r5;
            AbstractC6370iIIIl OooO00o2 = r52.OooO00o();
            SecureRandom OooO00o3 = r52.m17752OooO00o();
            r5 = OooO00o2;
            secureRandom = OooO00o3;
        } else {
            secureRandom = IIllii.OooO00o();
        }
        if (r5 instanceof C6642li1LI) {
            this.f23336OooO00o = (C6642li1LI) r5;
            if (this.f23338OooO00o) {
                byte[] bArr = new byte[8];
                this.f23339OooO00o = bArr;
                secureRandom.nextBytes(bArr);
                this.OooO00o = new C6274iilL1L(this.f23336OooO00o, this.f23339OooO00o);
            }
        } else if (r5 instanceof C6274iilL1L) {
            C6274iilL1L r53 = (C6274iilL1L) r5;
            this.OooO00o = r53;
            this.f23339OooO00o = r53.m17301OooO00o();
            this.f23336OooO00o = (C6642li1LI) this.OooO00o.OooO00o();
            if (this.f23338OooO00o) {
                byte[] bArr2 = this.f23339OooO00o;
                if (bArr2 == null || bArr2.length != 8) {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
                return;
            }
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (this.f23338OooO00o) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            byte[] OooO00o2 = OooO00o(bArr2);
            int length = OooO00o2.length + i2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(OooO00o2, 0, bArr3, i2, OooO00o2.length);
            int OooO00o3 = this.f23337OooO00o.OooO00o();
            if (length % OooO00o3 == 0) {
                this.f23337OooO00o.OooO00o(true, this.OooO00o);
                byte[] bArr4 = new byte[length];
                for (int i3 = 0; i3 != length; i3 += OooO00o3) {
                    this.f23337OooO00o.OooO00o(bArr3, i3, bArr4, i3);
                }
                byte[] bArr5 = this.f23339OooO00o;
                byte[] bArr6 = new byte[(bArr5.length + length)];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                System.arraycopy(bArr4, 0, bArr6, this.f23339OooO00o.length, length);
                byte[] OooO0O02 = OooO0O0(bArr6);
                this.f23337OooO00o.OooO00o(true, new C6274iilL1L(this.f23336OooO00o, OooO0OO));
                for (int i4 = 0; i4 != OooO0O02.length; i4 += OooO00o3) {
                    this.f23337OooO00o.OooO00o(OooO0O02, i4, OooO0O02, i4);
                }
                return OooO0O02;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f23338OooO00o) {
            throw new IllegalStateException("Not set for unwrapping");
        } else if (bArr != null) {
            int OooO00o2 = this.f23337OooO00o.OooO00o();
            if (i2 % OooO00o2 == 0) {
                this.f23337OooO00o.OooO00o(false, new C6274iilL1L(this.f23336OooO00o, OooO0OO));
                byte[] bArr2 = new byte[i2];
                for (int i3 = 0; i3 != i2; i3 += OooO00o2) {
                    this.f23337OooO00o.OooO00o(bArr, i + i3, bArr2, i3);
                }
                byte[] OooO0O02 = OooO0O0(bArr2);
                byte[] bArr3 = new byte[8];
                this.f23339OooO00o = bArr3;
                int length = OooO0O02.length - 8;
                byte[] bArr4 = new byte[length];
                System.arraycopy(OooO0O02, 0, bArr3, 0, 8);
                System.arraycopy(OooO0O02, 8, bArr4, 0, OooO0O02.length - 8);
                C6274iilL1L r7 = new C6274iilL1L(this.f23336OooO00o, this.f23339OooO00o);
                this.OooO00o = r7;
                this.f23337OooO00o.OooO00o(false, r7);
                byte[] bArr5 = new byte[length];
                for (int i4 = 0; i4 != length; i4 += OooO00o2) {
                    this.f23337OooO00o.OooO00o(bArr4, i4, bArr5, i4);
                }
                int i5 = length - 8;
                byte[] bArr6 = new byte[i5];
                byte[] bArr7 = new byte[8];
                System.arraycopy(bArr5, 0, bArr6, 0, i5);
                System.arraycopy(bArr5, i5, bArr7, 0, 8);
                if (OooO00o(bArr6, bArr7)) {
                    return bArr6;
                }
                throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
            }
            throw new InvalidCipherTextException("Ciphertext not multiple of " + OooO00o2);
        } else {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
    }
}
