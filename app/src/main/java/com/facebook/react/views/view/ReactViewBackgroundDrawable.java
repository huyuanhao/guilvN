package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.yoga.YogaConstants;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.Nullable;

public class ReactViewBackgroundDrawable extends Drawable {
    public static final int ALL_BITS_SET = -1;
    public static final int ALL_BITS_UNSET = 0;
    public static final int DEFAULT_BORDER_ALPHA = 255;
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final int DEFAULT_BORDER_RGB = 0;
    public int mAlpha = 255;
    @Nullable
    public Spacing mBorderAlpha;
    @Nullable
    public float[] mBorderCornerRadii;
    @Nullable
    public Spacing mBorderRGB;
    public float mBorderRadius = Float.NaN;
    @Nullable
    public BorderStyle mBorderStyle;
    @Nullable
    public Spacing mBorderWidth;
    @Nullable
    public Path mCenterDrawPath;
    public int mColor = 0;
    public final Context mContext;
    @Nullable
    public PointF mInnerBottomLeftCorner;
    @Nullable
    public PointF mInnerBottomRightCorner;
    @Nullable
    public Path mInnerClipPathForBorderRadius;
    @Nullable
    public RectF mInnerClipTempRectForBorderRadius;
    @Nullable
    public PointF mInnerTopLeftCorner;
    @Nullable
    public PointF mInnerTopRightCorner;
    public int mLayoutDirection;
    public boolean mNeedUpdatePathForBorderRadius = false;
    @Nullable
    public Path mOuterClipPathForBorderRadius;
    @Nullable
    public RectF mOuterClipTempRectForBorderRadius;
    public final Paint mPaint = new Paint(1);
    @Nullable
    public PathEffect mPathEffectForBorderStyle;
    @Nullable
    public Path mPathForBorder;
    @Nullable
    public Path mPathForBorderRadiusOutline;
    @Nullable
    public RectF mTempRectForBorderRadiusOutline;
    @Nullable
    public RectF mTempRectForCenterDrawPath;

