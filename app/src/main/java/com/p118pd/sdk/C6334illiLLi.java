package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.illiLL丨i  reason: invalid class name and case insensitive filesystem */
public class C6334illiLLi implements AbstractC6427ii {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18073OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18074OooO00o;

    public C6334illiLLi(AbstractC6436l11LI r1) {
        this.f18073OooO00o = r1;
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
        if (bArr.length - i2 >= i) {
            byte[] bArr2 = new byte[this.OooO00o];
            byte[] bArr3 = new byte[4];
            this.f18073OooO00o.reset();
            if (i2 > this.OooO00o) {
                i3 = 0;
                do {
                    OooO00o(i3, bArr3);
                    AbstractC6436l11LI r5 = this.f18073OooO00o;
                    byte[] bArr4 = this.f18074OooO00o;
                    r5.update(bArr4, 0, bArr4.length);
                    this.f18073OooO00o.update(bArr3, 0, 4);
                    this.f18073OooO00o.OooO00o(bArr2, 0);
                    int i4 = this.OooO00o;
                    System.arraycopy(bArr2, 0, bArr, (i3 * i4) + i, i4);
                    i3++;
                } while (i3 < i2 / this.OooO00o);
            } else {
                i3 = 0;
            }
            if (this.OooO00o * i3 < i2) {
                OooO00o(i3, bArr3);
                AbstractC6436l11LI r52 = this.f18073OooO00o;
                byte[] bArr5 = this.f18074OooO00o;
                r52.update(bArr5, 0, bArr5.length);
                this.f18073OooO00o.update(bArr3, 0, 4);
                this.f18073OooO00o.OooO00o(bArr2, 0);
                int i5 = this.OooO00o;
                System.arraycopy(bArr2, 0, bArr, i + (i3 * i5), i2 - (i3 * i5));
            }
            return i2;
        }
        throw new OutputLengthException("output buffer too small");
    }

    public AbstractC6436l11LI OooO00o() {
        return this.f18073OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        if (r2 instanceof C6624lL) {
            this.f18074OooO00o = ((C6624lL) r2).OooO00o();
            return;
        }
        throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
    }
}
