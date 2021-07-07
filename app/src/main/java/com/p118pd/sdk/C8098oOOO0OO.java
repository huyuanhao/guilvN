package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOOO0OO  reason: case insensitive filesystem */
public class C8098oOOO0OO extends C8096oOOO0O0 {
    public long OooO0O0;
    public long OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f21110OooO0OO;
    public long OooO0Oo;
    public long OooO0o0;

    public C8098oOOO0OO(AbstractC7917oO0o000O oo0o000o, C8095oOOO00oo oooo00oo) throws IOException {
        super(oo0o000o, oooo00oo);
        if (((C8096oOOO0O0) this).OooO00o == 1) {
            this.OooO0O0 = oo0o000o.m19615OooO00o();
            this.OooO0OO = oo0o000o.m19615OooO00o();
            this.OooO0Oo = (long) oo0o000o.m19622OooO0O0();
            this.OooO0o0 = oo0o000o.m19615OooO00o();
        } else {
            this.OooO0O0 = oo0o000o.m19626OooO0OO();
            this.OooO0OO = oo0o000o.m19626OooO0OO();
            this.OooO0Oo = oo0o000o.m19626OooO0OO();
            this.OooO0o0 = oo0o000o.m19626OooO0OO();
        }
        short OooO00o = oo0o000o.m19617OooO00o();
        this.f21110OooO0OO = new String(new char[]{(char) (((OooO00o & 31744) >> 10) + 96), (char) (((OooO00o & 992) >> 5) + 96), (char) ((OooO00o & 31) + 96)});
        C8093oOOO00o0.OooO0O0 = Long.valueOf(this.OooO0O0);
        C8093oOOO00o0.OooO0OO = Long.valueOf(this.OooO0OO);
        C8093oOOO00o0.OooO00o = Long.valueOf(this.OooO0Oo);
        C8093oOOO00o0.OooO0Oo = Long.valueOf(this.OooO0o0);
        C8093oOOO00o0.OooO0o = this.f21110OooO0OO;
    }
}
