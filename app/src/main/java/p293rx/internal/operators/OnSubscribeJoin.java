package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5189I1l1l;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.IL11lL;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.iLIiLILI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rx.internal.operators.OnSubscribeJoin */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements C9349III.OooO00o<R> {
    public final AbstractC5189I1l1l<TLeft, TRight, R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<TLeft> f24059OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<TLeft, C9349III<TLeftDuration>> f24060OooO00o;
    public final C9349III<TRight> OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC9847l1<TRight, C9349III<TRightDuration>> f24061OooO0O0;

    /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink */
    public final class ResultSink extends HashMap<Integer, TLeft> {
        public static final long serialVersionUID = 3491669543549085380L;
        public final IIlIIiI1 group = new IIlIIiI1();
        public boolean leftDone;
        public int leftId;
        public boolean rightDone;
        public int rightId;
        public final Map<Integer, TRight> rightMap = new HashMap();
        public final AbstractC9508LiLi<? super R> subscriber;

        /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$OooO00o */
        public final class OooO00o extends AbstractC9508LiLi<TLeft> {

            /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$OooO00o$OooO00o  reason: collision with other inner class name */
            public final class C4987OooO00o extends AbstractC9508LiLi<TLeftDuration> {
                public boolean OooO0O0 = true;
                public final int o00oO0O;

                public C4987OooO00o(int i) {
                    this.o00oO0O = i;
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onCompleted() {
                    if (this.OooO0O0) {
                        this.OooO0O0 = false;
                        OooO00o.this.OooO00o(this.o00oO0O, this);
                    }
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onError(Throwable th) {
                    OooO00o.this.onError(th);
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            public OooO00o() {
            }

            public void OooO00o(int i, LlIiLii llIiLii) {
                boolean z;
                synchronized (ResultSink.this) {
                    z = ResultSink.this.leftMap().remove(Integer.valueOf(i)) != null && ResultSink.this.leftMap().isEmpty() && ResultSink.this.leftDone;
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.OooO0O0(llIiLii);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                boolean z;
                synchronized (ResultSink.this) {
                    z = true;
                    ResultSink.this.leftDone = true;
                    if (!ResultSink.this.rightDone) {
                        if (!ResultSink.this.leftMap().isEmpty()) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.OooO0O0(this);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                ResultSink.this.subscriber.onError(th);
                ResultSink.this.subscriber.unsubscribe();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.pd.sdk.I1l丨1l<TLeft, TRight, R> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(TLeft tleft) {
                int i;
                int i2;
                synchronized (ResultSink.this) {
                    ResultSink resultSink = ResultSink.this;
                    i = resultSink.leftId;
                    resultSink.leftId = i + 1;
                    ResultSink.this.leftMap().put(Integer.valueOf(i), tleft);
                    i2 = ResultSink.this.rightId;
                }
                try {
                    C4987OooO00o oooO00o = new C4987OooO00o(i);
                    ResultSink.this.group.OooO00o(oooO00o);
                    OnSubscribeJoin.this.f24060OooO00o.call(tleft).OooO0O0(oooO00o);
                    ArrayList<Object> arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        for (Map.Entry<Integer, TRight> entry : ResultSink.this.rightMap.entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    for (Object obj : arrayList) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.OooO00o.OooO00o(tleft, obj));
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$OooO0O0 */
        public final class OooO0O0 extends AbstractC9508LiLi<TRight> {

            /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$OooO0O0$OooO00o */
            public final class OooO00o extends AbstractC9508LiLi<TRightDuration> {
                public boolean OooO0O0 = true;
                public final int o00oO0O;

                public OooO00o(int i) {
                    this.o00oO0O = i;
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onCompleted() {
                    if (this.OooO0O0) {
                        this.OooO0O0 = false;
                        OooO0O0.this.OooO00o(this.o00oO0O, this);
                    }
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onError(Throwable th) {
                    OooO0O0.this.onError(th);
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            public OooO0O0() {
            }

            public void OooO00o(int i, LlIiLii llIiLii) {
                boolean z;
                synchronized (ResultSink.this) {
                    z = ResultSink.this.rightMap.remove(Integer.valueOf(i)) != null && ResultSink.this.rightMap.isEmpty() && ResultSink.this.rightDone;
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.OooO0O0(llIiLii);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                boolean z;
                synchronized (ResultSink.this) {
                    z = true;
                    ResultSink.this.rightDone = true;
                    if (!ResultSink.this.leftDone) {
                        if (!ResultSink.this.rightMap.isEmpty()) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.OooO0O0(this);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                ResultSink.this.subscriber.onError(th);
                ResultSink.this.subscriber.unsubscribe();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.pd.sdk.I1l丨1l<TLeft, TRight, R> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (ResultSink.this) {
                    ResultSink resultSink = ResultSink.this;
                    i = resultSink.rightId;
                    resultSink.rightId = i + 1;
                    ResultSink.this.rightMap.put(Integer.valueOf(i), tright);
                    i2 = ResultSink.this.leftId;
                }
                ResultSink.this.group.OooO00o(new iLIiLILI());
                try {
                    OooO00o oooO00o = new OooO00o(i);
                    ResultSink.this.group.OooO00o(oooO00o);
                    OnSubscribeJoin.this.f24061OooO0O0.call(tright).OooO0O0(oooO00o);
                    ArrayList<Object> arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        for (Map.Entry<Integer, TLeft> entry : ResultSink.this.leftMap().entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    for (Object obj : arrayList) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.OooO00o.OooO00o(obj, tright));
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        public ResultSink(AbstractC9508LiLi<? super R> r2) {
            this.subscriber = r2;
        }

        public HashMap<Integer, TLeft> leftMap() {
            return this;
        }

        public void run() {
            this.subscriber.add(this.group);
            OooO00o oooO00o = new OooO00o();
            OooO0O0 oooO0O0 = new OooO0O0();
            this.group.OooO00o(oooO00o);
            this.group.OooO00o(oooO0O0);
            OnSubscribeJoin.this.f24059OooO00o.OooO0O0(oooO00o);
            OnSubscribeJoin.this.OooO0O0.OooO0O0(oooO0O0);
        }
    }

    public OnSubscribeJoin(C9349III<TLeft> r1, C9349III<TRight> r2, AbstractC9847l1<TLeft, C9349III<TLeftDuration>> r3, AbstractC9847l1<TRight, C9349III<TRightDuration>> r4, AbstractC5189I1l1l<TLeft, TRight, R> r5) {
        this.f24059OooO00o = r1;
        this.OooO0O0 = r2;
        this.f24060OooO00o = r3;
        this.f24061OooO0O0 = r4;
        this.OooO00o = r5;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r3) {
        new ResultSink(new IL11lL(r3)).run();
    }
}
