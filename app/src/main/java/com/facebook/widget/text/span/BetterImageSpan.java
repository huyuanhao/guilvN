package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BetterImageSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public final int mAlignment;
    public Rect mBounds;
    public final Drawable mDrawable;
    public final Paint.FontMetricsInt mFontMetricsInt;
    public int mHeight;
    public int mWidth;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BetterImageSpanAlignment {
    }

    public BetterImageSpan(Drawable drawable) {
        this(drawable, 1);
    }

    private int getOffsetAboveBaseline(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.mAlignment;
        if (i == 0) {
            return fontMetricsInt.descent - this.mHeight;
        }
        if (i != 2) {
            return -this.mHeight;
        }
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        return i3 + (((i2 - i3) - this.mHeight) / 2);
    }

    public static final int normalizeAlignment(int i) {
        if (i != 0) {
            return i != 2 ? 1 : 2;
        }
        return 0;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.mFontMetricsInt);
        int offsetAboveBaseline = i4 + getOffsetAboveBaseline(this.mFontMetricsInt);
        canvas.translate(f, (float) offsetAboveBaseline);
        this.mDrawable.draw(canvas);
        canvas.translate(-f, (float) (-offsetAboveBaseline));
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        updateBounds();
        if (fontMetricsInt == null) {
            return this.mWidth;
        }
        int offsetAboveBaseline = getOffsetAboveBaseline(fontMetricsInt);
        int i3 = this.mHeight + offsetAboveBaseline;
        if (offsetAboveBaseline < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = offsetAboveBaseline;
        }
        if (offsetAboveBaseline < fontMetricsInt.top) {
            fontMetricsInt.top = offsetAboveBaseline;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.mWidth;
    }

    public void updateBounds() {
        Rect bounds = this.mDrawable.getBounds();
        this.mBounds = bounds;
        this.mWidth = bounds.width();
        this.mHeight = this.mBounds.height();
    }

    public BetterImageSpan(Drawable drawable, int i) {
        this.mFontMetricsInt = new Paint.FontMetricsInt();
        this.mDrawable = drawable;
        this.mAlignment = i;
        updateBounds();
    }
}
