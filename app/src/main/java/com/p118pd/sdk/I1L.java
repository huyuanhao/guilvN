package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.I1L */
public class I1L implements AbstractC6427ii {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f15319OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15320OooO00o;
    public byte[] OooO0O0;

    public I1L(AbstractC6436l11LI r1) {
        this.f15319OooO00o = r1;
        this.OooO00o = r1.OooO0O0();
    }

    private void OooO00o(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3;
        int i4;
        if (bArr.length - i2 >= i) {
            byte[] bArr2 = new byte[this.OooO00o];
            byte[] bArr3 = new byte[4];
            this.f15319OooO00o.reset();
            int i5 = 1;
            if (i2 > this.OooO00o) {
                i3 = 0;
                while (true) {
                    OooO00o(i5, bArr3);
                    this.f15319OooO00o.update(bArr3, 0, 4);
                    AbstractC6436l11LI r6 = this.f15319OooO00o;
                    byte[] bArr4 = this.f15320OooO00o;
                    r6.update(bArr4, 0, bArr4.length);
                    AbstractC6436l11LI r62 = this.f15319OooO00o;
                    byte[] bArr5 = this.OooO0O0;
                    r62.update(bArr5, 0, bArr5.length);
                    this.f15319OooO00o.OooO00o(bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i + i3, this.OooO00o);
                    int i6 = this.OooO00o;
                    i3 += i6;
                    i4 = i5 + 1;
                    if (i5 >= i2 / i6) {
                        break;
                    }
                    i5 = i4;
                }
                i5 = i4;
            } else {
                i3 = 0;
            }
            if (i3 < i2) {
                OooO00o(i5, bArr3);
                this.f15319OooO00o.update(bArr3, 0, 4);
                AbstractC6436l11LI r1 = this.f15319OooO00o;
                byte[] bArr6 = this.f15320OooO00o;
                r1.update(bArr6, 0, bArr6.length);
                AbstractC6436l11LI r12 = this.f15319OooO00o;
                byte[] bArr7 = this.OooO0O0;
                r12.update(bArr7, 0, bArr7.length);
                this.f15319OooO00o.OooO00o(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i + i3, i2 - i3);
            }
            return i2;
        }
        throw new OutputLengthException("output buffer too small");
    }

    public AbstractC6436l11LI OooO00o() {
        return this.f15319OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        if (r2 instanceof C9564i1I1) {
            C9564i1I1 r22 = (C9564i1I1) r2;
            this.f15320OooO00o = r22.OooO0O0();
            this.OooO0O0 = r22.OooO00o();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
