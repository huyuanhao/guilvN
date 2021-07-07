package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.Callable;

public final class zznr implements Callable<TResult> {
    public final /* synthetic */ Callable val$callable;
    public final /* synthetic */ zznw zzaph;
    public final /* synthetic */ zznq zzapi;

    public zznr(zznq zznq, zznw zznw, Callable callable) {
        this.zzapi = zznq;
        this.zzaph = zznw;
        this.val$callable = callable;
    }

    @Override // java.util.concurrent.Callable
    public final TResult call() throws Exception {
        zznq.zza(this.zzapi).zzf(this.zzaph);
        return (TResult) this.val$callable.call();
    }
}
