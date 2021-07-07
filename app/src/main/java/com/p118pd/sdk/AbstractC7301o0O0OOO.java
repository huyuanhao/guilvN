package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: com.pd.sdk.o0O0OOO  reason: case insensitive filesystem */
public abstract class AbstractC7301o0O0OOO extends Drawable implements AbstractC7044o00O000o {
    public Drawable OooO00o;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return C7043o00O0000.m18312OooO00o(drawable);
        }
        return null;
    }

    public Drawable getCurrent() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            C7043o00O0000.m18318OooO0O0(drawable);
        }
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
