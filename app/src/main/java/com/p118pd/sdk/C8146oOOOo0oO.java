package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: com.pd.sdk.oOOOo0oO  reason: case insensitive filesystem */
public class C8146oOOOo0oO {
    public ValueAnimator OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OverScroller f21157OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PDFView f21158OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21159OooO00o = false;
    public boolean OooO0O0 = false;

    /* renamed from: com.pd.sdk.oOOOo0oO$OooO00o */
    public class OooO00o extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        public void onAnimationCancel(Animator animator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0();
            C8146oOOOo0oO.this.OooO0O0 = false;
        }

        public void onAnimationEnd(Animator animator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0();
            C8146oOOOo0oO.this.OooO0O0 = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue(), C8146oOOOo0oO.this.f21158OooO00o.getCurrentYOffset());
            C8146oOOOo0oO.this.f21158OooO00o.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0oO$OooO0O0 */
    public class OooO0O0 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public OooO0O0() {
        }

        public void onAnimationCancel(Animator animator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0();
            C8146oOOOo0oO.this.OooO0O0 = false;
        }

        public void onAnimationEnd(Animator animator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0();
            C8146oOOOo0oO.this.OooO0O0 = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0(C8146oOOOo0oO.this.f21158OooO00o.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C8146oOOOo0oO.this.f21158OooO00o.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.oOOOo0oO$OooO0OO */
    public class OooO0OO implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
        public final float OooO0Oo;
        public final float OooO0o0;

        public OooO0OO(float f, float f2) {
            this.OooO0Oo = f;
            this.OooO0o0 = f2;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0();
            C8146oOOOo0oO.this.OooO0Oo();
            C8146oOOOo0oO.this.f21158OooO00o.OooO0OO();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8146oOOOo0oO.this.f21158OooO00o.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.OooO0Oo, this.OooO0o0));
        }
    }

    public C8146oOOOo0oO(PDFView pDFView) {
        this.f21158OooO00o = pDFView;
        this.f21157OooO00o = new OverScroller(pDFView.getContext());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0Oo() {
        if (this.f21158OooO00o.getScrollHandle() != null) {
            this.f21158OooO00o.getScrollHandle().OooO0OO();
        }
    }

    public void OooO0O0(float f, float f2) {
        OooO0O0();
        this.OooO00o = ValueAnimator.ofFloat(f, f2);
        OooO0O0 oooO0O0 = new OooO0O0();
        this.OooO00o.setInterpolator(new DecelerateInterpolator());
        this.OooO00o.addUpdateListener(oooO0O0);
        this.OooO00o.addListener(oooO0O0);
        this.OooO00o.setDuration(400L);
        this.OooO00o.start();
    }

    public void OooO0OO() {
        this.f21159OooO00o = false;
        this.f21157OooO00o.forceFinished(true);
    }

    public void OooO00o(float f, float f2) {
        OooO0O0();
        this.OooO00o = ValueAnimator.ofFloat(f, f2);
        OooO00o oooO00o = new OooO00o();
        this.OooO00o.setInterpolator(new DecelerateInterpolator());
        this.OooO00o.addUpdateListener(oooO00o);
        this.OooO00o.addListener(oooO00o);
        this.OooO00o.setDuration(400L);
        this.OooO00o.start();
    }

    public void OooO0O0() {
        ValueAnimator valueAnimator = this.OooO00o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.OooO00o = null;
        }
        OooO0OO();
    }

    public void OooO00o(float f, float f2, float f3, float f4) {
        OooO0O0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f4);
        this.OooO00o = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        OooO0OO oooO0OO = new OooO0OO(f, f2);
        this.OooO00o.addUpdateListener(oooO0OO);
        this.OooO00o.addListener(oooO0OO);
        this.OooO00o.setDuration(400L);
        this.OooO00o.start();
    }

    public void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OooO0O0();
        this.f21159OooO00o = true;
        this.f21157OooO00o.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void OooO00o(float f) {
        if (this.f21158OooO00o.OooOO0o()) {
            OooO0O0(this.f21158OooO00o.getCurrentYOffset(), f);
        } else {
            OooO00o(this.f21158OooO00o.getCurrentXOffset(), f);
        }
        this.OooO0O0 = true;
    }

    public void OooO00o() {
        if (this.f21157OooO00o.computeScrollOffset()) {
            this.f21158OooO00o.OooO0O0((float) this.f21157OooO00o.getCurrX(), (float) this.f21157OooO00o.getCurrY());
            this.f21158OooO00o.OooO00o();
        } else if (this.f21159OooO00o) {
            this.f21159OooO00o = false;
            this.f21158OooO00o.OooO0O0();
            OooO0Oo();
            this.f21158OooO00o.OooO0OO();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19800OooO00o() {
        return this.f21159OooO00o || this.OooO0O0;
    }
}
