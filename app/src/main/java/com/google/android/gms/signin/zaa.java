package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa {
    public static final Api<SignInOptions> API = new Api<>("SignIn.API", zapg, CLIENT_KEY);
    public static final Api.ClientKey<SignInClientImpl> CLIENT_KEY = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zapg = new zab();
    public static final Scope zar = new Scope(Scopes.PROFILE);
    @ShowFirstParty
    public static final Api.ClientKey<SignInClientImpl> zarp = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<SignInClientImpl, Object> zarq = new zac();
    public static final Api<Object> zarr = new Api<>("SignIn.INTERNAL_API", zarq, zarp);
    public static final Scope zas = new Scope("email");
}
