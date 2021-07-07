package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class ProgressBarDrawable extends Drawable implements CloneableDrawable {
    public int mBackgroundColor = Integer.MIN_VALUE;
    public int mBarWidth = 20;
    public int mColor = -2147450625;
    public boolean mHideWhenZero = false;
    public boolean mIsVertical = false;
    public int mLevel = 0;
    public int mPadding = 10;
    public final Paint mPaint = new Paint(1);
    public final Path mPath = new Path();
    public int mRadius = 0;
    public final RectF mRect = new RectF();

    private void drawBar(Canvas canvas, int i) {
        this.mPaint.setColor(i);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPath.reset();
        this.mPath.setFillType(Path.FillType.EVEN_ODD);
        this.mPath.addRoundRect(this.mRect, (float) Math.min(this.mRadius, this.mBarWidth / 2), (float) Math.min(this.mRadius, this.mBarWidth / 2), Path.Direction.CW);
        canvas.drawPath(this.mPath, this.mPaint);
    }

    private void drawHorizontalBar(Canvas canvas, int i, int i2) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int i3 = this.mPadding;
        int i4 = bounds.left + i3;
        int i5 = bounds.bottom - i3;
        int i6 = this.mBarWidth;
        int i7 = i5 - i6;
        this.mRect.set((float) i4, (float) i7, (float) (i4 + (((width - (i3 * 2)) * i) / 10000)), (float) (i7 + i6));
        drawBar(canvas, i2);
    }

    private void drawVerticalBar(Canvas canvas, int i, int i2) {
        Rect bounds = getBounds();
        int height = bounds.height();
        int i3 = this.mPadding;
        int i4 = bounds.left + i3;
        int i5 = bounds.top + i3;
        this.mRect.set((float) i4, (float) i5, (float) (i4 + this.mBarWidth), (float) (i5 + (((height - (i3 * 2)) * i) / 10000)));
        drawBar(canvas, i2);
    }

    @Override // com.facebook.drawee.drawable.CloneableDrawable
    public Drawable cloneDrawable() {
        ProgressBarDrawable progressBarDrawable = new ProgressBarDrawable();
        progressBarDrawable.mBackgroundColor = this.mBackgroundColor;
        progressBarDrawable.mColor = this.mColor;
        progressBarDrawable.mPadding = this.mPadding;
        progressBarDrawable.mBarWidth = this.mBarWidth;
        progressBarDrawable.mLevel = this.mLevel;
        progressBarDrawable.mRadius = this.mRadius;
        progressBarDrawable.mHideWhenZero = this.mHideWhenZero;
        progressBarDrawable.mIsVertical = this.mIsVertical;
        return progressBarDrawable;
    }

    public void draw(Canvas canvas) {
        if (this.mHideWhenZero && this.mLevel == 0) {
            return;
        }
        if (this.mIsVertical) {
            drawVerticalBar(canvas, 10000, this.mBackgroundColor);
            drawVerticalBar(canvas, this.mLevel, this.mColor);
            return;
        }
        drawHorizontalBar(canvas, 10000, this.mBackgroundColor);
        drawHorizontalBar(canvas, this.mLevel, this.mColor);
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getBarWidth() {
        return this.mBarWidth;
    }

    public int getColor() {
        return this.mColor;
    }

    public boolean getHideWhenZero() {
        return this.mHideWhenZero;
    }

    public boolean getIsVertical() {
        return this.mIsVertical;
    }

    public int getOpacity() {
        return DrawableUtils.getOpacityFromColor(this.mPaint.getColor());
    }

    public boolean getPadding(Rect rect) {
        int i = this.mPadding;
        rect.set(i, i, i, i);
        return this.mPadding != 0;
    }

    public int getRadius() {
        return this.mRadius;
    }

    public boolean onLevelChange(int i) {
        this.mLevel = i;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setBackgroundColor(int i) {
        if (this.mBackgroundColor != i) {
            this.mBackgroundColor = i;
            invalidateSelf();
        }
    }

    public void setBarWidth(int i) {
        if (this.mBarWidth != i) {
            this.mBarWidth = i;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        if (this.mColor != i) {
            this.mColor = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setHideWhenZero(boolean z) {
        this.mHideWhenZero = z;
    }

    public void setIsVertical(boolean z) {
        if (this.mIsVertical != z) {
            this.mIsVertical = z;
            invalidateSelf();
        }
    }

    public void setPadding(int i) {
        if (this.mPadding != i) {
            this.mPadding = i;
            invalidateSelf();
        }
    }

    public void setRadius(int i) {
        if (this.mRadius != i) {
            this.mRadius = i;
            invalidateSelf();
        }
    }
}
