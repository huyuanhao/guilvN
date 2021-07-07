package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: com.pd.sdk.oOo00ooo  reason: case insensitive filesystem */
public class C8305oOo00ooo extends Drawable {
    public final Matrix OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RectF f21400OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f21401OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f21402OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21403OooO00o;
    public final RectF OooO0O0;

    /* renamed from: com.pd.sdk.oOo00ooo$OooO00o */
    public static final class OooO00o extends Drawable.ConstantState {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Drawable.ConstantState f21404OooO00o;
        public final int OooO0O0;

        public OooO00o(OooO00o oooO00o) {
            this(oooO00o.f21404OooO00o, oooO00o.OooO00o, oooO00o.OooO0O0);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return new C8305oOo00ooo(this, this.f21404OooO00o.newDrawable());
        }

        public OooO00o(Drawable.ConstantState constantState, int i, int i2) {
            this.f21404OooO00o = constantState;
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C8305oOo00ooo(this, this.f21404OooO00o.newDrawable(resources));
        }
    }

    public C8305oOo00ooo(Drawable drawable, int i, int i2) {
        this(new OooO00o(drawable.getConstantState(), i, i2), drawable);
    }

    private void OooO00o() {
        this.OooO00o.setRectToRect(this.f21400OooO00o, this.OooO0O0, Matrix.ScaleToFit.CENTER);
    }

    public void clearColorFilter() {
        this.f21401OooO00o.clearColorFilter();
    }

    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.concat(this.OooO00o);
        this.f21401OooO00o.draw(canvas);
        canvas.restore();
    }

    @RequiresApi(19)
    public int getAlpha() {
        return this.f21401OooO00o.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.f21401OooO00o.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f21401OooO00o.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f21402OooO00o;
    }

    @NonNull
    public Drawable getCurrent() {
        return this.f21401OooO00o.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f21402OooO00o.OooO0O0;
    }

    public int getIntrinsicWidth() {
        return this.f21402OooO00o.OooO00o;
    }

    public int getMinimumHeight() {
        return this.f21401OooO00o.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f21401OooO00o.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f21401OooO00o.getOpacity();
    }

    public boolean getPadding(@NonNull Rect rect) {
        return this.f21401OooO00o.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f21401OooO00o.invalidateSelf();
    }

    @NonNull
    public Drawable mutate() {
        if (!this.f21403OooO00o && super.mutate() == this) {
            this.f21401OooO00o = this.f21401OooO00o.mutate();
            this.f21402OooO00o = new OooO00o(this.f21402OooO00o);
            this.f21403OooO00o = true;
        }
        return this;
    }

    public void scheduleSelf(@NonNull Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f21401OooO00o.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f21401OooO00o.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.OooO0O0.set((float) i, (float) i2, (float) i3, (float) i4);
        OooO00o();
    }

    public void setChangingConfigurations(int i) {
        this.f21401OooO00o.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, @NonNull PorterDuff.Mode mode) {
        this.f21401OooO00o.setColorFilter(i, mode);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.f21401OooO00o.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f21401OooO00o.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f21401OooO00o.setVisible(z, z2);
    }

    public void unscheduleSelf(@NonNull Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f21401OooO00o.unscheduleSelf(runnable);
    }

    public C8305oOo00ooo(OooO00o oooO00o, Drawable drawable) {
        this.f21402OooO00o = (OooO00o) C7842oO0O0.OooO00o(oooO00o);
        this.f21401OooO00o = (Drawable) C7842oO0O0.OooO00o(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.OooO00o = new Matrix();
        this.f21400OooO00o = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        this.OooO0O0 = new RectF();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f21401OooO00o.setColorFilter(colorFilter);
    }

    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        this.OooO0O0.set(rect);
        OooO00o();
    }
}
