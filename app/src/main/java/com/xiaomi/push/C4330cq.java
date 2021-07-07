package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cq */
public class C4330cq implements AbstractC4335cv {

    /* renamed from: a */
    public static C4330cq f11523a;

    /* renamed from: a */
    public int f11524a;

    /* renamed from: a */
    public Context f11525a;

    /* renamed from: a */
    public C4329cp f11526a;

    /* renamed from: a */
    public String f11527a;

    /* renamed from: a */
    public HashMap<String, C4328co> f11528a;

    /* renamed from: b */
    public int f11529b;

    /* renamed from: b */
    public String f11530b;

    /* renamed from: c */
    public int f11531c;

    /* renamed from: c */
    public String f11532c;

    /* renamed from: d */
    public int f11533d;

    /* renamed from: a */
    public static synchronized C4330cq m11962a() {
        C4330cq cqVar;
        synchronized (C4330cq.class) {
            cqVar = f11523a;
        }
        return cqVar;
    }

    /* renamed from: a */
    private String m11963a(ArrayList<C4327cn> arrayList, String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f11527a)) {
            jSONObject.put("imei", C4333ct.m11976a(this.f11527a));
        }
        jSONObject.put("actionType", str);
        jSONObject.put("actionTime", System.currentTimeMillis());
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            JSONObject jSONObject2 = null;
            if (TextUtils.isEmpty(arrayList.get(i).f11517a)) {
                jSONObject2 = new JSONObject();
            } else {
                try {
                    jSONObject2 = new JSONObject(arrayList.get(i).f11517a);
                } catch (Exception unused) {
                }
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("adId", arrayList.get(i).f11516a);
            arrayList2.add(jSONObject2);
        }
        jSONObject.put("adList", new JSONArray((Collection) arrayList2));
        return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
    }

    /* renamed from: a */
    private void m11964a(C4328co coVar) {
        if (!this.f11528a.containsKey(coVar.f11520b)) {
            this.f11529b++;
            C4333ct.m11978a("send: " + this.f11529b);
            AsyncTaskC4331cr crVar = new AsyncTaskC4331cr(this, this.f11530b, this.f11532c, coVar);
            this.f11528a.put(coVar.f11520b, coVar);
            crVar.execute(new String[0]);
        }
    }

    /* renamed from: a */
    private void m11965a(ArrayList<C4327cn> arrayList, String str, int i) {
        try {
            String a = m11963a(arrayList, str);
            String a2 = C4333ct.m11976a(a);
            if (m11966a(new C4328co(i, a, a2))) {
                m11964a(new C4328co(i, a, a2));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private boolean m11966a(C4328co coVar) {
        if (C4332cs.m11975a(this.f11525a)) {
            return true;
        }
        m11967b(coVar);
        return false;
    }

    /* renamed from: b */
    private void m11967b(C4328co coVar) {
        this.f11533d++;
        C4333ct.m11978a("cacheCount: " + this.f11533d);
        this.f11526a.mo41598a(coVar);
        this.f11526a.mo41597a();
    }

    /* renamed from: a */
    public void mo41599a(C4327cn cnVar) {
        if (cnVar.f11516a > 0) {
            ArrayList<C4327cn> arrayList = new ArrayList<>();
            arrayList.add(cnVar);
            m11965a(arrayList, "click", cnVar.f11515a);
        }
    }

    @Override // com.xiaomi.push.AbstractC4335cv
    /* renamed from: a */
    public void mo41600a(Integer num, C4328co coVar) {
        if (this.f11528a.containsKey(coVar.f11520b)) {
            if (num.intValue() != 0) {
                this.f11531c++;
                C4333ct.m11978a("faild: " + this.f11531c + " " + coVar.f11520b + GlideException.OooO00o.o0ooOoO + this.f11528a.size());
                m11967b(coVar);
            } else {
                this.f11524a++;
                C4333ct.m11978a("success: " + this.f11524a);
            }
            this.f11528a.remove(coVar.f11520b);
        }
    }

    /* renamed from: b */
    public void mo41601b(C4327cn cnVar) {
        if (cnVar.f11516a > 0) {
            ArrayList<C4327cn> arrayList = new ArrayList<>();
            arrayList.add(cnVar);
            m11965a(arrayList, "remove", cnVar.f11515a);
        }
    }

    /* renamed from: c */
    public void mo41602c(C4327cn cnVar) {
        if (cnVar.f11516a > 0) {
            ArrayList<C4327cn> arrayList = new ArrayList<>();
            arrayList.add(cnVar);
            m11965a(arrayList, "received", cnVar.f11515a);
        }
    }
}
