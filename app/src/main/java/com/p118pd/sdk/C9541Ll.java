package com.p118pd.sdk;

import java.util.ArrayList;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨Ll丨丨丨  reason: invalid class name and case insensitive filesystem */
public class C9541Ll implements AbstractC9875iiI {
    public static final int OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iIii f23110OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<byte[]> f23111OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23112OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23113OooO00o;
    public byte[] OooO0O0 = new byte[4];
    public byte[] OooO0OO = new byte[this.f23110OooO00o.m15291OooO00o()];
    public byte[] OooO0Oo = new byte[this.f23110OooO00o.m15291OooO00o()];

    public C9541Ll(int i) {
        I1iIii i1iIii = new I1iIii(i);
        this.f23110OooO00o = i1iIii;
        this.f23113OooO00o = new byte[(i1iIii.m15291OooO00o() / 2)];
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return "DSTU7624WrapEngine";
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        if (r3 instanceof liLL1l) {
            r3 = ((liLL1l) r3).OooO00o();
        }
        this.f23112OooO00o = z;
        if (r3 instanceof C6642li1LI) {
            this.f23110OooO00o.OooO00o(z, r3);
            return;
        }
        throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (!this.f23112OooO00o) {
            throw new IllegalStateException("not set for wrapping");
        } else if (i2 % this.f23110OooO00o.m15291OooO00o() != 0) {
            throw new DataLengthException("wrap data must be a multiple of " + this.f23110OooO00o.m15291OooO00o() + " bytes");
        } else if (i + i2 <= bArr.length) {
            int OooO00o2 = ((i2 / this.f23110OooO00o.m15291OooO00o()) + 1) * 2;
            int i3 = OooO00o2 - 1;
            int i4 = i3 * 6;
            int OooO00o3 = this.f23110OooO00o.m15291OooO00o() + i2;
            byte[] bArr2 = new byte[OooO00o3];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            System.arraycopy(bArr2, 0, this.f23113OooO00o, 0, this.f23110OooO00o.m15291OooO00o() / 2);
            this.f23111OooO00o.clear();
            int OooO00o4 = OooO00o3 - (this.f23110OooO00o.m15291OooO00o() / 2);
            int OooO00o5 = this.f23110OooO00o.m15291OooO00o() / 2;
            while (OooO00o4 != 0) {
                byte[] bArr3 = new byte[(this.f23110OooO00o.m15291OooO00o() / 2)];
                System.arraycopy(bArr2, OooO00o5, bArr3, 0, this.f23110OooO00o.m15291OooO00o() / 2);
                this.f23111OooO00o.add(bArr3);
                OooO00o4 -= this.f23110OooO00o.m15291OooO00o() / 2;
                OooO00o5 += this.f23110OooO00o.m15291OooO00o() / 2;
            }
            int i5 = 0;
            while (i5 < i4) {
                System.arraycopy(this.f23113OooO00o, 0, bArr2, 0, this.f23110OooO00o.m15291OooO00o() / 2);
                System.arraycopy(this.f23111OooO00o.get(0), 0, bArr2, this.f23110OooO00o.m15291OooO00o() / 2, this.f23110OooO00o.m15291OooO00o() / 2);
                this.f23110OooO00o.m15292OooO00o(bArr2, 0, bArr2, 0);
                i5++;
                OooO00o(i5, this.OooO0O0, 0);
                for (int i6 = 0; i6 < 4; i6++) {
                    int OooO00o6 = (this.f23110OooO00o.m15291OooO00o() / 2) + i6;
                    bArr2[OooO00o6] = (byte) (bArr2[OooO00o6] ^ this.OooO0O0[i6]);
                }
                System.arraycopy(bArr2, this.f23110OooO00o.m15291OooO00o() / 2, this.f23113OooO00o, 0, this.f23110OooO00o.m15291OooO00o() / 2);
                for (int i7 = 2; i7 < OooO00o2; i7++) {
                    System.arraycopy(this.f23111OooO00o.get(i7 - 1), 0, this.f23111OooO00o.get(i7 - 2), 0, this.f23110OooO00o.m15291OooO00o() / 2);
                }
                System.arraycopy(bArr2, 0, this.f23111OooO00o.get(OooO00o2 - 2), 0, this.f23110OooO00o.m15291OooO00o() / 2);
            }
            System.arraycopy(this.f23113OooO00o, 0, bArr2, 0, this.f23110OooO00o.m15291OooO00o() / 2);
            int OooO00o7 = this.f23110OooO00o.m15291OooO00o() / 2;
            for (int i8 = 0; i8 < i3; i8++) {
                System.arraycopy(this.f23111OooO00o.get(i8), 0, bArr2, OooO00o7, this.f23110OooO00o.m15291OooO00o() / 2);
                OooO00o7 += this.f23110OooO00o.m15291OooO00o() / 2;
            }
            return bArr2;
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f23112OooO00o) {
            throw new IllegalStateException("not set for unwrapping");
        } else if (i2 % this.f23110OooO00o.m15291OooO00o() == 0) {
            int OooO00o2 = (i2 * 2) / this.f23110OooO00o.m15291OooO00o();
            int i3 = OooO00o2 - 1;
            int i4 = i3 * 6;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            byte[] bArr3 = new byte[(this.f23110OooO00o.m15291OooO00o() / 2)];
            System.arraycopy(bArr2, 0, bArr3, 0, this.f23110OooO00o.m15291OooO00o() / 2);
            this.f23111OooO00o.clear();
            int OooO00o3 = i2 - (this.f23110OooO00o.m15291OooO00o() / 2);
            int OooO00o4 = this.f23110OooO00o.m15291OooO00o() / 2;
            while (OooO00o3 != 0) {
                byte[] bArr4 = new byte[(this.f23110OooO00o.m15291OooO00o() / 2)];
                System.arraycopy(bArr2, OooO00o4, bArr4, 0, this.f23110OooO00o.m15291OooO00o() / 2);
                this.f23111OooO00o.add(bArr4);
                OooO00o3 -= this.f23110OooO00o.m15291OooO00o() / 2;
                OooO00o4 += this.f23110OooO00o.m15291OooO00o() / 2;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                System.arraycopy(this.f23111OooO00o.get(OooO00o2 - 2), 0, bArr2, 0, this.f23110OooO00o.m15291OooO00o() / 2);
                System.arraycopy(bArr3, 0, bArr2, this.f23110OooO00o.m15291OooO00o() / 2, this.f23110OooO00o.m15291OooO00o() / 2);
                OooO00o(i4 - i5, this.OooO0O0, 0);
                for (int i6 = 0; i6 < 4; i6++) {
                    int OooO00o5 = (this.f23110OooO00o.m15291OooO00o() / 2) + i6;
                    bArr2[OooO00o5] = (byte) (bArr2[OooO00o5] ^ this.OooO0O0[i6]);
                }
                this.f23110OooO00o.m15292OooO00o(bArr2, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr3, 0, this.f23110OooO00o.m15291OooO00o() / 2);
                for (int i7 = 2; i7 < OooO00o2; i7++) {
                    int i8 = OooO00o2 - i7;
                    System.arraycopy(this.f23111OooO00o.get(i8 - 1), 0, this.f23111OooO00o.get(i8), 0, this.f23110OooO00o.m15291OooO00o() / 2);
                }
                System.arraycopy(bArr2, this.f23110OooO00o.m15291OooO00o() / 2, this.f23111OooO00o.get(0), 0, this.f23110OooO00o.m15291OooO00o() / 2);
            }
            System.arraycopy(bArr3, 0, bArr2, 0, this.f23110OooO00o.m15291OooO00o() / 2);
            int OooO00o6 = this.f23110OooO00o.m15291OooO00o() / 2;
            for (int i9 = 0; i9 < i3; i9++) {
                System.arraycopy(this.f23111OooO00o.get(i9), 0, bArr2, OooO00o6, this.f23110OooO00o.m15291OooO00o() / 2);
                OooO00o6 += this.f23110OooO00o.m15291OooO00o() / 2;
            }
            System.arraycopy(bArr2, i2 - this.f23110OooO00o.m15291OooO00o(), this.OooO0OO, 0, this.f23110OooO00o.m15291OooO00o());
            byte[] bArr5 = new byte[(i2 - this.f23110OooO00o.m15291OooO00o())];
            if (C9586iIILl.m21627OooO00o(this.OooO0OO, this.OooO0Oo)) {
                System.arraycopy(bArr2, 0, bArr5, 0, i2 - this.f23110OooO00o.m15291OooO00o());
                return bArr5;
            }
            throw new InvalidCipherTextException("checksum failed");
        } else {
            throw new DataLengthException("unwrap data must be a multiple of " + this.f23110OooO00o.m15291OooO00o() + " bytes");
        }
    }
}
