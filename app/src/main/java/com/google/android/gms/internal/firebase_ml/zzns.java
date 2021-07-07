package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.p027ml.common.FirebaseMLException;
import java.util.concurrent.Callable;

public final class zzns implements Callable<T> {
    public final /* synthetic */ zznw zzaph;
    public final /* synthetic */ zznq zzapi;
    public final /* synthetic */ zznm zzapj;
    public final /* synthetic */ zznp zzapk;

    public zzns(zznq zznq, zznw zznw, zznm zznm, zznp zznp) {
        this.zzapi = zznq;
        this.zzaph = zznw;
        this.zzapj = zznm;
        this.zzapk = zznp;
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws FirebaseMLException {
        if (this.zzaph != null) {
            zznq.zza(this.zzapi).zzf(this.zzaph);
        }
        return (T) this.zzapj.zza(this.zzapk);
    }
}
