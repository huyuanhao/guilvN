package com.p118pd.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.oooOoo  reason: case insensitive filesystem */
public class C9193oooOoo {
    public static final C9193oooOoo NONE = new OooO00o();
    public long deadlineNanoTime;
    public boolean hasDeadline;
    public long timeoutNanos;

    /* renamed from: com.pd.sdk.oooOoo$OooO00o */
    public class OooO00o extends C9193oooOoo {
        @Override // com.p118pd.sdk.C9193oooOoo
        public C9193oooOoo deadlineNanoTime(long j) {
            return this;
        }

        @Override // com.p118pd.sdk.C9193oooOoo
        public void throwIfReached() throws IOException {
        }

        @Override // com.p118pd.sdk.C9193oooOoo
        public C9193oooOoo timeout(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public C9193oooOoo clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C9193oooOoo clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final C9193oooOoo deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: " + j);
        } else if (timeUnit != null) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C9193oooOoo timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException(C7486o0OoO0oO.f20312OooO0Oo);
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C9193oooOoo deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
