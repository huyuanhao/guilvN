package com.p118pd.sdk;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http2.Http2Codec;

/* renamed from: com.pd.sdk.ooOo0O00  reason: case insensitive filesystem */
public class C9010ooOo0O00 implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8").addHeader("Connection", Http2Codec.KEEP_ALIVE).build());
    }
}
