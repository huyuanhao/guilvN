package com.rxhui.android_log_sdk;

import android.content.Context;
import com.learnium.RNDeviceInfo.netInfo.NetInfoManager;
import com.p118pd.sdk.C8906ooOO0Oo;
import com.p118pd.sdk.C8907ooOO0Oo0;
import com.p118pd.sdk.C8908ooOO0OoO;
import com.p118pd.sdk.C8910ooOO0Ooo;
import com.p118pd.sdk.C8911ooOO0o;
import com.p118pd.sdk.C8914ooOO0o0O;
import com.p118pd.sdk.C8915ooOO0o0o;
import java.util.HashMap;
import java.util.Map;

public class LogCollectorManager {
    public static String TAG = "LogCollectorManager";
    public C8914ooOO0o0O logParamsManager;
    public C8911ooOO0o netWorkChangeManager;

    public static class OooO0O0 {
        public static final LogCollectorManager OooO00o = new LogCollectorManager();
    }

    public static LogCollectorManager sharedInstance() {
        return OooO0O0.OooO00o;
    }

    public LogCollectorManager addCommonDesensitizationMap(Map<String, C8906ooOO0Oo> map) {
        C8908ooOO0OoO.OooO00o().OooO00o(map);
        return this;
    }

    public LogCollectorManager addCommonParams(Map<String, String> map) {
        if (map != null) {
            C8908ooOO0OoO.OooO00o().OooO0OO(map);
        }
        return this;
    }

    public LogCollectorManager addExtendParams(Map<String, String> map) {
        if (map != null) {
            C8908ooOO0OoO.OooO00o().OooO0O0(map);
        }
        return this;
    }

    public C8914ooOO0o0O getLogParamsManager() {
        if (this.logParamsManager == null) {
            this.logParamsManager = new C8914ooOO0o0O();
        }
        return this.logParamsManager;
    }

    public LogCollectorManager init(Context context, String str, String str2) {
        if (context == null || !C8908ooOO0OoO.OooO00o().m20551OooO00o(str)) {
            return this;
        }
        C8908ooOO0OoO OooO00o2 = C8908ooOO0OoO.OooO00o();
        OooO00o2.m20549OooO00o(str);
        OooO00o2.OooO00o(context);
        OooO00o2.OooO00o(new C8910ooOO0Ooo(context));
        this.logParamsManager.OooO0OO(str2);
        recordInfo(LogCategory.APPLICATION, LogApplicationType.STARTUP.getValue());
        C8907ooOO0Oo0.OooO00o().m20543OooO00o();
        C8907ooOO0Oo0.OooO00o().OooO00o(context);
        this.netWorkChangeManager = new C8911ooOO0o();
        NetInfoManager.getInstance().registerObserver(context, this.netWorkChangeManager);
        this.logParamsManager.m20563OooO0O0(System.currentTimeMillis());
        return this;
    }

    public void noticeReport() {
        C8908ooOO0OoO.OooO00o().OooO00o(true, true);
    }

    public void recordDebug(String str) {
        recordDebug(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, (Map<String, String>) null);
    }

    public void recordError(String str) {
        recordWarn(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, (Map<String, String>) null);
    }

    public void recordInfo(String str) {
        recordInfo(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, (Map<String, String>) null);
    }

    public void recordWarn(String str) {
        recordWarn(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, (Map<String, String>) null);
    }

