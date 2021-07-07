package com.p118pd.sdk;

import kotlin.jvm.JvmField;

/* renamed from: com.pd.sdk.o0OoO00  reason: case insensitive filesystem */
public final class C7478o0OoO00 {
    @JvmField
    public static final double OooO00o = Math.log(2.0d);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7478o0OoO00 f20300OooO00o = new C7478o0OoO00();
    @JvmField
    public static final double OooO0O0;
    @JvmField
    public static final double OooO0OO;
    @JvmField
    public static final double OooO0Oo;
    @JvmField
    public static final double OooO0o;
    @JvmField
    public static final double OooO0o0;

    static {
        double ulp = Math.ulp(1.0d);
        OooO0O0 = ulp;
        double sqrt = Math.sqrt(ulp);
        OooO0OO = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        OooO0Oo = sqrt2;
        double d = (double) 1;
        double d2 = OooO0OO;
        Double.isNaN(d);
        OooO0o0 = d / d2;
        Double.isNaN(d);
        OooO0o = d / sqrt2;
    }
}
