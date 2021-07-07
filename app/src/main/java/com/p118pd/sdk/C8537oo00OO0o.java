package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.oo00OO0o  reason: case insensitive filesystem */
public class C8537oo00OO0o {
    public static AbstractC8538oo00OOO OooO00o = C8533oo00OO.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21654OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21655OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21656OooO00o = false;

    private C8540oo00OOOO OooO00o(int i, String str, String str2) {
        C8540oo00OOOO oo00oooo = new C8540oo00OOOO(7, this.f21655OooO00o, i, str);
        oo00oooo.OooO00o(str2);
        return oo00oooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20205OooO00o(int i, String str, String str2) {
        if (OooO00o(i)) {
            C8540oo00OOOO OooO00o2 = OooO00o(i, str, str2);
            OooO00o.mo30728a(OooO00o2.m20206OooO00o() + OooO00o2.OooO0O0(), i, str, str2);
        }
    }

    public void OooO00o(Context context, int i, String str) {
        this.f21654OooO00o = i;
        this.f21655OooO00o = str;
        OooO00o.OooO00o(context, "HiAnalytics");
        this.f21656OooO00o = true;
    }

    public void OooO00o(String str, String str2) {
        C8540oo00OOOO OooO00o2 = OooO00o(4, str, str2);
        OooO00o.mo30728a(OooO00o2.m20206OooO00o() + '\n' + OooO00o2.OooO0O0(), 4, str, str2);
    }

    public boolean OooO00o(int i) {
        return this.f21656OooO00o && i >= this.f21654OooO00o;
    }
}
