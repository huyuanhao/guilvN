package com.p118pd.sdk;

import com.jinhui365.util.util.gson.GsonUtil;

/* renamed from: com.pd.sdk.oo0oOO00  reason: case insensitive filesystem */
public class C8731oo0oOO00 {
    public static C8731oo0oOO00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21904OooO00o = false;
    public boolean OooO0O0 = false;

    public static C8731oo0oOO00 OooO00o() {
        if (OooO00o == null) {
            synchronized (C8731oo0oOO00.class) {
                OooO00o = new C8731oo0oOO00();
            }
        }
        return OooO00o;
    }

    public void OooO0O0(boolean z) {
        this.OooO0O0 = z;
    }

    public boolean OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO00o(boolean z) {
        this.f21904OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20347OooO00o() {
        return this.f21904OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20346OooO00o() {
        if (OooO00o().m20347OooO00o()) {
            OooO00o().OooO00o(false);
            C8654oo0Oo00.OooO00o().OooO00o("AppConfigUpdateEvent", C8724oo0o0ooO.m20344OooO00o(GsonUtil.toJson(C8706oo0o0OO0.OooO00o().OooO0OO())));
        }
    }
}
