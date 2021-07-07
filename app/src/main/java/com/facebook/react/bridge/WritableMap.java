package com.facebook.react.bridge;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface WritableMap extends ReadableMap {
    void merge(@Nonnull ReadableMap readableMap);

    void putArray(@Nonnull String str, @Nullable WritableArray writableArray);

    void putBoolean(@Nonnull String str, boolean z);

    void putDouble(@Nonnull String str, double d);

    void putInt(@Nonnull String str, int i);

    void putMap(@Nonnull String str, @Nullable WritableMap writableMap);

    void putNull(@Nonnull String str);

    void putString(@Nonnull String str, @Nullable String str2);
}
