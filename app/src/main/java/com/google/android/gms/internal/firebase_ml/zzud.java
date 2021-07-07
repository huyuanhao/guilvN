package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;

public final class zzud implements zzvn {
    public static final zzud zzbog = new zzud();

    public static zzud zzqw() {
        return zzbog;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvn
    public final boolean zzg(Class<?> cls) {
        return zzue.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvn
    public final zzvm zzh(Class<?> cls) {
        if (!zzue.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzvm) zzue.zzi(cls.asSubclass(zzue.class)).zza(zzue.zzf.zzboq, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
