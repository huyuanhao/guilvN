package com.p118pd.sdk;

import com.facebook.react.modules.network.NetworkInterceptorCreator;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.oo0OoOo  reason: case insensitive filesystem */
public class C8673oo0OoOo implements NetworkInterceptorCreator {

    /* renamed from: com.pd.sdk.oo0OoOo$OooO00o */
    public static class OooO00o implements Interceptor {
        private Request OooO00o(Request request) {
            HttpUrl url = request.url();
            String host = url.url().getHost();
            HttpUrl.Builder newBuilder = url.newBuilder();
            HashMap hashMap = new HashMap();
            boolean z = false;
            for (int i = 0; i < url.querySize(); i++) {
                hashMap.put(url.queryParameterName(i), url.queryParameterValue(i));
                newBuilder.removeAllQueryParameters(url.queryParameterName(i));
            }
            AbstractC8672oo0OoOOo OooO00o = C8654oo0Oo00.OooO00o().m20276OooO00o();
            if (OooO00o != null) {
                z = OooO00o.OooO00o(host, url.url().getPath(), url.url().getQuery(), hashMap, newBuilder);
            }
            C8675oo0OoOoO.OooO00o(z, hashMap, newBuilder);
            return request.newBuilder().url(newBuilder.build()).build();
        }

        private Request OooO0O0(Request request) {
            String str;
            String str2 = "";
            try {
                String host = request.url().url().getHost();
                String path = request.url().url().getPath();
                AbstractC8672oo0OoOOo OooO00o = C8654oo0Oo00.OooO00o().m20276OooO00o();
                if (OooO00o != null) {
                    RequestBody body = request.body();
                    RequestBody OooO00o2 = ((C8674oo0OoOo0) body).OooO00o();
                    if (OooO00o2 instanceof MultipartBody) {
                        HashMap hashMap = new HashMap();
                        List<MultipartBody.Part> parts = ((MultipartBody) OooO00o2).parts();
                        int i = 0;
                        String str3 = null;
                        String str4 = null;
                        RequestBody requestBody = null;
                        int i2 = 0;
                        while (i2 < parts.size()) {
                            MultipartBody.Part part = parts.get(i2);
                            RequestBody body2 = part.body();
                            Headers headers = part.headers();
                            if (headers == null || headers.size() <= 0) {
                                str = str2;
                            } else {
                                String[] split = headers.value(i).replace(" ", str2).replace("\"", str2).split(C7522o0Ooo0o.OooO0O0);
                                str = str2;
                                if (split.length == 2) {
                                    String[] split2 = split[1].split(C8932ooOOO0o.OooO0Oo);
                                    if (split2.length > 1 && body2.contentLength() < 1024) {
                                        String str5 = split2[1];
                                        OOOO000 oooo000 = new OOOO000();
                                        body2.writeTo(oooo000);
                                        hashMap.put(str5, oooo000.m16606OooO0O0());
                                    }
                                } else if (split.length == 3) {
                                    String[] split3 = split[1].split(C8932ooOOO0o.OooO0Oo);
                                    String[] split4 = split[2].split(C8932ooOOO0o.OooO0Oo);
                                    if (split3.length > 1) {
                                        str3 = split3[1];
                                    }
                                    if (split4.length > 1) {
                                        str4 = split4[1];
                                    }
                                    requestBody = body2;
                                }
                            }
                            i2++;
                            str2 = str;
                            i = 0;
                        }
                        MultipartBody.Builder builder = new MultipartBody.Builder();
                        builder.addFormDataPart(str3, str4, requestBody);
                        return C8675oo0OoOoO.OooO00o(OooO00o.OooO00o(host, path, hashMap, builder), request, builder);
                    }
                    FormBody.Builder builder2 = new FormBody.Builder();
                    OOOO000 oooo0002 = new OOOO000();
                    try {
                        body.writeTo(oooo0002);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Charset forName = Charset.forName("UTF-8");
                    MediaType contentType = body.contentType();
                    if (contentType != null) {
                        forName = contentType.charset(Charset.forName("UTF-8"));
                    }
                    return C8675oo0OoOoO.OooO00o(OooO00o.OooO0OO(host, path, oooo0002.OooO00o(forName), builder2), request, builder2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return request;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            String host = request.url().url().getHost();
            boolean OooO00o = C8654oo0Oo00.OooO00o().m20278OooO00o(host);
            if (OooO00o) {
                if (request.method().equals("GET")) {
                    request = OooO00o(request);
                } else if (request.method().equals("POST")) {
                    request = OooO0O0(request);
                }
            }
            try {
                Response proceed = chain.proceed(request);
                if (!OooO00o) {
                    return proceed;
                }
                MediaType contentType = proceed.body().contentType();
                String str = null;
                if (!(proceed == null || proceed.body() == null)) {
                    str = proceed.body().string();
                    AbstractC8672oo0OoOOo OooO00o2 = C8654oo0Oo00.OooO00o().m20276OooO00o();
                    if (OooO00o2 != null) {
                        str = OooO00o2.OooO0OO(host, request.url().url().getPath(), str);
                    }
                }
                return proceed.newBuilder().body(ResponseBody.create(contentType, str)).build();
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                hashMap.put("error", e.toString());
                LogCollectorManager.sharedInstance().recordWarn("rn_interceptor_error", hashMap);
                e.printStackTrace();
                throw new IOException("rn_interceptor_error e=" + e.toString());
            }
        }
    }

    @Override // com.facebook.react.modules.network.NetworkInterceptorCreator
    public Interceptor create() {
        return new OooO00o();
    }
}
