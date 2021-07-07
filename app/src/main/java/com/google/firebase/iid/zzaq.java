package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.p118pd.sdk.C6971o0000oO0;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class zzaq {
    public final Executor zzbj;
    @GuardedBy("this")
    public final Map<Pair<String, String>, Task<String>> zzco = new C6971o0000oO0();

    public zzaq(Executor executor) {
        this.zzbj = executor;
    }

    public final synchronized Task<String> zza(String str, String str2, zzas zzas) {
        Pair<String, String> pair = new Pair<>(str, str2);
        Task<String> task = this.zzco.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                sb.toString();
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            sb2.toString();
        }
        Task<TContinuationResult> continueWithTask = zzas.zzs().continueWithTask(this.zzbj, new zzar(this, pair));
        this.zzco.put(pair, continueWithTask);
        return continueWithTask;
    }

    public final /* synthetic */ Task zza(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.zzco.remove(pair);
        }
        return task;
    }
}
