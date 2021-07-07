package com.google.android.gms.internal.firebase_ml;

public final class zzsr {
    public static final Class<?> zzbke = zzcm("libcore.io.Memory");
    public static final boolean zzbkf = (zzcm("org.robolectric.Robolectric") != null);

    public static <T> Class<T> zzcm(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzpv() {
        return zzbke != null && !zzbkf;
    }

    public static Class<?> zzpw() {
        return zzbke;
    }
}
