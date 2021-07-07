package com.p118pd.sdk;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: com.pd.sdk.oo0O00OO  reason: case insensitive filesystem */
public abstract class AbstractC8593oo0O00OO {
    public static AbstractC8579oo00ooO0 OooO00o;

    public static synchronized AbstractC8579oo00ooO0 OooO00o() {
        AbstractC8579oo00ooO0 oo00ooo0;
        synchronized (AbstractC8593oo0O00OO.class) {
            if (OooO00o == null) {
                OooO00o = AbstractC8581oo00ooo.OooO00o("_default_config_tag");
            }
            oo00ooo0 = OooO00o;
        }
        return oo00ooo0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20239OooO00o() {
        AbstractC8581oo00ooo.m20223OooO00o();
    }

    public static void OooO00o(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(i, str, linkedHashMap);
        }
    }

    public static void OooO00o(long j) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(j);
        }
    }

    public static void OooO00o(Context context) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(context);
        }
    }

    @Deprecated
    public static void OooO00o(Context context, String str, String str2) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(context, str, str2);
        }
    }

    public static void OooO00o(Context context, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(context, linkedHashMap);
        }
    }

    public static void OooO00o(String str) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(1, str);
            OooO00o.OooO00o(0, str);
            OooO00o.OooO00o(3, str);
            OooO00o.OooO00o(2, str);
        }
    }

    public static void OooO00o(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(0, str, linkedHashMap);
        }
    }

    public static void OooO00o(boolean z) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(1, z);
            OooO00o.OooO00o(0, z);
            OooO00o.OooO00o(3, z);
            OooO00o.OooO00o(2, z);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20240OooO00o() {
        return AbstractC8581oo00ooo.m20225OooO00o("_default_config_tag");
    }

    public static void OooO0O0() {
        C8583oo00oooo.OooO00o().OooO00o("_default_config_tag");
    }

    public static void OooO0O0(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(i, str, linkedHashMap);
        }
    }

    public static void OooO0O0(long j) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(j);
        }
    }

    @Deprecated
    public static void OooO0O0(Context context) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(context, -1);
        }
    }

    public static void OooO0O0(Context context, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(context, linkedHashMap);
        }
    }

    public static void OooO0O0(String str) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(1, str);
            OooO00o.OooO0O0(0, str);
            OooO00o.OooO0O0(3, str);
            OooO00o.OooO0O0(2, str);
        }
    }

    public static void OooO0O0(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO00o(str, linkedHashMap);
        }
    }

    public static void OooO0OO() {
        if (OooO00o() != null) {
            OooO00o.onReport(-1);
        }
    }

    public static void OooO0OO(Context context) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(context);
        }
    }

    public static void OooO0OO(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (OooO00o() != null) {
            OooO00o.OooO0O0(str, linkedHashMap);
        }
    }
}
