package com.p118pd.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.pd.sdk.oo00oooO  reason: case insensitive filesystem */
public final class C8582oo00oooO {
    public static C8582oo00oooO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f21697OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f21698OooO00o = {"ABTesting", "_default_config_tag"};
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21699OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8485oo0 f21700OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ConcurrentHashMap<String, C8588oo0O0000> f21701OooO00o = new ConcurrentHashMap<>();

    public static C8582oo00oooO OooO00o() {
        if (OooO00o == null) {
            OooO0O0();
        }
        return OooO00o;
    }

    public static synchronized void OooO0O0() {
        synchronized (C8582oo00oooO.class) {
            if (OooO00o == null) {
                OooO00o = new C8582oo00oooO();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20226OooO00o() {
        return this.f21701OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8485oo0 m20227OooO00o() {
        return this.f21700OooO00o;
    }

    public C8588oo0O0000 OooO00o(String str) {
        String str2;
        if (str == null) {
            str2 = "getInstanceByTag() tag Can't be null";
        } else if (this.f21701OooO00o.containsKey(str)) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "getInstanceByTag(): TAG: " + str + " found.");
            return this.f21701OooO00o.get(str);
        } else {
            str2 = "getInstanceByTag(): TAG: " + str + " not found.";
        }
        AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str2);
        return null;
    }

    public C8588oo0O0000 OooO00o(String str, C8588oo0O0000 oo0o0000) {
        C8588oo0O0000 putIfAbsent = this.f21701OooO00o.putIfAbsent(str, oo0o0000);
        C8480oOooooO0.OooO00o().OooO00o(str, this.f21701OooO00o.get(str).OooO00o);
        return putIfAbsent;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<String> m20228OooO00o() {
        return new ArrayList(this.f21701OooO00o.keySet());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20229OooO00o() {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "clearCachedData() is execute.");
        if (this.f21699OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "clearCachedData() sdk is not init");
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.clearCachedData() is execute.");
        AbstractC8521oo00O00.OooO00o("", true, this.f21699OooO00o);
    }

    public void OooO00o(int i) {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.setSPCacheSize is execute.");
        if (this.f21699OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "sdk is not init");
        } else {
            AbstractC8478oOoooo.OooO00o(C8591oo0O00O.OooO00o(i, 10, 5));
        }
    }

    public void OooO00o(Context context) {
        synchronized (f21697OooO00o) {
            if (this.f21699OooO00o != null) {
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "SDK has been initialized,But an instance can be registered!");
                return;
            }
            this.f21699OooO00o = context;
            C8480oOooooO0.OooO00o().m20150OooO00o().OooO0oO(context.getPackageName());
            C8476oOoooO0o.OooO00o().OooO00o(context);
        }
    }

    public void OooO00o(Context context, C8580oo00ooOo oo00oooo) {
        if (oo00oooo == null || context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "enableLogCollection(): config or context is null, Log disabled.");
            C8480oOooooO0.OooO00o().m20154OooO00o();
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.enableLogCollection() is execute.");
        if (C8480oOooooO0.OooO00o().m20155OooO00o()) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "enableLogCollection(): LogConfig already exists.");
            return;
        }
        C8480oOooooO0.OooO00o().OooO00o(oo00oooo.OooO00o());
        C8553oo00Ooo.OooO00o().OooO00o(context);
    }

    public void OooO00o(C8580oo00ooOo oo00oooo, boolean z) {
        if (oo00oooo == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "refreshLogConfig(): config is null, Log disabled.");
            C8480oOooooO0.OooO00o().m20154OooO00o();
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.refreshLogConfig() is execute.");
        synchronized (OooO0O0) {
            C8480oOooooO0.OooO00o().OooO00o(oo00oooo.OooO00o());
            C8553oo00Ooo.OooO00o().OooO00o(z);
        }
    }

    public void OooO00o(C8485oo0 oo0) {
        this.f21700OooO00o = oo0;
        C8480oOooooO0.OooO00o().OooO00o("_instance_ex_tag", ((C8588oo0O0000) oo0).OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20230OooO00o(String str) {
        if (this.f21699OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "clearDataByTag() sdk is not init");
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.clearDataByTag(String appid) is execute.");
        AbstractC8521oo00O00.OooO00o(str, this.f21699OooO00o);
    }

    public void OooO00o(boolean z) {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.setHandlerAbnormalData is execute.");
        AbstractC8478oOoooo.OooO00o(z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20231OooO00o(String str) {
        if (str == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "getInitFlag() tag Can't be null");
            return false;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.getInitFlag(String tag) is execute.");
        return "_instance_ex_tag".equals(str) ? this.f21700OooO00o != null : this.f21701OooO00o.containsKey(str);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m20232OooO0O0() {
        int i = 0;
        for (String str : f21698OooO00o) {
            if (this.f21701OooO00o.containsKey(str)) {
                i++;
            }
        }
        return i;
    }

    public void OooO0O0(String str) {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f21699OooO00o;
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "sdk is not init");
        } else {
            AbstractC8478oOoooo.OooO00o(C8591oo0O00O.OooO00o(AbstractC8411oOoo0Oo0.OooOo00, str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m20233OooO0O0(String str) {
        for (String str2 : f21698OooO00o) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
