package com.google.android.gms.flags;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.flags.Flag;
import java.util.ArrayList;
import java.util.Collection;

public class FlagRegistry {
    public final Collection<Flag> zzg = new ArrayList();
    public final Collection<Flag.StringFlag> zzh = new ArrayList();
    public final Collection<Flag.StringFlag> zzi = new ArrayList();

    @KeepForSdk
    public static void initialize(Context context) {
        Singletons.zzd().initialize(context);
    }

    public final void zza(Flag flag) {
        this.zzg.add(flag);
    }
}
