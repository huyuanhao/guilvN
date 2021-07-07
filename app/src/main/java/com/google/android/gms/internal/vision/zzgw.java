package com.google.android.gms.internal.vision;

public final class zzgw implements zzhe {
    public zzhe[] zzyu;

    public zzgw(zzhe... zzheArr) {
        this.zzyu = zzheArr;
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final boolean zzb(Class<?> cls) {
        for (zzhe zzhe : this.zzyu) {
            if (zzhe.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final zzhd zzc(Class<?> cls) {
        zzhe[] zzheArr = this.zzyu;
        for (zzhe zzhe : zzheArr) {
            if (zzhe.zzb(cls)) {
                return zzhe.zzc(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
