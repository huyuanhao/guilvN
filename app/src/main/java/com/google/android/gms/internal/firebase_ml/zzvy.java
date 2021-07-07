package com.google.android.gms.internal.firebase_ml;

public final class zzvy {
    public static final zzvw zzbro = zzsn();
    public static final zzvw zzbrp = new zzvx();

    public static zzvw zzsl() {
        return zzbro;
    }

    public static zzvw zzsm() {
        return zzbrp;
    }

    public static zzvw zzsn() {
        try {
            return (zzvw) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
