package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0OoO0  reason: case insensitive filesystem */
public class C8050oOO0OoO0 extends AbstractC8053oOO0o0O<OooO00o> {

    /* renamed from: com.pd.sdk.oOO0OoO0$OooO00o */
    public class OooO00o extends C8054oOO0o0O0 {
        public long OooO0O0;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            super(oo0o000o);
            this.OooO0O0 = oo0o000o.m19626OooO0OO();
        }
    }

    public C8050oOO0OoO0(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
    }

    public void OooO00o(C8061oOO0oO ooo0oo) {
    }

    @Override // com.p118pd.sdk.AbstractC8053oOO0o0O
    public OooO00o OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        return new OooO00o(oo0o000o);
    }
}
