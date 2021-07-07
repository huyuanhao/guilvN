package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0o0oO  reason: case insensitive filesystem */
public class C8059oOO0o0oO extends C8046oOO0Oo0 {
    public int[] OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f21085OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f21086OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public C8059oOO0o0oO(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
        this.OooO0O0 = oo0o000o.m19617OooO00o();
        this.OooO0OO = oo0o000o.m19617OooO00o();
        this.OooO0Oo = oo0o000o.m19617OooO00o();
        oo0o000o.OooO00o(2L);
        this.OooO00o = new int[]{oo0o000o.OooO0OO(), oo0o000o.OooO0OO(), oo0o000o.OooO0OO()};
        this.f21086OooO0O0 = new int[]{oo0o000o.OooO0OO(), oo0o000o.OooO0OO(), oo0o000o.OooO0OO()};
        this.f21085OooO0O0 = oo0o000o.OooO00o((int) oo0o000o.m19625OooO0O0());
    }

    public void OooO00o(C8073oOO0oo ooo0oo) {
        ooo0oo.OooO00o(5, this.OooO0O0);
        int i = this.OooO0OO;
        if (i == 1) {
            ooo0oo.m19648OooO00o(6, "Bold");
        } else if (i == 2) {
            ooo0oo.m19648OooO00o(6, "Italic");
        } else if (i == 4) {
            ooo0oo.m19648OooO00o(6, "Underline");
        } else if (i == 8) {
            ooo0oo.m19648OooO00o(6, "Outline");
        } else if (i == 16) {
            ooo0oo.m19648OooO00o(6, "Shadow");
        } else if (i == 32) {
            ooo0oo.m19648OooO00o(6, "Condense");
        } else if (i == 64) {
            ooo0oo.m19648OooO00o(6, "Extend");
        }
        ooo0oo.OooO00o(7, this.OooO0Oo);
        ooo0oo.OooO00o(8, this.OooO00o);
        ooo0oo.OooO00o(9, this.f21086OooO0O0);
        ooo0oo.m19648OooO00o(10, this.f21085OooO0O0);
    }
}
