package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.iI丨I  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6136iII<E> extends AbstractC6724lil1<E> {
    public static final long OooOOoo = ((long) (C11LI1.OooO00o.arrayBaseOffset(long[].class) + (32 << (o0ooOoO - AbstractC6724lil1.o00oO0O))));
    public static final int o0ooOoO = (AbstractC6724lil1.o00oO0O + 3);
    public final long[] OooO00o;

    static {
        if (8 == C11LI1.OooO00o.arrayIndexScale(long[].class)) {
            return;
        }
        throw new IllegalStateException("Unexpected long[] element size");
    }

    public AbstractC6136iII(int i) {
        super(i);
        int i2 = (int) (this.OooOOo0 + 1);
        this.OooO00o = new long[((i2 << AbstractC6724lil1.o00oO0O) + 64)];
        for (long j = 0; j < ((long) i2); j++) {
            OooO00o(this.OooO00o, OooO0O0(j), j);
        }
    }

    public final void OooO00o(long[] jArr, long j, long j2) {
        C11LI1.OooO00o.putOrderedLong(jArr, j, j2);
    }

    @Override // com.p118pd.sdk.AbstractC6724lil1
    public final long OooO0O0(long j) {
        return OooOOoo + ((j & this.OooOOo0) << o0ooOoO);
    }

    public final long OooO00o(long[] jArr, long j) {
        return C11LI1.OooO00o.getLongVolatile(jArr, j);
    }
}
