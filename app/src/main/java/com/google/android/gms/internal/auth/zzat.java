package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Result;

public final class zzat extends zzaj {
    public final /* synthetic */ zzas zzcf;

    public zzat(zzas zzas) {
        this.zzcf = zzas;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zza(ProxyResponse proxyResponse) {
        this.zzcf.setResult((Result) new zzaw(proxyResponse));
    }
}
