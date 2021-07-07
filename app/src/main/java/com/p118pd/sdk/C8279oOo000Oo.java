package com.p118pd.sdk;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.p118pd.sdk.AbstractC7837oO00ooOo;

/* renamed from: com.pd.sdk.oOo000Oo  reason: case insensitive filesystem */
public class C8279oOo000Oo implements AbstractC7837oO00ooOo<Drawable> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f21369OooO00o;

    public C8279oOo000Oo(int i, boolean z) {
        this.OooO00o = i;
        this.f21369OooO00o = z;
    }

    public boolean OooO00o(Drawable drawable, AbstractC7837oO00ooOo.OooO00o oooO00o) {
        Drawable OooO00o2 = oooO00o.OooO00o();
        if (OooO00o2 == null) {
            OooO00o2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{OooO00o2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f21369OooO00o);
        transitionDrawable.startTransition(this.OooO00o);
        oooO00o.OooO00o(transitionDrawable);
        return true;
    }
}
