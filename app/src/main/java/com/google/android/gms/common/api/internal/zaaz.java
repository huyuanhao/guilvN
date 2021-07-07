package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

public final class zaaz implements GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ StatusPendingResult zahi;

    public zaaz(zaaw zaaw, StatusPendingResult statusPendingResult) {
        this.zahi = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zahi.setResult(new Status(8));
    }
}
