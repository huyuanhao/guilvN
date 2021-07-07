package com.megvii.meglive_sdk.view.color;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.megvii.meglive_sdk.C1503R;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1580u;
import com.megvii.meglive_sdk.p106f.C1582w;
import java.util.ArrayList;
import java.util.List;

public class CoverColorfulView extends View {

    /* renamed from: A */
    public int[] f2763A;

    /* renamed from: B */
    public int f2764B;

    /* renamed from: C */
    public int f2765C;

    /* renamed from: D */
    public float f2766D;

    /* renamed from: E */
    public float f2767E;

    /* renamed from: F */
    public float f2768F;

    /* renamed from: G */
    public float f2769G;

    /* renamed from: H */
    public float f2770H;

    /* renamed from: I */
    public float f2771I;

    /* renamed from: J */
    public float f2772J;

    /* renamed from: K */
    public float f2773K;

    /* renamed from: L */
    public float f2774L;

    /* renamed from: M */
    public float f2775M;

    /* renamed from: N */
    public float f2776N;

    /* renamed from: O */
    public float f2777O;

    /* renamed from: P */
    public float f2778P;

    /* renamed from: Q */
    public float f2779Q;

    /* renamed from: R */
    public float f2780R;

    /* renamed from: S */
    public PorterDuffXfermode f2781S;

    /* renamed from: T */
    public float f2782T;

    /* renamed from: U */
    public float f2783U;

    /* renamed from: V */
    public float f2784V;

    /* renamed from: W */
    public int f2785W;

    /* renamed from: a */
    public Bitmap f2786a;

    /* renamed from: aa */
    public int f2787aa;

    /* renamed from: ab */
    public int f2788ab;

    /* renamed from: ac */
    public boolean f2789ac;

    /* renamed from: ad */
    public boolean f2790ad;

    /* renamed from: ae */
    public boolean f2791ae;

    /* renamed from: af */
    public int[] f2792af;

    /* renamed from: ag */
    public boolean f2793ag;

    /* renamed from: ah */
    public boolean f2794ah;

    /* renamed from: b */
    public ImageView f2795b;

    /* renamed from: c */
    public ImageView f2796c;

    /* renamed from: d */
    public TextView f2797d;

    /* renamed from: e */
    public Context f2798e;

    /* renamed from: f */
    public int f2799f;

    /* renamed from: g */
    public int[] f2800g;

    /* renamed from: h */
    public List<Integer> f2801h;

    /* renamed from: i */
    public String f2802i;

    /* renamed from: j */
    public int f2803j;

    /* renamed from: k */
    public boolean f2804k;

    /* renamed from: l */
    public Canvas f2805l;

    /* renamed from: m */
    public Paint f2806m;

    /* renamed from: n */
    public Paint f2807n;

    /* renamed from: o */
    public Paint f2808o;

    /* renamed from: p */
    public TextPaint f2809p;

    /* renamed from: q */
    public float f2810q;

    /* renamed from: r */
    public int f2811r;

    /* renamed from: s */
    public RectF f2812s;

    /* renamed from: t */
    public Rect f2813t;

    /* renamed from: u */
    public RectF f2814u;

    /* renamed from: v */
    public RectF f2815v;

    /* renamed from: w */
    public int f2816w;

    /* renamed from: x */
    public int f2817x;

    /* renamed from: y */
    public Matrix f2818y;

    /* renamed from: z */
    public int[] f2819z;

    public CoverColorfulView(Context context) {
        this(context, null);
    }

    public float getMCenterX() {
        return this.f2769G;
    }

    public float getMCenterY() {
        return this.f2770H;
    }

