package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.l1i丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6455l1i<E> extends I1LliIL<E> {
    public static final long Oooo00o = C11LI1.OooO00o(AbstractC6455l1i.class, "producerIndex");
    public volatile long producerIndex;

    public AbstractC6455l1i(int i) {
        super(i);
    }

    public final long OooO00o() {
        return this.producerIndex;
    }

    @Override // com.p118pd.sdk.AbstractC6724lil1, com.p118pd.sdk.AbstractC6724lil1
    public final void OooO00o(long j) {
        C11LI1.OooO00o.putOrderedLong(this, Oooo00o, j);
    }
}
