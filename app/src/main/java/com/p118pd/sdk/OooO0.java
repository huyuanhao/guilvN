package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.OooO0 */
public class OooO0 extends C9193oooOoo {
    public static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    public static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    public static final int TIMEOUT_WRITE_SIZE = 65536;
    @Nullable
    public static OooO0 head;
    public boolean inQueue;
    @Nullable
    public OooO0 next;
    public long timeoutAt;

    /* renamed from: com.pd.sdk.OooO0$OooO00o */
    public class OooO00o implements AbstractC8210oOOoO0o0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC8210oOOoO0o0 f17010OooO00o;

        public OooO00o(AbstractC8210oOOoO0o0 ooooo0o0) {
            this.f17010OooO00o = ooooo0o0;
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public void close() throws IOException {
            OooO0.this.enter();
            try {
                this.f17010OooO00o.close();
                OooO0.this.exit(true);
            } catch (IOException e) {
                throw OooO0.this.exit(e);
            } catch (Throwable th) {
                OooO0.this.exit(false);
                throw th;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
            OooO0.this.enter();
            try {
                this.f17010OooO00o.flush();
                OooO0.this.exit(true);
            } catch (IOException e) {
                throw OooO0.this.exit(e);
            } catch (Throwable th) {
                OooO0.this.exit(false);
                throw th;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return OooO0.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f17010OooO00o + C3848l.f10402t;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            C8976ooOOoO00.OooO00o(oooo000.f16981OooO00o, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        ooooo00o = ooooo00o.f22168OooO00o;
                    }
                    OooO0.this.enter();
                    try {
                        this.f17010OooO00o.write(oooo000, j2);
                        j -= j2;
                        OooO0.this.exit(true);
                    } catch (IOException e) {
                        throw OooO0.this.exit(e);
                    } catch (Throwable th) {
                        OooO0.this.exit(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.OooO0$OooO0O0 */
    public class OooO0O0 implements AbstractC8930ooOOO0OO {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC8930ooOOO0OO f17011OooO00o;

        public OooO0O0(AbstractC8930ooOOO0OO ooooo0oo) {
            this.f17011OooO00o = ooooo0oo;
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f17011OooO00o.close();
                OooO0.this.exit(true);
            } catch (IOException e) {
                throw OooO0.this.exit(e);
            } catch (Throwable th) {
                OooO0.this.exit(false);
                throw th;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            OooO0.this.enter();
            try {
                long read = this.f17011OooO00o.read(oooo000, j);
                OooO0.this.exit(true);
                return read;
            } catch (IOException e) {
                throw OooO0.this.exit(e);
            } catch (Throwable th) {
                OooO0.this.exit(false);
                throw th;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return OooO0.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f17011OooO00o + C3848l.f10402t;
        }
    }

    /* renamed from: com.pd.sdk.OooO0$OooO0OO */
    public static final class OooO0OO extends Thread {
        public OooO0OO() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            r1.timedOut();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<com.pd.sdk.OooO0> r0 = com.p118pd.sdk.OooO0.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                com.pd.sdk.OooO0 r1 = com.p118pd.sdk.OooO0.awaitTimeout()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                com.pd.sdk.OooO0 r2 = com.p118pd.sdk.OooO0.head     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                com.p118pd.sdk.OooO0.head = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.timedOut()
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.OooO0.OooO0OO.run():void");
        }
    }

    @Nullable
    public static OooO0 awaitTimeout() throws InterruptedException {
        OooO0 oooO0 = head.next;
        if (oooO0 == null) {
            long nanoTime = System.nanoTime();
            OooO0.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = oooO0.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            OooO0.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = oooO0.next;
        oooO0.next = null;
        return oooO0;
    }

    public static synchronized boolean cancelScheduledTimeout(OooO0 oooO0) {
        synchronized (OooO0.class) {
            for (OooO0 oooO02 = head; oooO02 != null; oooO02 = oooO02.next) {
                if (oooO02.next == oooO0) {
                    oooO02.next = oooO0.next;
                    oooO0.next = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public static synchronized void scheduleTimeout(OooO0 oooO0, long j, boolean z) {
        synchronized (OooO0.class) {
            if (head == null) {
                head = new OooO0();
                new OooO0OO().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                oooO0.timeoutAt = Math.min(j, oooO0.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                oooO0.timeoutAt = j + nanoTime;
            } else if (z) {
                oooO0.timeoutAt = oooO0.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = oooO0.remainingNanos(nanoTime);
            OooO0 oooO02 = head;
            while (true) {
                if (oooO02.next == null) {
                    break;
                } else if (remainingNanos < oooO02.next.remainingNanos(nanoTime)) {
                    break;
                } else {
                    oooO02 = oooO02.next;
                }
            }
            oooO0.next = oooO02.next;
            oooO02.next = oooO0;
            if (oooO02 == head) {
                OooO0.class.notify();
            }
        }
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(C7486o0OoO0oO.f20312OooO0Oo);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final AbstractC8210oOOoO0o0 sink(AbstractC8210oOOoO0o0 ooooo0o0) {
        return new OooO00o(ooooo0o0);
    }

    public final AbstractC8930ooOOO0OO source(AbstractC8930ooOOO0OO ooooo0oo) {
        return new OooO0O0(ooooo0oo);
    }

    public void timedOut() {
    }

    public final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    public final IOException exit(IOException iOException) throws IOException {
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }
}
