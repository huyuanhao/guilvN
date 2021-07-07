package com.qiyukf.unicorn.p213f.p214a.p219c;

import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOptionEntry;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.C2547b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a.c.c */
public final class C2555c implements AbstractC2498a {
    @AbstractC2548a(mo35940a = "title")

    /* renamed from: a */
    public String f5139a;
    @AbstractC2548a(mo35940a = "type")

    /* renamed from: b */
    public int f5140b;
    @AbstractC2548a(mo35940a = C8412oOoo0OoO.OooO0OO)

    /* renamed from: c */
    public List<EvaluationOptionEntry> f5141c;
    @AbstractC2548a(mo35940a = "resolvedEnabled")

    /* renamed from: d */
    public int f5142d;
    @AbstractC2548a(mo35940a = "resolvedRequired")

    /* renamed from: e */
    public int f5143e;
    @AbstractC2548a(mo35940a = "pattern")

    /* renamed from: f */
    public int f5144f;
    @AbstractC2548a(mo35940a = "evaluation_timeout")

    /* renamed from: g */
    public long f5145g;
    @AbstractC2548a(mo35940a = "enable_evaluation_muttimes")

    /* renamed from: h */
    public boolean f5146h;
    @AbstractC2548a(mo35940a = "show_evaluation_button")

    /* renamed from: i */
    public boolean f5147i;
    @AbstractC2548a(mo35940a = "richTextInvite")

    /* renamed from: j */
    public String f5148j;
    @AbstractC2548a(mo35940a = "richTextThanks")

    /* renamed from: k */
    public String f5149k;

    /* renamed from: l */
    public transient JSONObject f5150l;

    /* renamed from: a */
    public static C2555c m5698a() {
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "name", C2452d.m5367c().getString(C2364R.string.ysf_evaluation_satisfied));
        C1810b.m3422a(jSONObject, "value", 100);
        JSONObject jSONObject2 = new JSONObject();
        C1810b.m3425a(jSONObject2, "name", C2452d.m5367c().getString(C2364R.string.ysf_evaluation_dissatisfied));
        C1810b.m3422a(jSONObject2, "value", 1);
        JSONArray jSONArray = new JSONArray();
        C1810b.m3421a(jSONArray, jSONObject);
        C1810b.m3421a(jSONArray, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C1810b.m3424a(jSONObject3, C8412oOoo0OoO.OooO0OO, jSONArray);
        C1810b.m3422a(jSONObject3, "type", 2);
        C1810b.m3430c(jSONObject, "evaluation_timeout");
        C1810b.m3426a(jSONObject, "enable_evaluation_muttimes");
        C1810b.m3426a(jSONObject, "session_end_switch");
        C1810b.m3426a(jSONObject, "session_open_switch");
        C1810b.m3426a(jSONObject, "session_timeout_switch");
        C2555c cVar = new C2555c();
        cVar.mo35957a(jSONObject3);
        return cVar;
    }

    /* renamed from: a */
    public final void mo35956a(String str) {
        this.f5149k = str;
    }

    /* renamed from: a */
    public final void mo35957a(JSONObject jSONObject) {
        this.f5150l = jSONObject;
        C2547b.m5680a(this, jSONObject);
    }

    /* renamed from: b */
    public final JSONObject mo35958b() {
        return this.f5150l;
    }

    /* renamed from: b */
    public final void mo35959b(String str) {
        this.f5148j = str;
    }

    /* renamed from: c */
    public final String mo35960c() {
        return this.f5139a;
    }

    /* renamed from: d */
    public final int mo35961d() {
        return this.f5140b;
    }

    /* renamed from: e */
    public final List<EvaluationOptionEntry> mo35962e() {
        return this.f5141c;
    }

    /* renamed from: f */
    public final Long mo35963f() {
        return Long.valueOf(this.f5145g);
    }

    /* renamed from: g */
    public final boolean mo35964g() {
        return this.f5146h;
    }

    /* renamed from: h */
    public final boolean mo35965h() {
        return this.f5147i;
    }

    /* renamed from: i */
    public final String mo35966i() {
        return this.f5148j;
    }

    /* renamed from: j */
    public final String mo35967j() {
        return this.f5149k;
    }

    /* renamed from: k */
    public final int mo35968k() {
        return this.f5142d;
    }

    /* renamed from: l */
    public final int mo35969l() {
        return this.f5143e;
    }

    /* renamed from: m */
    public final int mo35970m() {
        return this.f5144f;
    }
}
