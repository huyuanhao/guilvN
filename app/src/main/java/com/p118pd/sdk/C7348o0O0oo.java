package com.p118pd.sdk;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0209c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0218b;
import anet.channel.util.HttpUrl;
import anetwork.channel.http.NetworkSdkSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0O0oo  reason: case insensitive filesystem */
public class C7348o0O0oo {
    public static volatile boolean OooO = false;
    public static volatile int OooO00o = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile long f20069OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile AbstractC7349o0O0oo0 f20070OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final List<String> f20071OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile ConcurrentHashMap<String, List<String>> f20072OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile CopyOnWriteArrayList<String> f20073OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile boolean f20074OooO00o = true;
    public static volatile int OooO0O0 = 10000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static volatile ConcurrentHashMap<String, List<String>> f20075OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static volatile boolean f20076OooO0O0 = true;
    public static volatile int OooO0OO = 60000;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static volatile boolean f20077OooO0OO = true;
    public static volatile boolean OooO0Oo = true;
    public static volatile boolean OooO0o = false;
    public static volatile boolean OooO0o0 = true;
    public static volatile boolean OooO0oO;
    public static volatile boolean OooO0oo = true;
    public static volatile boolean OooOO0 = true;

    public static boolean OooO() {
        return f20074OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18854OooO00o() {
        f20069OooO00o = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).getLong("Cache.Flag", 0);
    }

    public static void OooO0O0(boolean z) {
        OooO0o = z;
    }

    public static void OooO0OO(int i) {
        OooO00o = i;
    }

    public static boolean OooO0Oo() {
        return OooO0o0;
    }

    public static boolean OooO0o() {
        return f20077OooO0OO;
    }

    public static boolean OooO0o0() {
        return OooO0Oo;
    }

    public static void OooO0oO(boolean z) {
        if (!z) {
            C0218b.m307a(C0218b.ALLOW_ALL_HOSTNAME_VERIFIER);
            C0218b.m308a(C0218b.TRUST_ALL_SSL_SOCKET_FACTORY);
            return;
        }
        C0218b.m307a((HostnameVerifier) null);
        C0218b.m308a((SSLSocketFactory) null);
    }

    public static void OooO0oo(boolean z) {
        f20077OooO0OO = z;
    }

    public static boolean OooOO0() {
        return f20076OooO0O0;
    }

    public static void OooOO0O(boolean z) {
        f20074OooO00o = z;
    }

    public static void OooOO0o(boolean z) {
        f20076OooO0O0 = z;
    }

    public static void OooO(boolean z) {
        OooOO0 = z;
    }

    public static boolean OooO0O0(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f20072OooO00o) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f20071OooO00o) {
            return true;
        }
        for (String str : list) {
            if (httpUrl.path().startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static int OooO0OO() {
        return OooO00o;
    }

    public static void OooO0Oo(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f20072OooO00o = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, f20071OooO00o);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i = 0; i < length; i++) {
                            Object obj2 = jSONArray.get(i);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e) {
            ALog.m288e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e, new Object[0]);
        }
        f20072OooO00o = concurrentHashMap;
    }

    public static void OooO0o(boolean z) {
        OooO0Oo = z;
    }

    public static void OooO0o0(boolean z) {
        OooO0o0 = z;
    }

    public static boolean OooO0oo() {
        return OooO0oo;
    }

    public static void OooOO0(boolean z) {
        OooO0oo = z;
    }

    public static void OooO00o(AbstractC7349o0O0oo0 o0o0oo0) {
        if (f20070OooO00o != null) {
            f20070OooO00o.unRegister();
        }
        if (o0o0oo0 != null) {
            o0o0oo0.register();
        }
        f20070OooO00o = o0o0oo0;
    }

    public static void OooO0OO(boolean z) {
        OooO0oO = z;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m18857OooO0OO() {
        return OooO;
    }

    public static void OooO0OO(String str) {
        if (TextUtils.isEmpty(str)) {
            f20073OooO00o = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("host");
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (C0209c.m283c(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f20073OooO00o = copyOnWriteArrayList;
        } catch (JSONException e) {
            ALog.m288e("anet.NetworkConfigCenter", "parse hosts failed", null, e, new Object[0]);
        }
    }

    public static boolean OooO0oO() {
        return OooOO0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18855OooO00o() {
        return OooO0Oo && OooO0o;
    }

    public static int OooO0O0() {
        return OooO0O0;
    }

    public static void OooO00o(long j) {
        if (j != f20069OooO00o) {
            ALog.m290i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(f20069OooO00o), "new", Long.valueOf(j));
            f20069OooO00o = j;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            edit.putLong("Cache.Flag", f20069OooO00o);
            edit.apply();
            C7344o0O0oOo.OooO00o();
        }
    }

    public static void OooO0O0(int i) {
        OooO0O0 = i;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m18856OooO0O0() {
        return OooO0oO;
    }

    public static void OooO0O0(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.NetworkConfigCenter", "setDegradeRequestList", null, "Degrade List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f20075OooO0O0 = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, f20071OooO00o);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i = 0; i < length; i++) {
                            Object obj2 = jSONArray.get(i);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e) {
            ALog.m288e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e, new Object[0]);
        }
        f20075OooO0O0 = concurrentHashMap;
    }

    public static void OooO00o(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    if (C0209c.m283c(string)) {
                        arrayList.add(string);
                    }
                }
                HttpDispatcher.getInstance().addHosts(arrayList);
            } catch (JSONException e) {
                ALog.m288e("anet.NetworkConfigCenter", "parse hosts failed", null, e, new Object[0]);
            }
        }
    }

    public static int OooO00o() {
        return OooO0OO;
    }

    public static void OooO00o(int i) {
        OooO0OO = i;
    }

    public static void OooO0Oo(boolean z) {
        OooO = z;
    }

    public static boolean OooO00o(RequestStatistic requestStatistic) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (requestStatistic == null || (copyOnWriteArrayList = f20073OooO00o) == null || TextUtils.isEmpty(requestStatistic.host)) {
            return false;
        }
        Iterator<String> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (requestStatistic.host.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f20075OooO0O0) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f20071OooO00o) {
            return true;
        }
        for (String str : list) {
            if (httpUrl.path().startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static void OooO00o(boolean z) {
        if (z) {
            OooO0Oo(true);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(16);
            AwcnConfig.registerPresetSessions("[{\"host\":\"trade-acs.m.taobao.com\", \"protocol\":\"http2\", \"rtt\":\"0rtt\", \"publicKey\": \"acs\", \"isKeepAlive\":true}]");
            return;
        }
        OooO0Oo(false);
        ThreadPoolExecutorFactory.setNormalExecutorPoolSize(6);
    }
}
