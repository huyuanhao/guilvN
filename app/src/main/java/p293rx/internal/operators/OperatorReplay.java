package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.Ili11;
import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LiLIll;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.i11iiILl;
import com.p118pd.sdk.ill111;
import com.p118pd.sdk.liii1l;
import com.umeng.message.proguard.C3848l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.operators.OperatorReplay */
public final class OperatorReplay<T> extends i11iiILl<T> implements LlIiLii {
    public static final LiLIll OooO0O0 = new OooO00o();
    public final LiLIll<? extends AbstractC9966OooO0oo<T>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T> f24114OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<OooO<T>> f24115OooO00o;

    /* renamed from: rx.internal.operators.OperatorReplay$BoundedReplayBuffer */
    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements AbstractC9966OooO0oo<T> {
        public static final long serialVersionUID = 2346567790059478686L;
        public long index;
        public int size;
        public Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node initialHead = getInitialHead();
            while (true) {
                initialHead = (Node) initialHead.get();
                if (initialHead != null) {
                    Object leaveTransform = leaveTransform(initialHead.value);
                    if (!NotificationLite.m22999OooO00o(leaveTransform) && !NotificationLite.m23000OooO0O0(leaveTransform)) {
                        collection.add((Object) NotificationLite.OooO00o(leaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        public final void complete() {
            Object enterTransform = enterTransform(NotificationLite.OooO00o());
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(enterTransform, j));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        public final void error(Throwable th) {
            Object enterTransform = enterTransform(NotificationLite.OooO00o(th));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(enterTransform, j));
            truncateFinal();
        }

        public Node getInitialHead() {
            return (Node) get();
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.m22999OooO00o(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.m23000OooO0O0(leaveTransform(obj));
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        public final void next(T t) {
            Object enterTransform = enterTransform(NotificationLite.OooO0O0((Object) t));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(enterTransform, j));
            truncate();
        }

        public final void removeFirst() {
            Node node = (Node) ((Node) get()).get();
            if (node != null) {
                this.size--;
                setFirst(node);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        public final void removeSome(int i) {
            Node node = (Node) get();
            while (i > 0) {
                node = (Node) node.get();
                i--;
                this.size--;
            }
            setFirst(node);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            if (r12.isUnsubscribed() == false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
            r0 = (p293rx.internal.operators.OperatorReplay.Node) r12.index();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
            if (r0 != null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            r0 = getInitialHead();
            r12.index = r0;
            r12.addTotalRequested(r0.index);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
            if (r12.isUnsubscribed() == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r1 = r12.child;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
            if (r1 != null) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
            r2 = r12.get();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
            if (r6 == r2) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
            r8 = (p293rx.internal.operators.OperatorReplay.Node) r0.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
            if (r8 == null) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
            r0 = leaveTransform(r8.value);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
            if (p293rx.internal.operators.NotificationLite.OooO00o(r1, r0) == false) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
            r12.index = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
            if (r12.isUnsubscribed() == false) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0062, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
            r12.index = null;
            com.p118pd.sdk.IIl11.m15447OooO00o(r2);
            r12.unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
            if (p293rx.internal.operators.NotificationLite.m23000OooO0O0(r0) != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0077, code lost:
            r1.onError(p293rx.exceptions.OnErrorThrowable.addValueAsLastCause(r2, p293rx.internal.operators.NotificationLite.OooO00o(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0085, code lost:
            if (r6 == 0) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0087, code lost:
            r12.index = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0090, code lost:
            if (r2 == Long.MAX_VALUE) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0092, code lost:
            r12.produced(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0095, code lost:
            monitor-enter(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
            if (r12.missed != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
            r12.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x009d, code lost:
            monitor-exit(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x009e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
            r12.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
            monitor-exit(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            return;
         */
        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void replay(p293rx.internal.operators.OperatorReplay.InnerProducer<T> r12) {
            /*
            // Method dump skipped, instructions count: 172
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer.replay(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public void truncate() {
        }

        public void truncateFinal() {
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$InnerProducer */
    public static final class InnerProducer<T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii {
        public static final long UNSUBSCRIBED = Long.MIN_VALUE;
        public static final long serialVersionUID = -4453897557930727610L;
        public AbstractC9508LiLi<? super T> child;
        public boolean emitting;
        public Object index;
        public boolean missed;
        public final OooO<T> parent;
        public final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(OooO<T> oooO, AbstractC9508LiLi<? super T> r2) {
            this.parent = oooO;
            this.child = r2;
        }

        public void addTotalRequested(long j) {
            long j2;
            long j3;
            do {
                j2 = this.totalRequested.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.totalRequested.compareAndSet(j2, j3));
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j > 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j3 = j2 - j;
                    if (j3 < 0) {
                        throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + C3848l.f10402t);
                    }
                } while (!compareAndSet(j2, j3));
                return j3;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 < 0 || j != 0) {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                addTotalRequested(j);
                this.parent.OooO00o((InnerProducer) this);
                this.parent.f24120OooO00o.replay(this);
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.OooO0O0(this);
                this.parent.OooO00o((InnerProducer) this);
                this.child = null;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$Node */
    public static final class Node extends AtomicReference<Node> {
        public static final long serialVersionUID = 245354315435971818L;
        public final long index;
        public final Object value;

        public Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO00o */
    public static class OooO00o implements LiLIll {
        @Override // java.util.concurrent.Callable, com.p118pd.sdk.LiLIll
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0O0 */
    public static class OooO0O0 implements C9349III.OooO00o<R> {
        public final /* synthetic */ LiLIll OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9847l1 f24127OooO00o;

        /* renamed from: rx.internal.operators.OperatorReplay$OooO0O0$OooO00o */
        public class OooO00o implements AbstractC6153iL1l<LlIiLii> {
            public final /* synthetic */ AbstractC9508LiLi OooO00o;

            public OooO00o(AbstractC9508LiLi r2) {
                this.OooO00o = r2;
            }

            /* renamed from: OooO00o */
            public void call(LlIiLii llIiLii) {
                this.OooO00o.add(llIiLii);
            }
        }

        public OooO0O0(LiLIll r1, AbstractC9847l1 r2) {
            this.OooO00o = r1;
            this.f24127OooO00o = r2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨丨l1 */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super R> r3) {
            try {
                i11iiILl i11iiill = (i11iiILl) this.OooO00o.call();
                ((C9349III) this.f24127OooO00o.call(i11iiill)).OooO00o((AbstractC9508LiLi) r3);
                i11iiill.OooO0O0((AbstractC6153iL1l<? super LlIiLii>) new OooO00o(r3));
            } catch (Throwable th) {
                IIl11.OooO00o(th, r3);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0OO */
    public static class OooO0OO implements C9349III.OooO00o<T> {
        public final /* synthetic */ C9349III OooO00o;

        /* renamed from: rx.internal.operators.OperatorReplay$OooO0OO$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<T> {
            public final /* synthetic */ AbstractC9508LiLi OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
                super(r2);
                this.OooO00o = r3;
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
        }

        public OooO0OO(C9349III r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r3) {
            this.OooO00o.OooO0O0((AbstractC9508LiLi) new OooO00o(r3, r3));
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0Oo  reason: case insensitive filesystem */
    public static class C9963OooO0Oo extends i11iiILl<T> {
        public final /* synthetic */ i11iiILl OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9963OooO0Oo(C9349III.OooO00o oooO00o, i11iiILl i11iiill) {
            super(oooO00o);
            this.OooO00o = i11iiill;
        }

        @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.i11iiILl
        public void OooO0O0(AbstractC6153iL1l<? super LlIiLii> il1l) {
            this.OooO00o.OooO0O0(il1l);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0o */
    public static class OooO0o implements LiLIll<AbstractC9966OooO0oo<T>> {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL f24130OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO0o(int i, long j, LL1LL ll1ll) {
            this.o00oO0O = i;
            this.OooO00o = j;
            this.f24130OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public AbstractC9966OooO0oo<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.o00oO0O, this.OooO00o, this.f24130OooO00o);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0o0  reason: case insensitive filesystem */
    public static class C9964OooO0o0 implements LiLIll<AbstractC9966OooO0oo<T>> {
        public final /* synthetic */ int o00oO0O;

        public C9964OooO0o0(int i) {
            this.o00oO0O = i;
        }

        /* renamed from: OooO00o */
        public AbstractC9966OooO0oo<T> call() {
            return new SizeBoundReplayBuffer(this.o00oO0O);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0oO  reason: case insensitive filesystem */
    public static class C9965OooO0oO implements C9349III.OooO00o<T> {
        public final /* synthetic */ LiLIll OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f24131OooO00o;

        public C9965OooO0oO(AtomicReference atomicReference, LiLIll r2) {
            this.f24131OooO00o = atomicReference;
            this.OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r4) {
            OooO oooO;
            while (true) {
                oooO = (OooO) this.f24131OooO00o.get();
                if (oooO != null) {
                    break;
                }
                OooO oooO2 = new OooO((AbstractC9966OooO0oo) this.OooO00o.call());
                oooO2.OooO0OO();
                if (this.f24131OooO00o.compareAndSet(oooO, oooO2)) {
                    oooO = oooO2;
                    break;
                }
            }
            InnerProducer<T> innerProducer = new InnerProducer<>(oooO, r4);
            oooO.m23004OooO00o((InnerProducer) innerProducer);
            r4.add(innerProducer);
            oooO.f24120OooO00o.replay(innerProducer);
            r4.setProducer(innerProducer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO0oo  reason: case insensitive filesystem */
    public interface AbstractC9966OooO0oo<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(InnerProducer<T> innerProducer);
    }

    /* renamed from: rx.internal.operators.OperatorReplay$SizeAndTimeBoundReplayBuffer */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        public static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAgeInMillis;
        public final LL1LL scheduler;

        public SizeAndTimeBoundReplayBuffer(int i, long j, LL1LL ll1ll) {
            this.scheduler = ll1ll;
            this.limit = i;
            this.maxAgeInMillis = j;
        }

        @Override // p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new Ili11(this.scheduler.OooO00o(), obj);
        }

        @Override // p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Node getInitialHead() {
            long OooO00o = this.scheduler.OooO00o() - this.maxAgeInMillis;
            Node node = (Node) get();
            Object obj = node.get();
            while (true) {
                node = (Node) obj;
                if (node == null) {
                    break;
                }
                Object obj2 = node.value;
                Object leaveTransform = leaveTransform(obj2);
                if (NotificationLite.m22999OooO00o(leaveTransform) || NotificationLite.m23000OooO0O0(leaveTransform) || ((Ili11) obj2).OooO00o() > OooO00o) {
                    break;
                }
                obj = node.get();
            }
            return node;
        }

        @Override // p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((Ili11) obj).m15687OooO00o();
        }

        @Override // p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncate() {
            long OooO00o = this.scheduler.OooO00o() - this.maxAgeInMillis;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            int i = 0;
            while (true) {
                node = node2;
                if (node != null) {
                    int i2 = this.size;
                    if (i2 <= this.limit) {
                        if (((Ili11) node.value).OooO00o() > OooO00o) {
                            break;
                        }
                        i++;
                        this.size--;
                        node2 = (Node) node.get();
                    } else {
                        i++;
                        this.size = i2 - 1;
                        node2 = (Node) node.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
        @Override // p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void truncateFinal() {
            /*
                r10 = this;
                com.pd.sdk.LL1LL r0 = r10.scheduler
                long r0 = r0.OooO00o()
                long r2 = r10.maxAgeInMillis
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                rx.internal.operators.OperatorReplay$Node r2 = (p293rx.internal.operators.OperatorReplay.Node) r2
                java.lang.Object r3 = r2.get()
                rx.internal.operators.OperatorReplay$Node r3 = (p293rx.internal.operators.OperatorReplay.Node) r3
                r4 = 0
            L_0x0016:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003a
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L_0x003a
                java.lang.Object r5 = r2.value
                com.pd.sdk.Ili11 r5 = (com.p118pd.sdk.Ili11) r5
                long r7 = r5.OooO00o()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003a
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                rx.internal.operators.OperatorReplay$Node r3 = (p293rx.internal.operators.OperatorReplay.Node) r3
                goto L_0x0016
            L_0x003a:
                if (r4 == 0) goto L_0x003f
                r10.setFirst(r3)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorReplay.SizeAndTimeBoundReplayBuffer.truncateFinal():void");
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$SizeBoundReplayBuffer */
    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        public static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        public SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // p293rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$UnboundedReplayBuffer */
    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements AbstractC9966OooO0oo<T> {
        public static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        public void complete() {
            add(NotificationLite.OooO00o());
            this.size++;
        }

        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        public void error(Throwable th) {
            add(NotificationLite.OooO00o(th));
            this.size++;
        }

        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        public void next(T t) {
            add(NotificationLite.OooO0O0((Object) t));
            this.size++;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            if (r13.isUnsubscribed() == false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
            r0 = r12.size;
            r1 = (java.lang.Integer) r13.index();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1 = r1.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            r3 = r13.child;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
            if (r3 != null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
            r4 = r13.get();
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
            if (r8 == r4) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
            if (r1 >= r0) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
            r10 = get(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
            if (p293rx.internal.operators.NotificationLite.OooO00o(r3, r10) == false) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
            if (r13.isUnsubscribed() == false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
            r1 = r1 + 1;
            r8 = r8 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
            com.p118pd.sdk.IIl11.m15447OooO00o(r0);
            r13.unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
            if (p293rx.internal.operators.NotificationLite.m23000OooO0O0(r10) != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
            r3.onError(p293rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, p293rx.internal.operators.NotificationLite.OooO00o(r10)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
            if (r8 == 0) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
            r13.index = java.lang.Integer.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
            if (r4 == Long.MAX_VALUE) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0081, code lost:
            r13.produced(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
            if (r13.missed != false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0089, code lost:
            r13.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x008b, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x008d, code lost:
            r13.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x008f, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        @Override // p293rx.internal.operators.OperatorReplay.AbstractC9966OooO0oo
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void replay(p293rx.internal.operators.OperatorReplay.InnerProducer<T> r13) {
            /*
            // Method dump skipped, instructions count: 154
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorReplay.UnboundedReplayBuffer.replay(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }
    }

    public OperatorReplay(C9349III.OooO00o<T> oooO00o, C9349III<? extends T> r2, AtomicReference<OooO<T>> atomicReference, LiLIll<? extends AbstractC9966OooO0oo<T>> r4) {
        super(oooO00o);
        this.f24114OooO00o = r2;
        this.f24115OooO00o = atomicReference;
        this.OooO00o = r4;
    }

    public static <T> i11iiILl<T> OooO00o(i11iiILl<T> i11iiill, LL1LL ll1ll) {
        return new C9963OooO0Oo(new OooO0OO(i11iiill.m21402OooO00o(ll1ll)), i11iiill);
    }

    public static <T, U, R> C9349III<R> OooO0OO(LiLIll<? extends i11iiILl<U>> r1, AbstractC9847l1<? super C9349III<U>, ? extends C9349III<R>> r2) {
        return C9349III.OooO0O0((C9349III.OooO00o) new OooO0O0(r1, r2));
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.i11iiILl
    public void OooO0O0(AbstractC6153iL1l<? super LlIiLii> il1l) {
        OooO<T> oooO;
        while (true) {
            oooO = this.f24115OooO00o.get();
            if (oooO != null && !oooO.isUnsubscribed()) {
                break;
            }
            OooO<T> oooO2 = new OooO<>((AbstractC9966OooO0oo) this.OooO00o.call());
            oooO2.OooO0OO();
            if (this.f24115OooO00o.compareAndSet(oooO, oooO2)) {
                oooO = oooO2;
                break;
            }
        }
        boolean z = true;
        if (oooO.f24119OooO00o.get() || !oooO.f24119OooO00o.compareAndSet(false, true)) {
            z = false;
        }
        il1l.call(oooO);
        if (z) {
            this.f24114OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO);
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        OooO<T> oooO = this.f24115OooO00o.get();
        return oooO == null || oooO.isUnsubscribed();
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.f24115OooO00o.lazySet(null);
    }

    public static <T> i11iiILl<T> OooO00o(C9349III<? extends T> r1) {
        return OooO00o((C9349III) r1, OooO0O0);
    }

    public static <T> i11iiILl<T> OooO00o(C9349III<? extends T> r1, int i) {
        if (i == Integer.MAX_VALUE) {
            return OooO00o((C9349III) r1);
        }
        return OooO00o((C9349III) r1, (LiLIll) new C9964OooO0o0(i));
    }

    public static <T> i11iiILl<T> OooO00o(C9349III<? extends T> r6, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(r6, j, timeUnit, ll1ll, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorReplay$OooO */
    public static final class OooO<T> extends AbstractC9508LiLi<T> implements LlIiLii {
        public static final InnerProducer[] OooO0O0 = new InnerProducer[0];
        public static final InnerProducer[] OooO0OO = new InnerProducer[0];
        public volatile long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile AbstractC9465L1l1 f24116OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ill111<InnerProducer<T>> f24117OooO00o = new ill111<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<InnerProducer<T>> f24118OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f24119OooO00o = new AtomicBoolean();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9966OooO0oo<T> f24120OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public InnerProducer<T>[] f24121OooO00o = OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f24122OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f24123OooO0O0;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public long f24124OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public volatile boolean f24125OooO0OO;
        public long OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f24126OooO0Oo;
        public boolean OooO0o;
        public boolean OooO0o0;

        /* renamed from: rx.internal.operators.OperatorReplay$OooO$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                if (!OooO.this.f24125OooO0OO) {
                    synchronized (OooO.this.f24117OooO00o) {
                        if (!OooO.this.f24125OooO0OO) {
                            OooO.this.f24117OooO00o.OooO0O0();
                            OooO.this.OooO00o++;
                            OooO.this.f24125OooO0OO = true;
                        }
                    }
                }
            }
        }

        public OooO(AbstractC9966OooO0oo<T> oooO0oo) {
            this.f24120OooO00o = oooO0oo;
            request(0);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m23004OooO00o(InnerProducer<T> innerProducer) {
            if (innerProducer == null) {
                throw null;
            } else if (this.f24125OooO0OO) {
                return false;
            } else {
                synchronized (this.f24117OooO00o) {
                    if (this.f24125OooO0OO) {
                        return false;
                    }
                    this.f24117OooO00o.OooO00o(innerProducer);
                    this.OooO00o++;
                    return true;
                }
            }
        }

        public void OooO0O0(InnerProducer<T> innerProducer) {
            if (!this.f24125OooO0OO) {
                synchronized (this.f24117OooO00o) {
                    if (!this.f24125OooO0OO) {
                        this.f24117OooO00o.OooO0O0(innerProducer);
                        if (this.f24117OooO00o.m21696OooO00o()) {
                            this.f24121OooO00o = OooO0O0;
                        }
                        this.OooO00o++;
                    }
                }
            }
        }

        public void OooO0OO() {
            add(C9638ill.OooO00o(new OooO00o()));
        }

        public void OooO0Oo() {
            InnerProducer<T>[] innerProducerArr = this.f24121OooO00o;
            if (this.f24122OooO0O0 != this.OooO00o) {
                synchronized (this.f24117OooO00o) {
                    innerProducerArr = this.f24121OooO00o;
                    InnerProducer<T>[] OooO00o2 = this.f24117OooO00o.m21697OooO00o();
                    int length = OooO00o2.length;
                    if (innerProducerArr.length != length) {
                        innerProducerArr = new InnerProducer[length];
                        this.f24121OooO00o = innerProducerArr;
                    }
                    System.arraycopy(OooO00o2, 0, innerProducerArr, 0, length);
                    this.f24122OooO0O0 = this.OooO00o;
                }
            }
            AbstractC9966OooO0oo<T> oooO0oo = this.f24120OooO00o;
            for (InnerProducer<T> innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    oooO0oo.replay(innerProducer);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.f24123OooO0O0) {
                this.f24123OooO0O0 = true;
                try {
                    this.f24120OooO00o.complete();
                    OooO0Oo();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.f24123OooO0O0) {
                this.f24123OooO0O0 = true;
                try {
                    this.f24120OooO00o.error(th);
                    OooO0Oo();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.f24123OooO0O0) {
                this.f24120OooO00o.next(t);
                OooO0Oo();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            if (this.f24116OooO00o == null) {
                this.f24116OooO00o = r2;
                OooO00o((InnerProducer) null);
                OooO0Oo();
                return;
            }
            throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
            r0 = r9.f24124OooO0OO;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
            if (r10 == null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
            r3 = java.lang.Math.max(r0, r10.totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            r10 = OooO00o();
            r3 = r10.length;
            r4 = r0;
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
            if (r6 >= r3) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
            r7 = r10[r6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
            if (r7 == null) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
            r4 = java.lang.Math.max(r4, r7.totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
            OooO00o(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            if (isUnsubscribed() == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
            if (r9.OooO0o0 != false) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
            r9.f24126OooO0Oo = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0065, code lost:
            r9.OooO0o0 = false;
            r10 = r9.f24118OooO00o;
            r9.f24118OooO00o = null;
            r0 = r9.OooO0o;
            r9.OooO0o = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0071, code lost:
            r3 = r9.f24124OooO0OO;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
            if (r10 == null) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
            r10 = r10.iterator();
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
            if (r10.hasNext() == false) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
            r5 = java.lang.Math.max(r5, r10.next().totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
            if (r0 == false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
            r10 = OooO00o();
            r0 = r10.length;
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
            if (r1 >= r0) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
            r7 = r10[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x009e, code lost:
            if (r7 == null) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
            r5 = java.lang.Math.max(r5, r7.totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00aa, code lost:
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ad, code lost:
            OooO00o(r5, r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(p293rx.internal.operators.OperatorReplay.InnerProducer<T> r10) {
            /*
            // Method dump skipped, instructions count: 185
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorReplay.OooO.OooO00o(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }

        public InnerProducer<T>[] OooO00o() {
            InnerProducer<T>[] innerProducerArr;
            synchronized (this.f24117OooO00o) {
                InnerProducer<T>[] OooO00o2 = this.f24117OooO00o.m21697OooO00o();
                int length = OooO00o2.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(OooO00o2, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        public void OooO00o(long j, long j2) {
            long j3 = this.OooO0Oo;
            AbstractC9465L1l1 r2 = this.f24116OooO00o;
            long j4 = j - j2;
            if (j4 != 0) {
                this.f24124OooO0OO = j;
                if (r2 == null) {
                    long j5 = j3 + j4;
                    if (j5 < 0) {
                        j5 = Long.MAX_VALUE;
                    }
                    this.OooO0Oo = j5;
                } else if (j3 != 0) {
                    this.OooO0Oo = 0;
                    r2.request(j3 + j4);
                } else {
                    r2.request(j4);
                }
            } else if (j3 != 0 && r2 != null) {
                this.OooO0Oo = 0;
                r2.request(j3);
            }
        }
    }

    public static <T> i11iiILl<T> OooO00o(C9349III<? extends T> r0, long j, TimeUnit timeUnit, LL1LL ll1ll, int i) {
        return OooO00o((C9349III) r0, (LiLIll) new OooO0o(i, timeUnit.toMillis(j), ll1ll));
    }

    public static <T> i11iiILl<T> OooO00o(C9349III<? extends T> r3, LiLIll<? extends AbstractC9966OooO0oo<T>> r4) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new C9965OooO0oO(atomicReference, r4), r3, atomicReference, r4);
    }
}
