package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class ForwardingDrawable extends Drawable implements Drawable.Callback, TransformCallback, TransformAwareDrawable, DrawableParent {
    public static final Matrix sTempTransform = new Matrix();
    public Drawable mCurrentDelegate;
    public final DrawableProperties mDrawableProperties = new DrawableProperties();
    public TransformCallback mTransformCallback;

    public ForwardingDrawable(Drawable drawable) {
        this.mCurrentDelegate = drawable;
        DrawableUtils.setCallbacks(drawable, this, this);
    }

    public void draw(Canvas canvas) {
        this.mCurrentDelegate.draw(canvas);
    }

    public Drawable.ConstantState getConstantState() {
        return this.mCurrentDelegate.getConstantState();
    }

    public Drawable getCurrent() {
        return this.mCurrentDelegate;
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    public Drawable getDrawable() {
        return getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.mCurrentDelegate.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.mCurrentDelegate.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.mCurrentDelegate.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.mCurrentDelegate.getPadding(rect);
    }

    public void getParentTransform(Matrix matrix) {
        TransformCallback transformCallback = this.mTransformCallback;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.mTransformCallback;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
    }

    public void getTransformedBounds(RectF rectF) {
        getParentTransform(sTempTransform);
        rectF.set(getBounds());
        sTempTransform.mapRect(rectF);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        return this.mCurrentDelegate.isStateful();
    }

    public Drawable mutate() {
        this.mCurrentDelegate.mutate();
        return this;
    }

    public void onBoundsChange(Rect rect) {
        this.mCurrentDelegate.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.mCurrentDelegate.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        return this.mCurrentDelegate.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.mDrawableProperties.setAlpha(i);
        this.mCurrentDelegate.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawableProperties.setColorFilter(colorFilter);
        this.mCurrentDelegate.setColorFilter(colorFilter);
    }

    public Drawable setCurrent(Drawable drawable) {
        Drawable currentWithoutInvalidate = setCurrentWithoutInvalidate(drawable);
        invalidateSelf();
        return currentWithoutInvalidate;
    }

    public Drawable setCurrentWithoutInvalidate(Drawable drawable) {
        Drawable drawable2 = this.mCurrentDelegate;
        DrawableUtils.setCallbacks(drawable2, null, null);
        DrawableUtils.setCallbacks(drawable, null, null);
        DrawableUtils.setDrawableProperties(drawable, this.mDrawableProperties);
        DrawableUtils.copyProperties(drawable, this);
        DrawableUtils.setCallbacks(drawable, this, this);
        this.mCurrentDelegate = drawable;
        return drawable2;
    }

    public void setDither(boolean z) {
        this.mDrawableProperties.setDither(z);
        this.mCurrentDelegate.setDither(z);
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    public Drawable setDrawable(Drawable drawable) {
        return setCurrent(drawable);
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawableProperties.setFilterBitmap(z);
        this.mCurrentDelegate.setFilterBitmap(z);
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        this.mCurrentDelegate.setHotspot(f, f2);
    }

    @Override // com.facebook.drawee.drawable.TransformAwareDrawable
    public void setTransformCallback(TransformCallback transformCallback) {
        this.mTransformCallback = transformCallback;
    }

    public boolean setVisible(boolean z, boolean z2) {
        super.setVisible(z, z2);
        return this.mCurrentDelegate.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
