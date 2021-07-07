package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzi {
    public static final Executor zzad = zzk.zzaf;

    public static final /* synthetic */ Thread zza(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    public static Executor zze() {
        return zzad;
    }

    public static Executor zzf() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzj.zzae);
    }
}
