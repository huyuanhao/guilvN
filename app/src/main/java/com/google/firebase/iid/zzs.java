package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzs implements Runnable {
    public final zzr zzbk;
    public final Bundle zzbl;
    public final TaskCompletionSource zzbm;

    public zzs(zzr zzr, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.zzbk = zzr;
        this.zzbl = bundle;
        this.zzbm = taskCompletionSource;
    }

    public final void run() {
        this.zzbk.zza(this.zzbl, this.zzbm);
    }
}
