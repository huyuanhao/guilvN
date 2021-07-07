package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.IIL1l丨  reason: invalid class name */
public final class IIL1l<T, U> implements C9349III.OooO0O0<T, T>, AbstractC5189I1l1l<U, U, Boolean> {
    public final AbstractC5189I1l1l<? super U, ? super U, Boolean> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends U> f15485OooO00o;

    /* renamed from: com.pd.sdk.IIL1l丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15486OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public U f15487OooO00o;
        public boolean OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f15486OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15486OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15486OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            Object obj;
            try {
                U u = (U) IIL1l.this.f15485OooO00o.call(t);
                U u2 = this.f15487OooO00o;
                this.f15487OooO00o = u;
                if (this.OooO0O0) {
                    try {
                        if (!IIL1l.this.OooO00o.OooO00o(u2, u).booleanValue()) {
                            this.f15486OooO00o.onNext(t);
                        } else {
                            request(1);
                        }
                    } catch (Throwable th) {
                        IIl11.OooO00o(th, this.f15486OooO00o, obj);
                    }
                } else {
                    this.OooO0O0 = true;
                    this.f15486OooO00o.onNext(t);
                }
            } catch (Throwable th2) {
                IIl11.OooO00o(th2, this.f15486OooO00o, t);
            }
        }
    }

    /* renamed from: com.pd.sdk.IIL1l丨$OooO0O0 */
    public static final class OooO0O0 {
        public static final IIL1l<?, ?> OooO00o = new IIL1l<>(UtilityFunctions.OooO0OO());
    }

    public IIL1l(AbstractC9847l1<? super T, ? extends U> r1) {
        this.f15485OooO00o = r1;
        this.OooO00o = this;
    }

    public static <T> IIL1l<T, T> OooO00o() {
        return (IIL1l<T, T>) OooO0O0.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5189I1l1l
    public Boolean OooO00o(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    public IIL1l(AbstractC5189I1l1l<? super U, ? super U, Boolean> r2) {
        this.f15485OooO00o = UtilityFunctions.OooO0OO();
        this.OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
