package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LLil11;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.I11L1lI */
public final class I11L1lI<T> implements LLil11.OooOo00<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f15272OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LLil11.OooOo00<T> f15273OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f15274OooO00o;

    /* renamed from: com.pd.sdk.I11L1lI$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> implements liii1l {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f15275OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC93021L<? super T> f15276OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f15277OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f15278OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TimeUnit f15279OooO00o;

        public OooO00o(AbstractC93021L<? super T> r1, LL1LL.OooO00o oooO00o, long j, TimeUnit timeUnit) {
            this.f15276OooO00o = r1;
            this.f15275OooO00o = oooO00o;
            this.OooO00o = j;
            this.f15279OooO00o = timeUnit;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.f15277OooO00o = t;
            this.f15275OooO00o.OooO00o(this, this.OooO00o, this.f15279OooO00o);
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            try {
                Throwable th = this.f15278OooO00o;
                if (th != null) {
                    this.f15278OooO00o = null;
                    this.f15276OooO00o.onError(th);
                } else {
                    T t = this.f15277OooO00o;
                    this.f15277OooO00o = null;
                    this.f15276OooO00o.OooO00o((Object) t);
                }
            } finally {
                this.f15275OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.f15278OooO00o = th;
            this.f15275OooO00o.OooO00o(this, this.OooO00o, this.f15279OooO00o);
        }
    }

    public I11L1lI(LLil11.OooOo00<T> oooOo00, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.f15273OooO00o = oooOo00;
        this.f15272OooO00o = ll1ll;
        this.OooO00o = j;
        this.f15274OooO00o = timeUnit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r9) {
        LL1LL.OooO00o OooO00o2 = this.f15272OooO00o.m16172OooO00o();
        OooO00o oooO00o = new OooO00o(r9, OooO00o2, this.OooO00o, this.f15274OooO00o);
        r9.OooO00o((LlIiLii) OooO00o2);
        r9.OooO00o((LlIiLii) oooO00o);
        this.f15273OooO00o.call(oooO00o);
    }
}
