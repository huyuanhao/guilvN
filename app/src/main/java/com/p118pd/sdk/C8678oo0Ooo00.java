package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.jinhui365.p088rn.C1418R;

/* renamed from: com.pd.sdk.oo0Ooo00  reason: case insensitive filesystem */
public class C8678oo0Ooo00 extends View {
    public Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Paint f21830OooO00o;
    public Paint OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f21831OooO0O0;
    public int o00oO0O = 30;
    public int o0OOO0o = 50;
    public int o0ooOO0 = 8;
    public int o0ooOOo = 840;
    public int o0ooOoO = 540;

    public C8678oo0Ooo00(Context context) {
        super(context);
        this.OooO00o = (Activity) context;
    }

    public void onDraw(Canvas canvas) {
        if (!this.f21831OooO0O0) {
            int OooO00o2 = C8734oo0oOOO.OooO00o(this.OooO00o, (float) this.o00oO0O);
            Paint paint = new Paint();
            this.f21830OooO00o = paint;
            paint.setStrokeWidth(1.0f);
            this.f21830OooO00o.setStyle(Paint.Style.STROKE);
            this.f21830OooO00o.setAntiAlias(true);
            this.f21830OooO00o.setColor(-1);
            Paint paint2 = new Paint();
            this.OooO0O0 = paint2;
            paint2.setStrokeWidth((float) this.o0ooOO0);
            this.OooO0O0.setStyle(Paint.Style.STROKE);
            this.OooO0O0.setAntiAlias(true);
            this.OooO0O0.setColor(this.OooO00o.getResources().getColor(C1418R.C1419color.jh_btn_normal_up));
            int height = getHeight() - (C8734oo0oOOO.OooO00o(this.OooO00o, (float) this.o0OOO0o) * 2);
            int i = (this.o0ooOOo * height) / this.o0ooOoO;
            int height2 = (getHeight() - height) / 2;
            int width = (getWidth() - i) / 2;
            int i2 = width + i;
            int i3 = height2 + height;
            int i4 = this.o0ooOO0 / 2;
            float f = (float) (width - i4);
            float f2 = (float) (height2 - i4);
            float f3 = (float) (i2 + i4);
            float f4 = (float) (i4 + i3);
            canvas.clipRect(new RectF(f, f2, f3, f4), Region.Op.DIFFERENCE);
            canvas.drawColor(Color.parseColor("#a0000000"));
            canvas.drawRect(new Rect(width, height2, i2, i3), this.f21830OooO00o);
            float f5 = (float) (width + OooO00o2);
            canvas.drawLine(f, f2, f5, f2, this.OooO0O0);
            float f6 = (float) (height2 + OooO00o2);
            canvas.drawLine(f, (float) (height2 - this.o0ooOO0), f, f6, this.OooO0O0);
            canvas.drawLine(f, f4, f5, f4, this.OooO0O0);
            float f7 = (float) (i3 - OooO00o2);
            canvas.drawLine(f, (float) (this.o0ooOO0 + i3), f, f7, this.OooO0O0);
            float f8 = (float) (i2 - OooO00o2);
            canvas.drawLine(f3, f2, f8, f2, this.OooO0O0);
            canvas.drawLine(f3, (float) (height2 - this.o0ooOO0), f3, f6, this.OooO0O0);
            canvas.drawLine(f3, f4, f8, f4, this.OooO0O0);
            canvas.drawLine(f3, (float) (i3 + this.o0ooOO0), f3, f7, this.OooO0O0);
            canvas.save();
        }
    }

    public C8678oo0Ooo00(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO00o = (Activity) context;
    }
}
