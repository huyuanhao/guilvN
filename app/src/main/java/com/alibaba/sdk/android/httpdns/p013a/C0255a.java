package com.alibaba.sdk.android.httpdns.p013a;

import android.content.Context;
import com.alibaba.sdk.android.beacon.Beacon;
import com.alibaba.sdk.android.httpdns.C0258b;
import com.alibaba.sdk.android.httpdns.C0299i;
import com.alibaba.sdk.android.httpdns.p016d.C0276b;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.a.a */
public class C0255a {

    /* renamed from: a */
    public static volatile C0255a f562a;

    /* renamed from: a */
    public final Beacon.OnServiceErrListener f563a = new Beacon.OnServiceErrListener() {
        /* class com.alibaba.sdk.android.httpdns.p013a.C0255a.C02572 */

        @Override // com.alibaba.sdk.android.beacon.Beacon.OnServiceErrListener
        public void onErr(Beacon.Error error) {
            String str = "beacon error. errorCode:" + error.errCode + ", errorMsg:" + error.errMsg;
        }
    };

    /* renamed from: a */
    public final Beacon.OnUpdateListener f564a = new Beacon.OnUpdateListener() {
        /* class com.alibaba.sdk.android.httpdns.p013a.C0255a.C02561 */

        @Override // com.alibaba.sdk.android.beacon.Beacon.OnUpdateListener
        public void onUpdate(List<Beacon.Config> list) {
            try {
                C0255a.this.m422b(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public Beacon f565a = null;

    /* renamed from: a */
    public C0276b f566a = null;

    /* renamed from: i */
    public boolean f567i = true;
    public Context mContext = null;

    /* renamed from: a */
    public static C0255a m419a() {
        if (f562a == null) {
            synchronized (C0255a.class) {
                if (f562a == null) {
                    f562a = new C0255a();
                }
            }
        }
        return f562a;
    }

    /* renamed from: a */
    private boolean m421a(Beacon.Config config) {
        if (config == null || !config.key.equalsIgnoreCase("___httpdns_service___")) {
            return false;
        }
        String str = config.value;
        if (str != null) {
            String str2 = "httpdns configs:" + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ut")) {
                    m423d(jSONObject.getString("ut"));
                }
                if (jSONObject.has("ip-ranking")) {
                    m424i(jSONObject.getString("ip-ranking"));
                }
                if (jSONObject.has("status")) {
                    m425j(jSONObject.getString("status"));
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m422b(List<Beacon.Config> list) {
        if (!(list == null || list.size() == 0)) {
            for (Beacon.Config config : list) {
                if (config.key.equalsIgnoreCase("___httpdns_service___")) {
                    m421a(config);
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m423d(String str) {
        if (str == null || this.f566a == null) {
            return false;
        }
        String str2 = "is report enabled:" + str;
        if (str.equalsIgnoreCase("disabled")) {
            this.f566a.mo3995e(false);
        } else {
            this.f566a.mo3995e(true);
        }
        return true;
    }

    /* renamed from: i */
    private void m424i(String str) {
        if (str != null) {
            String str2 = "is IP probe enabled:" + str;
            this.f567i = !str.equalsIgnoreCase("disabled");
        }
    }

    /* renamed from: j */
    private void m425j(String str) {
        if (str != null) {
            C0258b.m430a(!"disabled".equals(str));
            C0299i.m535e("[beacon] httpdns enable: " + C0258b.m431a());
        }
    }

    /* renamed from: a */
    public void mo3954a(Context context, String str) {
        this.mContext = context;
        if (context != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sdkId", "httpdns");
            hashMap.put("accountId", str);
            Beacon build = new Beacon.Builder().appKey("24657847").appSecret("f30fc0937f2b1e9e50a1b7134f1ddb10").loopInterval(7200000).extras(hashMap).build();
            this.f565a = build;
            build.addUpdateListener(this.f564a);
            this.f565a.addServiceErrListener(this.f563a);
            this.f565a.start(this.mContext.getApplicationContext());
        }
    }

    /* renamed from: a */
    public void mo3955a(C0276b bVar) {
        this.f566a = bVar;
    }

    /* renamed from: f */
    public boolean mo3956f() {
        return this.f567i;
    }
}
