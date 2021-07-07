package com.baidu.idl.face.platform.common;

import android.content.Context;
import android.content.SharedPreferences;

public final class SharedPrefHelper {
    public static final String SHARED_PREFERENCES_NAME_FACE_VALUE = "face_sdk_value";

    public static SharedPreferences getPref(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME_FACE_VALUE, 0);
    }
}
