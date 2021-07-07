package com.p118pd.sdk;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* renamed from: com.pd.sdk.o00O0oo  reason: case insensitive filesystem */
public final class C7074o00O0oo {
    public static final String OooO00o = "Arab";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Locale f19385OooO00o = new Locale("", "");
    public static final String OooO0O0 = "Hebr";

    @NonNull
    public static String OooO00o(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(str);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt != '\'') {
                sb.append(charAt);
            } else {
                sb.append("&#39;");
            }
        }
        return sb.toString();
    }

    public static int OooO0O0(@Nullable Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f19385OooO00o)) {
            return 0;
        }
        String OooO0O02 = C7071o00O0oO.OooO0O0(locale);
        if (OooO0O02 == null) {
            return OooO00o(locale);
        }
        return (OooO0O02.equalsIgnoreCase(OooO00o) || OooO0O02.equalsIgnoreCase(OooO0O0)) ? 1 : 0;
    }

    public static int OooO00o(@NonNull Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
