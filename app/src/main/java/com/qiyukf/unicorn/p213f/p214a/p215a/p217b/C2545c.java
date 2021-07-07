package com.qiyukf.unicorn.p213f.p214a.p215a.p217b;

import android.content.Context;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.AbstractC2375a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2552c;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "qiyu_template_text")
/* renamed from: com.qiyukf.unicorn.f.a.a.b.c */
public class C2545c extends AbstractC2375a implements AbstractC2552c {
    @AbstractC2548a(mo35940a = "label")

    /* renamed from: a */
    public String f5119a;

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2552c
    /* renamed from: a */
    public final String mo35923a(Context context) {
        return this.f5119a;
    }

    /* renamed from: a */
    public final void mo35934a(String str) {
        this.f5119a = str;
    }

    /* renamed from: c */
    public final JSONObject mo35935c() {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "label", this.f5119a);
        C1810b.m3425a(jSONObject, "id", mo35277b());
        return jSONObject;
    }

    /* renamed from: d */
    public final String mo35936d() {
        return this.f5119a;
    }
}
