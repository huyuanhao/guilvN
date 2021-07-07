package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@VisibleForTesting
@KeepForSdk
public class Strings {
    public static final Pattern zzhg = Pattern.compile("\\$\\{(.*?)\\}");

    @Nullable
    @KeepForSdk
    public static String emptyToNull(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
