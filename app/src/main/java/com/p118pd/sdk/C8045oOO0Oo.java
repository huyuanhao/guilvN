package com.p118pd.sdk;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.pd.sdk.oOO0Oo  reason: case insensitive filesystem */
public class C8045oOO0Oo extends C8046oOO0Oo0 {
    public long OooO;
    public int[] OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f21071OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f21072OooO0OO;
    public long OooO0Oo;
    public long OooO0o;
    public long OooO0o0;
    public long OooO0oO;
    public long OooO0oo;
    public long OooOO0;
    public long OooOO0O;
    public long OooOO0o;

    public C8045oOO0Oo(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
        this.f21071OooO0O0 = oo0o000o.m19626OooO0OO();
        this.f21072OooO0OO = oo0o000o.m19626OooO0OO();
        this.OooO0Oo = oo0o000o.m19626OooO0OO();
        this.OooO0o0 = oo0o000o.m19626OooO0OO();
        this.OooO0O0 = oo0o000o.m19622OooO0O0();
        this.OooO0OO = oo0o000o.m19617OooO00o();
        oo0o000o.OooO00o(10L);
        this.OooO00o = new int[]{oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0(), oo0o000o.m19622OooO0O0()};
        this.OooO0o = oo0o000o.m19626OooO0OO();
        this.OooO0oO = oo0o000o.m19626OooO0OO();
        this.OooO0oo = oo0o000o.m19626OooO0OO();
        this.OooO = oo0o000o.m19626OooO0OO();
        this.OooOO0 = oo0o000o.m19626OooO0OO();
        this.OooOO0O = oo0o000o.m19626OooO0OO();
        this.OooOO0o = oo0o000o.m19626OooO0OO();
    }

    public void OooO00o(oOO0OOOO ooo0oooo) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        long time = instance.getTime().getTime();
        ooo0oooo.OooO00o(256, new Date((this.f21071OooO0O0 * 1000) + time));
        ooo0oooo.OooO00o(257, new Date((this.f21072OooO0OO * 1000) + time));
        long j = this.OooO0o0 / this.OooO0Oo;
        this.OooO0o0 = j;
        ooo0oooo.OooO00o(259, j);
        ooo0oooo.OooO00o(258, this.OooO0Oo);
        int i = this.OooO0O0;
        double d = (double) ((-65536 & i) >> 16);
        double d2 = (double) (i & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        ooo0oooo.OooO00o(260, d + (d2 / pow));
        int i2 = this.OooO0OO;
        double d3 = (double) ((65280 & i2) >> 8);
        double d4 = (double) (i2 & 255);
        double pow2 = Math.pow(2.0d, 2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        ooo0oooo.OooO00o(261, d3 + (d4 / pow2));
        ooo0oooo.OooO00o(264, this.OooO0o);
        ooo0oooo.OooO00o(265, this.OooO0oO);
        ooo0oooo.OooO00o(266, this.OooO0oo);
        ooo0oooo.OooO00o(267, this.OooO);
        ooo0oooo.OooO00o(268, this.OooOO0);
        ooo0oooo.OooO00o(269, this.OooOO0O);
        ooo0oooo.OooO00o(270, this.OooOO0o);
    }
}
