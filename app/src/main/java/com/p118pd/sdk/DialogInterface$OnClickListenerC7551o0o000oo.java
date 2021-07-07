package com.p118pd.sdk;

import android.content.DialogInterface;

/* renamed from: com.pd.sdk.o0o000oo  reason: case insensitive filesystem */
public class DialogInterface$OnClickListenerC7551o0o000oo implements DialogInterface.OnClickListener {
    public final /* synthetic */ RunnableC7549o0o000o0 OooO00o;

    public DialogInterface$OnClickListenerC7551o0o000oo(RunnableC7549o0o000o0 o0o000o0) {
        this.OooO00o = o0o000o0;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.OooO00o.OooO00o.cancel();
        this.OooO00o.f20410OooO00o.OooO0Oo = false;
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOooO, "2");
        C7479o0OoO000.OooO00o(C7479o0OoO000.OooO0O0());
        ((AbstractC7611o0o0o00O) this.OooO00o.f20410OooO00o).OooO00o.finish();
    }
}
