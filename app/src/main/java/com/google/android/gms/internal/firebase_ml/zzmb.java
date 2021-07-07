package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzmb extends zzly {
    public final zzlz zzadv = new zzlz();

    @Override // com.google.android.gms.internal.firebase_ml.zzly
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.zzadv.zza(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzly
    public final void zzb(Throwable th) {
        th.printStackTrace();
        List<Throwable> zza = this.zzadv.zza(th, false);
        if (zza != null) {
            synchronized (zza) {
                for (Throwable th2 : zza) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }
}
