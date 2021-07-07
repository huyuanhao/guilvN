package com.p118pd.sdk;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: com.pd.sdk.ooOo00  reason: case insensitive filesystem */
public class C9000ooOo00 extends Converter.Factory {
    public final Gson OooO00o;

    public C9000ooOo00(Gson gson) {
        if (gson != null) {
            this.OooO00o = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    public static C9000ooOo00 OooO00o() {
        return OooO00o(C8998ooOo0.OooO00o());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new C9008ooOo00oO(this.OooO00o, this.OooO00o.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new C9009ooOo00oo(this.OooO00o, this.OooO00o.getAdapter(TypeToken.get(type)));
    }

    public static C9000ooOo00 OooO00o(Gson gson) {
        return new C9000ooOo00(gson);
    }
}
