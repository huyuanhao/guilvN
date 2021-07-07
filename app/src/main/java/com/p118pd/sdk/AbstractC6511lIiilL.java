package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.p118pd.sdk.View$OnTouchListenerC9328I11l1li;

/* renamed from: com.pd.sdk.lIiil丨L  reason: invalid class name and case insensitive filesystem */
public interface AbstractC6511lIiilL {
    public static final float OooO00o = 3.0f;
    public static final float OooO0O0 = 1.75f;
    public static final float OooO0OO = 1.0f;
    public static final int o00oO0o = 200;

    void OooO00o(float f, float f2, float f3, boolean z);

    void OooO00o(float f, boolean z);

    boolean OooO00o();

    boolean OooO00o(Matrix matrix);

    void OooO0O0(float f, float f2, float f3);

    Matrix getDisplayMatrix();

    RectF getDisplayRect();

    AbstractC6511lIiilL getIPhotoViewImplementation();

    @Deprecated
    float getMaxScale();

    float getMaximumScale();

    float getMediumScale();

    @Deprecated
    float getMidScale();

    @Deprecated
    float getMinScale();

    float getMinimumScale();

    View$OnTouchListenerC9328I11l1li.OooO0o getOnPhotoTapListener();

    View$OnTouchListenerC9328I11l1li.AbstractC9332OooO0oo getOnViewTapListener();

    float getScale();

    ImageView.ScaleType getScaleType();

    Bitmap getVisibleRectangleBitmap();

    void setAllowParentInterceptOnEdge(boolean z);

    @Deprecated
    void setMaxScale(float f);

    void setMaximumScale(float f);

    void setMediumScale(float f);

    @Deprecated
    void setMidScale(float f);

    @Deprecated
    void setMinScale(float f);

    void setMinimumScale(float f);

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnMatrixChangeListener(View$OnTouchListenerC9328I11l1li.AbstractC9330OooO0o0 oooO0o0);

    void setOnPhotoTapListener(View$OnTouchListenerC9328I11l1li.OooO0o oooO0o);

    void setOnScaleChangeListener(View$OnTouchListenerC9328I11l1li.AbstractC9331OooO0oO oooO0oO);

    void setOnViewTapListener(View$OnTouchListenerC9328I11l1li.AbstractC9332OooO0oo oooO0oo);

    void setPhotoViewRotation(float f);

    void setRotationBy(float f);

    void setRotationTo(float f);

    void setScale(float f);

    void setScaleType(ImageView.ScaleType scaleType);

    void setZoomTransitionDuration(int i);

    void setZoomable(boolean z);
}
