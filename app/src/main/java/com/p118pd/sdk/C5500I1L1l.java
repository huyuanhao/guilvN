package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.I丨1丨丨L1l  reason: invalid class name and case insensitive filesystem */
public final class C5500I1L1l implements C9349III.OooO00o<Long> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f15957OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f15958OooO00o;
    public final long OooO0O0;

    /* renamed from: com.pd.sdk.I丨1丨丨L1l$OooO00o */
    public class OooO00o implements liii1l {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL.OooO00o f15960OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15961OooO00o;

        public OooO00o(AbstractC9508LiLi r2, LL1LL.OooO00o oooO00o) {
            this.f15961OooO00o = r2;
            this.f15960OooO00o = oooO00o;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            try {
                AbstractC9508LiLi r0 = this.f15961OooO00o;
                long j = this.OooO00o;
                this.OooO00o = 1 + j;
                r0.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f15961OooO00o);
                throw th;
            }
        }
    }

    public C5500I1L1l(long j, long j2, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = j;
        this.OooO0O0 = j2;
        this.f15958OooO00o = timeUnit;
        this.f15957OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super Long> r9) {
        LL1LL.OooO00o OooO00o2 = this.f15957OooO00o.m16172OooO00o();
        r9.add(OooO00o2);
        OooO00o2.OooO00o(new OooO00o(r9, OooO00o2), this.OooO00o, this.OooO0O0, this.f15958OooO00o);
    }
}
