package com.google.android.gms.internal.clearcut;

public final class zzdl {
    public static final zzdj zzmf = zzce();
    public static final zzdj zzmg = new zzdk();

    public static zzdj zzcc() {
        return zzmf;
    }

    public static zzdj zzcd() {
        return zzmg;
    }

    public static zzdj zzce() {
        try {
            return (zzdj) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
