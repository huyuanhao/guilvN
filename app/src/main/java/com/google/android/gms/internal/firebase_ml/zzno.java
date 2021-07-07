package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

public final class zzno implements Runnable {
    public final /* synthetic */ Callable val$callable;
    public final /* synthetic */ TaskCompletionSource zzapd;

    public zzno(zznn zznn, Callable callable, TaskCompletionSource taskCompletionSource) {
        this.val$callable = callable;
        this.zzapd = taskCompletionSource;
    }

    public final void run() {
        zznn.zza(this.val$callable, this.zzapd);
    }
}
