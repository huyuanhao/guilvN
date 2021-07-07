package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0o0Oo  reason: case insensitive filesystem */
public class C8056oOO0o0Oo extends AbstractC8053oOO0o0O<OooO00o> {

    /* renamed from: com.pd.sdk.oOO0o0Oo$OooO00o */
    public class OooO00o extends C8054oOO0o0O0 {
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f21079OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o;
        public int OooO0o0;
        public int OooO0oO;
        public int OooO0oo;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            super(oo0o000o);
            this.OooO0O0 = oo0o000o.OooO0OO();
            this.OooO0OO = oo0o000o.OooO0OO();
            this.OooO0Oo = oo0o000o.m19622OooO0O0();
            this.OooO0o0 = oo0o000o.OooO0OO();
            this.OooO0o = oo0o000o.OooO0OO();
            this.OooO0oO = oo0o000o.OooO0OO();
            this.OooO0oo = oo0o000o.OooO0OO();
            this.f21079OooO0O0 = oo0o000o.m19626OooO0OO();
        }
    }

    public C8056oOO0o0Oo(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
    }

    @Override // com.p118pd.sdk.AbstractC8053oOO0o0O
    public OooO00o OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        return new OooO00o(oo0o000o);
    }

    public void OooO00o(C8068oOO0oOOO ooo0oooo) {
        OooO00o oooO00o = (OooO00o) ((AbstractC8053oOO0o0O) this).OooO00o.get(0);
        ooo0oooo.m19648OooO00o(769, oOO0OOO.OooO00o(769, ((C8054oOO0o0O0) oooO00o).f21078OooO00o));
        ooo0oooo.OooO00o(770, oooO00o.OooO0o0);
        ooo0oooo.OooO00o(771, oooO00o.OooO0o);
    }
}
