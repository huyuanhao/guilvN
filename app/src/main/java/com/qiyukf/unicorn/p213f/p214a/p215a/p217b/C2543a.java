package com.qiyukf.unicorn.p213f.p214a.p215a.p217b;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.AbstractC2375a;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2520k;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "qiyu_template_botForm")
/* renamed from: com.qiyukf.unicorn.f.a.a.b.a */
public class C2543a extends AbstractC2375a {
    @AbstractC2548a(mo35940a = "forms")

    /* renamed from: a */
    public List<C2520k.C2521a> f5115a;

    /* renamed from: a */
    public final void mo35927a(List<C2520k.C2521a> list) {
        this.f5115a = list;
    }

    /* renamed from: c */
    public final JSONObject mo35928c() {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "id", mo35277b());
        JSONArray jSONArray = new JSONArray();
        for (C2520k.C2521a aVar : this.f5115a) {
            JSONObject jSONObject2 = new JSONObject();
            C1810b.m3425a(jSONObject2, "label", aVar.mo35843c());
            C1810b.m3425a(jSONObject2, "type", aVar.mo35842b());
            C1810b.m3424a(jSONObject2, "value", aVar.mo35846f());
            C1810b.m3421a(jSONArray, jSONObject2);
        }
        C1810b.m3424a(jSONObject, "forms", jSONArray);
        return jSONObject;
    }

    /* renamed from: d */
    public final List<C2520k.C2521a> mo35929d() {
        return this.f5115a;
    }
}
