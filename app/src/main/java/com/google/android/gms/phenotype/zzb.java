package com.google.android.gms.phenotype;

import android.database.ContentObserver;
import android.os.Handler;

public final class zzb extends ContentObserver {
    public final /* synthetic */ zza zzm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(zza zza, Handler handler) {
        super(null);
        this.zzm = zza;
    }

    public final void onChange(boolean z) {
        this.zzm.zzb();
    }
}
