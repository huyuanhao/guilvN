package com.p118pd.sdk;

import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.pd.sdk.o00O0oO  reason: case insensitive filesystem */
public final class C7071o00O0oO {
    public static final String OooO00o = "ICUCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f19372OooO00o;
    public static Method OooO0O0;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                OooO0O0 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f19372OooO00o = cls.getMethod("getScript", String.class);
                    OooO0O0 = cls.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception unused) {
                f19372OooO00o = null;
                OooO0O0 = null;
            }
        }
    }

    public static String OooO00o(String str) {
        try {
            if (f19372OooO00o != null) {
                return (String) f19372OooO00o.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @Nullable
    public static String OooO0O0(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) OooO0O0.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String OooO00o2 = OooO00o(locale);
            if (OooO00o2 != null) {
                return OooO00o(OooO00o2);
            }
            return null;
        }
    }

    public static String OooO00o(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (OooO0O0 != null) {
                return (String) OooO0O0.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }
}
