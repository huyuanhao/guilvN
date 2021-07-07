package com.google.firebase.iid;

import android.util.Log;

public final class zzg implements Runnable {
    public final /* synthetic */ zzd zzv;
    public final /* synthetic */ zzf zzw;

    public zzg(zzf zzf, zzd zzd) {
        this.zzw = zzf;
        this.zzv = zzd;
    }

    public final void run() {
        Log.isLoggable("EnhancedIntentService", 3);
        this.zzw.zzu.zzd(this.zzv.intent);
        this.zzv.finish();
    }
}
