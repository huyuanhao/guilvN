package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC5635LIi1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.liii1l;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.operators.BufferUntilSubscriber */
public final class BufferUntilSubscriber<T> extends AbstractC5635LIi1<T, T> {
    public static final AbstractC5477Il11 OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final State<T> f24025OooO00o;
    public boolean OooO0O0;

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$OooO00o */
    public static class OooO00o implements AbstractC5477Il11 {
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$OooO0O0 */
    public static final class OooO0O0<T> implements C9349III.OooO00o<T> {
        public final State<T> OooO00o;

        /* renamed from: rx.internal.operators.BufferUntilSubscriber$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0O0.this.OooO00o.set(BufferUntilSubscriber.OooO00o);
            }
        }

        public OooO0O0(State<T> state) {
            this.OooO00o = state;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r4) {
            boolean z;
            if (this.OooO00o.casObserverRef(null, r4)) {
                r4.add(C9638ill.OooO00o(new OooO00o()));
                synchronized (this.OooO00o.guard) {
                    z = true;
                    if (!this.OooO00o.emitting) {
                        this.OooO00o.emitting = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    while (true) {
                        Object poll = this.OooO00o.buffer.poll();
                        if (poll != null) {
                            NotificationLite.OooO00o((AbstractC5477Il11) this.OooO00o.get(), poll);
                        } else {
                            synchronized (this.OooO00o.guard) {
                                if (this.OooO00o.buffer.isEmpty()) {
                                    this.OooO00o.emitting = false;
                                    return;
                                }
                            }
                        }
                    }
                }
            } else {
                r4.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }
    }

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$State */
    public static final class State<T> extends AtomicReference<AbstractC5477Il11<? super T>> {
        public static final long serialVersionUID = 8026705089538090368L;
        public final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();
        public boolean emitting;
        public final Object guard = new Object();

        public boolean casObserverRef(AbstractC5477Il11<? super T> r1, AbstractC5477Il11<? super T> r2) {
            return compareAndSet(r1, r2);
        }
    }

    public BufferUntilSubscriber(State<T> state) {
        super(new OooO0O0(state));
        this.f24025OooO00o = state;
    }

    public static <T> BufferUntilSubscriber<T> OooO00o() {
        return new BufferUntilSubscriber<>(new State());
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (this.OooO0O0) {
            ((AbstractC5477Il11) this.f24025OooO00o.get()).onCompleted();
        } else {
            OooO00o(NotificationLite.OooO00o());
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        if (this.OooO0O0) {
            ((AbstractC5477Il11) this.f24025OooO00o.get()).onError(th);
        } else {
            OooO00o(NotificationLite.OooO00o(th));
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        if (this.OooO0O0) {
            ((AbstractC5477Il11) this.f24025OooO00o.get()).onNext(t);
        } else {
            OooO00o(NotificationLite.OooO0O0((Object) t));
        }
    }

    @Override // com.p118pd.sdk.C9349III
    private void OooO00o(Object obj) {
        synchronized (this.f24025OooO00o.guard) {
            this.f24025OooO00o.buffer.add(obj);
            if (this.f24025OooO00o.get() != null && !this.f24025OooO00o.emitting) {
                this.OooO0O0 = true;
                this.f24025OooO00o.emitting = true;
            }
        }
        if (this.OooO0O0) {
            while (true) {
                Object poll = this.f24025OooO00o.buffer.poll();
                if (poll != null) {
                    NotificationLite.OooO00o((AbstractC5477Il11) this.f24025OooO00o.get(), poll);
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m22997OooO00o() {
        boolean z;
        synchronized (this.f24025OooO00o.guard) {
            z = this.f24025OooO00o.get() != null;
        }
        return z;
    }
}
