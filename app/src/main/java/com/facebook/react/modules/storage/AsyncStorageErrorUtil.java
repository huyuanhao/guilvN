package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import javax.annotation.Nullable;

public class AsyncStorageErrorUtil {
    public static WritableMap getDBError(@Nullable String str) {
        return getError(str, "Database Error");
    }

    public static WritableMap getError(@Nullable String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    public static WritableMap getInvalidKeyError(@Nullable String str) {
        return getError(str, "Invalid key");
    }

    public static WritableMap getInvalidValueError(@Nullable String str) {
        return getError(str, "Invalid Value");
    }
}
