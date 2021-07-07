package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.concurrent.Callable;

/* renamed from: com.pd.sdk.i1丨L1丨丨  reason: invalid class name and case insensitive filesystem */
public final class C6060i1L1<T> implements LLil11.OooOo00<T> {
    public final Callable<? extends T> OooO00o;

    public C6060i1L1(Callable<? extends T> callable) {
        this.OooO00o = callable;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        try {
            r2.OooO00o((Object) this.OooO00o.call());
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            r2.onError(th);
        }
    }
}
