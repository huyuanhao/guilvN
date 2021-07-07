package com.google.android.gms.common.api.internal;

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
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabe implements zabs, zar {
    public final Context mContext;
    public final Api.AbstractClientBuilder<? extends zad, SignInOptions> zacd;
    public final zaaw zaed;
    public final Lock zaen;
    public final ClientSettings zaes;
    public final Map<Api<?>, Boolean> zaev;
    public final GoogleApiAvailabilityLight zaex;
    public final Map<Api.AnyClientKey<?>, Api.Client> zagy;
    public final Condition zahm;
    public final zabg zahn;
    public final Map<Api.AnyClientKey<?>, ConnectionResult> zaho = new HashMap();
    public volatile zabd zahp;
    public ConnectionResult zahq = null;
    public int zahr;
    public final zabt zahs;

    public zabe(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabt zabt) {
        this.mContext = context;
        this.zaen = lock;
        this.zaex = googleApiAvailabilityLight;
        this.zagy = map;
        this.zaes = clientSettings;
        this.zaev = map2;
        this.zacd = abstractClientBuilder;
        this.zaed = zaaw;
        this.zahs = zabt;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq.zaa(this);
        }
        this.zahn = new zabg(this, looper);
        this.zahm = lock.newCondition();
        this.zahp = new zaav(this);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zahm.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zahq;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final void connect() {
        this.zahp.connect();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final void disconnect() {
        if (this.zahp.disconnect()) {
            this.zaho.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat(GlideException.OooO00o.o0ooOoO);
        printWriter.append((CharSequence) str).append("mState=").println(this.zahp);
        for (Api<?> api : this.zaev.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.getName()).println(Constants.COLON_SEPARATOR);
            this.zagy.get(api.getClientKey()).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        t.zau();
        return (T) this.zahp.enqueue(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        t.zau();
        return (T) this.zahp.execute(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        Api.AnyClientKey<?> clientKey = api.getClientKey();
        if (!this.zagy.containsKey(clientKey)) {
            return null;
        }
        if (this.zagy.get(clientKey).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        if (this.zaho.containsKey(clientKey)) {
            return this.zaho.get(clientKey);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnected() {
        return this.zahp instanceof zaah;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnecting() {
        return this.zahp instanceof zaak;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void maybeSignOut() {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.zaen.lock();
        try {
            this.zahp.onConnected(bundle);
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaen.lock();
        try {
            this.zahp.onConnectionSuspended(i);
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zar
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.zaen.lock();
        try {
            this.zahp.zaa(connectionResult, api, z);
        } finally {
            this.zaen.unlock();
        }
    }

    public final void zaaz() {
        this.zaen.lock();
        try {
            this.zahp = new zaak(this, this.zaes, this.zaev, this.zaex, this.zacd, this.zaen, this.mContext);
            this.zahp.begin();
            this.zahm.signalAll();
        } finally {
            this.zaen.unlock();
        }
    }

    public final void zab(RuntimeException runtimeException) {
        this.zahn.sendMessage(this.zahn.obtainMessage(2, runtimeException));
    }

    public final void zaba() {
        this.zaen.lock();
        try {
            this.zaed.zaaw();
            this.zahp = new zaah(this);
            this.zahp.begin();
            this.zahm.signalAll();
        } finally {
            this.zaen.unlock();
        }
    }

    public final void zaf(ConnectionResult connectionResult) {
        this.zaen.lock();
        try {
            this.zahq = connectionResult;
            this.zahp = new zaav(this);
            this.zahp.begin();
            this.zahm.signalAll();
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final void zaw() {
        if (isConnected()) {
            ((zaah) this.zahp).zaam();
        }
    }

    public final void zaa(zabf zabf) {
        this.zahn.sendMessage(this.zahn.obtainMessage(1, zabf));
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        connect();
        long nanos = timeUnit.toNanos(j);
        while (isConnecting()) {
            if (nanos <= 0) {
                try {
                    disconnect();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            } else {
                nanos = this.zahm.awaitNanos(nanos);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zahq;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }
}
