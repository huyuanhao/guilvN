package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.common.internal.VisibleForTesting;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

public class RoundedBitmapDrawable extends RoundedDrawable {
    @Nullable
    public final Bitmap mBitmap;
    public final Paint mBorderPaint;
    public WeakReference<Bitmap> mLastBitmap;
    public final Paint mPaint;

    public RoundedBitmapDrawable(Resources resources, @Nullable Bitmap bitmap, @Nullable Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.mPaint = new Paint();
        this.mBorderPaint = new Paint(1);
        this.mBitmap = bitmap;
        if (paint != null) {
            this.mPaint.set(paint);
        }
        this.mPaint.setFlags(1);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
    }

    public static RoundedBitmapDrawable fromBitmapDrawable(Resources resources, BitmapDrawable bitmapDrawable) {
        return new RoundedBitmapDrawable(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
    }

    private void updatePaint() {
        WeakReference<Bitmap> weakReference = this.mLastBitmap;
        if (weakReference == null || weakReference.get() != this.mBitmap) {
            this.mLastBitmap = new WeakReference<>(this.mBitmap);
            Paint paint = this.mPaint;
            Bitmap bitmap = this.mBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.mIsShaderTransformDirty = true;
        }
        if (this.mIsShaderTransformDirty) {
            this.mPaint.getShader().setLocalMatrix(this.mTransform);
            this.mIsShaderTransformDirty = false;
        }
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable
    public void draw(Canvas canvas) {
        if (!shouldRound()) {
            super.draw(canvas);
            return;
        }
        updateTransform();
        updatePath();
        updatePaint();
        int save = canvas.save();
        canvas.concat(this.mInverseParentTransform);
        canvas.drawPath(this.mPath, this.mPaint);
        float f = this.mBorderWidth;
        if (f > 0.0f) {
            this.mBorderPaint.setStrokeWidth(f);
            this.mBorderPaint.setColor(DrawableUtils.multiplyColorAlpha(this.mBorderColor, this.mPaint.getAlpha()));
            canvas.drawPath(this.mBorderPath, this.mBorderPaint);
        }
        canvas.restoreToCount(save);
    }

    public Paint getPaint() {
        return this.mPaint;
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.mPaint.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable
    @VisibleForTesting
    public boolean shouldRound() {
        return super.shouldRound() && this.mBitmap != null;
    }

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
        this(resources, bitmap, null);
    }
}
