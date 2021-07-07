package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
public final class AuthProxy {
    @KeepForSdk
    public static final Api<AuthProxyOptions> API;
    @KeepForSdk
    public static final ProxyApi ProxyApi = new zzar();
    public static final Api.ClientKey<zzak> zzah = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> zzai;

    static {
        zza zza = new zza();
        zzai = zza;
        API = new Api<>("Auth.PROXY_API", zza, zzah);
    }
}
