package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zae extends zah {
    public zae(zad zad, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.Api$AnyClient] */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(zai zai) throws RemoteException {
        ((zal) zai.getService()).zaa(new zaf(this));
    }
}
