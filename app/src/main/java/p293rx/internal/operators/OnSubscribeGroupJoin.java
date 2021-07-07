package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5189I1l1l;
import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C5468IllIL;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.IL11lL;
import com.p118pd.sdk.LlIiLii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p293rx.subjects.PublishSubject;
import p293rx.subscriptions.RefCountSubscription;

/* renamed from: rx.internal.operators.OnSubscribeGroupJoin */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements C9349III.OooO00o<R> {
    public final AbstractC5189I1l1l<? super T1, ? super C9349III<T2>, ? extends R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T1> f24053OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T1, ? extends C9349III<D1>> f24054OooO00o;
    public final C9349III<T2> OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC9847l1<? super T2, ? extends C9349III<D2>> f24055OooO0O0;

    /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$OooO00o */
    public static final class OooO00o<T> implements C9349III.OooO00o<T> {
        public final C9349III<T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final RefCountSubscription f24056OooO00o;

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$OooO00o$OooO00o  reason: collision with other inner class name */
        public final class C4986OooO00o extends AbstractC9508LiLi<T> {
            public final LlIiLii OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final AbstractC9508LiLi<? super T> f24057OooO00o;

            public C4986OooO00o(AbstractC9508LiLi<? super T> r2, LlIiLii llIiLii) {
                super(r2);
                this.f24057OooO00o = r2;
                this.OooO00o = llIiLii;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.f24057OooO00o.onCompleted();
                this.OooO00o.unsubscribe();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.f24057OooO00o.onError(th);
                this.OooO00o.unsubscribe();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T t) {
                this.f24057OooO00o.onNext(t);
            }
        }

        public OooO00o(C9349III<T> r1, RefCountSubscription refCountSubscription) {
            this.f24056OooO00o = refCountSubscription;
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r3) {
            LlIiLii OooO00o2 = this.f24056OooO00o.OooO00o();
            C4986OooO00o oooO00o = new C4986OooO00o(r3, OooO00o2);
            oooO00o.add(OooO00o2);
            this.OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager */
    public final class ResultManager extends HashMap<Integer, AbstractC5477Il11<T2>> implements LlIiLii {
        public static final long serialVersionUID = -3035156013812425335L;
        public final RefCountSubscription cancel;
        public final IIlIIiI1 group;
        public boolean leftDone;
        public int leftIds;
        public boolean rightDone;
        public int rightIds;
        public final Map<Integer, T2> rightMap = new HashMap();
        public final AbstractC9508LiLi<? super R> subscriber;

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$OooO00o */
        public final class OooO00o extends AbstractC9508LiLi<D1> {
            public boolean OooO0O0 = true;
            public final int o00oO0O;

            public OooO00o(int i) {
                this.o00oO0O = i;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                AbstractC5477Il11<T2> remove;
                if (this.OooO0O0) {
                    this.OooO0O0 = false;
                    synchronized (ResultManager.this) {
                        remove = ResultManager.this.leftMap().remove(Integer.valueOf(this.o00oO0O));
                    }
                    if (remove != null) {
                        remove.onCompleted();
                    }
                    ResultManager.this.group.OooO0O0(this);
                }
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                ResultManager.this.errorMain(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(D1 d1) {
                onCompleted();
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$OooO0O0 */
        public final class OooO0O0 extends AbstractC9508LiLi<T1> {
            public OooO0O0() {
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    ResultManager.this.leftDone = true;
                    if (ResultManager.this.rightDone) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                        ResultManager.this.leftMap().clear();
                        ResultManager.this.rightMap.clear();
                    } else {
                        arrayList = null;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                ResultManager.this.errorAll(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T1 t1) {
                int i;
                ArrayList<Object> arrayList;
                try {
                    PublishSubject OooO00o2 = PublishSubject.OooO00o();
                    C5468IllIL r1 = new C5468IllIL(OooO00o2);
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i = resultManager.leftIds;
                        resultManager.leftIds = i + 1;
                        ResultManager.this.leftMap().put(Integer.valueOf(i), r1);
                    }
                    C9349III OooO0O0 = C9349III.OooO0O0((C9349III.OooO00o) new OooO00o(OooO00o2, ResultManager.this.cancel));
                    OooO00o oooO00o = new OooO00o(i);
                    ResultManager.this.group.OooO00o(oooO00o);
                    ((C9349III) OnSubscribeGroupJoin.this.f24054OooO00o.call(t1)).OooO0O0((AbstractC9508LiLi) oooO00o);
                    Object OooO00o3 = OnSubscribeGroupJoin.this.OooO00o.OooO00o(t1, OooO0O0);
                    synchronized (ResultManager.this) {
                        arrayList = new ArrayList(ResultManager.this.rightMap.values());
                    }
                    ResultManager.this.subscriber.onNext(OooO00o3);
                    for (Object obj : arrayList) {
                        r1.onNext(obj);
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$OooO0OO */
        public final class OooO0OO extends AbstractC9508LiLi<D2> {
            public boolean OooO0O0 = true;
            public final int o00oO0O;

            public OooO0OO(int i) {
                this.o00oO0O = i;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                if (this.OooO0O0) {
                    this.OooO0O0 = false;
                    synchronized (ResultManager.this) {
                        ResultManager.this.rightMap.remove(Integer.valueOf(this.o00oO0O));
                    }
                    ResultManager.this.group.OooO0O0(this);
                }
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                ResultManager.this.errorMain(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(D2 d2) {
                onCompleted();
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$OooO0Oo  reason: case insensitive filesystem */
        public final class C9960OooO0Oo extends AbstractC9508LiLi<T2> {
            public C9960OooO0Oo() {
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    ResultManager.this.rightDone = true;
                    if (ResultManager.this.leftDone) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                        ResultManager.this.leftMap().clear();
                        ResultManager.this.rightMap.clear();
                    } else {
                        arrayList = null;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                ResultManager.this.errorAll(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T2 t2) {
                int i;
                ArrayList<AbstractC5477Il11> arrayList;
                try {
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i = resultManager.rightIds;
                        resultManager.rightIds = i + 1;
                        ResultManager.this.rightMap.put(Integer.valueOf(i), t2);
                    }
                    OooO0OO oooO0OO = new OooO0OO(i);
                    ResultManager.this.group.OooO00o(oooO0OO);
                    ((C9349III) OnSubscribeGroupJoin.this.f24055OooO0O0.call(t2)).OooO0O0((AbstractC9508LiLi) oooO0OO);
                    synchronized (ResultManager.this) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                    }
                    for (AbstractC5477Il11 r1 : arrayList) {
                        r1.onNext(t2);
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        public ResultManager(AbstractC9508LiLi<? super R> r2) {
            this.subscriber = r2;
            this.group = new IIlIIiI1();
            this.cancel = new RefCountSubscription(this.group);
        }

        public void complete(List<AbstractC5477Il11<T2>> list) {
            if (list != null) {
                for (AbstractC5477Il11<T2> r0 : list) {
                    r0.onCompleted();
                }
                this.subscriber.onCompleted();
                this.cancel.unsubscribe();
            }
        }

        public void errorAll(Throwable th) {
            ArrayList<AbstractC5477Il11> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(leftMap().values());
                leftMap().clear();
                this.rightMap.clear();
            }
            for (AbstractC5477Il11 r1 : arrayList) {
                r1.onError(th);
            }
            this.subscriber.onError(th);
            this.cancel.unsubscribe();
        }

        public void errorMain(Throwable th) {
            synchronized (this) {
                leftMap().clear();
                this.rightMap.clear();
            }
            this.subscriber.onError(th);
            this.cancel.unsubscribe();
        }

        public void init() {
            OooO0O0 oooO0O0 = new OooO0O0();
            C9960OooO0Oo oooO0Oo = new C9960OooO0Oo();
            this.group.OooO00o(oooO0O0);
            this.group.OooO00o(oooO0Oo);
            OnSubscribeGroupJoin.this.f24053OooO00o.OooO0O0(oooO0O0);
            OnSubscribeGroupJoin.this.OooO0O0.OooO0O0(oooO0Oo);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.cancel.isUnsubscribed();
        }

        public Map<Integer, AbstractC5477Il11<T2>> leftMap() {
            return this;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.cancel.unsubscribe();
        }
    }

    public OnSubscribeGroupJoin(C9349III<T1> r1, C9349III<T2> r2, AbstractC9847l1<? super T1, ? extends C9349III<D1>> r3, AbstractC9847l1<? super T2, ? extends C9349III<D2>> r4, AbstractC5189I1l1l<? super T1, ? super C9349III<T2>, ? extends R> r5) {
        this.f24053OooO00o = r1;
        this.OooO0O0 = r2;
        this.f24054OooO00o = r3;
        this.f24055OooO0O0 = r4;
        this.OooO00o = r5;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r3) {
        ResultManager resultManager = new ResultManager(new IL11lL(r3));
        r3.add(resultManager);
        resultManager.init();
    }
}
