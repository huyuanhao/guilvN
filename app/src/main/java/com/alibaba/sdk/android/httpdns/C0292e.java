package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.net64.C0308a;
import com.alibaba.sdk.android.httpdns.p014b.C0260b;
import com.alibaba.sdk.android.httpdns.p014b.C0261c;
import com.alibaba.sdk.android.httpdns.p014b.C0263e;
import com.alibaba.sdk.android.httpdns.p014b.C0265g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.e */
public class C0292e {

    /* renamed from: a */
    public String[] f636a;

    /* renamed from: b */
    public long f637b;

    /* renamed from: c */
    public long f638c;
    public String hostName;

    public C0292e(C0263e eVar) {
        this.hostName = eVar.f581h;
        this.f638c = C0261c.m445a(eVar.f584j);
        this.f637b = -1000;
        ArrayList<C0265g> arrayList = eVar.f579a;
        if (arrayList != null && arrayList.size() > 0) {
            int size = eVar.f579a.size();
            this.f636a = new String[size];
            for (int i = 0; i < size; i++) {
                this.f636a[i] = eVar.f579a.get(i).f587k;
            }
        }
        if (C0308a.mo4034a().m551a()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<C0265g> arrayList3 = eVar.f580b;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i2 = 0; i2 < eVar.f580b.size(); i2++) {
                    arrayList2.add(eVar.f580b.get(i2).f587k);
                }
            }
            C0308a.mo4034a().mo4033a(this.hostName, arrayList2);
        }
    }

    public C0292e(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject(str);
        this.hostName = jSONObject.getString("host");
        try {
            if (jSONObject.has("ips")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("ips");
                int length = jSONArray2.length();
                this.f636a = new String[length];
                for (int i = 0; i < length; i++) {
                    this.f636a[i] = jSONArray2.getString(i);
                }
            }
            if (C0308a.mo4034a().m551a() && jSONObject.has("ipsv6") && (jSONArray = jSONObject.getJSONArray("ipsv6")) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(jSONArray.getString(i2));
                }
                C0308a.mo4034a().mo4033a(this.hostName, arrayList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f637b = jSONObject.getLong("ttl");
        this.f638c = System.currentTimeMillis() / 1000;
    }

    public C0292e(String str, String[] strArr, long j, long j2) {
        this.hostName = str;
        this.f636a = strArr;
        this.f637b = j;
        this.f638c = j2;
    }

    /* renamed from: a */
    public long mo4013a() {
        return this.f637b;
    }

    /* renamed from: a */
    public C0263e m519a() {
        List<String> a;
        C0263e eVar = new C0263e();
        eVar.f581h = this.hostName;
        eVar.f584j = String.valueOf(this.f638c);
        eVar.f582i = C0260b.m444g();
        String[] strArr = this.f636a;
        if (strArr != null && strArr.length > 0) {
            eVar.f579a = new ArrayList<>();
            String[] strArr2 = this.f636a;
            for (String str : strArr2) {
                C0265g gVar = new C0265g();
                gVar.f587k = str;
                gVar.f588l = String.valueOf(this.f637b);
                eVar.f579a.add(gVar);
            }
        }
        if (C0308a.mo4034a().m551a() && (a = C0308a.mo4034a().mo4032a(this.hostName)) != null && a.size() > 0) {
            eVar.f580b = new ArrayList<>();
            for (String str2 : a) {
                C0265g gVar2 = new C0265g();
                gVar2.f587k = str2;
                gVar2.f588l = String.valueOf(this.f637b);
                eVar.f580b.add(gVar2);
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public String[] m520a() {
        return this.f636a;
    }

    /* renamed from: b */
    public long mo4014b() {
        return this.f638c;
    }

    /* renamed from: b */
    public boolean m522b() {
        return mo4014b() + mo4013a() < System.currentTimeMillis() / 1000 || mo4015c();
    }

    /* renamed from: c */
    public boolean mo4015c() {
        return mo4013a() == -1000;
    }

    public String toString() {
        String str = "host: " + this.hostName + " ip cnt: " + this.f636a.length + " ttl: " + this.f637b;
        for (int i = 0; i < this.f636a.length; i++) {
            str = str + "\n ip: " + this.f636a[i];
        }
        return str;
    }
}
