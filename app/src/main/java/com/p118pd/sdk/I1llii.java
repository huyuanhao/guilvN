package com.p118pd.sdk;

import org.bouncycastle.util.MemoableResetException;

/* renamed from: com.pd.sdk.I1llii */
public class I1llii extends LLILL {
    public int OooO0Oo;
    public long OooOO0O;
    public long OooOO0o;
    public long OooOOO;
    public long OooOOO0;
    public long OooOOOO;
    public long OooOOOo;
    public long OooOOo;
    public long OooOOo0;

    public I1llii(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        } else if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        } else if (i != 384) {
            int i2 = i / 8;
            this.OooO0Oo = i2;
            OooO00o(i2 * 8);
            reset();
        } else {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
    }

    public I1llii(I1llii i1llii) {
        super(i1llii);
        this.OooO0Oo = i1llii.OooO0Oo;
        OooO00o((AbstractC6186iLi1) i1llii);
    }

    public I1llii(byte[] bArr) {
        this(OooO00o(bArr));
        OooO0O0(bArr);
    }

    public static int OooO00o(byte[] bArr) {
        return AbstractC6464l1l.OooO00o(bArr, bArr.length - 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007f, code lost:
        if (r4 > 10) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(int r4) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.I1llii.OooO00o(int):void");
    }

    public static void OooO00o(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(4, i3);
        while (true) {
            min--;
            if (min >= 0) {
                bArr[i2 + min] = (byte) (i >>> ((3 - min) * 8));
            } else {
                return;
            }
        }
    }

    public static void OooO00o(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            OooO00o((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                OooO00o((int) (j & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        OooO00o(this.f16427OooO0OO, bArr, i, this.OooO0Oo);
        OooO00o(super.OooO0Oo, bArr, i + 8, this.OooO0Oo - 8);
        OooO00o(this.OooO0o0, bArr, i + 16, this.OooO0Oo - 16);
        OooO00o(this.OooO0o, bArr, i + 24, this.OooO0Oo - 24);
        OooO00o(this.OooO0oO, bArr, i + 32, this.OooO0Oo - 32);
        OooO00o(this.OooO0oo, bArr, i + 40, this.OooO0Oo - 40);
        OooO00o(this.OooO, bArr, i + 48, this.OooO0Oo - 48);
        OooO00o(this.OooOO0, bArr, i + 56, this.OooO0Oo - 56);
        reset();
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    public AbstractC6186iLi1 OooO00o() {
        return new I1llii(this);
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15313OooO00o() {
        return "SHA-512/" + Integer.toString(this.OooO0Oo * 8);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r3) {
        I1llii i1llii = (I1llii) r3;
        if (this.OooO0Oo == i1llii.OooO0Oo) {
            super.OooO00o((LLILL) i1llii);
            this.OooOO0O = i1llii.OooOO0O;
            this.OooOO0o = i1llii.OooOO0o;
            this.OooOOO0 = i1llii.OooOOO0;
            this.OooOOO = i1llii.OooOOO;
            this.OooOOOO = i1llii.OooOOOO;
            this.OooOOOo = i1llii.OooOOOo;
            this.OooOOo0 = i1llii.OooOOo0;
            this.OooOOo = i1llii.OooOOo;
            return;
        }
        throw new MemoableResetException("digestLength inappropriate in other");
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15314OooO00o() {
        int OooO0OO = OooO0OO();
        byte[] bArr = new byte[(OooO0OO + 4)];
        OooO00o(bArr);
        AbstractC6464l1l.OooO00o(this.OooO0Oo * 8, bArr, OooO0OO);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public int OooO0O0() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public void reset() {
        super.reset();
        this.f16427OooO0OO = this.OooOO0O;
        super.OooO0Oo = this.OooOO0o;
        this.OooO0o0 = this.OooOOO0;
        this.OooO0o = this.OooOOO;
        this.OooO0oO = this.OooOOOO;
        this.OooO0oo = this.OooOOOo;
        this.OooO = this.OooOOo0;
        this.OooOO0 = this.OooOOo;
    }
}
