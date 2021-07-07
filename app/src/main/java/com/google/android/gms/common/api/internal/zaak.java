package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaak implements zabd {
    public final Context mContext;
    public final Api.AbstractClientBuilder<? extends zad, SignInOptions> zacd;
    public final Lock zaen;
    public final ClientSettings zaes;
    public final Map<Api<?>, Boolean> zaev;
    public final GoogleApiAvailabilityLight zaex;
    public ConnectionResult zafg;
    public final zabe zafs;
    public int zafv;
    public int zafw = 0;
    public int zafx;
    public final Bundle zafy = new Bundle();
    public final Set<Api.AnyClientKey> zafz = new HashSet();
    public zad zaga;
    public boolean zagb;
    public boolean zagc;
    public boolean zagd;
    public IAccountAccessor zage;
    public boolean zagf;
    public boolean zagg;
    public ArrayList<Future<?>> zagh = new ArrayList<>();

    public zaak(zabe zabe, ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.zafs = zabe;
        this.zaes = clientSettings;
        this.zaev = map;
        this.zaex = googleApiAvailabilityLight;
        this.zacd = abstractClientBuilder;
        this.zaen = lock;
        this.mContext = context;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaa(zaj zaj) {
        if (zac(0)) {
            ConnectionResult connectionResult = zaj.getConnectionResult();
            if (connectionResult.isSuccess()) {
                ResolveAccountResponse zacw = zaj.zacw();
                ConnectionResult connectionResult2 = zacw.getConnectionResult();
                if (!connectionResult2.isSuccess()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    zae(connectionResult2);
                    return;
                }
                this.zagd = true;
                this.zage = zacw.getAccountAccessor();
                this.zagf = zacw.getSaveDefaultAccount();
                this.zagg = zacw.isFromCrossClientAuth();
                zaap();
            } else if (zad(connectionResult)) {
                zaar();
                zaap();
            } else {
                zae(connectionResult);
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zaao() {
        int i = this.zafx - 1;
        this.zafx = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.zafs.zaed.zaay();
            new Exception();
            zae(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.zafg;
        if (connectionResult == null) {
            return true;
        }
        this.zafs.zahr = this.zafv;
        zae(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaap() {
        if (this.zafx == 0) {
            if (!this.zagc || this.zagd) {
                ArrayList arrayList = new ArrayList();
                this.zafw = 1;
                this.zafx = this.zafs.zagy.size();
                for (Api.AnyClientKey<?> anyClientKey : this.zafs.zagy.keySet()) {
                    if (!this.zafs.zaho.containsKey(anyClientKey)) {
                        arrayList.add(this.zafs.zagy.get(anyClientKey));
                    } else if (zaao()) {
                        zaaq();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.zagh.add(zabh.zabb().submit(new zaaq(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    private final void zaaq() {
        this.zafs.zaba();
        zabh.zabb().execute(new zaal(this));
        zad zad = this.zaga;
        if (zad != null) {
            if (this.zagf) {
                zad.zaa(this.zage, this.zagg);
            }
            zab(false);
        }
        for (Api.AnyClientKey<?> anyClientKey : this.zafs.zaho.keySet()) {
            this.zafs.zagy.get(anyClientKey).disconnect();
        }
        this.zafs.zahs.zab(this.zafy.isEmpty() ? null : this.zafy);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaar() {
        this.zagc = false;
        this.zafs.zaed.zagz = Collections.emptySet();
        for (Api.AnyClientKey<?> anyClientKey : this.zafz) {
            if (!this.zafs.zaho.containsKey(anyClientKey)) {
                this.zafs.zaho.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void zaas() {
        ArrayList<Future<?>> arrayList = this.zagh;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.zagh.clear();
    }

    /* access modifiers changed from: private */
    public final Set<Scope> zaat() {
        if (this.zaes == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.zaes.getRequiredScopes());
        Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = this.zaes.getOptionalApiSettings();
        for (Api<?> api : optionalApiSettings.keySet()) {
            if (!this.zafs.zaho.containsKey(api.getClientKey())) {
                hashSet.addAll(optionalApiSettings.get(api).mScopes);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zab(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r6.zah()
            int r0 = r0.getPriority()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.hasResolution()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.zaex
            int r3 = r5.getErrorCode()
            android.content.Intent r7 = r7.getErrorResolutionIntent(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.zafg
            if (r7 == 0) goto L_0x002c
            int r7 = r4.zafv
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.zafg = r5
            r4.zafv = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.zabe r7 = r4.zafs
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.zaho
            com.google.android.gms.common.api.Api$AnyClientKey r6 = r6.getClientKey()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaak.zab(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zac(int i) {
        if (this.zafw == i) {
            return true;
        }
        this.zafs.zaed.zaay();
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        sb.toString();
        int i2 = this.zafx;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        sb2.toString();
        String zad = zad(this.zafw);
        String zad2 = zad(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(zad).length() + 70 + String.valueOf(zad2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(zad);
        sb3.append(" but received callback for step ");
        sb3.append(zad2);
        sb3.toString();
        new Exception();
        zae(new ConnectionResult(8, null));
        return false;
    }

    public static String zad(int i) {
        return i != 0 ? i != 1 ? NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zad(ConnectionResult connectionResult) {
        return this.zagb && !connectionResult.hasResolution();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zae(ConnectionResult connectionResult) {
        zaas();
        zab(!connectionResult.hasResolution());
        this.zafs.zaf(connectionResult);
        this.zafs.zahs.zac(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void begin() {
        this.zafs.zaho.clear();
        this.zagc = false;
        this.zafg = null;
        this.zafw = 0;
        this.zagb = true;
        this.zagd = false;
        this.zagf = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api<?> api : this.zaev.keySet()) {
            Api.Client client = this.zafs.zagy.get(api.getClientKey());
            z |= api.zah().getPriority() == 1;
            boolean booleanValue = this.zaev.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.zagc = true;
                if (booleanValue) {
                    this.zafz.add(api.getClientKey());
                } else {
                    this.zagb = false;
                }
            }
            hashMap.put(client, new zaam(this, api, booleanValue));
        }
        if (z) {
            this.zagc = false;
        }
        if (this.zagc) {
            this.zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(this.zafs.zaed)));
            zaat zaat = new zaat(this, null);
            Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.zacd;
            Context context = this.mContext;
            Looper looper = this.zafs.zaed.getLooper();
            ClientSettings clientSettings = this.zaes;
            this.zaga = (zad) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.getSignInOptions(), zaat, zaat);
        }
        this.zafx = this.zafs.zagy.size();
        this.zagh.add(zabh.zabb().submit(new zaan(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void connect() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        zaas();
        zab(true);
        this.zafs.zaf(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        this.zafs.zaed.zafb.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    @GuardedBy("mLock")
    public final void onConnected(Bundle bundle) {
        if (zac(1)) {
            if (bundle != null) {
                this.zafy.putAll(bundle);
            }
            if (zaao()) {
                zaaq();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    @GuardedBy("mLock")
    public final void onConnectionSuspended(int i) {
        zae(new ConnectionResult(8, null));
    }

    private final void zab(boolean z) {
        zad zad = this.zaga;
        if (zad != null) {
            if (zad.isConnected() && z) {
                this.zaga.zacv();
            }
            this.zaga.disconnect();
            this.zage = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (zac(1)) {
            zab(connectionResult, api, z);
            if (zaao()) {
                zaaq();
            }
        }
    }
}
