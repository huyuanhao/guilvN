package com.p118pd.sdk;

import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000o0O  reason: case insensitive filesystem */
public final class C7018o000o0O {
    public static int OooO00o(@NonNull Resources resources) {
        if (Build.VERSION.SDK_INT >= 17) {
            return resources.getConfiguration().densityDpi;
        }
        return resources.getDisplayMetrics().densityDpi;
    }
}
