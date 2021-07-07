package com.taobao.accs.antibrush;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.utl.ALog;
import java.util.StringTokenizer;

/* renamed from: com.taobao.accs.antibrush.b */
public class C3087b {
    public static final String KEY_SEC = "sec";
    public static final String TAG = "CookieMgr";

    /* renamed from: a */
    public static CookieManager f6826a;

    /* renamed from: b */
    public static volatile boolean f6827b;

    /* renamed from: a */
    public static synchronized void m7228a(Context context) {
        synchronized (C3087b.class) {
            try {
                if (!GlobalConfig.enableCookie) {
                    ALog.m7600i(TAG, "disable cookie", new Object[0]);
                    return;
                } else if (!f6827b) {
                    if (Build.VERSION.SDK_INT < 21) {
                        CookieSyncManager.createInstance(context);
                    }
                    CookieManager instance = CookieManager.getInstance();
                    f6826a = instance;
                    instance.setAcceptCookie(true);
                    if (Build.VERSION.SDK_INT < 21) {
                        f6826a.removeExpiredCookie();
                    }
                    f6827b = true;
                    return;
                } else {
                    return;
                }
            } catch (Throwable th) {
                ALog.m7598e(TAG, "setup", th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static String m7230b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, C7522o0Ooo0o.OooO0O0);
        do {
            try {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf != -1) {
                    String trim = nextToken.substring(0, indexOf).trim();
                    String trim2 = nextToken.substring(indexOf + 1).trim();
                    if (KEY_SEC.equals(trim)) {
                        str2 = m7231c(trim2);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid cookie name-value pair");
                }
            } catch (Throwable th) {
                ALog.m7598e(TAG, "parse", th, new Object[0]);
            }
        } while (stringTokenizer.hasMoreTokens());
        return str2;
    }

    /* renamed from: c */
    public static String m7231c(String str) {
        if (str == null || str.length() <= 2 || str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
            return (str == null || str.length() <= 2 || str.charAt(0) != '\'' || str.charAt(str.length() - 1) != '\'') ? str : str.substring(1, str.length() - 1);
        }
        return str.substring(1, str.length() - 1);
    }

    /* renamed from: a */
    public static boolean m7229a() {
        Context context;
        if (!f6827b && (context = GlobalClientInfo.f6858a) != null) {
            m7228a(context);
        }
        return f6827b;
    }

    /* renamed from: a */
    public static synchronized String m7227a(String str) {
        synchronized (C3087b.class) {
            String str2 = null;
            if (!m7229a()) {
                ALog.m7599e(TAG, "cookieMgr not setup", new Object[0]);
                return null;
            }
            try {
                str2 = m7230b(f6826a.getCookie(str));
            } catch (Throwable th) {
                ALog.m7598e(TAG, "get cookie failed. url=" + str, th, new Object[0]);
            }
            return str2;
        }
    }
}
