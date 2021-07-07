package com.megvii.action.fmp.liveness.lib.p089a;

/* renamed from: com.megvii.action.fmp.liveness.lib.a.b */
public final class C1454b {
    /* renamed from: a */
    public static boolean m2157a() {
        try {
            System.loadLibrary("bucket2-new");
            System.loadLibrary("MegviiInnerUtils-0.0.2");
            System.loadLibrary("MegActionFmpJni");
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
