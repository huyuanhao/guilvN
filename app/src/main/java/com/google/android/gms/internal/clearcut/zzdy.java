package com.google.android.gms.internal.clearcut;

public final class zzdy {
    public static final zzdw zzna = zzcl();
    public static final zzdw zznb = new zzdx();

    public static zzdw zzcj() {
        return zzna;
    }

    public static zzdw zzck() {
        return zznb;
    }

    public static zzdw zzcl() {
        try {
            return (zzdw) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
