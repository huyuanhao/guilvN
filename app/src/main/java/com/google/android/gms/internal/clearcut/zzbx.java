package com.google.android.gms.internal.clearcut;

public final class zzbx {
    public static final zzbu<?> zzgr = new zzbv();
    public static final zzbu<?> zzgs = zzao();

    public static zzbu<?> zzao() {
        try {
            return (zzbu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static zzbu<?> zzap() {
        return zzgr;
    }

    public static zzbu<?> zzaq() {
        zzbu<?> zzbu = zzgs;
        if (zzbu != null) {
            return zzbu;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
