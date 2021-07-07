package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.IlL丨lLl1  reason: invalid class name */
public class IlLlLl1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5600L1iLL f15859OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5611LI1 f15860OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f15861OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15862OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15863OooO00o;

    public IlLlLl1() {
        this(new II1li1Il());
    }

    public IlLlLl1(AbstractC6436l11LI r1) {
        this.f15861OooO00o = r1;
    }

    private BigInteger OooO00o() {
        int bitLength = this.f15859OooO00o.OooO0OO().bitLength();
        while (true) {
            BigInteger bigInteger = new BigInteger(bitLength, this.f15862OooO00o);
            if (!bigInteger.equals(AbstractC5490IlLL.OooO00o) && bigInteger.compareTo(this.f15859OooO00o.OooO0OO()) < 0) {
                return bigInteger;
            }
        }
    }

    private void OooO00o(AbstractC6436l11LI r10, AbstractC9738llL1L r11, byte[] bArr) {
        AbstractC6186iLi1 r3;
        int OooO0O0 = r10.OooO0O0();
        byte[] bArr2 = new byte[Math.max(4, OooO0O0)];
        AbstractC6186iLi1 r4 = null;
        if (r10 instanceof AbstractC6186iLi1) {
            OooO00o(r10, r11.m21802OooO00o());
            OooO00o(r10, r11.m21810OooO0O0());
            r4 = (AbstractC6186iLi1) r10;
            r3 = r4.OooO00o();
        } else {
            r3 = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (r4 != null) {
                r4.OooO00o(r3);
            } else {
                OooO00o(r10, r11.m21802OooO00o());
                OooO00o(r10, r11.m21810OooO0O0());
            }
            i2++;
            AbstractC6464l1l.OooO00o(i2, bArr2, 0);
            r10.update(bArr2, 0, 4);
            r10.OooO00o(bArr2, 0);
            int min = Math.min(OooO0O0, bArr.length - i);
            OooO00o(bArr, bArr2, i, min);
            i += min;
        }
    }

    private void OooO00o(AbstractC6436l11LI r3, AbstractC97441iIIL r4) {
        byte[] OooO00o2 = IIiL.OooO00o(this.OooO00o, r4.m21859OooO00o());
        r3.update(OooO00o2, 0, OooO00o2.length);
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            int i4 = i + i3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3]);
        }
    }

    private boolean OooO00o(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            if (bArr[i2] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int i3 = (this.OooO00o * 2) + 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        AbstractC9738llL1L OooO00o2 = this.f15859OooO00o.OooO00o().OooO00o(bArr2);
        if (!OooO00o2.OooO00o(this.f15859OooO00o.m16004OooO00o()).m21814OooO0OO()) {
            AbstractC9738llL1L OooO0Oo = OooO00o2.OooO00o(((C6512lIilLl) this.f15860OooO00o).OooO00o()).OooO0Oo();
            int OooO0O0 = (i2 - i3) - this.f15861OooO00o.OooO0O0();
            byte[] bArr3 = new byte[OooO0O0];
            int i4 = i + i3;
            System.arraycopy(bArr, i4, bArr3, 0, OooO0O0);
            OooO00o(this.f15861OooO00o, OooO0Oo, bArr3);
            int OooO0O02 = this.f15861OooO00o.OooO0O0();
            byte[] bArr4 = new byte[OooO0O02];
            OooO00o(this.f15861OooO00o, OooO0Oo.m21802OooO00o());
            this.f15861OooO00o.update(bArr3, 0, OooO0O0);
            OooO00o(this.f15861OooO00o, OooO0Oo.m21810OooO0O0());
            this.f15861OooO00o.OooO00o(bArr4, 0);
            int i5 = 0;
            for (int i6 = 0; i6 != OooO0O02; i6++) {
                i5 |= bArr4[i6] ^ bArr[(i4 + OooO0O0) + i6];
            }
            C9586iIILl.OooO00o(bArr2, (byte) 0);
            C9586iIILl.OooO00o(bArr4, (byte) 0);
            if (i5 == 0) {
                return bArr3;
            }
            C9586iIILl.OooO00o(bArr3, (byte) 0);
            throw new InvalidCipherTextException("invalid cipher text");
        }
        throw new InvalidCipherTextException("[h]C1 at infinity");
    }

    private byte[] OooO0OO(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] OooO00o2;
        AbstractC9738llL1L OooO0Oo;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        AbstractC6615lLl1Ii OooO00o3 = m15685OooO00o();
        do {
            BigInteger OooO00o4 = OooO00o();
            OooO00o2 = OooO00o3.OooO00o(this.f15859OooO00o.m16003OooO00o(), OooO00o4).OooO0Oo().m21808OooO00o(false);
            OooO0Oo = ((LL1ii1l) this.f15860OooO00o).OooO00o().OooO00o(OooO00o4).OooO0Oo();
            OooO00o(this.f15861OooO00o, OooO0Oo, bArr2);
        } while (OooO00o(bArr2, bArr, i));
        byte[] bArr3 = new byte[this.f15861OooO00o.OooO0O0()];
        OooO00o(this.f15861OooO00o, OooO0Oo.m21802OooO00o());
        this.f15861OooO00o.update(bArr, i, i2);
        OooO00o(this.f15861OooO00o, OooO0Oo.m21810OooO0O0());
        this.f15861OooO00o.OooO00o(bArr3, 0);
        return C9586iIILl.OooO00o(OooO00o2, bArr2, bArr3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6615lLl1Ii m15685OooO00o() {
        return new C9372Ii1();
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        this.f15863OooO00o = z;
        if (z) {
            liLL1l r32 = (liLL1l) r3;
            C5611LI1 r2 = (C5611LI1) r32.OooO00o();
            this.f15860OooO00o = r2;
            this.f15859OooO00o = r2.OooO00o();
            if (!((LL1ii1l) this.f15860OooO00o).OooO00o().OooO00o(this.f15859OooO00o.m16004OooO00o()).m21814OooO0OO()) {
                this.f15862OooO00o = r32.m17752OooO00o();
            } else {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
        } else {
            C5611LI1 r33 = (C5611LI1) r3;
            this.f15860OooO00o = r33;
            this.f15859OooO00o = r33.OooO00o();
        }
        this.OooO00o = (this.f15859OooO00o.OooO00o().OooO0O0() + 7) / 8;
    }

    public byte[] OooO00o(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.f15863OooO00o ? OooO0OO(bArr, i, i2) : OooO0O0(bArr, i, i2);
    }
}
