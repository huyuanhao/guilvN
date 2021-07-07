package com.qiyukf.unicorn.p213f.p214a.p219c;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a.c.b */
public final class C2554b implements AbstractC2498a {
    @AbstractC2548a(mo35940a = "p_item_type")

    /* renamed from: a */
    public String f5128a;
    @AbstractC2548a(mo35940a = "p_img")

    /* renamed from: b */
    public String f5129b;
    @AbstractC2548a(mo35940a = "p_title")

    /* renamed from: c */
    public String f5130c;
    @AbstractC2548a(mo35940a = "p_sub_title")

    /* renamed from: d */
    public String f5131d;
    @AbstractC2548a(mo35940a = "p_attr_1")

    /* renamed from: e */
    public String f5132e;
    @AbstractC2548a(mo35940a = "p_attr_2")

    /* renamed from: f */
    public String f5133f;
    @AbstractC2548a(mo35940a = "p_attr_3")

    /* renamed from: g */
    public String f5134g;
    @AbstractC2548a(mo35940a = "type")

    /* renamed from: h */
    public String f5135h;
    @AbstractC2548a(mo35940a = "target")

    /* renamed from: i */
    public String f5136i;
    @AbstractC2548a(mo35940a = "params")

    /* renamed from: j */
    public String f5137j;

    /* renamed from: k */
    public transient JSONObject f5138k;

    /* renamed from: a */
    public final JSONObject mo35946a() {
        if (this.f5138k == null) {
            JSONObject jSONObject = new JSONObject();
            this.f5138k = jSONObject;
            C1810b.m3425a(jSONObject, "p_img", this.f5129b);
            C1810b.m3425a(this.f5138k, "p_title", this.f5130c);
            C1810b.m3425a(this.f5138k, "p_sub_title", this.f5131d);
            C1810b.m3425a(this.f5138k, "p_attr_1", this.f5132e);
            C1810b.m3425a(this.f5138k, "p_attr_2", this.f5133f);
            C1810b.m3425a(this.f5138k, "p_attr_3", this.f5134g);
            C1810b.m3425a(this.f5138k, "type", this.f5135h);
            C1810b.m3425a(this.f5138k, "target", this.f5136i);
            C1810b.m3425a(this.f5138k, "params", this.f5137j);
        }
        return this.f5138k;
    }

    /* renamed from: b */
    public final String mo35947b() {
        return this.f5128a;
    }

    /* renamed from: c */
    public final String mo35948c() {
        return this.f5129b;
    }

    /* renamed from: d */
    public final String mo35949d() {
        return this.f5130c;
    }

    /* renamed from: e */
    public final String mo35950e() {
        return this.f5131d;
    }

    /* renamed from: f */
    public final String mo35951f() {
        return this.f5132e;
    }

    /* renamed from: g */
    public final String mo35952g() {
        return this.f5133f;
    }

    /* renamed from: h */
    public final String mo35953h() {
        return this.f5134g;
    }

    /* renamed from: i */
    public final String mo35954i() {
        return this.f5135h;
    }

    /* renamed from: j */
    public final String mo35955j() {
        return this.f5136i;
    }
}
