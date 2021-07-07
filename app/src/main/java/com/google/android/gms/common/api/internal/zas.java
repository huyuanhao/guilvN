package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.p118pd.sdk.C6971o0000oO0;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zas implements zabs {
    public final Context mContext;
    public final Looper zabj;
    public final zaaw zaed;
    public final zabe zaee;
    public final zabe zaef;
    public final Map<Api.AnyClientKey<?>, zabe> zaeg;
    public final Set<SignInConnectionListener> zaeh = Collections.newSetFromMap(new WeakHashMap());
    public final Api.Client zaei;
    public Bundle zaej;
    public ConnectionResult zaek = null;
    public ConnectionResult zael = null;
    public boolean zaem = false;
    public final Lock zaen;
    @GuardedBy("mLock")
    public int zaeo = 0;

    public zas(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.mContext = context;
        this.zaed = zaaw;
        this.zaen = lock;
        this.zabj = looper;
        this.zaei = client;
        this.zaee = new zabe(context, zaaw, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zau(this, null));
        this.zaef = new zabe(context, this.zaed, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zav(this, null));
        C6971o0000oO0 o0000oo0 = new C6971o0000oO0();
        for (Api.AnyClientKey<?> anyClientKey : map2.keySet()) {
            o0000oo0.put(anyClientKey, this.zaee);
        }
        for (Api.AnyClientKey<?> anyClientKey2 : map.keySet()) {
            o0000oo0.put(anyClientKey2, this.zaef);
        }
        this.zaeg = Collections.unmodifiableMap(o0000oo0);
    }

    public static zas zaa(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        C6971o0000oO0 o0000oo0 = new C6971o0000oO0();
        C6971o0000oO0 o0000oo02 = new C6971o0000oO0();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                o0000oo0.put(entry.getKey(), value);
            } else {
                o0000oo02.put(entry.getKey(), value);
            }
        }
        Preconditions.checkState(!o0000oo0.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C6971o0000oO0 o0000oo03 = new C6971o0000oO0();
        C6971o0000oO0 o0000oo04 = new C6971o0000oO0();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> clientKey = api.getClientKey();
            if (o0000oo0.containsKey(clientKey)) {
                o0000oo03.put(api, map2.get(api));
            } else if (o0000oo02.containsKey(clientKey)) {
                o0000oo04.put(api, map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq zaq2 = zaq;
            if (o0000oo03.containsKey(zaq2.mApi)) {
                arrayList2.add(zaq2);
            } else if (o0000oo04.containsKey(zaq2.mApi)) {
                arrayList3.add(zaq2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zas(context, zaaw, lock, looper, googleApiAvailabilityLight, o0000oo0, o0000oo02, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, o0000oo03, o0000oo04);
    }

    @Nullable
    private final PendingIntent zaaa() {
        if (this.zaei == null) {
            return null;
        }
        return PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zaed), this.zaei.getSignInIntent(), 134217728);
    }

    public static boolean zab(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zax() {
        ConnectionResult connectionResult;
        if (zab(this.zaek)) {
            if (zab(this.zael) || zaz()) {
                int i = this.zaeo;
                if (i != 1) {
                    if (i != 2) {
                        new AssertionError();
                        this.zaeo = 0;
                        return;
                    }
                    this.zaed.zab(this.zaej);
                }
                zay();
                this.zaeo = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.zael;
            if (connectionResult2 == null) {
                return;
            }
            if (this.zaeo == 1) {
                zay();
                return;
            }
            zaa(connectionResult2);
            this.zaee.disconnect();
        } else if (this.zaek == null || !zab(this.zael)) {
            ConnectionResult connectionResult3 = this.zaek;
            if (connectionResult3 != null && (connectionResult = this.zael) != null) {
                if (this.zaef.zahr < this.zaee.zahr) {
                    connectionResult3 = connectionResult;
                }
                zaa(connectionResult3);
            }
        } else {
            this.zaef.disconnect();
            zaa(this.zaek);
        }
    }

    @GuardedBy("mLock")
    private final void zay() {
        for (SignInConnectionListener signInConnectionListener : this.zaeh) {
            signInConnectionListener.onComplete();
        }
        this.zaeh.clear();
    }

    @GuardedBy("mLock")
    private final boolean zaz() {
        ConnectionResult connectionResult = this.zael;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final void connect() {
        this.zaeo = 2;
        this.zaem = false;
        this.zael = null;
        this.zaek = null;
        this.zaee.connect();
        this.zaef.connect();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final void disconnect() {
        this.zael = null;
        this.zaek = null;
        this.zaeo = 0;
        this.zaee.disconnect();
        this.zaef.disconnect();
        zay();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(Constants.COLON_SEPARATOR);
        this.zaef.dump(String.valueOf(str).concat(GlideException.OooO00o.o0ooOoO), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(Constants.COLON_SEPARATOR);
        this.zaee.dump(String.valueOf(str).concat(GlideException.OooO00o.o0ooOoO), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        if (!zaa(t)) {
            return (T) this.zaee.enqueue(t);
        }
        if (!zaz()) {
            return (T) this.zaef.enqueue(t);
        }
        t.setFailedResult(new Status(4, null, zaaa()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        if (!zaa(t)) {
            return (T) this.zaee.execute(t);
        }
        if (!zaz()) {
            return (T) this.zaef.execute(t);
        }
        t.setFailedResult(new Status(4, null, zaaa()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        if (!this.zaeg.get(api.getClientKey()).equals(this.zaef)) {
            return this.zaee.getConnectionResult(api);
        }
        if (zaz()) {
            return new ConnectionResult(4, zaaa());
        }
        return this.zaef.getConnectionResult(api);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnected() {
        this.zaen.lock();
        try {
            boolean z = true;
            if (!this.zaee.isConnected() || (!this.zaef.isConnected() && !zaz() && this.zaeo != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnecting() {
        this.zaen.lock();
        try {
            return this.zaeo == 2;
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        this.zaen.lock();
        try {
            if ((isConnecting() || isConnected()) && !this.zaef.isConnected()) {
                this.zaeh.add(signInConnectionListener);
                if (this.zaeo == 0) {
                    this.zaeo = 1;
                }
                this.zael = null;
                this.zaef.connect();
                return true;
            }
            this.zaen.unlock();
            return false;
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void maybeSignOut() {
        this.zaen.lock();
        try {
            boolean isConnecting = isConnecting();
            this.zaef.disconnect();
            this.zael = new ConnectionResult(4);
            if (isConnecting) {
                new zal(this.zabj).post(new zat(this));
            } else {
                zay();
            }
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final void zaw() {
        this.zaee.zaw();
        this.zaef.zaw();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    private final void zaa(ConnectionResult connectionResult) {
        int i = this.zaeo;
        if (i != 1) {
            if (i != 2) {
                new Exception();
                this.zaeo = 0;
            }
            this.zaed.zac(connectionResult);
        }
        zay();
        this.zaeo = 0;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaa(int i, boolean z) {
        this.zaed.zab(i, z);
        this.zael = null;
        this.zaek = null;
    }

    private final boolean zaa(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> clientKey = apiMethodImpl.getClientKey();
        Preconditions.checkArgument(this.zaeg.containsKey(clientKey), "GoogleApiClient is not configured to use the API required for this call.");
        return this.zaeg.get(clientKey).equals(this.zaef);
    }

    /* access modifiers changed from: private */
    public final void zaa(Bundle bundle) {
        Bundle bundle2 = this.zaej;
        if (bundle2 == null) {
            this.zaej = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }
}
