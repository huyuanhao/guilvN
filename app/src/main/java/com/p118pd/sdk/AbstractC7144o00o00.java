package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00o00  reason: case insensitive filesystem */
public interface AbstractC7144o00o00 {
    @Nullable
    ColorStateList getSupportImageTintList();

    @Nullable
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@Nullable ColorStateList colorStateList);

    void setSupportImageTintMode(@Nullable PorterDuff.Mode mode);
}
