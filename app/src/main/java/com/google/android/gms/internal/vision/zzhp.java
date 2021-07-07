package com.google.android.gms.internal.vision;

public final class zzhp {
    public static final zzhn zzzu = zzgk();
    public static final zzhn zzzv = new zzho();

    public static zzhn zzgi() {
        return zzzu;
    }

    public static zzhn zzgj() {
        return zzzv;
    }

    public static zzhn zzgk() {
        try {
            return (zzhn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
