package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.Li丨i1li  reason: invalid class name and case insensitive filesystem */
public final class C5757Lii1li<T> implements C9349III.OooO0O0<C6090iIIliL<T>, T> {
    public final LL1LL OooO00o;

    /* renamed from: com.pd.sdk.Li丨i1li$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public long OooO00o = C5757Lii1li.this.OooO00o.OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16664OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f16664OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f16664OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f16664OooO00o.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.丨LiL丨丨i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long OooO00o2 = C5757Lii1li.this.OooO00o.OooO00o();
            this.f16664OooO00o.onNext(new C6090iIIliL(OooO00o2 - this.OooO00o, t));
            this.OooO00o = OooO00o2;
        }
    }

    public C5757Lii1li(LL1LL ll1ll) {
        this.OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C6090iIIliL<T>> r2) {
        return new OooO00o(r2, r2);
    }
}
