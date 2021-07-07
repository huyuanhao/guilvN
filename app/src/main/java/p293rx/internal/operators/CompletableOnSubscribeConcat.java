package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6473l1II;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.iI1L1i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeConcat */
public final class CompletableOnSubscribeConcat implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final C9349III<C5876LlIl> OooO00o;
    public final int o00oO0O;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$CompletableConcatSubscriber */
    public static final class CompletableConcatSubscriber extends AbstractC9508LiLi<C5876LlIl> {
        public final iI1L1i<C5876LlIl> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6473l1II f24029OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f24030OooO00o = new AtomicBoolean();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ConcatInnerSubscriber f24031OooO00o = new ConcatInnerSubscriber();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final SequentialSubscription f24032OooO00o = new SequentialSubscription();
        public volatile boolean OooO0O0;
        public volatile boolean OooO0OO;

        /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$CompletableConcatSubscriber$ConcatInnerSubscriber */
        public final class ConcatInnerSubscriber extends AtomicInteger implements AbstractC6473l1II {
            public static final long serialVersionUID = 7233503139645205620L;

            public ConcatInnerSubscriber() {
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                CompletableConcatSubscriber.this.OooO0Oo();
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                CompletableConcatSubscriber.this.OooO0O0(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                CompletableConcatSubscriber.this.f24032OooO00o.set(llIiLii);
            }
        }

        public CompletableConcatSubscriber(AbstractC6473l1II r1, int i) {
            this.f24029OooO00o = r1;
            this.OooO00o = new iI1L1i<>(i);
            add(this.f24032OooO00o);
            request((long) i);
        }

        /* renamed from: OooO00o */
        public void onNext(C5876LlIl r2) {
            if (!this.OooO00o.offer(r2)) {
                onError(new MissingBackpressureException());
            } else {
                OooO0OO();
            }
        }

        public void OooO0O0(Throwable th) {
            unsubscribe();
            onError(th);
        }

        public void OooO0OO() {
            ConcatInnerSubscriber concatInnerSubscriber = this.f24031OooO00o;
            if (concatInnerSubscriber.getAndIncrement() == 0) {
                while (!isUnsubscribed()) {
                    if (!this.OooO0OO) {
                        boolean z = this.OooO0O0;
                        C5876LlIl poll = this.OooO00o.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.f24029OooO00o.onCompleted();
                            return;
                        } else if (!z2) {
                            this.OooO0OO = true;
                            poll.OooO00o((AbstractC6473l1II) concatInnerSubscriber);
                            request(1);
                        }
                    }
                    if (concatInnerSubscriber.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void OooO0Oo() {
            this.OooO0OO = false;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.f24030OooO00o.compareAndSet(false, true)) {
                this.f24029OooO00o.onError(th);
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨III<? extends com.pd.sdk.L丨lI丨l> */
    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeConcat(C9349III<? extends C5876LlIl> r1, int i) {
        this.OooO00o = r1;
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r3) {
        CompletableConcatSubscriber completableConcatSubscriber = new CompletableConcatSubscriber(r3, this.o00oO0O);
        r3.onSubscribe(completableConcatSubscriber);
        this.OooO00o.OooO0O0(completableConcatSubscriber);
    }
}
