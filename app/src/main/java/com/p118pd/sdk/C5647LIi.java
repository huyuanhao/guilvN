package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.LI丨i丨  reason: invalid class name and case insensitive filesystem */
public final class C5647LIi<T, U> implements C9349III.OooO0O0<T, T> {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<U> f16372OooO00o;

    /* renamed from: com.pd.sdk.LI丨i丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<U> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f16374OooO00o;
        public final /* synthetic */ AtomicReference OooO0O0;

        public OooO00o(AtomicReference atomicReference, IL11lL r3, AtomicReference atomicReference2) {
            this.f16374OooO00o = atomicReference;
            this.OooO00o = r3;
            this.OooO0O0 = atomicReference2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            onNext(null);
            this.OooO00o.onCompleted();
            ((LlIiLii) this.OooO0O0.get()).unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            ((LlIiLii) this.OooO0O0.get()).unsubscribe();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.pd.sdk.IL丨11lL */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(U u) {
            Object andSet = this.f16374OooO00o.getAndSet(C5647LIi.OooO00o);
            if (andSet != C5647LIi.OooO00o) {
                this.OooO00o.onNext(andSet);
            }
        }
    }

    /* renamed from: com.pd.sdk.LI丨i丨$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16376OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f16377OooO00o;

        public OooO0O0(AtomicReference atomicReference, IL11lL r3, AbstractC9508LiLi r4) {
            this.f16377OooO00o = atomicReference;
            this.OooO00o = r3;
            this.f16376OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f16376OooO00o.onNext(null);
            this.OooO00o.onCompleted();
            this.f16376OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            this.f16376OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f16377OooO00o.set(t);
        }
    }

    public C5647LIi(C9349III<U> r1) {
        this.f16372OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r6) {
        IL11lL r0 = new IL11lL(r6);
        AtomicReference atomicReference = new AtomicReference(OooO00o);
        AtomicReference atomicReference2 = new AtomicReference();
        OooO00o oooO00o = new OooO00o(atomicReference, r0, atomicReference2);
        OooO0O0 oooO0O0 = new OooO0O0(atomicReference, r0, oooO00o);
        atomicReference2.lazySet(oooO0O0);
        r6.add(oooO0O0);
        r6.add(oooO00o);
        this.f16372OooO00o.OooO0O0(oooO00o);
        return oooO0O0;
    }
}
