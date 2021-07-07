package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

public final class zzfx implements zzhe {
    public static final zzfx zzwi = new zzfx();

    public static zzfx zzex() {
        return zzwi;
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final boolean zzb(Class<?> cls) {
        return zzfy.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final zzhd zzc(Class<?> cls) {
        if (!zzfy.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzhd) zzfy.zzd(cls.asSubclass(zzfy.class)).zza(zzfy.zzg.zzwz, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
