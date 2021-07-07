package com.google.android.gms.internal.vision;

public final class zzfo {
    public static final zzfl<?> zztk = new zzfm();
    public static final zzfl<?> zztl = zzem();

    public static zzfl<?> zzem() {
        try {
            return (zzfl) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static zzfl<?> zzen() {
        return zztk;
    }

    public static zzfl<?> zzeo() {
        zzfl<?> zzfl = zztl;
        if (zzfl != null) {
            return zzfl;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
