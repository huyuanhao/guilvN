package com.google.android.gms.phenotype;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.phenotype.zzd;
import com.google.android.gms.internal.phenotype.zze;

@KeepForSdk
public final class Phenotype {
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API;
    public static final Api.AbstractClientBuilder<zze, Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    public static final Api.ClientKey<zze> CLIENT_KEY = new Api.ClientKey<>();
    @Deprecated
    public static final zzm zzaj = new zzd();

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.phenotype.zzm, com.google.android.gms.internal.phenotype.zzd] */
    static {
        zzl zzl = new zzl();
        CLIENT_BUILDER = zzl;
        API = new Api<>("Phenotype.API", zzl, CLIENT_KEY);
    }

    @KeepForSdk
    public static Uri getContentProviderUri(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
