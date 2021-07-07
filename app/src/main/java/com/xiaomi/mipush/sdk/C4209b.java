package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4506i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mipush.sdk.b */
public class C4209b {

    /* renamed from: a */
    public static volatile C4209b f11265a;

    /* renamed from: a */
    public Context f11266a;

    /* renamed from: a */
    public C4210a f11267a;

    /* renamed from: a */
    public String f11268a;

    /* renamed from: a */
    public Map<String, C4210a> f11269a;

    /* renamed from: com.xiaomi.mipush.sdk.b$a */
    public static class C4210a {

        /* renamed from: a */
        public int f11270a = 1;

        /* renamed from: a */
        public Context f11271a;

        /* renamed from: a */
        public String f11272a;

        /* renamed from: a */
        public boolean f11273a = true;

        /* renamed from: b */
        public String f11274b;

        /* renamed from: b */
        public boolean f11275b = false;

        /* renamed from: c */
        public String f11276c;

        /* renamed from: d */
        public String f11277d;

        /* renamed from: e */
        public String f11278e;

        /* renamed from: f */
        public String f11279f;

        /* renamed from: g */
        public String f11280g;

        /* renamed from: h */
        public String f11281h;

        public C4210a(Context context) {
            this.f11271a = context;
        }

        /* renamed from: a */
        public static C4210a m11517a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C4210a aVar = new C4210a(context);
                aVar.f11272a = jSONObject.getString("appId");
                aVar.f11274b = jSONObject.getString("appToken");
                aVar.f11276c = jSONObject.getString("regId");
                aVar.f11277d = jSONObject.getString("regSec");
                aVar.f11279f = jSONObject.getString("devId");
                aVar.f11278e = jSONObject.getString("vName");
                aVar.f11273a = jSONObject.getBoolean("valid");
                aVar.f11275b = jSONObject.getBoolean("paused");
                aVar.f11270a = jSONObject.getInt("envType");
                aVar.f11280g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                AbstractC4163b.m11303a(th);
                return null;
            }
        }

        /* renamed from: a */
        private String mo41435a() {
            Context context = this.f11271a;
            return C4442g.m12699a(context, context.getPackageName());
        }

        /* renamed from: a */
        public static String m11519a(C4210a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f11272a);
                jSONObject.put("appToken", aVar.f11274b);
                jSONObject.put("regId", aVar.f11276c);
                jSONObject.put("regSec", aVar.f11277d);
                jSONObject.put("devId", aVar.f11279f);
                jSONObject.put("vName", aVar.f11278e);
                jSONObject.put("valid", aVar.f11273a);
                jSONObject.put("paused", aVar.f11275b);
                jSONObject.put("envType", aVar.f11270a);
                jSONObject.put("regResource", aVar.f11280g);
                return jSONObject.toString();
            } catch (Throwable th) {
                AbstractC4163b.m11303a(th);
                return null;
            }
        }

        /* renamed from: a */
        public void m11520a() {
            C4209b.m11490a(this.f11271a).edit().clear().commit();
            this.f11272a = null;
            this.f11274b = null;
            this.f11276c = null;
            this.f11277d = null;
            this.f11279f = null;
            this.f11278e = null;
            this.f11273a = false;
            this.f11275b = false;
            this.f11281h = null;
            this.f11270a = 1;
        }

        /* renamed from: a */
        public void mo41436a(int i) {
            this.f11270a = i;
        }

        /* renamed from: a */
        public void mo41437a(String str, String str2) {
            this.f11276c = str;
            this.f11277d = str2;
            this.f11279f = C4506i.m13054l(this.f11271a);
            this.f11278e = mo41435a();
            this.f11273a = true;
        }

        /* renamed from: a */
        public void mo41438a(String str, String str2, String str3) {
            this.f11272a = str;
            this.f11274b = str2;
            this.f11280g = str3;
            SharedPreferences.Editor edit = C4209b.m11490a(this.f11271a).edit();
            edit.putString("appId", this.f11272a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        /* renamed from: a */
        public void mo41439a(boolean z) {
            this.f11275b = z;
        }

        /* renamed from: a */
        public boolean m11525a() {
            return m11526a(this.f11272a, this.f11274b);
        }

        /* renamed from: a */
        public boolean m11526a(String str, String str2) {
            return TextUtils.equals(this.f11272a, str) && TextUtils.equals(this.f11274b, str2) && !TextUtils.isEmpty(this.f11276c) && !TextUtils.isEmpty(this.f11277d) && (TextUtils.equals(this.f11279f, C4506i.m13054l(this.f11271a)) || TextUtils.equals(this.f11279f, C4506i.m13053k(this.f11271a)));
        }

        /* renamed from: b */
        public void mo41440b() {
            this.f11273a = false;
            C4209b.m11490a(this.f11271a).edit().putBoolean("valid", this.f11273a).commit();
        }

        /* renamed from: b */
        public void mo41441b(String str, String str2, String str3) {
            this.f11276c = str;
            this.f11277d = str2;
            this.f11279f = C4506i.m13054l(this.f11271a);
            this.f11278e = mo41435a();
            this.f11273a = true;
            this.f11281h = str3;
            SharedPreferences.Editor edit = C4209b.m11490a(this.f11271a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("devId", this.f11279f);
            edit.putString("vName", mo41435a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        /* renamed from: c */
        public void mo41442c(String str, String str2, String str3) {
            this.f11272a = str;
            this.f11274b = str2;
            this.f11280g = str3;
        }
    }

    public C4209b(Context context) {
        this.f11266a = context;
        mo41431c();
    }

    /* renamed from: a */
    public static SharedPreferences m11490a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* renamed from: a */
    public static C4209b m11491a(Context context) {
        if (f11265a == null) {
            synchronized (C4209b.class) {
                if (f11265a == null) {
                    f11265a = new C4209b(context);
                }
            }
        }
        return f11265a;
    }

    /* renamed from: c */
    private void mo41431c() {
        this.f11267a = new C4210a(this.f11266a);
        this.f11269a = new HashMap();
        SharedPreferences a = m11490a(this.f11266a);
        this.f11267a.f11272a = a.getString("appId", null);
        this.f11267a.f11274b = a.getString("appToken", null);
        this.f11267a.f11276c = a.getString("regId", null);
        this.f11267a.f11277d = a.getString("regSec", null);
        this.f11267a.f11279f = a.getString("devId", null);
        if (!TextUtils.isEmpty(this.f11267a.f11279f) && C4506i.m13037a(this.f11267a.f11279f)) {
            this.f11267a.f11279f = C4506i.m13054l(this.f11266a);
            a.edit().putString("devId", this.f11267a.f11279f).commit();
        }
        this.f11267a.f11278e = a.getString("vName", null);
        this.f11267a.f11273a = a.getBoolean("valid", true);
        this.f11267a.f11275b = a.getBoolean("paused", false);
        this.f11267a.f11270a = a.getInt("envType", 1);
        this.f11267a.f11280g = a.getString("regResource", null);
        this.f11267a.f11281h = a.getString("appRegion", null);
    }

    /* renamed from: a */
    public int mo41421a() {
        return this.f11267a.f11270a;
    }

    /* renamed from: a */
    public C4210a mo41422a(String str) {
        if (this.f11269a.containsKey(str)) {
            return this.f11269a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a = m11490a(this.f11266a);
        if (!a.contains(str2)) {
            return null;
        }
        C4210a a2 = C4210a.m11517a(this.f11266a, a.getString(str2, ""));
        this.f11269a.put(str2, a2);
        return a2;
    }

    /* renamed from: a */
    public String m11495a() {
        return this.f11267a.f11272a;
    }

    /* renamed from: a */
    public void m11496a() {
        this.f11267a.m11520a();
    }

    /* renamed from: a */
    public void mo41423a(int i) {
        this.f11267a.mo41436a(i);
        m11490a(this.f11266a).edit().putInt("envType", i).commit();
    }

    /* renamed from: a */
    public void m11498a(String str) {
        SharedPreferences.Editor edit = m11490a(this.f11266a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f11267a.f11278e = str;
    }

    /* renamed from: a */
    public void mo41424a(String str, C4210a aVar) {
        this.f11269a.put(str, aVar);
        String a = C4210a.m11519a(aVar);
        m11490a(this.f11266a).edit().putString("hybrid_app_info_" + str, a).commit();
    }

    /* renamed from: a */
    public void mo41425a(String str, String str2, String str3) {
        this.f11267a.mo41438a(str, str2, str3);
    }

    /* renamed from: a */
    public void mo41426a(boolean z) {
        this.f11267a.mo41439a(z);
        m11490a(this.f11266a).edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a */
    public boolean m11502a() {
        Context context = this.f11266a;
        return !TextUtils.equals(C4442g.m12699a(context, context.getPackageName()), this.f11267a.f11278e);
    }

    /* renamed from: a */
    public boolean mo41427a(String str, String str2) {
        return this.f11267a.m11526a(str, str2);
    }

    /* renamed from: a */
    public boolean m11504a(String str, String str2, String str3) {
        C4210a a = mo41422a(str3);
        return a != null && TextUtils.equals(str, a.f11272a) && TextUtils.equals(str2, a.f11274b);
    }

    /* renamed from: b */
    public String mo41428b() {
        return this.f11267a.f11274b;
    }

    /* renamed from: b */
    public void m11506b() {
        this.f11267a.mo41440b();
    }

    /* renamed from: b */
    public void mo41429b(String str) {
        this.f11269a.remove(str);
        m11490a(this.f11266a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* renamed from: b */
    public void mo41430b(String str, String str2, String str3) {
        this.f11267a.mo41441b(str, str2, str3);
    }

    /* renamed from: b */
    public boolean m11509b() {
        if (this.f11267a.m11525a()) {
            return true;
        }
        AbstractC4163b.m11301a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: c */
    public String m11510c() {
        return this.f11267a.f11276c;
    }

    /* renamed from: c */
    public boolean m11511c() {
        return this.f11267a.m11525a();
    }

    /* renamed from: d */
    public String mo41432d() {
        return this.f11267a.f11277d;
    }

    /* renamed from: d */
    public boolean m11513d() {
        return this.f11267a.f11275b;
    }

    /* renamed from: e */
    public String mo41433e() {
        return this.f11267a.f11280g;
    }

    /* renamed from: e */
    public boolean m11515e() {
        return !this.f11267a.f11273a;
    }

    /* renamed from: f */
    public String mo41434f() {
        return this.f11267a.f11281h;
    }
}
