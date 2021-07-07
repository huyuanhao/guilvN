package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rx.internal.operators.OperatorElementAt */
public final class OperatorElementAt<T> implements C9349III.OooO0O0<T, T> {
    public final T OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    /* renamed from: rx.internal.operators.OperatorElementAt$InnerProducer */
    public static class InnerProducer extends AtomicBoolean implements AbstractC9465L1l1 {
        public static final long serialVersionUID = 1;
        public final AbstractC9465L1l1 actual;

        public InnerProducer(AbstractC9465L1l1 r1) {
            this.actual = r1;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            } else if (j > 0 && compareAndSet(false, true)) {
                this.actual.request(Long.MAX_VALUE);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorElementAt$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ AbstractC9508LiLi OooO00o;
        public int o00oO0O;

        public OooO00o(AbstractC9508LiLi r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            int i = this.o00oO0O;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i > operatorElementAt.o00oO0O) {
                return;
            }
            if (operatorElementAt.OooO0O0) {
                this.OooO00o.onNext(operatorElementAt.OooO00o);
                this.OooO00o.onCompleted();
                return;
            }
            AbstractC9508LiLi r0 = this.OooO00o;
            r0.onError(new IndexOutOfBoundsException(OperatorElementAt.this.o00oO0O + " is out of bounds"));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            if (i == OperatorElementAt.this.o00oO0O) {
                this.OooO00o.onNext(t);
                this.OooO00o.onCompleted();
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r3) {
            this.OooO00o.setProducer(new InnerProducer(r3));
        }
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        OooO00o oooO00o = new OooO00o(r2);
        r2.add(oooO00o);
        return oooO00o;
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    public OperatorElementAt(int i, T t, boolean z) {
        if (i >= 0) {
            this.o00oO0O = i;
            this.OooO00o = t;
            this.OooO0O0 = z;
            return;
        }
        throw new IndexOutOfBoundsException(i + " is out of bounds");
    }
}
