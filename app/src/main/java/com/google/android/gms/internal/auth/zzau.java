package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zzau extends zzaq {
    public zzau(zzar zzar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.internal.auth.zzaq
    public final void zza(Context context, zzan zzan) throws RemoteException {
        zzan.zza(new zzav(this));
    }
}
