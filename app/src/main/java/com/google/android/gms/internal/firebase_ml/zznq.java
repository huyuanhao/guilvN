package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.Callable;

public final class zznq {
    public static final GmsLogger zzape = new GmsLogger("MLTaskManager", "");
    @GuardedBy("MLTaskManager.class")
    public static zznq zzapf;
    public final zznx zzapg;

    public zznq(FirebaseApp firebaseApp) {
        this.zzapg = zznx.zzb(firebaseApp);
    }

    public static synchronized zznq zza(FirebaseApp firebaseApp) {
        zznq zznq;
        synchronized (zznq.class) {
            if (zzapf == null) {
                zzapf = new zznq(firebaseApp);
            }
            zznq = zzapf;
        }
        return zznq;
    }

    public final <T, S extends zznp> void zzb(zznm<T, S> zznm) {
        zznw zzlm = zznm.zzlm();
        if (zzlm != null) {
            this.zzapg.zzd(zzlm);
        }
    }

    public final <T, S extends zznp> void zza(zznm<T, S> zznm) {
        zznw zzlm = zznm.zzlm();
        if (zzlm != null) {
            this.zzapg.zza(zzlm);
        }
    }

    public final synchronized <TResult> Task<TResult> zza(@NonNull zznw zznw, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(callable, "Operation can not be null");
        Preconditions.checkNotNull(zznw, "Model resource can not be null");
        zzape.mo10801d("MLTaskManager", "Execute task");
        return zznn.zzln().zza(new zznr(this, zznw, callable));
    }

    public final synchronized <T, S extends zznp> Task<T> zza(@NonNull zznm<T, S> zznm, @NonNull S s) {
        Preconditions.checkNotNull(zznm, "Operation can not be null");
        Preconditions.checkNotNull(s, "Input can not be null");
        zzape.mo10801d("MLTaskManager", "Execute task");
        return zznn.zzln().zza(new zzns(this, zznm.zzlm(), zznm, s));
    }
}
