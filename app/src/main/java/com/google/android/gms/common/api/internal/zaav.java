package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

public final class zaav implements zabd {
    public final zabe zafs;

    public zaav(zabe zabe) {
        this.zafs = zabe;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void begin() {
        for (Api.Client client : this.zafs.zagy.values()) {
            client.disconnect();
        }
        this.zafs.zaed.zagz = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void connect() {
        this.zafs.zaaz();
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        this.zafs.zaed.zafb.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }
}
