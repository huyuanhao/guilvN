package com.tencent.bugly;

import com.tencent.bugly.crashreport.common.info.C3269a;
import java.util.Map;

public class BuglyStrategy {

    /* renamed from: a */
    public String f7301a;

    /* renamed from: b */
    public String f7302b;

    /* renamed from: c */
    public String f7303c;

    /* renamed from: d */
    public long f7304d;

    /* renamed from: e */
    public String f7305e;

    /* renamed from: f */
    public String f7306f;

    /* renamed from: g */
    public boolean f7307g = true;

    /* renamed from: h */
    public boolean f7308h = true;

    /* renamed from: i */
    public boolean f7309i = true;

    /* renamed from: j */
    public Class<?> f7310j = null;

    /* renamed from: k */
    public boolean f7311k = true;

    /* renamed from: l */
    public boolean f7312l = true;

    /* renamed from: m */
    public boolean f7313m = true;

    /* renamed from: n */
    public boolean f7314n = false;

    /* renamed from: o */
    public C3214a f7315o;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C3214a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 30000;

        public synchronized Map<String, String> onCrashHandleStart(int i, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        return this.f7302b == null ? C3269a.m7966b().f7694r : this.f7302b;
    }

    public synchronized String getAppPackageName() {
        return this.f7303c == null ? C3269a.m7966b().f7680d : this.f7303c;
    }

    public synchronized long getAppReportDelay() {
        return this.f7304d;
    }

    public synchronized String getAppVersion() {
        return this.f7301a == null ? C3269a.m7966b().f7692p : this.f7301a;
    }

    public synchronized C3214a getCrashHandleCallback() {
        return this.f7315o;
    }

    public synchronized String getDeviceID() {
        return this.f7306f;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f7305e;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f7310j;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f7311k;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f7308h;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f7307g;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f7309i;
    }

    public boolean isReplaceOldChannel() {
        return this.f7312l;
    }

    public synchronized boolean isUploadProcess() {
        return this.f7313m;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f7314n;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f7302b = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f7303c = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j) {
        this.f7304d = j;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f7301a = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z) {
        this.f7311k = z;
        return this;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C3214a aVar) {
        this.f7315o = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f7306f = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z) {
        this.f7308h = z;
        return this;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z) {
        this.f7307g = z;
        return this;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z) {
        this.f7309i = z;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f7305e = str;
        return this;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z) {
        this.f7314n = z;
        return this;
    }

    public void setReplaceOldChannel(boolean z) {
        this.f7312l = z;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z) {
        this.f7313m = z;
        return this;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f7310j = cls;
        return this;
    }
}
