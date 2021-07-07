package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.Il丨lIIlL  reason: invalid class name */
public final class IllIIlL<T> extends LLil11<T> {
    public final T OooO00o;

    /* renamed from: com.pd.sdk.Il丨lIIlL$OooO00o */
    public class OooO00o implements LLil11.OooOo00<T> {
        public final /* synthetic */ Object OooO00o;

        public OooO00o(Object obj) {
            this.OooO00o = obj;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r2) {
            r2.OooO00o((Object) this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.Il丨lIIlL$OooO0O0 */
    public class OooO0O0 implements LLil11.OooOo00<R> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9847l1 f15920OooO00o;

        /* renamed from: com.pd.sdk.Il丨lIIlL$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC93021L<R> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f15921OooO00o;

            public OooO00o(AbstractC93021L r2) {
                this.f15921OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(R r) {
                this.f15921OooO00o.OooO00o((Object) r);
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                this.f15921OooO00o.onError(th);
            }
        }

        public OooO0O0(AbstractC9847l1 r2) {
            this.f15920OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super R> r3) {
            LLil11 r0 = (LLil11) this.f15920OooO00o.call(IllIIlL.this.OooO00o);
            if (r0 instanceof IllIIlL) {
                r3.OooO00o((Object) ((IllIIlL) r0).OooO00o);
                return;
            }
            OooO00o oooO00o = new OooO00o(r3);
            r3.OooO00o((LlIiLii) oooO00o);
            r0.OooO00o((AbstractC93021L) oooO00o);
        }
    }

    /* renamed from: com.pd.sdk.Il丨lIIlL$OooO0OO */
    public static final class OooO0OO<T> implements LLil11.OooOo00<T> {
        public final lI1iil OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f15922OooO00o;

        public OooO0OO(lI1iil r1, T t) {
            this.OooO00o = r1;
            this.f15922OooO00o = t;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r4) {
            r4.OooO00o(this.OooO00o.OooO00o(new C5488OooO0o0(r4, this.f15922OooO00o)));
        }
    }

    /* renamed from: com.pd.sdk.Il丨lIIlL$OooO0Oo  reason: case insensitive filesystem */
    public static final class C5487OooO0Oo<T> implements LLil11.OooOo00<T> {
        public final LL1LL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f15923OooO00o;

        public C5487OooO0Oo(LL1LL ll1ll, T t) {
            this.OooO00o = ll1ll;
            this.f15923OooO00o = t;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r4) {
            LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
            r4.OooO00o((LlIiLii) OooO00o2);
            OooO00o2.OooO00o(new C5488OooO0o0(r4, this.f15923OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.Il丨lIIlL$OooO0o0  reason: case insensitive filesystem */
    public static final class C5488OooO0o0<T> implements liii1l {
        public final AbstractC93021L<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f15924OooO00o;

        public C5488OooO0o0(AbstractC93021L<? super T> r1, T t) {
            this.OooO00o = r1;
            this.f15924OooO00o = t;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            try {
                this.OooO00o.OooO00o((Object) this.f15924OooO00o);
            } catch (Throwable th) {
                this.OooO00o.onError(th);
            }
        }
    }

    public IllIIlL(T t) {
        super(new OooO00o(t));
        this.OooO00o = t;
    }

    public static <T> IllIIlL<T> OooO00o(T t) {
        return new IllIIlL<>(t);
    }

    public LLil11<T> OooO0Oo(LL1LL ll1ll) {
        if (ll1ll instanceof lI1iil) {
            return LLil11.OooO00o((LLil11.OooOo00) new OooO0OO((lI1iil) ll1ll, this.OooO00o));
        }
        return LLil11.OooO00o((LLil11.OooOo00) new C5487OooO0Oo(ll1ll, this.OooO00o));
    }

    public <R> LLil11<R> OooO0o(AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r2) {
        return LLil11.OooO00o((LLil11.OooOo00) new OooO0O0(r2));
    }

    @Override // com.p118pd.sdk.LLil11, com.p118pd.sdk.LLil11, com.p118pd.sdk.LLil11, com.p118pd.sdk.LLil11, com.p118pd.sdk.LLil11, com.p118pd.sdk.LLil11
    public T OooO00o() {
        return this.OooO00o;
    }
}
