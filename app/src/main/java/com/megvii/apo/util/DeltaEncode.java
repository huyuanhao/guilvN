package com.megvii.apo.util;

public class DeltaEncode {
    static {
        try {
            System.loadLibrary("finger");
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    /* renamed from: a */
    public static String m2246a(String str) {
        C1495e.m2257a("en (): ===============");
        C1495e.m2257a("en (): content = ".concat(String.valueOf(str)));
        if (str != null) {
            return m2247ec(str);
        }
        C1495e.m2257a("en (): param content is null !!!!!!");
        return null;
    }

    /* renamed from: ec */
    public static native String m2247ec(String str);

    /* renamed from: ma */
    public static native String m2248ma();
}
