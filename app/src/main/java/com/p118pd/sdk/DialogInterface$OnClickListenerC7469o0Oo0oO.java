package com.p118pd.sdk;

import android.content.DialogInterface;

/* renamed from: com.pd.sdk.o0Oo0oO  reason: case insensitive filesystem */
public class DialogInterface$OnClickListenerC7469o0Oo0oO implements DialogInterface.OnClickListener {
    public final /* synthetic */ RunnableC7470o0Oo0oO0 OooO00o;

    public DialogInterface$OnClickListenerC7469o0Oo0oO(RunnableC7470o0Oo0oO0 o0oo0oo0) {
        this.OooO00o = o0oo0oo0;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.OooO00o.f20296OooO00o.f20294OooO00o = true;
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOoo, "1");
        this.OooO00o.f20295OooO00o.proceed();
        dialogInterface.dismiss();
    }
}
