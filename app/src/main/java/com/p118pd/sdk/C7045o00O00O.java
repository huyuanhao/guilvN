package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.pd.sdk.o00O00O  reason: case insensitive filesystem */
public class C7045o00O00O extends Drawable implements Drawable.Callback, AbstractC7041o00O00, AbstractC7044o00O000o {
    public static final PorterDuff.Mode OooO0O0 = PorterDuff.Mode.SRC_IN;
    public PorterDuff.Mode OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f19311OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f19312OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19313OooO0O0;
    public boolean OooO0OO;
    public int o00oO0O;

    /* renamed from: com.pd.sdk.o00O00O$OooO00o */
    public static abstract class OooO00o extends Drawable.ConstantState {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ColorStateList f19314OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PorterDuff.Mode f19315OooO00o = C7045o00O00O.OooO0O0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Drawable.ConstantState f19316OooO00o;

        public OooO00o(@Nullable OooO00o oooO00o, @Nullable Resources resources) {
            if (oooO00o != null) {
                this.OooO00o = oooO00o.OooO00o;
                this.f19316OooO00o = oooO00o.f19316OooO00o;
                this.f19314OooO00o = oooO00o.f19314OooO00o;
                this.f19315OooO00o = oooO00o.f19315OooO00o;
            }
        }

        public boolean OooO00o() {
            return this.f19316OooO00o != null;
        }

        public int getChangingConfigurations() {
            int i = this.OooO00o;
            Drawable.ConstantState constantState = this.f19316OooO00o;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @NonNull
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @NonNull
        public abstract Drawable newDrawable(@Nullable Resources resources);
    }

    /* renamed from: com.pd.sdk.o00O00O$OooO0O0 */
    public static class OooO0O0 extends OooO00o {
        public OooO0O0(@Nullable OooO00o oooO00o, @Nullable Resources resources) {
            super(oooO00o, resources);
        }

        @Override // com.p118pd.sdk.C7045o00O00O.OooO00o
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new C7045o00O00O(this, resources);
        }
    }

    public C7045o00O00O(@NonNull OooO00o oooO00o, @Nullable Resources resources) {
        this.f19312OooO00o = oooO00o;
        OooO00o(resources);
    }

    private void OooO00o(@Nullable Resources resources) {
        Drawable.ConstantState constantState;
        OooO00o oooO00o = this.f19312OooO00o;
        if (oooO00o != null && (constantState = oooO00o.f19316OooO00o) != null) {
            OooO00o(constantState.newDrawable(resources));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18321OooO00o() {
        return true;
    }

    public void draw(@NonNull Canvas canvas) {
        this.f19311OooO00o.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        OooO00o oooO00o = this.f19312OooO00o;
        return changingConfigurations | (oooO00o != null ? oooO00o.getChangingConfigurations() : 0) | this.f19311OooO00o.getChangingConfigurations();
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        OooO00o oooO00o = this.f19312OooO00o;
        if (oooO00o == null || !oooO00o.OooO00o()) {
            return null;
        }
        this.f19312OooO00o.OooO00o = getChangingConfigurations();
        return this.f19312OooO00o;
    }

    @NonNull
    public Drawable getCurrent() {
        return this.f19311OooO00o.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f19311OooO00o.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f19311OooO00o.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f19311OooO00o.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f19311OooO00o.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f19311OooO00o.getOpacity();
    }

    public boolean getPadding(@NonNull Rect rect) {
        return this.f19311OooO00o.getPadding(rect);
    }

    @NonNull
    public int[] getState() {
        return this.f19311OooO00o.getState();
    }

    public Region getTransparentRegion() {
        return this.f19311OooO00o.getTransparentRegion();
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @RequiresApi(19)
    public boolean isAutoMirrored() {
        return this.f19311OooO00o.isAutoMirrored();
    }

    public boolean isStateful() {
        OooO00o oooO00o;
        ColorStateList colorStateList = (!m18321OooO00o() || (oooO00o = this.f19312OooO00o) == null) ? null : oooO00o.f19314OooO00o;
        return (colorStateList != null && colorStateList.isStateful()) || this.f19311OooO00o.isStateful();
    }

    public void jumpToCurrentState() {
        this.f19311OooO00o.jumpToCurrentState();
    }

    @NonNull
    public Drawable mutate() {
        if (!this.OooO0OO && super.mutate() == this) {
            this.f19312OooO00o = m18320OooO00o();
            Drawable drawable = this.f19311OooO00o;
            if (drawable != null) {
                drawable.mutate();
            }
            OooO00o oooO00o = this.f19312OooO00o;
            if (oooO00o != null) {
                Drawable drawable2 = this.f19311OooO00o;
                oooO00o.f19316OooO00o = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.OooO0OO = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19311OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        return this.f19311OooO00o.setLevel(i);
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f19311OooO00o.setAlpha(i);
    }

    @RequiresApi(19)
    public void setAutoMirrored(boolean z) {
        this.f19311OooO00o.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f19311OooO00o.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19311OooO00o.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f19311OooO00o.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f19311OooO00o.setFilterBitmap(z);
    }

    public boolean setState(@NonNull int[] iArr) {
        return OooO00o(iArr) || this.f19311OooO00o.setState(iArr);
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintList(ColorStateList colorStateList) {
        this.f19312OooO00o.f19314OooO00o = colorStateList;
        OooO00o(getState());
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f19312OooO00o.f19315OooO00o = mode;
        OooO00o(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f19311OooO00o.setVisible(z, z2);
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO00o m18320OooO00o() {
        return new OooO0O0(this.f19312OooO00o, null);
    }

    public C7045o00O00O(@Nullable Drawable drawable) {
        this.f19312OooO00o = m18320OooO00o();
        OooO00o(drawable);
    }

    private boolean OooO00o(int[] iArr) {
        if (!m18321OooO00o()) {
            return false;
        }
        OooO00o oooO00o = this.f19312OooO00o;
        ColorStateList colorStateList = oooO00o.f19314OooO00o;
        PorterDuff.Mode mode = oooO00o.f19315OooO00o;
        if (colorStateList == null || mode == null) {
            this.f19313OooO0O0 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f19313OooO0O0 && colorForState == this.o00oO0O && mode == this.OooO00o)) {
                setColorFilter(colorForState, mode);
                this.o00oO0O = colorForState;
                this.OooO00o = mode;
                this.f19313OooO0O0 = true;
                return true;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00
    public final Drawable OooO00o() {
        return this.f19311OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00
    public final void OooO00o(Drawable drawable) {
        Drawable drawable2 = this.f19311OooO00o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f19311OooO00o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            OooO00o oooO00o = this.f19312OooO00o;
            if (oooO00o != null) {
                oooO00o.f19316OooO00o = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
