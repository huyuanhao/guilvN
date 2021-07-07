package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.p118pd.sdk.C7694o0oo0o0O;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0oo0O0O  reason: case insensitive filesystem */
public final class C7678o0oo0O0O {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f20564OooO00o = new Handler(Looper.getMainLooper(), new OooO00o());
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile OooO0OO f20565OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7694o0oo0o0O.OooO00o f20566OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public Thread f20567OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReferenceQueue<C7694o0oo0o0O<?>> f20568OooO00o;
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<AbstractC7644o0oOoOO, C7679OooO0Oo> f20569OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f20570OooO00o;
    public volatile boolean OooO0O0;

    /* renamed from: com.pd.sdk.o0oo0O0O$OooO00o */
    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C7678o0oo0O0O.this.OooO00o((C7679OooO0Oo) message.obj);
            return true;
        }
    }

    /* renamed from: com.pd.sdk.o0oo0O0O$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            Process.setThreadPriority(10);
            C7678o0oo0O0O.this.m19310OooO00o();
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0oo0O0O$OooO0OO */
    public interface OooO0OO {
        void OooO00o();
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0oo0O0O$OooO0Oo  reason: case insensitive filesystem */
    public static final class C7679OooO0Oo extends WeakReference<C7694o0oo0o0O<?>> {
        public final AbstractC7644o0oOoOO OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7700o0oo0oo0<?> f20571OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f20572OooO00o;

        public C7679OooO0Oo(@NonNull AbstractC7644o0oOoOO o0ooooo, @NonNull C7694o0oo0o0O<?> o0oo0o0o, @NonNull ReferenceQueue<? super C7694o0oo0o0O<?>> referenceQueue, boolean z) {
            super(o0oo0o0o, referenceQueue);
            this.OooO00o = (AbstractC7644o0oOoOO) C7842oO0O0.OooO00o(o0ooooo);
            this.f20571OooO00o = (!o0oo0o0o.m19336OooO00o() || !z) ? null : (AbstractC7700o0oo0oo0) C7842oO0O0.OooO00o(o0oo0o0o.m19333OooO00o());
            this.f20572OooO00o = o0oo0o0o.m19336OooO00o();
        }

        public void OooO00o() {
            this.f20571OooO00o = null;
            clear();
        }
    }

    public C7678o0oo0O0O(boolean z) {
        this.f20570OooO00o = z;
    }

    public void OooO00o(C7694o0oo0o0O.OooO00o oooO00o) {
        this.f20566OooO00o = oooO00o;
    }

    @VisibleForTesting
    public void OooO0O0() {
        this.OooO0O0 = true;
        Thread thread = this.f20567OooO00o;
        if (thread != null) {
            thread.interrupt();
            try {
                this.f20567OooO00o.join(TimeUnit.SECONDS.toMillis(5));
                if (this.f20567OooO00o.isAlive()) {
                    throw new RuntimeException("Failed to join in time");
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, C7694o0oo0o0O<?> o0oo0o0o) {
        C7679OooO0Oo put = this.f20569OooO00o.put(o0ooooo, new C7679OooO0Oo(o0ooooo, o0oo0o0o, OooO00o(), this.f20570OooO00o));
        if (put != null) {
            put.OooO00o();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19311OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        C7679OooO0Oo remove = this.f20569OooO00o.remove(o0ooooo);
        if (remove != null) {
            remove.OooO00o();
        }
    }

    @Nullable
    public C7694o0oo0o0O<?> OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        C7679OooO0Oo oooO0Oo = this.f20569OooO00o.get(o0ooooo);
        if (oooO0Oo == null) {
            return null;
        }
        C7694o0oo0o0O<?> o0oo0o0o = (C7694o0oo0o0O) oooO0Oo.get();
        if (o0oo0o0o == null) {
            OooO00o(oooO0Oo);
        }
        return o0oo0o0o;
    }

    public void OooO00o(@NonNull C7679OooO0Oo oooO0Oo) {
        AbstractC7700o0oo0oo0<?> o0oo0oo0;
        oO0O0O00.OooO0O0();
        this.f20569OooO00o.remove(oooO0Oo.OooO00o);
        if (oooO0Oo.f20572OooO00o && (o0oo0oo0 = oooO0Oo.f20571OooO00o) != null) {
            C7694o0oo0o0O<?> o0oo0o0o = new C7694o0oo0o0O<>(o0oo0oo0, true, false);
            o0oo0o0o.OooO00o(oooO0Oo.OooO00o, this.f20566OooO00o);
            this.f20566OooO00o.OooO00o(oooO0Oo.OooO00o, o0oo0o0o);
        }
    }

    private ReferenceQueue<C7694o0oo0o0O<?>> OooO00o() {
        if (this.f20568OooO00o == null) {
            this.f20568OooO00o = new ReferenceQueue<>();
            Thread thread = new Thread(new OooO0O0(), "glide-active-resources");
            this.f20567OooO00o = thread;
            thread.start();
        }
        return this.f20568OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19310OooO00o() {
        while (!this.OooO0O0) {
            try {
                this.f20564OooO00o.obtainMessage(1, (C7679OooO0Oo) this.f20568OooO00o.remove()).sendToTarget();
                OooO0OO oooO0OO = this.f20565OooO00o;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @VisibleForTesting
    public void OooO00o(OooO0OO oooO0OO) {
        this.f20565OooO00o = oooO0OO;
    }
}
