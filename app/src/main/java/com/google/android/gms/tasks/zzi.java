package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class zzi<TResult> implements zzq<TResult> {
    public final Object mLock = new Object();
    public final Executor zzd;
    @GuardedBy("mLock")
    public OnCompleteListener<TResult> zzl;

    public zzi(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zzd = executor;
        this.zzl = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzl = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(@NonNull Task<TResult> task) {
        synchronized (this.mLock) {
            if (this.zzl != null) {
                this.zzd.execute(new zzj(this, task));
            }
        }
    }
}
