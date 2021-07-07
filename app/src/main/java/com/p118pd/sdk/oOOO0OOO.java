package com.p118pd.sdk;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.pd.sdk.oOOO0OOO */
public class oOOO0OOO extends C8096oOOO0O0 {
    public int[] OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f21113OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f21114OooO0OO;
    public long OooO0Oo;
    public long OooO0o;
    public long OooO0o0;

    public oOOO0OOO(AbstractC7917oO0o000O oo0o000o, C8095oOOO00oo oooo00oo) throws IOException {
        super(oo0o000o, oooo00oo);
        if (((C8096oOOO0O0) this).OooO00o == 1) {
            this.f21113OooO0O0 = oo0o000o.m19615OooO00o();
            this.f21114OooO0OO = oo0o000o.m19615OooO00o();
            this.OooO0Oo = oo0o000o.m19626OooO0OO();
            this.OooO0o0 = oo0o000o.m19615OooO00o();
        } else {
            this.f21113OooO0O0 = oo0o000o.m19626OooO0OO();
            this.f21114OooO0OO = oo0o000o.m19626OooO0OO();
            this.OooO0Oo = oo0o000o.m19626OooO0OO();
            this.OooO0o0 = oo0o000o.m19626OooO0OO();
        }
        this.OooO0O0 = oo0o000o.m19622OooO0O0();
        this.OooO0OO = oo0o000o.m19617OooO00o();
        oo0o000o.OooO00o(2L);
        oo0o000o.OooO00o(8L);
        this.OooO00o = new int[]{oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0()};
        oo0o000o.OooO00o(24L);
        this.OooO0o = oo0o000o.m19626OooO0OO();
    }

    public void OooO00o(C8091oOOO00Oo oooo00oo) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        long time = instance.getTime().getTime();
        oooo00oo.OooO00o(256, new Date((this.f21113OooO0O0 * 1000) + time));
        oooo00oo.OooO00o(257, new Date((this.f21114OooO0OO * 1000) + time));
        long j = this.OooO0o0 / this.OooO0Oo;
        this.OooO0o0 = j;
        oooo00oo.OooO00o(259, j);
        oooo00oo.OooO00o(258, this.OooO0Oo);
        oooo00oo.OooO00o(271, this.OooO00o);
        int i = this.OooO0O0;
        double d = (double) ((-65536 & i) >> 16);
        double d2 = (double) (i & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        oooo00oo.OooO00o(260, d + (d2 / pow));
        int i2 = this.OooO0OO;
        double d3 = (double) ((65280 & i2) >> 8);
        double d4 = (double) (i2 & 255);
        double pow2 = Math.pow(2.0d, 2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        oooo00oo.OooO00o(261, d3 + (d4 / pow2));
        oooo00oo.OooO00o(270, this.OooO0o);
    }
}
