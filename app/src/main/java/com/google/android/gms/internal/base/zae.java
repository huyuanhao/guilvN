package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class zae extends Drawable implements Drawable.Callback {
    public int mAlpha;
    public int mFrom;
    public boolean zamy;
    public int zang;
    public long zanh;
    public int zani;
    public int zanj;
    public int zank;
    public boolean zanl;
    public zai zanm;
    public Drawable zann;
    public Drawable zano;
    public boolean zanp;
    public boolean zanq;
    public boolean zanr;
    public int zans;

    public zae(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zag.zacg() : drawable;
        this.zann = drawable;
        drawable.setCallback(this);
        zai zai = this.zanm;
        zai.zanv = drawable.getChangingConfigurations() | zai.zanv;
        drawable2 = drawable2 == null ? zag.zacg() : drawable2;
        this.zano = drawable2;
        drawable2.setCallback(this);
        zai zai2 = this.zanm;
        zai2.zanv = drawable2.getChangingConfigurations() | zai2.zanv;
    }

    private final boolean canConstantState() {
        if (!this.zanp) {
            this.zanq = (this.zann.getConstantState() == null || this.zano.getConstantState() == null) ? false : true;
            this.zanp = true;
        }
        return this.zanq;
    }

    public final void draw(Canvas canvas) {
        int i = this.zang;
        boolean z = false;
        boolean z2 = true;
        if (i == 1) {
            this.zanh = SystemClock.uptimeMillis();
            this.zang = 2;
        } else if (i == 2 && this.zanh >= 0) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.zanh)) / ((float) this.zank);
            if (uptimeMillis < 1.0f) {
                z2 = false;
            }
            if (z2) {
                this.zang = 0;
            }
            this.mAlpha = (int) ((((float) this.zani) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
            z = z2;
        } else {
            z = true;
        }
        int i2 = this.mAlpha;
        boolean z3 = this.zamy;
        Drawable drawable = this.zann;
        Drawable drawable2 = this.zano;
        if (z) {
            if (!z3 || i2 == 0) {
                drawable.draw(canvas);
            }
            int i3 = this.zanj;
            if (i2 == i3) {
                drawable2.setAlpha(i3);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.zanj - i2);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.zanj);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zanj);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zai zai = this.zanm;
        return changingConfigurations | zai.mChangingConfigurations | zai.zanv;
    }

    public final Drawable.ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.zanm.mChangingConfigurations = getChangingConfigurations();
        return this.zanm;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.zann.getIntrinsicHeight(), this.zano.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.zann.getIntrinsicWidth(), this.zano.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.zanr) {
            this.zans = Drawable.resolveOpacity(this.zann.getOpacity(), this.zano.getOpacity());
            this.zanr = true;
        }
        return this.zans;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.zanl && super.mutate() == this) {
            if (canConstantState()) {
                this.zann.mutate();
                this.zano.mutate();
                this.zanl = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.zann.setBounds(rect);
        this.zano.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.mAlpha == this.zanj) {
            this.mAlpha = i;
        }
        this.zanj = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.zann.setColorFilter(colorFilter);
        this.zano.setColorFilter(colorFilter);
    }

    public final void startTransition(int i) {
        this.mFrom = 0;
        this.zani = this.zanj;
        this.mAlpha = 0;
        this.zank = 250;
        this.zang = 1;
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zacf() {
        return this.zano;
    }

    public zae(zai zai) {
        this.zang = 0;
        this.zanj = 255;
        this.mAlpha = 0;
        this.zamy = true;
        this.zanm = new zai(zai);
    }
}
