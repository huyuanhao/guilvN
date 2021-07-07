package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.LI1l丨iI  reason: invalid class name and case insensitive filesystem */
public final class C5610LI1liI extends LL1LL {
    public static final C5610LI1liI OooO00o = new C5610LI1liI();

    /* renamed from: com.pd.sdk.LI1l丨iI$OooO00o */
    public static final class OooO00o extends LL1LL.OooO00o implements LlIiLii {
        public final i1i11IL OooO00o = new i1i11IL();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final PriorityBlockingQueue<OooO0O0> f16268OooO00o = new PriorityBlockingQueue<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f16269OooO00o = new AtomicInteger();
        public final AtomicInteger OooO0O0 = new AtomicInteger();

        /* renamed from: com.pd.sdk.LI1l丨iI$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4918OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooO0O0 f16270OooO00o;

            public C4918OooO00o(OooO0O0 oooO0O0) {
                this.f16270OooO00o = oooO0O0;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o.this.f16268OooO00o.remove(this.f16270OooO00o);
            }
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r3) {
            return OooO00o(r3, OooO0O0());
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO00o.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r3, long j, TimeUnit timeUnit) {
            long OooO0O02 = OooO0O0() + timeUnit.toMillis(j);
            return OooO00o(new IIlIlI(r3, this, OooO0O02), OooO0O02);
        }

        private LlIiLii OooO00o(liii1l r2, long j) {
            if (this.OooO00o.isUnsubscribed()) {
                return C9638ill.OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0(r2, Long.valueOf(j), this.f16269OooO00o.incrementAndGet());
            this.f16268OooO00o.add(oooO0O0);
            if (this.OooO0O0.getAndIncrement() != 0) {
                return C9638ill.OooO00o(new C4918OooO00o(oooO0O0));
            }
            do {
                OooO0O0 poll = this.f16268OooO00o.poll();
                if (poll != null) {
                    poll.OooO00o.call();
                }
            } while (this.OooO0O0.decrementAndGet() > 0);
            return C9638ill.OooO0O0();
        }
    }

    /* renamed from: com.pd.sdk.LI1l丨iI$OooO0O0 */
    public static final class OooO0O0 implements Comparable<OooO0O0> {
        public final liii1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Long f16271OooO00o;
        public final int o00oO0O;

        public OooO0O0(liii1l r1, Long l, int i) {
            this.OooO00o = r1;
            this.f16271OooO00o = l;
            this.o00oO0O = i;
        }

        /* renamed from: OooO00o */
        public int compareTo(OooO0O0 oooO0O0) {
            int compareTo = this.f16271OooO00o.compareTo(oooO0O0.f16271OooO00o);
            return compareTo == 0 ? C5610LI1liI.OooO00o(this.o00oO0O, oooO0O0.o00oO0O) : compareTo;
        }
    }

    public static int OooO00o(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new OooO00o();
    }
}
