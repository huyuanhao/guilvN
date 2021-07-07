package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oO00o0oO  reason: case insensitive filesystem */
public class RunnableC7823oO00o0oO<R> implements AbstractFutureC7822oO00o0o0<R>, oO0OOO0O<R>, Runnable {
    public static final OooO00o OooO0O0 = new OooO00o();
    public final Handler OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public GlideException f20875OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7821oO00o0o f20876OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20877OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public R f20878OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f20879OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;
    public final int o00oO0O;
    public final int o0ooOO0;

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO00o0oO$OooO00o */
    public static class OooO00o {
        public void OooO00o(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        public void OooO00o(Object obj) {
            obj.notifyAll();
        }
    }

    static {
        C.i(24);
    }

    public RunnableC7823oO00o0oO(Handler handler, int i, int i2) {
        this(handler, i, i2, true, OooO0O0);
    }

    private synchronized R OooO00o(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f20879OooO0O0 && !isDone()) {
            oO0O0O00.OooO00o();
        }
        if (this.OooO0OO) {
            throw new CancellationException();
        } else if (this.OooO0o0) {
            throw new ExecutionException(this.f20875OooO00o);
        } else if (this.OooO0Oo) {
            return this.f20878OooO00o;
        } else {
            if (l == null) {
                this.f20877OooO00o.OooO00o(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f20877OooO00o.OooO00o(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.OooO0o0) {
                throw new ExecutionException(this.f20875OooO00o);
            } else if (this.OooO0OO) {
                throw new CancellationException();
            } else if (this.OooO0Oo) {
                return this.f20878OooO00o;
            } else {
                throw new TimeoutException();
            }
        }
    }

    private native void OooO00o();

    public synchronized boolean cancel(boolean z) {
        if (isDone()) {
            return false;
        }
        this.OooO0OO = true;
        this.f20877OooO00o.OooO00o(this);
        if (z) {
            OooO00o();
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return OooO00o(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    @Nullable
    public AbstractC7821oO00o0o getRequest() {
        return this.f20876OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void getSize(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        ooo00oo0.OooO00o(this.o00oO0O, this.o0ooOO0);
    }

    public synchronized boolean isCancelled() {
        return this.OooO0OO;
    }

    public synchronized boolean isDone() {
        return this.OooO0OO || this.OooO0Oo || this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onDestroy();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public synchronized void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public synchronized void onResourceReady(@NonNull R r, @Nullable AbstractC7837oO00ooOo<? super R> oo00oooo) {
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void removeCallback(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
    }

    public native void run();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void setRequest(@Nullable AbstractC7821oO00o0o oo00o0o) {
        this.f20876OooO00o = oo00o0o;
    }

    public RunnableC7823oO00o0oO(Handler handler, int i, int i2, boolean z, OooO00o oooO00o) {
        this.OooO00o = handler;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.f20879OooO0O0 = z;
        this.f20877OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.oO0OOO0O
    public synchronized boolean onLoadFailed(@Nullable GlideException glideException, Object obj, AbstractC7833oO00oOo0<R> oo00ooo0, boolean z) {
        this.OooO0o0 = true;
        this.f20875OooO00o = glideException;
        this.f20877OooO00o.OooO00o(this);
        return false;
    }

    @Override // com.p118pd.sdk.oO0OOO0O
    public synchronized boolean onResourceReady(R r, Object obj, AbstractC7833oO00oOo0<R> oo00ooo0, DataSource dataSource, boolean z) {
        this.OooO0Oo = true;
        this.f20878OooO00o = r;
        this.f20877OooO00o.OooO00o(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return OooO00o(Long.valueOf(timeUnit.toMillis(j)));
    }
}
