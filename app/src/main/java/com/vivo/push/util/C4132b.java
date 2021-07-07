package com.vivo.push.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: com.vivo.push.util.b */
public final class C4132b {
    /* renamed from: a */
    public static Bitmap m11161a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = ((float) i) / ((float) width);
        float f2 = ((float) i2) / ((float) height);
        try {
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (Exception unused) {
            return bitmap;
        }
    }
}
