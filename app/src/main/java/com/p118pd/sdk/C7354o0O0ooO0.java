package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.http.NetworkSdkSetting;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0O0ooO0  reason: case insensitive filesystem */
public class C7354o0O0ooO0 {
    public static CookieManager OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20086OooO00o = "anet.CookieManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile boolean f20087OooO00o = false;
    public static boolean OooO0O0 = true;

    public static synchronized void OooO00o(Context context) {
        synchronized (C7354o0O0ooO0.class) {
            if (!f20087OooO00o) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (Build.VERSION.SDK_INT < 21) {
                        CookieSyncManager.createInstance(context);
                    }
                    CookieManager instance = CookieManager.getInstance();
                    OooO00o = instance;
                    instance.setAcceptCookie(true);
                    if (Build.VERSION.SDK_INT < 21) {
                        OooO00o.removeExpiredCookie();
                    }
                    ALog.m289e(f20086OooO00o, "CookieManager setup. cost:" + (System.currentTimeMillis() - currentTimeMillis), null, new Object[0]);
                } catch (Throwable th) {
                    OooO0O0 = false;
                    ALog.m288e(f20086OooO00o, "Cookie Manager setup failed!!!", null, th, new Object[0]);
                }
                f20087OooO00o = true;
            }
        }
    }

    public static boolean OooO00o() {
        if (!f20087OooO00o && NetworkSdkSetting.getContext() != null) {
            OooO00o(NetworkSdkSetting.getContext());
        }
        return f20087OooO00o;
    }

    public static synchronized void OooO00o(String str, String str2) {
        synchronized (C7354o0O0ooO0.class) {
            if (OooO00o() && OooO0O0) {
                try {
                    OooO00o.setCookie(str, str2);
                    if (Build.VERSION.SDK_INT < 21) {
                        CookieSyncManager.getInstance().sync();
                    } else {
                        OooO00o.flush();
                    }
                } catch (Throwable th) {
                    ALog.m288e(f20086OooO00o, "set cookie failed. url=" + str + " cookies=" + str2, null, th, new Object[0]);
                }
            }
        }
    }

    public static void OooO00o(String str, Map<String, List<String>> map) {
        if (str != null && map != null) {
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (key.equalsIgnoreCase(HttpConstant.SET_COOKIE) || key.equalsIgnoreCase(HttpConstant.SET_COOKIE2))) {
                        for (String str2 : entry.getValue()) {
                            OooO00o(str, str2);
                        }
                    }
                }
            } catch (Exception e) {
                ALog.m288e(f20086OooO00o, "set cookie failed", null, e, "url", str, "\nheaders", map);
            }
        }
    }

    public static synchronized String OooO00o(String str) {
        synchronized (C7354o0O0ooO0.class) {
            String str2 = null;
            if (!OooO00o() || !OooO0O0) {
                return null;
            }
            try {
                str2 = OooO00o.getCookie(str);
            } catch (Throwable th) {
                ALog.m288e(f20086OooO00o, "get cookie failed. url=" + str, null, th, new Object[0]);
            }
            return str2;
        }
    }
}
