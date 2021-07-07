package com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.api.msg.ProductReslectOnclickListener;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "qiyu_template_goods")
/* renamed from: com.qiyukf.unicorn.a.a.a.a.b.b */
public class C2376b extends AbstractC2375a {
    @AbstractC2548a(mo35940a = "p_status")

    /* renamed from: a */
    public String f4738a;
    @AbstractC2548a(mo35940a = "p_img")

    /* renamed from: b */
    public String f4739b;
    @AbstractC2548a(mo35940a = "p_name")

    /* renamed from: c */
    public String f4740c;
    @AbstractC2548a(mo35940a = "p_price")

    /* renamed from: d */
    public String f4741d;
    @AbstractC2548a(mo35940a = "p_count")

    /* renamed from: e */
    public String f4742e;
    @AbstractC2548a(mo35940a = "p_stock")

    /* renamed from: f */
    public String f4743f;

    /* renamed from: g */
    public boolean f4744g;

    /* renamed from: h */
    public String f4745h;

    /* renamed from: i */
    public String f4746i;

    /* renamed from: j */
    public ProductReslectOnclickListener f4747j;

    /* renamed from: k */
    public transient JSONObject f4748k;

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        this.f4748k = jSONObject;
    }

    /* renamed from: c */
    public final JSONObject mo35244c() {
        JSONObject jSONObject = this.f4748k;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C1810b.m3425a(jSONObject, "id", mo35277b());
        return jSONObject;
    }

    /* renamed from: d */
    public final String mo35245d() {
        return this.f4738a;
    }

    /* renamed from: e */
    public final String mo35246e() {
        return this.f4739b;
    }

    /* renamed from: f */
    public final String mo35247f() {
        return this.f4740c;
    }

    /* renamed from: g */
    public final String mo35248g() {
        return this.f4741d;
    }

    /* renamed from: h */
    public final String mo35249h() {
        return this.f4742e;
    }

    /* renamed from: i */
    public final String mo35250i() {
        return this.f4743f;
    }

    /* renamed from: j */
    public final boolean mo35251j() {
        return this.f4744g;
    }

    /* renamed from: k */
    public final String mo35252k() {
        return this.f4745h;
    }

    /* renamed from: l */
    public final String mo35253l() {
        return this.f4746i;
    }

    /* renamed from: m */
    public final ProductReslectOnclickListener mo35254m() {
        return this.f4747j;
    }
}
