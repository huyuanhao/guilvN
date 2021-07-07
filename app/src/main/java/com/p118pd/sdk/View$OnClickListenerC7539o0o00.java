package com.p118pd.sdk;

import android.view.View;
import com.p118pd.sdk.C7532o0OoooO;

/* renamed from: com.pd.sdk.o0o00  reason: case insensitive filesystem */
public class View$OnClickListenerC7539o0o00 implements View.OnClickListener {
    public final /* synthetic */ C7532o0OoooO OooO00o;

    public View$OnClickListenerC7539o0o00(C7532o0OoooO o0ooooo) {
        this.OooO00o = o0ooooo;
    }

    public void onClick(View view) {
        C7532o0OoooO.OooO0OO OooO00o2 = C7532o0OoooO.OooO00o(this.OooO00o);
        if (OooO00o2 != null) {
            view.setEnabled(false);
            C7532o0OoooO.OooO00o().postDelayed(new RunnableC7554o0o00O00(this, view), 256);
            if (view == C7532o0OoooO.OooO00o(this.OooO00o)) {
                OooO00o2.OooO00o(this.OooO00o);
            } else if (view == C7532o0OoooO.OooO0O0(this.OooO00o)) {
                OooO00o2.OooO0O0(this.OooO00o);
            }
        }
    }
}
