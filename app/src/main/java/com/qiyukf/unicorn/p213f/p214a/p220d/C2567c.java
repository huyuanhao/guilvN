package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2433b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 89759)
/* renamed from: com.qiyukf.unicorn.f.a.d.c */
public class C2567c extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "evaluation")

    /* renamed from: a */
    public int f5193a;
    @AbstractC2548a(mo35940a = "fromType")

    /* renamed from: b */
    public String f5194b;
    @AbstractC2548a(mo35940a = "sessionid")

    /* renamed from: c */
    public long f5195c;
    @AbstractC2548a(mo35940a = "remarks")

    /* renamed from: d */
    public String f5196d;
    @AbstractC2548a(mo35940a = "evaluation_resolved")

    /* renamed from: e */
    public int f5197e;
    @AbstractC2548a(mo35940a = "evaluationTimes")

    /* renamed from: f */
    public int f5198f;
    @AbstractC2548a(mo35940a = "ISEVALUATOR")

    /* renamed from: g */
    public boolean f5199g;
    @AbstractC2548a(mo35940a = "evaluator_is_re_start")

    /* renamed from: h */
    public boolean f5200h;
    @AbstractC2548a(mo35940a = "tagList")

    /* renamed from: i */
    public List<String> f5201i;
    @AbstractC2548a(mo35940a = "isClickCancel")

    /* renamed from: j */
    public boolean f5202j = false;

    /* renamed from: k */
    public C2555c f5203k;

    /* renamed from: a */
    public final int mo36019a() {
        return this.f5193a;
    }

    /* renamed from: a */
    public final void mo36020a(int i) {
        this.f5193a = i;
    }

    /* renamed from: a */
    public final void mo36021a(long j) {
        this.f5195c = j;
    }

    /* renamed from: a */
    public final void mo36022a(C2555c cVar) {
        this.f5203k = cVar;
    }

    /* renamed from: a */
    public final void mo36023a(String str) {
        this.f5194b = str;
    }

    /* renamed from: a */
    public final void mo36024a(List<String> list) {
        this.f5201i = list;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        JSONObject f = C1810b.m3433f(jSONObject, "evaluation_setting");
        if (f != null) {
            C2555c cVar = new C2555c();
            this.f5203k = cVar;
            cVar.mo35957a(f);
            return;
        }
        this.f5203k = C2555c.m5698a();
    }

    /* renamed from: b */
    public final long mo36025b() {
        return this.f5195c;
    }

    /* renamed from: b */
    public final void mo36026b(int i) {
        this.f5198f = i;
    }

    /* renamed from: b */
    public final void mo36027b(String str) {
        this.f5196d = str;
    }

    /* renamed from: c */
    public final String mo36028c() {
        return this.f5196d;
    }

    /* renamed from: c */
    public final void mo36029c(int i) {
        this.f5197e = i;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return true;
    }

    /* renamed from: d */
    public final List<String> mo36030d() {
        return this.f5201i;
    }

    /* renamed from: e */
    public final C2555c mo36031e() {
        return this.f5203k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2567c) {
            C2567c cVar = (C2567c) obj;
            return this.f5193a == cVar.f5193a && TextUtils.equals(this.f5196d, cVar.f5196d) && this.f5197e == cVar.f5197e;
        }
    }

    /* renamed from: f */
    public final boolean mo36033f() {
        return this.f5199g;
    }

    /* renamed from: g */
    public final void mo36034g() {
        this.f5199g = true;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        int i;
        StringBuilder sb = new StringBuilder("[");
        String str = null;
        if (this.f5193a != -1) {
            if (C2433b.m5229a().mo35650b() != null) {
                C2433b.m5229a();
                if (!TextUtils.isEmpty(null)) {
                    C2433b.m5229a();
                    sb.append(str.toString());
                    sb.append("]");
                    return sb.toString();
                }
            }
            if (!TextUtils.isEmpty(this.f5203k.mo35967j())) {
                str = this.f5203k.mo35967j();
                sb.append(str.toString());
                sb.append("]");
                return sb.toString();
            }
            i = C2364R.string.ysf_evaluation_msg_result_tip;
        } else if (!TextUtils.isEmpty(this.f5203k.mo35966i())) {
            str = this.f5203k.mo35966i();
            sb.append(str.toString());
            sb.append("]");
            return sb.toString();
        } else {
            i = C2364R.string.ysf_evaluation_message_item_text;
        }
        str = context.getString(i);
        sb.append(str.toString());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: h */
    public final int mo36035h() {
        return this.f5197e;
    }

    /* renamed from: i */
    public final boolean mo36036i() {
        return this.f5200h;
    }

    /* renamed from: j */
    public final boolean mo36037j() {
        return this.f5202j;
    }

    /* renamed from: k */
    public final void mo36038k() {
        this.f5202j = true;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2597e
    public JSONObject toJsonObject(boolean z) {
        JSONObject jsonObject = super.toJsonObject(z);
        if (!z) {
            C1810b.m3424a(jsonObject, "evaluation_setting", this.f5203k.mo35958b());
        }
        if (this.f5201i != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f5201i) {
                jSONArray.put(str);
            }
            C1810b.m3424a(jsonObject, "tagList", jSONArray);
        }
        C1810b.m3424a(jsonObject, "ISEVALUATOR", Boolean.valueOf(this.f5199g));
        C1810b.m3424a(jsonObject, "isClickCancel", Boolean.valueOf(this.f5202j));
        C1810b.m3424a(jsonObject, "evaluator_is_re_start", Boolean.valueOf(this.f5200h));
        return jsonObject;
    }
}
