package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.github.mikephil.charting.data.Entry;

/* renamed from: com.pd.sdk.oOoO0ooO  reason: case insensitive filesystem */
public abstract class AbstractC8321oOoO0ooO extends AbstractC8328oOoOO0O {
    public Paint OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8185oOOo0O0 f21418OooO00o;
    public Paint OooO0O0;
    public Paint OooO0OO = new Paint(4);
    public Paint OooO0Oo;

    public AbstractC8321oOoO0ooO(C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooooooo);
        this.f21418OooO00o = oooo0o0;
        Paint paint = new Paint(1);
        this.OooO00o = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.OooO0Oo = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.OooO0Oo.setTextAlign(Paint.Align.CENTER);
        this.OooO0Oo.setTextSize(AbstractC8352oOoOOoO0.OooO00o(9.0f));
        Paint paint3 = new Paint(1);
        this.OooO0O0 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.OooO0O0.setStrokeWidth(2.0f);
        this.OooO0O0.setColor(Color.rgb(255, 187, 115));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m20005OooO00o();

    public abstract void OooO00o(Canvas canvas);

    public abstract void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr);

    public boolean OooO00o(AbstractC8257oOOooOo0 ooooooo0) {
        return ((float) ooooooo0.getData().m19916OooO0O0()) < ((float) ooooooo0.getMaxVisibleCount()) * ((AbstractC8328oOoOO0O) this).OooO00o.OooOOO0();
    }

    public Paint OooO0O0() {
        return this.OooO00o;
    }

    public abstract void OooO0O0(Canvas canvas);

    public Paint OooO0OO() {
        return this.OooO0Oo;
    }

    public abstract void OooO0OO(Canvas canvas);

    public Paint OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(AbstractC8265oOOoooO0 ooooooo0) {
        this.OooO0Oo.setTypeface(ooooooo0.m19947OooO00o());
        this.OooO0Oo.setTextSize(ooooooo0.OooOOo0());
    }

    public void OooO00o(Canvas canvas, AbstractC8239oOOoo00O ooooo00o, float f, Entry entry, int i, float f2, float f3, int i2) {
        this.OooO0Oo.setColor(i2);
        canvas.drawText(ooooo00o.OooO00o(f, entry, i, ((AbstractC8328oOoOO0O) this).OooO00o), f2, f3, this.OooO0Oo);
    }
}
