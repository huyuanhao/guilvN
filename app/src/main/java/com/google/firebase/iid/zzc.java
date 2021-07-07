package com.google.firebase.iid;

import android.content.Intent;

public final class zzc implements Runnable {
    public final /* synthetic */ Intent zzm;
    public final /* synthetic */ Intent zzn;
    public final /* synthetic */ zzb zzo;

    public zzc(zzb zzb, Intent intent, Intent intent2) {
        this.zzo = zzb;
        this.zzm = intent;
        this.zzn = intent2;
    }

    public final void run() {
        this.zzo.zzd(this.zzm);
        this.zzo.zza(this.zzn);
    }
}
