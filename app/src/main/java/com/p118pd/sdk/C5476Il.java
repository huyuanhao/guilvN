package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.p118pd.sdk.View$OnTouchListenerC9328I11l1li;

/* renamed from: com.pd.sdk.Il丨  reason: invalid class name and case insensitive filesystem */
public class C5476Il extends ImageView implements AbstractC6511lIiilL {
    public ImageView.ScaleType OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View$OnTouchListenerC9328I11l1li f15910OooO00o;

    public C5476Il(Context context) {
        this(context, null);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO00o() {
        View$OnTouchListenerC9328I11l1li r0 = this.f15910OooO00o;
        if (r0 == null || r0.m21376OooO00o() == null) {
            this.f15910OooO00o = new View$OnTouchListenerC9328I11l1li(this);
        }
        ImageView.ScaleType scaleType = this.OooO00o;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO0O0(float f, float f2, float f3) {
        this.f15910OooO00o.OooO0O0(f, f2, f3);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public Matrix getDisplayMatrix() {
        return this.f15910OooO00o.getDisplayMatrix();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public RectF getDisplayRect() {
        return this.f15910OooO00o.getDisplayRect();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public AbstractC6511lIiilL getIPhotoViewImplementation() {
        return this.f15910OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public float getMaxScale() {
        return getMaximumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getMaximumScale() {
        return this.f15910OooO00o.getMaximumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getMediumScale() {
        return this.f15910OooO00o.getMediumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public float getMidScale() {
        return getMediumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public float getMinScale() {
        return getMinimumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getMinimumScale() {
        return this.f15910OooO00o.getMinimumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public View$OnTouchListenerC9328I11l1li.OooO0o getOnPhotoTapListener() {
        return this.f15910OooO00o.getOnPhotoTapListener();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public View$OnTouchListenerC9328I11l1li.AbstractC9332OooO0oo getOnViewTapListener() {
        return this.f15910OooO00o.getOnViewTapListener();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getScale() {
        return this.f15910OooO00o.getScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public ImageView.ScaleType getScaleType() {
        return this.f15910OooO00o.getScaleType();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public Bitmap getVisibleRectangleBitmap() {
        return this.f15910OooO00o.getVisibleRectangleBitmap();
    }

    public void onAttachedToWindow() {
        OooO00o();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f15910OooO00o.m21377OooO00o();
        super.onDetachedFromWindow();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f15910OooO00o.setAllowParentInterceptOnEdge(z);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        View$OnTouchListenerC9328I11l1li r1 = this.f15910OooO00o;
        if (r1 != null) {
            r1.OooO0O0();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        View$OnTouchListenerC9328I11l1li r1 = this.f15910OooO00o;
        if (r1 != null) {
            r1.OooO0O0();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        View$OnTouchListenerC9328I11l1li r1 = this.f15910OooO00o;
        if (r1 != null) {
            r1.OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public void setMaxScale(float f) {
        setMaximumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setMaximumScale(float f) {
        this.f15910OooO00o.setMaximumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setMediumScale(float f) {
        this.f15910OooO00o.setMediumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public void setMidScale(float f) {
        setMediumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public void setMinScale(float f) {
        setMinimumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setMinimumScale(float f) {
        this.f15910OooO00o.setMinimumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f15910OooO00o.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f15910OooO00o.setOnLongClickListener(onLongClickListener);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnMatrixChangeListener(View$OnTouchListenerC9328I11l1li.AbstractC9330OooO0o0 oooO0o0) {
        this.f15910OooO00o.setOnMatrixChangeListener(oooO0o0);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnPhotoTapListener(View$OnTouchListenerC9328I11l1li.OooO0o oooO0o) {
        this.f15910OooO00o.setOnPhotoTapListener(oooO0o);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnScaleChangeListener(View$OnTouchListenerC9328I11l1li.AbstractC9331OooO0oO oooO0oO) {
        this.f15910OooO00o.setOnScaleChangeListener(oooO0oO);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnViewTapListener(View$OnTouchListenerC9328I11l1li.AbstractC9332OooO0oo oooO0oo) {
        this.f15910OooO00o.setOnViewTapListener(oooO0oo);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setPhotoViewRotation(float f) {
        this.f15910OooO00o.setRotationTo(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setRotationBy(float f) {
        this.f15910OooO00o.setRotationBy(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setRotationTo(float f) {
        this.f15910OooO00o.setRotationTo(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setScale(float f) {
        this.f15910OooO00o.setScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setScaleType(ImageView.ScaleType scaleType) {
        View$OnTouchListenerC9328I11l1li r0 = this.f15910OooO00o;
        if (r0 != null) {
            r0.setScaleType(scaleType);
        } else {
            this.OooO00o = scaleType;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setZoomTransitionDuration(int i) {
        this.f15910OooO00o.setZoomTransitionDuration(i);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setZoomable(boolean z) {
        this.f15910OooO00o.setZoomable(z);
    }

    public C5476Il(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5476Il(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15719OooO00o() {
        return this.f15910OooO00o.m21378OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public boolean OooO00o(Matrix matrix) {
        return this.f15910OooO00o.m21379OooO00o(matrix);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO00o(float f, boolean z) {
        this.f15910OooO00o.OooO00o(f, z);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO00o(float f, float f2, float f3, boolean z) {
        this.f15910OooO00o.OooO00o(f, f2, f3, z);
    }
}
