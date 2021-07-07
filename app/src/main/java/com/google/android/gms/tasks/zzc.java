package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class zzc<TResult, TContinuationResult> implements zzq<TResult> {
    public final Executor zzd;
    public final Continuation<TResult, TContinuationResult> zze;
    public final zzu<TContinuationResult> zzf;

    public zzc(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation, @NonNull zzu<TContinuationResult> zzu) {
        this.zzd = executor;
        this.zze = continuation;
        this.zzf = zzu;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(@NonNull Task<TResult> task) {
        this.zzd.execute(new zzd(this, task));
    }
}
