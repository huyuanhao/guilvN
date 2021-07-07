package com.p118pd.sdk;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.p118pd.sdk.AbstractC7837oO00ooOo;

/* renamed from: com.pd.sdk.oOo000o0  reason: case insensitive filesystem */
public class C8281oOo000o0<R> implements AbstractC7837oO00ooOo<R> {
    public final OooO00o OooO00o;

    /* renamed from: com.pd.sdk.oOo000o0$OooO00o */
    public interface OooO00o {
        Animation OooO00o(Context context);
    }

    public C8281oOo000o0(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7837oO00ooOo
    public boolean OooO00o(R r, AbstractC7837oO00ooOo.OooO00o oooO00o) {
        View OooO00o2 = oooO00o.m19514OooO00o();
        if (OooO00o2 == null) {
            return false;
        }
        OooO00o2.clearAnimation();
        OooO00o2.startAnimation(this.OooO00o.OooO00o(OooO00o2.getContext()));
        return false;
    }
}
