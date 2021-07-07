package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ zaak zagi;

    public zaat(zaak zaak) {
        this.zagi = zaak;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zaak.zaf(this.zagi).zaa(new zaar(this.zagi));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zaak.zac(this.zagi).lock();
        try {
            if (zaak.zab(this.zagi, connectionResult)) {
                zaak.zai(this.zagi);
                zaak.zaj(this.zagi);
            } else {
                zaak.zaa(this.zagi, connectionResult);
            }
        } finally {
            zaak.zac(this.zagi).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    public /* synthetic */ zaat(zaak zaak, zaal zaal) {
        this(zaak);
    }
}
