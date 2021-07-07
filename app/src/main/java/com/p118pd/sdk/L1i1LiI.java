package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨L1i1LiI  reason: invalid class name */
public class L1i1LiI implements Ii1IliL {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f23032OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23033OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23034OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23035OooO00o;

    public L1i1LiI(Ii1IliL r3) {
        this(r3, C5427IlI1.OooO0O0(), null);
    }

    public L1i1LiI(Ii1IliL r2, AbstractC6436l11LI r3) {
        this(r2, r3, null);
    }

    public L1i1LiI(Ii1IliL r1, AbstractC6436l11LI r2, AbstractC6436l11LI r3, byte[] bArr) {
        this.f23032OooO00o = r1;
        this.OooO00o = r3;
        this.f23035OooO00o = new byte[r2.OooO0O0()];
        r2.reset();
        if (bArr != null) {
            r2.update(bArr, 0, bArr.length);
        }
        r2.OooO00o(this.f23035OooO00o, 0);
    }

    public L1i1LiI(Ii1IliL r1, AbstractC6436l11LI r2, byte[] bArr) {
        this(r1, r2, r2, bArr);
    }

    private void OooO00o(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    private byte[] OooO00o(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int OooO0O0 = this.OooO00o.OooO0O0();
        byte[] bArr3 = new byte[OooO0O0];
        byte[] bArr4 = new byte[4];
        this.OooO00o.reset();
        int i4 = 0;
        while (i4 < i3 / OooO0O0) {
            OooO00o(i4, bArr4);
            this.OooO00o.update(bArr, i, i2);
            this.OooO00o.update(bArr4, 0, 4);
            this.OooO00o.OooO00o(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i4 * OooO0O0, OooO0O0);
            i4++;
        }
        int i5 = OooO0O0 * i4;
        if (i5 < i3) {
            OooO00o(i4, bArr4);
            this.OooO00o.update(bArr, i, i2);
            this.OooO00o.update(bArr4, 0, 4);
            this.OooO00o.OooO00o(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        int OooO00o2 = this.f23032OooO00o.OooO00o();
        return this.f23034OooO00o ? (OooO00o2 - 1) - (this.f23035OooO00o.length * 2) : OooO00o2;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ii1IliL m21518OooO00o() {
        return this.f23032OooO00o;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        this.f23033OooO00o = r3 instanceof liLL1l ? ((liLL1l) r3).m17752OooO00o() : IIllii.OooO00o();
        this.f23032OooO00o.OooO00o(z, r3);
        this.f23034OooO00o = z;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.f23034OooO00o ? OooO0OO(bArr, i, i2) : OooO0O0(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        int OooO0O0 = this.f23032OooO00o.OooO0O0();
        return this.f23034OooO00o ? OooO0O0 : (OooO0O0 - 1) - (this.f23035OooO00o.length * 2);
    }

    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] OooO00o2 = this.f23032OooO00o.OooO00o(bArr, i, i2);
        int OooO0O0 = this.f23032OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O0];
        System.arraycopy(OooO00o2, 0, bArr4, OooO0O0 - OooO00o2.length, OooO00o2.length);
        boolean z = OooO0O0 < (this.f23035OooO00o.length * 2) + 1;
        byte[] bArr5 = this.f23035OooO00o;
        byte[] OooO00o3 = OooO00o(bArr4, bArr5.length, OooO0O0 - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.f23035OooO00o;
            if (i3 == bArr2.length) {
                break;
            }
            bArr4[i3] = (byte) (bArr4[i3] ^ OooO00o3[i3]);
            i3++;
        }
        byte[] OooO00o4 = OooO00o(bArr4, 0, bArr2.length, OooO0O0 - bArr2.length);
        for (int length = this.f23035OooO00o.length; length != OooO0O0; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ OooO00o4[length - this.f23035OooO00o.length]);
        }
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            bArr3 = this.f23035OooO00o;
            if (i4 == bArr3.length) {
                break;
            }
            if (bArr3[i4] != bArr4[bArr3.length + i4]) {
                z2 = true;
            }
            i4++;
        }
        int i5 = OooO0O0;
        for (int length2 = bArr3.length * 2; length2 != OooO0O0; length2++) {
            if ((bArr4[length2] != 0) && (i5 == OooO0O0)) {
                i5 = length2;
            }
        }
        boolean z3 = i5 > OooO0O0 + -1;
        boolean z4 = bArr4[i5] != 1;
        int i6 = i5 + 1;
        if ((!z && !z2) && (!z3 && !z4)) {
            int i7 = OooO0O0 - i6;
            byte[] bArr6 = new byte[i7];
            System.arraycopy(bArr4, i6, bArr6, 0, i7);
            return bArr6;
        }
        C9586iIILl.OooO00o(bArr4, (byte) 0);
        throw new InvalidCipherTextException("data wrong");
    }

    public byte[] OooO0OO(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (i2 <= OooO00o()) {
            int OooO00o2 = OooO00o() + 1 + (this.f23035OooO00o.length * 2);
            byte[] bArr2 = new byte[OooO00o2];
            int i3 = OooO00o2 - i2;
            System.arraycopy(bArr, i, bArr2, i3, i2);
            bArr2[i3 - 1] = 1;
            byte[] bArr3 = this.f23035OooO00o;
            System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
            int length = this.f23035OooO00o.length;
            byte[] bArr4 = new byte[length];
            this.f23033OooO00o.nextBytes(bArr4);
            byte[] OooO00o3 = OooO00o(bArr4, 0, length, OooO00o2 - this.f23035OooO00o.length);
            for (int length2 = this.f23035OooO00o.length; length2 != OooO00o2; length2++) {
                bArr2[length2] = (byte) (bArr2[length2] ^ OooO00o3[length2 - this.f23035OooO00o.length]);
            }
            System.arraycopy(bArr4, 0, bArr2, 0, this.f23035OooO00o.length);
            byte[] bArr5 = this.f23035OooO00o;
            byte[] OooO00o4 = OooO00o(bArr2, bArr5.length, OooO00o2 - bArr5.length, bArr5.length);
            for (int i4 = 0; i4 != this.f23035OooO00o.length; i4++) {
                bArr2[i4] = (byte) (bArr2[i4] ^ OooO00o4[i4]);
            }
            return this.f23032OooO00o.OooO00o(bArr2, 0, OooO00o2);
        }
        throw new DataLengthException("input data too long");
    }
}
