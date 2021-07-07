package com.p118pd.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOOO0OoO  reason: case insensitive filesystem */
public class C8102oOOO0OoO extends C8096oOOO0O0 {
    public ArrayList<OooO00o> OooO00o = new ArrayList<>();
    public long OooO0O0;

    /* renamed from: com.pd.sdk.oOOO0OoO$OooO00o */
    public class OooO00o {
        public long OooO00o;
        public long OooO0O0;

        public OooO00o(long j, long j2) {
            this.OooO00o = j;
            this.OooO0O0 = j2;
        }
    }

    public C8102oOOO0OoO(AbstractC7917oO0o000O oo0o000o, C8095oOOO00oo oooo00oo) throws IOException {
        super(oo0o000o, oooo00oo);
        this.OooO0O0 = oo0o000o.m19626OooO0OO();
        for (int i = 0; ((long) i) < this.OooO0O0; i++) {
            this.OooO00o.add(new OooO00o(oo0o000o.m19626OooO0OO(), oo0o000o.m19626OooO0OO()));
        }
    }

    public void OooO00o(C8161oOOOoo00 oooooo00) {
        oooooo00.OooO00o(114, ((float) C8093oOOO00o0.OooO00o.longValue()) / ((float) this.OooO00o.get(0).OooO0O0));
    }

    public void OooO00o(C8111oOOO0oo0 oooo0oo0) {
        oooo0oo0.OooO00o(104, (double) C8093oOOO00o0.OooO00o.longValue());
    }
}
