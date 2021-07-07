package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC6505lILLLII;
import com.p118pd.sdk.AbstractC6876llL;
import com.p118pd.sdk.AbstractC93021L;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LLil11;
import com.p118pd.sdk.LlIiLii;
import java.util.concurrent.atomic.AtomicBoolean;
import p293rx.internal.subscriptions.CancellableSubscription;
import p293rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.internal.operators.SingleFromEmitter */
public final class SingleFromEmitter<T> implements LLil11.OooOo00<T> {
    public final AbstractC6153iL1l<AbstractC6876llL<T>> OooO00o;

    /* renamed from: rx.internal.operators.SingleFromEmitter$SingleEmitterImpl */
    public static final class SingleEmitterImpl<T> extends AtomicBoolean implements AbstractC6876llL<T>, LlIiLii {
        public static final long serialVersionUID = 8082834163465882809L;
        public final AbstractC93021L<? super T> actual;
        public final SequentialSubscription resource = new SequentialSubscription();

        public SingleEmitterImpl(AbstractC93021L<? super T> r1) {
            this.actual = r1;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // com.p118pd.sdk.AbstractC6876llL
        public void onError(Throwable th) {
            if (th == null) {
                th = new NullPointerException();
            }
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onError(th);
                } finally {
                    this.resource.unsubscribe();
                }
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC6876llL
        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                try {
                    this.actual.OooO00o((Object) t);
                } finally {
                    this.resource.unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC6876llL
        public void setCancellation(AbstractC6505lILLLII lilllii) {
            setSubscription(new CancellableSubscription(lilllii));
        }

        @Override // com.p118pd.sdk.AbstractC6876llL
        public void setSubscription(LlIiLii llIiLii) {
            this.resource.update(llIiLii);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.resource.unsubscribe();
            }
        }
    }

    public SingleFromEmitter(AbstractC6153iL1l<AbstractC6876llL<T>> il1l) {
        this.OooO00o = il1l;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        SingleEmitterImpl singleEmitterImpl = new SingleEmitterImpl(r2);
        r2.OooO00o((LlIiLii) singleEmitterImpl);
        try {
            this.OooO00o.call(singleEmitterImpl);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            singleEmitterImpl.onError(th);
        }
    }
}
