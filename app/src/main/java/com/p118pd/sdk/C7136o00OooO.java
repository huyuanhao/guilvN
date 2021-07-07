package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* renamed from: com.pd.sdk.o00OooO  reason: case insensitive filesystem */
public final class C7136o00OooO {
    public static final String OooO00o = "CompoundButtonCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f19500OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19501OooO00o;

    public static void OooO00o(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof AbstractC8562oo00oO) {
            ((AbstractC8562oo00oO) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    @Nullable
    public static ColorStateList OooO00o(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof AbstractC8562oo00oO) {
            return ((AbstractC8562oo00oO) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    public static void OooO00o(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof AbstractC8562oo00oO) {
            ((AbstractC8562oo00oO) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static PorterDuff.Mode m18506OooO00o(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintMode();
        }
        if (compoundButton instanceof AbstractC8562oo00oO) {
            return ((AbstractC8562oo00oO) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable m18507OooO00o(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f19501OooO00o) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f19500OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(OooO00o, "Failed to retrieve mButtonDrawable field", e);
            }
            f19501OooO00o = true;
        }
        Field field = f19500OooO00o;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(OooO00o, "Failed to get button drawable via reflection", e2);
                f19500OooO00o = null;
            }
        }
        return null;
    }
}
