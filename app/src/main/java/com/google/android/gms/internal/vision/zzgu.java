package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

public final class zzgu implements zzhx {
    public static final zzhe zzyt = new zzgv();
    public final zzhe zzys;

    public zzgu() {
        this(new zzgw(zzfx.zzex(), zzfx()));
    }

    public static boolean zza(zzhd zzhd) {
        return zzhd.zzge() == zzfy.zzg.zzxf;
    }

    public static zzhe zzfx() {
        try {
            return (zzhe) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzyt;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhx
    public final <T> zzhw<T> zze(Class<T> cls) {
        zzhy.zzg(cls);
        zzhd zzc = this.zzys.zzc(cls);
        if (zzc.zzgf()) {
            if (zzfy.class.isAssignableFrom(cls)) {
                return zzhl.zza(zzhy.zzgr(), zzfo.zzen(), zzc.zzgg());
            }
            return zzhl.zza(zzhy.zzgp(), zzfo.zzeo(), zzc.zzgg());
        } else if (zzfy.class.isAssignableFrom(cls)) {
            if (zza(zzc)) {
                return zzhj.zza(cls, zzc, zzhp.zzgj(), zzgp.zzfw(), zzhy.zzgr(), zzfo.zzen(), zzhc.zzgc());
            }
            return zzhj.zza(cls, zzc, zzhp.zzgj(), zzgp.zzfw(), zzhy.zzgr(), (zzfl<?>) null, zzhc.zzgc());
        } else if (zza(zzc)) {
            return zzhj.zza(cls, zzc, zzhp.zzgi(), zzgp.zzfv(), zzhy.zzgp(), zzfo.zzeo(), zzhc.zzgb());
        } else {
            return zzhj.zza(cls, zzc, zzhp.zzgi(), zzgp.zzfv(), zzhy.zzgq(), (zzfl<?>) null, zzhc.zzgb());
        }
    }

    public zzgu(zzhe zzhe) {
        this.zzys = (zzhe) zzga.zza((Object) zzhe, "messageInfoFactory");
    }
}
