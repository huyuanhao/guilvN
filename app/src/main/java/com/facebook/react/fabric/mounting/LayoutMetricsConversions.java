package com.facebook.react.fabric.mounting;

import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.yoga.YogaMeasureMode;

public class LayoutMetricsConversions {
    public static final int REACT_CONSTRAINT_UNDEFINED = Integer.MIN_VALUE;

    public static float getMaxSize(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return -2.14748365E9f;
        }
        return (float) size;
    }

    public static float getMinSize(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return (float) size;
        }
        return 0.0f;
    }

    public static YogaMeasureMode getYogaMeasureMode(float f, float f2) {
        if (f == f2) {
            return YogaMeasureMode.EXACTLY;
        }
        if (f2 == -2.14748365E9f) {
            return YogaMeasureMode.UNDEFINED;
        }
        return YogaMeasureMode.AT_MOST;
    }

    public static float getYogaSize(float f, float f2) {
        if (f == f2) {
            return PixelUtil.toPixelFromDIP(f2);
        }
        if (f2 == -2.14748365E9f) {
            return 0.0f;
        }
        return PixelUtil.toPixelFromDIP(f2);
    }
}
