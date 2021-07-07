package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.丨1l丨i  reason: invalid class name */
public final class C1li<T, U, R> implements C9349III.OooO0O0<R, T> {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5189I1l1l<? super T, ? super U, ? extends R> f22818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends U> f22819OooO00o;

    /* renamed from: com.pd.sdk.丨1l丨i$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f22821OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, boolean z, AtomicReference atomicReference, IL11lL r5) {
            super(r2, z);
            this.f22821OooO00o = atomicReference;
            this.OooO00o = r5;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            this.OooO00o.unsubscribe();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.pd.sdk.IL丨11lL */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            Object obj = this.f22821OooO00o.get();
            if (obj != C1li.OooO00o) {
                try {
                    this.OooO00o.onNext(C1li.this.f22818OooO00o.OooO00o(t, obj));
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.丨1l丨i$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<U> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f22823OooO00o;

        public OooO0O0(AtomicReference atomicReference, IL11lL r3) {
            this.f22823OooO00o = atomicReference;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (this.f22823OooO00o.get() == C1li.OooO00o) {
                this.OooO00o.onCompleted();
                this.OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(U u) {
            this.f22823OooO00o.set(u);
        }
    }

    public C1li(C9349III<? extends U> r1, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r2) {
        this.f22819OooO00o = r1;
        this.f22818OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super R> r9) {
        IL11lL r6 = new IL11lL(r9, false);
        r9.add(r6);
        AtomicReference atomicReference = new AtomicReference(OooO00o);
        OooO00o oooO00o = new OooO00o(r6, true, atomicReference, r6);
        OooO0O0 oooO0O0 = new OooO0O0(atomicReference, r6);
        r6.add(oooO00o);
        r6.add(oooO0O0);
        this.f22819OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0O0);
        return oooO00o;
    }
}
