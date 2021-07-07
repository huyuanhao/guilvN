package com.p118pd.sdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOO00Oo  reason: case insensitive filesystem */
public class C8895ooOO00Oo {
    public static WritableMap OooO00o(@Nullable String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    public static WritableMap OooO0O0(@Nullable String str) {
        return OooO00o(str, "Invalid key");
    }

    public static WritableMap OooO0OO(@Nullable String str) {
        return OooO00o(str, "Invalid Value");
    }

    public static WritableMap OooO00o(@Nullable String str) {
        return OooO00o(str, "Database Error");
    }
}
