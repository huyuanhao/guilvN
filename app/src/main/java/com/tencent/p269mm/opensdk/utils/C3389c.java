package com.tencent.p269mm.opensdk.utils;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: com.tencent.mm.opensdk.utils.c */
public final class C3389c {

    /* renamed from: com.tencent.mm.opensdk.utils.c$a */
    public static final class C3390a {
        /* renamed from: a */
        public static Object m8658a(int i, String str) {
            switch (i) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    try {
                        return Double.valueOf(str);
                    } catch (Exception e) {
                        Log.m8651e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e.getMessage());
                        return null;
                    }
                default:
                    Log.m8651e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.opensdk.utils.c$b */
    public static final class C3391b implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    }
}
