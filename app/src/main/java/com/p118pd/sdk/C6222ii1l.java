package com.p118pd.sdk;

import p293rx.exceptions.MissingBackpressureException;

/* renamed from: com.pd.sdk.ii1l  reason: case insensitive filesystem */
public final class C6222ii1l {
    public static final AbstractC6223OooO0Oo OooO00o;
    public static final AbstractC6223OooO0Oo OooO0O0;
    public static final AbstractC6223OooO0Oo OooO0OO = OooO0O0.OooO00o;
    public static final AbstractC6223OooO0Oo OooO0Oo = OooO00o.OooO00o;

    /* renamed from: com.pd.sdk.ii1l$OooO00o */
    public static final class OooO00o implements AbstractC6223OooO0Oo {
        public static final OooO00o OooO00o = new OooO00o();

        @Override // com.p118pd.sdk.C6222ii1l.AbstractC6223OooO0Oo
        public boolean OooO00o() {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.ii1l$OooO0O0 */
    public static final class OooO0O0 implements AbstractC6223OooO0Oo {
        public static final OooO0O0 OooO00o = new OooO0O0();

        @Override // com.p118pd.sdk.C6222ii1l.AbstractC6223OooO0Oo
        public boolean OooO00o() {
            return true;
        }
    }

    /* renamed from: com.pd.sdk.ii1l$OooO0OO */
    public static final class OooO0OO implements AbstractC6223OooO0Oo {
        public static final OooO0OO OooO00o = new OooO0OO();

        @Override // com.p118pd.sdk.C6222ii1l.AbstractC6223OooO0Oo
        public boolean OooO00o() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* renamed from: com.pd.sdk.ii1l$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC6223OooO0Oo {
        boolean OooO00o() throws MissingBackpressureException;
    }

    static {
        OooO0OO oooO0OO = OooO0OO.OooO00o;
        OooO00o = oooO0OO;
        OooO0O0 = oooO0OO;
    }

    public C6222ii1l() {
        throw new IllegalStateException("No instances!");
    }
}
