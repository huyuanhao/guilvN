package com.p118pd.sdk;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.github.mikephil.charting.animation.Easing;

/* renamed from: com.pd.sdk.oOOo0O0  reason: case insensitive filesystem */
public class C8185oOOo0O0 {
    public float OooO00o = 1.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ValueAnimator.AnimatorUpdateListener f21244OooO00o;
    public float OooO0O0 = 1.0f;

    public C8185oOOo0O0() {
    }

    public void OooO00o(int i, int i2, AbstractC8187oOOo0O0O oooo0o0o, AbstractC8187oOOo0O0O oooo0o0o2) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
            ofFloat.setInterpolator(oooo0o0o2);
            ofFloat.setDuration((long) i2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
            ofFloat2.setInterpolator(oooo0o0o);
            ofFloat2.setDuration((long) i);
            if (i > i2) {
                ofFloat2.addUpdateListener(this.f21244OooO00o);
            } else {
                ofFloat.addUpdateListener(this.f21244OooO00o);
            }
            ofFloat2.start();
            ofFloat.start();
        }
    }

    public void OooO0O0(int i, AbstractC8187oOOo0O0O oooo0o0o) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
            ofFloat.setInterpolator(oooo0o0o);
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.f21244OooO00o);
            ofFloat.start();
        }
    }

    public C8185oOOo0O0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21244OooO00o = animatorUpdateListener;
    }

    public void OooO0O0(int i, Easing.EasingOption easingOption) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
            ofFloat.setInterpolator(Easing.OooO00o(easingOption));
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.f21244OooO00o);
            ofFloat.start();
        }
    }

    public void OooO00o(int i, AbstractC8187oOOo0O0O oooo0o0o) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
            ofFloat.setInterpolator(oooo0o0o);
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.f21244OooO00o);
            ofFloat.start();
        }
    }

    public void OooO0O0(int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.f21244OooO00o);
            ofFloat.start();
        }
    }

    public void OooO00o(int i, int i2, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
            ofFloat.setInterpolator(Easing.OooO00o(easingOption2));
            ofFloat.setDuration((long) i2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
            ofFloat2.setInterpolator(Easing.OooO00o(easingOption));
            ofFloat2.setDuration((long) i);
            if (i > i2) {
                ofFloat2.addUpdateListener(this.f21244OooO00o);
            } else {
                ofFloat.addUpdateListener(this.f21244OooO00o);
            }
            ofFloat2.start();
            ofFloat.start();
        }
    }

    public float OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0O0(float f) {
        this.OooO00o = f;
    }

    public void OooO00o(int i, Easing.EasingOption easingOption) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
            ofFloat.setInterpolator(Easing.OooO00o(easingOption));
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.f21244OooO00o);
            ofFloat.start();
        }
    }

    public void OooO00o(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
            ofFloat.setDuration((long) i2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
            ofFloat2.setDuration((long) i);
            if (i > i2) {
                ofFloat2.addUpdateListener(this.f21244OooO00o);
            } else {
                ofFloat.addUpdateListener(this.f21244OooO00o);
            }
            ofFloat2.start();
            ofFloat.start();
        }
    }

    public void OooO00o(int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.f21244OooO00o);
            ofFloat.start();
        }
    }

    public float OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(float f) {
        this.OooO0O0 = f;
    }
}
