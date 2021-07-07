package com.p118pd.sdk;

import android.content.Context;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.pd.sdk.ooOOoo0o  reason: case insensitive filesystem */
public class C8991ooOOoo0o implements Interceptor {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22303OooO00o;

    public C8991ooOOoo0o(Context context) {
        this(context, C7088o00OO0o0.OooO0Oo);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url();
        if (!request.method().equals("GET") || !Boolean.parseBoolean(url.queryParameter("isCache")) || C9040ooOoOO.Oooo00o(this.f22303OooO00o)) {
            return chain.proceed(request);
        }
        Response.Builder removeHeader = chain.proceed(request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build()).newBuilder().removeHeader("Pragma").removeHeader("RetrofitCache-Control");
        return removeHeader.header("RetrofitCache-Control", "public,only-if-cached , max-stale=" + this.OooO00o).build();
    }

    public C8991ooOOoo0o(Context context, int i) {
        this.f22303OooO00o = context;
        this.OooO00o = i;
    }
}
