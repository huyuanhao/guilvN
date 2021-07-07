package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

public final class Common {
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;
    @KeepForSdk
    public static final Api.ClientKey<zai> CLIENT_KEY = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> zapg;
    public static final zac zaph = new zad();

    static {
        zab zab = new zab();
        zapg = zab;
        API = new Api<>("Common.API", zab, CLIENT_KEY);
    }
}
