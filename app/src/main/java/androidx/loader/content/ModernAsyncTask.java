package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {
    public static OooO0o OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final BlockingQueue<Runnable> f14398OooO00o = new LinkedBlockingQueue(10);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Executor f14399OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ThreadFactory f14400OooO00o = new OooO00o();
    public static volatile Executor OooO0O0 = null;
    public static final int o00oO0O = 5;
    public static final int o0OOO0o = 2;
    public static final int o0ooOO0 = 128;
    public static final int o0ooOOo = 1;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f14401o0ooOOo = "AsyncTask";
    public static final int o0ooOoO = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractCallableC5050OooO0oO<Params, Result> f14402OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Status f14403OooO00o = Status.PENDING;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FutureTask<Result> f14404OooO00o = new OooO0OO(this.f14402OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicBoolean f14405OooO00o = new AtomicBoolean();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AtomicBoolean f14406OooO0O0 = new AtomicBoolean();

    public static class OooO00o implements ThreadFactory {
        public final AtomicInteger OooO00o = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.OooO00o.getAndIncrement());
        }
    }

    public class OooO0O0 extends AbstractCallableC5050OooO0oO<Params, Result> {
        public OooO0O0() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.f14406OooO0O0.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.m14677OooO00o((Object[]) super.OooO00o);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.OooO00o((Object) result);
                return result;
            } catch (Throwable th) {
                ModernAsyncTask.this.OooO00o((Object) result);
                throw th;
            }
        }
    }

    public class OooO0OO extends FutureTask<Result> {
        public OooO0OO(Callable callable) {
            super(callable);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: androidx.loader.content.ModernAsyncTask */
        /* JADX WARN: Multi-variable type inference failed */
        public void done() {
            try {
                ModernAsyncTask.this.OooO0Oo(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.OooO0Oo(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$OooO0Oo  reason: case insensitive filesystem */
    public static /* synthetic */ class C5048OooO0Oo {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.loader.content.ModernAsyncTask.C5048OooO0Oo.OooO00o = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.loader.content.ModernAsyncTask.C5048OooO0Oo.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.C5048OooO0Oo.<clinit>():void");
        }
    }

    public static class OooO0o extends Handler {
        public OooO0o() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C5049OooO0o0 oooO0o0 = (C5049OooO0o0) message.obj;
            int i = message.what;
            if (i == 1) {
                oooO0o0.OooO00o.m14679OooO00o((Object) oooO0o0.f14407OooO00o[0]);
            } else if (i == 2) {
                oooO0o0.OooO00o.m14680OooO00o((Object[]) oooO0o0.f14407OooO00o);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$OooO0o0  reason: case insensitive filesystem */
    public static class C5049OooO0o0<Data> {
        public final ModernAsyncTask OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Data[] f14407OooO00o;

        public C5049OooO0o0(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.OooO00o = modernAsyncTask;
            this.f14407OooO00o = dataArr;
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$OooO0oO  reason: case insensitive filesystem */
    public static abstract class AbstractCallableC5050OooO0oO<Params, Result> implements Callable<Result> {
        public Params[] OooO00o;
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f14398OooO00o, f14400OooO00o);
        f14399OooO00o = threadPoolExecutor;
        OooO0O0 = threadPoolExecutor;
    }

    public static Handler OooO00o() {
        OooO0o oooO0o;
        synchronized (ModernAsyncTask.class) {
            if (OooO00o == null) {
                OooO00o = new OooO0o();
            }
            oooO0o = OooO00o;
        }
        return oooO0o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Result m14677OooO00o(Params... paramsArr);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14678OooO00o() {
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14680OooO00o(Progress... progressArr) {
    }

    public void OooO0O0() {
    }

    public void OooO0O0(Result result) {
        m14678OooO00o();
    }

    public void OooO0OO(Result result) {
    }

    public void OooO0Oo(Result result) {
        if (!this.f14406OooO0O0.get()) {
            OooO00o((Object) result);
        }
    }

    public final void OooO0O0(Progress... progressArr) {
        if (!m14681OooO00o()) {
            OooO00o().obtainMessage(2, new C5049OooO0o0(this, progressArr)).sendToTarget();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(Executor executor) {
        OooO0O0 = executor;
    }

    public Result OooO00o(Result result) {
        OooO00o().obtainMessage(1, new C5049OooO0o0(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Status m14675OooO00o() {
        return this.f14403OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m14681OooO00o() {
        return this.f14405OooO00o.get();
    }

    public final boolean OooO00o(boolean z) {
        this.f14405OooO00o.set(true);
        return this.f14404OooO00o.cancel(z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Result m14676OooO00o() throws InterruptedException, ExecutionException {
        return this.f14404OooO00o.get();
    }

    public final Result OooO00o(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f14404OooO00o.get(j, timeUnit);
    }

    public final ModernAsyncTask<Params, Progress, Result> OooO00o(Params... paramsArr) {
        return OooO00o(OooO0O0, paramsArr);
    }

    public final ModernAsyncTask<Params, Progress, Result> OooO00o(Executor executor, Params... paramsArr) {
        if (this.f14403OooO00o != Status.PENDING) {
            int i = C5048OooO0Oo.OooO00o[this.f14403OooO00o.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f14403OooO00o = Status.RUNNING;
            OooO0O0();
            this.f14402OooO00o.OooO00o = paramsArr;
            executor.execute(this.f14404OooO00o);
            return this;
        }
    }

    public static void OooO00o(Runnable runnable) {
        OooO0O0.execute(runnable);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14679OooO00o(Result result) {
        if (m14681OooO00o()) {
            OooO0O0(result);
        } else {
            OooO0OO(result);
        }
        this.f14403OooO00o = Status.FINISHED;
    }
}
