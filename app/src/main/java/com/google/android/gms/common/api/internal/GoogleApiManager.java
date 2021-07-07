package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p118pd.sdk.C1IlLiL1;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C6972o0000oOO;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public class GoogleApiManager implements Handler.Callback {
    public static final Object lock = new Object();
    public static final Status zahw = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status zahx = new Status(4, "The user must be signed in to make this API call.");
    @GuardedBy("lock")
    public static GoogleApiManager zaib;
    public final Handler handler;
    public long zahy = WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS;
    public long zahz = C1IlLiL1.f22762OooO0O0;
    public long zaia = TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE;
    public final Context zaic;
    public final GoogleApiAvailability zaid;
    public final GoogleApiAvailabilityCache zaie;
    public final AtomicInteger zaif = new AtomicInteger(1);
    public final AtomicInteger zaig = new AtomicInteger(0);
    public final Map<zai<?>, zaa<?>> zaih = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    public zaae zaii = null;
    @GuardedBy("lock")
    public final Set<zai<?>> zaij = new C6972o0000oOO();
    public final Set<zai<?>> zaik = new C6972o0000oOO();

    public class zac implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        public final zai<?> zafp;
        public final Api.Client zain;
        public IAccountAccessor zajc = null;
        public Set<Scope> zajd = null;
        public boolean zaje = false;

        public zac(Api.Client client, zai<?> zai) {
            this.zain = client;
            this.zafp = zai;
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zabr() {
            IAccountAccessor iAccountAccessor;
            if (this.zaje && (iAccountAccessor = this.zajc) != null) {
                this.zain.getRemoteService(iAccountAccessor, this.zajd);
            }
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
            GoogleApiManager.this.handler.post(new zabo(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.zach
        @WorkerThread
        public final void zaa(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                new Exception();
                zag(new ConnectionResult(4));
                return;
            }
            this.zajc = iAccountAccessor;
            this.zajd = set;
            zabr();
        }

        @Override // com.google.android.gms.common.api.internal.zach
        @WorkerThread
        public final void zag(ConnectionResult connectionResult) {
            ((zaa) GoogleApiManager.this.zaih.get(this.zafp)).zag(connectionResult);
        }
    }

    @KeepForSdk
    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zaic = context;
        this.handler = new zal(looper, this);
        this.zaid = googleApiAvailability;
        this.zaie = new GoogleApiAvailabilityCache(googleApiAvailability);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (lock) {
            if (zaib != null) {
                GoogleApiManager googleApiManager = zaib;
                googleApiManager.zaig.incrementAndGet();
                googleApiManager.handler.sendMessageAtFrontOfQueue(googleApiManager.handler.obtainMessage(10));
            }
        }
    }

    public static GoogleApiManager zab(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (lock) {
            if (zaib == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zaib = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zaib;
        }
        return googleApiManager;
    }

    public static GoogleApiManager zabc() {
        GoogleApiManager googleApiManager;
        synchronized (lock) {
            Preconditions.checkNotNull(zaib, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zaib;
        }
        return googleApiManager;
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        int i = message.what;
        long j = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        zaa<?> zaa2 = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE;
                }
                this.zaia = j;
                this.handler.removeMessages(12);
                for (zai<?> zai : this.zaih.keySet()) {
                    Handler handler2 = this.handler;
                    handler2.sendMessageDelayed(handler2.obtainMessage(12, zai), this.zaia);
                }
                break;
            case 2:
                zak zak = (zak) message.obj;
                Iterator<zai<?>> it = zak.zap().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        zai<?> next = it.next();
                        zaa<?> zaa3 = this.zaih.get(next);
                        if (zaa3 == null) {
                            zak.zaa(next, new ConnectionResult(13), null);
                            break;
                        } else if (zaa3.isConnected()) {
                            zak.zaa(next, ConnectionResult.RESULT_SUCCESS, zaa3.zaab().getEndpointPackageName());
                        } else if (zaa3.zabm() != null) {
                            zak.zaa(next, zaa3.zabm(), null);
                        } else {
                            zaa3.zaa(zak);
                            zaa3.connect();
                        }
                    }
                }
            case 3:
                for (zaa<?> zaa4 : this.zaih.values()) {
                    zaa4.zabl();
                    zaa4.connect();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabv zabv = (zabv) message.obj;
                zaa<?> zaa5 = this.zaih.get(zabv.zajs.zak());
                if (zaa5 == null) {
                    zab(zabv.zajs);
                    zaa5 = this.zaih.get(zabv.zajs.zak());
                }
                if (!zaa5.requiresSignIn() || this.zaig.get() == zabv.zajr) {
                    zaa5.zaa(zabv.zajq);
                    break;
                } else {
                    zabv.zajq.zaa(zahw);
                    zaa5.zabj();
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.zaih.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa<?> next2 = it2.next();
                        if (next2.getInstanceId() == i2) {
                            zaa2 = next2;
                        }
                    }
                }
                if (zaa2 != null) {
                    String errorString = this.zaid.getErrorString(connectionResult.getErrorCode());
                    String errorMessage = connectionResult.getErrorMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(errorString);
                    sb.append(": ");
                    sb.append(errorMessage);
                    zaa2.zac(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    sb2.toString();
                    new Exception();
                    break;
                }
            case 6:
                if (PlatformVersion.isAtLeastIceCreamSandwich() && (this.zaic.getApplicationContext() instanceof Application)) {
                    BackgroundDetector.initialize((Application) this.zaic.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabi(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zaia = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
                        break;
                    }
                }
                break;
            case 7:
                zab((GoogleApi) message.obj);
                break;
            case 9:
                if (this.zaih.containsKey(message.obj)) {
                    this.zaih.get(message.obj).resume();
                    break;
                }
                break;
            case 10:
                for (zai<?> zai2 : this.zaik) {
                    this.zaih.remove(zai2).zabj();
                }
                this.zaik.clear();
                break;
            case 11:
                if (this.zaih.containsKey(message.obj)) {
                    this.zaih.get(message.obj).zaav();
                    break;
                }
                break;
            case 12:
                if (this.zaih.containsKey(message.obj)) {
                    this.zaih.get(message.obj).zabp();
                    break;
                }
                break;
            case 14:
                zaaf zaaf = (zaaf) message.obj;
                zai<?> zak2 = zaaf.zak();
                if (!this.zaih.containsKey(zak2)) {
                    zaaf.zaal().setResult(false);
                    break;
                } else {
                    zaaf.zaal().setResult(Boolean.valueOf(this.zaih.get(zak2).zac((zaa) false)));
                    break;
                }
            case 15:
                zab zab2 = (zab) message.obj;
                if (this.zaih.containsKey(zab2.zaja)) {
                    this.zaih.get(zab2.zaja).zaa((zaa) zab2);
                    break;
                }
                break;
            case 16:
                zab zab3 = (zab) message.obj;
                if (this.zaih.containsKey(zab3.zaja)) {
                    this.zaih.get(zab3.zaja).zab((zaa) zab3);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                sb3.toString();
                return false;
        }
        return true;
    }

    public final void maybeSignOut() {
        this.zaig.incrementAndGet();
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(10));
    }

    public final void zaa(GoogleApi<?> googleApi) {
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(7, googleApi));
    }

    public final int zabd() {
        return this.zaif.getAndIncrement();
    }

    public final Task<Boolean> zac(GoogleApi<?> googleApi) {
        zaaf zaaf = new zaaf(googleApi.zak());
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(14, zaaf));
        return zaaf.zaal().getTask();
    }

    public final void zao() {
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(3));
    }

    public final void zaa(@NonNull zaae zaae) {
        synchronized (lock) {
            if (this.zaii != zaae) {
                this.zaii = zaae;
                this.zaij.clear();
            }
            this.zaij.addAll(zaae.zaaj());
        }
    }

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zar {
        public final zai<O> zafp;
        public final Queue<zab> zaim = new LinkedList();
        public final Api.Client zain;
        public final Api.AnyClient zaio;
        public final zaab zaip;
        public final Set<zak> zaiq = new HashSet();
        public final Map<ListenerHolder.ListenerKey<?>, zabw> zair = new HashMap();
        public final int zais;
        public final zace zait;
        public boolean zaiu;
        public final List<zab> zaiv = new ArrayList();
        public ConnectionResult zaiw = null;

        @WorkerThread
        public zaa(GoogleApi<O> googleApi) {
            Api.Client zaa = googleApi.zaa(GoogleApiManager.this.handler.getLooper(), this);
            this.zain = zaa;
            if (zaa instanceof SimpleClientAdapter) {
                this.zaio = ((SimpleClientAdapter) zaa).getClient();
            } else {
                this.zaio = zaa;
            }
            this.zafp = googleApi.zak();
            this.zaip = new zaab();
            this.zais = googleApi.getInstanceId();
            if (this.zain.requiresSignIn()) {
                this.zait = googleApi.zaa(GoogleApiManager.this.zaic, GoogleApiManager.this.handler);
            } else {
                this.zait = null;
            }
        }

        @WorkerThread
        private final boolean zab(zab zab) {
            if (!(zab instanceof zac)) {
                zac(zab);
                return true;
            }
            zac zac = (zac) zab;
            Feature zaa = zaa(zac.zab((zaa<?>) this));
            if (zaa == null) {
                zac(zab);
                return true;
            } else if (zac.zac(this)) {
                zab zab2 = new zab(this.zafp, zaa, null);
                int indexOf = this.zaiv.indexOf(zab2);
                if (indexOf >= 0) {
                    zab zab3 = this.zaiv.get(indexOf);
                    GoogleApiManager.this.handler.removeMessages(15, zab3);
                    GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 15, zab3), GoogleApiManager.this.zahy);
                    return false;
                }
                this.zaiv.add(zab2);
                GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 15, zab2), GoogleApiManager.this.zahy);
                GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 16, zab2), GoogleApiManager.this.zahz);
                ConnectionResult connectionResult = new ConnectionResult(2, null);
                if (zah(connectionResult)) {
                    return false;
                }
                GoogleApiManager.this.zac(connectionResult, this.zais);
                return false;
            } else {
                zac.zaa(new UnsupportedApiCallException(zaa));
                return false;
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zabg() {
            zabl();
            zai(ConnectionResult.RESULT_SUCCESS);
            zabn();
            Iterator<zabw> it = this.zair.values().iterator();
            while (it.hasNext()) {
                zabw next = it.next();
                if (zaa(next.zajw.getRequiredFeatures()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zajw.registerListener(this.zaio, new TaskCompletionSource<>());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.zain.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            zabi();
            zabo();
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zabh() {
            zabl();
            this.zaiu = true;
            this.zaip.zaai();
            GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 9, this.zafp), GoogleApiManager.this.zahy);
            GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 11, this.zafp), GoogleApiManager.this.zahz);
            GoogleApiManager.this.zaie.flush();
        }

        @WorkerThread
        private final void zabi() {
            ArrayList arrayList = new ArrayList(this.zaim);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zab = (zab) obj;
                if (!this.zain.isConnected()) {
                    return;
                }
                if (zab(zab)) {
                    this.zaim.remove(zab);
                }
            }
        }

        @WorkerThread
        private final void zabn() {
            if (this.zaiu) {
                GoogleApiManager.this.handler.removeMessages(11, this.zafp);
                GoogleApiManager.this.handler.removeMessages(9, this.zafp);
                this.zaiu = false;
            }
        }

        private final void zabo() {
            GoogleApiManager.this.handler.removeMessages(12, this.zafp);
            GoogleApiManager.this.handler.sendMessageDelayed(GoogleApiManager.this.handler.obtainMessage(12, this.zafp), GoogleApiManager.this.zaia);
        }

        @WorkerThread
        private final void zac(zab zab) {
            zab.zaa(this.zaip, requiresSignIn());
            try {
                zab.zaa((zaa<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zain.disconnect();
            }
        }

        @WorkerThread
        private final boolean zah(@NonNull ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.lock) {
                if (GoogleApiManager.this.zaii == null || !GoogleApiManager.this.zaij.contains(this.zafp)) {
                    return false;
                }
                GoogleApiManager.this.zaii.zab(connectionResult, this.zais);
                return true;
            }
        }

        @WorkerThread
        private final void zai(ConnectionResult connectionResult) {
            for (zak zak : this.zaiq) {
                String str = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.zain.getEndpointPackageName();
                }
                zak.zaa(this.zafp, connectionResult, str);
            }
            this.zaiq.clear();
        }

        @WorkerThread
        public final void connect() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (!this.zain.isConnected() && !this.zain.isConnecting()) {
                int clientAvailability = GoogleApiManager.this.zaie.getClientAvailability(GoogleApiManager.this.zaic, this.zain);
                if (clientAvailability != 0) {
                    onConnectionFailed(new ConnectionResult(clientAvailability, null));
                    return;
                }
                zac zac = new zac(this.zain, this.zafp);
                if (this.zain.requiresSignIn()) {
                    this.zait.zaa(zac);
                }
                this.zain.connect(zac);
            }
        }

        public final int getInstanceId() {
            return this.zais;
        }

        public final boolean isConnected() {
            return this.zain.isConnected();
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
        public final void onConnected(@Nullable Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.handler.getLooper()) {
                zabg();
            } else {
                GoogleApiManager.this.handler.post(new zabj(this));
            }
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
        @WorkerThread
        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            zace zace = this.zait;
            if (zace != null) {
                zace.zabs();
            }
            zabl();
            GoogleApiManager.this.zaie.flush();
            zai(connectionResult);
            if (connectionResult.getErrorCode() == 4) {
                zac(GoogleApiManager.zahx);
            } else if (this.zaim.isEmpty()) {
                this.zaiw = connectionResult;
            } else if (!zah(connectionResult) && !GoogleApiManager.this.zac(connectionResult, this.zais)) {
                if (connectionResult.getErrorCode() == 18) {
                    this.zaiu = true;
                }
                if (this.zaiu) {
                    GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 9, this.zafp), GoogleApiManager.this.zahy);
                    return;
                }
                String zan = this.zafp.zan();
                StringBuilder sb = new StringBuilder(String.valueOf(zan).length() + 38);
                sb.append("API: ");
                sb.append(zan);
                sb.append(" is not available on this device.");
                zac(new Status(17, sb.toString()));
            }
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.handler.getLooper()) {
                zabh();
            } else {
                GoogleApiManager.this.handler.post(new zabk(this));
            }
        }

        public final boolean requiresSignIn() {
            return this.zain.requiresSignIn();
        }

        @WorkerThread
        public final void resume() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (this.zaiu) {
                connect();
            }
        }

        @Override // com.google.android.gms.common.api.internal.zar
        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.handler.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                GoogleApiManager.this.handler.post(new zabl(this, connectionResult));
            }
        }

        public final Api.Client zaab() {
            return this.zain;
        }

        @WorkerThread
        public final void zaav() {
            Status status;
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (this.zaiu) {
                zabn();
                if (GoogleApiManager.this.zaid.isGooglePlayServicesAvailable(GoogleApiManager.this.zaic) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                zac(status);
                this.zain.disconnect();
            }
        }

        @WorkerThread
        public final void zabj() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            zac(GoogleApiManager.zahw);
            this.zaip.zaah();
            for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zair.keySet().toArray(new ListenerHolder.ListenerKey[this.zair.size()])) {
                zaa(new zah(listenerKey, new TaskCompletionSource()));
            }
            zai(new ConnectionResult(4));
            if (this.zain.isConnected()) {
                this.zain.onUserSignOut(new zabm(this));
            }
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabw> zabk() {
            return this.zair;
        }

        @WorkerThread
        public final void zabl() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            this.zaiw = null;
        }

        @WorkerThread
        public final ConnectionResult zabm() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            return this.zaiw;
        }

        @WorkerThread
        public final boolean zabp() {
            return zac(true);
        }

        public final zad zabq() {
            zace zace = this.zait;
            if (zace == null) {
                return null;
            }
            return zace.zabq();
        }

        @WorkerThread
        public final void zag(@NonNull ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            this.zain.disconnect();
            onConnectionFailed(connectionResult);
        }

        @WorkerThread
        public final void zaa(zab zab) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (!this.zain.isConnected()) {
                this.zaim.add(zab);
                ConnectionResult connectionResult = this.zaiw;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    connect();
                } else {
                    onConnectionFailed(this.zaiw);
                }
            } else if (zab(zab)) {
                zabo();
            } else {
                this.zaim.add(zab);
            }
        }

        @WorkerThread
        public final void zac(Status status) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            for (zab zab : this.zaim) {
                zab.zaa(status);
            }
            this.zaim.clear();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @WorkerThread
        private final boolean zac(boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (!this.zain.isConnected() || this.zair.size() != 0) {
                return false;
            }
            if (this.zaip.zaag()) {
                if (z) {
                    zabo();
                }
                return false;
            }
            this.zain.disconnect();
            return true;
        }

        @WorkerThread
        public final void zaa(zak zak) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            this.zaiq.add(zak);
        }

        @Nullable
        @WorkerThread
        private final Feature zaa(@Nullable Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.zain.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                C6971o0000oO0 o0000oo0 = new C6971o0000oO0(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    o0000oo0.put(feature.getName(), Long.valueOf(feature.getVersion()));
                }
                for (Feature feature2 : featureArr) {
                    if (!o0000oo0.containsKey(feature2.getName()) || ((Long) o0000oo0.get(feature2.getName())).longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @WorkerThread
        private final void zaa(zab zab) {
            if (!this.zaiv.contains(zab) || this.zaiu) {
                return;
            }
            if (!this.zain.isConnected()) {
                connect();
            } else {
                zabi();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @WorkerThread
        private final void zab(zab zab) {
            Feature[] zab2;
            if (this.zaiv.remove(zab)) {
                GoogleApiManager.this.handler.removeMessages(15, zab);
                GoogleApiManager.this.handler.removeMessages(16, zab);
                Feature feature = zab.zajb;
                ArrayList arrayList = new ArrayList(this.zaim.size());
                for (zab zab3 : this.zaim) {
                    if ((zab3 instanceof zac) && (zab2 = ((zac) zab3).zab((zaa<?>) this)) != null && ArrayUtils.contains(zab2, feature)) {
                        arrayList.add(zab3);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zab zab4 = (zab) obj;
                    this.zaim.remove(zab4);
                    zab4.zaa(new UnsupportedApiCallException(feature));
                }
            }
        }
    }

    public static class zab {
        public final zai<?> zaja;
        public final Feature zajb;

        public zab(zai<?> zai, Feature feature) {
            this.zaja = zai;
            this.zajb = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof zab)) {
                zab zab = (zab) obj;
                if (!Objects.equal(this.zaja, zab.zaja) || !Objects.equal(this.zajb, zab.zajb)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.zaja, this.zajb);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.zaja).add("feature", this.zajb).toString();
        }

        public /* synthetic */ zab(zai zai, Feature feature, zabi zabi) {
            this(zai, feature);
        }
    }

    public final boolean zac(ConnectionResult connectionResult, int i) {
        return this.zaid.zaa(this.zaic, connectionResult, i);
    }

    public final Task<Map<zai<?>, String>> zaa(Iterable<? extends GoogleApi<?>> iterable) {
        zak zak = new zak(iterable);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(2, zak));
        return zak.getTask();
    }

    @WorkerThread
    private final void zab(GoogleApi<?> googleApi) {
        zai<?> zak = googleApi.zak();
        zaa<?> zaa2 = this.zaih.get(zak);
        if (zaa2 == null) {
            zaa2 = new zaa<>(googleApi);
            this.zaih.put(zak, zaa2);
        }
        if (zaa2.requiresSignIn()) {
            this.zaik.add(zak);
        }
        zaa2.connect();
    }

    public final <O extends Api.ApiOptions> void zaa(GoogleApi<O> googleApi, int i, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zae = new zae(i, apiMethodImpl);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(4, new zabv(zae, this.zaig.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zaa(GoogleApi<O> googleApi, int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zag zag = new zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(4, new zabv(zag, this.zaig.get(), googleApi)));
    }

    public final void zab(@NonNull zaae zaae) {
        synchronized (lock) {
            if (this.zaii == zaae) {
                this.zaii = null;
                this.zaij.clear();
            }
        }
    }

    public final <O extends Api.ApiOptions> Task<Void> zaa(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaf zaf = new zaf(new zabw(registerListenerMethod, unregisterListenerMethod), taskCompletionSource);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(8, new zabv(zaf, this.zaig.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Boolean> zaa(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zah zah = new zah(listenerKey, taskCompletionSource);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(13, new zabv(zah, this.zaig.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final PendingIntent zaa(zai<?> zai, int i) {
        zad zabq;
        zaa<?> zaa2 = this.zaih.get(zai);
        if (zaa2 == null || (zabq = zaa2.zabq()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaic, i, zabq.getSignInIntent(), 134217728);
    }

    public final void zaa(ConnectionResult connectionResult, int i) {
        if (!zac(connectionResult, i)) {
            Handler handler2 = this.handler;
            handler2.sendMessage(handler2.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
