package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.pd.sdk.o0Ooooo  reason: case insensitive filesystem */
public class HandlerC7536o0Ooooo extends Handler {
    public final /* synthetic */ C7534o0OoooOO OooO00o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC7536o0Ooooo(C7534o0OoooOO o0oooooo, Looper looper) {
        super(looper);
        this.OooO00o = o0oooooo;
    }

    public void dispatchMessage(Message message) {
        this.OooO00o.OooO0O0();
    }
}
