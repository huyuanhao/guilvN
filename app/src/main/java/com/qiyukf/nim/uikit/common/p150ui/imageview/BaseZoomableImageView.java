package com.qiyukf.nim.uikit.common.p150ui.imageview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p198j.p200b.C2344c;

/* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.BaseZoomableImageView */
public abstract class BaseZoomableImageView extends View {

    /* renamed from: a */
    public Bitmap f3603a;

    /* renamed from: b */
    public AbstractC1923a f3604b;

    /* renamed from: c */
    public ViewPager f3605c;

    /* renamed from: d */
    public Matrix f3606d;

    /* renamed from: e */
    public Matrix f3607e;

    /* renamed from: f */
    public Matrix f3608f;

    /* renamed from: g */
    public Matrix f3609g;

    /* renamed from: h */
    public Paint f3610h;

    /* renamed from: i */
    public float[] f3611i;

    /* renamed from: j */
    public int f3612j;

    /* renamed from: k */
    public int f3613k;

    /* renamed from: l */
    public float f3614l;

    /* renamed from: m */
    public Runnable f3615m;

    /* renamed from: n */
    public Runnable f3616n;

    /* renamed from: o */
    public double f3617o;

    /* renamed from: p */
    public Runnable f3618p;

    /* renamed from: q */
    public boolean f3619q;

    /* renamed from: r */
    public boolean f3620r;

    /* renamed from: s */
    public boolean f3621s;

    public BaseZoomableImageView(Context context) {
        super(context);
        this.f3606d = new Matrix();
        this.f3607e = new Matrix();
        this.f3608f = new Matrix();
        this.f3609g = new Matrix();
        this.f3611i = new float[9];
        this.f3612j = -1;
        this.f3613k = -1;
        this.f3615m = null;
        this.f3616n = null;
        this.f3617o = AbstractC8352oOoOOoO0.OooO0O0;
        this.f3618p = null;
        this.f3619q = false;
        this.f3620r = false;
        this.f3621s = true;
        m3694a(context);
    }

