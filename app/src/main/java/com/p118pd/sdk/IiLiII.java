package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.IiLiII丨  reason: invalid class name */
public class IiLiII {
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f15720OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public IiLiII(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, -1);
    }

    public IiLiII(int i, int i2, int i3, SecureRandom secureRandom, int i4) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0Oo = i3;
        this.OooO0OO = i4;
        this.f15720OooO00o = secureRandom;
    }

    public int OooO00o() {
        return this.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SecureRandom m15596OooO00o() {
        return this.f15720OooO00o;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0O0;
    }

    public int OooO0Oo() {
        return this.OooO0OO;
    }
}
