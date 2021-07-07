package com.alipay.android.phone.mrpc.core;

import com.alipay.android.phone.mrpc.core.C0353b;
import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.d */
public final class C0357d extends DefaultHttpClient {

    /* renamed from: a */
    public final /* synthetic */ C0353b f795a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0357d(C0353b bVar, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        this.f795a = bVar;
    }

    public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new C0359f(this);
    }

    public final HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    public final BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = C0357d.super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(C0353b.m657a());
        createHttpProcessor.addRequestInterceptor(new C0353b.C0354a(this.f795a, (byte) 0));
        return createHttpProcessor;
    }

    public final RedirectHandler createRedirectHandler() {
        return new C0358e(this);
    }
}
