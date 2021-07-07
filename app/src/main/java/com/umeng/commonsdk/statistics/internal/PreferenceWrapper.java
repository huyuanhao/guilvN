package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceWrapper {
    public static final String DEFAULT_PREFERENCE = "umeng_general_config";

    public static SharedPreferences getDefault(Context context) {
        if (context != null) {
            return context.getSharedPreferences(DEFAULT_PREFERENCE, 0);
        }
        return null;
    }

    public static SharedPreferences getInstance(Context context, String str) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
