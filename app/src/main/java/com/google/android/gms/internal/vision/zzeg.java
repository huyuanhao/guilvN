package com.google.android.gms.internal.vision;

public final class zzeg {
    public static final Class<?> zzrm = zzk("libcore.io.Memory");
    public static final boolean zzrn = (zzk("org.robolectric.Robolectric") != null);

    public static boolean zzck() {
        return zzrm != null && !zzrn;
    }

    public static Class<?> zzcl() {
        return zzrm;
    }

    public static <T> Class<T> zzk(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
