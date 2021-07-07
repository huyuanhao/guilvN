package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.l丨LLl1  reason: invalid class name and case insensitive filesystem */
public final class C6852lLLl1<T, R> implements C9349III.OooO00o<R> {
    public final AbstractC5189I1l1l<R, ? super T, R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f18921OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final R f18922OooO00o;

    /* renamed from: com.pd.sdk.l丨LLl1$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC6730ll1Il<T, R> {
        public final AbstractC5189I1l1l<R, ? super T, R> OooO00o;

        public OooO00o(AbstractC9508LiLi<? super R> r1, R r, AbstractC5189I1l1l<R, ? super T, R> r3) {
            super(r1);
            ((AbstractC6730ll1Il) this).f18708OooO00o = r;
            this.OooO0O0 = true;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                ((AbstractC6730ll1Il) this).f18708OooO00o = this.OooO00o.OooO00o(((AbstractC6730ll1Il) this).f18708OooO00o, t);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                ((AbstractC6730ll1Il) this).OooO00o.onError(th);
            }
        }
    }

    public C6852lLLl1(C9349III<T> r1, R r, AbstractC5189I1l1l<R, ? super T, R> r3) {
        this.f18921OooO00o = r1;
        this.f18922OooO00o = r;
        this.OooO00o = r3;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r4) {
        new OooO00o(r4, this.f18922OooO00o, this.OooO00o).OooO00o((C9349III) this.f18921OooO00o);
    }
}
