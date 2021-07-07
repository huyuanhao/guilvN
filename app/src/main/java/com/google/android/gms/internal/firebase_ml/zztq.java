package com.google.android.gms.internal.firebase_ml;

public final class zztq {
    public static final Class<?> zzbld = zzqi();

    public static Class<?> zzqi() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zztr zzqj() {
        Class<?> cls = zzbld;
        if (cls != null) {
            try {
                return (zztr) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return zztr.zzblg;
    }
}
