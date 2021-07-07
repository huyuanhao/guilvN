package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class zzar implements Continuation {
    public final zzaq zzcp;
    public final Pair zzcq;

    public zzar(zzaq zzaq, Pair pair) {
        this.zzcp = zzaq;
        this.zzcq = pair;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zzcp.zza(this.zzcq, task);
    }
}
