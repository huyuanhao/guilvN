package com.p118pd.sdk;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.pd.sdk.ooOOo00O  reason: case insensitive filesystem */
public class C8965ooOOo00O implements Interceptor {
    public AbstractC8966ooOOo00o OooO00o;

    public C8965ooOOo00O(AbstractC8966ooOOo00o ooooo00o) {
        this.OooO00o = ooooo00o;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        return proceed.newBuilder().body(new C8967ooOOo0O(this.OooO00o, proceed.body())).build();
    }
}
