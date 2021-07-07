package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

public final class zabl implements Runnable {
    public final /* synthetic */ GoogleApiManager.zaa zaix;
    public final /* synthetic */ ConnectionResult zaiy;

    public zabl(GoogleApiManager.zaa zaa, ConnectionResult connectionResult) {
        this.zaix = zaa;
        this.zaiy = connectionResult;
    }

    public final void run() {
        this.zaix.onConnectionFailed(this.zaiy);
    }
}
