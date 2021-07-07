package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;

public class RoundedCornersDrawable extends ForwardingDrawable implements Rounded {
    public int mBorderColor = 0;
    public final Path mBorderPath = new Path();
    @VisibleForTesting
    public final float[] mBorderRadii = new float[8];
    public float mBorderWidth = 0.0f;
    public final RectF mBounds = new RectF();
    @Nullable
    public RectF mInsideBorderBounds;
    @Nullable
    public Matrix mInsideBorderTransform;
    public boolean mIsCircle = false;
    public int mOverlayColor = 0;
    public float mPadding = 0.0f;
    @VisibleForTesting
    public final Paint mPaint = new Paint(1);
    public final Path mPath = new Path();
    public final float[] mRadii = new float[8];
    public boolean mScaleDownInsideBorders = false;
    public final RectF mTempRectangle = new RectF();
    @VisibleForTesting
    public Type mType = Type.OVERLAY_COLOR;

    /* renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$1 */
    public static /* synthetic */ class C04911 {

        /* renamed from: $SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type */
        public static final /* synthetic */ int[] f963xda0cffae;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.drawee.drawable.RoundedCornersDrawable$Type[] r0 = com.facebook.drawee.drawable.RoundedCornersDrawable.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.drawee.drawable.RoundedCornersDrawable.C04911.f963xda0cffae = r0
                com.facebook.drawee.drawable.RoundedCornersDrawable$Type r1 = com.facebook.drawee.drawable.RoundedCornersDrawable.Type.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.drawee.drawable.RoundedCornersDrawable.C04911.f963xda0cffae     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.drawee.drawable.RoundedCornersDrawable$Type r1 = com.facebook.drawee.drawable.RoundedCornersDrawable.Type.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.RoundedCornersDrawable.C04911.<clinit>():void");
        }
    }

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) Preconditions.checkNotNull(drawable));
    }

    private void updatePath() {
        float[] fArr;
        this.mPath.reset();
        this.mBorderPath.reset();
        this.mTempRectangle.set(getBounds());
        RectF rectF = this.mTempRectangle;
        float f = this.mPadding;
        rectF.inset(f, f);
        this.mPath.addRect(this.mTempRectangle, Path.Direction.CW);
        if (this.mIsCircle) {
            this.mPath.addCircle(this.mTempRectangle.centerX(), this.mTempRectangle.centerY(), Math.min(this.mTempRectangle.width(), this.mTempRectangle.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.mPath.addRoundRect(this.mTempRectangle, this.mRadii, Path.Direction.CW);
        }
        RectF rectF2 = this.mTempRectangle;
        float f2 = this.mPadding;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.mTempRectangle;
        float f3 = this.mBorderWidth;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.mIsCircle) {
            this.mBorderPath.addCircle(this.mTempRectangle.centerX(), this.mTempRectangle.centerY(), Math.min(this.mTempRectangle.width(), this.mTempRectangle.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.mBorderRadii;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.mRadii[i] + this.mPadding) - (this.mBorderWidth / 2.0f);
                i++;
            }
            this.mBorderPath.addRoundRect(this.mTempRectangle, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.mTempRectangle;
        float f4 = this.mBorderWidth;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public void draw(Canvas canvas) {
        this.mBounds.set(getBounds());
        int i = C04911.f963xda0cffae[this.mType.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            this.mPath.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.mPath);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.mScaleDownInsideBorders) {
                RectF rectF = this.mInsideBorderBounds;
                if (rectF == null) {
                    this.mInsideBorderBounds = new RectF(this.mBounds);
                    this.mInsideBorderTransform = new Matrix();
                } else {
                    rectF.set(this.mBounds);
                }
                RectF rectF2 = this.mInsideBorderBounds;
                float f = this.mBorderWidth;
                rectF2.inset(f, f);
                this.mInsideBorderTransform.setRectToRect(this.mBounds, this.mInsideBorderBounds, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.mBounds);
                canvas.concat(this.mInsideBorderTransform);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setColor(this.mOverlayColor);
            this.mPaint.setStrokeWidth(0.0f);
            this.mPath.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.mPath, this.mPaint);
            if (this.mIsCircle) {
                float width = ((this.mBounds.width() - this.mBounds.height()) + this.mBorderWidth) / 2.0f;
                float height = ((this.mBounds.height() - this.mBounds.width()) + this.mBorderWidth) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.mBounds;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.mPaint);
                    RectF rectF4 = this.mBounds;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.mPaint);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.mBounds;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + height, this.mPaint);
                    RectF rectF6 = this.mBounds;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - height, rectF6.right, f7, this.mPaint);
                }
            }
        }
        if (this.mBorderColor != 0) {
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setColor(this.mBorderColor);
            this.mPaint.setStrokeWidth(this.mBorderWidth);
            this.mPath.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.mBorderPath, this.mPaint);
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public int getBorderColor() {
        return this.mBorderColor;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    public int getOverlayColor() {
        return this.mOverlayColor;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float getPadding() {
        return this.mPadding;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public float[] getRadii() {
        return this.mRadii;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public boolean getScaleDownInsideBorders() {
        return this.mScaleDownInsideBorders;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public boolean isCircle() {
        return this.mIsCircle;
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updatePath();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setBorder(int i, float f) {
        this.mBorderColor = i;
        this.mBorderWidth = f;
        updatePath();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setCircle(boolean z) {
        this.mIsCircle = z;
        updatePath();
        invalidateSelf();
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setPadding(float f) {
        this.mPadding = f;
        updatePath();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setRadii(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.mRadii, 0.0f);
        } else {
            Preconditions.checkArgument(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.mRadii, 0, 8);
        }
        updatePath();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setRadius(float f) {
        Arrays.fill(this.mRadii, f);
        updatePath();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public void setScaleDownInsideBorders(boolean z) {
        this.mScaleDownInsideBorders = z;
        updatePath();
        invalidateSelf();
    }

    public void setType(Type type) {
        this.mType = type;
        invalidateSelf();
    }
}
