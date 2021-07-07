package com.p118pd.sdk;

import android.view.animation.Animation;
import com.p118pd.sdk.C7546o0o000O0;

/* renamed from: com.pd.sdk.o0o000Oo  reason: case insensitive filesystem */
public class C7548o0o000Oo extends C7546o0o000O0.OooO00o {
    public final /* synthetic */ C7532o0OoooO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ String f20409OooO00o;
    public final /* synthetic */ C7546o0o000O0 OooO0O0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7548o0o000Oo(C7546o0o000O0 o0o000o0, C7532o0OoooO o0ooooo, String str) {
        super(o0o000o0, null);
        this.OooO0O0 = o0o000o0;
        this.OooO00o = o0ooooo;
        this.f20409OooO00o = str;
    }

    @Override // com.p118pd.sdk.C7546o0o000O0.OooO00o
    public void onAnimationEnd(Animation animation) {
        this.OooO0O0.removeView(this.OooO00o);
        this.OooO0O0.OooO00o.OooO00o(this.f20409OooO00o);
        this.OooO0O0.OooO0OO = false;
    }
}
