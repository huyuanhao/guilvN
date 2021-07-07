package com.google.android.gms.internal.firebase_ml;

public final class zzmc extends zzly {
    @Override // com.google.android.gms.internal.firebase_ml.zzly
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzly
    public final void zzb(Throwable th) {
        th.printStackTrace();
    }
}
