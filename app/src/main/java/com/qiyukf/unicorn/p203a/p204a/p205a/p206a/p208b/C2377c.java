package com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b;

import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2557e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "qiyu_template_item")
/* renamed from: com.qiyukf.unicorn.a.a.a.a.b.c */
public class C2377c extends AbstractC2375a {

    /* renamed from: a */
    public transient JSONObject f4749a;
    @AbstractC2548a(mo35940a = "target")

    /* renamed from: b */
    public String f4750b;
    @AbstractC2548a(mo35940a = "params")

    /* renamed from: c */
    public String f4751c;
    @AbstractC2548a(mo35940a = "p_img")

    /* renamed from: d */
    public String f4752d;
    @AbstractC2548a(mo35940a = "p_title")

    /* renamed from: e */
    public String f4753e;
    @AbstractC2548a(mo35940a = "p_sub_title")

    /* renamed from: f */
    public String f4754f;
    @AbstractC2548a(mo35940a = "p_attr_1")

    /* renamed from: g */
    public String f4755g;
    @AbstractC2548a(mo35940a = "p_attr_2")

    /* renamed from: h */
    public String f4756h;
    @AbstractC2548a(mo35940a = "p_attr_3")

    /* renamed from: i */
    public String f4757i;
    @AbstractC2548a(mo35940a = "ext")

    /* renamed from: j */
    public String f4758j;
    @AbstractC2548a(mo35940a = "isOpenReselect")

    /* renamed from: k */
    public boolean f4759k;

    /* renamed from: l */
    public List<C2557e> f4760l = new ArrayList();

    /* renamed from: m */
    public String f4761m;

    /* renamed from: n */
    public String f4762n;

    /* renamed from: o */
    public String f4763o;

    /* renamed from: a */
    public final void mo35255a(String str) {
        this.f4763o = str;
    }

    /* renamed from: a */
    public final void mo35256a(boolean z) {
        this.f4759k = z;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        this.f4749a = jSONObject;
        if (!TextUtils.isEmpty(C1810b.m3432e(jSONObject, "ITEM_EXT_TAG"))) {
            String e = C1810b.m3432e(jSONObject, "ITEM_EXT_TAG");
            this.f4758j = e;
            JSONObject a = C1810b.m3420a(e);
            this.f4763o = C1810b.m3432e(a, "MSG_CLIENT_ID_TAG");
            C2313a a2 = C2323f.m5018a(C1810b.m3432e(a, "MSG_CLIENT_ID_TAG"));
            if (a2 != null) {
                if (a2.getAttachment() instanceof C2519j) {
                    C2519j jVar = (C2519j) a2.getAttachment();
                    this.f4761m = jVar.mo35830c();
                    this.f4760l.clear();
                    this.f4760l.addAll(jVar.mo35833f());
                    this.f4762n = jVar.mo35832e();
                } else if (a2.getAttachment() instanceof C2506d) {
                    C2506d dVar = (C2506d) a2.getAttachment();
                    this.f4761m = !TextUtils.isEmpty(dVar.mo35793g()) ? dVar.mo35793g() : dVar.mo35789c();
                    this.f4762n = dVar.mo35790d();
                    C2557e eVar = new C2557e();
                    eVar.mo35975a(dVar.mo35792f());
                    eVar.mo35973a(dVar.mo35791e());
                    this.f4760l.clear();
                    this.f4760l.add(eVar);
                }
                this.f4759k = C1810b.m3426a(jSONObject, "TAB_IS_OPEN_RESELECT_TAG");
            }
        }
    }

    /* renamed from: b */
    public final void mo35257b(String str) {
        this.f4758j = str;
    }

    /* renamed from: c */
    public final JSONObject mo35258c() {
        JSONObject jSONObject = this.f4749a;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C1810b.m3425a(jSONObject, "id", mo35277b());
        C1810b.m3425a(jSONObject, "ITEM_EXT_TAG", this.f4758j);
        C1810b.m3424a(jSONObject, "TAB_IS_OPEN_RESELECT_TAG", Boolean.valueOf(this.f4759k));
        return jSONObject;
    }

    /* renamed from: c */
    public final void mo35259c(String str) {
        this.f4761m = str;
    }

    /* renamed from: d */
    public final String mo35260d() {
        return this.f4763o;
    }

    /* renamed from: d */
    public final void mo35261d(String str) {
        this.f4762n = str;
    }

    /* renamed from: e */
    public final String mo35262e() {
        return this.f4758j;
    }

    /* renamed from: f */
    public final List<C2557e> mo35263f() {
        return this.f4760l;
    }

    /* renamed from: g */
    public final String mo35264g() {
        return this.f4761m;
    }

    /* renamed from: h */
    public final String mo35265h() {
        return this.f4762n;
    }

    /* renamed from: i */
    public final boolean mo35266i() {
        return this.f4759k;
    }

    /* renamed from: j */
    public final String mo35267j() {
        return this.f4750b;
    }

    /* renamed from: k */
    public final String mo35268k() {
        return this.f4751c;
    }

    /* renamed from: l */
    public final String mo35269l() {
        return this.f4752d;
    }

    /* renamed from: m */
    public final String mo35270m() {
        return this.f4753e;
    }

    /* renamed from: n */
    public final String mo35271n() {
        return this.f4754f;
    }

    /* renamed from: o */
    public final String mo35272o() {
        return this.f4755g;
    }

    /* renamed from: p */
    public final String mo35273p() {
        return this.f4756h;
    }

    /* renamed from: q */
    public final String mo35274q() {
        return this.f4757i;
    }
}
