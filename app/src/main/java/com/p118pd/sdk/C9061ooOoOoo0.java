package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooOoOoo0  reason: case insensitive filesystem */
public final class C9061ooOoOoo0 {
    public C9061ooOoOoo0() throws InstantiationException {
        throw new InstantiationException("This class is not for instantiation");
    }

    public static boolean OooO00o() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return "1".equals((String) cls.getMethod("get", String.class).invoke(cls, "ro.build.selinux"));
        } catch (Exception unused) {
            return false;
        }
    }
}
