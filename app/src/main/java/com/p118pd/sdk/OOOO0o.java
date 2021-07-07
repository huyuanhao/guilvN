package com.p118pd.sdk;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.OOOO0o */
public class OOOO0o extends C9193oooOoo {
    public C9193oooOoo OooO00o;

    public OOOO0o(C9193oooOoo oooooo) {
        if (oooooo != null) {
            this.OooO00o = oooooo;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final C9193oooOoo OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public C9193oooOoo clearDeadline() {
        return this.OooO00o.clearDeadline();
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public C9193oooOoo clearTimeout() {
        return this.OooO00o.clearTimeout();
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public long deadlineNanoTime() {
        return this.OooO00o.deadlineNanoTime();
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public boolean hasDeadline() {
        return this.OooO00o.hasDeadline();
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public void throwIfReached() throws IOException {
        this.OooO00o.throwIfReached();
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public C9193oooOoo timeout(long j, TimeUnit timeUnit) {
        return this.OooO00o.timeout(j, timeUnit);
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public long timeoutNanos() {
        return this.OooO00o.timeoutNanos();
    }

    public final OOOO0o OooO00o(C9193oooOoo oooooo) {
        if (oooooo != null) {
            this.OooO00o = oooooo;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // com.p118pd.sdk.C9193oooOoo
    public C9193oooOoo deadlineNanoTime(long j) {
        return this.OooO00o.deadlineNanoTime(j);
    }
}
