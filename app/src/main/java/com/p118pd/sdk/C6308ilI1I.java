package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.iilIlIL;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.ilI丨1I  reason: invalid class name and case insensitive filesystem */
public class C6308ilI1I extends LL1LL {
    public static long OooO0O0;
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Queue<OooO0OO> f17997OooO00o = new PriorityQueue(11, new OooO00o());

    /* renamed from: com.pd.sdk.ilI丨1I$OooO00o */
    public static final class OooO00o implements Comparator<OooO0OO> {
        /* renamed from: OooO00o */
        public int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            long j = oooO0OO.OooO00o;
            long j2 = oooO0OO2.OooO00o;
            if (j == j2) {
                if (oooO0OO.OooO0O0 < oooO0OO2.OooO0O0) {
                    return -1;
                }
                if (oooO0OO.OooO0O0 > oooO0OO2.OooO0O0) {
                    return 1;
                }
                return 0;
            } else if (j < j2) {
                return -1;
            } else {
                if (j > j2) {
                    return 1;
                }
                return 0;
            }
        }
    }

    /* renamed from: com.pd.sdk.ilI丨1I$OooO0OO */
    public static final class OooO0OO {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f18001OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final liii1l f18002OooO00o;
        public final long OooO0O0;

        public OooO0OO(LL1LL.OooO00o oooO00o, long j, liii1l r8) {
            long j2 = C6308ilI1I.OooO0O0;
            C6308ilI1I.OooO0O0 = 1 + j2;
            this.OooO0O0 = j2;
            this.OooO00o = j;
            this.f18002OooO00o = r8;
            this.f18001OooO00o = oooO00o;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.OooO00o), this.f18002OooO00o.toString());
        }
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public long OooO00o() {
        return TimeUnit.NANOSECONDS.toMillis(this.OooO00o);
    }

    public void OooO0O0(long j, TimeUnit timeUnit) {
        OooO00o(timeUnit.toNanos(j));
    }

    public void OooO00o(long j, TimeUnit timeUnit) {
        OooO0O0(this.OooO00o + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    /* renamed from: com.pd.sdk.ilI丨1I$OooO0O0 */
    public final class OooO0O0 extends LL1LL.OooO00o implements iilIlIL.OooO0O0 {
        public final i1i11IL OooO00o = new i1i11IL();

        /* renamed from: com.pd.sdk.ilI丨1I$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooO0OO f17999OooO00o;

            public OooO00o(OooO0OO oooO0OO) {
                this.f17999OooO00o = oooO0OO;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                C6308ilI1I.this.f17997OooO00o.remove(this.f17999OooO00o);
            }
        }

        /* renamed from: com.pd.sdk.ilI丨1I$OooO0O0$OooO0O0  reason: collision with other inner class name */
        public class C4942OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooO0OO f18000OooO00o;

            public C4942OooO0O0(OooO0OO oooO0OO) {
                this.f18000OooO00o = oooO0OO;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                C6308ilI1I.this.f17997OooO00o.remove(this.f18000OooO00o);
            }
        }

        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r4, long j, TimeUnit timeUnit) {
            OooO0OO oooO0OO = new OooO0OO(this, C6308ilI1I.this.OooO00o + timeUnit.toNanos(j), r4);
            C6308ilI1I.this.f17997OooO00o.add(oooO0OO);
            return C9638ill.OooO00o(new OooO00o(oooO0OO));
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public long OooO0O0() {
            return C6308ilI1I.this.OooO00o();
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
        public LlIiLii OooO00o(liii1l r4) {
            OooO0OO oooO0OO = new OooO0OO(this, 0, r4);
            C6308ilI1I.this.f17997OooO00o.add(oooO0OO);
            return C9638ill.OooO00o(new C4942OooO0O0(oooO0OO));
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r9, long j, long j2, TimeUnit timeUnit) {
            return iilIlIL.OooO00o(this, r9, j, j2, timeUnit, this);
        }

        @Override // com.p118pd.sdk.iilIlIL.OooO0O0
        public long OooO00o() {
            return C6308ilI1I.this.OooO00o;
        }
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17345OooO00o() {
        OooO00o(this.OooO00o);
    }

    private void OooO00o(long j) {
        while (!this.f17997OooO00o.isEmpty()) {
            OooO0OO peek = this.f17997OooO00o.peek();
            long j2 = peek.OooO00o;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.OooO00o;
            }
            this.OooO00o = j2;
            this.f17997OooO00o.remove();
            if (!peek.f18001OooO00o.isUnsubscribed()) {
                peek.f18002OooO00o.call();
            }
        }
        this.OooO00o = j;
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LL1LL.OooO00o m17344OooO00o() {
        return new OooO0O0();
    }
}
