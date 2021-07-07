package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

public final class zai extends Drawable.ConstantState {
    public int mChangingConfigurations;
    public int zanv;

    public zai(zai zai) {
        if (zai != null) {
            this.mChangingConfigurations = zai.mChangingConfigurations;
            this.zanv = zai.zanv;
        }
    }

    public final int getChangingConfigurations() {
        return this.mChangingConfigurations;
    }

    public final Drawable newDrawable() {
        return new zae(this);
    }
}
