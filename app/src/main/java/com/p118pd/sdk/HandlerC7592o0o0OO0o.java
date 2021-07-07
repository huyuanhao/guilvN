package com.p118pd.sdk;

import android.os.Handler;
import android.os.Message;
import com.beefe.picker.view.LoopView;

/* renamed from: com.pd.sdk.o0o0OO0o  reason: case insensitive filesystem */
public final class HandlerC7592o0o0OO0o extends Handler {
    public static final int OooO00o = 1000;
    public static final int OooO0O0 = 2000;
    public static final int OooO0OO = 3000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LoopView f20425OooO00o;

    public HandlerC7592o0o0OO0o(LoopView loopView) {
        this.f20425OooO00o = loopView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f20425OooO00o.invalidate();
        } else if (i == 2000) {
            this.f20425OooO00o.OooO00o(LoopView.ACTION.FLING);
        } else if (i == 3000) {
            this.f20425OooO00o.OooO0O0();
        }
    }
}
