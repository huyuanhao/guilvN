package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayDeque;
import java.util.Deque;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.丨IlIIIi1  reason: invalid class name */
public class IlIIIi1<T> implements C9349III.OooO0O0<T, T> {
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.丨IlIIIi1$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f22955OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Deque<Object> f22956OooO00o = new ArrayDeque();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f22955OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f22955OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f22955OooO00o.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.pd.sdk.丨LiL丨丨i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (IlIIIi1.this.o00oO0O == 0) {
                this.f22955OooO00o.onNext(t);
                return;
            }
            if (this.f22956OooO00o.size() == IlIIIi1.this.o00oO0O) {
                this.f22955OooO00o.onNext(NotificationLite.OooO00o(this.f22956OooO00o.removeFirst()));
            } else {
                request(1);
            }
            this.f22956OooO00o.offerLast(NotificationLite.OooO0O0((Object) t));
        }
    }

    public IlIIIi1(int i) {
        if (i >= 0) {
            this.o00oO0O = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
