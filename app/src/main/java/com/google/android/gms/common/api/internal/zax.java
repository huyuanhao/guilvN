package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.p118pd.sdk.C6971o0000oO0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zax implements zabs {
    public final Looper zabj;
    public final GoogleApiManager zabm;
    public final Lock zaen;
    public final ClientSettings zaes;
    public final Map<Api.AnyClientKey<?>, zaw<?>> zaet = new HashMap();
    public final Map<Api.AnyClientKey<?>, zaw<?>> zaeu = new HashMap();
    public final Map<Api<?>, Boolean> zaev;
    public final zaaw zaew;
    public final GoogleApiAvailabilityLight zaex;
    public final Condition zaey;
    public final boolean zaez;
    public final boolean zafa;
    public final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zafb = new LinkedList();
    @GuardedBy("mLock")
    public boolean zafc;
    @GuardedBy("mLock")
    public Map<zai<?>, ConnectionResult> zafd;
    @GuardedBy("mLock")
    public Map<zai<?>, ConnectionResult> zafe;
    @GuardedBy("mLock")
    public zaaa zaff;
    @GuardedBy("mLock")
    public ConnectionResult zafg;

    public zax(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zaaw zaaw, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.zaen = lock;
        this.zabj = looper;
        this.zaey = lock.newCondition();
        this.zaex = googleApiAvailabilityLight;
        this.zaew = zaaw;
        this.zaev = map2;
        this.zaes = clientSettings;
        this.zaez = z;
        HashMap hashMap = new HashMap();
        for (Api<?> api : map2.keySet()) {
            hashMap.put(api.getClientKey(), api);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq zaq2 = zaq;
            hashMap2.put(zaq2.mApi, zaq2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api api2 = (Api) hashMap.get(entry.getKey());
            Api.Client value = entry.getValue();
            if (value.requiresGooglePlayServices()) {
                z3 = z6;
                if (!this.zaev.get(api2).booleanValue()) {
                    z4 = true;
                    z2 = true;
                } else {
                    z2 = z7;
                    z4 = true;
                }
            } else {
                z4 = z5;
                z2 = z7;
                z3 = false;
            }
            zaw<?> zaw = new zaw<>(context, api2, looper, value, (zaq) hashMap2.get(api2), clientSettings, abstractClientBuilder);
            this.zaet.put(entry.getKey(), zaw);
            if (value.requiresSignIn()) {
                this.zaeu.put(entry.getKey(), zaw);
            }
            z5 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.zafa = z5 && !z6 && !z7;
        this.zabm = GoogleApiManager.zabc();
    }

    @Nullable
    private final ConnectionResult zaa(@NonNull Api.AnyClientKey<?> anyClientKey) {
        this.zaen.lock();
        try {
            zaw<?> zaw = this.zaet.get(anyClientKey);
            if (this.zafd != null && zaw != null) {
                return this.zafd.get(zaw.zak());
            }
            this.zaen.unlock();
            return null;
        } finally {
            this.zaen.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zaac() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaen
            r0.lock()
            boolean r0 = r3.zafc     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.zaez     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.internal.zaw<?>> r0 = r3.zaeu     // Catch:{ all -> 0x0044 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.ConnectionResult r2 = r3.zaa(r2)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = r2.isSuccess()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0019
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = r3.zaen
            r0.unlock()
            return r1
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.zaen
            r0.unlock()
            r0 = 1
            return r0
        L_0x003e:
            java.util.concurrent.locks.Lock r0 = r3.zaen
            r0.unlock()
            return r1
        L_0x0044:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zaen
            r1.unlock()
            goto L_0x004c
        L_0x004b:
            throw r0
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zax.zaac():boolean");
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaad() {
        if (this.zaes == null) {
            this.zaew.zagz = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.zaes.getRequiredScopes());
        Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = this.zaes.getOptionalApiSettings();
        for (Api<?> api : optionalApiSettings.keySet()) {
            ConnectionResult connectionResult = getConnectionResult(api);
            if (connectionResult != null && connectionResult.isSuccess()) {
                hashSet.addAll(optionalApiSettings.get(api).mScopes);
            }
        }
        this.zaew.zagz = hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaae() {
        while (!this.zafb.isEmpty()) {
            execute(this.zafb.remove());
        }
        this.zaew.zab((Bundle) null);
    }

    /* access modifiers changed from: private */
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zaaf() {
        int i = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (zaw<?> zaw : this.zaet.values()) {
            Api<?> api = zaw.getApi();
            ConnectionResult connectionResult3 = this.zafd.get(zaw.zak());
            if (!connectionResult3.isSuccess() && (!this.zaev.get(api).booleanValue() || connectionResult3.hasResolution() || this.zaex.isUserResolvableError(connectionResult3.getErrorCode()))) {
                if (connectionResult3.getErrorCode() != 4 || !this.zaez) {
                    int priority = api.zah().getPriority();
                    if (connectionResult == null || i > priority) {
                        connectionResult = connectionResult3;
                        i = priority;
                    }
                } else {
                    int priority2 = api.zah().getPriority();
                    if (connectionResult2 == null || i2 > priority2) {
                        connectionResult2 = connectionResult3;
                        i2 = priority2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean zab(@NonNull T t) {
        Api.AnyClientKey<?> clientKey = t.getClientKey();
        ConnectionResult zaa = zaa(clientKey);
        if (zaa == null || zaa.getErrorCode() != 4) {
            return false;
        }
        t.setFailedResult(new Status(4, null, this.zabm.zaa(this.zaet.get(clientKey).zak(), System.identityHashCode(this.zaew))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zaey.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zafg;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void connect() {
        this.zaen.lock();
        try {
            if (!this.zafc) {
                this.zafc = true;
                this.zafd = null;
                this.zafe = null;
                this.zaff = null;
                this.zafg = null;
                this.zabm.zao();
                this.zabm.zaa(this.zaet.values()).addOnCompleteListener(new HandlerExecutor(this.zabj), new zaz(this));
                this.zaen.unlock();
            }
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void disconnect() {
        this.zaen.lock();
        try {
            this.zafc = false;
            this.zafd = null;
            this.zafe = null;
            if (this.zaff != null) {
                this.zaff.cancel();
                this.zaff = null;
            }
            this.zafg = null;
            while (!this.zafb.isEmpty()) {
                BaseImplementation.ApiMethodImpl<?, ?> remove = this.zafb.remove();
                remove.zaa((zacs) null);
                remove.cancel();
            }
            this.zaey.signalAll();
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        if (this.zaez && zab(t)) {
            return t;
        }
        if (!isConnected()) {
            this.zafb.add(t);
            return t;
        }
        this.zaew.zahe.zab(t);
        return (T) this.zaet.get(t.getClientKey()).doRead(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Api.AnyClientKey<A> clientKey = t.getClientKey();
        if (this.zaez && zab(t)) {
            return t;
        }
        this.zaew.zahe.zab(t);
        return (T) this.zaet.get(clientKey).doWrite(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        return zaa(api.getClientKey());
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnected() {
        this.zaen.lock();
        try {
            return this.zafd != null && this.zafg == null;
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnecting() {
        this.zaen.lock();
        try {
            return this.zafd == null && this.zafc;
        } finally {
            this.zaen.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        this.zaen.lock();
        try {
            if (!this.zafc || zaac()) {
                this.zaen.unlock();
                return false;
            }
            this.zabm.zao();
            this.zaff = new zaaa(this, signInConnectionListener);
            this.zabm.zaa(this.zaeu.values()).addOnCompleteListener(new HandlerExecutor(this.zabj), this.zaff);
            this.zaen.unlock();
            return true;
        } catch (Throwable th) {
            this.zaen.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void maybeSignOut() {
        this.zaen.lock();
        try {
            this.zabm.maybeSignOut();
            if (this.zaff != null) {
                this.zaff.cancel();
                this.zaff = null;
            }
            if (this.zafe == null) {
                this.zafe = new C6971o0000oO0(this.zaeu.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (zaw<?> zaw : this.zaeu.values()) {
                this.zafe.put(zaw.zak(), connectionResult);
            }
            if (this.zafd != null) {
                this.zafd.putAll(this.zafe);
            }
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zaw() {
    }

    /* access modifiers changed from: private */
    public final boolean zaa(zaw<?> zaw, ConnectionResult connectionResult) {
        return !connectionResult.isSuccess() && !connectionResult.hasResolution() && this.zaev.get(zaw.getApi()).booleanValue() && zaw.zaab().requiresGooglePlayServices() && this.zaex.isUserResolvableError(connectionResult.getErrorCode());
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
                nanos = this.zaey.awaitNanos(nanos);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zafg;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }
}
