package com.p118pd.sdk;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* renamed from: com.pd.sdk.ooOo00oO  reason: case insensitive filesystem */
public class C9008ooOo00oO<T> implements Converter<T, RequestBody> {
    public static final Charset OooO00o = Charset.forName("UTF-8");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final MediaType f22311OooO00o = MediaType.parse("application/json; charset=UTF-8");

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Gson f22312OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TypeAdapter<T> f22313OooO00o;

    public C9008ooOo00oO(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f22312OooO00o = gson;
        this.f22313OooO00o = typeAdapter;
    }

    /* renamed from: OooO00o */
    public RequestBody convert(T t) throws IOException {
        OOOO000 oooo000 = new OOOO000();
        JsonWriter newJsonWriter = this.f22312OooO00o.newJsonWriter(new OutputStreamWriter(oooo000.m16592OooO00o(), OooO00o));
        this.f22313OooO00o.write(newJsonWriter, t);
        newJsonWriter.close();
        return RequestBody.create(f22311OooO00o, oooo000.m16595OooO00o());
    }
}
