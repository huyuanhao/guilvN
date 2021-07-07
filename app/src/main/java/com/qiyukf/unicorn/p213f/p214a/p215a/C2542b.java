package com.qiyukf.unicorn.p213f.p214a.p215a;

import android.text.TextUtils;
import com.p118pd.sdk.C8706oo0o0OO0;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.AbstractC2370a;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.C2371b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2514h;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2531q;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2556d;
import com.tencent.bugly.beta.tinker.TinkerReport;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS)
/* renamed from: com.qiyukf.unicorn.f.a.a.b */
public class C2542b extends AbstractC2597e {
    @AbstractC2548a(mo35940a = C8706oo0o0OO0.OooO0Oo)

    /* renamed from: a */
    public String f5111a;
    @AbstractC2548a(mo35940a = "extendInfo")

    /* renamed from: b */
    public String f5112b;

    /* renamed from: c */
    public C2556d f5113c;

    /* renamed from: d */
    public AbstractC2370a f5114d;

    /* renamed from: a */
    public final AbstractC2370a mo35926a() {
        return this.f5114d;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        AbstractC2370a aVar;
        super.afterParse(jSONObject);
        if (!TextUtils.isEmpty(this.f5112b)) {
            C2556d dVar = new C2556d();
            this.f5113c = dVar;
            dVar.mo35971a(C1810b.m3420a(this.f5112b));
        }
        JSONObject a = C1810b.m3420a(this.f5111a);
        String e = C1810b.m3432e(a, "id");
        if (e != null) {
            char c = 65535;
            switch (e.hashCode()) {
                case -1349088399:
                    if (e.equals("custom")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3433178:
                    if (e.equals("pair")) {
                        c = 2;
                        break;
                    }
                    break;
                case 275734316:
                    if (e.equals("drawer_list")) {
                        c = 4;
                        break;
                    }
                    break;
                case 503245625:
                    if (e.equals("card_layout")) {
                        c = 1;
                        break;
                    }
                    break;
                case 756171503:
                    if (e.equals("order_list")) {
                        c = 0;
                        break;
                    }
                    break;
                case 778742897:
                    if (e.equals("bubble_list")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                aVar = new C2531q();
            } else if (c == 1) {
                aVar = new C2515i();
            } else if (c == 2) {
                aVar = new C2514h();
            } else if (c == 3) {
                aVar = new C2371b();
            } else if (c == 4) {
                aVar = new C2519j();
            } else if (c == 5) {
                aVar = new C2506d();
            } else {
                return;
            }
            this.f5114d = aVar;
            this.f5114d.fromJson(a);
        }
    }
}
