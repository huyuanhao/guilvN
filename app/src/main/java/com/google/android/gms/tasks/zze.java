package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class zze<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, zzq<TResult> {
    public final Executor zzd;
    public final Continuation<TResult, Task<TContinuationResult>> zze;
    public final zzu<TContinuationResult> zzf;

    public zze(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation, @NonNull zzu<TContinuationResult> zzu) {
        this.zzd = executor;
        this.zze = continuation;
        this.zzf = zzu;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(@NonNull Task<TResult> task) {
        this.zzd.execute(new zzf(this, task));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.zzf.setException(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.zzf.setResult(tcontinuationresult);
    }
}
