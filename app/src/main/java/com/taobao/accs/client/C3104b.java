package com.taobao.accs.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.client.b */
public class C3104b {

    /* renamed from: a */
    public Context f6882a;

    /* renamed from: b */
    public ConcurrentMap<String, Integer> f6883b = new ConcurrentHashMap();

    /* renamed from: c */
    public ConcurrentMap<String, Set<String>> f6884c = new ConcurrentHashMap();

    /* renamed from: d */
    public long f6885d;

    /* renamed from: e */
    public String f6886e = "ClientManager_";

    /* renamed from: f */
    public String f6887f = "ACCS_BIND";

    public C3104b(Context context, String str) {
        if (context != null) {
            this.f6886e += str;
            this.f6882a = context.getApplicationContext();
            this.f6887f = "ACCS_BIND" + str;
            m7300a();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    /* renamed from: a */
    public void mo37527a(String str) {
        Integer num = this.f6883b.get(str);
        if (num == null || num.intValue() != 2) {
            this.f6883b.put(str, 2);
            m7301a(this.f6882a, this.f6887f, this.f6885d, this.f6883b);
        }
    }

    /* renamed from: b */
    public void mo37529b(String str) {
        Integer num = this.f6883b.get(str);
        if (num == null || num.intValue() != 4) {
            this.f6883b.put(str, 4);
            m7301a(this.f6882a, this.f6887f, this.f6885d, this.f6883b);
        }
    }

    /* renamed from: c */
    public boolean mo37531c(String str) {
        if (this.f6883b.isEmpty()) {
            m7300a();
        }
        Integer num = this.f6883b.get(str);
        ALog.m7600i(this.f6886e, "isAppBinded", "appStatus", num, "mBindStatus", this.f6883b);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo37532d(String str) {
        Integer num = this.f6883b.get(str);
        return num != null && num.intValue() == 4;
    }

    /* renamed from: e */
    public void mo37533e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f6884c.remove(str);
            }
        } catch (Exception e) {
            String str2 = this.f6886e;
            ALog.m7599e(str2, this.f6886e + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo37528a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                Set<String> set = this.f6884c.get(str);
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(str2);
                this.f6884c.put(str, set);
            }
        } catch (Exception e) {
            String str3 = this.f6886e;
            ALog.m7599e(str3, this.f6886e + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean mo37530b(String str, String str2) {
        Set<String> set;
        try {
            if (!TextUtils.isEmpty(str) && (set = this.f6884c.get(str)) != null && set.contains(str2)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            String str3 = this.f6886e;
            ALog.m7599e(str3, this.f6886e + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m7300a() {
        try {
            String string = this.f6882a.getSharedPreferences(this.f6887f, 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.m7603w(this.f6886e, "restoreClients break as packages null", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f6885d = jSONArray.getLong(0);
            if (System.currentTimeMillis() < this.f6885d + 86400000) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    this.f6883b.put(jSONObject.getString(C3617o.f9365as), Integer.valueOf(jSONObject.getInt(C3617o.f9366at)));
                }
                ALog.m7600i(this.f6886e, "restoreClients success", "mBindStatus", this.f6883b);
                return;
            }
            ALog.m7600i(this.f6886e, "restoreClients expired", "lastFlushTime", Long.valueOf(this.f6885d));
            this.f6885d = 0;
        } catch (Exception e) {
            ALog.m7602w(this.f6886e, "restoreClients", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m7301a(Context context, String str, long j, Map<String, Integer> map) {
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j <= 0 || j >= System.currentTimeMillis()) {
                double currentTimeMillis = (double) System.currentTimeMillis();
                double random = Math.random() * 8.64E7d;
                Double.isNaN(currentTimeMillis);
                jSONArray.put(currentTimeMillis - random);
            } else {
                jSONArray.put(j);
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3617o.f9365as, str2);
                jSONObject.put(C3617o.f9366at, map.get(str2).intValue());
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString("bind_status", jSONArray.toString());
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
