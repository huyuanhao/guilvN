package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.丨丨1丨1  reason: invalid class name and case insensitive filesystem */
public final class C974811<T> implements C9349III.OooO00o<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f23385OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T> f23386OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f23387OooO00o;

    /* renamed from: com.pd.sdk.丨丨1丨1$OooO00o */
    public class OooO00o implements liii1l {
        public final /* synthetic */ AbstractC9508LiLi OooO00o;

        public OooO00o(AbstractC9508LiLi r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (!this.OooO00o.isUnsubscribed()) {
                C974811.this.f23386OooO00o.OooO0O0(C6695lilIl.OooO00o(this.OooO00o));
            }
        }
    }

    public C974811(C9349III<? extends T> r1, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.f23386OooO00o = r1;
        this.OooO00o = j;
        this.f23387OooO00o = timeUnit;
        this.f23385OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r5) {
        LL1LL.OooO00o OooO00o2 = this.f23385OooO00o.m16172OooO00o();
        r5.add(OooO00o2);
        OooO00o2.OooO00o(new OooO00o(r5), this.OooO00o, this.f23387OooO00o);
    }
}
