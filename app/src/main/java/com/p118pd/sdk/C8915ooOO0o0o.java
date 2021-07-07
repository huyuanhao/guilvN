package com.p118pd.sdk;

import com.rxhui.android_log_sdk.LogLevel;

/* renamed from: com.pd.sdk.ooOO0o0o  reason: case insensitive filesystem */
public class C8915ooOO0o0o {
    public static C8915ooOO0o0o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LogLevel f22147OooO00o = LogLevel.info;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22148OooO00o = true;
    public boolean OooO0O0 = true;
    public boolean OooO0OO = true;
    public boolean OooO0Oo = true;

    public static synchronized C8915ooOO0o0o OooO00o() {
        C8915ooOO0o0o oooo0o0o;
        synchronized (C8915ooOO0o0o.class) {
            if (OooO00o == null) {
                OooO00o = new C8915ooOO0o0o();
            }
            oooo0o0o = OooO00o;
        }
        return oooo0o0o;
    }

    public boolean OooO0O0() {
        return this.OooO0OO;
    }

    public boolean OooO0OO() {
        return this.OooO0O0;
    }

    public boolean OooO0Oo() {
        return this.OooO0Oo;
    }

    public void OooO0O0(boolean z) {
        this.OooO0OO = z;
    }

    public void OooO0OO(boolean z) {
        this.OooO0O0 = z;
    }

    public void OooO0Oo(boolean z) {
        this.OooO0Oo = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LogLevel m20564OooO00o() {
        return this.f22147OooO00o;
    }

    public void OooO00o(LogLevel logLevel) {
        this.f22147OooO00o = logLevel;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20565OooO00o() {
        return this.f22148OooO00o;
    }

    public void OooO00o(boolean z) {
        this.f22148OooO00o = z;
    }
}
