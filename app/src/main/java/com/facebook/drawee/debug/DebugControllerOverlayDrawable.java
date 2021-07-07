package com.facebook.drawee.debug;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.debug.listener.ImageLoadingTimeListener;
import com.facebook.drawee.drawable.ScalingUtils;
import javax.annotation.Nullable;

public class DebugControllerOverlayDrawable extends Drawable implements ImageLoadingTimeListener {
    public static final float IMAGE_SIZE_THRESHOLD_NOT_OK = 0.5f;
    public static final float IMAGE_SIZE_THRESHOLD_OK = 0.1f;
    public static final int MAX_LINE_WIDTH_EM = 7;
    public static final int MAX_NUMBER_OF_LINES = 7;
    public static final int MAX_TEXT_SIZE_PX = 40;
    public static final int MIN_TEXT_SIZE_PX = 12;
    public static final String NO_CONTROLLER_ID = "none";
    public static final int OUTLINE_COLOR = -26624;
    public static final int OUTLINE_STROKE_WIDTH_PX = 2;
    @VisibleForTesting
    public static final int OVERLAY_COLOR_IMAGE_ALMOST_OK = 1728026624;
    @VisibleForTesting
    public static final int OVERLAY_COLOR_IMAGE_NOT_OK = 1727284022;
    @VisibleForTesting
    public static final int OVERLAY_COLOR_IMAGE_OK = 1716301648;
    public static final int TEXT_COLOR = -1;
    public static final int TEXT_LINE_SPACING_PX = 8;
    public static final int TEXT_PADDING_PX = 10;
    public String mControllerId;
    public int mCurrentTextXPx;
    public int mCurrentTextYPx;
    public long mFinalImageTimeMs;
    public int mFrameCount;
    public int mHeightPx;
    public String mImageFormat;
    public String mImageId;
    public int mImageSizeBytes;
    public int mLineIncrementPx;
    public int mLoopCount;
    public final Matrix mMatrix = new Matrix();
    public final Paint mPaint = new Paint(1);
    public final Rect mRect = new Rect();
    public final RectF mRectF = new RectF();
    public ScalingUtils.ScaleType mScaleType;
    public int mStartTextXPx;
    public int mStartTextYPx;
    public int mTextGravity = 80;
    public int mWidthPx;

    public DebugControllerOverlayDrawable() {
        reset();
    }

    private void addDebugText(Canvas canvas, String str, @Nullable Object... objArr) {
        if (objArr == null) {
            canvas.drawText(str, (float) this.mCurrentTextXPx, (float) this.mCurrentTextYPx, this.mPaint);
        } else {
            canvas.drawText(String.format(str, objArr), (float) this.mCurrentTextXPx, (float) this.mCurrentTextYPx, this.mPaint);
        }
        this.mCurrentTextYPx += this.mLineIncrementPx;
    }

    private void prepareDebugTextParameters(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(12, Math.min(rect.width() / i2, rect.height() / i)));
        this.mPaint.setTextSize((float) min);
        int i3 = min + 8;
        this.mLineIncrementPx = i3;
        if (this.mTextGravity == 80) {
            this.mLineIncrementPx = i3 * -1;
        }
        this.mStartTextXPx = rect.left + 10;
        this.mStartTextYPx = this.mTextGravity == 80 ? rect.bottom - 10 : rect.top + 10 + 12;
    }

    @VisibleForTesting
    public int determineOverlayColor(int i, int i2, @Nullable ScalingUtils.ScaleType scaleType) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (scaleType != null) {
                Rect rect = this.mRect;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.mMatrix.reset();
                scaleType.getTransform(this.mMatrix, this.mRect, i, i2, 0.0f, 0.0f);
                RectF rectF = this.mRectF;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                this.mMatrix.mapRect(rectF);
                width = Math.min(width, (int) this.mRectF.width());
                height = Math.min(height, (int) this.mRectF.height());
            }
            float f = (float) width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                return OVERLAY_COLOR_IMAGE_OK;
            }
            if (f7 >= f3 || ((float) abs2) >= f6) {
                return OVERLAY_COLOR_IMAGE_NOT_OK;
            }
            return OVERLAY_COLOR_IMAGE_ALMOST_OK;
        }
        return OVERLAY_COLOR_IMAGE_NOT_OK;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(2.0f);
        this.mPaint.setColor(OUTLINE_COLOR);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.mPaint);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(determineOverlayColor(this.mWidthPx, this.mHeightPx, this.mScaleType));
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.mPaint);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setStrokeWidth(0.0f);
        this.mPaint.setColor(-1);
        this.mCurrentTextXPx = this.mStartTextXPx;
        this.mCurrentTextYPx = this.mStartTextYPx;
        String str = this.mImageId;
        if (str != null) {
            addDebugText(canvas, "IDs: %s, %s", this.mControllerId, str);
        } else {
            addDebugText(canvas, "ID: %s", this.mControllerId);
        }
        addDebugText(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        addDebugText(canvas, "I: %dx%d", Integer.valueOf(this.mWidthPx), Integer.valueOf(this.mHeightPx));
        addDebugText(canvas, "I: %d KiB", Integer.valueOf(this.mImageSizeBytes / 1024));
        String str2 = this.mImageFormat;
        if (str2 != null) {
            addDebugText(canvas, "i format: %s", str2);
        }
        int i = this.mFrameCount;
        if (i > 0) {
            addDebugText(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.mLoopCount));
        }
        ScalingUtils.ScaleType scaleType = this.mScaleType;
        if (scaleType != null) {
            addDebugText(canvas, "scale: %s", scaleType);
        }
        long j = this.mFinalImageTimeMs;
        if (j >= 0) {
            addDebugText(canvas, "t: %d ms", Long.valueOf(j));
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        prepareDebugTextParameters(rect, 7, 7);
    }

    @Override // com.facebook.drawee.debug.listener.ImageLoadingTimeListener
    public void onFinalImageSet(long j) {
        this.mFinalImageTimeMs = j;
        invalidateSelf();
    }

    public void reset() {
        this.mWidthPx = -1;
        this.mHeightPx = -1;
        this.mImageSizeBytes = -1;
        this.mFrameCount = -1;
        this.mLoopCount = -1;
        this.mImageFormat = null;
        setControllerId(null);
        this.mFinalImageTimeMs = -1;
        invalidateSelf();
    }

    public void setAlpha(int i) {
    }

    public void setAnimationInfo(int i, int i2) {
        this.mFrameCount = i;
        this.mLoopCount = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setControllerId(@Nullable String str) {
        if (str == null) {
            str = "none";
        }
        this.mControllerId = str;
        invalidateSelf();
    }

    public void setDimensions(int i, int i2) {
        this.mWidthPx = i;
        this.mHeightPx = i2;
        invalidateSelf();
    }

    public void setFinalImageTimeMs(long j) {
        this.mFinalImageTimeMs = j;
    }

    public void setImageFormat(@Nullable String str) {
        this.mImageFormat = str;
    }

    public void setImageId(@Nullable String str) {
        this.mImageId = str;
        invalidateSelf();
    }

    public void setImageSize(int i) {
        this.mImageSizeBytes = i;
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    public void setTextGravity(int i) {
        this.mTextGravity = i;
        invalidateSelf();
    }
}
