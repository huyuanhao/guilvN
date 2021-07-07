package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.Iil丨11  reason: invalid class name and case insensitive filesystem */
public class C5386Iil11 implements AbstractC6427ii {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f15747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f15748OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15749OooO00o;
    public byte[] OooO0O0;

    public C5386Iil11(AbstractC6436l11LI r1) {
        this.f15748OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        boolean z;
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 >= i4) {
            long j = (long) i3;
            int OooO0O02 = this.f15748OooO00o.OooO0O0();
            if (j <= 8589934591L) {
                long j2 = (long) OooO0O02;
                int i5 = (int) (((j + j2) - 1) / j2);
                byte[] bArr2 = new byte[this.f15748OooO00o.OooO0O0()];
                int i6 = 0;
                int i7 = 0;
                int i8 = 1;
                while (i7 < i5) {
                    AbstractC6436l11LI r13 = this.f15748OooO00o;
                    byte[] bArr3 = this.f15749OooO00o;
                    r13.update(bArr3, i6, bArr3.length);
                    iILLL1 r132 = new iILLL1();
                    iILLL1 r14 = new iILLL1();
                    r14.OooO00o(this.f15747OooO00o);
                    r14.OooO00o(new C6487lIIiIlL(AbstractC6464l1l.OooO00o(i8)));
                    r132.OooO00o(new C5707LiL1(r14));
                    if (this.OooO0O0 != null) {
                        z = true;
                        r132.OooO00o(new ILI1Ll(true, i6, new C6487lIIiIlL(this.OooO0O0)));
                    } else {
                        z = true;
                    }
                    r132.OooO00o(new ILI1Ll(z, 2, new C6487lIIiIlL(AbstractC6464l1l.OooO00o(this.OooO00o))));
                    try {
                        byte[] OooO00o2 = new C5707LiL1(r132).OooO00o(AbstractC5533IiL.OooO00o);
                        this.f15748OooO00o.update(OooO00o2, 0, OooO00o2.length);
                        this.f15748OooO00o.OooO00o(bArr2, 0);
                        if (i3 > OooO0O02) {
                            System.arraycopy(bArr2, 0, bArr, i4, OooO0O02);
                            i4 += OooO0O02;
                            i3 -= OooO0O02;
                        } else {
                            System.arraycopy(bArr2, 0, bArr, i4, i3);
                        }
                        i8++;
                        i7++;
                        i6 = 0;
                    } catch (IOException e) {
                        throw new IllegalArgumentException("unable to encode parameter info: " + e.getMessage());
                    }
                }
                this.f15748OooO00o.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    public AbstractC6436l11LI OooO00o() {
        return this.f15748OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        C5525ILli1 r22 = (C5525ILli1) r2;
        this.f15747OooO00o = r22.m15798OooO00o();
        this.OooO00o = r22.OooO00o();
        this.f15749OooO00o = r22.OooO0O0();
        this.OooO0O0 = r22.m15799OooO00o();
    }
}
