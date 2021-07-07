package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zzas extends zzap {
    public final /* synthetic */ ProxyRequest zzce;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzas(zzar zzar, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.zzce = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.zzap
    public final void zza(Context context, zzan zzan) throws RemoteException {
        zzan.zza(new zzat(this), this.zzce);
    }
}
