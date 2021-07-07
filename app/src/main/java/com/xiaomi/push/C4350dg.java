package com.xiaomi.push;

import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.dg */
public class C4350dg implements Comparable<C4350dg> {

    /* renamed from: a */
    public int f11581a;

    /* renamed from: a */
    public long f11582a;

    /* renamed from: a */
    public String f11583a;

    /* renamed from: a */
    public final LinkedList<C4336cw> f11584a;

    public C4350dg() {
        this(null, 0);
    }

    public C4350dg(String str) {
        this(str, 0);
    }

    public C4350dg(String str, int i) {
        this.f11584a = new LinkedList<>();
        this.f11582a = 0;
        this.f11583a = str;
        this.f11581a = i;
    }

    /* renamed from: a */
    public int compareTo(C4350dg dgVar) {
        if (dgVar == null) {
            return 1;
        }
        return dgVar.f11581a - this.f11581a;
    }

    /* renamed from: a */
    public synchronized C4350dg mo41656a(JSONObject jSONObject) {
        this.f11582a = jSONObject.getLong(AudioAttachment.KEY_TEXT);
        this.f11581a = jSONObject.getInt("wt");
        this.f11583a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f11584a.add(new C4336cw().mo41611a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized JSONObject mo41657a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(AudioAttachment.KEY_TEXT, this.f11582a);
        jSONObject.put("wt", this.f11581a);
        jSONObject.put("host", this.f11583a);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4336cw> it = this.f11584a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m11984a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public synchronized void mo41658a(C4336cw cwVar) {
        if (cwVar != null) {
            this.f11584a.add(cwVar);
            int a = cwVar.mo41610a();
            if (a > 0) {
                this.f11581a += cwVar.mo41610a();
            } else {
                int i = 0;
                int size = this.f11584a.size() - 1;
                while (size >= 0 && this.f11584a.get(size).mo41610a() < 0) {
                    i++;
                    size--;
                }
                this.f11581a += a * i;
            }
            if (this.f11584a.size() > 30) {
                this.f11581a -= this.f11584a.remove().mo41610a();
            }
        }
    }

    public String toString() {
        return this.f11583a + Constants.COLON_SEPARATOR + this.f11581a;
    }
}
