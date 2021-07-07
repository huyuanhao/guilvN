package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00Oo0O  reason: case insensitive filesystem */
public interface AbstractC7109o00Oo0O {
    @Nullable
    ColorStateList getSupportBackgroundTintList();

    @Nullable
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode);
}
