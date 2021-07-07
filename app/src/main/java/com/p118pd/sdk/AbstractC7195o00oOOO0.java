package com.p118pd.sdk;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00oOOO0  reason: case insensitive filesystem */
public abstract class AbstractC7195o00oOOO0<T> {
    public final LiveData<T> OooO00o;
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19689OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Executor f19690OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicBoolean f19691OooO00o;
    @VisibleForTesting
    public final Runnable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AtomicBoolean f19692OooO0O0;

    /* renamed from: com.pd.sdk.o00oOOO0$OooO00o */
    public class OooO00o extends LiveData<T> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData
        public void OooO00o() {
            AbstractC7195o00oOOO0 o00oooo0 = AbstractC7195o00oOOO0.this;
            o00oooo0.f19690OooO00o.execute(o00oooo0.f19689OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o00oOOO0$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: androidx.lifecycle.LiveData<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @WorkerThread
        public void run() {
            do {
                boolean z = false;
                if (AbstractC7195o00oOOO0.this.f19692OooO0O0.compareAndSet(false, true)) {
                    Object obj = null;
                    boolean z2 = false;
                    while (AbstractC7195o00oOOO0.this.f19691OooO00o.compareAndSet(true, false)) {
                        try {
                            obj = AbstractC7195o00oOOO0.this.m18687OooO00o();
                            z2 = true;
                        } catch (Throwable th) {
                            AbstractC7195o00oOOO0.this.f19692OooO0O0.set(false);
                            throw th;
                        }
                    }
                    if (z2) {
                        AbstractC7195o00oOOO0.this.OooO00o.OooO00o(obj);
                    }
                    AbstractC7195o00oOOO0.this.f19692OooO0O0.set(false);
                    z = z2;
                }
                if (!z) {
                    return;
                }
            } while (AbstractC7195o00oOOO0.this.f19691OooO00o.get());
        }
    }

    /* renamed from: com.pd.sdk.o00oOOO0$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @MainThread
        public void run() {
            boolean OooO00o2 = AbstractC7195o00oOOO0.this.OooO00o.m14670OooO00o();
            if (AbstractC7195o00oOOO0.this.f19691OooO00o.compareAndSet(false, true) && OooO00o2) {
                AbstractC7195o00oOOO0 o00oooo0 = AbstractC7195o00oOOO0.this;
                o00oooo0.f19690OooO00o.execute(o00oooo0.f19689OooO00o);
            }
        }
    }

    public AbstractC7195o00oOOO0() {
        this(C6959o0000Oo0.m18148OooO00o());
    }

    @NonNull
    public LiveData<T> OooO00o() {
        return this.OooO00o;
    }

    @WorkerThread
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract T m18687OooO00o();

    public AbstractC7195o00oOOO0(@NonNull Executor executor) {
        this.f19691OooO00o = new AtomicBoolean(true);
        this.f19692OooO0O0 = new AtomicBoolean(false);
        this.f19689OooO00o = new OooO0O0();
        this.OooO0O0 = new OooO0OO();
        this.f19690OooO00o = executor;
        this.OooO00o = new OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18688OooO00o() {
        C6959o0000Oo0.OooO00o().OooO0O0(this.OooO0O0);
    }
}
