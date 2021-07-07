package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0OOoo  reason: case insensitive filesystem */
public class C8044oOO0OOoo {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21070OooO00o;

    public C8044oOO0OOoo(AbstractC7917oO0o000O oo0o000o) throws IOException {
        this.OooO00o = oo0o000o.m19626OooO0OO();
        this.f21070OooO00o = oo0o000o.OooO00o(4);
        long j = this.OooO00o;
        if (j == 1) {
            this.OooO00o = oo0o000o.m19615OooO00o();
        } else if (j == 0) {
            this.OooO00o = -1;
        }
    }

    public C8044oOO0OOoo(C8044oOO0OOoo ooo0oooo) {
        this.OooO00o = ooo0oooo.OooO00o;
        this.f21070OooO00o = ooo0oooo.f21070OooO00o;
    }
}
