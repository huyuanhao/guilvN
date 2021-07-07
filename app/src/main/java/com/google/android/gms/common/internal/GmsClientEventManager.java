package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager implements Handler.Callback {
    public final Handler mHandler;
    public final Object mLock = new Object();
    public final GmsClientEventState zaok;
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> zaol = new ArrayList<>();
    @VisibleForTesting
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> zaom = new ArrayList<>();
    public final ArrayList<GoogleApiClient.OnConnectionFailedListener> zaon = new ArrayList<>();
    public volatile boolean zaoo = false;
    public final AtomicInteger zaop = new AtomicInteger(0);
    public boolean zaoq = false;

    @VisibleForTesting
    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsClientEventState) {
        this.zaok = gmsClientEventState;
        this.mHandler = new zal(looper, this);
    }

    public final boolean areCallbacksEnabled() {
        return this.zaoo;
    }

    public final void disableCallbacks() {
        this.zaoo = false;
        this.zaop.incrementAndGet();
    }

    public final void enableCallbacks() {
        this.zaoo = true;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.mLock) {
                if (this.zaoo && this.zaok.isConnected() && this.zaol.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(this.zaok.getConnectionHint());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        sb.toString();
        new Exception();
        return false;
    }

    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            contains = this.zaol.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            contains = this.zaon.contains(onConnectionFailedListener);
        }
        return contains;
    }

    @VisibleForTesting
    public final void onConnectionFailure(ConnectionResult connectionResult) {
        int i = 0;
        Preconditions.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onConnectionFailure must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            ArrayList arrayList = new ArrayList(this.zaon);
            int i2 = this.zaop.get();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) obj;
                if (this.zaoo) {
                    if (this.zaop.get() == i2) {
                        if (this.zaon.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                }
                return;
            }
        }
    }

    @VisibleForTesting
    public final void onConnectionSuccess() {
        synchronized (this.mLock) {
            onConnectionSuccess(this.zaok.getConnectionHint());
        }
    }

    @VisibleForTesting
    public final void onUnintentionalDisconnection(int i) {
        Preconditions.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            this.zaoq = true;
            ArrayList arrayList = new ArrayList(this.zaol);
            int i2 = this.zaop.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.zaoo || this.zaop.get() != i2) {
                    break;
                } else if (this.zaol.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.zaom.clear();
            this.zaoq = false;
        }
    }

    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (this.zaol.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.zaol.add(connectionCallbacks);
            }
        }
        if (this.zaok.isConnected()) {
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (this.zaon.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.zaon.add(onConnectionFailedListener);
            }
        }
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (!this.zaol.remove(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            } else if (this.zaoq) {
                this.zaom.add(connectionCallbacks);
            }
        }
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (!this.zaon.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            }
        }
    }

    @VisibleForTesting
    public final void onConnectionSuccess(Bundle bundle) {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() == this.mHandler.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.mLock) {
            Preconditions.checkState(!this.zaoq);
            this.mHandler.removeMessages(1);
            this.zaoq = true;
            if (this.zaom.size() != 0) {
                z = false;
            }
            Preconditions.checkState(z);
            ArrayList arrayList = new ArrayList(this.zaol);
            int i = this.zaop.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.zaoo || !this.zaok.isConnected() || this.zaop.get() != i) {
                    break;
                } else if (!this.zaom.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.zaom.clear();
            this.zaoq = false;
        }
    }
}
