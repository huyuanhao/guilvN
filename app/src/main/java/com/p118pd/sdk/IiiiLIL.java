package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.IiiiL丨IL  reason: invalid class name */
public class IiiiLIL implements AlgorithmParameterSpec {
    public static final String OooO0O0 = "SHA256";
    public static final String OooO0OO = "SHA512";
    public static final String OooO0Oo = "SHAKE128";
    public static final String OooO0o0 = "SHAKE256";
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f15730OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f15731OooO0O0;

    public IiiiLIL(int i, int i2, String str) {
        this.OooO00o = i;
        this.f15731OooO0O0 = i2;
        this.f15730OooO00o = str;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15613OooO00o() {
        return this.f15730OooO00o;
    }

    public int OooO0O0() {
        return this.f15731OooO0O0;
    }
}
