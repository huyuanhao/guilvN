package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.丨IiL丨l1i  reason: invalid class name and case insensitive filesystem */
public final class C9381IiLl1i<T> implements LLil11.OooOo00<T> {
    public final LLil11.OooOo00<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5876LlIl f22929OooO00o;

    /* renamed from: com.pd.sdk.丨IiL丨l1i$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> implements AbstractC6473l1II {
        public final AbstractC93021L<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f22930OooO00o = new AtomicBoolean();

        public OooO00o(AbstractC93021L<? super T> r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            if (this.f22930OooO00o.compareAndSet(false, true)) {
                unsubscribe();
                this.OooO00o.OooO00o((Object) t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            onError(new CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II, com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            if (this.f22930OooO00o.compareAndSet(false, true)) {
                unsubscribe();
                this.OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            OooO00o(llIiLii);
        }
    }

    public C9381IiLl1i(LLil11.OooOo00<T> oooOo00, C5876LlIl r2) {
        this.OooO00o = oooOo00;
        this.f22929OooO00o = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        OooO00o oooO00o = new OooO00o(r2);
        r2.OooO00o((LlIiLii) oooO00o);
        this.f22929OooO00o.OooO00o((AbstractC6473l1II) oooO00o);
        this.OooO00o.call(oooO00o);
    }
}
