package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00O000o  reason: case insensitive filesystem */
public interface AbstractC7044o00O000o {
    void setTint(@ColorInt int i);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(PorterDuff.Mode mode);
}
