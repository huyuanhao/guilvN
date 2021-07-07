package com.p118pd.sdk;

import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOOOOo0O */
public class oOOOOo0O {
    public final String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<C8119oOOOO0o> f21128OooO00o;

    public oOOOOo0O() {
        this("");
    }

    public void OooO00o(C8119oOOOO0o ooooo0o) {
        this.f21128OooO00o.add(ooooo0o);
    }

    public oOOOOo0O(String str) {
        this.f21128OooO00o = new ArrayList<>();
        this.OooO00o = str;
    }

    public int OooO00o() {
        return this.f21128OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterable<C8119oOOOO0o> m19783OooO00o() {
        return this.f21128OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19784OooO00o() {
        return this.OooO00o;
    }
}
