package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.alipay.android.phone.mrpc.core.m */
public final class C0367m extends FutureTask<C0375u> {

    /* renamed from: a */
    public final /* synthetic */ CallableC0371q f817a;

    /* renamed from: b */
    public final /* synthetic */ C0366l f818b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0367m(C0366l lVar, Callable callable, CallableC0371q qVar) {
        super(callable);
        this.f818b = lVar;
        this.f817a = qVar;
    }

    public final void done() {
        C0369o a = this.f817a.mo4173a();
        if (a.mo4175f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || a.mo4177h()) {
                a.mo4176g();
                if (!isCancelled() || !isDone()) {
                    cancel(false);
                }
            }
        } catch (InterruptedException e) {
            new StringBuilder().append(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                new StringBuilder().append(e2);
                return;
            }
            HttpException httpException = (HttpException) e2.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (CancellationException unused) {
            a.mo4176g();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
