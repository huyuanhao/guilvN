package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"InlinedApi"})
/* renamed from: com.pd.sdk.o00O0o  reason: case insensitive filesystem */
public final class C7065o00O0o {
    public static final int OooO = 256;
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 2;
    public static final int OooO0o = 8;
    public static final int OooO0o0 = 4;
    public static final int OooO0oO = 16;
    public static final int OooO0oo = 32;
    public static final int OooOO0 = 0;
    public static final int OooOO0O = 63;

    @NonNull
    public static Spanned OooO00o(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }

    @NonNull
    public static Spanned OooO00o(@NonNull String str, int i, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }
        return Html.fromHtml(str, imageGetter, tagHandler);
    }

    @NonNull
    public static String OooO00o(@NonNull Spanned spanned, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.toHtml(spanned, i);
        }
        return Html.toHtml(spanned);
    }
}
