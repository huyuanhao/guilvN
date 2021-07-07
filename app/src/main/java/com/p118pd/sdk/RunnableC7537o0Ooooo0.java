package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0Ooooo0  reason: case insensitive filesystem */
public class RunnableC7537o0Ooooo0 implements Runnable {
    public final /* synthetic */ C7534o0OoooOO OooO00o;

    public RunnableC7537o0Ooooo0(C7534o0OoooOO o0oooooo) {
        this.OooO00o = o0oooooo;
    }

    public void run() {
        if (C7534o0OoooOO.OooO00o(this.OooO00o) != null && C7534o0OoooOO.OooO00o(this.OooO00o).isShowing()) {
            try {
                C7534o0OoooOO.OooO00o(this.OooO00o).removeMessages(1);
                C7534o0OoooOO.OooO00o(this.OooO00o).dismiss();
            } catch (Exception e) {
                C7620o0oOOOoo.m19257OooO00o((Throwable) e);
            }
        }
    }
}
