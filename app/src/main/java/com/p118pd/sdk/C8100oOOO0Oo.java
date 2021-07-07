package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOOO0Oo  reason: case insensitive filesystem */
public class C8100oOOO0Oo extends C8096oOOO0O0 {
    public int OooO0O0;

    public C8100oOOO0Oo(AbstractC7917oO0o000O oo0o000o, C8095oOOO00oo oooo00oo) throws IOException {
        super(oo0o000o, oooo00oo);
        this.OooO0O0 = oo0o000o.m19617OooO00o();
        oo0o000o.OooO00o(2L);
    }

    public void OooO00o(C8111oOOO0oo0 oooo0oo0) {
        int i = this.OooO0O0;
        double d = (double) (-65536 & i);
        double d2 = (double) (i & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        oooo0oo0.OooO00o(105, d + (d2 / pow));
    }
}
