package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.HashSet;
import java.util.Set;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.Ii1L11 */
public final class Ii1L11<T, U> implements C9349III.OooO0O0<T, T> {
    public final AbstractC9847l1<? super T, ? extends U> OooO00o;

    /* renamed from: com.pd.sdk.Ii1L11$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15672OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Set<U> f15673OooO00o = new HashSet();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f15672OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15673OooO00o = null;
            this.f15672OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15673OooO00o = null;
            this.f15672OooO00o.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Set<U> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.f15673OooO00o.add(Ii1L11.this.OooO00o.call(t))) {
                this.f15672OooO00o.onNext(t);
            } else {
                request(1);
            }
        }
    }

    /* renamed from: com.pd.sdk.Ii1L11$OooO0O0 */
    public static final class OooO0O0 {
        public static final Ii1L11<?, ?> OooO00o = new Ii1L11<>(UtilityFunctions.OooO0OO());
    }

    public Ii1L11(AbstractC9847l1<? super T, ? extends U> r1) {
        this.OooO00o = r1;
    }

    public static <T> Ii1L11<T, T> OooO00o() {
        return (Ii1L11<T, T>) OooO0O0.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
