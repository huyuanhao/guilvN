package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: com.megvii.meglive_sdk.f.o */
public final class C1574o {
    /* renamed from: a */
    public static void m2661a(Context context, String str) {
        if (str != null) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            Locale locale = new Locale(str);
            if (Build.VERSION.SDK_INT >= 17) {
                configuration.setLocale(locale);
            } else {
                configuration.locale = locale;
            }
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
