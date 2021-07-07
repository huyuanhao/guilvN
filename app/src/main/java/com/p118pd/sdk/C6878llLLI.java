package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import p293rx.exceptions.OnErrorThrowable;

/* renamed from: com.pd.sdk.l丨lLLI  reason: invalid class name and case insensitive filesystem */
public final class C6878llLLI<T, R> implements LLil11.OooOo00<R> {
    public final LLil11<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends R> f18967OooO00o;

    /* renamed from: com.pd.sdk.l丨lLLI$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC93021L<T> {
        public final AbstractC93021L<? super R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends R> f18968OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC93021L<? super R> r1, AbstractC9847l1<? super T, ? extends R> r2) {
            this.OooO00o = r1;
            this.f18968OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            try {
                this.OooO00o.OooO00o(this.f18968OooO00o.call(t));
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.OooO00o.onError(th);
        }
    }

    public C6878llLLI(LLil11<T> r1, AbstractC9847l1<? super T, ? extends R> r2) {
        this.OooO00o = r1;
        this.f18967OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super R> r3) {
        OooO00o oooO00o = new OooO00o(r3, this.f18967OooO00o);
        r3.OooO00o((LlIiLii) oooO00o);
        this.OooO00o.OooO00o((AbstractC93021L) oooO00o);
    }
}
