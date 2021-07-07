package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.丨I1L1  reason: invalid class name and case insensitive filesystem */
public final class C9338I1L1<T> implements LLil11.OooOo00<T> {
    public final LLil11.OooOo00<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<Throwable, ? extends T> f22865OooO00o;

    /* renamed from: com.pd.sdk.丨I1L1$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> {
        public final AbstractC93021L<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<Throwable, ? extends T> f22866OooO00o;

        public OooO00o(AbstractC93021L<? super T> r1, AbstractC9847l1<Throwable, ? extends T> r2) {
            this.OooO00o = r1;
            this.f22866OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.OooO00o.OooO00o((Object) t);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            try {
                this.OooO00o.OooO00o(this.f22866OooO00o.call(th));
            } catch (Throwable th2) {
                IIl11.m15447OooO00o(th2);
                this.OooO00o.onError(th2);
            }
        }
    }

    public C9338I1L1(LLil11.OooOo00<T> oooOo00, AbstractC9847l1<Throwable, ? extends T> r2) {
        this.OooO00o = oooOo00;
        this.f22865OooO00o = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3, this.f22865OooO00o);
        r3.OooO00o((LlIiLii) oooO00o);
        this.OooO00o.call(oooO00o);
    }
}
