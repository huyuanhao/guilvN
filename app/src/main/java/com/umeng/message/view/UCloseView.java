package com.umeng.message.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.Button;
import com.umeng.message.proguard.C3846j;

public class UCloseView extends Button {

    /* renamed from: cx */
    public float f10611cx;

    /* renamed from: cy */
    public float f10612cy;
    public float lineWith;
    public Paint mPaint = new Paint();

    /* renamed from: p */
    public float f10613p;
    public float radius;
    public int remain;

    public UCloseView(Context context) {
        super(context);
        setBackgroundColor(0);
        this.remain = C3846j.m10571a(context, 1.0f);
        this.lineWith = (float) C3846j.m10571a(context, 2.0f);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f10611cx = (float) (getWidth() / 2);
        this.f10612cy = (float) (getHeight() / 2);
        float min = (float) ((Math.min(getHeight(), getWidth()) / 2) - this.remain);
        this.radius = min;
        this.f10613p = min / 1.4142f;
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(-16777216);
        this.mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f10611cx, this.f10612cy, this.radius, this.mPaint);
        this.mPaint.setColor(-1);
        this.mPaint.setStrokeWidth(this.lineWith);
        this.mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(this.f10611cx, this.f10612cy, this.radius, this.mPaint);
        float f = this.f10611cx;
        float f2 = this.f10613p;
        float f3 = this.f10612cy;
        canvas.drawLine(f - f2, f3 - f2, f + f2, f3 + f2, this.mPaint);
        float f4 = this.f10611cx;
        float f5 = this.f10613p;
        float f6 = this.f10612cy;
        canvas.drawLine(f4 + f5, f6 - f5, f4 - f5, f6 + f5, this.mPaint);
    }
}
