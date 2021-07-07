package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

@KeepForSdk
public class SignInClientImpl extends GmsClient<zaf> implements zad {
    public final ClientSettings zaes;
    public Integer zaod;
    public final boolean zary;
    public final Bundle zarz;

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zary = true;
        this.zaes = clientSettings;
        this.zarz = bundle;
        this.zaod = clientSettings.getClientSessionId();
    }

    @KeepForSdk
    public static Bundle createBundleFromClientSettings(ClientSettings clientSettings) {
        SignInOptions signInOptions = clientSettings.getSignInOptions();
        Integer clientSessionId = clientSettings.getClientSessionId();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (clientSessionId != null) {
            bundle.putInt(ClientSettings.KEY_CLIENT_SESSION_ID, clientSessionId.intValue());
        }
        if (signInOptions != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signInOptions.isOfflineAccessRequested());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signInOptions.isIdTokenRequested());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", signInOptions.getServerClientId());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signInOptions.isForceCodeForRefreshToken());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signInOptions.getHostedDomain());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signInOptions.waitForAccessTokenRefresh());
            if (signInOptions.getAuthApiSignInModuleVersion() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signInOptions.getAuthApiSignInModuleVersion().longValue());
            }
            if (signInOptions.getRealClientLibraryVersion() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signInOptions.getRealClientLibraryVersion().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.signin.zad
    public final void connect() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zag(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zaes.getRealClientPackageName())) {
            this.zarz.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zaes.getRealClientPackageName());
        }
        return this.zarz;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.GmsClient
    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresSignIn() {
        return this.zary;
    }

    @Override // com.google.android.gms.signin.zad
    public final void zaa(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) getService()).zaa(iAccountAccessor, this.zaod.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.signin.zad
    public final void zacv() {
        try {
            ((zaf) getService()).zam(this.zaod.intValue());
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.zab(new com.google.android.gms.signin.internal.zaj(8));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003c */
    @Override // com.google.android.gms.signin.zad
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zaa(com.google.android.gms.signin.internal.zad r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Expecting a valid ISignInCallbacks"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            com.google.android.gms.common.internal.ClientSettings r0 = r4.zaes     // Catch:{ RemoteException -> 0x003c }
            android.accounts.Account r0 = r0.getAccountOrDefault()     // Catch:{ RemoteException -> 0x003c }
            r1 = 0
            java.lang.String r2 = "<<default account>>"
            java.lang.String r3 = r0.name     // Catch:{ RemoteException -> 0x003c }
            boolean r2 = r2.equals(r3)     // Catch:{ RemoteException -> 0x003c }
            if (r2 == 0) goto L_0x0022
            android.content.Context r1 = r4.getContext()     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.auth.api.signin.internal.Storage r1 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r1)     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getSavedDefaultGoogleSignInAccount()     // Catch:{ RemoteException -> 0x003c }
        L_0x0022:
            com.google.android.gms.common.internal.ResolveAccountRequest r2 = new com.google.android.gms.common.internal.ResolveAccountRequest     // Catch:{ RemoteException -> 0x003c }
            java.lang.Integer r3 = r4.zaod     // Catch:{ RemoteException -> 0x003c }
            int r3 = r3.intValue()     // Catch:{ RemoteException -> 0x003c }
            r2.<init>(r0, r3, r1)     // Catch:{ RemoteException -> 0x003c }
            android.os.IInterface r0 = r4.getService()     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.signin.internal.zaf r0 = (com.google.android.gms.signin.internal.zaf) r0     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.signin.internal.zah r1 = new com.google.android.gms.signin.internal.zah     // Catch:{ RemoteException -> 0x003c }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x003c }
            r0.zaa(r1, r5)     // Catch:{ RemoteException -> 0x003c }
            return
        L_0x003c:
            com.google.android.gms.signin.internal.zaj r0 = new com.google.android.gms.signin.internal.zaj     // Catch:{ RemoteException -> 0x0046 }
            r1 = 8
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0046 }
            r5.zab(r0)     // Catch:{ RemoteException -> 0x0046 }
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.SignInClientImpl.zaa(com.google.android.gms.signin.internal.zad):void");
    }

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, createBundleFromClientSettings(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
