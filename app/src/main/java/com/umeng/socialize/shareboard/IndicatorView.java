package com.umeng.socialize.shareboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class IndicatorView extends View {
    public int mIndicatorMargin;
    public int mIndicatorWidth;
    public float mLeftPosition;
    public Paint mNormalPaint;
    public int mPageCount;
    public Paint mSelectPaint;
    public int mSelectPosition;

    public IndicatorView(Context context) {
        super(context);
    }

    private int measureHeight(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.mIndicatorWidth * 2);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private int measureWidth(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i2 = this.mIndicatorWidth;
        int i3 = this.mPageCount;
        int i4 = paddingLeft + (i2 * i3 * 2) + (this.mIndicatorMargin * (i3 - 1));
        this.mLeftPosition = (((float) (getMeasuredWidth() - i4)) / 2.0f) + ((float) getPaddingLeft());
        if (mode == 1073741824) {
            return Math.max(i4, size);
        }
        return mode == Integer.MIN_VALUE ? Math.min(i4, size) : i4;
    }

    public int dip2px(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mSelectPaint != null && this.mNormalPaint != null) {
            float f = this.mLeftPosition + ((float) this.mIndicatorWidth);
            int i = 0;
            while (i < this.mPageCount) {
                int i2 = this.mIndicatorWidth;
                canvas.drawCircle(f, (float) i2, (float) i2, i == this.mSelectPosition ? this.mSelectPaint : this.mNormalPaint);
                f += (float) (this.mIndicatorMargin + (this.mIndicatorWidth * 2));
                i++;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
    }

    public void setIndicator(int i, int i2) {
        this.mIndicatorMargin = dip2px((float) i2);
        this.mIndicatorWidth = dip2px((float) i);
    }

    public void setIndicatorColor(int i, int i2) {
        Paint paint = new Paint();
        this.mSelectPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mSelectPaint.setAntiAlias(true);
        this.mSelectPaint.setColor(i2);
        Paint paint2 = new Paint();
        this.mNormalPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mNormalPaint.setAntiAlias(true);
        this.mNormalPaint.setColor(i);
    }

    public void setPageCount(int i) {
        this.mPageCount = i;
        invalidate();
    }

    public void setSelectedPosition(int i) {
        this.mSelectPosition = i;
        invalidate();
    }

    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public IndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
