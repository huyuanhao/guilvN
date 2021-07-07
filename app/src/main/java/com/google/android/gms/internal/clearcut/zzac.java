package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

public final class zzac extends ContentObserver {
    public final /* synthetic */ zzab zzdm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzac(zzab zzab, Handler handler) {
        super(null);
        this.zzdm = zzab;
    }

    public final void onChange(boolean z) {
        this.zzdm.zzh();
        zzab.zza(this.zzdm);
    }
}
