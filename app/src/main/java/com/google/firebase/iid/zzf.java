package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class zzf extends Binder {
    public final zzb zzu;

    public zzf(zzb zzb) {
        this.zzu = zzb;
    }

    public final void zza(zzd zzd) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.zzu.zzc(zzd.intent)) {
                zzd.finish();
                return;
            }
            Log.isLoggable("EnhancedIntentService", 3);
            this.zzu.zzi.execute(new zzg(this, zzd));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
