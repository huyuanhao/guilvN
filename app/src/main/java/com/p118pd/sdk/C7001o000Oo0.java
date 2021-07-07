package com.p118pd.sdk;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.pd.sdk.o000Oo0  reason: case insensitive filesystem */
public class C7001o000Oo0 {
    public static final ThreadLocal<Matrix> OooO00o = new ThreadLocal<>();
    public static final ThreadLocal<RectF> OooO0O0 = new ThreadLocal<>();

    public static void OooO00o(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        OooO0O0(viewGroup, view, rect);
    }

    public static void OooO0O0(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = OooO00o.get();
        if (matrix == null) {
            matrix = new Matrix();
            OooO00o.set(matrix);
        } else {
            matrix.reset();
        }
        OooO00o(viewGroup, view, matrix);
        RectF rectF = OooO0O0.get();
        if (rectF == null) {
            rectF = new RectF();
            OooO0O0.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void OooO00o(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            OooO00o(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
