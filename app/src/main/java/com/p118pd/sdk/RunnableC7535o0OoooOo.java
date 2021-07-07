package com.p118pd.sdk;

import com.p118pd.sdk.C7534o0OoooOO;

/* renamed from: com.pd.sdk.o0OoooOo  reason: case insensitive filesystem */
public class RunnableC7535o0OoooOo implements Runnable {
    public final /* synthetic */ C7534o0OoooOO OooO00o;

    public RunnableC7535o0OoooOo(C7534o0OoooOO o0oooooo) {
        this.OooO00o = o0oooooo;
    }

    public void run() {
        if (C7534o0OoooOO.OooO00o(this.OooO00o) == null) {
            C7534o0OoooOO o0oooooo = this.OooO00o;
            C7534o0OoooOO o0oooooo2 = this.OooO00o;
            o0oooooo.f20403OooO00o = new C7534o0OoooOO.OooO00o(o0oooooo2.f20401OooO00o);
            C7534o0OoooOO.OooO00o(this.OooO00o).setCancelable(C7534o0OoooOO.OooO00o(this.OooO00o));
        }
        try {
            if (!C7534o0OoooOO.OooO00o(this.OooO00o).isShowing()) {
                C7534o0OoooOO.OooO00o(this.OooO00o).show();
                C7534o0OoooOO.OooO00o(this.OooO00o).sendEmptyMessageDelayed(1, 15000);
            }
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
        }
    }
}
