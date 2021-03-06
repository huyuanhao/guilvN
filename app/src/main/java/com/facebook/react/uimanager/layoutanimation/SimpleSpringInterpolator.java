package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

public class SimpleSpringInterpolator implements Interpolator {
    public static final float FACTOR = 0.5f;
    public static final String PARAM_SPRING_DAMPING = "springDamping";
    public final float mSpringDamping;

    public SimpleSpringInterpolator() {
        this.mSpringDamping = 0.5f;
    }

    public static float getSpringDamping(ReadableMap readableMap) {
        if (readableMap.getType(PARAM_SPRING_DAMPING).equals(ReadableType.Number)) {
            return (float) readableMap.getDouble(PARAM_SPRING_DAMPING);
        }
        return 0.5f;
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.mSpringDamping;
        double d = (double) (f - (f2 / 4.0f));
        Double.isNaN(d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (float) ((pow * Math.sin(((d * 3.141592653589793d) * 2.0d) / d2)) + 1.0d);
    }

    public SimpleSpringInterpolator(float f) {
        this.mSpringDamping = f;
    }
}
