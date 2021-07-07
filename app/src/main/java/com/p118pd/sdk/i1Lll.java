package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.i1L丨ll  reason: invalid class name */
public class i1Lll implements L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f17390OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17391OooO00o;
    public byte[] OooO0O0;

    public i1Lll(int i, AbstractC6436l11LI r2) {
        this.OooO00o = i;
        this.f17390OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 >= i4) {
            long j = (long) i3;
            int OooO0O02 = this.f17390OooO00o.OooO0O0();
            if (j <= 8589934591L) {
                long j2 = (long) OooO0O02;
                int i5 = (int) (((j + j2) - 1) / j2);
                byte[] bArr2 = new byte[this.f17390OooO00o.OooO0O0()];
                byte[] bArr3 = new byte[4];
                AbstractC6464l1l.OooO00o(this.OooO00o, bArr3, 0);
                int i6 = this.OooO00o & -256;
                for (int i7 = 0; i7 < i5; i7++) {
                    AbstractC6436l11LI r14 = this.f17390OooO00o;
                    byte[] bArr4 = this.f17391OooO00o;
                    r14.update(bArr4, 0, bArr4.length);
                    this.f17390OooO00o.update(bArr3, 0, 4);
                    byte[] bArr5 = this.OooO0O0;
                    if (bArr5 != null) {
                        this.f17390OooO00o.update(bArr5, 0, bArr5.length);
                    }
                    this.f17390OooO00o.OooO00o(bArr2, 0);
                    if (i3 > OooO0O02) {
                        System.arraycopy(bArr2, 0, bArr, i4, OooO0O02);
                        i4 += OooO0O02;
                        i3 -= OooO0O02;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i4, i3);
                    }
                    byte b = (byte) (bArr3[3] + 1);
                    bArr3[3] = b;
                    if (b == 0) {
                        i6 += 256;
                        AbstractC6464l1l.OooO00o(i6, bArr3, 0);
                    }
                }
                this.f17390OooO00o.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    @Override // com.p118pd.sdk.L
    public AbstractC6436l11LI OooO00o() {
        return this.f17390OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        if (r2 instanceof C9564i1I1) {
            C9564i1I1 r22 = (C9564i1I1) r2;
            this.f17391OooO00o = r22.OooO0O0();
            this.OooO0O0 = r22.OooO00o();
        } else if (r2 instanceof C5820Lll) {
            this.f17391OooO00o = ((C5820Lll) r2).OooO00o();
            this.OooO0O0 = null;
        } else {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
    }
}
