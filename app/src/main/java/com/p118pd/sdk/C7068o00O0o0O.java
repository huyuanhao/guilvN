package com.p118pd.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00O0o0O  reason: case insensitive filesystem */
public class C7068o00O0o0O {
    public static final int OooO0Oo = 1;
    public static final int OooO0o0 = 0;
    @GuardedBy("mLock")
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler.Callback f19339OooO00o = new OooO00o();
    @GuardedBy("mLock")

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f19340OooO00o;
    @GuardedBy("mLock")

    /* renamed from: OooO00o  reason: collision with other field name */
    public HandlerThread f19341OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f19342OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f19343OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    /* renamed from: com.pd.sdk.o00O0o0O$OooO00o */
    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C7068o00O0o0O.this.m18347OooO00o();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C7068o00O0o0O.this.OooO00o((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: com.pd.sdk.o00O0o0O$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ Handler OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7069OooO0Oo f19344OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callable f19346OooO00o;

        /* renamed from: com.pd.sdk.o00O0o0O$OooO0O0$OooO00o */
        public class OooO00o implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Object f19347OooO00o;

            public OooO00o(Object obj) {
                this.f19347OooO00o = obj;
            }

            public void run() {
                OooO0O0.this.f19344OooO00o.OooO00o(this.f19347OooO00o);
            }
        }

        public OooO0O0(Callable callable, Handler handler, AbstractC7069OooO0Oo oooO0Oo) {
            this.f19346OooO00o = callable;
            this.OooO00o = handler;
            this.f19344OooO00o = oooO0Oo;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f19346OooO00o.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.OooO00o.post(new OooO00o(obj));
        }
    }

    /* renamed from: com.pd.sdk.o00O0o0O$OooO0OO */
    public class OooO0OO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callable f19348OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f19349OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f19350OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Condition f19351OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReentrantLock f19352OooO00o;

        public OooO0OO(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f19350OooO00o = atomicReference;
            this.f19348OooO00o = callable;
            this.f19352OooO00o = reentrantLock;
            this.f19349OooO00o = atomicBoolean;
            this.f19351OooO00o = condition;
        }

        public void run() {
            try {
                this.f19350OooO00o.set(this.f19348OooO00o.call());
            } catch (Exception unused) {
            }
            this.f19352OooO00o.lock();
            try {
                this.f19349OooO00o.set(false);
                this.f19351OooO00o.signal();
            } finally {
                this.f19352OooO00o.unlock();
            }
        }
    }

    /* renamed from: com.pd.sdk.o00O0o0O$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC7069OooO0Oo<T> {
        void OooO00o(T t);
    }

    public C7068o00O0o0O(String str, int i, int i2) {
        this.f19343OooO00o = str;
        this.OooO0OO = i;
        this.OooO0O0 = i2;
        this.OooO00o = 0;
    }

    private void OooO0O0(Runnable runnable) {
        synchronized (this.f19342OooO00o) {
            if (this.f19341OooO00o == null) {
                HandlerThread handlerThread = new HandlerThread(this.f19343OooO00o, this.OooO0OO);
                this.f19341OooO00o = handlerThread;
                handlerThread.start();
                this.f19340OooO00o = new Handler(this.f19341OooO00o.getLooper(), this.f19339OooO00o);
                this.OooO00o++;
            }
            this.f19340OooO00o.removeMessages(0);
            this.f19340OooO00o.sendMessage(this.f19340OooO00o.obtainMessage(1, runnable));
        }
    }

    @VisibleForTesting
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18348OooO00o() {
        boolean z;
        synchronized (this.f19342OooO00o) {
            z = this.f19341OooO00o != null;
        }
        return z;
    }

    @VisibleForTesting
    public int OooO00o() {
        int i;
        synchronized (this.f19342OooO00o) {
            i = this.OooO00o;
        }
        return i;
    }

    public <T> void OooO00o(Callable<T> callable, AbstractC7069OooO0Oo<T> oooO0Oo) {
        OooO0O0(new OooO0O0(callable, new Handler(), oooO0Oo));
    }

    public <T> T OooO00o(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        OooO0O0(new OooO0OO(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException(C7486o0OoO0oO.f20312OooO0Oo);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void OooO00o(Runnable runnable) {
        runnable.run();
        synchronized (this.f19342OooO00o) {
            this.f19340OooO00o.removeMessages(0);
            this.f19340OooO00o.sendMessageDelayed(this.f19340OooO00o.obtainMessage(0), (long) this.OooO0O0);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18347OooO00o() {
        synchronized (this.f19342OooO00o) {
            if (!this.f19340OooO00o.hasMessages(1)) {
                this.f19341OooO00o.quit();
                this.f19341OooO00o = null;
                this.f19340OooO00o = null;
            }
        }
    }
}
