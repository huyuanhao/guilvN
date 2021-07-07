package com.google.android.gms.signin;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;

public final class SignInOptions implements Api.ApiOptions.Optional {
    public static final SignInOptions DEFAULT = new SignInOptions(false, false, null, false, null, false, null, null);
    public final boolean zaaa = false;
    public final String zaab = null;
    public final String zaac = null;
    public final boolean zars = false;
    public final boolean zart = false;
    public final Long zaru = null;
    public final Long zarv = null;
    public final boolean zay = false;

    public static final class zaa {
    }

    static {
        new zaa();
    }

    public SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, Long l, Long l2) {
    }

    @Nullable
    public final Long getAuthApiSignInModuleVersion() {
        return this.zaru;
    }

    @Nullable
    public final String getHostedDomain() {
        return this.zaac;
    }

    @Nullable
    public final Long getRealClientLibraryVersion() {
        return this.zarv;
    }

    public final String getServerClientId() {
        return this.zaab;
    }

    public final boolean isForceCodeForRefreshToken() {
        return this.zaaa;
    }

    public final boolean isIdTokenRequested() {
        return this.zay;
    }

    public final boolean isOfflineAccessRequested() {
        return this.zars;
    }

    public final boolean waitForAccessTokenRefresh() {
        return this.zart;
    }
}
