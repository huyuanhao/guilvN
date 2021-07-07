package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II11LLI */
public final class II11LLI {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f15441OooO00o;

    public II11LLI(AbstractC6436l11LI r1, int i) {
        if (r1 != null) {
            this.f15441OooO00o = r1;
            this.OooO00o = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    private byte[] OooO00o(int i, byte[] bArr, byte[] bArr2) {
        byte[] OooO00o2 = C5532IiIllL.m15806OooO00o((long) i, this.OooO00o);
        this.f15441OooO00o.update(OooO00o2, 0, OooO00o2.length);
        this.f15441OooO00o.update(bArr, 0, bArr.length);
        this.f15441OooO00o.update(bArr2, 0, bArr2.length);
        int i2 = this.OooO00o;
        byte[] bArr3 = new byte[i2];
        AbstractC6436l11LI r6 = this.f15441OooO00o;
        if (r6 instanceof AbstractC6534lIL1) {
            ((AbstractC6534lIL1) r6).OooO0O0(bArr3, 0, i2);
        } else {
            r6.OooO00o(bArr3, 0);
        }
        return bArr3;
    }

    public byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.OooO00o;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i) {
            return OooO00o(0, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    public byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.OooO00o;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i * 2) {
            return OooO00o(1, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    public byte[] OooO0OO(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.OooO00o * 3) {
            return OooO00o(2, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong key length");
    }

    public byte[] OooO0Oo(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.OooO00o) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return OooO00o(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }
}
