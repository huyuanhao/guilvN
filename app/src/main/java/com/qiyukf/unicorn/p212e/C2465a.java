package com.qiyukf.unicorn.p212e;

import com.p118pd.sdk.C7516o0Ooo000;
import com.qiyukf.basesdk.p138c.C1810b;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.e.a */
public final class C2465a implements Serializable {

    /* renamed from: a */
    public String f4852a;

    /* renamed from: b */
    public String f4853b;

    /* renamed from: c */
    public String f4854c;

    /* renamed from: d */
    public boolean f4855d;

    /* renamed from: e */
    public boolean f4856e;

    /* renamed from: a */
    public final String mo35685a() {
        return this.f4853b;
    }

    /* renamed from: a */
    public final void mo35686a(String str) {
        JSONObject f;
        JSONObject a = C1810b.m3420a(str);
        if (a.has(C7516o0Ooo000.OooOO0o) && (f = C1810b.m3433f(a, C7516o0Ooo000.OooOO0o)) != null) {
            this.f4852a = C1810b.m3432e(f, "inputSwitch");
            this.f4853b = C1810b.m3432e(f, "staffReadSwitch");
            this.f4854c = C1810b.m3432e(f, "sendingRate");
            this.f4855d = C1810b.m3426a(f, "session_transfer_switch");
            this.f4856e = C1810b.m3426a(f, "session_transfer_robot_switch");
        }
    }

    /* renamed from: b */
    public final boolean mo35687b() {
        return this.f4855d;
    }

    /* renamed from: c */
    public final boolean mo35688c() {
        return this.f4856e;
    }
}
