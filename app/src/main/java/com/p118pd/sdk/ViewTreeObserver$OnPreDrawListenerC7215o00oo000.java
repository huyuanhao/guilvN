package com.p118pd.sdk;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.pd.sdk.o00oo000  reason: case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC7215o00oo000 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewTreeObserver f19719OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19720OooO00o;

    public ViewTreeObserver$OnPreDrawListenerC7215o00oo000(View view, Runnable runnable) {
        this.OooO00o = view;
        this.f19719OooO00o = view.getViewTreeObserver();
        this.f19720OooO00o = runnable;
    }

    public static ViewTreeObserver$OnPreDrawListenerC7215o00oo000 OooO00o(View view, Runnable runnable) {
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000 o00oo000 = new ViewTreeObserver$OnPreDrawListenerC7215o00oo000(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(o00oo000);
        view.addOnAttachStateChangeListener(o00oo000);
        return o00oo000;
    }

    public boolean onPreDraw() {
        OooO00o();
        this.f19720OooO00o.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f19719OooO00o = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        OooO00o();
    }

    public void OooO00o() {
        if (this.f19719OooO00o.isAlive()) {
            this.f19719OooO00o.removeOnPreDrawListener(this);
        } else {
            this.OooO00o.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.OooO00o.removeOnAttachStateChangeListener(this);
    }
}
