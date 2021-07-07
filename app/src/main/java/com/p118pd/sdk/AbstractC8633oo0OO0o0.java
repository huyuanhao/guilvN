package com.p118pd.sdk;

import com.jinhui365.hotsources.bean.HotSourceVO;
import com.rxhui.httpclient.response.HttpStatus;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* renamed from: com.pd.sdk.oo0OO0o0  reason: case insensitive filesystem */
public interface AbstractC8633oo0OO0o0 {
    @GET("dynamic/hotUpdate")
    C9349III<HttpStatus<List<HotSourceVO>>> OooO00o(@Query("category") String str);
}
