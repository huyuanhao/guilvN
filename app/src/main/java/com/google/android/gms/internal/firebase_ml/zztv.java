package com.google.android.gms.internal.firebase_ml;

public final class zztv {
    public static final zztt<?> zzbli = new zztu();
    public static final zztt<?> zzblj = zzqm();

    public static zztt<?> zzqm() {
        try {
            return (zztt) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static zztt<?> zzqn() {
        return zzbli;
    }

    public static zztt<?> zzqo() {
        zztt<?> zztt = zzblj;
        if (zztt != null) {
            return zztt;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
