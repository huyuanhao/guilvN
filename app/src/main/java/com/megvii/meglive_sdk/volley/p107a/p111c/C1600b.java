package com.megvii.meglive_sdk.volley.p107a.p111c;

import java.io.InputStream;

/* renamed from: com.megvii.meglive_sdk.volley.a.c.b */
public final class C1600b extends AbstractC1599a {

    /* renamed from: d */
    public InputStream f2827d;

    /* renamed from: e */
    public long f2828e = -1;

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1596b
    /* renamed from: a */
    public final long mo17300a() {
        return this.f2828e;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1596b
    /* renamed from: b */
    public final InputStream mo17301b() {
        if (this.f2827d != null) {
            return this.f2827d;
        }
        throw new IllegalStateException("Content has not been provided");
    }
}
