package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p293rx.internal.producers.SingleDelayedProducer;

/* renamed from: com.pd.sdk.LLLII1丨1  reason: invalid class name */
public final class LLLII11<T> implements C9349III.OooO0O0<List<T>, T> {
    public static final Comparator OooO0O0 = new OooO0OO();
    public final Comparator<? super T> OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.LLLII1丨1$OooO00o */
    public class OooO00o implements Comparator<T> {
        public final /* synthetic */ AbstractC5189I1l1l OooO00o;

        public OooO00o(AbstractC5189I1l1l r2) {
            this.OooO00o = r2;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.OooO00o.OooO00o(t, t2)).intValue();
        }
    }

    /* renamed from: com.pd.sdk.LLLII1丨1$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16459OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<T> f16460OooO00o = new ArrayList(LLLII11.this.o00oO0O);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ SingleDelayedProducer f16461OooO00o;
        public boolean OooO0O0;

        public OooO0O0(SingleDelayedProducer singleDelayedProducer, AbstractC9508LiLi r3) {
            this.f16461OooO00o = singleDelayedProducer;
            this.f16459OooO00o = r3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                List<T> list = this.f16460OooO00o;
                this.f16460OooO00o = null;
                try {
                    Collections.sort(list, LLLII11.this.OooO00o);
                    this.f16461OooO00o.setValue(list);
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f16459OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                this.f16460OooO00o.add(t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: com.pd.sdk.LLLII1丨1$OooO0OO */
    public static final class OooO0OO implements Comparator<Object> {
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Comparable */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public LLLII11(int i) {
        this.OooO00o = OooO0O0;
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super List<T>> r3) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(r3);
        OooO0O0 oooO0O0 = new OooO0O0(singleDelayedProducer, r3);
        r3.add(oooO0O0);
        r3.setProducer(singleDelayedProducer);
        return oooO0O0;
    }

    public LLLII11(AbstractC5189I1l1l<? super T, ? super T, Integer> r1, int i) {
        this.o00oO0O = i;
        this.OooO00o = new OooO00o(r1);
    }
}
