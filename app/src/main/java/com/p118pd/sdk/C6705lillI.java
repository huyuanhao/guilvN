package com.p118pd.sdk;

import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.lillI丨  reason: invalid class name and case insensitive filesystem */
public class C6705lillI implements AlgorithmParameterSpec {
    public static final int OooO0o = 50;
    public static final int OooO0o0 = 11;
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public C6705lillI() {
        this(11, 50);
    }

    public C6705lillI(int i) {
        if (i >= 1) {
            this.OooO00o = 0;
            this.OooO0OO = 1;
            while (true) {
                int i2 = this.OooO0OO;
                if (i2 < i) {
                    this.OooO0OO = i2 << 1;
                    this.OooO00o++;
                } else {
                    int i3 = i2 >>> 1;
                    this.OooO0O0 = i3;
                    int i4 = this.OooO00o;
                    this.OooO0O0 = i3 / i4;
                    this.OooO0Oo = C5496I1II.OooO0O0(i4);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("key size must be positive");
        }
    }

    public C6705lillI(int i, int i2) throws InvalidParameterException {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            this.OooO00o = i;
            int i3 = 1 << i;
            this.OooO0OO = i3;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 <= i3) {
                this.OooO0O0 = i2;
                this.OooO0Oo = C5496I1II.OooO0O0(i);
            } else {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            }
        } else {
            throw new IllegalArgumentException("m is too large");
        }
    }

    public C6705lillI(int i, int i2, int i3) {
        this.OooO00o = i;
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            int i4 = 1 << i;
            this.OooO0OO = i4;
            this.OooO0O0 = i2;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 > i4) {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            } else if (C5496I1II.OooO00o(i3) != i || !C5496I1II.m15733OooO00o(i3)) {
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            } else {
                this.OooO0Oo = i3;
            }
        } else {
            throw new IllegalArgumentException(" m is too large");
        }
    }

    public int OooO00o() {
        return this.OooO0Oo;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0OO;
    }

    public int OooO0Oo() {
        return this.OooO0O0;
    }
}
