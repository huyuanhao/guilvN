package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.l1Ii丨i1i  reason: invalid class name */
public final class l1Iii1i<T, U> implements LLil11.OooOo00<T> {
    public final LLil11.OooOo00<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends U> f18251OooO00o;

    /* renamed from: com.pd.sdk.l1Ii丨i1i$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC93021L<T> {
        public final AbstractC93021L<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<U> f18252OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f18253OooO00o = new AtomicBoolean();

        /* renamed from: com.pd.sdk.l1Ii丨i1i$OooO00o$OooO00o  reason: collision with other inner class name */
        public final class C4945OooO00o extends AbstractC9508LiLi<U> {
            public C4945OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                OooO00o.this.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(U u) {
                onCompleted();
            }
        }

        public OooO00o(AbstractC93021L<? super T> r1) {
            this.OooO00o = r1;
            C4945OooO00o oooO00o = new C4945OooO00o();
            this.f18252OooO00o = oooO00o;
            OooO00o((LlIiLii) oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            if (this.f18253OooO00o.compareAndSet(false, true)) {
                unsubscribe();
                this.OooO00o.OooO00o((Object) t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            if (this.f18253OooO00o.compareAndSet(false, true)) {
                unsubscribe();
                this.OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }
    }

    public l1Iii1i(LLil11.OooOo00<T> oooOo00, C9349III<? extends U> r2) {
        this.OooO00o = oooOo00;
        this.f18251OooO00o = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3);
        r3.OooO00o((LlIiLii) oooO00o);
        this.f18251OooO00o.OooO00o((AbstractC9508LiLi<? super Object>) oooO00o.f18252OooO00o);
        this.OooO00o.call(oooO00o);
    }
}
