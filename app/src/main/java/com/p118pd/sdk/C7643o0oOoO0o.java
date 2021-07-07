package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.o0oOoO0o  reason: case insensitive filesystem */
public class C7643o0oOoO0o implements AbstractC7662o0oOooo0<InputStream>, Callback {
    public static final String o0ooOOo = "OkHttpFetcher";
    public AbstractC7662o0oOooo0.OooO00o<? super InputStream> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7764o0ooooo0 f20528OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f20529OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Call.Factory f20530OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Call f20531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ResponseBody f20532OooO00o;

    public C7643o0oOoO0o(Call.Factory factory, C7764o0ooooo0 o0ooooo0) {
        this.f20530OooO00o = factory;
        this.f20528OooO00o = o0ooooo0;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super InputStream> oooO00o) {
        Request.Builder url = new Request.Builder().url(this.f20528OooO00o.m19411OooO0O0());
        for (Map.Entry<String, String> entry : this.f20528OooO00o.m19410OooO00o().entrySet()) {
            url.addHeader(entry.getKey(), entry.getValue());
        }
        Request build = url.build();
        this.OooO00o = oooO00o;
        this.f20531OooO00o = this.f20530OooO00o.newCall(build);
        this.f20531OooO00o.enqueue(this);
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void cancel() {
        Call call = this.f20531OooO00o;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
        Log.isLoggable(o0ooOOo, 3);
        this.OooO00o.OooO00o((Exception) iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(@NonNull Call call, @NonNull Response response) {
        this.f20532OooO00o = response.body();
        if (response.isSuccessful()) {
            InputStream OooO00o2 = oO0O00.OooO00o(this.f20532OooO00o.byteStream(), ((ResponseBody) C7842oO0O0.OooO00o(this.f20532OooO00o)).contentLength());
            this.f20529OooO00o = OooO00o2;
            this.OooO00o.OooO00o(OooO00o2);
            return;
        }
        this.OooO00o.OooO00o((Exception) new HttpException(response.message(), response.code()));
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19290OooO00o() {
        try {
            if (this.f20529OooO00o != null) {
                this.f20529OooO00o.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f20532OooO00o;
        if (responseBody != null) {
            responseBody.close();
        }
        this.OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<InputStream> m19289OooO00o() {
        return InputStream.class;
    }

    /* Return type fixed from 'com.bumptech.glide.load.DataSource' to match base method */
    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    public Class<InputStream> OooO00o() {
        return DataSource.REMOTE;
    }
}
