package com.p118pd.sdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.p118pd.sdk.C8673oo0OoOo;
import okhttp3.OkHttpClient;

/* renamed from: com.pd.sdk.oo0o0oO  reason: case insensitive filesystem */
public class C8719oo0o0oO implements AbstractC8671oo0OoOOO {
    @Override // com.p118pd.sdk.AbstractC8671oo0OoOOO
    public void OooO00o(ReactApplicationContext reactApplicationContext, OkHttpClient.Builder builder) {
        builder.retryOnConnectionFailure(true).addInterceptor(new C8673oo0OoOo.OooO00o());
    }
}
