package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.pd.sdk.oo00O0oO  reason: case insensitive filesystem */
public abstract class AbstractC8531oo00O0oO {
    public static Long OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmssSSS").parse(str).getTime());
        } catch (ParseException unused) {
            AbstractC8536oo00OO0O.OooO0OO("V1Common", "timestampAdapter: convertBisdkTime failed to parse time");
            return -1L;
        }
    }

    public static void OooO00o(Context context) {
        AbstractC8521oo00O00.m20194OooO00o(AbstractC8521oo00O00.OooO00o(context, "global_v2"), "v1cacheHandleFlag", (Object) true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20200OooO00o(Context context) {
        return ((Boolean) AbstractC8521oo00O00.OooO00o(AbstractC8521oo00O00.OooO00o(context, "global_v2"), "v1cacheHandleFlag", (Object) false)).booleanValue();
    }
}
