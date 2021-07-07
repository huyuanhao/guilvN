package com.google.android.gms.flags;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class Singletons {
    public static Singletons zzl;
    public final FlagRegistry zzm = new FlagRegistry();
    public final zzb zzn = new zzb();

    static {
        Singletons singletons = new Singletons();
        synchronized (Singletons.class) {
            zzl = singletons;
        }
    }

    @KeepForSdk
    public static FlagRegistry flagRegistry() {
        return zzc().zzm;
    }

    public static Singletons zzc() {
        Singletons singletons;
        synchronized (Singletons.class) {
            singletons = zzl;
        }
        return singletons;
    }

    public static zzb zzd() {
        return zzc().zzn;
    }
}
