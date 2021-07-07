package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;

public class MatrixDrawable extends ForwardingDrawable {
    public Matrix mDrawMatrix;
    public Matrix mMatrix;
    public int mUnderlyingHeight = 0;
    public int mUnderlyingWidth = 0;

    public MatrixDrawable(Drawable drawable, Matrix matrix) {
        super((Drawable) Preconditions.checkNotNull(drawable));
        this.mMatrix = matrix;
    }

    private void configureBounds() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.mUnderlyingWidth = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.mUnderlyingHeight = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.mDrawMatrix = this.mMatrix;
    }

    private void configureBoundsIfUnderlyingChanged() {
        if (this.mUnderlyingWidth != getCurrent().getIntrinsicWidth() || this.mUnderlyingHeight != getCurrent().getIntrinsicHeight()) {
            configureBounds();
        }
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public void draw(Canvas canvas) {
        configureBoundsIfUnderlyingChanged();
        if (this.mDrawMatrix != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.mDrawMatrix);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        Matrix matrix2 = this.mDrawMatrix;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        configureBounds();
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        configureBounds();
        return current;
    }

    public void setMatrix(Matrix matrix) {
        this.mMatrix = matrix;
        configureBounds();
        invalidateSelf();
    }
}
