package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.pd.sdk.IL11i */
public class IL11i<T> implements C9349III.OooO0O0<T, T> {
    public final AbstractC6153iL1l<? super T> OooO00o;

    /* renamed from: com.pd.sdk.IL11i$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicLong f15529OooO00o;

        public OooO00o(AtomicLong atomicLong) {
            this.f15529OooO00o = atomicLong;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            C6211iLli.OooO00o(this.f15529OooO00o, j);
        }
    }

    /* renamed from: com.pd.sdk.IL11i$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15530OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicLong f15531OooO00o;
        public boolean OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC9508LiLi r2, AbstractC9508LiLi r3, AtomicLong atomicLong) {
            super(r2);
            this.f15530OooO00o = r3;
            this.f15531OooO00o = atomicLong;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f15530OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f15530OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                if (this.f15531OooO00o.get() > 0) {
                    this.f15530OooO00o.onNext(t);
                    this.f15531OooO00o.decrementAndGet();
                    return;
                }
                AbstractC6153iL1l<? super T> il1l = IL11i.this.OooO00o;
                if (il1l != null) {
                    try {
                        il1l.call(t);
                    } catch (Throwable th) {
                        IIl11.OooO00o(th, this, t);
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: com.pd.sdk.IL11i$OooO0OO */
    public static final class OooO0OO {
        public static final IL11i<Object> OooO00o = new IL11i<>();
    }

    public IL11i() {
        this(null);
    }

    public static <T> IL11i<T> OooO00o() {
        return (IL11i<T>) OooO0OO.OooO00o;
    }

    public IL11i(AbstractC6153iL1l<? super T> il1l) {
        this.OooO00o = il1l;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        AtomicLong atomicLong = new AtomicLong();
        r3.setProducer(new OooO00o(atomicLong));
        return new OooO0O0(r3, r3, atomicLong);
    }
}
