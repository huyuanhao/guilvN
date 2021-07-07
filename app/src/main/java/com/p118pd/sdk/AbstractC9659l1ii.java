package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨l1ii  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9659l1ii<E> extends AbstractC6724lil1<E> {
    public static final Integer OooO00o = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int o0ooOoO;

    public AbstractC9659l1ii(int i) {
        super(i);
        this.o0ooOoO = Math.min(i / 4, OooO00o.intValue());
    }
}