    public void release(Context context) {
        try {
            NetInfoManager.getInstance().unRegisterObserver(context, this.netWorkChangeManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sessionStart() {
        this.logParamsManager.m20559OooO00o(System.currentTimeMillis());
    }

    public LogCollectorManager setChannel(String str) {
        this.logParamsManager.OooO00o(str);
        return this;
    }

    public synchronized LogCollectorManager setDebugMode(boolean z) {
        C8908ooOO0OoO.OooO00o().OooO00o(z);
        return this;
    }

    public LogCollectorManager setMappingUrl(String str) {
        this.logParamsManager.OooO0Oo(str);
        return this;
    }

    public LogCollectorManager setMarketChannel(String str) {
        this.logParamsManager.OooO0o0(str);
        return this;
    }

    public LogCollectorManager setMobile(String str) {
        this.logParamsManager.OooO0o(str);
        return this;
    }

    public LogCollectorManager setRelatedUid(String str) {
        this.logParamsManager.OooO0oo(str);
        return this;
    }

    public LogCollectorManager setServerTime(long j) {
        C8908ooOO0OoO.OooO00o().OooO00o(j);
        return this;
    }

    public LogCollectorManager setUid(String str) {
        this.logParamsManager.OooO(str);
        return this;
    }

    public LogCollectorManager setUploadLevel(LogLevel logLevel) {
        C8915ooOO0o0o.OooO00o().OooO00o(logLevel);
        return this;
    }

    public LogCollectorManager setUploadMaxLimit(int i) {
        C8908ooOO0OoO.OooO00o().OooO00o(i);
        return this;
    }

    public LogCollectorManager() {
        this.logParamsManager = new C8914ooOO0o0O();
    }

    public LogCollectorManager addCommonParams(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        addCommonParams(hashMap);
        return this;
    }

    public LogCollectorManager addExtendParams(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        addExtendParams(hashMap);
        return this;
    }

    public void recordDebug(String str, Map<String, String> map) {
        recordDebug(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, map);
    }

    public void recordError(String str, Map<String, String> map) {
        recordWarn(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, map);
    }

    public void recordInfo(String str, Map<String, String> map) {
        recordInfo(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, map);
    }

    public void recordWarn(String str, Map<String, String> map) {
        recordWarn(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, map);
    }

    public void recordDebug(String str, boolean z) {
        recordDebug(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, (Map<String, String>) null);
    }

    public void recordError(String str, boolean z) {
        recordError(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, (Map<String, String>) null);
    }

    public void recordInfo(String str, boolean z) {
        recordInfo(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, (Map<String, String>) null);
    }

    public void recordWarn(String str, boolean z) {
        recordWarn(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, (Map<String, String>) null);
    }

    public void recordDebug(String str, long j) {
        recordDebug(str, j, false, (Map<String, String>) null);
    }

    public void recordError(String str, long j) {
        recordError(str, j, true, (Map<String, String>) null);
    }

    public void recordInfo(String str, long j) {
        recordInfo(str, j, false, (Map<String, String>) null);
    }

    public void recordWarn(String str, long j) {
        recordWarn(str, j, false, (Map<String, String>) null);
    }

    public void recordDebug(String str, long j, boolean z) {
        recordDebug(str, j, z, (Map<String, String>) null);
    }

    public void recordError(String str, long j, boolean z) {
        recordError(str, j, z, (Map<String, String>) null);
    }

    public void recordInfo(String str, long j, boolean z) {
        recordInfo(str, j, z, (Map<String, String>) null);
    }

    public void recordWarn(String str, long j, boolean z) {
        recordWarn(str, j, z, (Map<String, String>) null);
    }

    public void recordDebug(String str, boolean z, Map<String, String> map) {
        recordDebug(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordError(String str, boolean z, Map<String, String> map) {
        recordError(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordInfo(String str, boolean z, Map<String, String> map) {
        recordInfo(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordWarn(String str, boolean z, Map<String, String> map) {
        recordWarn(str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordDebug(String str, long j, boolean z, Map<String, String> map) {
        recordDebug(LogCategory.DEFAULT, str, j, z, map);
    }

    public void recordError(String str, long j, boolean z, Map<String, String> map) {
        recordError(LogCategory.DEFAULT, str, j, z, map);
    }

    public void recordInfo(String str, long j, boolean z, Map<String, String> map) {
        recordInfo(LogCategory.DEFAULT, str, j, z, map);
    }

    public void recordWarn(String str, long j, boolean z, Map<String, String> map) {
        recordWarn(LogCategory.DEFAULT, str, j, z, map);
    }

    public void recordDebug(LogCategory logCategory, String str) {
        recordDebug(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, (Map<String, String>) null);
    }

    public void recordError(LogCategory logCategory, String str) {
        recordError(logCategory, str, (Map<String, String>) null);
    }

    public void recordInfo(LogCategory logCategory, String str) {
        recordInfo(logCategory, str, (Map<String, String>) null);
    }

    public void recordWarn(LogCategory logCategory, String str) {
        recordWarn(logCategory, str, (Map<String, String>) null);
    }

    public void recordDebug(LogCategory logCategory, String str, Map<String, String> map) {
        recordDebug(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), false, map);
    }

    public void recordError(LogCategory logCategory, String str, Map<String, String> map) {
        recordError(logCategory, str, false, map);
    }

    public void recordInfo(LogCategory logCategory, String str, Map<String, String> map) {
        recordInfo(logCategory, str, false, map);
    }

    public void recordWarn(LogCategory logCategory, String str, Map<String, String> map) {
        recordWarn(logCategory, str, false, map);
    }

    public void recordDebug(LogCategory logCategory, String str, boolean z, Map<String, String> map) {
        recordDebug(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordError(LogCategory logCategory, String str, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        recordError(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map, map2);
    }

    public void recordInfo(LogCategory logCategory, String str, boolean z, Map<String, String> map) {
        recordInfo(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordWarn(LogCategory logCategory, String str, boolean z, Map<String, String> map) {
        recordWarn(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordDebug(LogCategory logCategory, String str, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        recordDebug(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map, map2);
    }

    public void recordError(LogCategory logCategory, String str, boolean z, Map<String, String> map) {
        recordError(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map);
    }

    public void recordInfo(LogCategory logCategory, String str, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        recordInfo(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map, map2);
    }

    public void recordWarn(LogCategory logCategory, String str, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        recordWarn(logCategory, str, C8908ooOO0OoO.OooO00o().m20545OooO00o(), z, map, map2);
    }

    public void recordDebug(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map) {
        recordDebug(logCategory, str, j, z, map, null);
    }

    public void recordError(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map) {
        recordError(logCategory, str, j, z, map, null);
    }

    public void recordInfo(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map) {
        recordInfo(logCategory, str, j, z, map, null);
    }

    public void recordWarn(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map) {
        recordWarn(logCategory, str, j, z, map, null);
    }

    public void recordDebug(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        C8908ooOO0OoO.OooO00o().OooO00o(logCategory, str, j, System.currentTimeMillis(), z, LogLevel.debug, map, map2);
    }

    public void recordError(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        C8908ooOO0OoO.OooO00o().OooO00o(logCategory, str, j, System.currentTimeMillis(), z, LogLevel.error, map, map2);
    }

    public void recordInfo(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        C8908ooOO0OoO.OooO00o().OooO00o(logCategory, str, j, System.currentTimeMillis(), z, LogLevel.info, map, map2);
    }

    public void recordWarn(LogCategory logCategory, String str, long j, boolean z, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        C8908ooOO0OoO.OooO00o().OooO00o(logCategory, str, j, System.currentTimeMillis(), z, LogLevel.warn, map, map2);
    }
}
