package com.p118pd.sdk;

import android.content.DialogInterface;

/* renamed from: com.pd.sdk.o0Oo0oo0  reason: case insensitive filesystem */
public class DialogInterface$OnClickListenerC7473o0Oo0oo0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ RunnableC7470o0Oo0oO0 OooO00o;

    public DialogInterface$OnClickListenerC7473o0Oo0oo0(RunnableC7470o0Oo0oO0 o0oo0oo0) {
        this.OooO00o = o0oo0oo0;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.OooO00o.f20295OooO00o.cancel();
        this.OooO00o.f20296OooO00o.f20294OooO00o = false;
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOooO, "1");
        C7479o0OoO000.OooO00o(C7479o0OoO000.OooO0O0());
        this.OooO00o.OooO00o.finish();
    }
}
