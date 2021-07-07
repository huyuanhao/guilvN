package com.qiyukf.unicorn.p213f.p214a.p222f;

import com.qiyukf.nimlib.C2180b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p232k.C2693a;
import okhttp3.internal.platform.AndroidPlatform;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = AndroidPlatform.MAX_LOG_LENGTH)
/* renamed from: com.qiyukf.unicorn.f.a.f.a */
public final class C2605a extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "appKey")

    /* renamed from: a */
    public String f5311a = C2180b.m4482g();
    @AbstractC2548a(mo35940a = "terminal")

    /* renamed from: b */
    public int f5312b = 1;
    @AbstractC2548a(mo35940a = "version")

    /* renamed from: c */
    public int f5313c;
    @AbstractC2548a(mo35940a = "sid")

    /* renamed from: d */
    public Long f5314d;
    @AbstractC2548a(mo35940a = "type")

    /* renamed from: e */
    public String f5315e;
    @AbstractC2548a(mo35940a = "prop")

    /* renamed from: f */
    public JSONObject f5316f;

    public C2605a() {
        if (C2180b.m4471a() != null) {
            this.f5313c = C2693a.m6235d(C2180b.m4471a());
        }
    }

    /* renamed from: a */
    public final void mo36150a(Long l) {
        this.f5314d = l;
    }

    /* renamed from: a */
    public final void mo36151a(String str) {
        this.f5315e = str;
    }

    /* renamed from: a */
    public final void mo36152a(JSONObject jSONObject) {
        this.f5316f = jSONObject;
    }
}
