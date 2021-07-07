package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000oo00  reason: case insensitive filesystem */
public final class C7030o000oo00 {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18293OooO00o(@NonNull Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bitmap.hasMipMap();
        }
        return false;
    }

    public static void OooO00o(@NonNull Bitmap bitmap, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(z);
        }
    }

    public static int OooO00o(@NonNull Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }
}
