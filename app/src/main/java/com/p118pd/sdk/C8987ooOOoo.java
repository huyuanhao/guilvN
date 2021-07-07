package com.p118pd.sdk;

import android.content.Context;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.pd.sdk.ooOOoo  reason: case insensitive filesystem */
public class C8987ooOOoo implements Interceptor {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22260OooO00o;

    public C8987ooOOoo(Context context) {
        this(context, 300);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url();
        if (!request.method().equals("GET") || !Boolean.parseBoolean(url.queryParameter("isCache")) || !C9040ooOoOO.Oooo00o(this.f22260OooO00o)) {
            return chain.proceed(request);
        }
        Response.Builder removeHeader = chain.proceed(request).newBuilder().removeHeader("Pragma");
        return removeHeader.header("Cache-Control", "public, max-age=" + this.OooO00o).build();
    }

    public C8987ooOOoo(Context context, int i) {
        this.f22260OooO00o = context;
        this.OooO00o = i;
    }
}
