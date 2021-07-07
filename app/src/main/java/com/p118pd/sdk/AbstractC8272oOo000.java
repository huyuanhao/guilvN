package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;

@SuppressLint({"NewApi"})
/* renamed from: com.pd.sdk.oOo000  reason: case insensitive filesystem */
public abstract class AbstractC8272oOo000 extends AbstractRunnableC8285oOo00O0 implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public ObjectAnimator OooO00o;
    public float OooO0o;
    public float OooO0oO;
    public float OooO0oo;

    public AbstractC8272oOo000(C8353oOoOOoOO oooooooo, float f, float f2, C8351oOoOOo0o oooooo0o, View view, float f3, float f4, long j) {
        super(oooooooo, f, f2, oooooo0o, view);
        this.OooO0oO = f3;
        this.OooO0oo = f4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phase", 0.0f, 1.0f);
        this.OooO00o = ofFloat;
        ofFloat.setDuration(j);
        this.OooO00o.addUpdateListener(this);
        this.OooO00o.addListener(this);
    }

    @Override // com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public abstract void OooO00o();

    public void OooO00o(float f) {
        this.OooO0o = f;
    }

    @Override // com.p118pd.sdk.AbstractRunnableC8285oOo00O0
    public void OooO0O0() {
        this.OooO00o.removeAllListeners();
        this.OooO00o.removeAllUpdateListeners();
        this.OooO00o.reverse();
        this.OooO00o.addUpdateListener(this);
        this.OooO00o.addListener(this);
    }

    public float OooO0OO() {
        return this.OooO0o;
    }

    public float OooO0Oo() {
        return this.OooO0oO;
    }

    public float OooO0o0() {
        return this.OooO0oo;
    }

    public void onAnimationCancel(Animator animator) {
        try {
            OooO00o();
        } catch (IllegalArgumentException unused) {
        }
    }

    public void onAnimationEnd(Animator animator) {
        try {
            OooO00o();
        } catch (IllegalArgumentException unused) {
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    @SuppressLint({"NewApi"})
    public void run() {
        this.OooO00o.start();
    }
}
