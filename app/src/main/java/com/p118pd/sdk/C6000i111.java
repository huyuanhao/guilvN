package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.subjects.PublishSubject;

/* renamed from: com.pd.sdk.i111丨  reason: invalid class name and case insensitive filesystem */
public final class C6000i111<T, V> implements C9349III.OooO0O0<T, T> {
    public final C9349III<? extends T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends C9349III<V>> f17323OooO00o;

    /* renamed from: com.pd.sdk.i111丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ PublishSubject f17325OooO00o;

        /* renamed from: com.pd.sdk.i111丨$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4932OooO00o implements AbstractC9847l1<V, T> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Object f17326OooO00o;

            public C4932OooO00o(Object obj) {
                this.f17326OooO00o = obj;
            }

            @Override // com.p118pd.sdk.AbstractC9847l1
            public T call(V v) {
                return (T) this.f17326OooO00o;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, PublishSubject publishSubject, IL11lL r4) {
            super(r2);
            this.f17325OooO00o = publishSubject;
            this.OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f17325OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: rx.subjects.PublishSubject */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                this.f17325OooO00o.onNext(((C9349III) C6000i111.this.f17323OooO00o.call(t)).OooO(1).OooO0O0((Object) null).OooOOoo(new C4932OooO00o(t)));
            } catch (Throwable th) {
                IIl11.OooO00o(th, this);
            }
        }
    }

    public C6000i111(C9349III<? extends T> r1, AbstractC9847l1<? super T, ? extends C9349III<V>> r2) {
        this.OooO00o = r1;
        this.f17323OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r5) {
        IL11lL r0 = new IL11lL(r5);
        PublishSubject OooO00o2 = PublishSubject.OooO00o();
        r5.add(C9349III.OooOOo0(OooO00o2).OooO0O0((AbstractC9508LiLi) C6695lilIl.OooO00o((AbstractC5477Il11) r0)));
        return new OooO00o(r5, OooO00o2, r0);
    }
}
