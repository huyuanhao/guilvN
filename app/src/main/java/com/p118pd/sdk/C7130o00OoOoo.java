package com.p118pd.sdk;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: com.pd.sdk.o00OoOoo  reason: case insensitive filesystem */
public final class C7130o00OoOoo {
    public static Interpolator OooO00o(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new animation.InterpolatorC7127o00OoOo(path);
    }

    public static Interpolator OooO00o(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2);
        }
        return new animation.InterpolatorC7127o00OoOo(f, f2);
    }

    public static Interpolator OooO00o(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new animation.InterpolatorC7127o00OoOo(f, f2, f3, f4);
    }
}
