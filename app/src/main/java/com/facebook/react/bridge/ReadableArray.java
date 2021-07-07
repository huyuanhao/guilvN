package com.facebook.react.bridge;

import java.util.ArrayList;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface ReadableArray {
    @Nullable
    ReadableArray getArray(int i);

    boolean getBoolean(int i);

    double getDouble(int i);

    @Nonnull
    Dynamic getDynamic(int i);

    int getInt(int i);

    @Nullable
    ReadableMap getMap(int i);

    @Nullable
    String getString(int i);

    @Nonnull
    ReadableType getType(int i);

    boolean isNull(int i);

    int size();

    @Nonnull
    ArrayList<Object> toArrayList();
}
