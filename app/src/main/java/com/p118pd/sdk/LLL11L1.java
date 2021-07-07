package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p293rx.internal.producers.SingleProducer;

/* renamed from: com.pd.sdk.LLL1丨1L1  reason: invalid class name */
public final class LLL11L1 {
    public LLL11L1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> C9349III.OooO00o<T> OooO00o(Future<? extends T> future) {
        return new OooO00o(future);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new OooO00o(future, j, timeUnit);
    }

    /* renamed from: com.pd.sdk.LLL1丨1L1$OooO00o */
    public static class OooO00o<T> implements C9349III.OooO00o<T> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Future<? extends T> f16449OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TimeUnit f16450OooO00o;

        /* renamed from: com.pd.sdk.LLL1丨1L1$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4920OooO00o implements liii1l {
            public C4920OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o.this.f16449OooO00o.cancel(true);
            }
        }

        public OooO00o(Future<? extends T> future) {
            this.f16449OooO00o = future;
            this.OooO00o = 0;
            this.f16450OooO00o = null;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r5) {
            r5.add(C9638ill.OooO00o(new C4920OooO00o()));
            try {
                if (!r5.isUnsubscribed()) {
                    r5.setProducer(new SingleProducer(r5, this.f16450OooO00o == null ? this.f16449OooO00o.get() : this.f16449OooO00o.get(this.OooO00o, this.f16450OooO00o)));
                }
            } catch (Throwable th) {
                if (!r5.isUnsubscribed()) {
                    IIl11.OooO00o(th, r5);
                }
            }
        }

        public OooO00o(Future<? extends T> future, long j, TimeUnit timeUnit) {
            this.f16449OooO00o = future;
            this.OooO00o = j;
            this.f16450OooO00o = timeUnit;
        }
    }
}
