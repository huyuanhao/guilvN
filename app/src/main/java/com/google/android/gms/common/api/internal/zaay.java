package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

public final class zaay implements GoogleApiClient.ConnectionCallbacks {
    public final /* synthetic */ zaaw zahg;
    public final /* synthetic */ AtomicReference zahh;
    public final /* synthetic */ StatusPendingResult zahi;

    public zaay(zaaw zaaw, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zahg = zaaw;
        this.zahh = atomicReference;
        this.zahi = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zahg.zaa((GoogleApiClient) this.zahh.get(), this.zahi, true);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
