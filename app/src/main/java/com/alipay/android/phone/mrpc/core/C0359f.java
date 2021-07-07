package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.f */
public final class C0359f implements ConnectionKeepAliveStrategy {

    /* renamed from: a */
    public final /* synthetic */ C0357d f798a;

    public C0359f(C0357d dVar) {
        this.f798a = dVar;
    }

    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000;
    }
}
