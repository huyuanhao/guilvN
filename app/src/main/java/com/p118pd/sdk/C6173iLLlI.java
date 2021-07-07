package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;

/* renamed from: com.pd.sdk.iLLl丨I  reason: invalid class name and case insensitive filesystem */
public final class C6173iLLlI<T> implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final LLil11<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends C5876LlIl> f17742OooO00o;

    /* renamed from: com.pd.sdk.iLLl丨I$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> implements AbstractC6473l1II {
        public final AbstractC6473l1II OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends C5876LlIl> f17743OooO00o;

        public OooO00o(AbstractC6473l1II r1, AbstractC9847l1<? super T, ? extends C5876LlIl> r2) {
            this.OooO00o = r1;
            this.f17743OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            try {
                C5876LlIl r2 = (C5876LlIl) this.f17743OooO00o.call(t);
                if (r2 == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    r2.OooO00o((AbstractC6473l1II) this);
                }
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II, com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            OooO00o(llIiLii);
        }
    }

    public C6173iLLlI(LLil11<T> r1, AbstractC9847l1<? super T, ? extends C5876LlIl> r2) {
        this.OooO00o = r1;
        this.f17742OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r3) {
        OooO00o oooO00o = new OooO00o(r3, this.f17742OooO00o);
        r3.onSubscribe(oooO00o);
        this.OooO00o.OooO00o((AbstractC93021L) oooO00o);
    }
}
