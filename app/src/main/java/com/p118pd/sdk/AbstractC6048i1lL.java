package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.i1lL丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6048i1lL<E> extends L1l111<E> {
    public static final long OoooOOo = C11LI1.OooO00o(AbstractC6048i1lL.class, "consumerIndex");
    public volatile long consumerIndex;

    public AbstractC6048i1lL(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC6724lil1
    public final boolean OooO00o(long j, long j2) {
        return C11LI1.OooO00o.compareAndSwapLong(this, OoooOOo, j, j2);
    }

    public final long OooO0O0() {
        return this.consumerIndex;
    }
}
