package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.i1L丨  reason: invalid class name and case insensitive filesystem */
public class C6024i1L<T> implements C9349III.OooO0O0<T, T> {

    /* renamed from: com.pd.sdk.i1L丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f17389OooO00o;

        public OooO00o(AbstractC9508LiLi r2) {
            this.f17389OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f17389OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f17389OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
        }
    }

    /* renamed from: com.pd.sdk.i1L丨$OooO0O0 */
    public static final class OooO0O0 {
        public static final C6024i1L<?> OooO00o = new C6024i1L<>();
    }

    public static <T> C6024i1L<T> OooO00o() {
        return (C6024i1L<T>) OooO0O0.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        OooO00o oooO00o = new OooO00o(r2);
        r2.add(oooO00o);
        return oooO00o;
    }
}
