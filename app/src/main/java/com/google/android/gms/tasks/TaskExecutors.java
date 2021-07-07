package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD = new zza();
    public static final Executor zzw = new zzt();

    public static final class zza implements Executor {
        public final Handler mHandler = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }
}
