package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.I1ii丨  reason: invalid class name and case insensitive filesystem */
public class C5180I1ii<T> implements LLil11.OooOo00<T> {
    public final C9349III<T> OooO00o;

    /* renamed from: com.pd.sdk.I1ii丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC93021L f15387OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f15388OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public OooO00o(AbstractC93021L r2) {
            this.f15387OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                if (this.OooO0OO) {
                    this.f15387OooO00o.OooO00o((Object) this.f15388OooO00o);
                } else {
                    this.f15387OooO00o.onError(new NoSuchElementException("Observable emitted no items"));
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15387OooO00o.onError(th);
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.OooO0OO) {
                this.OooO0O0 = true;
                this.f15387OooO00o.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
                return;
            }
            this.OooO0OO = true;
            this.f15388OooO00o = t;
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(2);
        }
    }

    public C5180I1ii(C9349III<T> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        OooO00o oooO00o = new OooO00o(r2);
        r2.OooO00o((LlIiLii) oooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
    }

    public static <T> C5180I1ii<T> OooO00o(C9349III<T> r1) {
        return new C5180I1ii<>(r1);
    }
}
