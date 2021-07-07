package com.p118pd.sdk;

import androidx.annotation.RestrictTo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00O0OOO  reason: case insensitive filesystem */
public final class C7059o00O0OOO {
    public static Locale OooO00o(String str) {
        if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static String OooO00o(Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.append(locale.getCountry());
        }
        return sb.toString();
    }
}
