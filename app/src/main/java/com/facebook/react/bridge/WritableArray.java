package com.facebook.react.bridge;

import javax.annotation.Nullable;

public interface WritableArray extends ReadableArray {
    void pushArray(@Nullable WritableArray writableArray);

    void pushBoolean(boolean z);

    void pushDouble(double d);

    void pushInt(int i);

    void pushMap(@Nullable WritableMap writableMap);

    void pushNull();

    void pushString(@Nullable String str);
}
