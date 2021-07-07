package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3441h;
import com.umeng.commonsdk.debug.UMLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

public class MobclickAgent {

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);
        

        /* renamed from: a */
        public int f8365a;

        /* access modifiers changed from: public */
        EScenarioType(int i) {
            this.f8365a = i;
        }

        public int toValue() {
            return this.f8365a;
        }
    }

    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void clearPreProperties(Context context) {
        getAgent().mo38669g(context);
    }

    public static void disableExceptionCatch() {
        C3407b.m8667a().mo38650a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    public static void enableEncrypt(boolean z) {
    }

    public static C3407b getAgent() {
        return C3407b.m8667a();
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().mo38670h(context);
    }

    public static void init(Context context) {
        C3407b.m8667a().mo38632a(context);
    }

    public static void onDeepLinkReceived(Context context, String str) {
        C3407b.m8667a().mo38653b(context, str);
    }

    public static void onEvent(Context context, String str) {
        C3407b.m8667a().mo38637a(context, str, null, -1, 1);
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
        if (map == null) {
            UMLog.m9005aq(C3441h.f8621a, 0, "\\|");
        } else {
            C3407b.m8667a().mo38639a(context, str, map, -1);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("__ct__", Integer.valueOf(i));
        C3407b.m8667a().mo38639a(context, str, hashMap, -1);
    }

    public static void onKillProcess(Context context) {
        C3407b.m8667a().mo38660d(context);
    }

    public static void onPageEnd(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3407b.m8667a().mo38655b(str);
        } else {
            UMLog.m9005aq(C3441h.f8598D, 0, "\\|");
        }
    }

    public static void onPageStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3407b.m8667a().mo38646a(str);
        } else {
            UMLog.m9005aq(C3441h.f8597C, 0, "\\|");
        }
    }

    public static void onPause(Context context) {
        C3407b.m8667a().mo38657c(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignOff() {
        C3407b.m8667a().mo38673j();
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8683n, 0, "\\|");
        } else {
            C3407b.m8667a().mo38652b(context);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().mo38642a(context, jSONObject);
    }

    public static void reportError(Context context, String str) {
        C3407b.m8667a().mo38635a(context, str);
    }

    public static void setCatchUncaughtExceptions(boolean z) {
        C3407b.m8667a().mo38650a(z);
    }

    public static void setCheckDevice(boolean z) {
    }

    public static void setDebugMode(boolean z) {
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        getAgent().mo38641a(context, list);
    }

    public static void setGameScenarioType(Context context) {
        C3407b.m8667a().mo38634a(context, EScenarioType.E_UM_GAME);
    }

    public static void setLatencyWindow(long j) {
    }

    public static void setLocation(double d, double d2) {
        C3407b.m8667a().mo38630a(d, d2);
    }

    public static void setOpenGLContext(GL10 gl10) {
        C3407b.m8667a().mo38649a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        C3407b.m8667a().mo38643a(pageMode);
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void setSecret(Context context, String str) {
        C3407b.m8667a().mo38658c(context, str);
    }

    public static void setSessionContinueMillis(long j) {
        if (j <= 30000) {
            j = 30000;
        }
        C3407b.m8667a().mo38631a(j);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().mo38667f(context, str);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m9005aq(C3441h.f8680k, 0, "\\|");
        } else {
            C3407b.m8667a().mo38637a(context, str, str2, -1, 1);
        }
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m9005aq(C3441h.f8689t, 0, "\\|");
        } else if (str2.length() > 64) {
            UMLog.m9005aq(C3441h.f8690u, 0, "\\|");
        } else if (TextUtils.isEmpty(str)) {
            C3407b.m8667a().mo38647a("_adhoc", str2);
        } else if (str.length() > 32) {
            UMLog.m9005aq(C3441h.f8691v, 0, "\\|");
        } else {
            C3407b.m8667a().mo38647a(str, str2);
        }
    }

    public static void reportError(Context context, Throwable th) {
        C3407b.m8667a().mo38640a(context, th);
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        if (map == null) {
            UMLog.m9005aq(C3441h.f8621a, 0, "\\|");
        } else {
            C3407b.m8667a().mo38639a(context, str, new HashMap(map), -1);
        }
    }
}
