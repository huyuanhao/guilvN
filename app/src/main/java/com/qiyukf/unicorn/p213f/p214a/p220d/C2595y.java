package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p232k.C2700f;
import org.json.JSONArray;

@AbstractC2549b(mo35941a = 43)
/* renamed from: com.qiyukf.unicorn.f.a.d.y */
public class C2595y extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "content")

    /* renamed from: a */
    public String f5288a;
    @AbstractC2548a(mo35940a = "type")

    /* renamed from: b */
    public int f5289b;
    @AbstractC2548a(mo35940a = "trashWords")

    /* renamed from: c */
    public transient JSONArray f5290c;
    @AbstractC2548a(mo35940a = "auditResult")

    /* renamed from: d */
    public int f5291d;

    /* renamed from: a */
    public final void mo36132a() {
        this.f5289b = 1;
    }

    /* renamed from: a */
    public final void mo36133a(int i) {
        this.f5291d = i;
    }

    /* renamed from: a */
    public final void mo36134a(String str) {
        this.f5288a = str;
    }

    /* renamed from: a */
    public final void mo36135a(JSONArray jSONArray) {
        this.f5290c = jSONArray;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        if (this.f5289b != 1) {
            return this.f5288a;
        }
        String e = C1810b.m3432e(C1810b.m3420a(this.f5288a), "content");
        if (TextUtils.isEmpty(e)) {
            e = "";
        }
        return C2700f.m6245a(e).replace("\n", " ");
    }
}
