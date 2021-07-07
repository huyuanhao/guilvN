package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.I1i11丨丨1  reason: invalid class name */
public final class I1i111<T> implements LLil11.OooOo00<T> {
    public final LL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LLil11.OooOo00<T> f15362OooO00o;

    /* renamed from: com.pd.sdk.I1i11丨丨1$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> implements liii1l {
        public final LL1LL.OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC93021L<? super T> f15363OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f15364OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f15365OooO00o;

        public OooO00o(AbstractC93021L<? super T> r1, LL1LL.OooO00o oooO00o) {
            this.f15363OooO00o = r1;
            this.OooO00o = oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.f15364OooO00o = t;
            this.OooO00o.OooO00o(this);
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            try {
                Throwable th = this.f15365OooO00o;
                if (th != null) {
                    this.f15365OooO00o = null;
                    this.f15363OooO00o.onError(th);
                } else {
                    T t = this.f15364OooO00o;
                    this.f15364OooO00o = null;
                    this.f15363OooO00o.OooO00o((Object) t);
                }
            } finally {
                this.OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.f15365OooO00o = th;
            this.OooO00o.OooO00o(this);
        }
    }

    public I1i111(LLil11.OooOo00<T> oooOo00, LL1LL ll1ll) {
        this.f15362OooO00o = oooOo00;
        this.OooO00o = ll1ll;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r3) {
        LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
        OooO00o oooO00o = new OooO00o(r3, OooO00o2);
        r3.OooO00o((LlIiLii) OooO00o2);
        r3.OooO00o((LlIiLii) oooO00o);
        this.f15362OooO00o.call(oooO00o);
    }
}
