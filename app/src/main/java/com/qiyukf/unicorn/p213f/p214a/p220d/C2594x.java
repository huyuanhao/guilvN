package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.unicorn.p212e.C2467c;
import com.qiyukf.unicorn.p212e.C2479n;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2552c;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.umeng.socialize.handler.UMSSOHandler;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 90)
/* renamed from: com.qiyukf.unicorn.f.a.d.x */
public class C2594x extends AbstractC2597e implements AbstractC2552c {
    @AbstractC2548a(mo35940a = "message")

    /* renamed from: a */
    public String f5280a;
    @AbstractC2548a(mo35940a = UMSSOHandler.ICON)

    /* renamed from: b */
    public String f5281b;
    @AbstractC2548a(mo35940a = "entries")

    /* renamed from: c */
    public String f5282c;
    @AbstractC2548a(mo35940a = "shop")

    /* renamed from: d */
    public String f5283d;

    /* renamed from: e */
    public List<C2467c> f5284e;

    /* renamed from: f */
    public boolean f5285f;

    /* renamed from: g */
    public C2479n f5286g;
    @AbstractC2548a(mo35940a = "isShown")

    /* renamed from: h */
    public boolean f5287h;

    /* renamed from: a */
    public final String mo36124a() {
        return this.f5280a;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2552c
    /* renamed from: a */
    public final String mo35923a(Context context) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f5280a)) {
            sb.append(this.f5280a);
        }
        List<C2467c> list = this.f5284e;
        if (list != null) {
            for (C2467c cVar : list) {
                sb.append("\r\n");
                sb.append(cVar.f4865c);
            }
        }
        return C1990f.m3951b(context, sb.toString(), null).toString();
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        JSONArray b = C1810b.m3428b(this.f5282c);
        if (b != null) {
            this.f5284e = new ArrayList(b.length());
            for (int i = 0; i < b.length(); i++) {
                C2467c cVar = new C2467c();
                JSONObject b2 = C1810b.m3429b(b, i);
                cVar.f4863a = C1810b.m3427b(b2, "type");
                long c = C1810b.m3430c(b2, "id");
                cVar.f4864b = c;
                int i2 = cVar.f4863a;
                if (i2 == 1) {
                    cVar.mo35696a(c);
                } else if (i2 == 2) {
                    cVar.mo35698b(c);
                }
                cVar.f4865c = C1810b.m3432e(b2, "label");
                cVar.f4866d = C1810b.m3430c(b2, "entryid");
                this.f5284e.add(cVar);
            }
        }
        if (!TextUtils.isEmpty(this.f5283d)) {
            C2479n nVar = new C2479n();
            this.f5286g = nVar;
            nVar.mo35746a(this.f5283d);
        }
        if (jSONObject.has("clickable")) {
            this.f5285f = C1810b.m3426a(jSONObject, "clickable");
        } else {
            this.f5285f = true;
        }
    }

    /* renamed from: b */
    public final String mo36125b() {
        return this.f5281b;
    }

    /* renamed from: c */
    public final List<C2467c> mo36126c() {
        return this.f5284e;
    }

    /* renamed from: d */
    public final boolean mo36127d() {
        return this.f5285f;
    }

    /* renamed from: e */
    public final void mo36128e() {
        this.f5285f = false;
    }

    /* renamed from: f */
    public final C2479n mo36129f() {
        return this.f5286g;
    }

    /* renamed from: g */
    public final boolean mo36130g() {
        return this.f5287h;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return "[" + mo35923a(context).replace("\n", " ") + "]";
    }

    /* renamed from: h */
    public final void mo36131h() {
        this.f5287h = true;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2597e
    public JSONObject toJsonObject(boolean z) {
        JSONObject jsonObject = super.toJsonObject(z);
        if (!z) {
            C1810b.m3424a(jsonObject, "clickable", Boolean.valueOf(this.f5285f));
            C1810b.m3424a(jsonObject, "isShown", Boolean.valueOf(this.f5287h));
        }
        return jsonObject;
    }
}
