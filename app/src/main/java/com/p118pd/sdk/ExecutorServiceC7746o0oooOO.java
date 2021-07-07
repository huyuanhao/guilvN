package com.p118pd.sdk;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.pd.sdk.o0oooOO  reason: case insensitive filesystem */
public final class ExecutorServiceC7746o0oooOO implements ExecutorService {
    public static final long OooO00o = TimeUnit.SECONDS.toMillis(10);
    public static final int o00oO0O = 1;
    public static final String o0OO00O = "animation";
    public static final String o0OOO0o = "GlideExecutor";
    public static final String o0Oo0oo = "source-unlimited";
    public static final int o0ooOO0 = 4;
    public static volatile int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f20757o0ooOOo = "source";
    public static final String o0ooOoO = "disk-cache";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ExecutorService f20758OooO00o;

    /* renamed from: com.pd.sdk.o0oooOO$OooO00o */
    public static final class OooO00o implements ThreadFactory {
        public static final int o0ooOO0 = 9;
        public final OooO0O0 OooO00o;
        public final boolean OooO0O0;
        public int o00oO0O;
        public final String o0ooOOo;

        /* renamed from: com.pd.sdk.o0oooOO$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4969OooO00o extends Thread {
            public C4969OooO00o(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (OooO00o.this.OooO0O0) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    OooO00o.this.OooO00o.OooO00o(th);
                }
            }
        }

        public OooO00o(String str, OooO0O0 oooO0O0, boolean z) {
            this.o0ooOOo = str;
            this.OooO00o = oooO0O0;
            this.OooO0O0 = z;
        }

        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C4969OooO00o oooO00o;
            oooO00o = new C4969OooO00o(runnable, "glide-" + this.o0ooOOo + "-thread-" + this.o00oO0O);
            this.o00oO0O = this.o00oO0O + 1;
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.o0oooOO$OooO0O0 */
    public interface OooO0O0 {
        public static final OooO0O0 OooO00o = new OooO00o();
        public static final OooO0O0 OooO0O0 = new C4970OooO0O0();
        public static final OooO0O0 OooO0OO = new OooO0OO();
        public static final OooO0O0 OooO0Oo = OooO0O0;

        /* renamed from: com.pd.sdk.o0oooOO$OooO0O0$OooO00o */
        public class OooO00o implements OooO0O0 {
            @Override // com.p118pd.sdk.ExecutorServiceC7746o0oooOO.OooO0O0
            public void OooO00o(Throwable th) {
            }
        }

        /* renamed from: com.pd.sdk.o0oooOO$OooO0O0$OooO0O0  reason: collision with other inner class name */
        public class C4970OooO0O0 implements OooO0O0 {
            @Override // com.p118pd.sdk.ExecutorServiceC7746o0oooOO.OooO0O0
            public void OooO00o(Throwable th) {
                if (th != null) {
                    Log.isLoggable(ExecutorServiceC7746o0oooOO.o0OOO0o, 6);
                }
            }
        }

        /* renamed from: com.pd.sdk.o0oooOO$OooO0O0$OooO0OO */
        public class OooO0OO implements OooO0O0 {
            @Override // com.p118pd.sdk.ExecutorServiceC7746o0oooOO.OooO0O0
            public void OooO00o(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        void OooO00o(Throwable th);
    }

    @VisibleForTesting
    public ExecutorServiceC7746o0oooOO(ExecutorService executorService) {
        this.f20758OooO00o = executorService;
    }

    public static ExecutorServiceC7746o0oooOO OooO00o(OooO0O0 oooO0O0) {
        return OooO00o(1, o0ooOoO, oooO0O0);
    }

    public static ExecutorServiceC7746o0oooOO OooO0O0() {
        return OooO00o(1, o0ooOoO, OooO0O0.OooO0Oo);
    }

    public static ExecutorServiceC7746o0oooOO OooO0OO() {
        return OooO0O0(OooO00o(), "source", OooO0O0.OooO0Oo);
    }

    public static ExecutorServiceC7746o0oooOO OooO0Oo() {
        return new ExecutorServiceC7746o0oooOO(new ThreadPoolExecutor(0, Integer.MAX_VALUE, OooO00o, TimeUnit.MILLISECONDS, new SynchronousQueue(), new OooO00o(o0Oo0oo, OooO0O0.OooO0Oo, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f20758OooO00o.awaitTermination(j, timeUnit);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f20758OooO00o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f20758OooO00o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f20758OooO00o.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f20758OooO00o.isShutdown();
    }

    public boolean isTerminated() {
        return this.f20758OooO00o.isTerminated();
    }

    public void shutdown() {
        this.f20758OooO00o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f20758OooO00o.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f20758OooO00o.submit(runnable);
    }

    public String toString() {
        return this.f20758OooO00o.toString();
    }

    public static ExecutorServiceC7746o0oooOO OooO00o(int i, String str, OooO0O0 oooO0O0) {
        return new ExecutorServiceC7746o0oooOO(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new OooO00o(str, oooO0O0, true)));
    }

    public static ExecutorServiceC7746o0oooOO OooO0O0(OooO0O0 oooO0O0) {
        return OooO0O0(OooO00o(), "source", oooO0O0);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f20758OooO00o.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f20758OooO00o.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f20758OooO00o.submit(runnable, t);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ExecutorServiceC7746o0oooOO m19393OooO00o() {
        return OooO00o(OooO00o() >= 4 ? 2 : 1, OooO0O0.OooO0Oo);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f20758OooO00o.submit(callable);
    }

    public static ExecutorServiceC7746o0oooOO OooO0O0(int i, String str, OooO0O0 oooO0O0) {
        return new ExecutorServiceC7746o0oooOO(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new OooO00o(str, oooO0O0, false)));
    }

    public static ExecutorServiceC7746o0oooOO OooO00o(int i, OooO0O0 oooO0O0) {
        return new ExecutorServiceC7746o0oooOO(new ThreadPoolExecutor(0, i, OooO00o, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new OooO00o(o0OO00O, oooO0O0, true)));
    }

    public static int OooO00o() {
        if (o0ooOOo == 0) {
            o0ooOOo = Math.min(4, C7748o0oooOOo.OooO00o());
        }
        return o0ooOOo;
    }
}
