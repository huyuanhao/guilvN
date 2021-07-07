package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0o0oo  reason: case insensitive filesystem */
public class C8060oOO0o0oo extends AbstractC8053oOO0o0O<OooO00o> {

    /* renamed from: com.pd.sdk.oOO0o0oo$OooO00o */
    public class OooO00o extends C8054oOO0o0O0 {
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o0;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            super(oo0o000o);
            oo0o000o.OooO00o(4L);
            this.OooO0O0 = oo0o000o.m19622OooO0O0();
            this.OooO0OO = oo0o000o.m19622OooO0O0();
            this.OooO0Oo = oo0o000o.m19622OooO0O0();
            this.OooO0o0 = oo0o000o.OooO0O0();
            oo0o000o.OooO00o(1L);
        }
    }

    public C8060oOO0o0oo(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
    }

    @Override // com.p118pd.sdk.AbstractC8053oOO0o0O
    public OooO00o OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        return new OooO00o(oo0o000o);
    }

    public void OooO00o(C8073oOO0oo ooo0oo) {
        boolean z = false;
        OooO00o oooO00o = (OooO00o) ((AbstractC8053oOO0o0O) this).OooO00o.get(0);
        ooo0oo.OooO00o(1, (oooO00o.OooO0O0 & 1) == 1);
        ooo0oo.OooO00o(2, (oooO00o.OooO0O0 & 2) == 2);
        ooo0oo.OooO00o(3, (oooO00o.OooO0O0 & 4) == 4);
        if ((oooO00o.OooO0O0 & 8) == 8) {
            z = true;
        }
        ooo0oo.OooO00o(4, z);
    }
}
