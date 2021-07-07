package com.p118pd.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOO0o0o  reason: case insensitive filesystem */
public class C8057oOO0o0o extends C8046oOO0Oo0 {
    public ArrayList<OooO00o> OooO00o = new ArrayList<>();
    public long OooO0O0;
    public long OooO0OO;
    public long OooO0Oo;

    /* renamed from: com.pd.sdk.oOO0o0o$OooO00o */
    public class OooO00o {
        public long OooO00o;
        public long OooO0O0;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            this.OooO00o = oo0o000o.m19626OooO0OO();
            this.OooO0O0 = oo0o000o.m19626OooO0OO();
        }
    }

    public C8057oOO0o0o(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
        this.OooO0O0 = oo0o000o.m19626OooO0OO();
        for (int i = 0; ((long) i) < this.OooO0O0; i++) {
            this.OooO00o.add(new OooO00o(oo0o000o));
        }
        this.OooO0OO = oo0o000o.m19626OooO0OO();
        this.OooO0Oo = oo0o000o.m19626OooO0OO();
    }

    public void OooO00o(C8080oOO0ooOo ooo0oooo) {
        ooo0oooo.OooO00o(14, ((float) C8041oOO0OOOo.OooO00o.longValue()) / ((float) this.OooO0Oo));
    }
}
