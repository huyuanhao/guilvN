package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.ILlILII */
public class ILlILII implements AbstractC6427ii {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15620OooO00o;
    public byte[] OooO0O0;

    public ILlILII(AbstractC6436l11LI r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i2 >= i) {
            long j = ((long) i2) * 8;
            if (j <= ((long) this.OooO00o.OooO0O0()) * 8 * 2147483648L) {
                int OooO0O02 = (int) (j / ((long) this.OooO00o.OooO0O0()));
                int OooO0O03 = this.OooO00o.OooO0O0();
                byte[] bArr2 = new byte[OooO0O03];
                for (int i3 = 1; i3 <= OooO0O02; i3++) {
                    AbstractC6436l11LI r4 = this.OooO00o;
                    byte[] bArr3 = this.f15620OooO00o;
                    r4.update(bArr3, 0, bArr3.length);
                    this.OooO00o.update((byte) (i3 & 255));
                    this.OooO00o.update((byte) ((i3 >> 8) & 255));
                    this.OooO00o.update((byte) ((i3 >> 16) & 255));
                    this.OooO00o.update((byte) ((i3 >> 24) & 255));
                    AbstractC6436l11LI r42 = this.OooO00o;
                    byte[] bArr4 = this.OooO0O0;
                    r42.update(bArr4, 0, bArr4.length);
                    this.OooO00o.OooO00o(bArr2, 0);
                    int i4 = i2 - i;
                    if (i4 > OooO0O03) {
                        System.arraycopy(bArr2, 0, bArr, i, OooO0O03);
                        i += OooO0O03;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i, i4);
                    }
                }
                this.OooO00o.reset();
                return i2;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    public AbstractC6436l11LI OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        if (r2 instanceof C9564i1I1) {
            C9564i1I1 r22 = (C9564i1I1) r2;
            this.f15620OooO00o = r22.OooO0O0();
            this.OooO0O0 = r22.OooO00o();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
