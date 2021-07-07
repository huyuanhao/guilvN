package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public class TaskCompletionSource<TResult> {
    public final zzu<TResult> zza = new zzu<>();

    public TaskCompletionSource() {
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@NonNull Exception exc) {
        this.zza.setException(exc);
    }

    public void setResult(TResult tresult) {
        this.zza.setResult(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        return this.zza.trySetException(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.trySetResult(tresult);
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
