package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.lL丨ILI丨  reason: invalid class name and case insensitive filesystem */
public final class C6628lLILI<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18568OooO00o;

    /* renamed from: com.pd.sdk.lL丨ILI丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public long OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18570OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f18570OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18570OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18570OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long OooO00o2 = C6628lLILI.this.f18568OooO00o.OooO00o();
            long j = this.OooO00o;
            if (j == -1 || OooO00o2 < j || OooO00o2 - j >= C6628lLILI.this.OooO00o) {
                this.OooO00o = OooO00o2;
                this.f18570OooO00o.onNext(t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C6628lLILI(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = timeUnit.toMillis(j);
        this.f18568OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
