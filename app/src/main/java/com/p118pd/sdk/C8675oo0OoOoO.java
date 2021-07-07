package com.p118pd.sdk;

import java.net.URLEncoder;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.Request;

/* renamed from: com.pd.sdk.oo0OoOoO  reason: case insensitive filesystem */
public class C8675oo0OoOoO {
    public static String OooO00o = "{";

    public static HttpUrl.Builder OooO00o(boolean z, Map<String, String> map, HttpUrl.Builder builder) {
        if (!z) {
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.contains(OooO00o)) {
                    builder.addEncodedQueryParameter(str, URLEncoder.encode(map.get(str)));
                } else {
                    builder.addQueryParameter(str, str2);
                }
            }
        }
        return builder;
    }

    public static Request OooO00o(boolean z, Request request, FormBody.Builder builder) {
        return z ? request.newBuilder().post(builder.build()).build() : request;
    }

    public static Request OooO00o(boolean z, Request request, MultipartBody.Builder builder) {
        if (!z) {
            return request;
        }
        builder.setType(MultipartBody.FORM);
        return request.newBuilder().post(builder.build()).build();
    }
}
