package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.o0OoO0oo  reason: case insensitive filesystem */
public class RunnableC7487o0OoO0oo implements Runnable {
    public final /* synthetic */ Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7486o0OoO0oO f20325OooO00o;

    public RunnableC7487o0OoO0oo(C7486o0OoO0oO o0ooo0oo, Context context) {
        this.f20325OooO00o = o0ooo0oo;
        this.OooO00o = context;
    }

    public void run() {
        try {
            C7495o0OoOOo OooO00o2 = new C7498o0OoOo().OooO00o(this.OooO00o);
            if (OooO00o2 != null) {
                this.f20325OooO00o.OooO0O0(OooO00o2.OooO0O0());
                this.f20325OooO00o.OooO0O0();
            }
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
        }
    }
}
