package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC6505lILLLII;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C5782LlI;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9531Lli;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.iLIiLILI;
import com.p118pd.sdk.ll1i1l;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.Emitter;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.internal.subscriptions.CancellableSubscription;

/* renamed from: rx.internal.operators.OnSubscribeCreate */
public final class OnSubscribeCreate<T> implements C9349III.OooO00o<T> {
    public final AbstractC6153iL1l<Emitter<T>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Emitter.BackpressureMode f24038OooO00o;

    /* renamed from: rx.internal.operators.OnSubscribeCreate$BaseEmitter */
    public static abstract class BaseEmitter<T> extends AtomicLong implements Emitter<T>, AbstractC9465L1l1, LlIiLii {
        public static final long serialVersionUID = 7326289992464377023L;
        public final AbstractC9508LiLi<? super T> actual;
        public final iLIiLILI serial = new iLIiLILI();

        public BaseEmitter(AbstractC9508LiLi<? super T> r1) {
            this.actual = r1;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.actual.isUnsubscribed()) {
                try {
                    this.actual.onCompleted();
                } finally {
                    this.serial.unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.actual.isUnsubscribed()) {
                try {
                    this.actual.onError(th);
                } finally {
                    this.serial.unsubscribe();
                }
            }
        }

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public final void request(long j) {
            if (C6211iLli.OooO00o(j)) {
                C6211iLli.OooO00o(this, j);
                onRequested();
            }
        }

        @Override // p293rx.Emitter
        public final long requested() {
            return get();
        }

        @Override // p293rx.Emitter
        public final void setCancellation(AbstractC6505lILLLII lilllii) {
            setSubscription(new CancellableSubscription(lilllii));
        }

        @Override // p293rx.Emitter
        public final void setSubscription(LlIiLii llIiLii) {
            this.serial.OooO00o(llIiLii);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public final void unsubscribe() {
            this.serial.unsubscribe();
            onUnsubscribed();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$BufferEmitter */
    public static final class BufferEmitter<T> extends BaseEmitter<T> {
        public static final long serialVersionUID = 2427151001689639875L;
        public volatile boolean done;
        public Throwable error;
        public final Queue<Object> queue;
        public final AtomicInteger wip;

        public BufferEmitter(AbstractC9508LiLi<? super T> r1, int i) {
            super(r1);
            this.queue = C11LI1.OooO00o() ? new C9531Lli<>(i) : new C5782LlI<>(i);
            this.wip = new AtomicInteger();
        }

        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super T> r0 = this.actual;
                Queue<Object> queue2 = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (r0.isUnsubscribed()) {
                            queue2.clear();
                            return;
                        }
                        boolean z = this.done;
                        Object poll = queue2.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable th = this.error;
                            if (th != null) {
                                super.onError(th);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            r0.onNext((Object) NotificationLite.OooO00o(poll));
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (r0.isUnsubscribed()) {
                            queue2.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = queue2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C6211iLli.OooO0O0(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.queue.offer(NotificationLite.OooO0O0((Object) t));
            drain();
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onRequested() {
            drain();
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$DropEmitter */
    public static final class DropEmitter<T> extends NoOverflowBaseEmitter<T> {
        public static final long serialVersionUID = 8360058422307496563L;

        public DropEmitter(AbstractC9508LiLi<? super T> r1) {
            super(r1);
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter
        public void onOverflow() {
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$ErrorEmitter */
    public static final class ErrorEmitter<T> extends NoOverflowBaseEmitter<T> {
        public static final long serialVersionUID = 338953216916120960L;
        public boolean done;

        public ErrorEmitter(AbstractC9508LiLi<? super T> r1) {
            super(r1);
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.done) {
                this.done = true;
                super.onCompleted();
            }
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.done) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.done = true;
            super.onError(th);
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.done) {
                super.onNext(t);
            }
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter
        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$LatestEmitter */
    public static final class LatestEmitter<T> extends BaseEmitter<T> {
        public static final long serialVersionUID = 4023437720691792495L;
        public volatile boolean done;
        public Throwable error;
        public final AtomicReference<Object> queue = new AtomicReference<>();
        public final AtomicInteger wip = new AtomicInteger();

        public LatestEmitter(AbstractC9508LiLi<? super T> r1) {
            super(r1);
        }

        public void drain() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super T> r0 = this.actual;
                AtomicReference<Object> atomicReference = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (r0.isUnsubscribed()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z2 = this.done;
                            Object andSet = atomicReference.getAndSet(null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.error;
                                if (th != null) {
                                    super.onError(th);
                                    return;
                                } else {
                                    super.onCompleted();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                r0.onNext((Object) NotificationLite.OooO00o(andSet));
                                j2++;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (r0.isUnsubscribed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C6211iLli.OooO0O0(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter, com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.queue.set(NotificationLite.OooO0O0((Object) t));
            drain();
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onRequested() {
            drain();
        }

        @Override // p293rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$NoOverflowBaseEmitter */
    public static abstract class NoOverflowBaseEmitter<T> extends BaseEmitter<T> {
        public static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseEmitter(AbstractC9508LiLi<? super T> r1) {
            super(r1);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.actual.isUnsubscribed()) {
                if (get() != 0) {
                    this.actual.onNext(t);
                    C6211iLli.OooO0O0(this, 1);
                    return;
                }
                onOverflow();
            }
        }

        public abstract void onOverflow();
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$NoneEmitter */
    public static final class NoneEmitter<T> extends BaseEmitter<T> {
        public static final long serialVersionUID = 3776720187248809713L;

        public NoneEmitter(AbstractC9508LiLi<? super T> r1) {
            super(r1);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long j;
            if (!this.actual.isUnsubscribed()) {
                this.actual.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                rx.Emitter$BackpressureMode[] r0 = p293rx.Emitter.BackpressureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p293rx.internal.operators.OnSubscribeCreate.OooO00o.OooO00o = r0
                rx.Emitter$BackpressureMode r1 = p293rx.Emitter.BackpressureMode.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p293rx.internal.operators.OnSubscribeCreate.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                rx.Emitter$BackpressureMode r1 = p293rx.Emitter.BackpressureMode.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p293rx.internal.operators.OnSubscribeCreate.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                rx.Emitter$BackpressureMode r1 = p293rx.Emitter.BackpressureMode.DROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p293rx.internal.operators.OnSubscribeCreate.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                rx.Emitter$BackpressureMode r1 = p293rx.Emitter.BackpressureMode.LATEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OnSubscribeCreate.OooO00o.<clinit>():void");
        }
    }

    public OnSubscribeCreate(AbstractC6153iL1l<Emitter<T>> il1l, Emitter.BackpressureMode backpressureMode) {
        this.OooO00o = il1l;
        this.f24038OooO00o = backpressureMode;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        BaseEmitter baseEmitter;
        int i = OooO00o.OooO00o[this.f24038OooO00o.ordinal()];
        if (i == 1) {
            baseEmitter = new NoneEmitter(r3);
        } else if (i == 2) {
            baseEmitter = new ErrorEmitter(r3);
        } else if (i == 3) {
            baseEmitter = new DropEmitter(r3);
        } else if (i != 4) {
            baseEmitter = new BufferEmitter(r3, ll1i1l.o0ooOO0);
        } else {
            baseEmitter = new LatestEmitter(r3);
        }
        r3.add(baseEmitter);
        r3.setProducer(baseEmitter);
        this.OooO00o.call(baseEmitter);
    }
}
