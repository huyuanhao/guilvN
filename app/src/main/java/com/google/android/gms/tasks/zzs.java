package com.google.android.gms.tasks;

public final class zzs implements OnTokenCanceledListener {
    public final /* synthetic */ TaskCompletionSource zzv;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zzv = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.zzv.zza.zza();
    }
}
