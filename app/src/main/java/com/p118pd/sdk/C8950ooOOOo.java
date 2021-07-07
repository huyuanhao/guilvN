package com.p118pd.sdk;

import android.content.Context;
import com.p118pd.sdk.C8941ooOOOOO0;
import com.p118pd.sdk.C9349III;
import com.rxhui.common.download.downloadinfo.DownState;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: com.pd.sdk.ooOOOo  reason: case insensitive filesystem */
public class C8950ooOOOo {
    public final C9349III.OooO0OO<ResponseBody, ResponseBody> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HashMap<String, C8971ooOOo0o0> f22212OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set<C8964ooOOo000> f22213OooO00o;

    /* renamed from: com.pd.sdk.ooOOOo$OooO00o */
    public class OooO00o implements C9349III.OooO0OO<ResponseBody, ResponseBody> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public C9349III<ResponseBody> call(C9349III<ResponseBody> r2) {
            return r2.OooO0OO(C6261iii1I1.OooO0OO()).OooO0o(C6261iii1I1.OooO0OO()).OooOoO0(new C8959ooOOOoo()).m21402OooO00o(C6342il11.OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.ooOOOo$OooO0O0 */
    public class OooO0O0 implements AbstractC9847l1<ResponseBody, C8964ooOOo000> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C8964ooOOo000 f22214OooO00o;

        public OooO0O0(C8964ooOOo000 ooooo000) {
            this.f22214OooO00o = ooooo000;
        }

        /* renamed from: OooO00o */
        public C8964ooOOo000 call(ResponseBody responseBody) {
            return C8950ooOOOo.this.OooO00o((C8950ooOOOo) responseBody, (ResponseBody) this.f22214OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.ooOOOo$OooO0OO */
    public static class OooO0OO {
        public static final C8950ooOOOo OooO00o = new C8950ooOOOo(null);
    }

    public /* synthetic */ C8950ooOOOo(OooO00o oooO00o) {
        this();
    }

    public void OooO0O0() {
        for (C8964ooOOo000 ooooo000 : this.f22213OooO00o) {
            OooO0Oo(ooooo000);
        }
        this.f22212OooO00o.clear();
        this.f22213OooO00o.clear();
    }

    public void OooO0OO(C8964ooOOo000 ooooo000) {
        C8971ooOOo0o0 ooooo0o0 = this.f22212OooO00o.get(ooooo000.m20633OooO0O0());
        if (ooooo000 == null || ooooo0o0 != null) {
            ooooo0o0.OooO00o(ooooo000);
            return;
        }
        C8971ooOOo0o0 ooooo0o02 = new C8971ooOOo0o0(ooooo000);
        this.f22212OooO00o.put(ooooo000.m20633OooO0O0(), ooooo0o02);
        OooO00o(ooooo000, ooooo0o02).OooO00o(ooooo000.m20633OooO0O0()).OooO00o((C9349III.OooO0OO<? super ResponseBody, ? extends R>) this.OooO00o).OooOOoo(new OooO0O0(ooooo000)).OooO00o((AbstractC9508LiLi<? super R>) ooooo0o02);
    }

    public void OooO0Oo(C8964ooOOo000 ooooo000) {
        if (ooooo000 != null) {
            ooooo000.m20629OooO00o().OooO0Oo();
            ooooo000.OooO00o(DownState.STOP);
            if (this.f22212OooO00o.containsKey(ooooo000.m20633OooO0O0())) {
                this.f22212OooO00o.get(ooooo000.m20633OooO0O0()).unsubscribe();
                this.f22212OooO00o.remove(ooooo000.m20633OooO0O0());
            }
        }
    }

    public C8950ooOOOo() {
        this.OooO00o = new OooO00o();
    }

    public static C8950ooOOOo OooO00o() {
        return OooO0OO.OooO00o;
    }

    public C8950ooOOOo OooO00o(Context context) {
        this.f22213OooO00o = new HashSet();
        this.f22212OooO00o = new HashMap<>();
        return this;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private C8964ooOOo000 OooO00o(ResponseBody responseBody, C8964ooOOo000 ooooo000) {
        try {
            ooooo000.OooO00o(ooooo000.m20627OooO00o().m20610OooO00o() + File.separator + C9045ooOoOO0o.OooO0O0(ooooo000.m20633OooO0O0()) + ".0");
            C8941ooOOOOO0.OooO0OO OooO00o2 = ooooo000.m20627OooO00o().OooO00o(ooooo000.m20633OooO0O0());
            if (OooO00o2 != null) {
                if (C8970ooOOo0o.OooO00o(responseBody, OooO00o2.m20606OooO00o(0))) {
                    OooO00o2.OooO0OO();
                } else {
                    OooO00o2.OooO00o();
                }
            }
            ooooo000.m20627OooO00o().OooO0OO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ooooo000;
    }

    public void OooO0O0(C8964ooOOo000 ooooo000) {
        this.f22212OooO00o.remove(ooooo000.m20633OooO0O0());
        this.f22213OooO00o.remove(ooooo000);
    }

    private AbstractC8952ooOOOoO OooO00o(C8964ooOOo000 ooooo000, C8971ooOOo0o0 ooooo0o0) {
        if (this.f22213OooO00o.contains(ooooo000)) {
            return ooooo000.m20628OooO00o();
        }
        AbstractC8952ooOOOoO ooooooo = (AbstractC8952ooOOOoO) new Retrofit.Builder().client(new OkHttpClient.Builder().connectTimeout((long) ooooo000.OooO00o(), TimeUnit.SECONDS).addInterceptor(new C8965ooOOo00O(ooooo0o0)).build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).baseUrl(C8970ooOOo0o.OooO00o(ooooo000.m20633OooO0O0())).build().create(AbstractC8952ooOOOoO.class);
        ooooo000.OooO00o(ooooooo);
        ooooo000.OooO00o(DownState.START);
        this.f22213OooO00o.add(ooooo000);
        return ooooooo;
    }

    public void OooO00o(C8964ooOOo000 ooooo000) {
        if (ooooo000 != null) {
            ooooo000.OooO00o(DownState.PAUSE);
            ooooo000.m20629OooO00o().OooO0O0();
            if (this.f22212OooO00o.containsKey(ooooo000.m20633OooO0O0())) {
                this.f22212OooO00o.get(ooooo000.m20633OooO0O0()).unsubscribe();
                this.f22212OooO00o.remove(ooooo000.m20633OooO0O0());
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20623OooO00o() {
        for (C8964ooOOo000 ooooo000 : this.f22213OooO00o) {
            OooO00o(ooooo000);
        }
        this.f22212OooO00o.clear();
        this.f22213OooO00o.clear();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<C8964ooOOo000> m20622OooO00o() {
        return this.f22213OooO00o;
    }
}
