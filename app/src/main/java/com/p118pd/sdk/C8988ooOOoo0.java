package com.p118pd.sdk;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;

/* renamed from: com.pd.sdk.ooOOoo0  reason: case insensitive filesystem */
public class C8988ooOOoo0 {
    public static C8988ooOOoo0 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22261OooO00o = "OkHttpClientManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f22262OooO00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Protocol> f22263OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OkHttpClient f22264OooO00o;

    public C8988ooOOoo0() {
        ArrayList arrayList = new ArrayList();
        this.f22263OooO00o = arrayList;
        arrayList.add(Protocol.HTTP_1_1);
        try {
            this.f22264OooO00o = OooO0O0();
        } catch (Exception e) {
            if (e.getMessage() != null) {
                e.getMessage();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20655OooO00o() {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        System.setProperty("https.proxyPort", "");
        System.setProperty("https.proxyPort", "");
    }

    private OkHttpClient OooO0O0() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        boolean isDebuggerConnected = Debug.isDebuggerConnected();
        boolean OooO00o2 = C8973ooOOo0oo.OooO00o().m20638OooO00o();
        if (isDebuggerConnected || !OooO00o2) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, new TrustManager[]{new C8972ooOOo0oO()}, new SecureRandom());
                builder = builder.hostnameVerifier(new C8989ooOOoo00()).sslSocketFactory(instance.getSocketFactory());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (KeyManagementException e2) {
                e2.printStackTrace();
            }
        } else {
            m20655OooO00o();
        }
        return builder.connectTimeout(60000, TimeUnit.MILLISECONDS).readTimeout(60000, TimeUnit.MILLISECONDS).writeTimeout(60000, TimeUnit.MILLISECONDS).protocols(this.f22263OooO00o).build();
    }

    public static C8988ooOOoo0 OooO00o() {
        if (OooO00o == null) {
            synchronized (C8988ooOOoo0.class) {
                OooO00o = new C8988ooOOoo0();
            }
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Handler m20656OooO00o() {
        return this.f22262OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OkHttpClient m20657OooO00o() {
        return this.f22264OooO00o;
    }

    public Call OooO00o(String str, Map<String, String> map, Object obj) {
        if (this.f22264OooO00o == null) {
            return null;
        }
        return this.f22264OooO00o.newCall(new Request.Builder().get().url(OooO00o(str, map)).addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8").tag(obj).build());
    }

    public Call OooO0O0(String str, Map<String, String> map, Object obj) {
        if (this.f22264OooO00o == null) {
            return null;
        }
        return this.f22264OooO00o.newBuilder().retryOnConnectionFailure(false).build().newCall(new Request.Builder().url(str).post(OooO00o(map)).addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8").tag(obj).build());
    }

    private String OooO00o(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        if (map != null && !map.isEmpty()) {
            if (sb.indexOf(C8932ooOOO0o.f22176OooO00o) < 0) {
                sb.append(C8932ooOOO0o.f22176OooO00o);
            }
            for (String str2 : map.keySet()) {
                sb.append("&");
                sb.append(str2);
                sb.append(C8932ooOOO0o.OooO0Oo);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    private FormBody OooO00o(Map<String, String> map) {
        FormBody.Builder builder = new FormBody.Builder();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.add(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    public void OooO00o(Object obj) {
        for (Call call : this.f22264OooO00o.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : this.f22264OooO00o.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }
}
