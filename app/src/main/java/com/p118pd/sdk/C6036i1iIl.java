package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.i1iI丨l  reason: invalid class name and case insensitive filesystem */
public final class C6036i1iIl<T> implements LLil11.OooOo00<T> {
    public final LLil11<? extends T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<Throwable, ? extends LLil11<? extends T>> f17407OooO00o;

    /* renamed from: com.pd.sdk.i1iI丨l$OooO00o */
    public static class OooO00o implements AbstractC9847l1<Throwable, LLil11<? extends T>> {
        public final /* synthetic */ LLil11 OooO00o;

        public OooO00o(LLil11 r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public LLil11<? extends T> call(Throwable th) {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.i1iI丨l$OooO0O0 */
    public class OooO0O0 extends AbstractC93021L<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC93021L f17408OooO00o;

        public OooO0O0(AbstractC93021L r2) {
            this.f17408OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.f17408OooO00o.OooO00o((Object) t);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            try {
                ((LLil11) C6036i1iIl.this.f17407OooO00o.call(th)).OooO00o((AbstractC93021L) this.f17408OooO00o);
            } catch (Throwable th2) {
                IIl11.OooO00o(th2, this.f17408OooO00o);
            }
        }
    }

    public C6036i1iIl(LLil11<? extends T> r1, AbstractC9847l1<Throwable, ? extends LLil11<? extends T>> r2) {
        if (r1 == null) {
            throw new NullPointerException("originalSingle must not be null");
        } else if (r2 != null) {
            this.OooO00o = r1;
            this.f17407OooO00o = r2;
        } else {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
    }

    public static <T> C6036i1iIl<T> OooO00o(LLil11<? extends T> r1, AbstractC9847l1<Throwable, ? extends LLil11<? extends T>> r2) {
        return new C6036i1iIl<>(r1, r2);
    }

    public static <T> C6036i1iIl<T> OooO00o(LLil11<? extends T> r2, LLil11<? extends T> r3) {
        if (r3 != null) {
            return new C6036i1iIl<>(r2, new OooO00o(r3));
        }
        throw new NullPointerException("resumeSingleInCaseOfError must not be null");
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        OooO0O0 oooO0O0 = new OooO0O0(r2);
        r2.OooO00o((LlIiLii) oooO0O0);
        this.OooO00o.OooO00o((AbstractC93021L<? super Object>) oooO0O0);
    }
}
