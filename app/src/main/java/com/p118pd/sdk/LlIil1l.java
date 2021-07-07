package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.LlIil1l */
public abstract class LlIil1l<E> extends I111<E> {
    public static final long OoooOo0 = C11LI1.OooO00o(LlIil1l.class, "consumerIndex");
    public volatile long consumerIndex;

    public LlIil1l(int i) {
        super(i);
    }

    public final long OooO0O0() {
        return this.consumerIndex;
    }

    public final boolean OooO0O0(long j, long j2) {
        return C11LI1.OooO00o.compareAndSwapLong(this, OoooOo0, j, j2);
    }
}
