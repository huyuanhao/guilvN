package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class zzk<TResult> implements zzq<TResult> {
    public final Object mLock = new Object();
    public final Executor zzd;
    @GuardedBy("mLock")
    public OnFailureListener zzn;

    public zzk(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.zzd = executor;
        this.zzn = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzn = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(@NonNull Task<TResult> task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            synchronized (this.mLock) {
                if (this.zzn != null) {
                    this.zzd.execute(new zzl(this, task));
                }
            }
        }
    }
}
