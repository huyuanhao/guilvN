package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* renamed from: com.pd.sdk.o0oOOo  reason: case insensitive filesystem */
public class C7621o0oOOo extends View {
    @Deprecated
    public C7621o0oOOo(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    public static int OooO00o(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(OooO00o(getSuggestedMinimumWidth(), i), OooO00o(getSuggestedMinimumHeight(), i2));
    }

    @Deprecated
    public C7621o0oOOo(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C7621o0oOOo(@NonNull Context context) {
        this(context, null);
    }
}
