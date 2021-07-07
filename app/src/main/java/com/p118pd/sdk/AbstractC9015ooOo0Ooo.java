package com.p118pd.sdk;

import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Url;

/* renamed from: com.pd.sdk.ooOo0Ooo  reason: case insensitive filesystem */
public interface AbstractC9015ooOo0Ooo {
    @POST
    @Multipart
    C9349III<ResponseBody> OooO00o(@Url String str, @PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> list);

    @POST
    @Multipart
    C9349III<ResponseBody> OooO00o(@Url String str, @PartMap Map<String, RequestBody> map, @Part MultipartBody.Part part);
}
