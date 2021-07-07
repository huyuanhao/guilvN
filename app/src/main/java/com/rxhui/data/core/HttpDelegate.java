package com.rxhui.data.core;

import android.content.Context;
import com.p118pd.sdk.AbstractC8962ooOOo;
import com.p118pd.sdk.AbstractC8983ooOOoOo;
import com.p118pd.sdk.C8973ooOOo0oo;
import com.p118pd.sdk.C8988ooOOoo0;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONObject;
import org.json.JSONTokener;

public class HttpDelegate {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Context f23505OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC8962ooOOo f23506OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23507OooO00o = "HttpDelegate";
    public static final int OooO0O0 = -2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f23508OooO0O0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8983ooOOoOo f23509OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8988ooOOoo0 f23510OooO00o = C8988ooOOoo0.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f23511OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Call f23512OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HttpResponse f23513OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HttpUriRequest f23514OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public JSONObject f23515OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23516OooO00o;

    public enum HttpMethod {
        GET,
        POST,
        DELETE,
        PUT
    }

    public class OooO00o implements Callback {
        public OooO00o() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            HttpDelegate httpDelegate = HttpDelegate.this;
            httpDelegate.OooO00o((HttpDelegate) -1, (int) null, (Object) 0, (long) httpDelegate.f23511OooO00o);
            HttpDelegate.this.f23515OooO00o = null;
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (response == null) {
                HttpDelegate.this.OooO00o((HttpDelegate) -2, (int) response, (Object) (response.receivedResponseAtMillis() - response.sentRequestAtMillis()), (long) HttpDelegate.this.f23511OooO00o);
            } else if (response.isSuccessful()) {
                try {
                    JSONTokener jSONTokener = new JSONTokener(response.body().string());
                    HttpDelegate.this.f23515OooO00o = (JSONObject) jSONTokener.nextValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    HttpDelegate.this.f23515OooO00o = null;
                }
                boolean z = true;
                if (C8973ooOOo0oo.OooO00o().m20634OooO00o() != null) {
                    z = C8973ooOOo0oo.OooO00o().m20634OooO00o().OooO00o(HttpDelegate.this.f23515OooO00o);
                }
                if (z) {
                    HttpDelegate httpDelegate = HttpDelegate.this;
                    if (httpDelegate.f23509OooO00o == null) {
                        return;
                    }
                    if (httpDelegate.f23515OooO00o != null) {
                        HttpDelegate.this.OooO00o((HttpDelegate) response.code(), (int) (response.receivedResponseAtMillis() - response.sentRequestAtMillis()), (long) HttpDelegate.this.f23515OooO00o, (Object) HttpDelegate.this.f23511OooO00o);
                    } else {
                        HttpDelegate.this.OooO00o((HttpDelegate) response.code(), (int) response, (Object) (response.receivedResponseAtMillis() - response.sentRequestAtMillis()), (long) HttpDelegate.this.f23511OooO00o);
                    }
                }
            } else {
                HttpDelegate.this.OooO00o((HttpDelegate) response.code(), (int) response, (Object) (response.receivedResponseAtMillis() - response.sentRequestAtMillis()), (long) HttpDelegate.this.f23511OooO00o);
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f23517OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Map f23518OooO00o;

        public OooO0O0(Object obj, Map map) {
            this.f23517OooO00o = obj;
            this.f23518OooO00o = map;
        }

        public void run() {
            HttpDelegate.this.f23509OooO00o.OooO0O0(this.f23517OooO00o, this.f23518OooO00o);
        }
    }

    public class OooO0OO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f23519OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Map f23520OooO00o;

        public OooO0OO(Object obj, Map map) {
            this.f23519OooO00o = obj;
            this.f23520OooO00o = map;
        }

        public void run() {
            AbstractC8983ooOOoOo ooooooo = HttpDelegate.this.f23509OooO00o;
            if (ooooooo != null) {
                ooooooo.OooO00o(this.f23519OooO00o, this.f23520OooO00o);
            }
        }
    }

    public void OooO0O0() {
        Call call = this.f23512OooO00o;
        if (call != null) {
            try {
                call.enqueue(new OooO00o());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void OooO00o(Context context) {
        f23505OooO00o = context;
    }

    public static void OooO00o(AbstractC8962ooOOo ooooo) {
        f23506OooO00o = ooooo;
    }

    public static String OooO00o() {
        Context context;
        if (f23508OooO0O0 == null && (context = f23505OooO00o) != null) {
            try {
                f23508OooO0O0 = context.getPackageManager().getPackageInfo(f23505OooO00o.getPackageName(), 0).versionName;
            } catch (Exception e) {
                e.getMessage();
                return f23508OooO0O0;
            }
        }
        return f23508OooO0O0;
    }

    public HttpUriRequest OooO00o(String str, Map<String, String> map, HttpMethod httpMethod) {
        if (C8973ooOOo0oo.OooO00o().m20635OooO00o() != null) {
            map = C8973ooOOo0oo.OooO00o().m20635OooO00o().OooO00o(map);
        }
        this.f23511OooO00o = map;
        if (HttpMethod.POST.equals(httpMethod)) {
            this.f23516OooO00o = false;
            this.f23512OooO00o = this.f23510OooO00o.OooO0O0(str, map, this);
        }
        if (!HttpMethod.GET.equals(httpMethod)) {
            return null;
        }
        this.f23516OooO00o = true;
        this.f23512OooO00o = this.f23510OooO00o.OooO00o(str, map, this);
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(int i, long j, Object obj, Map<String, String> map) {
        this.f23510OooO00o.m20656OooO00o().post(new OooO0O0(obj, map));
        AbstractC8962ooOOo ooooo = f23506OooO00o;
        if (ooooo != null) {
            ooooo.OooO00o(this.f23512OooO00o.request().method(), this.f23511OooO00o, j, i, this.f23512OooO00o.request().url().toString(), obj.toString());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(int i, Object obj, long j, Map<String, String> map) {
        Call call;
        if (!this.f23516OooO00o && (call = this.f23512OooO00o) != null && call.isExecuted()) {
            this.f23512OooO00o.cancel();
        }
        this.f23510OooO00o.m20656OooO00o().post(new OooO0OO(obj, map));
        AbstractC8962ooOOo ooooo = f23506OooO00o;
        if (ooooo != null) {
            String method = this.f23512OooO00o.request().method();
            Map<String, String> map2 = this.f23511OooO00o;
            String httpUrl = this.f23512OooO00o.request().url().toString();
            JSONObject jSONObject = this.f23515OooO00o;
            ooooo.OooO00o(method, map2, j, i, httpUrl, jSONObject == null ? null : jSONObject.toString());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21961OooO00o() {
        Call call = this.f23512OooO00o;
        if (call != null && call.isExecuted()) {
            this.f23510OooO00o.OooO00o(this);
        }
    }
}
