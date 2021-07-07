package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00oOoo  reason: case insensitive filesystem */
public abstract class AbstractC7209o00oOoo extends Drawable {
    public static final int OooO0o0 = 3;
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19697OooO00o = 160;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bitmap f19698OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BitmapShader f19699OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Matrix f19700OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Paint f19701OooO00o = new Paint(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19702OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RectF f19703OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19704OooO00o = true;
    public int OooO0O0 = 119;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19705OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public AbstractC7209o00oOoo(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f19697OooO00o = resources.getDisplayMetrics().densityDpi;
        }
        this.f19698OooO00o = bitmap;
        if (bitmap != null) {
            OooO0O0();
            Bitmap bitmap2 = this.f19698OooO00o;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f19699OooO00o = new BitmapShader(bitmap2, tileMode, tileMode);
            return;
        }
        this.OooO0Oo = -1;
        this.OooO0OO = -1;
        this.f19699OooO00o = null;
    }

    public static boolean OooO00o(float f) {
        return f > 0.05f;
    }

    private void OooO0O0() {
        this.OooO0OO = this.f19698OooO00o.getScaledWidth(this.f19697OooO00o);
        this.OooO0Oo = this.f19698OooO00o.getScaledHeight(this.f19697OooO00o);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Paint m18693OooO00o() {
        return this.f19701OooO00o;
    }

    public void OooO0OO(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f19698OooO00o;
        if (bitmap != null) {
            m18694OooO00o();
            if (this.f19701OooO00o.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f19702OooO00o, this.f19701OooO00o);
                return;
            }
            RectF rectF = this.f19703OooO00o;
            float f = this.OooO00o;
            canvas.drawRoundRect(rectF, f, f, this.f19701OooO00o);
        }
    }

    public int getAlpha() {
        return this.f19701OooO00o.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f19701OooO00o.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.OooO0Oo;
    }

    public int getIntrinsicWidth() {
        return this.OooO0OO;
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.OooO0O0 != 119 || this.f19705OooO0O0 || (bitmap = this.f19698OooO00o) == null || bitmap.hasAlpha() || this.f19701OooO00o.getAlpha() < 255 || OooO00o(this.OooO00o)) {
            return -3;
        }
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f19705OooO0O0) {
            OooO0OO();
        }
        this.f19704OooO00o = true;
    }

    public void setAlpha(int i) {
        if (i != this.f19701OooO00o.getAlpha()) {
            this.f19701OooO00o.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19701OooO00o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f19701OooO00o.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f19701OooO00o.setFilterBitmap(z);
        invalidateSelf();
    }

    private void OooO0OO() {
        this.OooO00o = (float) (Math.min(this.OooO0Oo, this.OooO0OO) / 2);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Bitmap m18692OooO00o() {
        return this.f19698OooO00o;
    }

    public void OooO00o(@NonNull Canvas canvas) {
        OooO0O0(canvas.getDensity());
    }

    public void OooO0O0(int i) {
        if (this.f19697OooO00o != i) {
            if (i == 0) {
                i = 160;
            }
            this.f19697OooO00o = i;
            if (this.f19698OooO00o != null) {
                OooO0O0();
            }
            invalidateSelf();
        }
    }

    public void OooO00o(@NonNull DisplayMetrics displayMetrics) {
        OooO0O0(displayMetrics.densityDpi);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18698OooO0OO() {
        return this.f19705OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18691OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(int i) {
        if (this.OooO0O0 != i) {
            this.OooO0O0 = i;
            this.f19704OooO00o = true;
            invalidateSelf();
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18697OooO0O0() {
        throw new UnsupportedOperationException();
    }

    public void OooO0O0(boolean z) {
        this.f19705OooO0O0 = z;
        this.f19704OooO00o = true;
        if (z) {
            OooO0OO();
            this.f19701OooO00o.setShader(this.f19699OooO00o);
            invalidateSelf();
            return;
        }
        m18695OooO00o(0.0f);
    }

    public void OooO00o(boolean z) {
        this.f19701OooO00o.setAntiAlias(z);
        invalidateSelf();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18696OooO00o() {
        return this.f19701OooO00o.isAntiAlias();
    }

    public void OooO00o(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18694OooO00o() {
        if (this.f19704OooO00o) {
            if (this.f19705OooO0O0) {
                int min = Math.min(this.OooO0OO, this.OooO0Oo);
                OooO00o(this.OooO0O0, min, min, getBounds(), this.f19702OooO00o);
                int min2 = Math.min(this.f19702OooO00o.width(), this.f19702OooO00o.height());
                this.f19702OooO00o.inset(Math.max(0, (this.f19702OooO00o.width() - min2) / 2), Math.max(0, (this.f19702OooO00o.height() - min2) / 2));
                this.OooO00o = ((float) min2) * 0.5f;
            } else {
                OooO00o(this.OooO0O0, this.OooO0OO, this.OooO0Oo, getBounds(), this.f19702OooO00o);
            }
            this.f19703OooO00o.set(this.f19702OooO00o);
            if (this.f19699OooO00o != null) {
                Matrix matrix = this.f19700OooO00o;
                RectF rectF = this.f19703OooO00o;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f19700OooO00o.preScale(this.f19703OooO00o.width() / ((float) this.f19698OooO00o.getWidth()), this.f19703OooO00o.height() / ((float) this.f19698OooO00o.getHeight()));
                this.f19699OooO00o.setLocalMatrix(this.f19700OooO00o);
                this.f19701OooO00o.setShader(this.f19699OooO00o);
            }
            this.f19704OooO00o = false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18695OooO00o(float f) {
        if (this.OooO00o != f) {
            this.f19705OooO0O0 = false;
            if (OooO00o(f)) {
                this.f19701OooO00o.setShader(this.f19699OooO00o);
            } else {
                this.f19701OooO00o.setShader(null);
            }
            this.OooO00o = f;
            invalidateSelf();
        }
    }

    public float OooO00o() {
        return this.OooO00o;
    }
}
