package com.qiyukf.unicorn.p213f.p214a.p220d;

import com.p118pd.sdk.C8713oo0o0o;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = C8713oo0o0o.OooO0oo, mo35942b = false)
/* renamed from: com.qiyukf.unicorn.f.a.d.o */
public class C2580o extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "result")

    /* renamed from: a */
    public String f5228a;

    /* renamed from: b */
    public Map<String, Integer> f5229b;

    /* renamed from: a */
    public final Map<String, Integer> mo36068a() {
        return this.f5229b;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        super.afterParse(jSONObject);
        JSONArray b = C1810b.m3428b(this.f5228a);
        if (b != null && b.length() > 0) {
            this.f5229b = new HashMap(b.length());
            for (int i = 0; i < b.length(); i++) {
                JSONObject b2 = C1810b.m3429b(b, i);
                this.f5229b.put(C1810b.m3432e(C1810b.m3433f(b2, "shop"), "id"), Integer.valueOf(C1810b.m3427b(C1810b.m3433f(b2, "sessionStatus"), "status")));
            }
        }
    }
}
