package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C7043o00O0000;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable extends Drawable {
    public static final int OooO0OO = 0;
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 3;
    public static final int OooO0o0 = 2;
    public static final float OooO0oO = ((float) Math.toRadians(45.0d));
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f13655OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Paint f13656OooO00o = new Paint();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Path f13657OooO00o = new Path();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f13658OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f13659OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13660OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public float f13661OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public float f13662OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public float f13663OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public float f13664OooO0o0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        this.f13656OooO00o.setStyle(Paint.Style.STROKE);
        this.f13656OooO00o.setStrokeJoin(Paint.Join.MITER);
        this.f13656OooO00o.setStrokeCap(Paint.Cap.BUTT);
        this.f13656OooO00o.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0033R.styleable.OooOo0, C0033R.attr.drawerArrowStyle, C0033R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        OooO00o(obtainStyledAttributes.getColor(C0033R.styleable.DrawerArrowToggle_color, 0));
        OooO0Oo(obtainStyledAttributes.getDimension(C0033R.styleable.DrawerArrowToggle_thickness, 0.0f));
        OooO00o(obtainStyledAttributes.getBoolean(C0033R.styleable.DrawerArrowToggle_spinBars, true));
        OooO0o0((float) Math.round(obtainStyledAttributes.getDimension(C0033R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f13655OooO00o = obtainStyledAttributes.getDimensionPixelSize(C0033R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.OooO0O0 = (float) Math.round(obtainStyledAttributes.getDimension(C0033R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.OooO00o = (float) Math.round(obtainStyledAttributes.getDimension(C0033R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f13661OooO0OO = obtainStyledAttributes.getDimension(C0033R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float OooO00o(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void OooO00o(float f) {
        if (this.OooO00o != f) {
            this.OooO00o = f;
            invalidateSelf();
        }
    }

    public void OooO0O0(float f) {
        if (this.f13661OooO0OO != f) {
            this.f13661OooO0OO = f;
            invalidateSelf();
        }
    }

    public float OooO0OO() {
        return this.OooO0O0;
    }

    public void OooO0Oo(float f) {
        if (this.f13656OooO00o.getStrokeWidth() != f) {
            this.f13656OooO00o.setStrokeWidth(f);
            double d = (double) (f / 2.0f);
            double cos = Math.cos((double) OooO0oO);
            Double.isNaN(d);
            this.f13663OooO0o = (float) (d * cos);
            invalidateSelf();
        }
    }

    @FloatRange(from = AbstractC8352oOoOOoO0.OooO0O0, mo599to = 1.0d)
    public float OooO0o() {
        return this.f13664OooO0o0;
    }

    public float OooO0o0() {
        return this.f13662OooO0Oo;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f13659OooO0O0;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C7043o00O0000.OooO0O0((Drawable) this) == 0 : C7043o00O0000.OooO0O0((Drawable) this) == 1))) {
            z = true;
        }
        float f = this.OooO00o;
        float OooO00o2 = OooO00o(this.OooO0O0, (float) Math.sqrt((double) (f * f * 2.0f)), this.f13664OooO0o0);
        float OooO00o3 = OooO00o(this.OooO0O0, this.f13661OooO0OO, this.f13664OooO0o0);
        float round = (float) Math.round(OooO00o(0.0f, this.f13663OooO0o, this.f13664OooO0o0));
        float OooO00o4 = OooO00o(0.0f, OooO0oO, this.f13664OooO0o0);
        float OooO00o5 = OooO00o(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f13664OooO0o0);
        double d = (double) OooO00o2;
        double d2 = (double) OooO00o4;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f13657OooO00o.rewind();
        float OooO00o6 = OooO00o(this.f13662OooO0Oo + this.f13656OooO00o.getStrokeWidth(), -this.f13663OooO0o, this.f13664OooO0o0);
        float f2 = (-OooO00o3) / 2.0f;
        this.f13657OooO00o.moveTo(f2 + round, 0.0f);
        this.f13657OooO00o.rLineTo(OooO00o3 - (round * 2.0f), 0.0f);
        this.f13657OooO00o.moveTo(f2, OooO00o6);
        this.f13657OooO00o.rLineTo(round2, round3);
        this.f13657OooO00o.moveTo(f2, -OooO00o6);
        this.f13657OooO00o.rLineTo(round2, -round3);
        this.f13657OooO00o.close();
        canvas.save();
        float strokeWidth = this.f13656OooO00o.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f3 = this.f13662OooO0Oo;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (strokeWidth * 1.5f) + f3);
        if (this.f13658OooO00o) {
            canvas.rotate(OooO00o5 * ((float) (this.f13660OooO0O0 ^ z ? -1 : 1)));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f13657OooO00o, this.f13656OooO00o);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.f13655OooO00o;
    }

    public int getIntrinsicWidth() {
        return this.f13655OooO00o;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f13656OooO00o.getAlpha()) {
            this.f13656OooO00o.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f13656OooO00o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void OooO0OO(float f) {
        if (this.OooO0O0 != f) {
            this.OooO0O0 = f;
            invalidateSelf();
        }
    }

    public void OooO0o(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        if (this.f13664OooO0o0 != f) {
            this.f13664OooO0o0 = f;
            invalidateSelf();
        }
    }

    public void OooO0o0(float f) {
        if (f != this.f13662OooO0Oo) {
            this.f13662OooO0Oo = f;
            invalidateSelf();
        }
    }

    public float OooO00o() {
        return this.OooO00o;
    }

    public float OooO0O0() {
        return this.f13661OooO0OO;
    }

    public void OooO00o(@ColorInt int i) {
        if (i != this.f13656OooO00o.getColor()) {
            this.f13656OooO00o.setColor(i);
            invalidateSelf();
        }
    }

    public void OooO0O0(int i) {
        if (i != this.f13659OooO0O0) {
            this.f13659OooO0O0 = i;
            invalidateSelf();
        }
    }

    public float OooO0Oo() {
        return this.f13656OooO00o.getStrokeWidth();
    }

    @ColorInt
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m14399OooO00o() {
        return this.f13656OooO00o.getColor();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m14402OooO0O0() {
        return this.f13659OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14401OooO00o() {
        return this.f13658OooO00o;
    }

    public void OooO0O0(boolean z) {
        if (this.f13660OooO0O0 != z) {
            this.f13660OooO0O0 = z;
            invalidateSelf();
        }
    }

    public void OooO00o(boolean z) {
        if (this.f13658OooO00o != z) {
            this.f13658OooO00o = z;
            invalidateSelf();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Paint m14400OooO00o() {
        return this.f13656OooO00o;
    }
}
