package com.google.android.gms.common.api.internal;

public final class zzb implements Runnable {
    public final /* synthetic */ LifecycleCallback zzbi;
    public final /* synthetic */ String zzbj;
    public final /* synthetic */ zza zzbk;

    public zzb(zza zza, LifecycleCallback lifecycleCallback, String str) {
        this.zzbk = zza;
        this.zzbi = lifecycleCallback;
        this.zzbj = str;
    }

    public final void run() {
        if (this.zzbk.zzbg > 0) {
            this.zzbi.onCreate(this.zzbk.zzbh != null ? this.zzbk.zzbh.getBundle(this.zzbj) : null);
        }
        if (this.zzbk.zzbg >= 2) {
            this.zzbi.onStart();
        }
        if (this.zzbk.zzbg >= 3) {
            this.zzbi.onResume();
        }
        if (this.zzbk.zzbg >= 4) {
            this.zzbi.onStop();
        }
        if (this.zzbk.zzbg >= 5) {
            this.zzbi.onDestroy();
        }
    }
}
