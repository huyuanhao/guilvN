package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

public final class zacm<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    public final Object zadn = new Object();
    public final WeakReference<GoogleApiClient> zadp;
    public ResultTransform<? super R, ? extends Result> zakn = null;
    public zacm<? extends Result> zako = null;
    public volatile ResultCallbacks<? super R> zakp = null;
    public PendingResult<R> zakq = null;
    public Status zakr = null;
    public final zaco zaks;
    public boolean zakt = false;

    public zacm(WeakReference<GoogleApiClient> weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zadp = weakReference;
        GoogleApiClient googleApiClient = weakReference.get();
        this.zaks = new zaco(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final void zabu() {
        if (this.zakn != null || this.zakp != null) {
            GoogleApiClient googleApiClient = this.zadp.get();
            if (!(this.zakt || this.zakn == null || googleApiClient == null)) {
                googleApiClient.zaa(this);
                this.zakt = true;
            }
            Status status = this.zakr;
            if (status != null) {
                zae(status);
                return;
            }
            PendingResult<R> pendingResult = this.zakq;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean zabw() {
        return (this.zakp == null || this.zadp.get() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public final void zad(Status status) {
        synchronized (this.zadn) {
            this.zakr = status;
            zae(status);
        }
    }

    private final void zae(Status status) {
        synchronized (this.zadn) {
            if (this.zakn != null) {
                Status onFailure = this.zakn.onFailure(status);
                Preconditions.checkNotNull(onFailure, "onFailure must not return null");
                this.zako.zad(onFailure);
            } else if (zabw()) {
                this.zakp.onFailure(status);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zadn) {
            boolean z = true;
            Preconditions.checkState(this.zakp == null, "Cannot call andFinally() twice.");
            if (this.zakn != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakp = resultCallbacks;
            zabu();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        synchronized (this.zadn) {
            if (!r.getStatus().isSuccess()) {
                zad(r.getStatus());
                zab(r);
            } else if (this.zakn != null) {
                zacc.zabb().submit(new zacn(this, r));
            } else if (zabw()) {
                this.zakp.onSuccess(r);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zacm<? extends Result> zacm;
        synchronized (this.zadn) {
            boolean z = true;
            Preconditions.checkState(this.zakn == null, "Cannot call then() twice.");
            if (this.zakp != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakn = resultTransform;
            zacm = new zacm<>(this.zadp);
            this.zako = zacm;
            zabu();
        }
        return zacm;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.gms.common.api.PendingResult<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(PendingResult<?> pendingResult) {
        synchronized (this.zadn) {
            this.zakq = pendingResult;
            zabu();
        }
    }

    public final void zabv() {
        this.zakp = null;
    }
}
