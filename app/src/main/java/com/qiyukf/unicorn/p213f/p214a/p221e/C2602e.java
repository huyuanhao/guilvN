package com.qiyukf.unicorn.p213f.p214a.p221e;

import com.qiyukf.unicorn.p212e.AbstractC2471f;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;

/* renamed from: com.qiyukf.unicorn.f.a.e.e */
public final class C2602e implements AbstractC2471f, AbstractC2498a {
    @AbstractC2548a(mo35940a = "name")

    /* renamed from: a */
    public String f5304a;
    @AbstractC2548a(mo35940a = "url")

    /* renamed from: b */
    public String f5305b;

    public C2602e(String str, String str2) {
        this.f5304a = str2;
        this.f5305b = str;
    }

    /* renamed from: a */
    public final String mo36147a() {
        return this.f5305b;
    }

    @Override // com.qiyukf.unicorn.p212e.AbstractC2471f
    public final String getIconUrl() {
        return null;
    }

    @Override // com.qiyukf.unicorn.p212e.AbstractC2471f
    public final String getName() {
        return this.f5304a;
    }
}
