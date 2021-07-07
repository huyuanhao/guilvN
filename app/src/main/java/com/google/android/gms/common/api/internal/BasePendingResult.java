package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    public static final ThreadLocal<Boolean> zadm = new zap();
    @KeepName
    public zaa mResultGuardian;
    public Status mStatus;
    public R zaci;
    public final Object zadn;
    public final CallbackHandler<R> zado;
    public final WeakReference<GoogleApiClient> zadp;
    public final CountDownLatch zadq;
    public final ArrayList<PendingResult.StatusListener> zadr;
    public ResultCallback<? super R> zads;
    public final AtomicReference<zacs> zadt;
    public volatile boolean zadu;
    public boolean zadv;
    public boolean zadw;
    public ICancelToken zadx;
    public volatile zacm<R> zady;
    public boolean zadz;

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zal {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.ResultCallback */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.zab(result);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                sb.toString();
                new Exception();
            } else {
                ((BasePendingResult) message.obj).zab(Status.RESULT_TIMEOUT);
            }
        }

        public final void zaa(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    public final class zaa {
        public zaa() {
        }

        public final void finalize() throws Throwable {
            BasePendingResult.zab(BasePendingResult.this.zaci);
            super.finalize();
        }

        public /* synthetic */ zaa(BasePendingResult basePendingResult, zap zap) {
            this();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList<>();
        this.zadt = new AtomicReference<>();
        this.zadz = false;
        this.zado = new CallbackHandler<>(Looper.getMainLooper());
        this.zadp = new WeakReference<>(null);
    }

    private final R get() {
        R r;
        synchronized (this.zadn) {
            Preconditions.checkState(!this.zadu, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zaci;
            this.zaci = null;
            this.zads = null;
            this.zadu = true;
        }
        zacs andSet = this.zadt.getAndSet(null);
        if (andSet != null) {
            andSet.zac(this);
        }
        return r;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zadn) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zadr.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.zadu, "Result has already been consumed");
        if (this.zady != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zadq.await();
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.zadn) {
            if (!this.zadv) {
                if (!this.zadu) {
                    if (this.zadx != null) {
                        try {
                            this.zadx.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                    zab(this.zaci);
                    this.zadv = true;
                    zaa(createFailedResult(Status.RESULT_CANCELED));
                }
            }
        }
    }

    @NonNull
    @KeepForSdk
    public abstract R createFailedResult(Status status);

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        boolean z;
        synchronized (this.zadn) {
            z = this.zadv;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.zadq.getCount() == 0;
    }

    @KeepForSdk
    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zadn) {
            this.zadx = iCancelToken;
        }
    }

    @KeepForSdk
    public final void setResult(R r) {
        synchronized (this.zadn) {
            if (this.zadw || this.zadv) {
                zab(r);
                return;
            }
            isReady();
            boolean z = true;
            Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.zadu) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            zaa(r);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        synchronized (this.zadn) {
            if (resultCallback == null) {
                this.zads = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.zadu, "Result has already been consumed.");
            if (this.zady != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (!isCanceled()) {
                if (isReady()) {
                    this.zado.zaa(resultCallback, get());
                } else {
                    this.zads = resultCallback;
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zadu, "Result has already been consumed.");
        synchronized (this.zadn) {
            boolean z = false;
            Preconditions.checkState(this.zady == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zads == null, "Cannot call then() if callbacks are set.");
            if (!this.zadv) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if result was canceled.");
            this.zadz = true;
            this.zady = new zacm<>(this.zadp);
            then = this.zady.then(resultTransform);
            if (isReady()) {
                this.zado.zaa(this.zady, get());
            } else {
                this.zads = this.zady;
            }
        }
        return then;
    }

    public final void zaa(zacs zacs) {
        this.zadt.set(zacs);
    }

    public final void zab(Status status) {
        synchronized (this.zadn) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zadw = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final Integer zam() {
        return null;
    }

    public final boolean zat() {
        boolean isCanceled;
        synchronized (this.zadn) {
            if (this.zadp.get() == null || !this.zadz) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zau() {
        this.zadz = this.zadz || zadm.get().booleanValue();
    }

    private final void zaa(R r) {
        this.zaci = r;
        this.zadx = null;
        this.zadq.countDown();
        this.mStatus = this.zaci.getStatus();
        if (this.zadv) {
            this.zads = null;
        } else if (this.zads != null) {
            this.zado.removeMessages(2);
            this.zado.zaa(this.zads, get());
        } else if (this.zaci instanceof Releasable) {
            this.mResultGuardian = new zaa(this, null);
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.zadr;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i);
            i++;
            statusListener.onComplete(this.mStatus);
        }
        this.zadr.clear();
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

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.zadu, "Result has already been consumed.");
        if (this.zady != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.zadq.await(j, timeUnit)) {
                zab(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @KeepForSdk
    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList<>();
        this.zadt = new AtomicReference<>();
        this.zadz = false;
        this.zado = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zadp = new WeakReference<>(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback, long j, TimeUnit timeUnit) {
        synchronized (this.zadn) {
            if (resultCallback == null) {
                this.zads = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.zadu, "Result has already been consumed.");
            if (this.zady != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (!isCanceled()) {
                if (isReady()) {
                    this.zado.zaa(resultCallback, get());
                } else {
                    this.zads = resultCallback;
                    CallbackHandler<R> callbackHandler = this.zado;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList<>();
        this.zadt = new AtomicReference<>();
        this.zadz = false;
        this.zado = new CallbackHandler<>(looper);
        this.zadp = new WeakReference<>(null);
    }

    @VisibleForTesting
    @KeepForSdk
    public BasePendingResult(@NonNull CallbackHandler<R> callbackHandler) {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList<>();
        this.zadt = new AtomicReference<>();
        this.zadz = false;
        this.zado = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadp = new WeakReference<>(null);
    }
}
