package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.丨iiii  reason: invalid class name and case insensitive filesystem */
public final class C9620iiii<T, U> implements C9349III.OooO00o<T> {
    public final LiLIll<? extends C9349III<U>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T> f23203OooO00o;

    /* renamed from: com.pd.sdk.丨iiii$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<U> {
        public final /* synthetic */ AbstractC9508LiLi OooO00o;

        public OooO00o(AbstractC9508LiLi r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            C9620iiii.this.f23203OooO00o.OooO0O0(C6695lilIl.OooO00o(this.OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(U u) {
        }
    }

    public C9620iiii(C9349III<? extends T> r1, LiLIll<? extends C9349III<U>> r2) {
        this.f23203OooO00o = r1;
        this.OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        try {
            ((C9349III) this.OooO00o.call()).OooO(1).OooO0O0((AbstractC9508LiLi) new OooO00o(r3));
        } catch (Throwable th) {
            IIl11.OooO00o(th, r3);
        }
    }
}
