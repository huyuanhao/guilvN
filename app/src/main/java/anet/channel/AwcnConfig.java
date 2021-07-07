package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.utils.C0209c;
import org.json.JSONArray;
import org.json.JSONObject;

public class AwcnConfig {

    /* renamed from: a */
    public static volatile boolean f6a = false;

    /* renamed from: b */
    public static volatile boolean f7b = true;

    /* renamed from: c */
    public static volatile boolean f8c = true;

    /* renamed from: d */
    public static volatile boolean f9d = true;

    /* renamed from: e */
    public static volatile boolean f10e = false;

    /* renamed from: f */
    public static volatile boolean f11f = false;

    /* renamed from: g */
    public static volatile long f12g = 43200000;

    /* renamed from: h */
    public static volatile boolean f13h = true;

    /* renamed from: i */
    public static volatile boolean f14i = true;

    /* renamed from: j */
    public static boolean f15j = true;

    /* renamed from: k */
    public static boolean f16k;

    public static long getIpv6BlackListTtl() {
        return f12g;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f6a;
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return f15j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return f16k;
    }

    public static boolean isHorseRaceEnable() {
        return f8c;
    }

    public static boolean isHttpsSniEnable() {
        return f7b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f11f;
    }

    public static boolean isIpv6BlackListEnable() {
        return f14i;
    }

    public static boolean isIpv6Enable() {
        return f13h;
    }

    public static boolean isQuicEnable() {
        return f10e;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f9d;
    }

    public static void registerPresetSessions(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("host");
                    if (C0209c.m283c(string)) {
                        StrategyTemplate.getInstance().registerConnProtocol(string, ConnProtocol.valueOf(jSONObject.getString("protocol"), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                        if (jSONObject.getBoolean("isKeepAlive")) {
                            SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, null, null, null));
                        }
                    } else {
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z) {
        f6a = z;
    }

    public static void setAppLifeCycleListenerEnable(boolean z) {
        f15j = z;
    }

    public static void setAsyncLoadStrategyEnable(boolean z) {
        f16k = z;
    }

    public static void setHorseRaceEnable(boolean z) {
        f8c = z;
    }

    public static void setHttpsSniEnable(boolean z) {
        f7b = z;
    }

    public static void setIdleSessionCloseEnable(boolean z) {
        f11f = z;
    }

    public static void setIpv6BlackListEnable(boolean z) {
        f14i = z;
    }

    public static void setIpv6BlackListTtl(long j) {
        f12g = j;
    }

    public static void setIpv6Enable(boolean z) {
        f13h = z;
    }

    public static void setQuicEnable(boolean z) {
        f10e = z;
    }

    public static void setTnetHeaderCacheEnable(boolean z) {
        f9d = z;
    }
}
