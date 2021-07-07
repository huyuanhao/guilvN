package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LLil11;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.liilIII1 */
public final class liilIII1<T> implements LLil11.OooOo00<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18628OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LLil11.OooOo00<T> f18629OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f18630OooO00o;
    public final LLil11.OooOo00<? extends T> OooO0O0;

    /* renamed from: com.pd.sdk.liilIII1$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> implements liii1l {
        public final LLil11.OooOo00<? extends T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC93021L<? super T> f18631OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f18632OooO00o = new AtomicBoolean();

        /* renamed from: com.pd.sdk.liilIII1$OooO00o$OooO00o  reason: collision with other inner class name */
        public static final class C4949OooO00o<T> extends AbstractC93021L<T> {
            public final AbstractC93021L<? super T> OooO00o;

            public C4949OooO00o(AbstractC93021L<? super T> r1) {
                this.OooO00o = r1;
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(T t) {
                this.OooO00o.OooO00o((Object) t);
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                this.OooO00o.onError(th);
            }
        }

        public OooO00o(AbstractC93021L<? super T> r1, LLil11.OooOo00<? extends T> oooOo00) {
            this.f18631OooO00o = r1;
            this.OooO00o = oooOo00;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            if (this.f18632OooO00o.compareAndSet(false, true)) {
                try {
                    this.f18631OooO00o.OooO00o((Object) t);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (this.f18632OooO00o.compareAndSet(false, true)) {
                try {
                    LLil11.OooOo00<? extends T> oooOo00 = this.OooO00o;
                    if (oooOo00 == null) {
                        this.f18631OooO00o.onError(new TimeoutException());
                    } else {
                        C4949OooO00o oooO00o = new C4949OooO00o(this.f18631OooO00o);
                        this.f18631OooO00o.OooO00o((LlIiLii) oooO00o);
                        oooOo00.call(oooO00o);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            if (this.f18632OooO00o.compareAndSet(false, true)) {
                try {
                    this.f18631OooO00o.onError(th);
                } finally {
                    unsubscribe();
                }
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }
    }

    public liilIII1(LLil11.OooOo00<T> oooOo00, long j, TimeUnit timeUnit, LL1LL ll1ll, LLil11.OooOo00<? extends T> oooOo002) {
        this.f18629OooO00o = oooOo00;
        this.OooO00o = j;
        this.f18630OooO00o = timeUnit;
        this.f18628OooO00o = ll1ll;
        this.OooO0O0 = oooOo002;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r5) {
        OooO00o oooO00o = new OooO00o(r5, this.OooO0O0);
        LL1LL.OooO00o OooO00o2 = this.f18628OooO00o.m16172OooO00o();
        oooO00o.OooO00o((LlIiLii) OooO00o2);
        r5.OooO00o((LlIiLii) oooO00o);
        OooO00o2.OooO00o(oooO00o, this.OooO00o, this.f18630OooO00o);
        this.f18629OooO00o.call(oooO00o);
    }
}
