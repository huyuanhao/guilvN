package com.google.android.gms.internal.vision;

import java.util.List;

public final class zzcx extends zzcu {
    public final zzcv zzlw = new zzcv();

    @Override // com.google.android.gms.internal.vision.zzcu
    public final void zza(Throwable th) {
        th.printStackTrace();
        List<Throwable> zza = this.zzlw.zza(th, false);
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
