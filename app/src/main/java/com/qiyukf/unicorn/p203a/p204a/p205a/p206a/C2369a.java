package com.qiyukf.unicorn.p203a.p204a.p205a.p206a;

import android.text.TextUtils;
import com.p118pd.sdk.C8706oo0o0OO0;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2556d;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 203)
/* renamed from: com.qiyukf.unicorn.a.a.a.a.a */
public class C2369a extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "type")

    /* renamed from: a */
    public String f4722a;
    @AbstractC2548a(mo35940a = C8706oo0o0OO0.OooO0Oo)

    /* renamed from: b */
    public String f4723b;
    @AbstractC2548a(mo35940a = "extendInfo")

    /* renamed from: c */
    public String f4724c;
    @AbstractC2548a(mo35940a = "transferRgType")

    /* renamed from: d */
    public int f4725d;

    /* renamed from: e */
    public C2556d f4726e;

    /* renamed from: a */
    public final String mo35228a() {
        return this.f4722a;
    }

    /* renamed from: a */
    public final void mo35229a(String str, Object obj) {
        JSONObject a = C1810b.m3420a(this.f4723b);
        if (a != null) {
            C1810b.m3424a(a, str, obj);
            C1810b.m3422a(a, "transferRgType", this.f4725d);
            this.f4723b = a.toString();
        }
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(this.f4724c)) {
            C2556d dVar = new C2556d();
            this.f4726e = dVar;
            dVar.mo35971a(C1810b.m3420a(this.f4724c));
        }
        if (this.f4725d != 0) {
            JSONObject a = C1810b.m3420a(this.f4723b);
            C1810b.m3422a(a, "transferRgType", this.f4725d);
            this.f4723b = a.toString();
        }
    }

    /* renamed from: b */
    public final String mo35231b() {
        return this.f4723b;
    }
}
