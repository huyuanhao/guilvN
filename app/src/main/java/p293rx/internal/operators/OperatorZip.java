package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5189I1l1l;
import com.p118pd.sdk.AbstractC5351IiIi;
import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC5634LIiL;
import com.p118pd.sdk.AbstractC6021i1L;
import com.p118pd.sdk.AbstractC9359IIIi;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9474LI1lil;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C1i1li;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.Il1lLL11;
import com.p118pd.sdk.i1li1ii1;
import com.p118pd.sdk.iiL1ll;
import com.p118pd.sdk.ll1i1l;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.exceptions.MissingBackpressureException;

/* renamed from: rx.internal.operators.OperatorZip */
public final class OperatorZip<R> implements C9349III.OooO0O0<R, C9349III<?>[]> {
    public final AbstractC6021i1L<? extends R> OooO00o;

    /* renamed from: rx.internal.operators.OperatorZip$OooO00o */
    public final class OooO00o extends AbstractC9508LiLi<C9349III[]> {
        public final AbstractC9508LiLi<? super R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Zip<R> f24145OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ZipProducer<R> f24146OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super R> r2, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.OooO00o = r2;
            this.f24145OooO00o = zip;
            this.f24146OooO00o = zipProducer;
        }

        /* renamed from: OooO00o */
        public void onNext(C9349III[] r3) {
            if (r3 == null || r3.length == 0) {
                this.OooO00o.onCompleted();
                return;
            }
            this.OooO0O0 = true;
            this.f24145OooO00o.start(r3, this.f24146OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }
    }

    /* renamed from: rx.internal.operators.OperatorZip$Zip */
    public static final class Zip<R> extends AtomicLong {
        public static final int THRESHOLD;
        public static final long serialVersionUID = 5995274816189928317L;
        public final AbstractC5477Il11<? super R> child;
        public final IIlIIiI1 childSubscription;
        public int emitted;
        public AtomicLong requested;
        public volatile Object[] subscribers;
        public final AbstractC6021i1L<? extends R> zipFunction;

        /* renamed from: rx.internal.operators.OperatorZip$Zip$OooO00o */
        public final class OooO00o extends AbstractC9508LiLi {
            public final ll1i1l OooO00o = ll1i1l.OooO00o();

            public OooO00o() {
            }

            public void OooO00o(long j) {
                request(j);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.OooO00o.m17943OooO00o();
                Zip.this.tick();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                Zip.this.child.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(Object obj) {
                try {
                    this.OooO00o.m17944OooO00o(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                Zip.this.tick();
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void onStart() {
                request((long) ll1i1l.o0ooOO0);
            }
        }

        static {
            double d = (double) ll1i1l.o0ooOO0;
            Double.isNaN(d);
            THRESHOLD = (int) (d * 0.7d);
        }

        public Zip(AbstractC9508LiLi<? super R> r2, AbstractC6021i1L<? extends R> i1l) {
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            this.childSubscription = iIlIIiI1;
            this.child = r2;
            this.zipFunction = i1l;
            r2.add(iIlIIiI1);
        }

        public void start(C9349III[] r6, AtomicLong atomicLong) {
            Object[] objArr = new Object[r6.length];
            for (int i = 0; i < r6.length; i++) {
                OooO00o oooO00o = new OooO00o();
                objArr[i] = oooO00o;
                this.childSubscription.OooO00o(oooO00o);
            }
            this.requested = atomicLong;
            this.subscribers = objArr;
            for (int i2 = 0; i2 < r6.length; i2++) {
                r6[i2].OooO0O0((AbstractC9508LiLi) ((OooO00o) objArr[i2]));
            }
        }

        public void tick() {
            Object[] objArr = this.subscribers;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                AbstractC5477Il11<? super R> r2 = this.child;
                AtomicLong atomicLong = this.requested;
                while (true) {
                    Object[] objArr2 = new Object[length];
                    boolean z = true;
                    for (int i = 0; i < length; i++) {
                        ll1i1l r11 = ((OooO00o) objArr[i]).OooO00o;
                        Object OooO00o2 = r11.m17941OooO00o();
                        if (OooO00o2 == null) {
                            z = false;
                        } else if (r11.m17946OooO00o(OooO00o2)) {
                            r2.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        } else {
                            objArr2[i] = r11.OooO00o(OooO00o2);
                        }
                    }
                    if (z && atomicLong.get() > 0) {
                        try {
                            r2.onNext((Object) this.zipFunction.call(objArr2));
                            atomicLong.decrementAndGet();
                            this.emitted++;
                            for (Object obj : objArr) {
                                ll1i1l r9 = ((OooO00o) obj).OooO00o;
                                r9.m17948OooO0O0();
                                if (r9.m17946OooO00o(r9.m17941OooO00o())) {
                                    r2.onCompleted();
                                    this.childSubscription.unsubscribe();
                                    return;
                                }
                            }
                            if (this.emitted > THRESHOLD) {
                                for (Object obj2 : objArr) {
                                    ((OooO00o) obj2).OooO00o((long) this.emitted);
                                }
                                this.emitted = 0;
                            }
                        } catch (Throwable th) {
                            IIl11.OooO00o(th, r2, objArr2);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorZip$ZipProducer */
    public static final class ZipProducer<R> extends AtomicLong implements AbstractC9465L1l1 {
        public static final long serialVersionUID = -1216676403723546796L;
        public final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            C6211iLli.OooO00o(this, j);
            this.zipper.tick();
        }
    }

    public OperatorZip(AbstractC6021i1L<? extends R> i1l) {
        this.OooO00o = i1l;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super C9349III[]> call(AbstractC9508LiLi<? super R> r4) {
        Zip zip = new Zip(r4, this.OooO00o);
        ZipProducer zipProducer = new ZipProducer(zip);
        OooO00o oooO00o = new OooO00o(r4, zip, zipProducer);
        r4.add(oooO00o);
        r4.setProducer(zipProducer);
        return oooO00o;
    }

    public OperatorZip(AbstractC5189I1l1l r1) {
        this.OooO00o = iiL1ll.OooO00o(r1);
    }

    public OperatorZip(AbstractC9359IIIi r1) {
        this.OooO00o = iiL1ll.OooO00o(r1);
    }

    public OperatorZip(i1li1ii1 i1li1ii1) {
        this.OooO00o = iiL1ll.OooO00o(i1li1ii1);
    }

    public OperatorZip(Il1lLL11 il1lLL11) {
        this.OooO00o = iiL1ll.OooO00o(il1lLL11);
    }

    public OperatorZip(AbstractC9474LI1lil r1) {
        this.OooO00o = iiL1ll.OooO00o(r1);
    }

    public OperatorZip(AbstractC5351IiIi iiIi) {
        this.OooO00o = iiL1ll.OooO00o(iiIi);
    }

    public OperatorZip(AbstractC5634LIiL r1) {
        this.OooO00o = iiL1ll.OooO00o(r1);
    }

    public OperatorZip(C1i1li r1) {
        this.OooO00o = iiL1ll.OooO00o(r1);
    }
}
