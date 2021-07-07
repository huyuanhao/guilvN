package com.google.android.gms.internal.firebase_ml;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.p027ml.common.FirebaseMLException;
import java.util.concurrent.Callable;

public final class zznn implements Handler.Callback {
    public static final Object lock = new Object();
    @GuardedBy("lock")
    public static zznn zzapc;
    public final Handler handler;

    public zznn(Looper looper) {
        this.handler = new zzi(looper, this);
    }

    public static zznn zzln() {
        zznn zznn;
        synchronized (lock) {
            if (zzapc == null) {
                HandlerThread handlerThread = new HandlerThread("FirebaseMLHandler", 9);
                handlerThread.start();
                zzapc = new zznn(handlerThread.getLooper());
            }
            zznn = zzapc;
        }
        return zznn;
    }

    @WorkerThread
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            try {
                ((Callable) message.obj).call();
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public final <ResultT> Task<ResultT> zza(Callable<ResultT> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.handler.post(new zzno(this, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final <ResultT> void zzb(Callable<ResultT> callable) {
        this.handler.removeMessages(1, callable);
    }

    public final <ResultT> void zza(Callable<ResultT> callable, long j) {
        Handler handler2 = this.handler;
        handler2.sendMessageDelayed(handler2.obtainMessage(1, callable), j);
    }

    @VisibleForTesting
    @WorkerThread
    public static <ResultT> void zza(Callable<ResultT> callable, TaskCompletionSource<ResultT> taskCompletionSource) {
        try {
            taskCompletionSource.setResult(callable.call());
        } catch (FirebaseMLException e) {
            taskCompletionSource.setException(e);
        } catch (Exception e2) {
            taskCompletionSource.setException(new FirebaseMLException("Internal error has occurred when executing Firebase ML tasks", 13, e2));
        }
    }
}
