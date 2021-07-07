package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.丨i1i  reason: invalid class name and case insensitive filesystem */
public final class C9573i1i<T> implements LLil11.OooOo00<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Future<? extends T> f23143OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f23144OooO00o;

    public C9573i1i(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f23143OooO00o = future;
        this.OooO00o = j;
        this.f23144OooO00o = timeUnit;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r7) {
        Future<? extends T> future = this.f23143OooO00o;
        r7.OooO00o(C9638ill.OooO00o(future));
        try {
            r7.OooO00o(this.OooO00o == 0 ? (Object) future.get() : (Object) future.get(this.OooO00o, this.f23144OooO00o));
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            r7.onError(th);
        }
    }
}
