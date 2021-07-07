package com.megvii.meglive_sdk.p106f;

import android.app.Activity;
import android.os.Build;

/* renamed from: com.megvii.meglive_sdk.f.f */
public final class C1564f {
    /* renamed from: a */
    public static void m2628a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 14) {
            systemUiVisibility ^= 2;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            systemUiVisibility ^= 4;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            systemUiVisibility ^= 4096;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* renamed from: b */
    public static void m2629b(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i > 11 && i < 19) {
            activity.getWindow().getDecorView().setSystemUiVisibility(8);
        } else if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        }
    }
}
