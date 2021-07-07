package p293rx.observables;

import com.p118pd.sdk.AbstractC5189I1l1l;
import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9583iI1Il;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LiLIll;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.observables.SyncOnSubscribe */
public abstract class SyncOnSubscribe<S, T> implements C9349III.OooO00o<T> {

    /* renamed from: rx.observables.SyncOnSubscribe$OooO00o */
    public static class OooO00o implements AbstractC5189I1l1l<S, AbstractC5477Il11<? super T>, S> {
        public final /* synthetic */ AbstractC9583iI1Il OooO00o;

        public OooO00o(AbstractC9583iI1Il r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public /* bridge */ /* synthetic */ Object OooO00o(Object obj, Object obj2) {
            return OooO00o(obj, (AbstractC5477Il11) ((AbstractC5477Il11) obj2));
        }

        public S OooO00o(S s, AbstractC5477Il11<? super T> r3) {
            this.OooO00o.OooO00o(s, r3);
            return s;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$OooO0O0 */
    public static class OooO0O0 implements AbstractC5189I1l1l<S, AbstractC5477Il11<? super T>, S> {
        public final /* synthetic */ AbstractC9583iI1Il OooO00o;

        public OooO0O0(AbstractC9583iI1Il r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public /* bridge */ /* synthetic */ Object OooO00o(Object obj, Object obj2) {
            return OooO00o(obj, (AbstractC5477Il11) ((AbstractC5477Il11) obj2));
        }

        public S OooO00o(S s, AbstractC5477Il11<? super T> r3) {
            this.OooO00o.OooO00o(s, r3);
            return s;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$OooO0OO */
    public static class OooO0OO implements AbstractC5189I1l1l<Void, AbstractC5477Il11<? super T>, Void> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        public OooO0OO(AbstractC6153iL1l il1l) {
            this.OooO00o = il1l;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public /* bridge */ /* synthetic */ Void OooO00o(Void r1, Object obj) {
            return OooO00o(r1, (AbstractC5477Il11) ((AbstractC5477Il11) obj));
        }

        public Void OooO00o(Void r2, AbstractC5477Il11<? super T> r3) {
            this.OooO00o.call(r3);
            return r2;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$OooO0Oo  reason: case insensitive filesystem */
    public static class C9977OooO0Oo implements AbstractC5189I1l1l<Void, AbstractC5477Il11<? super T>, Void> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        public C9977OooO0Oo(AbstractC6153iL1l il1l) {
            this.OooO00o = il1l;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public /* bridge */ /* synthetic */ Void OooO00o(Void r1, Object obj) {
            return OooO00o(r1, (AbstractC5477Il11) ((AbstractC5477Il11) obj));
        }

        public Void OooO00o(Void r1, AbstractC5477Il11<? super T> r2) {
            this.OooO00o.call(r2);
            return null;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$OooO0o */
    public static final class OooO0o<S, T> extends SyncOnSubscribe<S, T> {
        public final AbstractC5189I1l1l<? super S, ? super AbstractC5477Il11<? super T>, ? extends S> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LiLIll<? extends S> f24174OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6153iL1l<? super S> f24175OooO00o;

        public OooO0o(LiLIll<? extends S> r1, AbstractC5189I1l1l<? super S, ? super AbstractC5477Il11<? super T>, ? extends S> r2, AbstractC6153iL1l<? super S> il1l) {
            this.f24174OooO00o = r1;
            this.OooO00o = r2;
            this.f24175OooO00o = il1l;
        }

        @Override // p293rx.observables.SyncOnSubscribe
        public S OooO00o() {
            LiLIll<? extends S> r0 = this.f24174OooO00o;
            if (r0 == null) {
                return null;
            }
            return (S) r0.call();
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l, p293rx.observables.SyncOnSubscribe
        public /* bridge */ /* synthetic */ void call(Object obj) {
            SyncOnSubscribe.super.OooO00o((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        @Override // p293rx.observables.SyncOnSubscribe
        public S OooO00o(S s, AbstractC5477Il11<? super T> r3) {
            return (S) this.OooO00o.OooO00o(s, r3);
        }

        @Override // p293rx.observables.SyncOnSubscribe
        public void OooO00o(S s) {
            AbstractC6153iL1l<? super S> il1l = this.f24175OooO00o;
            if (il1l != null) {
                il1l.call(s);
            }
        }

        public OooO0o(LiLIll<? extends S> r2, AbstractC5189I1l1l<? super S, ? super AbstractC5477Il11<? super T>, ? extends S> r3) {
            this(r2, r3, null);
        }

        public OooO0o(AbstractC5189I1l1l<S, AbstractC5477Il11<? super T>, S> r2, AbstractC6153iL1l<? super S> il1l) {
            this(null, r2, il1l);
        }

        public OooO0o(AbstractC5189I1l1l<S, AbstractC5477Il11<? super T>, S> r2) {
            this(null, r2, null);
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$OooO0o0  reason: case insensitive filesystem */
    public static class C9978OooO0o0 implements AbstractC6153iL1l<Void> {
        public final /* synthetic */ liii1l OooO00o;

        public C9978OooO0o0(liii1l r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(Void r1) {
            this.OooO00o.call();
        }
    }

    public abstract S OooO00o();

    public abstract S OooO00o(S s, AbstractC5477Il11<? super T> v);

    public final void OooO00o(AbstractC9508LiLi<? super T> r3) {
        try {
            SubscriptionProducer subscriptionProducer = new SubscriptionProducer(r3, this, OooO00o());
            r3.add(subscriptionProducer);
            r3.setProducer(subscriptionProducer);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            r3.onError(th);
        }
    }

    public void OooO00o(S s) {
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        OooO00o((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    /* renamed from: rx.observables.SyncOnSubscribe$SubscriptionProducer */
    public static final class SubscriptionProducer<S, T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii, AbstractC5477Il11<T> {
        public static final long serialVersionUID = -3736864024352728072L;
        public final AbstractC9508LiLi<? super T> actualSubscriber;
        public boolean hasTerminated;
        public boolean onNextCalled;
        public final SyncOnSubscribe<S, T> parent;
        public S state;

        public SubscriptionProducer(AbstractC9508LiLi<? super T> r1, SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.actualSubscriber = r1;
            this.parent = syncOnSubscribe;
            this.state = s;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m23005OooO00o() {
            if (!this.hasTerminated && get() >= -1) {
                return false;
            }
            set(-1);
            OooO00o();
            return true;
        }

        private void OooO0O0() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            AbstractC9508LiLi<? super T> r1 = this.actualSubscriber;
            do {
                try {
                    this.onNextCalled = false;
                    OooO00o(syncOnSubscribe);
                } catch (Throwable th) {
                    OooO00o(r1, th);
                    return;
                }
            } while (!m23005OooO00o());
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.hasTerminated) {
                this.hasTerminated = true;
                if (!this.actualSubscriber.isUnsubscribed()) {
                    this.actualSubscriber.onCompleted();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.hasTerminated) {
                this.hasTerminated = true;
                if (!this.actualSubscriber.isUnsubscribed()) {
                    this.actualSubscriber.onError(th);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.onNextCalled) {
                this.onNextCalled = true;
                this.actualSubscriber.onNext(t);
                return;
            }
            throw new IllegalStateException("onNext called multiple times!");
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j > 0 && C6211iLli.OooO00o(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    OooO0O0();
                } else {
                    OooO00o(j);
                }
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            long j;
            do {
                j = get();
                if (compareAndSet(0, -1)) {
                    OooO00o();
                    return;
                }
            } while (!compareAndSet(j, -2));
        }

        private void OooO00o() {
            try {
                this.parent.OooO00o((Object) this.state);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                C9714lli.m21756OooO00o(th);
            }
        }

        private void OooO00o(AbstractC9508LiLi<? super T> r2, Throwable th) {
            if (this.hasTerminated) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.hasTerminated = true;
            r2.onError(th);
            unsubscribe();
        }

        private void OooO00o(long j) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            AbstractC9508LiLi<? super T> r1 = this.actualSubscriber;
            do {
                long j2 = j;
                do {
                    try {
                        this.onNextCalled = false;
                        OooO00o(syncOnSubscribe);
                        if (!m23005OooO00o()) {
                            if (this.onNextCalled) {
                                j2--;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        OooO00o(r1, th);
                        return;
                    }
                } while (j2 != 0);
                j = addAndGet(-j);
            } while (j > 0);
            m23005OooO00o();
        }

        private void OooO00o(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.state = syncOnSubscribe.OooO00o(this.state, this);
        }
    }

    public static <S, T> SyncOnSubscribe<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC9583iI1Il<? super S, ? super AbstractC5477Il11<? super T>> r2) {
        return new OooO0o(r1, new OooO00o(r2));
    }

    public static <S, T> SyncOnSubscribe<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC9583iI1Il<? super S, ? super AbstractC5477Il11<? super T>> r2, AbstractC6153iL1l<? super S> il1l) {
        return new OooO0o(r1, new OooO0O0(r2), il1l);
    }

    public static <S, T> SyncOnSubscribe<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC5189I1l1l<? super S, ? super AbstractC5477Il11<? super T>, ? extends S> r2, AbstractC6153iL1l<? super S> il1l) {
        return new OooO0o(r1, r2, il1l);
    }

    public static <S, T> SyncOnSubscribe<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC5189I1l1l<? super S, ? super AbstractC5477Il11<? super T>, ? extends S> r2) {
        return new OooO0o(r1, r2);
    }

    public static <T> SyncOnSubscribe<Void, T> OooO00o(AbstractC6153iL1l<? super AbstractC5477Il11<? super T>> il1l) {
        return new OooO0o(new OooO0OO(il1l));
    }

    public static <T> SyncOnSubscribe<Void, T> OooO00o(AbstractC6153iL1l<? super AbstractC5477Il11<? super T>> il1l, liii1l r2) {
        return new OooO0o(new C9977OooO0Oo(il1l), new C9978OooO0o0(r2));
    }
}
