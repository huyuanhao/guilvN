package com.p118pd.sdk;

import com.umeng.commonsdk.statistics.idtracking.C3692t;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOO00oo  reason: case insensitive filesystem */
public class C8095oOOO00oo {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21103OooO00o;
    public String OooO0O0;

    public C8095oOOO00oo(AbstractC7917oO0o000O oo0o000o) throws IOException {
        this.OooO00o = oo0o000o.m19626OooO0OO();
        this.f21103OooO00o = oo0o000o.OooO00o(4);
        long j = this.OooO00o;
        if (j == 1) {
            this.OooO00o = oo0o000o.m19615OooO00o();
        } else if (j == 0) {
            this.OooO00o = -1;
        }
        if (this.f21103OooO00o.equals(C3692t.f9678a)) {
            this.OooO0O0 = oo0o000o.OooO00o(16);
        }
    }

    public C8095oOOO00oo(C8095oOOO00oo oooo00oo) {
        this.OooO00o = oooo00oo.OooO00o;
        this.f21103OooO00o = oooo00oo.f21103OooO00o;
        this.OooO0O0 = oooo00oo.OooO0O0;
    }
}
