package com.p118pd.sdk;

import java.io.IOException;
import okhttp3.internal.p288ws.WebSocketProtocol;

/* renamed from: com.pd.sdk.oOO0oO0  reason: case insensitive filesystem */
public class C8062oOO0oO0 extends AbstractC8053oOO0o0O<OooO00o> {

    /* renamed from: com.pd.sdk.oOO0oO0$OooO00o */
    public class OooO00o extends C8054oOO0o0O0 {
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f21087OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f21088OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public long f21089OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public String f21090OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public long f21091OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public long f21092OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public long f21093OooO0o0;
        public int OooO0oO;
        public int OooO0oo;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            super(oo0o000o);
            this.OooO0O0 = oo0o000o.OooO0OO();
            this.OooO0OO = oo0o000o.OooO0OO();
            this.f21088OooO0O0 = oo0o000o.OooO00o(4);
            this.f21087OooO0O0 = oo0o000o.m19626OooO0OO();
            this.f21089OooO0OO = oo0o000o.m19626OooO0OO();
            this.OooO0Oo = oo0o000o.OooO0OO();
            this.OooO0o0 = oo0o000o.OooO0OO();
            this.f21091OooO0Oo = oo0o000o.m19626OooO0OO();
            this.f21093OooO0o0 = oo0o000o.m19626OooO0OO();
            this.f21092OooO0o = oo0o000o.m19626OooO0OO();
            this.OooO0o = oo0o000o.OooO0OO();
            this.f21090OooO0OO = oo0o000o.OooO00o((int) oo0o000o.m19625OooO0O0());
            this.OooO0oO = oo0o000o.OooO0OO();
            this.OooO0oo = oo0o000o.m19617OooO00o();
        }
    }

    public C8062oOO0oO0(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
    }

    @Override // com.p118pd.sdk.AbstractC8053oOO0o0O
    public OooO00o OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        return new OooO00o(oo0o000o);
    }

    public void OooO00o(C8080oOO0ooOo ooo0oooo) {
        OooO00o oooO00o = (OooO00o) ((AbstractC8053oOO0o0O) this).OooO00o.get(0);
        oOO0OOO.OooO00o(1, oooO00o.f21088OooO0O0, ooo0oooo);
        oOO0OOO.OooO00o(10, ((C8054oOO0o0O0) oooO00o).f21078OooO00o, ooo0oooo);
        ooo0oooo.OooO00o(2, oooO00o.f21087OooO0O0);
        ooo0oooo.OooO00o(3, oooO00o.f21089OooO0OO);
        ooo0oooo.OooO00o(4, oooO00o.OooO0Oo);
        ooo0oooo.OooO00o(5, oooO00o.OooO0o0);
        ooo0oooo.m19648OooO00o(8, oooO00o.f21090OooO0OO.trim());
        ooo0oooo.OooO00o(9, oooO00o.OooO0oO);
        ooo0oooo.OooO00o(13, oooO00o.OooO0oo);
        long j = oooO00o.f21091OooO0Oo;
        double d = (double) ((j & -65536) >> 16);
        double d2 = (double) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        ooo0oooo.OooO00o(6, d + (d2 / pow));
        long j2 = oooO00o.f21093OooO0o0;
        double d3 = (double) ((-65536 & j2) >> 16);
        double d4 = (double) (j2 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        double pow2 = Math.pow(2.0d, 4.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        ooo0oooo.OooO00o(7, d3 + (d4 / pow2));
    }
}
