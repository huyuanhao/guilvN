package com.google.android.gms.internal.vision;

public final class zzhc {
    public static final zzha zzyz = zzgd();
    public static final zzha zzza = new zzhb();

    public static zzha zzgb() {
        return zzyz;
    }

    public static zzha zzgc() {
        return zzza;
    }

    public static zzha zzgd() {
        try {
            return (zzha) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
