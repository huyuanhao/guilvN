package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.LL1丨丨i  reason: invalid class name */
public class LL1i implements AlgorithmParameterSpec {
    public static final String OooO0O0 = "SHA-1";
    public static final String OooO0OO = "SHA-224";
    public static final String OooO0Oo = "SHA-256";
    public static final int OooO0o = 50;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f16408OooO0o = "SHA-512";
    public static final int OooO0o0 = 11;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f16409OooO0o0 = "SHA-384";
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f16410OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f16411OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final int f16412OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public int f16413OooO0Oo;

    public LL1i() {
        this(11, 50, OooO0Oo);
    }

    public LL1i(int i) {
        this(i, OooO0Oo);
    }

    public LL1i(int i, int i2) {
        this(i, i2, OooO0Oo);
    }

    public LL1i(int i, int i2, int i3) {
        this(i, i2, i3, OooO0Oo);
    }

    public LL1i(int i, int i2, int i3, String str) {
        this.OooO00o = i;
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            int i4 = 1 << i;
            this.f16412OooO0OO = i4;
            this.f16411OooO0O0 = i2;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 > i4) {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            } else if (C5496I1II.OooO00o(i3) != i || !C5496I1II.m15733OooO00o(i3)) {
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            } else {
                this.f16413OooO0Oo = i3;
                this.f16410OooO00o = str;
            }
        } else {
            throw new IllegalArgumentException(" m is too large");
        }
    }

    public LL1i(int i, int i2, String str) {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            this.OooO00o = i;
            int i3 = 1 << i;
            this.f16412OooO0OO = i3;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 <= i3) {
                this.f16411OooO0O0 = i2;
                this.f16413OooO0Oo = C5496I1II.OooO0O0(i);
                this.f16410OooO00o = str;
            } else {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            }
        } else {
            throw new IllegalArgumentException("m is too large");
        }
    }

    public LL1i(int i, String str) {
        int i2 = 1;
        if (i >= 1) {
            int i3 = 0;
            while (i2 < i) {
                i2 <<= 1;
                i3++;
            }
            this.f16411OooO0O0 = (i2 >>> 1) / i3;
            this.OooO00o = i3;
            this.f16412OooO0OO = i2;
            this.f16413OooO0Oo = C5496I1II.OooO0O0(i3);
            this.f16410OooO00o = str;
            return;
        }
        throw new IllegalArgumentException("key size must be positive");
    }

    public int OooO00o() {
        return this.f16413OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16187OooO00o() {
        return this.f16410OooO00o;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.f16412OooO0OO;
    }

    public int OooO0Oo() {
        return this.f16411OooO0O0;
    }
}
