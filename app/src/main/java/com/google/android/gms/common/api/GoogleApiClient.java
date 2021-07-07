package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import com.p118pd.sdk.C6971o0000oO0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class GoogleApiClient {
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    @GuardedBy("sAllClients")
    public static final Set<GoogleApiClient> zabq = Collections.newSetFromMap(new WeakHashMap());

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(@Nullable Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(@NonNull ConnectionResult connectionResult);
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (zabq) {
            int i = 0;
            String concat = String.valueOf(str).concat(GlideException.OooO00o.o0ooOoO);
            for (GoogleApiClient googleApiClient : zabq) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set;
        synchronized (zabq) {
            set = zabq;
        }
        return set;
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api<?> api);

    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zaa(zacm zacm) {
        throw new UnsupportedOperationException();
    }

    public void zab(zacm zacm) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public static final class Builder {
        public final Context mContext;
        public Looper zabj;
        public final Set<Scope> zabr;
        public final Set<Scope> zabs;
        public int zabt;
        public View zabu;
        public String zabv;
        public String zabw;
        public final Map<Api<?>, ClientSettings.OptionalApiSettings> zabx;
        public final Map<Api<?>, Api.ApiOptions> zaby;
        public LifecycleActivity zabz;
        public int zaca;
        public OnConnectionFailedListener zacb;
        public GoogleApiAvailability zacc;
        public Api.AbstractClientBuilder<? extends zad, SignInOptions> zacd;
        public final ArrayList<ConnectionCallbacks> zace;
        public final ArrayList<OnConnectionFailedListener> zacf;
        public boolean zacg;
        public Account zax;

        @KeepForSdk
        public Builder(@NonNull Context context) {
            this.zabr = new HashSet();
            this.zabs = new HashSet();
            this.zabx = new C6971o0000oO0();
            this.zaby = new C6971o0000oO0();
            this.zaca = -1;
            this.zacc = GoogleApiAvailability.getInstance();
            this.zacd = zaa.zapg;
            this.zace = new ArrayList<>();
            this.zacf = new ArrayList<>();
            this.zacg = false;
            this.mContext = context;
            this.zabj = context.getMainLooper();
            this.zabv = context.getPackageName();
            this.zabw = context.getClass().getName();
        }

        private final <O extends Api.ApiOptions> void zaa(Api<O> api, O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(api.zah().getImpliedScopes(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zabx.put(api, new ClientSettings.OptionalApiSettings(hashSet));
        }

        public final Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaby.put(api, null);
            List<Scope> impliedScopes = api.zah().getImpliedScopes(null);
            this.zabs.addAll(impliedScopes);
            this.zabr.addAll(impliedScopes);
            return this;
        }

        public final Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaby.put(api, null);
            zaa(api, null, scopeArr);
            return this;
        }

        public final Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zace.add(connectionCallbacks);
            return this;
        }

        public final Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zacf.add(onConnectionFailedListener);
            return this;
        }

        public final Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zabr.add(scope);
            return this;
        }

        @KeepForSdk
        public final Builder addScopeNames(String[] strArr) {
            for (String str : strArr) {
                this.zabr.add(new Scope(str));
            }
            return this;
        }

        public final GoogleApiClient build() {
            Preconditions.checkArgument(!this.zaby.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings buildClientSettings = buildClientSettings();
            Api<?> api = null;
            Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = buildClientSettings.getOptionalApiSettings();
            C6971o0000oO0 o0000oo0 = new C6971o0000oO0();
            C6971o0000oO0 o0000oo02 = new C6971o0000oO0();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Api<?> api2 : this.zaby.keySet()) {
                Api.ApiOptions apiOptions = this.zaby.get(api2);
                boolean z2 = optionalApiSettings.get(api2) != null;
                o0000oo0.put(api2, Boolean.valueOf(z2));
                zaq zaq = new zaq(api2, z2);
                arrayList.add(zaq);
                Api.AbstractClientBuilder<?, ?> zai = api2.zai();
                Api.Client buildClient = zai.buildClient(this.mContext, this.zabj, buildClientSettings, apiOptions, zaq, zaq);
                o0000oo02.put(api2.getClientKey(), buildClient);
                if (zai.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String name = api2.getName();
                        String name2 = api.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21 + String.valueOf(name2).length());
                        sb.append(name);
                        sb.append(" cannot be used with ");
                        sb.append(name2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (api != null) {
                if (!z) {
                    Preconditions.checkState(this.zax == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                    Preconditions.checkState(this.zabr.equals(this.zabs), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
                } else {
                    String name3 = api.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(name3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            zaaw zaaw = new zaaw(this.mContext, new ReentrantLock(), this.zabj, buildClientSettings, this.zacc, this.zacd, o0000oo0, this.zace, this.zacf, o0000oo02, this.zaca, zaaw.zaa(o0000oo02.values(), true), arrayList, false);
            synchronized (GoogleApiClient.zabq) {
                GoogleApiClient.zabq.add(zaaw);
            }
            if (this.zaca >= 0) {
                zaj.zaa(this.zabz).zaa(this.zaca, zaaw, this.zacb);
            }
            return zaaw;
        }

        @VisibleForTesting
        @KeepForSdk
        public final ClientSettings buildClientSettings() {
            SignInOptions signInOptions = SignInOptions.DEFAULT;
            if (this.zaby.containsKey(zaa.API)) {
                signInOptions = (SignInOptions) this.zaby.get(zaa.API);
            }
            return new ClientSettings(this.zax, this.zabr, this.zabx, this.zabt, this.zabu, this.zabv, this.zabw, signInOptions);
        }

        public final Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zaca = i;
            this.zacb = onConnectionFailedListener;
            this.zabz = lifecycleActivity;
            return this;
        }

        public final Builder setAccountName(String str) {
            this.zax = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public final Builder setGravityForPopups(int i) {
            this.zabt = i;
            return this;
        }

        public final Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zabj = handler.getLooper();
            return this;
        }

        public final Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zabu = view;
            return this;
        }

        public final Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaby.put(api, o);
            zaa(api, o, scopeArr);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaby.put(api, o);
            List<Scope> impliedScopes = api.zah().getImpliedScopes(o);
            this.zabs.addAll(impliedScopes);
            this.zabr.addAll(impliedScopes);
            return this;
        }

        public final Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        @KeepForSdk
        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zace.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zacf.add(onConnectionFailedListener);
        }
    }
}
