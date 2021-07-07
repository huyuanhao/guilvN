package com.taobao.agoo.p265a;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.client.C3104b;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.a */
public class C3197a {
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a */
    public ConcurrentMap<String, Integer> f7263a = new ConcurrentHashMap();

    /* renamed from: b */
    public String f7264b;

    /* renamed from: c */
    public long f7265c;

    /* renamed from: d */
    public Context f7266d;

    public C3197a(Context context) {
        if (context != null) {
            this.f7266d = context.getApplicationContext();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    /* renamed from: a */
    public void mo37817a(String str) {
        Integer num = this.f7263a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f7263a.put(str, 2);
            C3104b.m7301a(this.f7266d, "AGOO_BIND", this.f7265c, this.f7263a);
        }
    }

    /* renamed from: b */
    public boolean mo37818b(String str) {
        if (this.f7263a.isEmpty()) {
            m7723b();
        }
        Integer num = this.f7263a.get(str);
        ALog.m7600i("AgooBindCache", "isAgooRegistered", Constants.KEY_PACKAGE_NAME, str, "appStatus", num, "agooBindStatus", this.f7263a);
        if (!UtilityImpl.m7618a("Agoo_AppStore", this.f7266d) && num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo37819c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7264b = str;
        }
    }

    /* renamed from: d */
    public boolean mo37820d(String str) {
        String str2 = this.f7264b;
        return str2 != null && str2.equals(str);
    }

    /* renamed from: a */
    public void mo37816a() {
        this.f7264b = null;
    }

    /* renamed from: b */
    private void m7723b() {
        try {
            String string = this.f7266d.getSharedPreferences("AGOO_BIND", 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.m7603w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f7265c = jSONArray.getLong(0);
            if (System.currentTimeMillis() < this.f7265c + 86400000) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    this.f7263a.put(jSONObject.getString(C3617o.f9365as), Integer.valueOf(jSONObject.getInt(C3617o.f9366at)));
                }
                ALog.m7600i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f7263a);
                return;
            }
            ALog.m7600i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(this.f7265c));
            this.f7265c = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
