package com.qiyukf.unicorn.p213f.p214a.p222f;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.AbstractC2375a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "ysf_template_auto_worksheet")
/* renamed from: com.qiyukf.unicorn.f.a.f.x */
public class C2628x extends AbstractC2375a implements AbstractC2498a {
    @AbstractC2548a(mo35940a = "forms")

    /* renamed from: a */
    public List<C2629a> f5396a;
    @AbstractC2548a(mo35940a = "id")

    /* renamed from: b */
    public String f5397b;

    /* renamed from: com.qiyukf.unicorn.f.a.f.x$a */
    public static class C2629a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "key")

        /* renamed from: a */
        public String f5398a;
        @AbstractC2548a(mo35940a = "label")

        /* renamed from: b */
        public String f5399b;
        @AbstractC2548a(mo35940a = "value")

        /* renamed from: c */
        public Object f5400c;

        /* renamed from: a */
        public final String mo36231a() {
            return this.f5398a;
        }

        /* renamed from: a */
        public final void mo36232a(Object obj) {
            this.f5400c = obj;
        }

        /* renamed from: a */
        public final void mo36233a(String str) {
            this.f5398a = str;
        }

        /* renamed from: b */
        public final String mo36234b() {
            return this.f5399b;
        }

        /* renamed from: b */
        public final void mo36235b(String str) {
            this.f5399b = str;
        }

        /* renamed from: c */
        public final Object mo36236c() {
            return this.f5400c;
        }
    }

    /* renamed from: a */
    public final void mo36228a(String str) {
        this.f5397b = str;
    }

    /* renamed from: a */
    public final void mo36229a(List<C2629a> list) {
        this.f5396a = list;
    }

    /* renamed from: c */
    public final JSONObject mo36230c() {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "id", mo35277b());
        JSONArray jSONArray = new JSONArray();
        for (C2629a aVar : this.f5396a) {
            JSONObject jSONObject2 = new JSONObject();
            C1810b.m3425a(jSONObject2, "label", aVar.mo36234b());
            C1810b.m3425a(jSONObject2, "key", aVar.mo36231a());
            C1810b.m3424a(jSONObject2, "value", aVar.mo36236c());
            C1810b.m3421a(jSONArray, jSONObject2);
        }
        C1810b.m3424a(jSONObject, "forms", jSONArray);
        return jSONObject;
    }
}
