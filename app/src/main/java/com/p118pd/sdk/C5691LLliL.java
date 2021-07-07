package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.LL丨liL  reason: invalid class name and case insensitive filesystem */
public class C5691LLliL implements AbstractC9875iiI {
    public C6274iilL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6927lll1 f16534OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16535OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16536OooO00o;

    public C5691LLliL(li1l11I1 li1l11i1) {
        this.f16534OooO00o = new C6927lll1(li1l11i1);
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return this.f16534OooO00o.m18073OooO00o().m17732OooO00o() + "/RFC3211Wrap";
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        this.f16536OooO00o = z;
        if (r3 instanceof liLL1l) {
            liLL1l r32 = (liLL1l) r3;
            this.f16535OooO00o = r32.m17752OooO00o();
            this.OooO00o = (C6274iilL1L) r32.OooO00o();
            return;
        }
        if (z) {
            this.f16535OooO00o = IIllii.OooO00o();
        }
        this.OooO00o = (C6274iilL1L) r3;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (this.f16536OooO00o) {
            this.f16534OooO00o.OooO00o(true, this.OooO00o);
            int OooO00o2 = this.f16534OooO00o.OooO00o();
            int i3 = i2 + 4;
            int i4 = OooO00o2 * 2;
            if (i3 >= i4) {
                i4 = i3 % OooO00o2 == 0 ? i3 : ((i3 / OooO00o2) + 1) * OooO00o2;
            }
            byte[] bArr2 = new byte[i4];
            bArr2[0] = (byte) i2;
            bArr2[1] = (byte) (bArr[i] ^ -1);
            bArr2[2] = (byte) (bArr[i + 1] ^ -1);
            bArr2[3] = (byte) (bArr[i + 2] ^ -1);
            System.arraycopy(bArr, i, bArr2, 4, i2);
            int length = bArr2.length - i3;
            byte[] bArr3 = new byte[length];
            this.f16535OooO00o.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            for (int i5 = 0; i5 < bArr2.length; i5 += OooO00o2) {
                this.f16534OooO00o.OooO00o(bArr2, i5, bArr2, i5);
            }
            for (int i6 = 0; i6 < bArr2.length; i6 += OooO00o2) {
                this.f16534OooO00o.OooO00o(bArr2, i6, bArr2, i6);
            }
            return bArr2;
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.f16536OooO00o) {
            int OooO00o2 = this.f16534OooO00o.OooO00o();
            if (i2 >= OooO00o2 * 2) {
                byte[] bArr2 = new byte[i2];
                byte[] bArr3 = new byte[OooO00o2];
                int i3 = 0;
                System.arraycopy(bArr, i, bArr2, 0, i2);
                System.arraycopy(bArr, i, bArr3, 0, OooO00o2);
                this.f16534OooO00o.OooO00o(false, new C6274iilL1L(this.OooO00o.OooO00o(), bArr3));
                for (int i4 = OooO00o2; i4 < i2; i4 += OooO00o2) {
                    this.f16534OooO00o.OooO00o(bArr2, i4, bArr2, i4);
                }
                System.arraycopy(bArr2, i2 - OooO00o2, bArr3, 0, OooO00o2);
                this.f16534OooO00o.OooO00o(false, new C6274iilL1L(this.OooO00o.OooO00o(), bArr3));
                this.f16534OooO00o.OooO00o(bArr2, 0, bArr2, 0);
                this.f16534OooO00o.OooO00o(false, this.OooO00o);
                for (int i5 = 0; i5 < i2; i5 += OooO00o2) {
                    this.f16534OooO00o.OooO00o(bArr2, i5, bArr2, i5);
                }
                if ((bArr2[0] & 255) <= i2 - 4) {
                    byte[] bArr4 = new byte[(bArr2[0] & 255)];
                    System.arraycopy(bArr2, 4, bArr4, 0, bArr2[0]);
                    int i6 = 0;
                    while (i3 != 3) {
                        int i7 = i3 + 1;
                        i6 |= ((byte) (bArr2[i7] ^ -1)) ^ bArr4[i3];
                        i3 = i7;
                    }
                    if (i6 == 0) {
                        return bArr4;
                    }
                    throw new InvalidCipherTextException("wrapped key fails checksum");
                }
                throw new InvalidCipherTextException("wrapped key corrupted");
            }
            throw new InvalidCipherTextException("input too short");
        }
        throw new IllegalStateException("not set for unwrapping");
    }
}
