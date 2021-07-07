package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import javax.annotation.Nullable;

public class ReactStylesDiffMap {
    public final ReadableMap mBackingMap;

    public ReactStylesDiffMap(ReadableMap readableMap) {
        this.mBackingMap = readableMap;
    }

    @Nullable
    public ReadableArray getArray(String str) {
        return this.mBackingMap.getArray(str);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mBackingMap.isNull(str) ? z : this.mBackingMap.getBoolean(str);
    }

    public double getDouble(String str, double d) {
        return this.mBackingMap.isNull(str) ? d : this.mBackingMap.getDouble(str);
    }

    @Nullable
    public Dynamic getDynamic(String str) {
        return this.mBackingMap.getDynamic(str);
    }

    public float getFloat(String str, float f) {
        return this.mBackingMap.isNull(str) ? f : (float) this.mBackingMap.getDouble(str);
    }

    public int getInt(String str, int i) {
        return this.mBackingMap.isNull(str) ? i : this.mBackingMap.getInt(str);
    }

    @Nullable
    public ReadableMap getMap(String str) {
        return this.mBackingMap.getMap(str);
    }

    @Nullable
    public String getString(String str) {
        return this.mBackingMap.getString(str);
    }

    public boolean hasKey(String str) {
        return this.mBackingMap.hasKey(str);
    }

    public boolean isNull(String str) {
        return this.mBackingMap.isNull(str);
    }

    public String toString() {
        return "{ " + ReactStylesDiffMap.class.getSimpleName() + ": " + this.mBackingMap.toString() + " }";
    }
}
