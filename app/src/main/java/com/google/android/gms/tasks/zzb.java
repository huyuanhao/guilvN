package com.google.android.gms.tasks;

public final class zzb implements OnSuccessListener<Void> {
    public final /* synthetic */ OnTokenCanceledListener zzb;

    public zzb(zza zza, OnTokenCanceledListener onTokenCanceledListener) {
        this.zzb = onTokenCanceledListener;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Void r1) {
        this.zzb.onCanceled();
    }
}
