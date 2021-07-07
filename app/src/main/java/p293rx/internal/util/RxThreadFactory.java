package p293rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.util.RxThreadFactory */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory NONE = new OooO00o();
    public static final long serialVersionUID = -8841098858898482335L;
    public final String prefix;

    /* renamed from: rx.internal.util.RxThreadFactory$OooO00o */
    public static class OooO00o implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public RxThreadFactory(String str) {
        this.prefix = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.prefix + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