    /* renamed from: com.facebook.react.views.view.ReactViewBackgroundDrawable$1 */
    public static /* synthetic */ class C08921 {

        /* renamed from: $SwitchMap$com$facebook$react$views$view$ReactViewBackgroundDrawable$BorderStyle */
        public static final /* synthetic */ int[] f987xe6ea8768;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle[] r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.views.view.ReactViewBackgroundDrawable.C08921.f987xe6ea8768 = r0
                com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle r1 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderStyle.SOLID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.C08921.f987xe6ea8768     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle r1 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderStyle.DASHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.C08921.f987xe6ea8768     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle r1 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderStyle.DOTTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.C08921.<clinit>():void");
        }
    }

    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    public enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED;

        @Nullable
        public static PathEffect getPathEffect(BorderStyle borderStyle, float f) {
            int i = C08921.f987xe6ea8768[borderStyle.ordinal()];
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            } else if (i != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
        }
    }

    public ReactViewBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    public static int colorFromAlphaAndRGBComponents(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    private void drawQuadrilateral(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.mPathForBorder == null) {
                this.mPathForBorder = new Path();
            }
            this.mPaint.setColor(i);
            this.mPathForBorder.reset();
            this.mPathForBorder.moveTo(f, f2);
            this.mPathForBorder.lineTo(f3, f4);
            this.mPathForBorder.lineTo(f5, f6);
            this.mPathForBorder.lineTo(f7, f8);
            this.mPathForBorder.lineTo(f, f2);
            canvas.drawPath(this.mPathForBorder, this.mPaint);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawRectangularBackgroundWithBorders(android.graphics.Canvas r25) {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.drawRectangularBackgroundWithBorders(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawRoundedBackgroundWithBorders(android.graphics.Canvas r23) {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.drawRoundedBackgroundWithBorders(android.graphics.Canvas):void");
    }

    public static int fastBorderCompatibleColorOrZero(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    private int getBorderColor(int i) {
        Spacing spacing = this.mBorderRGB;
        float f = spacing != null ? spacing.get(i) : 0.0f;
        Spacing spacing2 = this.mBorderAlpha;
        return colorFromAlphaAndRGBComponents(spacing2 != null ? spacing2.get(i) : 255.0f, f);
    }

    private int getBorderWidth(int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return 0;
        }
        float f = spacing.get(i);
        if (YogaConstants.isUndefined(f)) {
            return -1;
        }
        return Math.round(f);
    }

    public static void getEllipseIntersectionWithLine(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            pointF.x = (float) d21;
            pointF.y = (float) d22;
        }
    }

    private boolean isBorderColorDefined(int i) {
        Spacing spacing = this.mBorderRGB;
        float f = Float.NaN;
        float f2 = spacing != null ? spacing.get(i) : Float.NaN;
        Spacing spacing2 = this.mBorderAlpha;
        if (spacing2 != null) {
            f = spacing2.get(i);
        }
        return !YogaConstants.isUndefined(f2) && !YogaConstants.isUndefined(f);
    }

    private void setBorderAlpha(int i, float f) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i), f)) {
            this.mBorderAlpha.set(i, f);
            invalidateSelf();
        }
    }

    private void setBorderRGB(int i, float f) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i), f)) {
            this.mBorderRGB.set(i, f);
            invalidateSelf();
        }
    }

    private void updatePath() {
        if (this.mNeedUpdatePathForBorderRadius) {
            this.mNeedUpdatePathForBorderRadius = false;
            if (this.mInnerClipPathForBorderRadius == null) {
                this.mInnerClipPathForBorderRadius = new Path();
            }
            if (this.mOuterClipPathForBorderRadius == null) {
                this.mOuterClipPathForBorderRadius = new Path();
            }
            if (this.mPathForBorderRadiusOutline == null) {
                this.mPathForBorderRadiusOutline = new Path();
            }
            if (this.mCenterDrawPath == null) {
                this.mCenterDrawPath = new Path();
            }
            if (this.mInnerClipTempRectForBorderRadius == null) {
                this.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (this.mOuterClipTempRectForBorderRadius == null) {
                this.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (this.mTempRectForBorderRadiusOutline == null) {
                this.mTempRectForBorderRadiusOutline = new RectF();
            }
            if (this.mTempRectForCenterDrawPath == null) {
                this.mTempRectForCenterDrawPath = new RectF();
            }
            this.mInnerClipPathForBorderRadius.reset();
            this.mOuterClipPathForBorderRadius.reset();
            this.mPathForBorderRadiusOutline.reset();
            this.mCenterDrawPath.reset();
            this.mInnerClipTempRectForBorderRadius.set(getBounds());
            this.mOuterClipTempRectForBorderRadius.set(getBounds());
            this.mTempRectForBorderRadiusOutline.set(getBounds());
            this.mTempRectForCenterDrawPath.set(getBounds());
            float fullBorderWidth = getFullBorderWidth();
            if (fullBorderWidth > 0.0f) {
                float f = fullBorderWidth * 0.5f;
                this.mTempRectForCenterDrawPath.inset(f, f);
            }
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            RectF rectF = this.mInnerClipTempRectForBorderRadius;
            rectF.top += directionAwareBorderInsets.top;
            rectF.bottom -= directionAwareBorderInsets.bottom;
            rectF.left += directionAwareBorderInsets.left;
            rectF.right -= directionAwareBorderInsets.right;
            float fullBorderRadius = getFullBorderRadius();
            float borderRadiusOrDefaultTo = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_LEFT);
            float borderRadiusOrDefaultTo2 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_RIGHT);
            float borderRadiusOrDefaultTo3 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_LEFT);
            float borderRadiusOrDefaultTo4 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_RIGHT);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z = getResolvedLayoutDirection() == 1;
                float borderRadius = getBorderRadius(BorderRadiusLocation.TOP_START);
                float borderRadius2 = getBorderRadius(BorderRadiusLocation.TOP_END);
                float borderRadius3 = getBorderRadius(BorderRadiusLocation.BOTTOM_START);
                float borderRadius4 = getBorderRadius(BorderRadiusLocation.BOTTOM_END);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (!YogaConstants.isUndefined(borderRadius)) {
                        borderRadiusOrDefaultTo = borderRadius;
                    }
                    if (!YogaConstants.isUndefined(borderRadius2)) {
                        borderRadiusOrDefaultTo2 = borderRadius2;
                    }
                    if (!YogaConstants.isUndefined(borderRadius3)) {
                        borderRadiusOrDefaultTo3 = borderRadius3;
                    }
                    if (!YogaConstants.isUndefined(borderRadius4)) {
                        borderRadiusOrDefaultTo4 = borderRadius4;
                    }
                    float f2 = z ? borderRadiusOrDefaultTo2 : borderRadiusOrDefaultTo;
                    if (z) {
                        borderRadiusOrDefaultTo2 = borderRadiusOrDefaultTo;
                    }
                    float f3 = z ? borderRadiusOrDefaultTo4 : borderRadiusOrDefaultTo3;
                    if (z) {
                        borderRadiusOrDefaultTo4 = borderRadiusOrDefaultTo3;
                    }
                    borderRadiusOrDefaultTo3 = f3;
                    borderRadiusOrDefaultTo = f2;
                } else {
                    float f4 = z ? borderRadius2 : borderRadius;
                    if (!z) {
                        borderRadius = borderRadius2;
                    }
                    float f5 = z ? borderRadius4 : borderRadius3;
                    if (!z) {
                        borderRadius3 = borderRadius4;
                    }
                    if (!YogaConstants.isUndefined(f4)) {
                        borderRadiusOrDefaultTo = f4;
                    }
                    if (!YogaConstants.isUndefined(borderRadius)) {
                        borderRadiusOrDefaultTo2 = borderRadius;
                    }
                    if (!YogaConstants.isUndefined(f5)) {
                        borderRadiusOrDefaultTo3 = f5;
                    }
                    if (!YogaConstants.isUndefined(borderRadius3)) {
                        borderRadiusOrDefaultTo4 = borderRadius3;
                    }
                }
            }
            float max = Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.left, 0.0f);
            float max2 = Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.top, 0.0f);
            float max3 = Math.max(borderRadiusOrDefaultTo2 - directionAwareBorderInsets.right, 0.0f);
            float max4 = Math.max(borderRadiusOrDefaultTo2 - directionAwareBorderInsets.top, 0.0f);
            float max5 = Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.right, 0.0f);
            float max6 = Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.bottom, 0.0f);
            float max7 = Math.max(borderRadiusOrDefaultTo3 - directionAwareBorderInsets.left, 0.0f);
            float max8 = Math.max(borderRadiusOrDefaultTo3 - directionAwareBorderInsets.bottom, 0.0f);
            this.mInnerClipPathForBorderRadius.addRoundRect(this.mInnerClipTempRectForBorderRadius, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
            this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{borderRadiusOrDefaultTo, borderRadiusOrDefaultTo, borderRadiusOrDefaultTo2, borderRadiusOrDefaultTo2, borderRadiusOrDefaultTo4, borderRadiusOrDefaultTo4, borderRadiusOrDefaultTo3, borderRadiusOrDefaultTo3}, Path.Direction.CW);
            Spacing spacing = this.mBorderWidth;
            float f6 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            float f7 = borderRadiusOrDefaultTo + f6;
            float f8 = borderRadiusOrDefaultTo2 + f6;
            float f9 = borderRadiusOrDefaultTo4 + f6;
            float f10 = borderRadiusOrDefaultTo3 + f6;
            this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{f7, f7, f8, f8, f9, f9, f10, f10}, Path.Direction.CW);
            this.mCenterDrawPath.addRoundRect(this.mTempRectForCenterDrawPath, new float[]{max + f6, max2 + f6, max3 + f6, max4 + f6, max5 + f6, max6 + f6, max7 + f6, max8 + f6}, Path.Direction.CW);
            if (this.mInnerTopLeftCorner == null) {
                this.mInnerTopLeftCorner = new PointF();
            }
            PointF pointF = this.mInnerTopLeftCorner;
            RectF rectF2 = this.mInnerClipTempRectForBorderRadius;
            float f11 = rectF2.left;
            pointF.x = f11;
            float f12 = rectF2.top;
            pointF.y = f12;
            RectF rectF3 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine((double) f11, (double) f12, (double) ((max * 2.0f) + f11), (double) ((max2 * 2.0f) + f12), (double) rectF3.left, (double) rectF3.top, (double) f11, (double) f12, pointF);
            if (this.mInnerBottomLeftCorner == null) {
                this.mInnerBottomLeftCorner = new PointF();
            }
            PointF pointF2 = this.mInnerBottomLeftCorner;
            RectF rectF4 = this.mInnerClipTempRectForBorderRadius;
            float f13 = rectF4.left;
            pointF2.x = f13;
            float f14 = rectF4.bottom;
            pointF2.y = f14;
            RectF rectF5 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine((double) f13, (double) (f14 - (max8 * 2.0f)), (double) ((max7 * 2.0f) + f13), (double) f14, (double) rectF5.left, (double) rectF5.bottom, (double) f13, (double) f14, pointF2);
            if (this.mInnerTopRightCorner == null) {
                this.mInnerTopRightCorner = new PointF();
            }
            PointF pointF3 = this.mInnerTopRightCorner;
            RectF rectF6 = this.mInnerClipTempRectForBorderRadius;
            float f15 = rectF6.right;
            pointF3.x = f15;
            float f16 = rectF6.top;
            pointF3.y = f16;
            RectF rectF7 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine((double) (f15 - (max3 * 2.0f)), (double) f16, (double) f15, (double) ((max4 * 2.0f) + f16), (double) rectF7.right, (double) rectF7.top, (double) f15, (double) f16, pointF3);
            if (this.mInnerBottomRightCorner == null) {
                this.mInnerBottomRightCorner = new PointF();
            }
            PointF pointF4 = this.mInnerBottomRightCorner;
            RectF rectF8 = this.mInnerClipTempRectForBorderRadius;
            float f17 = rectF8.right;
            pointF4.x = f17;
            float f18 = rectF8.bottom;
            pointF4.y = f18;
            RectF rectF9 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine((double) (f17 - (max5 * 2.0f)), (double) (f18 - (max6 * 2.0f)), (double) f17, (double) f18, (double) rectF9.right, (double) rectF9.bottom, (double) f17, (double) f18, pointF4);
        }
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        PathEffect pathEffect = borderStyle != null ? BorderStyle.getPathEffect(borderStyle, getFullBorderWidth()) : null;
        this.mPathEffectForBorderStyle = pathEffect;
        this.mPaint.setPathEffect(pathEffect);
    }

    public void draw(Canvas canvas) {
        updatePathEffect();
        if (!hasRoundedBorders()) {
            drawRectangularBackgroundWithBorders(canvas);
        } else {
            drawRoundedBackgroundWithBorders(canvas);
        }
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public float getBorderRadius(BorderRadiusLocation borderRadiusLocation) {
        return getBorderRadiusOrDefaultTo(Float.NaN, borderRadiusLocation);
    }

    public float getBorderRadiusOrDefaultTo(float f, BorderRadiusLocation borderRadiusLocation) {
        float[] fArr = this.mBorderCornerRadii;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[borderRadiusLocation.ordinal()];
        return YogaConstants.isUndefined(f2) ? f : f2;
    }

    public float getBorderWidthOrDefaultTo(float f, int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return f;
        }
        float raw = spacing.getRaw(i);
        return YogaConstants.isUndefined(raw) ? f : raw;
    }

    @VisibleForTesting
    public int getColor() {
        return this.mColor;
    }

    public RectF getDirectionAwareBorderInsets() {
        float borderWidthOrDefaultTo = getBorderWidthOrDefaultTo(0.0f, 8);
        boolean z = true;
        float borderWidthOrDefaultTo2 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 1);
        float borderWidthOrDefaultTo3 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 3);
        float borderWidthOrDefaultTo4 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 0);
        float borderWidthOrDefaultTo5 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 2);
        if (Build.VERSION.SDK_INT >= 17 && this.mBorderWidth != null) {
            if (getResolvedLayoutDirection() != 1) {
                z = false;
            }
            float raw = this.mBorderWidth.getRaw(4);
            float raw2 = this.mBorderWidth.getRaw(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!YogaConstants.isUndefined(raw)) {
                    borderWidthOrDefaultTo4 = raw;
                }
                if (!YogaConstants.isUndefined(raw2)) {
                    borderWidthOrDefaultTo5 = raw2;
                }
                float f = z ? borderWidthOrDefaultTo5 : borderWidthOrDefaultTo4;
                if (z) {
                    borderWidthOrDefaultTo5 = borderWidthOrDefaultTo4;
                }
                borderWidthOrDefaultTo4 = f;
            } else {
                float f2 = z ? raw2 : raw;
                if (!z) {
                    raw = raw2;
                }
                if (!YogaConstants.isUndefined(f2)) {
                    borderWidthOrDefaultTo4 = f2;
                }
                if (!YogaConstants.isUndefined(raw)) {
                    borderWidthOrDefaultTo5 = raw;
                }
            }
        }
        return new RectF(borderWidthOrDefaultTo4, borderWidthOrDefaultTo2, borderWidthOrDefaultTo5, borderWidthOrDefaultTo3);
    }

    public float getFullBorderRadius() {
        if (YogaConstants.isUndefined(this.mBorderRadius)) {
            return 0.0f;
        }
        return this.mBorderRadius;
    }

    public float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null || YogaConstants.isUndefined(spacing.getRaw(8))) {
            return 0.0f;
        }
        return this.mBorderWidth.getRaw(8);
    }

    public int getOpacity() {
        return ColorUtil.getOpacityFromColor(ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha));
    }

    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((YogaConstants.isUndefined(this.mBorderRadius) || this.mBorderRadius <= 0.0f) && this.mBorderCornerRadii == null) {
            outline.setRect(getBounds());
        } else {
            updatePath();
            outline.setConvexPath(this.mPathForBorderRadiusOutline);
        }
    }

    public int getResolvedLayoutDirection() {
        return this.mLayoutDirection;
    }

    public boolean hasRoundedBorders() {
        if (!YogaConstants.isUndefined(this.mBorderRadius) && this.mBorderRadius > 0.0f) {
            return true;
        }
        float[] fArr = this.mBorderCornerRadii;
        if (fArr != null) {
            for (float f : fArr) {
                if (!YogaConstants.isUndefined(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public boolean onResolvedLayoutDirectionChanged(int i) {
        return false;
    }

    public void setAlpha(int i) {
        if (i != this.mAlpha) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        setBorderRGB(i, f);
        setBorderAlpha(i, f2);
    }

    public void setBorderStyle(@Nullable String str) {
        BorderStyle borderStyle;
        if (str == null) {
            borderStyle = null;
        } else {
            borderStyle = BorderStyle.valueOf(str.toUpperCase(Locale.US));
        }
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderWidth(int i, float f) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (!FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i), f)) {
            this.mBorderWidth.set(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.mNeedUpdatePathForBorderRadius = true;
            }
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.mColor = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRadius(float f) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            this.mBorderRadius = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public boolean setResolvedLayoutDirection(int i) {
        if (this.mLayoutDirection == i) {
            return false;
        }
        this.mLayoutDirection = i;
        return onResolvedLayoutDirectionChanged(i);
    }

    public void setRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            float[] fArr = new float[8];
            this.mBorderCornerRadii = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            this.mBorderCornerRadii[i] = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }
}
