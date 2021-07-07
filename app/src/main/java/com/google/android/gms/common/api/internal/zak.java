package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p118pd.sdk.C6971o0000oO0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zak {
    public final C6971o0000oO0<zai<?>, ConnectionResult> zaay = new C6971o0000oO0<>();
    public final C6971o0000oO0<zai<?>, String> zada = new C6971o0000oO0<>();
    public final TaskCompletionSource<Map<zai<?>, String>> zadb = new TaskCompletionSource<>();
    public int zadc;
    public boolean zadd = false;

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        Iterator<? extends GoogleApi<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.zaay.put(((GoogleApi) it.next()).zak(), null);
        }
        this.zadc = this.zaay.keySet().size();
    }

    public final Task<Map<zai<?>, String>> getTask() {
        return this.zadb.getTask();
    }

    public final void zaa(zai<?> zai, ConnectionResult connectionResult, @Nullable String str) {
        this.zaay.put(zai, connectionResult);
        this.zada.put(zai, str);
        this.zadc--;
        if (!connectionResult.isSuccess()) {
            this.zadd = true;
        }
        if (this.zadc != 0) {
            return;
        }
        if (this.zadd) {
            this.zadb.setException(new AvailabilityException(this.zaay));
            return;
        }
        this.zadb.setResult(this.zada);
    }

    public final Set<zai<?>> zap() {
        return this.zaay.keySet();
    }
}
