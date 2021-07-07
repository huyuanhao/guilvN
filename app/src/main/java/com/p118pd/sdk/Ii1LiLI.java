package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.丨Ii1LiLI  reason: invalid class name */
public final class Ii1LiLI<T> implements LLil11.OooOo00<T> {
    public final LLil11<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final liii1l f22916OooO00o;

    public Ii1LiLI(LLil11<T> r1, liii1l r2) {
        this.OooO00o = r1;
        this.f22916OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3, this.f22916OooO00o);
        r3.OooO00o((LlIiLii) oooO00o);
        this.OooO00o.OooO00o((AbstractC93021L) oooO00o);
    }

    /* renamed from: com.pd.sdk.丨Ii1LiLI$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> {
        public final liii1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC93021L<? super T> f22917OooO00o;

        public OooO00o(AbstractC93021L<? super T> r1, liii1l r2) {
            this.f22917OooO00o = r1;
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            try {
                this.f22917OooO00o.OooO00o((Object) t);
            } finally {
                OooO00o();
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            try {
                this.f22917OooO00o.onError(th);
            } finally {
                OooO00o();
            }
        }

        public void OooO00o() {
            try {
                this.OooO00o.call();
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                C9714lli.m21756OooO00o(th);
            }
        }
    }
}
