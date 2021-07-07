package com.qiyukf.unicorn.p213f.p214a.p215a.p217b;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.AbstractC2375a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "qiyu_template_mixReply")
/* renamed from: com.qiyukf.unicorn.f.a.a.b.b */
public class C2544b extends AbstractC2375a {
    @AbstractC2548a(mo35940a = "label")

    /* renamed from: a */
    public String f5116a;
    @AbstractC2548a(mo35940a = "type")

    /* renamed from: b */
    public String f5117b;

    /* renamed from: c */
    public transient JSONObject f5118c;

    /* renamed from: a */
    public final void mo35930a(String str) {
        this.f5116a = str;
    }

    /* renamed from: b */
    public final void mo35931b(String str) {
        this.f5117b = str;
    }

    /* renamed from: c */
    public final String mo35932c() {
        return this.f5116a;
    }

    /* renamed from: d */
    public final JSONObject mo35933d() {
        JSONObject jSONObject = this.f5118c;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C1810b.m3425a(jSONObject, "id", mo35277b());
        C1810b.m3425a(jSONObject, "label", this.f5116a);
        return jSONObject;
    }
}
