package com.qiyukf.unicorn.p213f.p214a.p222f;

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

@AbstractC2549b(mo35941a = 51)
/* renamed from: com.qiyukf.unicorn.f.a.f.d */
public class C2608d extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "evaluation")

    /* renamed from: a */
    public int f5322a;
    @AbstractC2548a(mo35940a = "fromType")

    /* renamed from: b */
    public String f5323b;
    @AbstractC2548a(mo35940a = "sessionid")

    /* renamed from: c */
    public long f5324c;
    @AbstractC2548a(mo35940a = "remarks")

    /* renamed from: d */
    public String f5325d;
    @AbstractC2548a(mo35940a = "evaluation_resolved")

    /* renamed from: e */
    public int f5326e;
    @AbstractC2548a(mo35940a = "evaluationTimes")

    /* renamed from: f */
    public int f5327f;
    @AbstractC2548a(mo35940a = "ISEVALUATOR")

    /* renamed from: g */
    public boolean f5328g;
    @AbstractC2548a(mo35940a = "tagList")

    /* renamed from: h */
    public List<String> f5329h;

    /* renamed from: i */
    public C2555c f5330i;

    /* renamed from: a */
    public final CharSequence mo36158a(Context context) {
        if (!mo36167b()) {
            return !TextUtils.isEmpty(this.f5330i.mo35966i()) ? this.f5330i.mo35966i() : context.getString(C2364R.string.ysf_evaluation_message_item_text);
        }
        if (C2433b.m5229a().mo35650b() != null) {
            C2433b.m5229a();
            if (!TextUtils.isEmpty(null)) {
                C2433b.m5229a();
                return null;
            }
        }
        return !TextUtils.isEmpty(this.f5330i.mo35967j()) ? this.f5330i.mo35967j() : context.getString(C2364R.string.ysf_evaluation_msg_result_tip);
    }

    /* renamed from: a */
    public final void mo36159a(int i) {
        this.f5322a = i;
    }

    /* renamed from: a */
    public final void mo36160a(long j) {
        this.f5324c = j;
    }

    /* renamed from: a */
    public final void mo36161a(C2555c cVar) {
        this.f5330i = cVar;
    }

    /* renamed from: a */
    public final void mo36162a(String str) {
        this.f5323b = str;
    }

    /* renamed from: a */
    public final void mo36163a(List<String> list) {
        this.f5329h = list;
    }

    /* renamed from: a */
    public final boolean mo36164a() {
        return this.f5330i.mo35964g();
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        JSONObject f = C1810b.m3433f(jSONObject, "evaluation_setting");
        if (f != null) {
            C2555c cVar = new C2555c();
            this.f5330i = cVar;
            cVar.mo35957a(f);
            return;
        }
        this.f5330i = C2555c.m5698a();
    }

    /* renamed from: b */
    public final void mo36165b(int i) {
        this.f5327f = i;
    }

    /* renamed from: b */
    public final void mo36166b(String str) {
        this.f5325d = str;
    }

    /* renamed from: b */
    public final boolean mo36167b() {
        return this.f5322a != -1;
    }

    /* renamed from: c */
    public final int mo36168c() {
        return this.f5322a;
    }

    /* renamed from: c */
    public final void mo36169c(int i) {
        this.f5326e = i;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return true;
    }

    /* renamed from: d */
    public final long mo36170d() {
        return this.f5324c;
    }

    /* renamed from: e */
    public final String mo36171e() {
        return this.f5325d;
    }

    /* renamed from: f */
    public final List<String> mo36172f() {
        return this.f5329h;
    }

    /* renamed from: g */
    public final C2555c mo36173g() {
        return this.f5330i;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return "[" + mo36158a(context).toString() + "]";
    }

    /* renamed from: h */
    public final int mo36174h() {
        return this.f5327f;
    }

    /* renamed from: i */
    public final boolean mo36175i() {
        return this.f5328g;
    }

    /* renamed from: j */
    public final void mo36176j() {
        this.f5328g = true;
    }

    /* renamed from: k */
    public final int mo36177k() {
        return this.f5326e;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2597e
    public JSONObject toJsonObject(boolean z) {
        JSONObject jsonObject = super.toJsonObject(z);
        if (!z) {
            C1810b.m3424a(jsonObject, "evaluation_setting", this.f5330i.mo35958b());
        }
        if (this.f5329h != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f5329h) {
                jSONArray.put(str);
            }
            C1810b.m3424a(jsonObject, "tagList", jSONArray);
        }
        C1810b.m3424a(jsonObject, "ISEVALUATOR", Boolean.valueOf(this.f5328g));
        return jsonObject;
    }
}
