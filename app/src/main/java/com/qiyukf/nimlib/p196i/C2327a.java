package com.qiyukf.nimlib.p196i;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.p118pd.sdk.C7533o0OoooO0;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.p118pd.sdk.C8775oo0ooo0;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.C1847c;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p162c.p163a.C2134b;
import com.qiyukf.nimlib.p176b.C2185c;
import com.qiyukf.nimlib.p196i.p197a.C2331a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nimlib.i.a */
public final class C2327a {

    /* renamed from: a */
    public Handler f4667a;

    /* renamed from: com.qiyukf.nimlib.i.a$a */
    public static class C2330a {

        /* renamed from: a */
        public static final C2327a f4673a = new C2327a((byte) 0);
    }

    public C2327a() {
        this.f4667a = C1805a.m3403a().mo34072a(C8775oo0ooo0.OooO0O0);
    }

    public /* synthetic */ C2327a(byte b) {
        this();
    }

    /* renamed from: a */
    public static C2327a m5058a() {
        return C2330a.f4673a;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5059a(Context context, boolean z) {
        String str;
        C2331a.C2333a a = C2331a.m5065a(context);
        StringBuilder sb = new StringBuilder("get connected wifi info ");
        sb.append(a != null ? "success" : C7533o0OoooO0.OooO0O0);
        C1709a.m3014b("stat", sb.toString());
        List<C2331a.C2334b> b = C2331a.m5067b(context);
        StringBuilder sb2 = new StringBuilder("get wifi list, total count=");
        boolean z2 = false;
        sb2.append(b == null ? 0 : b.size());
        C1709a.m3014b("stat", sb2.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "wifi");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("attributes", jSONObject2);
            if (a != null) {
                jSONObject2.put("current", a.f4678e);
                str = C1852c.m3511a("wifi{bssid='" + a.f4678e + '\'' + ",ssid='" + a.f4679f + '\'' + '}');
            } else {
                str = null;
            }
            if (b != null) {
                JSONArray jSONArray = new JSONArray();
                for (C2331a.C2334b bVar : b) {
                    jSONArray.put(bVar.f4678e);
                }
                jSONObject2.put(C8412oOoo0OoO.OooO0OO, jSONArray);
            }
            String jSONObject3 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject3) && z) {
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(m5062b().getString("stat_md5_1", null))) {
                        if (System.currentTimeMillis() - m5062b().getLong("stat_time_1", 0) > 1800000) {
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    C2130c.m4323a().mo34661a(new C2134b(jSONObject3, str));
                    C1709a.m3014b("stat", "report wifi info : " + jSONObject3);
                    return;
                }
                C1709a.m3014b("stat", "should not report wifi info, as connected wifi info has not changed");
            }
        } catch (JSONException e) {
            e.printStackTrace();
            C1709a.m3014b("stat", "build wifi report error, e=" + e.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5060a(C2327a aVar, final Context context) {
        if (context == null) {
            context = C2180b.m4471a();
        }
        if (C2185c.m4508e().mo34766a()) {
            aVar.f4667a.post(new Runnable() {
                /* class com.qiyukf.nimlib.p196i.C2327a.RunnableC23292 */

                /* renamed from: b */
                public final /* synthetic */ boolean f4671b = true;

                public final void run() {
                    C2327a.m5059a(context, this.f4671b);
                }
            });
        } else {
            C1709a.m3014b("stat", "unable to scan wifi info, as server is not granted");
        }
    }

    /* renamed from: a */
    public static void m5061a(String str) {
        C1847c.m3502a(m5062b(), "stat_md5_1", str);
        C1847c.m3501a(m5062b(), "stat_time_1", System.currentTimeMillis());
    }

    /* renamed from: b */
    public static SharedPreferences m5062b() {
        Context a = C2180b.m4471a();
        return a.getSharedPreferences("NIMSDK_STAT_" + C2180b.m4482g(), 0);
    }

    /* renamed from: a */
    public final void mo35077a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.f4667a.postDelayed(new Runnable() {
            /* class com.qiyukf.nimlib.p196i.C2327a.RunnableC23281 */

            public final void run() {
                if (C1861b.m3533f(applicationContext)) {
                    C1709a.m3014b("stat", "collect and upload stat on UI login done...");
                    C2327a.m5060a(C2327a.this, applicationContext);
                }
            }
        }, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
    }
}
