package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.net.URL;

/* renamed from: com.pd.sdk.o0o0Ooo0  reason: case insensitive filesystem */
public interface AbstractC7610o0o0Ooo0<T> {
    @NonNull
    @CheckResult
    T load(@Nullable Bitmap bitmap);

    @NonNull
    @CheckResult
    T load(@Nullable Drawable drawable);

    @NonNull
    @CheckResult
    T load(@Nullable Uri uri);

    @NonNull
    @CheckResult
    T load(@Nullable File file);

    @NonNull
    @CheckResult
    T load(@Nullable @DrawableRes @RawRes Integer num);

    @NonNull
    @CheckResult
    T load(@Nullable Object obj);

    @NonNull
    @CheckResult
    T load(@Nullable String str);

    @CheckResult
    @Deprecated
    T load(@Nullable URL url);

    @NonNull
    @CheckResult
    T load(@Nullable byte[] bArr);
}
