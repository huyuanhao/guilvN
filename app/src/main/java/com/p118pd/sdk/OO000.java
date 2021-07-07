package com.p118pd.sdk;

/* renamed from: com.pd.sdk.OO000 */
public final class OO000 extends Random {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    public OO000(int i, int i2, int i3, int i4, int i5, int i6) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
        this.OooO0o0 = i5;
        this.OooO0o = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (i7 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                OooO00o();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    public int OooO00o() {
        int i = this.OooO00o;
        int i2 = i ^ (i >>> 2);
        this.OooO00o = this.OooO0O0;
        this.OooO0O0 = this.OooO0OO;
        this.OooO0OO = this.OooO0Oo;
        int i3 = this.OooO0o0;
        this.OooO0Oo = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.OooO0o0 = i4;
        int i5 = this.OooO0o + 362437;
        this.OooO0o = i5;
        return i4 + i5;
    }

    public OO000(int i, int i2) {
        this(i, i2, 0, 0, i ^ -1, (i << 10) ^ (i2 >>> 4));
    }

    @Override // kotlin.random.Random, kotlin.random.Random
    public int OooO00o(int i) {
        return OO0.OooO00o(OooO00o(), i);
    }
}