    public void onDraw(Canvas canvas) {
        C1571m.m2656b("coverview", "onDraw");
        int a = C1582w.m2687a(this.f2798e, 4.0f);
        this.f2799f = a;
        this.f2771I = (float) a;
        if (this.f2764B == 0) {
            this.f2764B = getWidth();
        }
        if (this.f2765C == 0) {
            this.f2765C = getHeight();
        }
        if (this.f2766D == 0.0f) {
            float f = ((float) this.f2764B) * 0.58f;
            this.f2766D = f;
            this.f2767E = f / 2.0f;
        }
        if (this.f2769G == 0.0f) {
            this.f2769G = (float) (this.f2764B / 2);
        }
        if (this.f2770H == 0.0f) {
            this.f2770H = ((float) this.f2765C) * 0.37f;
        }
        if (this.f2772J == 0.0f) {
            this.f2772J = this.f2766D;
        }
        if (this.f2773K == 0.0f) {
            float f2 = this.f2772J;
            float f3 = (((float) this.f2764B) - f2) / 2.0f;
            this.f2773K = f3;
            float f4 = this.f2770H - this.f2767E;
            this.f2774L = f4;
            this.f2775M = f3 + f2;
            this.f2776N = f2 + f4;
        }
        float f5 = this.f2767E;
        double d = (double) (0.5f * f5);
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = (double) (f5 * f5);
        Double.isNaN(d2);
        double sqrt = Math.sqrt((d * d) + d2);
        float f6 = this.f2767E;
        double d3 = (double) f6;
        Double.isNaN(d3);
        Double.isNaN(d);
        double d4 = d3 - d;
        double d5 = (double) this.f2778P;
        Double.isNaN(d5);
        this.f2780R = (float) (d5 + d4);
        float f7 = this.f2769G;
        double d6 = (double) f7;
        Double.isNaN(d6);
        this.f2777O = (float) (d6 - sqrt);
        double d7 = (double) f7;
        Double.isNaN(d7);
        this.f2779Q = (float) (d7 + sqrt);
        if (this.f2804k) {
            this.f2778P = ((float) this.f2765C) * 0.82f;
        } else {
            this.f2778P = this.f2770H + f6 + ((float) C1582w.m2687a(this.f2798e, 30.0f));
        }
        this.f2780R = this.f2778P + ((float) C1582w.m2687a(this.f2798e, 28.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f2795b.getLayoutParams());
        layoutParams.topMargin = (int) ((this.f2774L + (this.f2771I / 2.0f)) - ((float) C1582w.m2687a(this.f2798e, 3.0f)));
        layoutParams.height = ((int) this.f2766D) + C1582w.m2687a(this.f2798e, 4.0f);
        layoutParams.width = ((int) this.f2766D) + C1582w.m2687a(this.f2798e, 4.0f);
        layoutParams.addRule(14);
        this.f2795b.setLayoutParams(layoutParams);
        this.f2796c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f2797d.getLayoutParams());
        layoutParams2.height = -2;
        layoutParams2.width = -2;
        layoutParams2.addRule(14);
        layoutParams2.topMargin = (int) (this.f2770H + this.f2767E + ((float) C1582w.m2687a(this.f2798e, 40.0f)));
        this.f2797d.setLayoutParams(layoutParams2);
        this.f2806m.setStyle(Paint.Style.FILL);
        Paint paint = this.f2806m;
        int[] iArr = this.f2763A;
        paint.setARGB(255, iArr[0], iArr[1], iArr[2]);
        if (this.f2786a == null) {
            float f8 = this.f2768F;
            this.f2786a = Bitmap.createBitmap((int) (((float) this.f2764B) / f8), (int) (((float) this.f2765C) / f8), Bitmap.Config.ARGB_8888);
        }
        if (this.f2805l == null) {
            this.f2805l = new Canvas(this.f2786a);
        }
        Rect rect = this.f2813t;
        float f9 = this.f2768F;
        rect.set(0, 0, (int) (((float) this.f2764B) / f9), (int) (((float) this.f2765C) / f9));
        this.f2805l.drawRect(this.f2813t, this.f2806m);
        if (this.f2789ac) {
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            int i = this.f2785W;
            int[] iArr2 = this.f2792af;
            paint2.setARGB(i, iArr2[0], iArr2[1], iArr2[2]);
            this.f2805l.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Canvas canvas2 = this.f2805l;
            float f10 = this.f2769G;
            float f11 = this.f2768F;
            canvas2.drawCircle(f10 / f11, this.f2770H / f11, this.f2782T, paint2);
        }
        if (this.f2790ad) {
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            int i2 = this.f2787aa;
            int[] iArr3 = this.f2792af;
            paint3.setARGB(i2, iArr3[0], iArr3[1], iArr3[2]);
            this.f2805l.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Canvas canvas3 = this.f2805l;
            float f12 = this.f2769G;
            float f13 = this.f2768F;
            canvas3.drawCircle(f12 / f13, this.f2770H / f13, this.f2783U, paint3);
        }
        if (this.f2791ae) {
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            int i3 = this.f2788ab;
            int[] iArr4 = this.f2792af;
            paint4.setARGB(i3, iArr4[0], iArr4[1], iArr4[2]);
            this.f2805l.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Canvas canvas4 = this.f2805l;
            float f14 = this.f2769G;
            float f15 = this.f2768F;
            canvas4.drawCircle(f14 / f15, this.f2770H / f15, this.f2784V, paint4);
        }
        if (this.f2781S == null) {
            this.f2781S = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        }
        this.f2807n.setXfermode(this.f2781S);
        Canvas canvas5 = this.f2805l;
        float f16 = this.f2769G;
        float f17 = this.f2768F;
        canvas5.drawCircle(f16 / f17, this.f2770H / f17, this.f2767E / f17, this.f2807n);
        this.f2807n.setXfermode(null);
        this.f2812s.set(0.0f, 0.0f, (float) this.f2764B, (float) this.f2765C);
        canvas.drawBitmap(this.f2786a, this.f2813t, this.f2812s, this.f2806m);
        if (this.f2794ah) {
            this.f2808o.setColor(Color.parseColor("#4d7e7e7e"));
            this.f2808o.setStyle(Paint.Style.STROKE);
            this.f2808o.setStrokeWidth((float) this.f2799f);
            this.f2814u.set(this.f2773K - ((float) C1582w.m2687a(this.f2798e, 5.0f)), this.f2774L - ((float) C1582w.m2687a(this.f2798e, 5.0f)), this.f2775M + ((float) C1582w.m2687a(this.f2798e, 5.0f)), this.f2776N + ((float) C1582w.m2687a(this.f2798e, 5.0f)));
            canvas.drawArc(this.f2814u, 90.0f, 360.0f, false, this.f2808o);
            float f18 = this.f2810q;
            this.f2808o.setColor(this.f2811r);
            this.f2808o.setStyle(Paint.Style.STROKE);
            this.f2808o.setStrokeWidth((float) C1582w.m2687a(this.f2798e, 2.0f));
            this.f2808o.setStrokeCap(Paint.Cap.ROUND);
            this.f2808o.setAntiAlias(true);
            this.f2814u.set(this.f2773K - ((float) C1582w.m2687a(this.f2798e, 5.0f)), this.f2774L - ((float) C1582w.m2687a(this.f2798e, 5.0f)), this.f2775M + ((float) C1582w.m2687a(this.f2798e, 5.0f)), this.f2776N + ((float) C1582w.m2687a(this.f2798e, 5.0f)));
            canvas.drawArc(this.f2814u, -90.0f, f18, false, this.f2808o);
        }
        this.f2809p.setARGB(0, 0, 0, 0);
        this.f2815v.set(this.f2777O, this.f2778P, this.f2779Q, this.f2780R);
        canvas.drawRect(this.f2815v, this.f2809p);
        this.f2809p.setColor(this.f2803j);
        Paint.FontMetricsInt fontMetricsInt = this.f2809p.getFontMetricsInt();
        this.f2809p.setTextSize((float) this.f2798e.getResources().getDimensionPixelSize(this.f2817x));
        RectF rectF = this.f2815v;
        this.f2809p.setTextAlign(Paint.Align.CENTER);
        StaticLayout staticLayout = new StaticLayout(this.f2802i, this.f2809p, (int) this.f2766D, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        canvas.translate(this.f2815v.centerX(), this.f2815v.top);
        staticLayout.draw(canvas);
        canvas.translate(-this.f2815v.centerX(), -((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f));
        if (this.f2793ag) {
            this.f2763A = this.f2819z;
        }
    }

    public void setCircleAnimationTips(String str) {
        this.f2802i = str;
        this.f2804k = true;
    }

    public void setCircleColor(int[] iArr) {
        this.f2792af = iArr;
    }

    public void setDrawRing(boolean z) {
        this.f2794ah = z;
        postInvalidate();
    }

    public void setFalshDraw(int[] iArr) {
        this.f2763A = iArr;
        postInvalidate();
    }

    public void setIsOneStart(boolean z) {
        this.f2789ac = z;
    }

    public void setIsThreeStart(boolean z) {
        this.f2791ae = z;
    }

    public void setIsTwoStart(boolean z) {
        this.f2790ad = z;
    }

    public void setOneCircleAlpha(int i) {
        this.f2785W = i;
    }

    public void setOneCircleRadius(float f) {
        this.f2782T = f;
        postInvalidate();
    }

    public void setStopFlashState(boolean z) {
        this.f2793ag = z;
    }

    public final void setSweepAngle$2549578(float f) {
        this.f2810q = f;
        this.f2811r = -1;
        postInvalidate();
    }

    public void setThreeCircleAlpha(int i) {
        this.f2788ab = i;
    }

    public void setThreeCircleRadius(float f) {
        this.f2784V = f;
        postInvalidate();
    }

    public void setTips(String str) {
        this.f2802i = str;
        this.f2804k = false;
        postInvalidate();
    }

    public void setTipsColor(int i) {
        this.f2803j = i;
    }

    public void setTwoCircleAlpha(int i) {
        this.f2787aa = i;
    }

    public void setTwoCircleRadius(float f) {
        this.f2783U = f;
        postInvalidate();
    }

    public CoverColorfulView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoverColorfulView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2799f = 20;
        this.f2800g = new int[]{255, 255, 255, 255};
        this.f2802i = "";
        this.f2810q = 0.0f;
        int[] iArr = {255, 255, 255};
        this.f2819z = iArr;
        this.f2763A = iArr;
        this.f2764B = 0;
        this.f2765C = 0;
        this.f2766D = 0.0f;
        this.f2767E = 0.0f;
        this.f2768F = 2.0f;
        this.f2769G = 0.0f;
        this.f2770H = 0.0f;
        this.f2771I = (float) 20;
        this.f2772J = 0.0f;
        this.f2773K = 0.0f;
        this.f2774L = 0.0f;
        this.f2775M = 0.0f;
        this.f2776N = 0.0f;
        this.f2777O = 0.0f;
        this.f2778P = 0.0f;
        this.f2779Q = 0.0f;
        this.f2780R = 0.0f;
        this.f2792af = new int[]{0, 0, 255};
        this.f2793ag = false;
        this.f2794ah = false;
        this.f2798e = context;
        Matrix matrix = new Matrix();
        this.f2818y = matrix;
        matrix.setRotate(0.0f);
        this.f2801h = new ArrayList();
        this.f2811r = Color.parseColor("#ffffff");
        this.f2816w = C1580u.m2676a(context).mo17202e(getResources().getString(C1503R.string.key_liveness_home_prompt_color));
        this.f2817x = C1580u.m2676a(context).mo17203f(getResources().getString(C1503R.string.key_liveness_home_prompt_size));
        this.f2812s = new RectF();
        this.f2813t = new Rect();
        this.f2814u = new RectF();
        this.f2815v = new RectF();
        Paint paint = new Paint();
        this.f2806m = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f2807n = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f2808o = paint3;
        paint3.setAntiAlias(true);
        this.f2809p = new TextPaint(1);
        C1571m.m2656b("coverView", "mBorderWid_progress=" + this.f2799f);
        C1582w.m2688a(context);
        new BitmapFactory.Options().inScaled = false;
    }
}
