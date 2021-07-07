package com.p118pd.sdk;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: com.pd.sdk.o00OoOo  reason: case insensitive filesystem */
public class animation.InterpolatorC7127o00OoOo implements Interpolator {
    public static final float OooO00o = 0.002f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float[] f19473OooO00o;
    public final float[] OooO0O0;

    public animation.InterpolatorC7127o00OoOo(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f19473OooO00o = new float[i];
        this.OooO0O0 = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f19473OooO00o[i2] = fArr[0];
            this.OooO0O0[i2] = fArr[1];
        }
    }

    public static Path OooO00o(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f19473OooO00o.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f19473OooO00o[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f19473OooO00o;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.OooO0O0[i];
        }
        float[] fArr2 = this.OooO0O0;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public static Path OooO00o(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public animation.InterpolatorC7127o00OoOo(float f, float f2) {
        this(OooO00o(f, f2));
    }

    public animation.InterpolatorC7127o00OoOo(float f, float f2, float f3, float f4) {
        this(OooO00o(f, f2, f3, f4));
    }
}
