package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p212e.C2476k;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2552c;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p232k.C2700f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 60)
/* renamed from: com.qiyukf.unicorn.f.a.d.q */
public class C2582q extends AbstractC2597e implements AbstractC2552c {
    @AbstractC2548a(mo35940a = "answer_label")

    /* renamed from: a */
    public String f5231a;
    @AbstractC2548a(mo35940a = "answer_flag")

    /* renamed from: b */
    public int f5232b;
    @AbstractC2548a(mo35940a = "answer_list")

    /* renamed from: c */
    public String f5233c;
    @AbstractC2548a(mo35940a = "operator_hint_desc")

    /* renamed from: d */
    public String f5234d;
    @AbstractC2548a(mo35940a = "evaluation")

    /* renamed from: e */
    public int f5235e;
    @AbstractC2548a(mo35940a = "evaluation_reason")

    /* renamed from: f */
    public int f5236f;
    @AbstractC2548a(mo35940a = "evaluation_guide")

    /* renamed from: g */
    public String f5237g;
    @AbstractC2548a(mo35940a = "evaluation_content")

    /* renamed from: h */
    public String f5238h;

    /* renamed from: i */
    public List<C2476k> f5239i;

    /* renamed from: j */
    public long f5240j;

    /* renamed from: a */
    public final String mo36071a() {
        return this.f5231a;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2552c
    /* renamed from: a */
    public final String mo35923a(Context context) {
        List<C2476k> list;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f5231a) || (list = this.f5239i) == null || list.size() != 1) {
            if (!TextUtils.isEmpty(this.f5231a)) {
                sb.append(C2700f.m6245a(this.f5231a));
            }
            List<C2476k> list2 = this.f5239i;
            if (list2 != null) {
                for (C2476k kVar : list2) {
                    sb.append("\r\n");
                    sb.append(kVar.f4902b);
                }
            }
        } else {
            sb.append(C2700f.m6245a(this.f5239i.get(0).f4903c));
        }
        if (!TextUtils.isEmpty(this.f5234d)) {
            if (sb.length() > 0) {
                sb.append("\r\n");
            }
            sb.append(mo36076b() ? C2700f.m6245a(this.f5234d) : this.f5234d);
        }
        return C1990f.m3951b(context, sb.toString(), null).toString();
    }

    /* renamed from: a */
    public final void mo36072a(int i) {
        this.f5235e = i;
    }

    /* renamed from: a */
    public final void mo36073a(long j) {
        this.f5240j = j;
    }

    /* renamed from: a */
    public final void mo36074a(String str) {
        this.f5238h = str;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        this.f5240j = C1810b.m3430c(jSONObject, "sessionid");
        JSONArray b = C1810b.m3428b(this.f5233c);
        if (b != null) {
            this.f5239i = new ArrayList(b.length());
            for (int i = 0; i < b.length(); i++) {
                JSONObject b2 = C1810b.m3429b(b, i);
                C2476k kVar = new C2476k();
                kVar.f4901a = C1810b.m3430c(b2, "id");
                kVar.f4902b = C1810b.m3432e(b2, "question");
                kVar.f4903c = C1810b.m3432e(b2, "answer");
                kVar.f4904d = C1810b.m3427b(b2, "answer_flag");
                this.f5239i.add(kVar);
            }
        }
    }

    /* renamed from: b */
    public final String mo36075b(Context context) {
        return TextUtils.isEmpty(this.f5237g) ? context.getString(C2364R.string.ysf_message_robot_evaluation_guide) : this.f5237g;
    }

    /* renamed from: b */
    public final boolean mo36076b() {
        return (this.f5232b & 2) == 2;
    }

    /* renamed from: c */
    public final String mo36077c() {
        return this.f5234d;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return true;
    }

    /* renamed from: d */
    public final List<C2476k> mo36078d() {
        return this.f5239i;
    }

    /* renamed from: e */
    public final int mo36079e() {
        return this.f5235e;
    }

    /* renamed from: f */
    public final String mo36080f() {
        return this.f5238h;
    }

    /* renamed from: g */
    public final long mo36081g() {
        return this.f5240j;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return mo35923a(context).replace("\n", " ");
    }

    /* renamed from: h */
    public final boolean mo36082h() {
        return this.f5236f == 1;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2597e
    public JSONObject toJsonObject(boolean z) {
        JSONObject jsonObject = super.toJsonObject(z);
        if (!z) {
            C1810b.m3423a(jsonObject, "sessionid", this.f5240j);
        }
        return jsonObject;
    }
}
