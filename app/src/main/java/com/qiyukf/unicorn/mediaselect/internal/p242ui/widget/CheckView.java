package com.qiyukf.unicorn.mediaselect.internal.p242ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.p118pd.sdk.C7023o000o0o0;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p231j.C2690a;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.CheckView */
public class CheckView extends View {

    /* renamed from: a */
    public boolean f5786a;

    /* renamed from: b */
    public boolean f5787b;

    /* renamed from: c */
    public int f5788c;

    /* renamed from: d */
    public Paint f5789d;

    /* renamed from: e */
    public Paint f5790e;

    /* renamed from: f */
    public TextPaint f5791f;

    /* renamed from: g */
    public Paint f5792g;

    /* renamed from: h */
    public Drawable f5793h;

    /* renamed from: i */
    public float f5794i;

    /* renamed from: j */
    public Rect f5795j;

    /* renamed from: k */
    public boolean f5796k = true;

    public CheckView(Context context) {
        super(context);
        m6424a(context);
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6424a(context);
    }

    public CheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6424a(context);
    }

    /* renamed from: a */
    private void m6423a() {
        if (this.f5790e == null) {
            Paint paint = new Paint();
            this.f5790e = paint;
            paint.setAntiAlias(true);
            this.f5790e.setStyle(Paint.Style.FILL);
            this.f5790e.setColor(C2690a.m6219a().mo36462d() ? Color.parseColor(C2690a.m6219a().mo36461c().mo35690b()) : C7023o000o0o0.OooO00o(getResources(), C2364R.C2365color.ysf_blue_337EFF, getContext().getTheme()));
        }
    }

    /* renamed from: a */
    private void m6424a(Context context) {
        this.f5794i = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.f5789d = paint;
        paint.setAntiAlias(true);
        this.f5789d.setStyle(Paint.Style.STROKE);
        this.f5789d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f5789d.setStrokeWidth(this.f5794i * 3.0f);
        this.f5789d.setColor(C7023o000o0o0.OooO00o(getResources(), C2364R.C2365color.ysf_item_checkCircle_borderColor, getContext().getTheme()));
        this.f5793h = C7023o000o0o0.m18287OooO00o(context.getResources(), C2364R.C2366drawable.ysf_ic_check_white_18dp, context.getTheme());
    }

    /* renamed from: a */
    public final void mo36591a(int i) {
        if (!this.f5786a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        } else if (i == Integer.MIN_VALUE || i > 0) {
            this.f5788c = i;
            invalidate();
        } else {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
    }

    /* renamed from: a */
    public final void mo36592a(boolean z) {
        if (!this.f5786a) {
            this.f5787b = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    /* renamed from: b */
    public final void mo36593b(boolean z) {
        this.f5786a = z;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5792g == null) {
            Paint paint = new Paint();
            this.f5792g = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.f5792g;
            float f = this.f5794i;
            paint2.setShader(new RadialGradient((f * 48.0f) / 2.0f, (f * 48.0f) / 2.0f, f * 19.0f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#0D000000"), Color.parseColor("#0D000000"), Color.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f2 = this.f5794i;
        canvas.drawCircle((f2 * 48.0f) / 2.0f, (f2 * 48.0f) / 2.0f, f2 * 19.0f, this.f5792g);
        float f3 = this.f5794i;
        canvas.drawCircle((f3 * 48.0f) / 2.0f, (f3 * 48.0f) / 2.0f, f3 * 11.5f, this.f5789d);
        if (this.f5786a) {
            if (this.f5788c != Integer.MIN_VALUE) {
                m6423a();
                float f4 = this.f5794i;
                canvas.drawCircle((f4 * 48.0f) / 2.0f, (48.0f * f4) / 2.0f, f4 * 11.0f, this.f5790e);
                if (this.f5791f == null) {
                    TextPaint textPaint = new TextPaint();
                    this.f5791f = textPaint;
                    textPaint.setAntiAlias(true);
                    this.f5791f.setColor(-1);
                    this.f5791f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.f5791f.setTextSize(this.f5794i * 12.0f);
                }
                String valueOf = String.valueOf(this.f5788c);
                canvas.drawText(valueOf, (float) (((int) (((float) canvas.getWidth()) - this.f5791f.measureText(valueOf))) / 2), (float) (((int) ((((float) canvas.getHeight()) - this.f5791f.descent()) - this.f5791f.ascent())) / 2), this.f5791f);
            }
        } else if (this.f5787b) {
            m6423a();
            float f5 = this.f5794i;
            canvas.drawCircle((f5 * 48.0f) / 2.0f, (f5 * 48.0f) / 2.0f, f5 * 11.0f, this.f5790e);
            Drawable drawable = this.f5793h;
            if (this.f5795j == null) {
                float f6 = this.f5794i;
                int i = (int) (((f6 * 48.0f) / 2.0f) - ((f6 * 16.0f) / 2.0f));
                float f7 = this.f5794i;
                float f8 = (float) i;
                this.f5795j = new Rect(i, i, (int) ((f7 * 48.0f) - f8), (int) ((f7 * 48.0f) - f8));
            }
            drawable.setBounds(this.f5795j);
            this.f5793h.draw(canvas);
        }
        setAlpha(this.f5796k ? 1.0f : 0.5f);
    }

    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.f5794i * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setEnabled(boolean z) {
        if (this.f5796k != z) {
            this.f5796k = z;
            invalidate();
        }
    }
}
