package com.google.android.gms.internal.firebase_ml;

public final class zzvl {
    public static final zzvj zzbqt = zzsg();
    public static final zzvj zzbqu = new zzvk();

    public static zzvj zzse() {
        return zzbqt;
    }

    public static zzvj zzsf() {
        return zzbqu;
    }

    public static zzvj zzsg() {
        try {
            return (zzvj) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
