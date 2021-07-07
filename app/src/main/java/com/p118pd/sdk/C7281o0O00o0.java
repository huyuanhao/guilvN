package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o0O00o0  reason: case insensitive filesystem */
public class C7281o0O00o0 {
    @Nullable
    public static ColorStateList OooO00o(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof AbstractC7144o00o00) {
            return ((AbstractC7144o00o00) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static void OooO00o(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof AbstractC7144o00o00) {
            ((AbstractC7144o00o00) imageView).setSupportImageTintList(colorStateList);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static PorterDuff.Mode m18779OooO00o(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof AbstractC7144o00o00) {
            return ((AbstractC7144o00o00) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void OooO00o(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof AbstractC7144o00o00) {
            ((AbstractC7144o00o00) imageView).setSupportImageTintMode(mode);
        }
    }
}
