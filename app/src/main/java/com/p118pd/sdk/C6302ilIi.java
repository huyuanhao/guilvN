package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import p293rx.exceptions.CompositeException;

/* renamed from: com.pd.sdk.ilIi  reason: case insensitive filesystem */
public final class C6302ilIi<T> implements LLil11.OooOo00<T> {
    public final LLil11<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6153iL1l<? super T> f17988OooO00o;
    public final AbstractC6153iL1l<Throwable> OooO0O0;

    /* renamed from: com.pd.sdk.ilIi$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> {
        public final AbstractC6153iL1l<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC93021L<? super T> f17989OooO00o;
        public final AbstractC6153iL1l<Throwable> OooO0O0;

        public OooO00o(AbstractC93021L<? super T> r1, AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
            this.f17989OooO00o = r1;
            this.OooO00o = il1l;
            this.OooO0O0 = il1l2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            try {
                this.OooO00o.call(t);
                this.f17989OooO00o.OooO00o((Object) t);
            } catch (Throwable th) {
                IIl11.OooO00o(th, this, t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            try {
                this.OooO0O0.call(th);
                this.f17989OooO00o.onError(th);
            } catch (Throwable th2) {
                IIl11.m15447OooO00o(th2);
                this.f17989OooO00o.onError(new CompositeException(th, th2));
            }
        }
    }

    public C6302ilIi(LLil11<T> r1, AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
        this.OooO00o = r1;
        this.f17988OooO00o = il1l;
        this.OooO0O0 = il1l2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r4) {
        OooO00o oooO00o = new OooO00o(r4, this.f17988OooO00o, this.OooO0O0);
        r4.OooO00o((LlIiLii) oooO00o);
        this.OooO00o.OooO00o((AbstractC93021L) oooO00o);
    }
}
