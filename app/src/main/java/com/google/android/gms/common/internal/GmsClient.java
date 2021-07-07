package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@KeepForSdk
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, GmsClientEventManager.GmsClientEventState {
    public final Set<Scope> mScopes;
    public final ClientSettings zaes;
    public final Account zax;

    @VisibleForTesting
    @KeepForSdk
    public GmsClient(Context context, Handler handler, int i, ClientSettings clientSettings) {
        this(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (GoogleApiClient.ConnectionCallbacks) null, (GoogleApiClient.OnConnectionFailedListener) null);
    }

    private final Set<Scope> zaa(@NonNull Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope scope : validateScopes) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.zax;
    }

    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.zaes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set<Scope> getScopes() {
        return this.mScopes;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }

    @KeepForSdk
    public GmsClient(Context context, Looper looper, int i, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (GoogleApiClient.ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener));
    }

    @Nullable
    public static BaseGmsClient.BaseConnectionCallbacks zaa(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new zaf(connectionCallbacks);
    }

    @Nullable
    public static BaseGmsClient.BaseOnConnectionFailedListener zaa(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new zag(onConnectionFailedListener);
    }

    @KeepForSdk
    public GmsClient(Context context, Looper looper, int i, ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (GoogleApiClient.ConnectionCallbacks) null, (GoogleApiClient.OnConnectionFailedListener) null);
    }

    @VisibleForTesting
    public GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, zaa(connectionCallbacks), zaa(onConnectionFailedListener), clientSettings.getRealClientClassName());
        this.zaes = clientSettings;
        this.zax = clientSettings.getAccount();
        this.mScopes = zaa(clientSettings.getAllRequestedScopes());
    }

    @VisibleForTesting
    public GmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, handler, gmsClientSupervisor, googleApiAvailability, i, zaa(connectionCallbacks), zaa(onConnectionFailedListener));
        this.zaes = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        this.zax = clientSettings.getAccount();
        this.mScopes = zaa(clientSettings.getAllRequestedScopes());
    }
}
