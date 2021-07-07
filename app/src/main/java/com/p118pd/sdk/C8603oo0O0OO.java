package com.p118pd.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.pd.sdk.oo0O0OO  reason: case insensitive filesystem */
public class C8603oo0O0OO {
    @NonNull
    public static boolean OooO00o(@NonNull Class cls, @NonNull ReadableMap readableMap, @NonNull String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return false;
        }
        if (String.class.equals(cls)) {
            return !TextUtils.isEmpty(readableMap.getString(str));
        }
        return true;
    }

    @NonNull
    public static boolean OooO0O0(@NonNull ReadableMap readableMap, @NonNull String str) {
        return OooO00o(ReadableMap.class, readableMap, str);
    }

    @NonNull
    public static boolean OooO00o(@NonNull ReadableMap readableMap, @NonNull String str) {
        return OooO00o(String.class, readableMap, str);
    }
}
