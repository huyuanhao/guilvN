package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.jinhui365.router.core.InterceptorState;
import com.jinhui365.router.task.ActivityTask;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0o0O00  reason: case insensitive filesystem */
public class C8703oo0o0O00 {
    public static final C8703oo0o0O00 OooO00o = new C8703oo0o0O00();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21859OooO00o = "RouteManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8695oo0o00O0 f21860OooO00o = new C8689oo0o00();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8698oo0o00o f21861OooO00o = new ActivityTask();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8700oo0o00oo f21862OooO00o;
    public C8700oo0o00oo OooO0O0;

    public void OooO00o(C8700oo0o00oo oo0o00oo) {
        this.OooO0O0 = oo0o00oo;
    }

    public C8700oo0o00oo OooO0O0() {
        return this.f21862OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8700oo0o00oo m20321OooO00o() {
        return this.OooO0O0;
    }

    public void OooO0O0(C8700oo0o00oo oo0o00oo) {
        this.f21862OooO00o = oo0o00oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8695oo0o00O0 m20319OooO00o() {
        return this.f21860OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8698oo0o00o m20320OooO00o() {
        return this.f21861OooO00o;
    }

    public static C8703oo0o0O00 OooO00o() {
        return OooO00o;
    }

    public void OooO00o(String str, AbstractC8695oo0o00O0 oo0o00o0, AbstractC8698oo0o00o oo0o00o) throws JSONException, ClassNotFoundException {
        if (oo0o00o0 != null) {
            this.f21860OooO00o = oo0o00o0;
        }
        if (oo0o00o != null) {
            this.f21861OooO00o = oo0o00o;
        }
        C8693oo0o000o.OooO00o().m20309OooO00o(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20323OooO00o(String str) throws JSONException, ClassNotFoundException {
        C8693oo0o000o.OooO00o().OooO0O0(str);
    }

    public C8688oo0o0 OooO00o(String str) {
        return OooO00o(str == null ? null : Uri.parse(str));
    }

    public C8688oo0o0 OooO00o(Uri uri) {
        return new C8688oo0o0().OooO00o(uri);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20322OooO00o() {
        C8700oo0o00oo oo0o00oo = this.OooO0O0;
        if (oo0o00oo != null) {
            if (oo0o00oo.m20313OooO00o() != null) {
                this.OooO0O0.m20313OooO00o().m20315OooO00o();
            } else {
                this.OooO0O0.m20315OooO00o();
            }
        }
    }

    public void OooO00o(InterceptorState interceptorState) {
        OooO00o(interceptorState, "", "");
    }

    public void OooO00o(InterceptorState interceptorState, String str) throws JSONException {
        OooO00o(interceptorState, C8701oo0o0O.OooO00o(new JSONObject(str)));
    }

    public void OooO00o(InterceptorState interceptorState, String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        OooO00o(interceptorState, hashMap);
    }

    public void OooO00o(InterceptorState interceptorState, Map<String, Object> map) {
        C8700oo0o00oo oo0o00oo = this.OooO0O0;
        if (oo0o00oo != null) {
            if (oo0o00oo.m20313OooO00o() != null) {
                this.OooO0O0.m20313OooO00o().OooO00o(interceptorState, map);
            } else {
                this.OooO0O0.OooO00o(interceptorState, map);
            }
        }
    }

    public void OooO00o(Context context) {
        OooO00o(context, "", "");
    }

    public void OooO00o(Context context, String str) throws JSONException {
        OooO00o(context, C8701oo0o0O.OooO00o(new JSONObject(str)));
    }

    public void OooO00o(Context context, String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        OooO00o(context, hashMap);
    }

    public void OooO00o(Context context, Map<String, Object> map) {
        C8700oo0o00oo oo0o00oo;
        C8700oo0o00oo oo0o00oo2 = this.OooO0O0;
        if (oo0o00oo2 != null) {
            if (oo0o00oo2.m20313OooO00o() != null) {
                oo0o00oo = this.OooO0O0.m20313OooO00o();
            } else {
                oo0o00oo = this.OooO0O0;
            }
            if (oo0o00oo.m20310OooO00o() instanceof Activity) {
                Intent intent = new Intent(context, ((Activity) oo0o00oo.m20310OooO00o()).getClass());
                Bundle bundle = new Bundle();
                if (map != null && !map.isEmpty()) {
                    for (String str : map.keySet()) {
                        bundle.putAll(C8701oo0o0O.OooO00o(bundle, str, map.get(str)));
                    }
                }
                intent.addFlags(603979776);
                context.startActivity(intent);
            }
        }
    }

    public String OooO00o(Activity activity) {
        if (activity == null) {
            return "";
        }
        Intent intent = activity.getIntent();
        if (intent.hasExtra(C8713oo0o0o.f21884OooO00o)) {
            return intent.getStringExtra(C8713oo0o0o.f21884OooO00o);
        }
        return "";
    }
}
