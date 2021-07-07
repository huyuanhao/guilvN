package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class zzm<TResult> implements zzq<TResult> {
    public final Object mLock = new Object();
    public final Executor zzd;
    @GuardedBy("mLock")
    public OnSuccessListener<? super TResult> zzp;

    public zzm(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzd = executor;
        this.zzp = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(@NonNull Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.mLock) {
                if (this.zzp != null) {
                    this.zzd.execute(new zzn(this, task));
                }
            }
        }
    }
}
