package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.liii1l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.operators.OnSubscribeAmb */
public final class OnSubscribeAmb<T> implements C9349III.OooO00o<T> {
    public final Iterable<? extends C9349III<? extends T>> OooO00o;

    /* renamed from: rx.internal.operators.OnSubscribeAmb$OooO00o */
    public class OooO00o implements liii1l {
        public final /* synthetic */ Selection OooO00o;

        public OooO00o(Selection selection) {
            this.OooO00o = selection;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            OooO0OO oooO0OO = (OooO0OO) this.OooO00o.get();
            if (oooO0OO != null) {
                oooO0OO.unsubscribe();
            }
            OnSubscribeAmb.OooO00o((Collection) this.OooO00o.ambSubscribers);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$OooO0O0 */
    public class OooO0O0 implements AbstractC9465L1l1 {
        public final /* synthetic */ Selection OooO00o;

        public OooO0O0(Selection selection) {
            this.OooO00o = selection;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            OooO0OO oooO0OO = (OooO0OO) this.OooO00o.get();
            if (oooO0OO != null) {
                oooO0OO.OooO00o(j);
                return;
            }
            for (OooO0OO<T> oooO0OO2 : this.OooO00o.ambSubscribers) {
                if (!oooO0OO2.isUnsubscribed()) {
                    if (this.OooO00o.get() == oooO0OO2) {
                        oooO0OO2.OooO00o(j);
                        return;
                    }
                    oooO0OO2.OooO00o(j);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Selection<T> f24035OooO00o;
        public boolean OooO0O0;

        public OooO0OO(long j, AbstractC9508LiLi<? super T> r3, Selection<T> selection) {
            this.OooO00o = r3;
            this.f24035OooO00o = selection;
            request(j);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (OooO00o()) {
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (OooO00o()) {
                this.OooO00o.onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (OooO00o()) {
                this.OooO00o.onNext(t);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void OooO00o(long j) {
            request(j);
        }

        private boolean OooO00o() {
            if (this.OooO0O0) {
                return true;
            }
            if (this.f24035OooO00o.get() == this) {
                this.OooO0O0 = true;
                return true;
            } else if (this.f24035OooO00o.compareAndSet(null, this)) {
                this.f24035OooO00o.unsubscribeOthers(this);
                this.OooO0O0 = true;
                return true;
            } else {
                this.f24035OooO00o.unsubscribeLosers();
                return false;
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$Selection */
    public static final class Selection<T> extends AtomicReference<OooO0OO<T>> {
        public final Collection<OooO0OO<T>> ambSubscribers = new ConcurrentLinkedQueue();

        public void unsubscribeLosers() {
            OooO0OO<T> oooO0OO = (OooO0OO) get();
            if (oooO0OO != null) {
                unsubscribeOthers(oooO0OO);
            }
        }

        public void unsubscribeOthers(OooO0OO<T> oooO0OO) {
            for (OooO0OO<T> oooO0OO2 : this.ambSubscribers) {
                if (oooO0OO2 != oooO0OO) {
                    oooO0OO2.unsubscribe();
                }
            }
            this.ambSubscribers.clear();
        }
    }

    public OnSubscribeAmb(Iterable<? extends C9349III<? extends T>> iterable) {
        this.OooO00o = iterable;
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        arrayList.add(r4);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        arrayList.add(r4);
        arrayList.add(r5);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        arrayList.add(r4);
        arrayList.add(r5);
        arrayList.add(r6);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        arrayList.add(r4);
        arrayList.add(r5);
        arrayList.add(r6);
        arrayList.add(r7);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        arrayList.add(r4);
        arrayList.add(r5);
        arrayList.add(r6);
        arrayList.add(r7);
        arrayList.add(r8);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8, C9349III<? extends T> r9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1);
        arrayList.add(r2);
        arrayList.add(r3);
        arrayList.add(r4);
        arrayList.add(r5);
        arrayList.add(r6);
        arrayList.add(r7);
        arrayList.add(r8);
        arrayList.add(r9);
        return OooO00o((Iterable) arrayList);
    }

    public static <T> C9349III.OooO00o<T> OooO00o(Iterable<? extends C9349III<? extends T>> iterable) {
        return new OnSubscribeAmb(iterable);
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r7) {
        Selection selection = new Selection();
        r7.add(C9638ill.OooO00o(new OooO00o(selection)));
        Iterator<? extends C9349III<? extends T>> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            C9349III r2 = (C9349III) it.next();
            if (r7.isUnsubscribed()) {
                break;
            }
            OooO0OO<T> oooO0OO = new OooO0OO<>(0, r7, selection);
            selection.ambSubscribers.add(oooO0OO);
            OooO0OO<T> oooO0OO2 = (OooO0OO) selection.get();
            if (oooO0OO2 != null) {
                selection.unsubscribeOthers(oooO0OO2);
                return;
            }
            r2.OooO0O0((AbstractC9508LiLi) oooO0OO);
        }
        if (r7.isUnsubscribed()) {
            OooO00o((Collection) selection.ambSubscribers);
        }
        r7.setProducer(new OooO0O0(selection));
    }

    public static <T> void OooO00o(Collection<OooO0OO<T>> collection) {
        if (!collection.isEmpty()) {
            for (OooO0OO<T> oooO0OO : collection) {
                oooO0OO.unsubscribe();
            }
            collection.clear();
        }
    }
}
