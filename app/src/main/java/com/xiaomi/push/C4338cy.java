package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cy */
public class C4338cy {

    /* renamed from: a */
    public String f11557a;

    /* renamed from: a */
    public final ArrayList<C4337cx> f11558a = new ArrayList<>();

    public C4338cy() {
    }

    public C4338cy(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11557a = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* renamed from: a */
    public synchronized C4337cx mo41631a() {
        for (int size = this.f11558a.size() - 1; size >= 0; size--) {
            C4337cx cxVar = this.f11558a.get(size);
            if (cxVar.m12001a()) {
                C4342db.mo41642a().m12041a(cxVar.mo41613a());
                return cxVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized C4338cy mo41632a(JSONObject jSONObject) {
        this.f11557a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f11558a.add(new C4337cx(this.f11557a).mo41612a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public String m12010a() {
        return this.f11557a;
    }

    /* renamed from: a */
    public ArrayList<C4337cx> m12011a() {
        return this.f11558a;
    }

    /* renamed from: a */
    public synchronized JSONObject m12012a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f11557a);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4337cx> it = this.f11558a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m11991a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public synchronized void mo41633a(C4337cx cxVar) {
        int i = 0;
        while (true) {
            if (i >= this.f11558a.size()) {
                break;
            } else if (this.f11558a.get(i).mo41624a(cxVar)) {
                this.f11558a.set(i, cxVar);
                break;
            } else {
                i++;
            }
        }
        if (i >= this.f11558a.size()) {
            this.f11558a.add(cxVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo41634a(boolean z) {
        ArrayList<C4337cx> arrayList;
        for (int size = this.f11558a.size() - 1; size >= 0; size--) {
            C4337cx cxVar = this.f11558a.get(size);
            if (z) {
                if (cxVar.mo41629c()) {
                    arrayList = this.f11558a;
                }
            } else if (!cxVar.mo41628b()) {
                arrayList = this.f11558a;
            }
            arrayList.remove(size);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11557a);
        sb.append("\n");
        Iterator<C4337cx> it = this.f11558a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
