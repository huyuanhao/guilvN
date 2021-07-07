package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah extends zad<Boolean> {
    public final ListenerHolder.ListenerKey<?> zacs;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zacs = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void zaa(@NonNull zaab zaab, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void zaa(@NonNull RuntimeException runtimeException) {
        super.zaa(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(GoogleApiManager.zaa<?> zaa) {
        zabw zabw = zaa.zabk().get(this.zacs);
        if (zabw == null) {
            return null;
        }
        return zabw.zajw.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zac(GoogleApiManager.zaa<?> zaa) {
        zabw zabw = zaa.zabk().get(this.zacs);
        return zabw != null && zabw.zajw.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zad(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        zabw remove = zaa.zabk().remove(this.zacs);
        if (remove != null) {
            remove.zajx.unregisterListener(zaa.zaab(), this.zacm);
            remove.zajw.clearListener();
            return;
        }
        this.zacm.trySetResult((T) false);
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void zaa(@NonNull Status status) {
        super.zaa(status);
    }
}
