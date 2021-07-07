package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOOOo  reason: case insensitive filesystem */
public class C5946OooOOOo extends Drawable implements Drawable.Callback {
    public Drawable OooO00o;

    public C5946OooOOOo(Drawable drawable) {
        OooO00o(drawable);
    }

    public Drawable OooO00o() {
        return this.OooO00o;
    }

    public void draw(Canvas canvas) {
        this.OooO00o.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.OooO00o.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.OooO00o.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.OooO00o.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.OooO00o.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.OooO00o.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.OooO00o.getMinimumWidth();
    }

    public int getOpacity() {
        return this.OooO00o.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.OooO00o.getPadding(rect);
    }

    public int[] getState() {
        return this.OooO00o.getState();
    }

    public Region getTransparentRegion() {
        return this.OooO00o.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C7043o00O0000.m18319OooO0O0(this.OooO00o);
    }

    public boolean isStateful() {
        return this.OooO00o.isStateful();
    }

    public void jumpToCurrentState() {
        C7043o00O0000.m18318OooO0O0(this.OooO00o);
    }

    public void onBoundsChange(Rect rect) {
        this.OooO00o.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.OooO00o.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.OooO00o.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C7043o00O0000.OooO00o(this.OooO00o, z);
    }

    public void setChangingConfigurations(int i) {
        this.OooO00o.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.OooO00o.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.OooO00o.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.OooO00o.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C7043o00O0000.OooO00o(this.OooO00o, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C7043o00O0000.OooO00o(this.OooO00o, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.OooO00o.setState(iArr);
    }

    public void setTint(int i) {
        C7043o00O0000.OooO00o(this.OooO00o, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C7043o00O0000.OooO00o(this.OooO00o, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C7043o00O0000.OooO00o(this.OooO00o, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.OooO00o.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void OooO00o(Drawable drawable) {
        Drawable drawable2 = this.OooO00o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.OooO00o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
