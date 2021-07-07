package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.L11LiIi */
public class L11LiIi implements L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f16121OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16122OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;

    public L11LiIi(AbstractC6436l11LI r1) {
        this.f16121OooO00o = r1;
        this.OooO0OO = new byte[r1.OooO0O0()];
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (i + i2 <= bArr.length) {
            AbstractC6436l11LI r0 = this.f16121OooO00o;
            byte[] bArr2 = this.f16122OooO00o;
            r0.update(bArr2, 0, bArr2.length);
            int i3 = this.OooO00o;
            this.OooO00o = i3 + 1;
            byte[] OooO00o2 = AbstractC6464l1l.OooO00o(i3);
            this.f16121OooO00o.update(OooO00o2, 0, OooO00o2.length);
            byte[] bArr3 = this.OooO0O0;
            if (bArr3 != null) {
                this.f16121OooO00o.update(bArr3, 0, bArr3.length);
            }
            this.f16121OooO00o.OooO00o(this.OooO0OO, 0);
            System.arraycopy(this.OooO0OO, 0, bArr, i, i2);
            C9586iIILl.m21625OooO00o(this.OooO0OO);
            return i2;
        }
        throw new DataLengthException("output buffer too small");
    }

    @Override // com.p118pd.sdk.L
    public AbstractC6436l11LI OooO00o() {
        return this.f16121OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        if (r2 instanceof lii1LIi) {
            lii1LIi lii1lii = (lii1LIi) r2;
            this.f16122OooO00o = lii1lii.OooO0O0();
            this.OooO00o = lii1lii.OooO00o();
            this.OooO0O0 = lii1lii.m17771OooO00o();
            return;
        }
        throw new IllegalArgumentException("unkown parameters type");
    }
}
