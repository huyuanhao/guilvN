package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.丨1ilLi  reason: invalid class name */
public final class C1ilLi implements C9349III.OooO00o<Long> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f22815OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f22816OooO00o;

    /* renamed from: com.pd.sdk.丨1ilLi$OooO00o */
    public class OooO00o implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f22817OooO00o;

        public OooO00o(AbstractC9508LiLi r2) {
            this.f22817OooO00o = r2;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            try {
                this.f22817OooO00o.onNext(0L);
                this.f22817OooO00o.onCompleted();
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f22817OooO00o);
            }
        }
    }

    public C1ilLi(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = j;
        this.f22816OooO00o = timeUnit;
        this.f22815OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super Long> r5) {
        LL1LL.OooO00o OooO00o2 = this.f22815OooO00o.m16172OooO00o();
        r5.add(OooO00o2);
        OooO00o2.OooO00o(new OooO00o(r5), this.OooO00o, this.f22816OooO00o);
    }
}
