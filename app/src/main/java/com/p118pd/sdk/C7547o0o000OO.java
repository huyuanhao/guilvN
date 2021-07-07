package com.p118pd.sdk;

import android.view.animation.Animation;
import com.p118pd.sdk.C7546o0o000O0;

/* renamed from: com.pd.sdk.o0o000OO  reason: case insensitive filesystem */
public class C7547o0o000OO extends C7546o0o000O0.OooO00o {
    public final /* synthetic */ C7532o0OoooO OooO00o;
    public final /* synthetic */ C7546o0o000O0 OooO0O0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7547o0o000OO(C7546o0o000O0 o0o000o0, C7532o0OoooO o0ooooo) {
        super(o0o000o0, null);
        this.OooO0O0 = o0o000o0;
        this.OooO00o = o0ooooo;
    }

    @Override // com.p118pd.sdk.C7546o0o000O0.OooO00o
    public void onAnimationEnd(Animation animation) {
        this.OooO00o.OooO00o();
        this.OooO0O0.OooO0OO = false;
    }
}
