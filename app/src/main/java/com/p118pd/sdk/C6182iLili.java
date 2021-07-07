package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.iLili  reason: case insensitive filesystem */
public final class C6182iLili<T, U> implements LLil11.OooOo00<T> {
    public final LLil11.OooOo00<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LLil11<? extends U> f17755OooO00o;

    /* renamed from: com.pd.sdk.iLili$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC93021L<T> {
        public final AbstractC93021L<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f17756OooO00o = new AtomicBoolean();
        public final AbstractC93021L<U> OooO0O0;

        /* renamed from: com.pd.sdk.iLili$OooO00o$OooO00o  reason: collision with other inner class name */
        public final class C4935OooO00o extends AbstractC93021L<U> {
            public C4935OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(U u) {
                onError(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                OooO00o.this.onError(th);
            }
        }

        public OooO00o(AbstractC93021L<? super T> r1) {
            this.OooO00o = r1;
            C4935OooO00o oooO00o = new C4935OooO00o();
            this.OooO0O0 = oooO00o;
            OooO00o((LlIiLii) oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            if (this.f17756OooO00o.compareAndSet(false, true)) {
                unsubscribe();
                this.OooO00o.OooO00o((Object) t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            if (this.f17756OooO00o.compareAndSet(false, true)) {
                unsubscribe();
                this.OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }
    }

    public C6182iLili(LLil11.OooOo00<T> oooOo00, LLil11<? extends U> r2) {
        this.OooO00o = oooOo00;
        this.f17755OooO00o = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3);
        r3.OooO00o((LlIiLii) oooO00o);
        this.f17755OooO00o.OooO00o((AbstractC93021L<? super Object>) oooO00o.OooO0O0);
        this.OooO00o.call(oooO00o);
    }
}
