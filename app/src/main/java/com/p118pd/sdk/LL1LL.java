package com.p118pd.sdk;

import java.util.concurrent.TimeUnit;
import p293rx.internal.schedulers.SchedulerWhen;

/* renamed from: com.pd.sdk.LL1LL */
public abstract class LL1LL {

    /* renamed from: com.pd.sdk.LL1LL$OooO00o */
    public static abstract class OooO00o implements LlIiLii {
        public abstract LlIiLii OooO00o(liii1l v);

        public LlIiLii OooO00o(liii1l r9, long j, long j2, TimeUnit timeUnit) {
            return iilIlIL.OooO00o(this, r9, j, j2, timeUnit, null);
        }

        public abstract LlIiLii OooO00o(liii1l v, long j, TimeUnit timeUnit);

        public long OooO0O0() {
            return System.currentTimeMillis();
        }
    }

    public long OooO00o() {
        return System.currentTimeMillis();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract OooO00o m16172OooO00o();

    public <S extends LL1LL & LlIiLii> S OooO00o(AbstractC9847l1<C9349III<C9349III<C5876LlIl>>, C5876LlIl> r2) {
        return new SchedulerWhen(r2, this);
    }
}
