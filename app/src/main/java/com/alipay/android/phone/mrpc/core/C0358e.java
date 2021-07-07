package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.e */
public final class C0358e extends DefaultRedirectHandler {

    /* renamed from: a */
    public int f796a;

    /* renamed from: b */
    public final /* synthetic */ C0357d f797b;

    public C0358e(C0357d dVar) {
        this.f797b = dVar;
    }

    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        int statusCode;
        this.f796a++;
        boolean isRedirectRequested = C0358e.super.isRedirectRequested(httpResponse, httpContext);
        if (isRedirectRequested || this.f796a >= 5 || ((statusCode = httpResponse.getStatusLine().getStatusCode()) != 301 && statusCode != 302)) {
            return isRedirectRequested;
        }
        return true;
    }
}