    public BaseZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3606d = new Matrix();
        this.f3607e = new Matrix();
        this.f3608f = new Matrix();
        this.f3609g = new Matrix();
        this.f3611i = new float[9];
        this.f3612j = -1;
        this.f3613k = -1;
        this.f3615m = null;
        this.f3616n = null;
        this.f3617o = AbstractC8352oOoOOoO0.OooO0O0;
        this.f3618p = null;
        this.f3619q = false;
        this.f3620r = false;
        this.f3621s = true;
        m3694a(context);
    }

    public BaseZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3606d = new Matrix();
        this.f3607e = new Matrix();
        this.f3608f = new Matrix();
        this.f3609g = new Matrix();
        this.f3611i = new float[9];
        this.f3612j = -1;
        this.f3613k = -1;
        this.f3615m = null;
        this.f3616n = null;
        this.f3617o = AbstractC8352oOoOOoO0.OooO0O0;
        this.f3618p = null;
        this.f3619q = false;
        this.f3620r = false;
        this.f3621s = true;
        m3694a(context);
    }

    @TargetApi(21)
    public BaseZoomableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3606d = new Matrix();
        this.f3607e = new Matrix();
        this.f3608f = new Matrix();
        this.f3609g = new Matrix();
        this.f3611i = new float[9];
        this.f3612j = -1;
        this.f3613k = -1;
        this.f3615m = null;
        this.f3616n = null;
        this.f3617o = AbstractC8352oOoOOoO0.OooO0O0;
        this.f3618p = null;
        this.f3619q = false;
        this.f3620r = false;
        this.f3621s = true;
        m3694a(context);
    }

    /* renamed from: a */
    private float m3693a(Matrix matrix, int i) {
        matrix.getValues(this.f3611i);
        return this.f3611i[i];
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m3694a(Context context) {
        Paint paint = new Paint();
        this.f3610h = paint;
        paint.setDither(true);
        this.f3610h.setFilterBitmap(true);
        this.f3610h.setAntiAlias(true);
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f3620r = true;
        } else {
            this.f3620r = false;
        }
        this.f3616n = new Runnable() {
            /* class com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView.RunnableC19161 */

            public final void run() {
                BaseZoomableImageView.this.postInvalidate();
            }
        };
    }

    /* renamed from: a */
    private void m3695a(Matrix matrix) {
        if (matrix != null && matrix.isIdentity()) {
            matrix = null;
        }
        if ((matrix == null && !this.f3609g.isIdentity()) || (matrix != null && !this.f3609g.equals(matrix))) {
            this.f3609g.set(matrix);
            invalidate();
        }
    }

    /* renamed from: c */
    public static /* synthetic */ float m3697c(float f, float f2, float f3) {
        float f4 = (f / f3) - 1.0f;
        return (f2 * ((f4 * f4 * f4) + 1.0f)) + 0.0f;
    }

    /* renamed from: h */
    private Matrix m3698h() {
        this.f3608f.set(this.f3606d);
        this.f3608f.postConcat(this.f3607e);
        return this.f3608f;
    }

    /* renamed from: a */
    public final Bitmap mo34271a() {
        return this.f3603a;
    }

    /* renamed from: a */
    public final void mo34272a(float f) {
        mo34273a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    /* renamed from: a */
    public final void mo34273a(float f, float f2, float f3) {
        float f4 = this.f3614l;
        if (f > f4) {
            f = f4;
        }
        float d = f / mo34284d();
        this.f3607e.postScale(d, d, f2, f3);
        m3695a(m3698h());
        mo34283c();
    }

    /* renamed from: a */
    public final void mo34274a(Bitmap bitmap) {
        mo34275a(bitmap, true);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final void mo34275a(final Bitmap bitmap, final boolean z) {
        Bitmap bitmap2;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 14) {
            if (bitmap == null || (bitmap.getHeight() <= C2344c.m5102a() && bitmap.getWidth() <= C2344c.m5102a())) {
                setLayerType(2, null);
            } else {
                setLayerType(1, null);
            }
        }
        if (getWidth() <= 0) {
            this.f3615m = new Runnable() {
                /* class com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView.RunnableC19172 */

                public final void run() {
                    BaseZoomableImageView.this.mo34275a(bitmap, z);
                }
            };
            return;
        }
        Bitmap bitmap3 = this.f3603a;
        Matrix matrix = this.f3606d;
        if (bitmap != null) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            matrix.reset();
            float min = Math.min(width / ((float) bitmap.getWidth()), 1.0f);
            float min2 = Math.min(height / ((float) bitmap.getHeight()), 1.0f);
            if (min > min2) {
                min = min2;
            }
            matrix.setScale(min, min);
            matrix.postTranslate((width - (((float) bitmap.getWidth()) * min)) / 2.0f, (height - (((float) bitmap.getHeight()) * min)) / 2.0f);
        } else {
            matrix.reset();
        }
        this.f3603a = bitmap;
        if (!(bitmap3 == null || bitmap3 == this.f3603a || bitmap3.isRecycled())) {
            bitmap3.recycle();
        }
        this.f3607e.reset();
        m3695a(m3698h());
        this.f3614l = mo34285e();
        if (z && (bitmap2 = this.f3603a) != null) {
            float width2 = ((float) this.f3612j) / ((float) bitmap2.getWidth());
            if (!this.f3621s || (((float) this.f3603a.getHeight()) / ((float) this.f3603a.getWidth()) <= 5.0f && (!this.f3620r || ((float) this.f3603a.getHeight()) / ((float) this.f3603a.getWidth()) <= 2.0f))) {
                width2 = 0.0f;
                z2 = false;
            }
            if (z2) {
                float d = width2 / mo34284d();
                this.f3606d.reset();
                this.f3607e.postScale(d, d, 0.0f, 0.0f);
                m3695a(m3698h());
                return;
            }
            mo34272a(mo34286f());
        }
    }

    /* renamed from: a */
    public final void mo34276a(ViewPager viewPager) {
        this.f3605c = viewPager;
    }

    /* renamed from: a */
    public final void mo34277a(AbstractC1923a aVar) {
        this.f3604b = aVar;
    }

    /* renamed from: a */
    public final boolean mo34278a(float f, float f2) {
        return this.f3607e.postTranslate(f, f2);
    }

    /* renamed from: b */
    public final void mo34279b() {
        Bitmap bitmap = this.f3603a;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f3603a.recycle();
        }
        this.f3603a = null;
    }

    /* renamed from: b */
    public final void mo34280b(final float f, final float f2) {
        final long currentTimeMillis = System.currentTimeMillis();
        RunnableC19194 r6 = new Runnable() {
            /* class com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView.RunnableC19194 */

            /* renamed from: a */
            public float f3633a;

            /* renamed from: b */
            public float f3634b;

            /* renamed from: c */
            public final /* synthetic */ float f3635c = 300.0f;

            {
                this.f3633a = 0.0f;
                this.f3634b = 0.0f;
            }

            public final void run() {
                float min = Math.min(this.f3635c, (float) (System.currentTimeMillis() - currentTimeMillis));
                float c = BaseZoomableImageView.m3697c(min, f, this.f3635c);
                float c2 = BaseZoomableImageView.m3697c(min, f2, this.f3635c);
                BaseZoomableImageView.this.mo34278a(c - this.f3633a, c2 - this.f3634b);
                BaseZoomableImageView.this.mo34283c();
                this.f3633a = c;
                this.f3634b = c2;
                if (min < this.f3635c) {
                    BaseZoomableImageView baseZoomableImageView = BaseZoomableImageView.this;
                    baseZoomableImageView.f3619q = baseZoomableImageView.post(this);
                    return;
                }
                BaseZoomableImageView.this.mo34287g();
            }
        };
        this.f3618p = r6;
        this.f3619q = post(r6);
    }

    /* renamed from: b */
    public final void mo34281b(float f, final float f2, final float f3) {
        final float d = (f - mo34284d()) / 200.0f;
        final float d2 = mo34284d();
        final long currentTimeMillis = System.currentTimeMillis();
        post(new Runnable() {
            /* class com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView.RunnableC19183 */

            /* renamed from: a */
            public final /* synthetic */ float f3626a = 200.0f;

            public final void run() {
                float min = Math.min(this.f3626a, (float) (System.currentTimeMillis() - currentTimeMillis));
                BaseZoomableImageView.this.mo34273a(d2 + (d * min), f2, f3);
                if (min < this.f3626a) {
                    BaseZoomableImageView.this.post(this);
                }
            }
        });
    }

    /* renamed from: b */
    public final boolean mo34282b(float f) {
        try {
            if (this.f3608f != null) {
                float a = m3693a(this.f3608f, 2);
                float width = ((float) getWidth()) - a;
                if ((a == 0.0f && f <= 0.0f) || (width == ((float) this.f3603a.getWidth()) * m3693a(this.f3608f, 0) && f >= 0.0f)) {
                    System.out.println("ScrollOver");
                    return true;
                }
            }
        } catch (IllegalArgumentException e) {
            C1709a.m3015b("BaseZoomableImageView is scrollover is error", "", e);
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: c */
    public final void mo34283c() {
        float f;
        if (this.f3603a != null) {
            Matrix h = m3698h();
            float[] fArr = {0.0f, 0.0f};
            float[] fArr2 = {(float) this.f3603a.getWidth(), (float) this.f3603a.getHeight()};
            h.mapPoints(fArr);
            h.mapPoints(fArr2);
            float f2 = fArr2[1] - fArr[1];
            float f3 = fArr2[0] - fArr[0];
            float height = (float) getHeight();
            float f4 = 0.0f;
            float height2 = f2 < height ? ((height - f2) / 2.0f) - fArr[1] : fArr[1] > 0.0f ? -fArr[1] : fArr2[1] < height ? ((float) getHeight()) - fArr2[1] : 0.0f;
            float width = (float) getWidth();
            if (f3 < width) {
                width = (width - f3) / 2.0f;
                f = fArr[0];
            } else {
                if (fArr[0] > 0.0f) {
                    f4 = -fArr[0];
                } else if (fArr2[0] < width) {
                    f = fArr2[0];
                }
                mo34278a(f4, height2);
                m3695a(m3698h());
            }
            f4 = width - f;
            mo34278a(f4, height2);
            m3695a(m3698h());
        }
    }

    /* renamed from: d */
    public final float mo34284d() {
        Matrix matrix = this.f3607e;
        if (this.f3603a != null) {
            return m3693a(matrix, 0);
        }
        return 1.0f;
    }

    /* renamed from: e */
    public final float mo34285e() {
        Bitmap bitmap = this.f3603a;
        if (bitmap == null) {
            return 1.0f;
        }
        float max = Math.max(((float) bitmap.getWidth()) / ((float) this.f3612j), ((float) this.f3603a.getHeight()) / ((float) this.f3613k)) * 16.0f;
        if (max < 1.0f) {
            return 1.0f;
        }
        return max;
    }

    /* renamed from: f */
    public final float mo34286f() {
        Bitmap bitmap = this.f3603a;
        if (bitmap == null) {
            return 1.0f;
        }
        return Math.max(Math.min(((float) this.f3612j) / ((float) bitmap.getWidth()), ((float) this.f3613k) / ((float) this.f3603a.getHeight())), 1.0f);
    }

    /* renamed from: g */
    public final void mo34287g() {
        removeCallbacks(this.f3618p);
        if (this.f3619q) {
            this.f3619q = false;
        }
    }

    @SuppressLint({"NewApi"})
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f3603a;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT < 14 || getLayerType() != 2) {
                double currentTimeMillis = (double) System.currentTimeMillis();
                double d = this.f3617o;
                Double.isNaN(currentTimeMillis);
                int i = ((currentTimeMillis - d) > 250.0d ? 1 : ((currentTimeMillis - d) == 250.0d ? 0 : -1));
                Bitmap bitmap2 = this.f3603a;
                Matrix matrix = this.f3609g;
                if (i > 0) {
                    canvas.drawBitmap(bitmap2, matrix, this.f3610h);
                    this.f3617o = (double) System.currentTimeMillis();
                    return;
                }
                canvas.drawBitmap(bitmap2, matrix, null);
                removeCallbacks(this.f3616n);
                postDelayed(this.f3616n, 250);
                return;
            }
            canvas.drawBitmap(this.f3603a, this.f3609g, null);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3612j = i3 - i;
        this.f3613k = i4 - i2;
        Runnable runnable = this.f3615m;
        if (runnable != null) {
            this.f3615m = null;
            runnable.run();
        }
    }
}
