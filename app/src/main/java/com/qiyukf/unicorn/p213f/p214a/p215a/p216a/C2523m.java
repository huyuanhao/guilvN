package com.qiyukf.unicorn.p213f.p214a.p215a.p216a;

import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.AbstractC2375a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2553a;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;
import java.util.List;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "horizontal_sliding_label")
/* renamed from: com.qiyukf.unicorn.f.a.a.a.m */
public class C2523m extends AbstractC2375a {

    /* renamed from: a */
    public transient JSONObject f5048a;
    @AbstractC2548a(mo35940a = "action")

    /* renamed from: b */
    public C2553a f5049b;
    @AbstractC2548a(mo35940a = C8412oOoo0OoO.OooO0OO)

    /* renamed from: c */
    public List<C2554b> f5050c;

    /* renamed from: d */
    public boolean f5051d = false;

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        this.f5048a = jSONObject;
    }

    /* renamed from: c */
    public final JSONObject mo35852c() {
        JSONObject jSONObject = this.f5048a;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C1810b.m3425a(jSONObject, "id", mo35277b());
        return jSONObject;
    }

    /* renamed from: d */
    public final boolean mo35853d() {
        return this.f5051d;
    }

    /* renamed from: e */
    public final void mo35854e() {
        this.f5051d = true;
    }

    /* renamed from: f */
    public final List<C2554b> mo35855f() {
        return this.f5050c;
    }

    /* renamed from: g */
    public final C2553a mo35856g() {
        return this.f5049b;
    }
}
