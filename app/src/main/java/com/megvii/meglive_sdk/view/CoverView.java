package com.megvii.meglive_sdk.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.megvii.meglive_sdk.C1503R;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1580u;
import com.megvii.meglive_sdk.p106f.C1582w;
import java.util.ArrayList;
import java.util.List;

public class CoverView extends View {

    /* renamed from: A */
    public LinearGradient f2672A;

    /* renamed from: B */
    public int f2673B;

    /* renamed from: C */
    public int f2674C;

    /* renamed from: D */
    public float f2675D;

    /* renamed from: E */
    public float f2676E;

    /* renamed from: F */
    public float f2677F;

    /* renamed from: G */
    public float f2678G;

    /* renamed from: H */
    public float f2679H;

    /* renamed from: I */
    public float f2680I;

    /* renamed from: J */
    public float f2681J;

    /* renamed from: K */
    public float f2682K;

    /* renamed from: L */
    public float f2683L;

    /* renamed from: M */
    public float f2684M;

    /* renamed from: N */
    public float f2685N;

    /* renamed from: O */
    public float f2686O;

    /* renamed from: P */
    public float f2687P;

    /* renamed from: Q */
    public float f2688Q;

    /* renamed from: R */
    public float f2689R;

    /* renamed from: S */
    public float f2690S;

    /* renamed from: T */
    public float f2691T;

    /* renamed from: U */
    public float f2692U;

    /* renamed from: V */
    public float f2693V;

    /* renamed from: W */
    public int f2694W;

    /* renamed from: a */
    public Context f2695a;

    /* renamed from: aa */
    public float f2696aa;

    /* renamed from: ab */
    public float f2697ab;

    /* renamed from: ac */
    public float f2698ac;

    /* renamed from: ad */
    public float f2699ad;

    /* renamed from: ae */
    public float f2700ae;

    /* renamed from: af */
    public PorterDuffXfermode f2701af;

    /* renamed from: ag */
    public int f2702ag;

    /* renamed from: ah */
    public float f2703ah;

    /* renamed from: ai */
    public float f2704ai;

    /* renamed from: aj */
    public long f2705aj;

    /* renamed from: ak */
    public float f2706ak;

    /* renamed from: al */
    public int f2707al;

    /* renamed from: am */
    public float f2708am;

    /* renamed from: an */
    public Runnable f2709an;

    /* renamed from: b */
    public int f2710b;

    /* renamed from: c */
    public int f2711c;

    /* renamed from: d */
    public int[] f2712d;

    /* renamed from: e */
    public List<Integer> f2713e;

    /* renamed from: f */
    public String f2714f;

    /* renamed from: g */
    public Bitmap f2715g;

    /* renamed from: h */
    public Canvas f2716h;

    /* renamed from: i */
    public Paint f2717i;

    /* renamed from: j */
    public Paint f2718j;

    /* renamed from: k */
    public Paint f2719k;

    /* renamed from: l */
    public TextPaint f2720l;

    /* renamed from: m */
    public float f2721m;

    /* renamed from: n */
    public int f2722n;

    /* renamed from: o */
    public RectF f2723o;

    /* renamed from: p */
    public Rect f2724p;

    /* renamed from: q */
    public RectF f2725q;

    /* renamed from: r */
    public RectF f2726r;

    /* renamed from: s */
    public RectF f2727s;

    /* renamed from: t */
    public float f2728t;

    /* renamed from: u */
    public int f2729u;

    /* renamed from: v */
    public int f2730v;

    /* renamed from: w */
    public int f2731w;

    /* renamed from: x */
    public int f2732x;

    /* renamed from: y */
    public Matrix f2733y;

