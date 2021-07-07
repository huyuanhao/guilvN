package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7086o00OO0OO;
import com.p118pd.sdk.C7189o00oO00o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {
    public static final float OooO = 2.5f;
    public static final Interpolator OooO00o = new LinearInterpolator();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f14684OooO00o = {-16777216};
    public static final Interpolator OooO0O0 = new C7189o00oO00o();
    public static final float OooO0o = 11.0f;
    public static final float OooO0oO = 3.0f;
    public static final float OooO0oo = 7.5f;
    public static final float OooOO0 = 0.75f;
    public static final float OooOO0O = 0.5f;
    public static final float OooOO0o = 216.0f;
    public static final float OooOOO = 0.01f;
    public static final float OooOOO0 = 0.8f;
    public static final float OooOOOO = 0.20999998f;
    public static final int o00oO0O = 0;
    public static final int o0OO00O = 1332;
    public static final int o0OOO0o = 10;
    public static final int o0Oo0oo = 5;
    public static final int o0ooOO0 = 12;
    public static final int o0ooOOo = 6;
    public static final int o0ooOoO = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Animator f14685OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Resources f14686OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f14687OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14688OooO0O0;
    public float OooO0Oo;
    public float OooO0o0;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.OooO00o(floatValue, this.OooO00o);
            CircularProgressDrawable.this.OooO00o(floatValue, this.OooO00o, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    public class OooO0O0 implements Animator.AnimatorListener {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.OooO00o(1.0f, this.OooO00o, true);
            this.OooO00o.m14909OooO0OO();
            this.OooO00o.m14903OooO00o();
            CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
            if (circularProgressDrawable.f14688OooO0O0) {
                circularProgressDrawable.f14688OooO0O0 = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.OooO00o.OooO00o(false);
                return;
            }
            circularProgressDrawable.OooO0o0 += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.OooO0o0 = 0.0f;
        }
    }

    public static class OooO0OO {
        public float OooO;
        public float OooO00o = 0.0f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f14691OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Paint f14692OooO00o = new Paint();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Path f14693OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final RectF f14694OooO00o = new RectF();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14695OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f14696OooO00o;
        public float OooO0O0 = 0.0f;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f14697OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final Paint f14698OooO0O0 = new Paint();
        public float OooO0OO = 0.0f;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public int f14699OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public final Paint f14700OooO0OO = new Paint();
        public float OooO0Oo = 5.0f;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public int f14701OooO0Oo = 255;
        public float OooO0o;
        public float OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public int f14702OooO0o0;
        public float OooO0oO;
        public float OooO0oo = 1.0f;

        public OooO0OO() {
            this.f14692OooO00o.setStrokeCap(Paint.Cap.SQUARE);
            this.f14692OooO00o.setAntiAlias(true);
            this.f14692OooO00o.setStyle(Paint.Style.STROKE);
            this.f14698OooO0O0.setStyle(Paint.Style.FILL);
            this.f14698OooO0O0.setAntiAlias(true);
            this.f14700OooO0OO.setColor(0);
        }

        public float OooO() {
            return this.OooO0oO;
        }

        public void OooO00o(float f, float f2) {
            this.f14697OooO0O0 = (int) f;
            this.f14699OooO0OO = (int) f2;
        }

        public void OooO0O0(int i) {
            this.f14700OooO0OO.setColor(i);
        }

        public float OooO0OO() {
            return (float) this.f14697OooO0O0;
        }

        public void OooO0Oo(int i) {
            this.f14691OooO00o = i;
            this.f14702OooO0o0 = this.f14696OooO00o[i];
        }

        public void OooO0o(float f) {
            this.OooO0Oo = f;
            this.f14692OooO00o.setStrokeWidth(f);
        }

        public void OooO0o0(float f) {
            this.OooO00o = f;
        }

        public float OooO0oO() {
            return this.OooO00o;
        }

        public float OooO0oo() {
            return this.OooO0o;
        }

        public float OooOO0() {
            return this.OooO0o0;
        }

        public float OooOO0O() {
            return this.OooO0Oo;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public int m14906OooO0O0() {
            return this.f14700OooO0OO.getColor();
        }

        public void OooO0OO(int i) {
            this.f14702OooO0o0 = i;
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public int m14911OooO0o0() {
            return this.f14696OooO00o[this.f14691OooO00o];
        }

        public void OooO00o(Paint.Cap cap) {
            this.f14692OooO00o.setStrokeCap(cap);
        }

        public void OooO0O0(float f) {
            this.OooO = f;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public int m14908OooO0OO() {
            return this.f14696OooO00o[m14910OooO0Oo()];
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public int m14910OooO0Oo() {
            return (this.f14691OooO00o + 1) % this.f14696OooO00o.length;
        }

        public float OooO0o() {
            return this.OooO0OO;
        }

        public float OooO0o0() {
            return this.OooO0O0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Paint.Cap m14902OooO00o() {
            return this.f14692OooO00o.getStrokeCap();
        }

        public float OooO0O0() {
            return this.OooO0oo;
        }

        public void OooO0OO(float f) {
            this.OooO0O0 = f;
        }

        public void OooO0Oo(float f) {
            this.OooO0OO = f;
        }

        public float OooO00o() {
            return (float) this.f14699OooO0OO;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14907OooO0O0() {
            this.OooO0o0 = 0.0f;
            this.OooO0o = 0.0f;
            this.OooO0oO = 0.0f;
            OooO0o0(0.0f);
            OooO0OO(0.0f);
            OooO0Oo(0.0f);
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m14909OooO0OO() {
            this.OooO0o0 = this.OooO00o;
            this.OooO0o = this.OooO0O0;
            this.OooO0oO = this.OooO0OO;
        }

        public float OooO0Oo() {
            return this.OooO;
        }

        public void OooO00o(Canvas canvas, Rect rect) {
            RectF rectF = this.f14694OooO00o;
            float f = this.OooO;
            float f2 = (this.OooO0Oo / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f14697OooO0O0) * this.OooO0oo) / 2.0f, this.OooO0Oo / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.OooO00o;
            float f4 = this.OooO0OO;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.OooO0O0 + f4) * 360.0f) - f5;
            this.f14692OooO00o.setColor(this.f14702OooO0o0);
            this.f14692OooO00o.setAlpha(this.f14701OooO0Oo);
            float f7 = this.OooO0Oo / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f14700OooO0OO);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f14692OooO00o);
            OooO00o(canvas, f5, f6, rectF);
        }

        public void OooO00o(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f14695OooO00o) {
                Path path = this.f14693OooO00o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f14693OooO00o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f14693OooO00o.moveTo(0.0f, 0.0f);
                this.f14693OooO00o.lineTo(((float) this.f14697OooO0O0) * this.OooO0oo, 0.0f);
                Path path3 = this.f14693OooO00o;
                float f3 = this.OooO0oo;
                path3.lineTo((((float) this.f14697OooO0O0) * f3) / 2.0f, ((float) this.f14699OooO0OO) * f3);
                this.f14693OooO00o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f14697OooO0O0) * this.OooO0oo) / 2.0f), rectF.centerY() + (this.OooO0Oo / 2.0f));
                this.f14693OooO00o.close();
                this.f14698OooO0O0.setColor(this.f14702OooO0o0);
                this.f14698OooO0O0.setAlpha(this.f14701OooO0Oo);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f14693OooO00o, this.f14698OooO0O0);
                canvas.restore();
            }
        }

        public void OooO00o(@NonNull int[] iArr) {
            this.f14696OooO00o = iArr;
            OooO0Oo(0);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int[] m14905OooO00o() {
            return this.f14696OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14903OooO00o() {
            OooO0Oo(m14910OooO0Oo());
        }

        public void OooO00o(ColorFilter colorFilter) {
            this.f14692OooO00o.setColorFilter(colorFilter);
        }

        public void OooO00o(int i) {
            this.f14701OooO0Oo = i;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m14901OooO00o() {
            return this.f14701OooO0Oo;
        }

        public void OooO00o(boolean z) {
            if (this.f14695OooO00o != z) {
                this.f14695OooO00o = z;
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14904OooO00o() {
            return this.f14695OooO00o;
        }

        public void OooO00o(float f) {
            if (f != this.OooO0oo) {
                this.OooO0oo = f;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ProgressDrawableSize {
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.f14686OooO00o = ((Context) C7086o00OO0OO.OooO00o(context)).getResources();
        OooO0OO oooO0OO = new OooO0OO();
        this.f14687OooO00o = oooO0OO;
        oooO0OO.OooO00o(f14684OooO00o);
        OooO0Oo(2.5f);
        OooO00o();
    }

    private float OooO() {
        return this.OooO0Oo;
    }

    private int OooO00o(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    private void OooO00o(float f, float f2, float f3, float f4) {
        OooO0OO oooO0OO = this.f14687OooO00o;
        float f5 = this.f14686OooO00o.getDisplayMetrics().density;
        oooO0OO.OooO0o(f2 * f5);
        oooO0OO.OooO0O0(f * f5);
        oooO0OO.OooO0Oo(0);
        oooO0OO.OooO00o(f3 * f5, f4 * f5);
    }

    public void OooO0O0(int i) {
        if (i == 0) {
            OooO00o(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            OooO00o(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public float OooO0OO() {
        return this.f14687OooO00o.OooO0OO();
    }

    public void OooO0Oo(float f) {
        this.f14687OooO00o.OooO0o(f);
        invalidateSelf();
    }

    public float OooO0o() {
        return this.f14687OooO00o.OooO0o();
    }

    public float OooO0o0() {
        return this.f14687OooO00o.OooO0o0();
    }

    public float OooO0oO() {
        return this.f14687OooO00o.OooO0oO();
    }

    public float OooO0oo() {
        return this.f14687OooO00o.OooOO0O();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.OooO0Oo, bounds.exactCenterX(), bounds.exactCenterY());
        this.f14687OooO00o.OooO00o(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f14687OooO00o.m14901OooO00o();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f14685OooO00o.isRunning();
    }

    public void setAlpha(int i) {
        this.f14687OooO00o.OooO00o(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f14687OooO00o.OooO00o(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f14685OooO00o.cancel();
        this.f14687OooO00o.m14909OooO0OO();
        if (this.f14687OooO00o.OooO0o0() != this.f14687OooO00o.OooO0oO()) {
            this.f14688OooO0O0 = true;
            this.f14685OooO00o.setDuration(666);
            this.f14685OooO00o.start();
            return;
        }
        this.f14687OooO00o.OooO0Oo(0);
        this.f14687OooO00o.m14907OooO0O0();
        this.f14685OooO00o.setDuration(1332);
        this.f14685OooO00o.start();
    }

    public void stop() {
        this.f14685OooO00o.cancel();
        OooO0o0(0.0f);
        this.f14687OooO00o.OooO00o(false);
        this.f14687OooO00o.OooO0Oo(0);
        this.f14687OooO00o.m14907OooO0O0();
        invalidateSelf();
    }

    private void OooO0o0(float f) {
        this.OooO0Oo = f;
    }

    public void OooO0OO(float f) {
        this.f14687OooO00o.OooO0Oo(f);
        invalidateSelf();
    }

    public float OooO0Oo() {
        return this.f14687OooO00o.OooO0Oo();
    }

    public void OooO0O0(float f) {
        this.f14687OooO00o.OooO0O0(f);
        invalidateSelf();
    }

    public float OooO0O0() {
        return this.f14687OooO00o.OooO0O0();
    }

    public void OooO0O0(float f, float f2) {
        this.f14687OooO00o.OooO0o0(f);
        this.f14687OooO00o.OooO0OO(f2);
        invalidateSelf();
    }

    public void OooO00o(@NonNull Paint.Cap cap) {
        this.f14687OooO00o.OooO00o(cap);
        invalidateSelf();
    }

    private void OooO0O0(float f, OooO0OO oooO0OO) {
        OooO00o(f, oooO0OO);
        oooO0OO.OooO0o0(oooO0OO.OooOO0() + (((oooO0OO.OooO0oo() - 0.01f) - oooO0OO.OooOO0()) * f));
        oooO0OO.OooO0OO(oooO0OO.OooO0oo());
        oooO0OO.OooO0Oo(oooO0OO.OooO() + ((((float) (Math.floor((double) (oooO0OO.OooO() / 0.8f)) + 1.0d)) - oooO0OO.OooO()) * f));
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Paint.Cap m14898OooO00o() {
        return this.f14687OooO00o.m14902OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m14896OooO00o() {
        return this.f14687OooO00o.OooO00o();
    }

    public void OooO00o(float f, float f2) {
        this.f14687OooO00o.OooO00o(f, f2);
        invalidateSelf();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14899OooO00o() {
        return this.f14687OooO00o.m14904OooO00o();
    }

    public void OooO00o(boolean z) {
        this.f14687OooO00o.OooO00o(z);
        invalidateSelf();
    }

    public void OooO00o(float f) {
        this.f14687OooO00o.OooO00o(f);
        invalidateSelf();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m14897OooO00o() {
        return this.f14687OooO00o.m14906OooO0O0();
    }

    public void OooO00o(int i) {
        this.f14687OooO00o.OooO0O0(i);
        invalidateSelf();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m14900OooO00o() {
        return this.f14687OooO00o.m14905OooO00o();
    }

    public void OooO00o(@NonNull int... iArr) {
        this.f14687OooO00o.OooO00o(iArr);
        this.f14687OooO00o.OooO0Oo(0);
        invalidateSelf();
    }

    public void OooO00o(float f, OooO0OO oooO0OO) {
        if (f > 0.75f) {
            oooO0OO.OooO0OO(OooO00o((f - 0.75f) / 0.25f, oooO0OO.m14911OooO0o0(), oooO0OO.m14908OooO0OO()));
        } else {
            oooO0OO.OooO0OO(oooO0OO.m14911OooO0o0());
        }
    }

    public void OooO00o(float f, OooO0OO oooO0OO, boolean z) {
        float f2;
        float f3;
        if (this.f14688OooO0O0) {
            OooO0O0(f, oooO0OO);
        } else if (f != 1.0f || z) {
            float OooO2 = oooO0OO.OooO();
            if (f < 0.5f) {
                f2 = oooO0OO.OooOO0();
                f3 = (OooO0O0.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float OooOO02 = oooO0OO.OooOO0() + 0.79f;
                f2 = OooOO02 - (((1.0f - OooO0O0.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = OooOO02;
            }
            oooO0OO.OooO0o0(f2);
            oooO0OO.OooO0OO(f3);
            oooO0OO.OooO0Oo(OooO2 + (0.20999998f * f));
            OooO0o0((f + this.OooO0o0) * 216.0f);
        }
    }

    private void OooO00o() {
        OooO0OO oooO0OO = this.f14687OooO00o;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new OooO00o(oooO0OO));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(OooO00o);
        ofFloat.addListener(new OooO0O0(oooO0OO));
        this.f14685OooO00o = ofFloat;
    }
}
