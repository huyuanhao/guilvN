package com.p118pd.sdk;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.MotionEvent;

/* renamed from: com.pd.sdk.oo0oOoOO  reason: case insensitive filesystem */
public class C8746oo0oOoOO {
    public static final int OooO00o = 100;
    public static final int OooO0O0 = 1000;

    public static Camera.Area OooO00o(MotionEvent motionEvent, int i, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        RectF rectF = new RectF(x - 100.0f, y - 100.0f, x + 100.0f, y + 100.0f);
        float f = (float) i;
        float f2 = (float) i2;
        if (rectF.intersect(new RectF(0.0f, 0.0f, f, f2))) {
            RectF rectF2 = new RectF(((rectF.left / f) * 2000.0f) - 1000.0f, ((rectF.top / f2) * 2000.0f) - 1000.0f, ((rectF.right / f) * 2000.0f) - 1000.0f, ((rectF.bottom / f2) * 2000.0f) - 1000.0f);
            Rect rect = new Rect();
            rectF2.round(rect);
            return new Camera.Area(rect, 1000);
        }
        throw new RuntimeException("MotionEvent rect does not intersect with SurfaceTexture rect; unable to compute focus area");
    }
}
