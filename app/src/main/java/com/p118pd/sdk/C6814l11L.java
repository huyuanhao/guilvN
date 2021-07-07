package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.l丨11L  reason: invalid class name and case insensitive filesystem */
public final class C6814l11L<T> implements C9349III.OooO0O0<T, T> {

    /* renamed from: com.pd.sdk.l丨11L$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18866OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f18866OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18866OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18866OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f18866OooO00o.onNext(t);
        }
    }

    /* renamed from: com.pd.sdk.l丨11L$OooO0O0 */
    public static final class OooO0O0 {
        public static final C6814l11L<Object> OooO00o = new C6814l11L<>();
    }

    public static <T> C6814l11L<T> OooO00o() {
        return (C6814l11L<T>) OooO0O0.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        return new IL11lL(new OooO00o(r3, r3));
    }
}
