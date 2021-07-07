package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;
import p293rx.internal.subscriptions.SequentialSubscription;

/* renamed from: com.pd.sdk.iilIlI丨L  reason: invalid class name */
public final class iilIlIL {
    public static final long OooO00o = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: com.pd.sdk.iilIlI丨L$OooO00o */
    public static class OooO00o implements liii1l {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL.OooO00o f17925OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ OooO0O0 f17926OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f17927OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ SequentialSubscription f17928OooO00o;
        public long OooO0O0 = this.OooO0Oo;
        public long OooO0OO = this.OooO0o0;
        public final /* synthetic */ long OooO0Oo;
        public final /* synthetic */ long OooO0o;
        public final /* synthetic */ long OooO0o0;

        public OooO00o(long j, long j2, liii1l r5, SequentialSubscription sequentialSubscription, OooO0O0 oooO0O0, LL1LL.OooO00o oooO00o, long j3) {
            this.OooO0Oo = j;
            this.OooO0o0 = j2;
            this.f17927OooO00o = r5;
            this.f17928OooO00o = sequentialSubscription;
            this.f17926OooO00o = oooO0O0;
            this.f17925OooO00o = oooO00o;
            this.OooO0o = j3;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            long j;
            this.f17927OooO00o.call();
            if (!this.f17928OooO00o.isUnsubscribed()) {
                OooO0O0 oooO0O0 = this.f17926OooO00o;
                long OooO00o2 = oooO0O0 != null ? oooO0O0.OooO00o() : TimeUnit.MILLISECONDS.toNanos(this.f17925OooO00o.OooO0O0());
                long j2 = iilIlIL.OooO00o;
                long j3 = this.OooO0O0;
                if (OooO00o2 + j2 >= j3) {
                    long j4 = this.OooO0o;
                    if (OooO00o2 < j3 + j4 + j2) {
                        long j5 = this.OooO0OO;
                        long j6 = this.OooO00o + 1;
                        this.OooO00o = j6;
                        j = j5 + (j6 * j4);
                        this.OooO0O0 = OooO00o2;
                        this.f17928OooO00o.replace(this.f17925OooO00o.OooO00o(this, j - OooO00o2, TimeUnit.NANOSECONDS));
                    }
                }
                long j7 = this.OooO0o;
                long j8 = OooO00o2 + j7;
                long j9 = this.OooO00o + 1;
                this.OooO00o = j9;
                this.OooO0OO = j8 - (j7 * j9);
                j = j8;
                this.OooO0O0 = OooO00o2;
                this.f17928OooO00o.replace(this.f17925OooO00o.OooO00o(this, j - OooO00o2, TimeUnit.NANOSECONDS));
            }
        }
    }

    /* renamed from: com.pd.sdk.iilIlI丨L$OooO0O0 */
    public interface OooO0O0 {
        long OooO00o();
    }

    public iilIlIL() {
        throw new IllegalStateException("No instances!");
    }

    public static LlIiLii OooO00o(LL1LL.OooO00o oooO00o, liii1l r17, long j, long j2, TimeUnit timeUnit, OooO0O0 oooO0O0) {
        long nanos = timeUnit.toNanos(j2);
        long OooO00o2 = oooO0O0 != null ? oooO0O0.OooO00o() : TimeUnit.MILLISECONDS.toNanos(oooO00o.OooO0O0());
        SequentialSubscription sequentialSubscription = new SequentialSubscription();
        SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        sequentialSubscription.replace(oooO00o.OooO00o(new OooO00o(OooO00o2, timeUnit.toNanos(j) + OooO00o2, r17, sequentialSubscription2, oooO0O0, oooO00o, nanos), j, timeUnit));
        return sequentialSubscription2;
    }
}
