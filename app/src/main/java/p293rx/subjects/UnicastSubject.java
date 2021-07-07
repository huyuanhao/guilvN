package p293rx.subjects;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC5635LIi1;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C5306ILi1;
import com.p118pd.sdk.C5782LlI;
import com.p118pd.sdk.C6089iIIiLL;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9531Lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.operators.NotificationLite;

/* renamed from: rx.subjects.UnicastSubject */
public final class UnicastSubject<T> extends AbstractC5635LIi1<T, T> {
    public final State<T> OooO00o;

    /* renamed from: rx.subjects.UnicastSubject$State */
    public static final class State<T> extends AtomicLong implements AbstractC9465L1l1, AbstractC5477Il11<T>, C9349III.OooO00o<T>, LlIiLii {
        public static final long serialVersionUID = -9044104859202255786L;
        public volatile boolean caughtUp;
        public final boolean delayError;
        public volatile boolean done;
        public boolean emitting;
        public Throwable error;
        public boolean missed;
        public final Queue<Object> queue;
        public final AtomicReference<AbstractC9508LiLi<? super T>> subscriber = new AtomicReference<>();
        public final AtomicReference<liii1l> terminateOnce;

        public State(int i, boolean z, liii1l r4) {
            Queue<Object> queue2;
            this.terminateOnce = r4 != null ? new AtomicReference<>(r4) : null;
            this.delayError = z;
            if (i > 1) {
                queue2 = C11LI1.OooO00o() ? new C9531Lli<>(i) : new C5782LlI<>(i);
            } else {
                queue2 = C11LI1.OooO00o() ? new C5306ILi1<>() : new C6089iIIiLL<>();
            }
            this.queue = queue2;
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        public boolean checkTerminated(boolean z, boolean z2, boolean z3, AbstractC9508LiLi<? super T> r6) {
            if (r6.isUnsubscribed()) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null && !z3) {
                    this.queue.clear();
                    r6.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    if (th != null) {
                        r6.onError(th);
                    } else {
                        r6.onCompleted();
                    }
                    return true;
                }
            }
        }

        public void doTerminate() {
            liii1l r1;
            AtomicReference<liii1l> atomicReference = this.terminateOnce;
            if (atomicReference != null && (r1 = atomicReference.get()) != null && atomicReference.compareAndSet(r1, null)) {
                r1.call();
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.done;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.done) {
                doTerminate();
                boolean z = true;
                this.done = true;
                if (!this.caughtUp) {
                    synchronized (this) {
                        if (this.caughtUp) {
                            z = false;
                        }
                    }
                    if (z) {
                        replay();
                        return;
                    }
                }
                this.subscriber.get().onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.done) {
                doTerminate();
                this.error = th;
                boolean z = true;
                this.done = true;
                if (!this.caughtUp) {
                    synchronized (this) {
                        if (this.caughtUp) {
                            z = false;
                        }
                    }
                    if (z) {
                        replay();
                        return;
                    }
                }
                this.subscriber.get().onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.done) {
                if (!this.caughtUp) {
                    boolean z = false;
                    synchronized (this) {
                        if (!this.caughtUp) {
                            this.queue.offer(NotificationLite.OooO0O0((Object) t));
                            z = true;
                        }
                    }
                    if (z) {
                        replay();
                        return;
                    }
                }
                AbstractC9508LiLi<? super T> r0 = this.subscriber.get();
                try {
                    r0.onNext(t);
                } catch (Throwable th) {
                    IIl11.OooO00o(th, r0, t);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r3 = r15.subscriber.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
            if (r3 == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if (checkTerminated(r15.done, r0.isEmpty(), r2, r3) == false) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r5 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            if (r5 != Long.MAX_VALUE) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            r7 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
            if (r5 == 0) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
            r12 = r15.done;
            r13 = r0.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
            if (r13 != null) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r14 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
            r14 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
            if (checkTerminated(r12, r14, r2, r3) == false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
            if (r14 == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
            r12 = (java.lang.Object) p293rx.internal.operators.NotificationLite.OooO00o(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            r3.onNext(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
            r5 = r5 - 1;
            r10 = r10 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
            r0.clear();
            com.p118pd.sdk.IIl11.m15447OooO00o(r1);
            r3.onError(p293rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
            if (r7 != false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
            if (r10 == 0) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
            addAndGet(-r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007f, code lost:
            if (r15.missed != false) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0081, code lost:
            if (r7 == false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0087, code lost:
            if (r0.isEmpty() == false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0089, code lost:
            r15.caughtUp = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x008b, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x008d, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x008e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x008f, code lost:
            r15.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
            r0 = r15.queue;
            r2 = r15.delayError;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void replay() {
            /*
            // Method dump skipped, instructions count: 156
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.subjects.UnicastSubject.State.replay():void");
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            } else if (j > 0) {
                C6211iLli.OooO00o(this, j);
                replay();
            } else if (this.done) {
                replay();
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            doTerminate();
            this.done = true;
            synchronized (this) {
                if (!this.emitting) {
                    this.emitting = true;
                    this.queue.clear();
                }
            }
        }

        public void call(AbstractC9508LiLi<? super T> r3) {
            if (this.subscriber.compareAndSet(null, r3)) {
                r3.add(this);
                r3.setProducer(this);
                return;
            }
            r3.onError(new IllegalStateException("Only a single subscriber is allowed"));
        }
    }

    public UnicastSubject(State<T> state) {
        super(state);
        this.OooO00o = state;
    }

    public static <T> UnicastSubject<T> OooO00o() {
        return OooO00o(16);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.OooO00o.onCompleted();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.OooO00o.onError(th);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.OooO00o.onNext(t);
    }

    public static <T> UnicastSubject<T> OooO00o(int i) {
        return new UnicastSubject<>(new State(i, false, null));
    }

    public static <T> UnicastSubject<T> OooO00o(boolean z) {
        return new UnicastSubject<>(new State(16, z, null));
    }

    public static <T> UnicastSubject<T> OooO00o(int i, liii1l r3) {
        return new UnicastSubject<>(new State(i, false, r3));
    }

    public static <T> UnicastSubject<T> OooO00o(int i, liii1l r2, boolean z) {
        return new UnicastSubject<>(new State(i, z, r2));
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m23027OooO00o() {
        return this.OooO00o.subscriber.get() != null;
    }
}
