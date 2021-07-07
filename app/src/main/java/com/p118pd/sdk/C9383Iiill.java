package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨Iiill  reason: invalid class name and case insensitive filesystem */
public class C9383Iiill implements AbstractC6370iIIIl {
    public static final int o0OOO0o = 11;
    public static final int o0Oo0oo = 50;
    public AbstractC6436l11LI OooO00o;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    public C9383Iiill() {
        this(11, 50);
    }

    public C9383Iiill(int i) {
        this(i, (AbstractC6436l11LI) null);
    }

    public C9383Iiill(int i, int i2) {
        this(i, i2, (AbstractC6436l11LI) null);
    }

    public C9383Iiill(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public C9383Iiill(int i, int i2, int i3, AbstractC6436l11LI r6) {
        this.o00oO0O = i;
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            int i4 = 1 << i;
            this.o0ooOOo = i4;
            this.o0ooOO0 = i2;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 > i4) {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            } else if (C5496I1II.OooO00o(i3) != i || !C5496I1II.m15733OooO00o(i3)) {
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            } else {
                this.o0ooOoO = i3;
                this.OooO00o = r6;
            }
        } else {
            throw new IllegalArgumentException(" m is too large");
        }
    }

    public C9383Iiill(int i, int i2, AbstractC6436l11LI r5) {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            this.o00oO0O = i;
            int i3 = 1 << i;
            this.o0ooOOo = i3;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 <= i3) {
                this.o0ooOO0 = i2;
                this.o0ooOoO = C5496I1II.OooO0O0(i);
                this.OooO00o = r5;
            } else {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            }
        } else {
            throw new IllegalArgumentException("m is too large");
        }
    }

    public C9383Iiill(int i, AbstractC6436l11LI r4) {
        if (i >= 1) {
            this.o00oO0O = 0;
            this.o0ooOOo = 1;
            while (true) {
                int i2 = this.o0ooOOo;
                if (i2 < i) {
                    this.o0ooOOo = i2 << 1;
                    this.o00oO0O++;
                } else {
                    int i3 = i2 >>> 1;
                    this.o0ooOO0 = i3;
                    int i4 = this.o00oO0O;
                    this.o0ooOO0 = i3 / i4;
                    this.o0ooOoO = C5496I1II.OooO0O0(i4);
                    this.OooO00o = r4;
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("key size must be positive");
        }
    }

    public C9383Iiill(AbstractC6436l11LI r3) {
        this(11, 50, r3);
    }

    public int OooO00o() {
        return this.o0ooOoO;
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }

    public int OooO0OO() {
        return this.o0ooOOo;
    }

    public int OooO0Oo() {
        return this.o0ooOO0;
    }
}
