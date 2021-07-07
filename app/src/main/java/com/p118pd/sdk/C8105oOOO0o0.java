package com.p118pd.sdk;

import java.io.IOException;
import okhttp3.internal.p288ws.WebSocketProtocol;

/* renamed from: com.pd.sdk.oOOO0o0  reason: case insensitive filesystem */
public class C8105oOOO0o0 extends C8099oOOO0OOo {
    public int OooO;
    public int OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public long f21119OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public String f21120OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public long f21121OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public String f21122OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;

    public C8105oOOO0o0(AbstractC7917oO0o000O oo0o000o, C8095oOOO00oo oooo00oo) throws IOException {
        super(oo0o000o, oooo00oo);
        this.OooO0OO = oo0o000o.m19617OooO00o();
        this.OooO0Oo = oo0o000o.m19617OooO00o();
        this.f21120OooO0Oo = oo0o000o.OooO00o(4);
        this.OooO0o0 = oo0o000o.m19622OooO0O0();
        this.OooO0o = oo0o000o.m19622OooO0O0();
        this.OooO0oO = oo0o000o.OooO0OO();
        this.OooO0oo = oo0o000o.OooO0OO();
        this.f21119OooO0Oo = oo0o000o.m19626OooO0OO();
        this.f21121OooO0o0 = oo0o000o.m19626OooO0OO();
        oo0o000o.OooO00o(4L);
        this.OooO = oo0o000o.OooO0OO();
        this.f21122OooO0o0 = oo0o000o.OooO00o(32);
        this.OooOO0 = oo0o000o.OooO0OO();
        oo0o000o.OooO00o(2L);
    }

    public void OooO00o(C8161oOOOoo00 oooooo00) {
        oooooo00.OooO00o(104, this.OooO0oO);
        oooooo00.OooO00o(105, this.OooO0oo);
        oooooo00.m19648OooO00o(110, this.f21122OooO0o0.trim());
        oooooo00.OooO00o(109, this.OooOO0);
        long j = this.f21119OooO0Oo;
        double d = (double) ((j & -65536) >> 16);
        double d2 = (double) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        oooooo00.OooO00o(106, d + (d2 / pow));
        long j2 = this.f21121OooO0o0;
        double d3 = (double) ((-65536 & j2) >> 16);
        double d4 = (double) (j2 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        double pow2 = Math.pow(2.0d, 4.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        oooooo00.OooO00o(107, d3 + (d4 / pow2));
    }
}
