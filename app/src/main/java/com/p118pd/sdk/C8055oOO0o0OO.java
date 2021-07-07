package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0o0OO  reason: case insensitive filesystem */
public class C8055oOO0o0OO extends C8046oOO0Oo0 {
    public int OooO0O0;

    public C8055oOO0o0OO(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
        this.OooO0O0 = oo0o000o.m19617OooO00o();
        oo0o000o.OooO00o(2L);
    }

    public void OooO00o(C8068oOO0oOOO ooo0oooo) {
        int i = this.OooO0O0;
        double d = (double) (-65536 & i);
        double d2 = (double) (i & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        ooo0oooo.OooO00o(773, d + (d2 / pow));
    }
}
