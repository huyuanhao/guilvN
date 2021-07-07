package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.text.TextUtils;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 42)
/* renamed from: com.qiyukf.unicorn.f.a.d.z */
public class C2596z extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "sessionId")

    /* renamed from: a */
    public long f5292a;
    @AbstractC2548a(mo35940a = "msgIdClient")

    /* renamed from: b */
    public String f5293b;
    @AbstractC2548a(mo35940a = "trashWords")

    /* renamed from: c */
    public transient JSONArray f5294c;
    @AbstractC2548a(mo35940a = "auditResult")

    /* renamed from: d */
    public int f5295d;

    /* renamed from: e */
    public String f5296e;

    /* renamed from: a */
    public final boolean mo36136a() {
        return this.f5292a > 0 && !TextUtils.isEmpty(this.f5296e);
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        try {
            this.f5296e = this.f5293b.substring(this.f5293b.indexOf(35) + 1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final String mo36137b() {
        return this.f5296e;
    }

    /* renamed from: c */
    public final JSONArray mo36138c() {
        return this.f5294c;
    }

    /* renamed from: d */
    public final int mo36139d() {
        return this.f5295d;
    }
}