    /* renamed from: z */
    public int[] f2734z;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public final void run() {
            CoverView.this.f2708am += CoverView.this.f2706ak * ((float) CoverView.this.f2707al);
            if (CoverView.this.f2708am >= CoverView.this.f2704ai) {
                CoverView coverView = CoverView.this;
                coverView.f2708am = coverView.f2704ai;
                CoverView coverView2 = CoverView.this;
                coverView2.f2707al = -coverView2.f2707al;
            } else if (CoverView.this.f2708am <= CoverView.this.f2703ah) {
                CoverView coverView3 = CoverView.this;
                coverView3.f2708am = coverView3.f2703ah;
                CoverView coverView4 = CoverView.this;
                coverView4.f2707al = -coverView4.f2707al;
            }
            CoverView.this.invalidate();
            CoverView coverView5 = CoverView.this;
            coverView5.postDelayed(coverView5.f2709an, CoverView.this.f2705aj);
        }
    }

    public CoverView(Context context) {
        this(context, null);
    }

    public float getCurProgress() {
        return this.f2721m + this.f2708am;
    }

    public float getImageY() {
        return this.f2728t;
    }

    public float getMCenterX() {
        return this.f2678G;
    }

    public float getMCenterY() {
        return this.f2679H;
    }

    public void onDraw(Canvas canvas) {
        C1571m.m2656b("coverview", "onDraw");
        System.currentTimeMillis();
        m2723a();
        this.f2717i.setStyle(Paint.Style.FILL);
        List<Integer> list = this.f2713e;
        if (list == null || list.isEmpty()) {
            this.f2717i.setColor(getResources().getColor(this.f2730v));
        } else {
            if (this.f2734z == null) {
                this.f2734z = new int[this.f2713e.size()];
            }
            for (int i = 0; i < this.f2713e.size(); i++) {
                this.f2734z[i] = this.f2713e.get(i).intValue();
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f2673B) / this.f2677F, 0.0f, this.f2734z, (float[]) null, Shader.TileMode.CLAMP);
            this.f2672A = linearGradient;
            this.f2717i.setShader(linearGradient);
        }
        if (this.f2715g == null) {
            float f = this.f2677F;
            this.f2715g = Bitmap.createBitmap((int) (((float) this.f2673B) / f), (int) (((float) this.f2674C) / f), Bitmap.Config.ARGB_8888);
        }
        if (this.f2716h == null) {
            this.f2716h = new Canvas(this.f2715g);
        }
        Rect rect = this.f2724p;
        float f2 = this.f2677F;
        rect.set(0, 0, (int) (((float) this.f2673B) / f2), (int) (((float) this.f2674C) / f2));
        this.f2716h.drawRect(this.f2724p, this.f2717i);
        if (this.f2701af == null) {
            this.f2701af = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        }
        this.f2718j.setXfermode(this.f2701af);
        Canvas canvas2 = this.f2716h;
        float f3 = this.f2678G;
        float f4 = this.f2677F;
        canvas2.drawCircle(f3 / f4, this.f2679H / f4, this.f2676E / f4, this.f2718j);
        this.f2718j.setXfermode(null);
        this.f2723o.set(0.0f, 0.0f, (float) this.f2673B, (float) this.f2674C);
        canvas.drawBitmap(this.f2715g, this.f2724p, this.f2723o, this.f2717i);
        this.f2719k.setColor(Color.rgb(221, 221, 221));
        this.f2719k.setStyle(Paint.Style.STROKE);
        this.f2719k.setStrokeWidth((float) this.f2710b);
        canvas.drawCircle(this.f2678G, this.f2679H, this.f2676E, this.f2719k);
        this.f2719k.setColor(getResources().getColor(this.f2729u));
        this.f2719k.setStyle(Paint.Style.STROKE);
        this.f2719k.setStrokeWidth((float) this.f2711c);
        this.f2725q.set(this.f2682K, this.f2683L, this.f2684M, this.f2685N);
        canvas.drawArc(this.f2725q, 90.0f, 360.0f, false, this.f2719k);
        if (this.f2702ag == 0) {
            m2724a(canvas, this.f2721m + this.f2708am);
        } else {
            float f5 = this.f2721m;
            if (f5 != 0.0f) {
                m2724a(canvas, f5);
            } else {
                m2724a(canvas, this.f2708am);
            }
        }
        this.f2720l.setARGB(0, 0, 0, 0);
        this.f2727s.set(this.f2690S, this.f2691T, this.f2692U, this.f2693V);
        canvas.drawRect(this.f2727s, this.f2720l);
        this.f2720l.setColor(getResources().getColor(this.f2731w));
        Paint.FontMetricsInt fontMetricsInt = this.f2720l.getFontMetricsInt();
        this.f2720l.setTextSize((float) this.f2695a.getResources().getDimensionPixelSize(this.f2732x));
        RectF rectF = this.f2727s;
        this.f2720l.setTextAlign(Paint.Align.CENTER);
        StaticLayout staticLayout = new StaticLayout(this.f2714f, this.f2720l, (int) this.f2675D, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        canvas.translate(this.f2727s.centerX(), this.f2727s.top);
        staticLayout.draw(canvas);
        canvas.translate(-this.f2727s.centerX(), -((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f));
    }

    public void setMode(int i) {
        if (this.f2702ag != i) {
            this.f2702ag = i;
            if (i == 0) {
                this.f2707al = 1;
                this.f2708am = 0.0f;
                postDelayed(this.f2709an, this.f2705aj);
                return;
            }
            removeCallbacks(this.f2709an);
        }
    }

    public void setTips(String str) {
        this.f2714f = str;
        invalidate();
    }

    public CoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2710b = 1;
        this.f2711c = 20;
        this.f2712d = new int[]{255, 255, 255, 255};
        this.f2714f = "";
        this.f2721m = 0.0f;
        this.f2673B = 0;
        this.f2674C = 0;
        this.f2675D = 0.0f;
        this.f2676E = 0.0f;
        this.f2677F = 2.0f;
        this.f2678G = 0.0f;
        this.f2679H = 0.0f;
        this.f2680I = (float) 20;
        this.f2681J = 0.0f;
        this.f2682K = 0.0f;
        this.f2683L = 0.0f;
        this.f2684M = 0.0f;
        this.f2685N = 0.0f;
        this.f2686O = 0.0f;
        this.f2687P = 0.0f;
        this.f2688Q = 0.0f;
        this.f2689R = 0.0f;
        this.f2690S = 0.0f;
        this.f2691T = 0.0f;
        this.f2692U = 0.0f;
        this.f2693V = 0.0f;
        this.f2694W = -1;
        this.f2696aa = 0.0f;
        this.f2697ab = 0.0f;
        this.f2698ac = 0.0f;
        this.f2699ad = 0.0f;
        this.f2700ae = 0.75f;
        this.f2702ag = -1;
        this.f2703ah = 3.6f;
        this.f2704ai = 18.0f;
        this.f2705aj = 30;
        this.f2706ak = 0.5f;
        this.f2707al = 1;
        this.f2708am = 0.0f;
        this.f2709an = new OooO00o();
        context.obtainStyledAttributes(attributeSet, C1503R.styleable.CoverView);
        this.f2695a = context;
        Matrix matrix = new Matrix();
        this.f2733y = matrix;
        matrix.setRotate(0.0f);
        this.f2713e = new ArrayList();
        this.f2722n = getResources().getColor(C1580u.m2676a(context).mo17202e(getResources().getString(C1503R.string.key_liveness_home_processBar_color)));
        this.f2729u = C1580u.m2676a(context).mo17202e(getResources().getString(C1503R.string.key_liveness_home_ring_color));
        this.f2730v = C1580u.m2676a(context).mo17202e(getResources().getString(C1503R.string.key_liveness_home_background_color));
        this.f2731w = C1580u.m2676a(context).mo17202e(getResources().getString(C1503R.string.key_liveness_home_prompt_color));
        this.f2732x = C1580u.m2676a(context).mo17203f(getResources().getString(C1503R.string.key_liveness_home_prompt_size));
        this.f2723o = new RectF();
        this.f2724p = new Rect();
        this.f2725q = new RectF();
        this.f2726r = new RectF();
        this.f2727s = new RectF();
        Paint paint = new Paint();
        this.f2717i = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f2718j = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f2719k = paint3;
        paint3.setAntiAlias(true);
        this.f2720l = new TextPaint(1);
        C1571m.m2656b("coverView", "mBorderWid_progress=" + this.f2711c);
        C1582w.m2688a(context);
        new BitmapFactory.Options().inScaled = false;
    }

    /* renamed from: a */
    private void m2723a() {
        int a = C1582w.m2687a(this.f2695a, 6.0f);
        this.f2711c = a;
        this.f2680I = (float) a;
        if (this.f2673B == 0) {
            this.f2673B = getWidth();
        }
        if (this.f2674C == 0) {
            this.f2674C = getHeight();
        }
        if (this.f2675D == 0.0f) {
            float f = ((float) this.f2673B) * this.f2700ae;
            this.f2675D = f;
            this.f2676E = f / 2.0f;
        }
        if (this.f2678G == 0.0f) {
            this.f2678G = (float) (this.f2673B / 2);
        }
        if (this.f2679H == 0.0f) {
            this.f2679H = ((float) this.f2674C) * 0.37f;
        }
        if (this.f2681J == 0.0f) {
            this.f2681J = this.f2675D;
        }
        if (this.f2682K == 0.0f) {
            float f2 = this.f2681J;
            float f3 = (((float) this.f2673B) - f2) / 2.0f;
            this.f2682K = f3;
            float f4 = this.f2679H - this.f2676E;
            this.f2683L = f4;
            this.f2684M = f3 + f2;
            this.f2685N = f2 + f4;
        }
        if (this.f2686O == 0.0f) {
            float f5 = this.f2675D;
            float f6 = (((float) this.f2673B) - f5) / 2.0f;
            this.f2686O = f6;
            float f7 = this.f2679H - this.f2676E;
            this.f2687P = f7;
            this.f2688Q = f6 + f5;
            this.f2689R = f5 + f7;
        }
        if (this.f2691T == 0.0f) {
            float f8 = this.f2676E;
            double d = (double) (0.5f * f8);
            Double.isNaN(d);
            Double.isNaN(d);
            double d2 = (double) (f8 * f8);
            Double.isNaN(d2);
            double sqrt = Math.sqrt((d * d) + d2);
            float f9 = this.f2676E;
            double d3 = (double) f9;
            Double.isNaN(d3);
            Double.isNaN(d);
            double d4 = d3 - d;
            float f10 = this.f2679H;
            float f11 = f10 - f9;
            this.f2691T = f11;
            double d5 = (double) f11;
            Double.isNaN(d5);
            this.f2693V = (float) (d5 + d4);
            float f12 = this.f2678G;
            double d6 = (double) f12;
            Double.isNaN(d6);
            this.f2690S = (float) (d6 - sqrt);
            double d7 = (double) f12;
            Double.isNaN(d7);
            this.f2692U = (float) (d7 + sqrt);
            float a2 = f10 + f9 + ((float) C1582w.m2687a(this.f2695a, 16.0f));
            this.f2691T = a2;
            this.f2693V = a2 + ((float) C1582w.m2687a(this.f2695a, 28.0f));
        }
        if (this.f2696aa == 0.0f) {
            float f13 = this.f2678G;
            float f14 = this.f2676E;
            float f15 = this.f2680I;
            this.f2696aa = (f13 - f14) - f15;
            float f16 = this.f2679H;
            this.f2697ab = (f16 - f14) - f15;
            this.f2698ac = f13 + f14 + f15;
            this.f2699ad = f16 + f14 + f15;
        }
        this.f2728t = this.f2693V + ((float) C1582w.m2687a(this.f2695a, 32.0f));
    }

    /* renamed from: a */
    private void m2724a(Canvas canvas, float f) {
        this.f2719k.setColor(this.f2722n);
        this.f2719k.setStyle(Paint.Style.STROKE);
        this.f2719k.setStrokeWidth((float) this.f2711c);
        this.f2719k.setStrokeCap(Paint.Cap.ROUND);
        this.f2725q.set(this.f2682K, this.f2683L, this.f2684M, this.f2685N);
        canvas.drawArc(this.f2725q, 270.0f, f, false, this.f2719k);
    }

    /* renamed from: a */
    public final void mo17242a(float f, int i) {
        this.f2721m = f;
        this.f2722n = i;
        invalidate();
    }

    /* renamed from: a */
    public final RelativeLayout.LayoutParams mo17241a(int i, int i2) {
        m2723a();
        double d = (double) i;
        Double.isNaN(d);
        double d2 = (double) i2;
        Double.isNaN(d2);
        float f = (float) ((d * 1.0d) / d2);
        float f2 = this.f2681J;
        int i3 = (int) f2;
        int i4 = (int) (f * f2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, (int) this.f2683L, 0, 0);
        C1571m.m2655a("getLayoutParam layout_width", String.valueOf(i3));
        C1571m.m2655a("getLayoutParam layout_height", String.valueOf(i4));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2683L);
        C1571m.m2655a("getLayoutParam progress_rectf_top", sb.toString());
        return layoutParams;
    }
}
