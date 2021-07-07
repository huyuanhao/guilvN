package com.p118pd.sdk;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.rxhui.httpclient.exception.ApiException;
import com.rxhui.httpclient.response.HttpStatus;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* renamed from: com.pd.sdk.ooOo00oo  reason: case insensitive filesystem */
public class C9009ooOo00oo<T> implements Converter<ResponseBody, T> {
    public final Gson OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TypeAdapter<T> f22314OooO00o;

    public C9009ooOo00oo(Gson gson, TypeAdapter<T> typeAdapter) {
        this.OooO00o = gson;
        this.f22314OooO00o = typeAdapter;
    }

    /* renamed from: OooO00o */
    public T convert(ResponseBody responseBody) throws IOException {
        String string = responseBody.string();
        HttpStatus httpStatus = (HttpStatus) this.OooO00o.fromJson(string, (Class) HttpStatus.class);
        if (!httpStatus.isCodeInvalid()) {
            MediaType contentType = responseBody.contentType();
            try {
                return this.f22314OooO00o.read(this.OooO00o.newJsonReader(new InputStreamReader(new ByteArrayInputStream(string.getBytes()), contentType != null ? contentType.charset(Charset.forName("UTF-8")) : Charset.forName("UTF-8"))));
            } finally {
                responseBody.close();
            }
        } else {
            responseBody.close();
            throw new ApiException(string, httpStatus.getMessageBean().getCode(), httpStatus.getMessageBean().getMessage());
        }
    }
}
