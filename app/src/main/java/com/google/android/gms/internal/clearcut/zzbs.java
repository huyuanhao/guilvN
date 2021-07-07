package com.google.android.gms.internal.clearcut;

public final class zzbs {
    public static final Class<?> zzgl = zzak();

    public static Class<?> zzak() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzbt zzal() {
        Class<?> cls = zzgl;
        if (cls != null) {
            try {
                return (zzbt) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return zzbt.zzgo;
    }
}
