package com.tencent.bugly.crashreport.crash.p268h5;

import android.webkit.JavascriptInterface;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.umeng.analytics.pro.C3416b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface */
public class H5JavaScriptInterface {

    /* renamed from: a */
    public static HashSet<Integer> f7898a = new HashSet<>();

    /* renamed from: b */
    public String f7899b = null;

    /* renamed from: c */
    public Thread f7900c = null;

    /* renamed from: d */
    public String f7901d = null;

    /* renamed from: e */
    public Map<String, String> f7902e = null;

    /* renamed from: a */
    public static String m8191a(Thread thread) {
        if (thread == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 2; i < thread.getStackTrace().length; i++) {
            StackTraceElement stackTraceElement = thread.getStackTrace()[i];
            if (!stackTraceElement.toString().contains("crashreport")) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static H5JavaScriptInterface getInstance(CrashReport.WebViewInterface webViewInterface) {
        if (webViewInterface == null || f7898a.contains(Integer.valueOf(webViewInterface.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f7898a.add(Integer.valueOf(webViewInterface.hashCode()));
        Thread currentThread = Thread.currentThread();
        h5JavaScriptInterface.f7900c = currentThread;
        h5JavaScriptInterface.f7901d = m8191a(currentThread);
        h5JavaScriptInterface.f7902e = m8192a(webViewInterface);
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C3321an.m8356d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C3321an.m8356d("Payload from JS is null.", new Object[0]);
            return;
        }
        String b = C3325ap.m8415b(str.getBytes());
        String str2 = this.f7899b;
        if (str2 == null || !str2.equals(b)) {
            this.f7899b = b;
            C3321an.m8356d("Handling JS exception ...", new Object[0]);
            C3295a a = m8190a(str);
            if (a == null) {
                C3321an.m8356d("Failed to parse payload.", new Object[0]);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(a.mo38289a());
            linkedHashMap.putAll(this.f7902e);
            linkedHashMap.put("Java Stack", this.f7901d);
            m8193a(a, this.f7900c, linkedHashMap);
            return;
        }
        C3321an.m8356d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
    }

    /* renamed from: a */
    public static Map<String, String> m8192a(CrashReport.WebViewInterface webViewInterface) {
        HashMap hashMap = new HashMap();
        hashMap.put("[WebView] ContentDescription", "" + ((Object) webViewInterface.getContentDescription()));
        return hashMap;
    }

    /* renamed from: a */
    private C3295a m8190a(String str) {
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C3295a aVar = new C3295a();
                String string = jSONObject.getString("projectRoot");
                aVar.f7903a = string;
                if (string == null) {
                    return null;
                }
                String string2 = jSONObject.getString(C3416b.f8433Q);
                aVar.f7904b = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("url");
                aVar.f7905c = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("userAgent");
                aVar.f7906d = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("language");
                aVar.f7907e = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("name");
                aVar.f7908f = string6;
                if (string6 != null) {
                    if (!string6.equals("null")) {
                        String string7 = jSONObject.getString("stacktrace");
                        if (string7 == null) {
                            return null;
                        }
                        int indexOf = string7.indexOf("\n");
                        if (indexOf < 0) {
                            C3321an.m8356d("H5 crash stack's format is wrong!", new Object[0]);
                            return null;
                        }
                        aVar.f7910h = string7.substring(indexOf + 1);
                        String substring = string7.substring(0, indexOf);
                        aVar.f7909g = substring;
                        int indexOf2 = substring.indexOf(Constants.COLON_SEPARATOR);
                        if (indexOf2 > 0) {
                            aVar.f7909g = aVar.f7909g.substring(indexOf2 + 1);
                        }
                        aVar.f7911i = jSONObject.getString("file");
                        if (aVar.f7908f == null) {
                            return null;
                        }
                        long j = jSONObject.getLong("lineNumber");
                        aVar.f7912j = j;
                        if (j < 0) {
                            return null;
                        }
                        long j2 = jSONObject.getLong("columnNumber");
                        aVar.f7913k = j2;
                        if (j2 < 0) {
                            return null;
                        }
                        C3321an.m8349a("H5 crash information is following: ", new Object[0]);
                        C3321an.m8349a("[projectRoot]: " + aVar.f7903a, new Object[0]);
                        C3321an.m8349a("[context]: " + aVar.f7904b, new Object[0]);
                        C3321an.m8349a("[url]: " + aVar.f7905c, new Object[0]);
                        C3321an.m8349a("[userAgent]: " + aVar.f7906d, new Object[0]);
                        C3321an.m8349a("[language]: " + aVar.f7907e, new Object[0]);
                        C3321an.m8349a("[name]: " + aVar.f7908f, new Object[0]);
                        C3321an.m8349a("[message]: " + aVar.f7909g, new Object[0]);
                        C3321an.m8349a("[stacktrace]: \n" + aVar.f7910h, new Object[0]);
                        C3321an.m8349a("[file]: " + aVar.f7911i, new Object[0]);
                        C3321an.m8349a("[lineNumber]: " + aVar.f7912j, new Object[0]);
                        C3321an.m8349a("[columnNumber]: " + aVar.f7913k, new Object[0]);
                        return aVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m8193a(C3295a aVar, Thread thread, Map<String, String> map) {
        if (aVar != null) {
            InnerApi.postH5CrashAsync(thread, aVar.f7908f, aVar.f7909g, aVar.f7910h, map);
        }
    }
}
