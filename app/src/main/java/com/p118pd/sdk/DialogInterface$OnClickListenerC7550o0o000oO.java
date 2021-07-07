package com.p118pd.sdk;

import android.content.DialogInterface;

/* renamed from: com.pd.sdk.o0o000oO  reason: case insensitive filesystem */
public class DialogInterface$OnClickListenerC7550o0o000oO implements DialogInterface.OnClickListener {
    public final /* synthetic */ RunnableC7549o0o000o0 OooO00o;

    public DialogInterface$OnClickListenerC7550o0o000oO(RunnableC7549o0o000o0 o0o000o0) {
        this.OooO00o = o0o000o0;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.OooO00o.f20410OooO00o.OooO0Oo = true;
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOoo, "2");
        this.OooO00o.OooO00o.proceed();
        dialogInterface.dismiss();
    }
}
