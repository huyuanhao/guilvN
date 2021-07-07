package com.qiyukf.unicorn.p213f;

import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.p176b.C2187d;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2466b;
import com.qiyukf.unicorn.p212e.C2468d;
import com.qiyukf.unicorn.p212e.C2469e;
import com.qiyukf.unicorn.p212e.C2472g;
import com.qiyukf.unicorn.p213f.p214a.C2547b;
import com.qiyukf.unicorn.p213f.p223b.C2632a;
import com.qiyukf.unicorn.p213f.p223b.C2633b;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.c */
public final class C2634c {
    /* renamed from: a */
    public static int m5998a(String str) {
        int i;
        int a = C2187d.m4514a();
        try {
            C2632a.m5992a(a == 1 ? "http://da.qytest.netease.com" : a == 2 ? "http://da.qiyukf.netease.com" : "https://da.qiyukf.com", String.format(Locale.getDefault(), "%s?ak=%s&bid=%s&r=%s", "/mobileda/da.gif", C2452d.m5371d(), C2452d.m5367c().getPackageName(), str), null);
            i = 200;
        } catch (C2633b e) {
            i = e.mo36245a();
        }
        C1709a.m3018d("YSFClient", "upload records, code = " + i);
        return i;
    }

    /* renamed from: a */
    public static C2631b m5999a(String str, String str2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("appKey", str);
        hashMap.put("deviceid", str2);
        try {
            JSONObject a = C1810b.m3420a(C2632a.m5995b("/webapi/user/create.action", hashMap));
            C2631b bVar = new C2631b();
            int b = C1810b.m3427b(a, "code");
            if (b == 200) {
                JSONObject f = C1810b.m3433f(a, "info");
                C1709a.m3014b(C7383o0OOO0O.OooOOO0, f.toString());
                bVar.mo36241a(new LoginInfo(f.getString("accid"), f.getString("token")));
                boolean z = true;
                if (C1810b.m3427b(f, "push") != 1) {
                    z = false;
                }
                bVar.mo36242a(z);
                C2437b.m5269d(C1810b.m3432e(f, "bid"));
                return bVar;
            }
            C1709a.m3011a("HTTP", "fetch login data error, code: " + b);
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static List<C2472g> m6000a(String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("appKey", C2452d.m5371d());
        hashMap.put("bid", str);
        hashMap.put("groupid", String.valueOf(j));
        hashMap.put("fromtype", "Android");
        ArrayList arrayList = new ArrayList();
        try {
            String a = C2632a.m5993a("/webapi/user/getLeaveCustomfield", hashMap);
            C1709a.m3011a("/webapi/user/getLeaveCustomfield", a);
            JSONObject a2 = C1810b.m3420a(a);
            int b = C1810b.m3427b(a2, "code");
            if (b == 200) {
                JSONArray g = C1810b.m3434g(a2, "result");
                for (int i = 0; i < g.length(); i++) {
                    JSONObject b2 = C1810b.m3429b(g, i);
                    C2472g gVar = new C2472g();
                    C2547b.m5680a(gVar, b2);
                    arrayList.add(gVar);
                }
                return arrayList;
            }
            C1709a.m3016c("getModelResponseList is error", "errorcode:" + b + a);
            return null;
        } catch (C2633b e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m6001a() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", "aos");
        hashMap.put(C3617o.f9365as, "sdk");
        try {
            int a = C2187d.m4514a();
            return C1810b.m3420a(C2632a.m5992a(a == 1 ? "http://qytest.netease.com" : a == 2 ? "http://qiyukf.netease.com" : "https://qy-swallow.qiyukf.com", "/swallow/config", hashMap));
        } catch (C2633b e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m6002a(String str, String str2, long j, String str3, long j2, long j3) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("time", String.valueOf(j));
        if (j2 <= 0 || j3 <= 0) {
            hashMap.put("appKey", str);
            hashMap.put("nimId", str2);
            hashMap.put("pkg", str3);
        } else {
            hashMap.put("user", String.valueOf(j2));
            hashMap.put("app", String.valueOf(j3));
        }
        try {
            return C1810b.m3433f(C1810b.m3420a(C2632a.m5995b("/webapi/user/queryCount.action", hashMap)), "result");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m6003a(RequestCallback<List<C2469e>> requestCallback) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        hashMap.put("appKey", C2452d.m5371d());
        try {
            ArrayList arrayList = new ArrayList();
            String a = C2632a.m5993a("/webapi/emoji/emojiPackage/get", hashMap);
            C1709a.m3011a("emojiPackage/get", a);
            JSONObject a2 = C1810b.m3420a(a);
            if (C1810b.m3427b(a2, "code") == 200) {
                JSONArray g = C1810b.m3434g(a2, "result");
                if (g != null) {
                    for (int i = 0; i < g.length(); i++) {
                        JSONObject b = C1810b.m3429b(g, i);
                        C2469e eVar = new C2469e();
                        C2547b.m5680a(eVar, b);
                        arrayList.add(eVar);
                    }
                    requestCallback.onSuccess(arrayList);
                    return;
                }
                return;
            }
            requestCallback.onFailed(C1810b.m3427b(a2, "code"));
        } catch (C2633b e) {
            requestCallback.onException(e);
            sb = new StringBuilder("is error code:");
            sb.append(e.mo36245a());
            C1709a.m3016c("emojiPackage/get", sb.toString());
        } catch (Exception e2) {
            requestCallback.onException(e2);
            sb = new StringBuilder("is exception");
            sb.append(e2);
            C1709a.m3016c("emojiPackage/get", sb.toString());
        }
    }

    /* renamed from: b */
    public static JSONObject m6004b() {
        HashMap hashMap = new HashMap();
        hashMap.put("appKey", C2452d.m5371d());
        try {
            return C1810b.m3420a(C2632a.m5993a("/webapi/user/da/config", hashMap));
        } catch (C2633b e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static List<C2468d> m6005c() {
        ArrayList arrayList = new ArrayList();
        int a = C2187d.m4514a();
        int i = 0;
        if (System.currentTimeMillis() - C2437b.m5306u() > 86400000 || a == 1) {
            C1709a.m3014b(C7383o0OOO0O.OooOOO0, "requestEmojiMapInterface");
            HashMap hashMap = new HashMap();
            hashMap.put("appKey", C2452d.m5371d());
            try {
                String a2 = C2632a.m5993a("/webapi/emoji/emojiPackage/map", hashMap);
                C1709a.m3011a("/webapi/emoji/emojiPackage/map", a2);
                JSONObject a3 = C1810b.m3420a(a2);
                if (C1810b.m3427b(a3, "code") != 200) {
                    return null;
                }
                JSONArray g = C1810b.m3434g(a3, "result");
                if (g == null) {
                    return arrayList;
                }
                while (i < g.length()) {
                    JSONObject b = C1810b.m3429b(g, i);
                    C2468d dVar = new C2468d();
                    C2547b.m5680a(dVar, b);
                    arrayList.add(dVar);
                    i++;
                }
                C2437b.m5302s(a2);
                C2437b.m5262c(System.currentTimeMillis());
                return arrayList;
            } catch (C2633b e) {
                C1709a.m3016c("/webapi/emoji/emojiPackage/map", "is error code:" + e.mo36245a());
                return null;
            } catch (Exception e2) {
                C1709a.m3015b("/webapi/emoji/emojiPackage/map", "is exception", e2);
                return null;
            }
        } else {
            JSONArray g2 = C1810b.m3434g(C1810b.m3420a(C2437b.m5308v()), "result");
            if (g2 == null) {
                return arrayList;
            }
            while (i < g2.length()) {
                try {
                    JSONObject b2 = C1810b.m3429b(g2, i);
                    C2468d dVar2 = new C2468d();
                    C2547b.m5680a(dVar2, b2);
                    arrayList.add(dVar2);
                    i++;
                } catch (NullPointerException e3) {
                    C1709a.m3015b("emojiPackage/map", "is exception for read in sp", e3);
                    return arrayList;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: d */
    public static C2466b m6006d() {
        C2466b bVar = new C2466b();
        int a = C2187d.m4514a();
        if (System.currentTimeMillis() - C2437b.m5309w() > 86400000 || a == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("appKey", C2452d.m5371d());
            hashMap.put("fromType", "Android");
            try {
                String b = C2632a.m5995b("/webapi/sdk/setting", hashMap);
                C1709a.m3011a("/webapi/sdk/setting", b);
                JSONObject a2 = C1810b.m3420a(b);
                int b2 = C1810b.m3427b(a2, "code");
                if (b2 == 200) {
                    JSONObject f = C1810b.m3433f(a2, "result");
                    C1709a.m3014b(C7383o0OOO0O.OooOOO0, "CompanySettingResponse response" + b);
                    C2547b.m5680a(bVar, f);
                    C2437b.m5305t(b);
                    C2437b.m5268d(System.currentTimeMillis());
                    return bVar;
                }
                C1709a.m3016c("getModelResponseList is error", "errorcode:" + b2 + b);
                return null;
            } catch (C2633b e) {
                C1709a.m3015b("getModelResponseList", "is exception", e);
                return null;
            }
        } else {
            JSONObject a3 = C1810b.m3420a(C2437b.m5310x());
            C1709a.m3014b(C7383o0OOO0O.OooOOO0, "hahahahah" + C2437b.m5310x());
            C2547b.m5680a(bVar, C1810b.m3433f(a3, "result"));
            return bVar;
        }
    }
}
