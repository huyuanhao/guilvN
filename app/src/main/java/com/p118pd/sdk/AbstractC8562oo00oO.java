package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oo00oO  reason: case insensitive filesystem */
public interface AbstractC8562oo00oO {
    @Nullable
    ColorStateList getSupportButtonTintList();

    @Nullable
    PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@Nullable ColorStateList colorStateList);

    void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode);
}
