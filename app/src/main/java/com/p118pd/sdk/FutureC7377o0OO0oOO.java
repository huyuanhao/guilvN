package com.p118pd.sdk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.pd.sdk.o0OO0oOO  reason: case insensitive filesystem */
public class FutureC7377o0OO0oOO implements Future<AbstractC7327o0O0o000> {
    public o0OOO00 OooO00o;
    public boolean OooO0O0;

    public FutureC7377o0OO0oOO(o0OOO00 o0ooo00) {
        this.OooO00o = o0ooo00;
    }

    /* renamed from: OooO00o */
    public AbstractC7327o0O0o000 get() throws InterruptedException, ExecutionException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    public AbstractC7327o0O0o000 OooO0O0() throws InterruptedException, ExecutionException, TimeoutException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    public boolean cancel(boolean z) {
        if (!this.OooO0O0) {
            this.OooO00o.m18910OooO00o();
            this.OooO0O0 = true;
        }
        return true;
    }

    public boolean isCancelled() {
        return this.OooO0O0;
    }

    public boolean isDone() {
        throw new RuntimeException("NOT SUPPORT!");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Future
    public /* synthetic */ AbstractC7327o0O0o000 get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return OooO0O0();
    }
}
