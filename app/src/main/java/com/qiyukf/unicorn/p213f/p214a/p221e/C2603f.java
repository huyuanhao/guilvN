package com.qiyukf.unicorn.p213f.p214a.p221e;

import com.qiyukf.unicorn.p212e.AbstractC2471f;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;

/* renamed from: com.qiyukf.unicorn.f.a.e.f */
public final class C2603f implements AbstractC2471f, AbstractC2498a {
    @AbstractC2548a(mo35940a = "name")

    /* renamed from: a */
    public String f5306a;
    @AbstractC2548a(mo35940a = "id")

    /* renamed from: b */
    public long f5307b;
    @AbstractC2548a(mo35940a = "url")

    /* renamed from: c */
    public String f5308c;

    public C2603f(String str, long j) {
        this.f5306a = str;
        this.f5307b = j;
    }

    /* renamed from: a */
    public final long mo36148a() {
        return this.f5307b;
    }

    @Override // com.qiyukf.unicorn.p212e.AbstractC2471f
    public final String getIconUrl() {
        return this.f5308c;
    }

    @Override // com.qiyukf.unicorn.p212e.AbstractC2471f
    public final String getName() {
        return this.f5306a;
    }
}
