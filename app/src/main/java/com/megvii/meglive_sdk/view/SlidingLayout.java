package com.megvii.meglive_sdk.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.megvii.meglive_sdk.C1503R;

public class SlidingLayout extends FrameLayout {

    /* renamed from: a */
    public Activity f2735a;

    /* renamed from: b */
    public Scroller f2736b;

    /* renamed from: c */
    public Drawable f2737c;

    /* renamed from: d */
    public int f2738d;

    /* renamed from: e */
    public int f2739e;

    /* renamed from: f */
    public int f2740f;

    /* renamed from: g */
    public int f2741g;

    /* renamed from: h */
    public int f2742h;

    /* renamed from: i */
    public int f2743i;

    /* renamed from: j */
    public int f2744j;

    /* renamed from: k */
    public boolean f2745k;

    public SlidingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void computeScroll() {
        if (this.f2736b.computeScrollOffset()) {
            scrollTo(this.f2736b.getCurrX(), 0);
            postInvalidate();
        } else if ((-getScrollX()) >= getWidth()) {
            this.f2735a.finish();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f2737c.setBounds(0, 0, this.f2738d, getHeight());
        canvas.save();
        canvas.translate((float) (-this.f2738d), 0.0f);
        this.f2737c.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f2739e = x;
            this.f2740f = x;
            this.f2741g = y;
        } else if (action == 1) {
            this.f2741g = 0;
            this.f2740f = 0;
            this.f2739e = 0;
        } else if (action == 2) {
            int i = x - this.f2740f;
            int i2 = y - this.f2741g;
            if (this.f2739e < getWidth() / 10 && Math.abs(i) > Math.abs(i2)) {
                z = true;
            }
            this.f2740f = x;
            this.f2741g = y;
        }
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2742h = x;
            this.f2743i = x;
            this.f2744j = y;
        } else if (action == 1) {
            this.f2745k = false;
            this.f2744j = 0;
            this.f2743i = 0;
            this.f2742h = 0;
            if ((-getScrollX()) < getWidth() / 2) {
                this.f2736b.startScroll(getScrollX(), 0, -getScrollX(), 0, 300);
                invalidate();
            } else {
                this.f2736b.startScroll(getScrollX(), 0, (-getScrollX()) - getWidth(), 0, 300);
                invalidate();
            }
        } else if (action == 2) {
            int i = x - this.f2743i;
            int i2 = y - this.f2744j;
            if (!this.f2745k && this.f2742h < getWidth() / 10 && Math.abs(i) > Math.abs(i2)) {
                this.f2745k = true;
            }
            if (this.f2745k) {
                int x2 = this.f2743i - ((int) motionEvent.getX());
                if (getScrollX() + x2 >= 0) {
                    scrollTo(0, 0);
                } else {
                    scrollBy(x2, 0);
                }
            }
            this.f2743i = x;
            this.f2744j = y;
        }
        return true;
    }

    public SlidingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2745k = false;
        this.f2736b = new Scroller(context);
        this.f2737c = getResources().getDrawable(C1503R.C1505drawable.megvii_liveness_left_shadow);
        this.f2738d = ((int) getResources().getDisplayMetrics().density) * 16;
    }
}
