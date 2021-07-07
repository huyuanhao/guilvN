package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

public final class zag implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ GoogleApiClient.OnConnectionFailedListener zaoj;

    public zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zaoj = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zaoj.onConnectionFailed(connectionResult);
    }
}
