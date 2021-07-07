package com.p118pd.sdk;

import android.view.animation.Interpolator;

/* renamed from: com.pd.sdk.o00oO0  reason: case insensitive filesystem */
public abstract class Abstractanimation.InterpolatorC7186o00oO0 implements Interpolator {
    public final float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float[] f19661OooO00o;

    public Abstractanimation.InterpolatorC7186o00oO0(float[] fArr) {
        this.f19661OooO00o = fArr;
        this.OooO00o = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19661OooO00o;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.OooO00o;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f19661OooO00o;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
