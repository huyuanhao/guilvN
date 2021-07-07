package com.p118pd.sdk;

import android.os.Bundle;

/* renamed from: com.pd.sdk.o0o0O0oo  reason: case insensitive filesystem */
public class C7588o0o0O0oo {
    public static final String OooO00o = "install_referrer";
    public static final String OooO0O0 = "referrer_click_timestamp_seconds";
    public static final String OooO0OO = "install_begin_timestamp_seconds";
    public static final String OooO0Oo = "google_play_instant";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bundle f20424OooO00o;

    public C7588o0o0O0oo(Bundle bundle) {
        this.f20424OooO00o = bundle;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19226OooO00o() {
        return this.f20424OooO00o.getBoolean(OooO0Oo);
    }

    public long OooO0O0() {
        return this.f20424OooO00o.getLong(OooO0O0);
    }

    public long OooO00o() {
        return this.f20424OooO00o.getLong(OooO0OO);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19225OooO00o() {
        return this.f20424OooO00o.getString(OooO00o);
    }
}
