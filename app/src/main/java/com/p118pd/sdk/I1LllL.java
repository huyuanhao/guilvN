package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.I丨1LllL  reason: invalid class name */
public final class I1LllL<T, U> implements C9349III.OooO0O0<T, T> {
    public final C9349III<U> OooO00o;

    /* renamed from: com.pd.sdk.I丨1LllL$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<U> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f15951OooO00o;

        public OooO00o(AtomicBoolean atomicBoolean, IL11lL r3) {
            this.f15951OooO00o = atomicBoolean;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(U u) {
            this.f15951OooO00o.set(true);
            unsubscribe();
        }
    }

    /* renamed from: com.pd.sdk.I丨1LllL$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f15953OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC9508LiLi r2, AtomicBoolean atomicBoolean, IL11lL r4) {
            super(r2);
            this.f15953OooO00o = atomicBoolean;
            this.OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.f15953OooO00o.get()) {
                this.OooO00o.onNext(t);
            } else {
                request(1);
            }
        }
    }

    public I1LllL(C9349III<U> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r5) {
        IL11lL r0 = new IL11lL(r5);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        OooO00o oooO00o = new OooO00o(atomicBoolean, r0);
        r5.add(oooO00o);
        this.OooO00o.OooO0O0(oooO00o);
        return new OooO0O0(r5, atomicBoolean, r0);
    }
}
