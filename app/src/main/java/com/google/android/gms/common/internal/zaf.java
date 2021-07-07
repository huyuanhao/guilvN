package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

public final class zaf implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ GoogleApiClient.ConnectionCallbacks zaoi;

    public zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zaoi = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.zaoi.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaoi.onConnectionSuspended(i);
    }
}
