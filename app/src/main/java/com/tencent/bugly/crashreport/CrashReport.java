package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.C3216b;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.biz.C3265b;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.BuglyBroadcastReceiver;
import com.tencent.bugly.crashreport.crash.C3287c;
import com.tencent.bugly.crashreport.crash.C3290d;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.p268h5.C3296b;
import com.tencent.bugly.crashreport.crash.p268h5.H5JavaScriptInterface;
import com.tencent.bugly.proguard.C3309af;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CrashReport {

    /* renamed from: a */
    public static Context f7563a;

    public static class CrashHandleCallback extends BuglyStrategy.C3214a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: a */
        public CrashHandleCallback f7565a;

        public UserStrategy(Context context) {
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f7565a = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f7565a;
        }
    }

    public interface WebViewInterface {
        void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str);

        CharSequence getContentDescription();

        String getUrl();

        void loadUrl(String str);

        void setJavaScriptEnabled(boolean z);
    }

    public static void closeBugly() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else if (f7563a != null) {
            BuglyBroadcastReceiver instance = BuglyBroadcastReceiver.getInstance();
            if (instance != null) {
                instance.unregister(f7563a);
            }
            closeCrashReport();
            C3265b.m7926a(f7563a);
            C3319am a = C3319am.m8340a();
            if (a != null) {
                a.mo38400b();
            }
        }
    }

    public static void closeCrashReport() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else {
            C3287c.m8145a().mo38260d();
        }
    }

    public static void closeNativeReport() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else {
            C3287c.m8145a().mo38263g();
        }
    }

    public static void enableBugly(boolean z) {
        C3216b.f7322a = z;
    }

    public static void enableObtainId(Context context, boolean z) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (context == null) {
            String str2 = C3321an.f8051b;
        } else {
            String str3 = C3321an.f8051b;
            Log.i(str3, "Enable identification obtaining? " + z);
            C3269a.m7965a(context).mo38153b(z);
        }
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return new HashSet();
        } else if (context != null) {
            return C3269a.m7965a(context).mo38129E();
        } else {
            String str2 = C3321an.f8051b;
            return new HashSet();
        }
    }

    public static String getAppChannel() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return "unknown";
        } else if (CrashModule.getInstance().hasInitialized()) {
            return C3269a.m7965a(f7563a).f7694r;
        } else {
            String str2 = C3321an.f8051b;
            return "unknown";
        }
    }

    public static String getAppID() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return "unknown";
        } else if (CrashModule.getInstance().hasInitialized()) {
            return C3269a.m7965a(f7563a).mo38161f();
        } else {
            String str2 = C3321an.f8051b;
            return "unknown";
        }
    }

    public static String getAppVer() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return "unknown";
        } else if (CrashModule.getInstance().hasInitialized()) {
            return C3269a.m7965a(f7563a).f7692p;
        } else {
            String str2 = C3321an.f8051b;
            return "unknown";
        }
    }

    public static String getBuglyVersion(Context context) {
        if (context != null) {
            return C3269a.m7965a(context).mo38154c();
        }
        C3321an.m8356d("Please call with context.", new Object[0]);
        return "unknown";
    }

    public static Map<String, String> getSdkExtraData() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return new HashMap();
        } else if (CrashModule.getInstance().hasInitialized()) {
            return C3269a.m7965a(f7563a).f7628I;
        } else {
            String str2 = C3321an.f8051b;
            return null;
        }
    }

    public static String getUserData(Context context, String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
            return "unknown";
        } else if (context == null) {
            String str3 = C3321an.f8051b;
            return "unknown";
        } else if (C3325ap.m8404a(str)) {
            return null;
        } else {
            return C3269a.m7965a(context).mo38164g(str);
        }
    }

    public static int getUserDatasSize(Context context) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return -1;
        } else if (context != null) {
            return C3269a.m7965a(context).mo38128D();
        } else {
            String str2 = C3321an.f8051b;
            return -1;
        }
    }

    public static String getUserId() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return "unknown";
        } else if (CrashModule.getInstance().hasInitialized()) {
            return C3269a.m7965a(f7563a).mo38163g();
        } else {
            String str2 = C3321an.f8051b;
            return "unknown";
        }
    }

    public static int getUserSceneTagId(Context context) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return -1;
        } else if (context != null) {
            return C3269a.m7965a(context).mo38132H();
        } else {
            String str2 = C3321an.f8051b;
            return -1;
        }
    }

    public static void initCrashReport(Context context) {
        f7563a = context;
        C3216b.m7743a(CrashModule.getInstance());
        C3216b.m7739a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return false;
        } else if (CrashModule.getInstance().hasInitialized()) {
            return C3287c.m8145a().mo38258b();
        } else {
            String str2 = C3321an.f8051b;
            return false;
        }
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread());
    }

    public static void postException(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
        if (!C3216b.f7322a) {
            String str4 = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str5 = C3321an.f8051b;
        } else {
            C3290d.m8171a(thread, i, str, str2, str3, map);
        }
    }

    public static void putSdkData(Context context, String str, String str2) {
        if (context != null && !C3325ap.m8404a(str) && !C3325ap.m8404a(str2)) {
            String replace = str.replace("[a-zA-Z[0-9]]+", "");
            if (replace.length() > 100) {
                String str3 = C3321an.f8051b;
                String.format("putSdkData key length over limit %d, will be cutted.", 50);
                replace = replace.substring(0, 50);
            }
            if (str2.length() > 500) {
                String str4 = C3321an.f8051b;
                String.format("putSdkData value length over limit %d, will be cutted!", 200);
                str2 = str2.substring(0, 200);
            }
            C3269a.m7965a(context).mo38156c(replace, str2);
            C3321an.m8352b(String.format("[param] putSdkData data: %s - %s", replace, str2), new Object[0]);
        }
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C3216b.f7322a) {
            String str3 = C3321an.f8051b;
        } else if (context == null) {
            String str4 = C3321an.f8051b;
        } else if (str == null) {
            String str5 = "" + str;
            C3321an.m8356d("putUserData args key should not be null or empty", new Object[0]);
        } else if (str2 == null) {
            String str6 = "" + str2;
            C3321an.m8356d("putUserData args value should not be null", new Object[0]);
        } else if (!str.matches("[a-zA-Z[0-9]]+")) {
            C3321an.m8356d("putUserData args key should match [a-zA-Z[0-9]]+  {" + str + C7522o0Ooo0o.OooO0Oo, new Object[0]);
        } else {
            if (str2.length() > 200) {
                C3321an.m8356d("user data value length over limit %d, it will be cutted!", 200);
                str2 = str2.substring(0, 200);
            }
            C3269a a = C3269a.m7965a(context);
            if (a.mo38129E().contains(str)) {
                NativeCrashHandler instance = NativeCrashHandler.getInstance();
                if (instance != null) {
                    instance.putKeyValueToNative(str, str2);
                }
                C3269a.m7965a(context).mo38152b(str, str2);
                C3321an.m8355c("replace KV %s %s", str, str2);
            } else if (a.mo38128D() >= 10) {
                C3321an.m8356d("user data size is over limit %d, it will be cutted!", 10);
            } else {
                if (str.length() > 50) {
                    C3321an.m8356d("user data key length over limit %d , will drop this new key %s", 50, str);
                    str = str.substring(0, 50);
                }
                NativeCrashHandler instance2 = NativeCrashHandler.getInstance();
                if (instance2 != null) {
                    instance2.putKeyValueToNative(str, str2);
                }
                C3269a.m7965a(context).mo38152b(str, str2);
                C3321an.m8352b("[param] set user data: %s - %s", str, str2);
            }
        }
    }

    public static String removeUserData(Context context, String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
            return "unknown";
        } else if (context == null) {
            String str3 = C3321an.f8051b;
            return "unknown";
        } else if (C3325ap.m8404a(str)) {
            return null;
        } else {
            C3321an.m8352b("[param] remove user data: %s", str);
            return C3269a.m7965a(context).mo38162f(str);
        }
    }

    public static void setAppChannel(Context context, String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
        } else if (context == null) {
            String str3 = C3321an.f8051b;
        } else if (str == null) {
            String str4 = C3321an.f8051b;
        } else {
            C3269a.m7965a(context).f7694r = str;
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeAppChannel(str);
            }
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
        } else if (context == null) {
            String str3 = C3321an.f8051b;
        } else if (str == null) {
            String str4 = C3321an.f8051b;
        } else {
            C3269a.m7965a(context).f7680d = str;
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeAppPackage(str);
            }
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
        } else if (context == null) {
            String str3 = C3321an.f8051b;
        } else if (str == null) {
            String str4 = C3321an.f8051b;
        } else {
            C3269a.m7965a(context).f7692p = str;
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeAppVersion(str);
            }
        }
    }

    public static void setAuditEnable(Context context, boolean z) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (context == null) {
            String str2 = C3321an.f8051b;
        } else {
            String str3 = C3321an.f8051b;
            Log.i(str3, "Set audit enable: " + z);
            C3269a.m7965a(context).f7629J = z;
        }
    }

    public static void setBuglyDbName(String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
            return;
        }
        String str3 = C3321an.f8051b;
        Log.i(str3, "Set Bugly DB name: " + str);
        C3309af.f7981a = str;
    }

    public static void setContext(Context context) {
        f7563a = context;
    }

    public static void setCrashFilter(String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
            return;
        }
        String str3 = C3321an.f8051b;
        Log.i(str3, "Set crash stack filter: " + str);
        C3287c.f7855n = str;
    }

    public static void setCrashRegularFilter(String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
            return;
        }
        String str3 = C3321an.f8051b;
        Log.i(str3, "Set crash stack filter: " + str);
        C3287c.f7856o = str;
    }

    public static void setHandleNativeCrashInJava(boolean z) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return;
        }
        String str2 = C3321an.f8051b;
        Log.i(str2, "Should handle native crash in Java profile after handled in native profile: " + z);
        NativeCrashHandler.setShouldHandleInJava(z);
    }

    public static void setIsAppForeground(Context context, boolean z) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (context == null) {
            C3321an.m8356d("Context should not be null.", new Object[0]);
        } else {
            if (z) {
                C3321an.m8355c("App is in foreground.", new Object[0]);
            } else {
                C3321an.m8355c("App is in background.", new Object[0]);
            }
            C3269a.m7965a(context).mo38148a(z);
        }
    }

    public static void setIsDevelopmentDevice(Context context, boolean z) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (context == null) {
            C3321an.m8356d("Context should not be null.", new Object[0]);
        } else {
            if (z) {
                C3321an.m8355c("This is a development device.", new Object[0]);
            } else {
                C3321an.m8355c("This is not a development device.", new Object[0]);
            }
            C3269a.m7965a(context).f7624E = z;
        }
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z) {
        return setJavascriptMonitor(webView, z, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!C3216b.f7322a) {
            String str3 = C3321an.f8051b;
        } else if (context != null && !C3325ap.m8404a(str) && !C3325ap.m8404a(str2)) {
            C3269a.m7965a(context).mo38147a(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (C3325ap.m8404a(str) || !C3325ap.m8429c(str)) {
            Log.i(C3321an.f8051b, "URL is invalid.");
            return;
        }
        C3272a.m8071a(str);
        StrategyBean.f7709b = str;
        StrategyBean.f7710c = str;
    }

    public static void setSessionIntervalMills(long j) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else {
            C3265b.m7925a(j);
        }
    }

    public static void setUserId(String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str3 = C3321an.f8051b;
        } else {
            setUserId(f7563a, str);
        }
    }

    public static void setUserSceneTag(Context context, int i) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (context == null) {
            String str2 = C3321an.f8051b;
        } else {
            if (i <= 0) {
                C3321an.m8356d("setTag args tagId should > 0", new Object[0]);
            }
            C3269a.m7965a(context).mo38145a(i);
            C3321an.m8352b("[param] set user scene tag: %d", Integer.valueOf(i));
        }
    }

    public static void startCrashReport() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else {
            C3287c.m8145a().mo38259c();
        }
    }

    public static void testANRCrash() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else {
            C3321an.m8349a("start to create a anr crash for test!", new Object[0]);
            C3287c.m8145a().mo38267k();
        }
    }

    public static void testJavaCrash() {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else {
            C3269a b = C3269a.m7966b();
            if (b != null) {
                b.mo38150b(24096);
            }
            throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
        }
    }

    public static void testNativeCrash() {
        testNativeCrash(false, false, false);
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z, boolean z2) {
        if (webView != null) {
            return setJavascriptMonitor(new WebViewInterface() {
                /* class com.tencent.bugly.crashreport.CrashReport.C32561 */

                @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
                public void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                    webView.addJavascriptInterface(h5JavaScriptInterface, str);
                }

                @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
                public CharSequence getContentDescription() {
                    return webView.getContentDescription();
                }

                @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
                public String getUrl() {
                    return webView.getUrl();
                }

                @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
                public void loadUrl(String str) {
                    webView.loadUrl(str);
                }

                @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
                public void setJavaScriptEnabled(boolean z) {
                    WebSettings settings = webView.getSettings();
                    if (!settings.getJavaScriptEnabled()) {
                        settings.setJavaScriptEnabled(true);
                    }
                }
            }, z, z2);
        }
        String str = C3321an.f8051b;
        return false;
    }

    public static void testNativeCrash(boolean z, boolean z2, boolean z3) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else {
            C3321an.m8349a("start to create a native crash for test!", new Object[0]);
            C3287c.m8145a().mo38257a(z, z2, z3);
        }
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = C3321an.f8051b;
        } else if (th == null) {
            C3321an.m8356d("throwable is null, just return", new Object[0]);
        } else {
            if (thread == null) {
                thread = Thread.currentThread();
            }
            C3287c.m8145a().mo38256a(thread, th, false, (String) null, (byte[]) null, z);
        }
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        f7563a = context;
        C3216b.m7743a(CrashModule.getInstance());
        C3216b.m7740a(context, userStrategy);
    }

    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z) {
        return setJavascriptMonitor(webViewInterface, z, false);
    }

    public static void postException(int i, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i, str, str2, str3, map);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z, boolean z2) {
        if (webViewInterface == null) {
            String str = C3321an.f8051b;
            return false;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            C3321an.m8357e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        } else {
            C3321an.m8349a("Set Javascript exception monitor of webview.", new Object[0]);
            if (!C3216b.f7322a) {
                String str2 = C3321an.f8051b;
                return false;
            }
            C3321an.m8355c("URL of webview is %s", webViewInterface.getUrl());
            if (z2 || Build.VERSION.SDK_INT >= 19) {
                C3321an.m8349a("Enable the javascript needed by webview monitor.", new Object[0]);
                webViewInterface.setJavaScriptEnabled(true);
                H5JavaScriptInterface instance = H5JavaScriptInterface.getInstance(webViewInterface);
                if (instance != null) {
                    C3321an.m8349a("Add a secure javascript interface to the webview.", new Object[0]);
                    webViewInterface.addJavascriptInterface(instance, "exceptionUploader");
                }
                if (z) {
                    C3321an.m8349a("Inject bugly.js(v%s) to the webview.", C3296b.m8196b());
                    String a = C3296b.m8195a();
                    if (a == null) {
                        C3321an.m8357e("Failed to inject Bugly.js.", C3296b.m8196b());
                        return false;
                    }
                    webViewInterface.loadUrl("javascript:" + a);
                }
                return true;
            }
            C3321an.m8357e("This interface is only available for Android 4.4 or later.", new Object[0]);
            return false;
        }
    }

    public static void setUserId(Context context, String str) {
        if (!C3216b.f7322a) {
            String str2 = C3321an.f8051b;
        } else if (context == null) {
            String str3 = C3321an.f8051b;
        } else if (str == null) {
            C3321an.m8356d("userId should not be null", new Object[0]);
        } else {
            if (str.length() > 100) {
                String substring = str.substring(0, 100);
                C3321an.m8356d("userId %s length is over limit %d substring to %s", str, 100, substring);
                str = substring;
            }
            if (!str.equals(C3269a.m7965a(context).mo38163g())) {
                C3269a.m7965a(context).mo38151b(str);
                C3321an.m8352b("[user] set userId : %s", str);
                NativeCrashHandler instance = NativeCrashHandler.getInstance();
                if (instance != null) {
                    instance.setNativeUserId(str);
                }
                if (CrashModule.getInstance().hasInitialized()) {
                    C3265b.m7924a();
                }
            }
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!C3216b.f7322a) {
            String str = C3321an.f8051b;
            return new HashMap();
        } else if (context != null) {
            return C3269a.m7965a(context).f7628I;
        } else {
            C3321an.m8356d("Context should not be null.", new Object[0]);
            return null;
        }
    }

    public static void initCrashReport(Context context, String str, boolean z) {
        initCrashReport(context, str, z, null);
    }

    public static void initCrashReport(Context context, String str, boolean z, UserStrategy userStrategy) {
        if (context != null) {
            f7563a = context;
            C3216b.m7743a(CrashModule.getInstance());
            C3216b.m7741a(context, str, z, userStrategy);
        }
    }
}
