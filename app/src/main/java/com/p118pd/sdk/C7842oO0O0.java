package com.p118pd.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: com.pd.sdk.oO0O0  reason: case insensitive filesystem */
public final class C7842oO0O0 {
    public static void OooO00o(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static <T> T OooO00o(@Nullable T t) {
        return (T) OooO00o(t, "Argument must not be null");
    }

    @NonNull
    public static <T> T OooO00o(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @NonNull
    public static String OooO00o(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    public static <T extends Collection<Y>, Y> T OooO00o(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
