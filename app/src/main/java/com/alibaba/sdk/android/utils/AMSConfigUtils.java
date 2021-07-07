package com.alibaba.sdk.android.utils;

import android.content.Context;

public class AMSConfigUtils {
    public static final String ACCOUNT_ID = "ams_accountId";
    public static final String APP_KEY = "ams_appKey";
    public static final String APP_SECRET = "ams_appSecret";
    public static final String HTTPDNS_SECRET_KEY = "ams_httpdns_secretKey";
    public static final String PACKAGE_NAME = "ams_packageName";

    public static String getAccountId(Context context) {
        return getStringStr(context, ACCOUNT_ID);
    }

    public static String getAppKey(Context context) {
        return getStringStr(context, APP_KEY);
    }

    public static String getAppSecret(Context context) {
        return getStringStr(context, APP_SECRET);
    }

    public static String getHttpdnsSecretKey(Context context) {
        return getStringStr(context, HTTPDNS_SECRET_KEY);
    }

    public static String getPackageName(Context context) {
        return getStringStr(context, PACKAGE_NAME);
    }

    public static int getResourceString(Context context, String str) {
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    public static String getStringStr(Context context, String str) {
        try {
            return context.getResources().getString(getResourceString(context, str));
        } catch (Exception unused) {
            String str2 = str + " is NULL";
            return null;
        }
    }
}
