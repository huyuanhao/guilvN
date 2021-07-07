package com.jinhui365.view.idcard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {
    public static final long OooO00o = 10;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f15042OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Paint f15043OooO00o;
    public int o00oO0O = 0;
    public int o0ooOO0 = 0;
    public int o0ooOOo = 0;

    public CustomView(Context context) {
        super(context);
        this.f15042OooO00o = context;
    }

    private void OooO00o(Canvas canvas) {
        int i = this.o0ooOO0;
        int i2 = i / 5;
        int i3 = (i * 4) / 5;
        int i4 = this.o0ooOOo;
        int i5 = this.o00oO0O + 1;
        this.o00oO0O = i5;
        if (i5 == i3) {
            this.o00oO0O = i2;
        }
        int i6 = this.o00oO0O;
        canvas.drawRect((float) i6, 0.0f, (float) (i6 + 3), (float) i4, this.f15043OooO00o);
    }

    public void onDraw(Canvas canvas) {
        this.o0ooOO0 = canvas.getWidth();
        this.o0ooOOo = canvas.getHeight();
        OooO00o(canvas);
        postInvalidateDelayed(10, 0, 0, this.o0ooOO0, this.o0ooOOo);
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public CustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15042OooO00o = context;
        Paint paint = new Paint(1);
        this.f15043OooO00o = paint;
        paint.setColor(-1);
    }

    public CustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15042OooO00o = context;
    }
}
