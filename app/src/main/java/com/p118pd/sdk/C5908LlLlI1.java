package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LLil11;
import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.L丨l丨LlI1  reason: invalid class name and case insensitive filesystem */
public final class C5908LlLlI1<T> implements LLil11.OooOo00<T> {
    public final C9349III.OooO00o<T> OooO00o;

    /* renamed from: com.pd.sdk.L丨l丨LlI1$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public static final int o0ooOO0 = 0;
        public static final int o0ooOOo = 1;
        public static final int o0ooOoO = 2;
        public final AbstractC93021L<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f16921OooO00o;
        public int o00oO0O;

        public OooO00o(AbstractC93021L<? super T> r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            int i = this.o00oO0O;
            if (i == 0) {
                this.OooO00o.onError(new NoSuchElementException());
            } else if (i == 1) {
                this.o00oO0O = 2;
                T t = this.f16921OooO00o;
                this.f16921OooO00o = null;
                this.OooO00o.OooO00o((Object) t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.o00oO0O == 2) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.f16921OooO00o = null;
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int i = this.o00oO0O;
            if (i == 0) {
                this.o00oO0O = 1;
                this.f16921OooO00o = t;
            } else if (i == 1) {
                this.o00oO0O = 2;
                this.OooO00o.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public C5908LlLlI1(C9349III.OooO00o<T> oooO00o) {
        this.OooO00o = oooO00o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.pd.sdk.丨III$OooO00o<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        OooO00o oooO00o = new OooO00o(r2);
        r2.OooO00o((LlIiLii) oooO00o);
        this.OooO00o.call(oooO00o);
    }
}
