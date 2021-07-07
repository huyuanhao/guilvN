package com.p118pd.sdk;

import android.view.View;

/* renamed from: com.pd.sdk.o0o00O00  reason: case insensitive filesystem */
public class RunnableC7554o0o00O00 implements Runnable {
    public final /* synthetic */ View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ View$OnClickListenerC7539o0o00 f20412OooO00o;

    public RunnableC7554o0o00O00(View$OnClickListenerC7539o0o00 o0o00, View view) {
        this.f20412OooO00o = o0o00;
        this.OooO00o = view;
    }

    public void run() {
        this.OooO00o.setEnabled(true);
    }
}
