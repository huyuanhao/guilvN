package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.li1丨ILLi  reason: invalid class name */
public abstract class li1ILLi<E> extends L1iilll<E> {
    public static final long Oooo0 = C11LI1.OooO00o(li1ILLi.class, "producerIndex");
    public volatile long producerIndex;

    public li1ILLi(int i) {
        super(i);
    }

    public final long OooO00o() {
        return this.producerIndex;
    }

    @Override // com.p118pd.sdk.AbstractC6724lil1
    public final boolean OooO00o(long j, long j2) {
        return C11LI1.OooO00o.compareAndSwapLong(this, Oooo0, j, j2);
    }
}
