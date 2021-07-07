package com.megvii.meglive_sdk.manager;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.megvii.action.fmp.liveness.lib.jni.MegDelta;
import com.megvii.action.fmp.liveness.lib.p090b.C1459c;
import com.megvii.apo.PhoneFingerManager;
import com.megvii.meglive_sdk.listener.AbstractC1587b;
import com.megvii.meglive_sdk.listener.AbstractC1588c;
import com.megvii.meglive_sdk.p097c.C1518a;
import com.megvii.meglive_sdk.p097c.C1519b;
import com.megvii.meglive_sdk.p098d.C1521a;
import com.megvii.meglive_sdk.p098d.C1522b;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1585z;
import com.megvii.meglive_sdk.p106f.EnumC1568j;
import com.taobao.accs.common.Constants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.manager.a */
public final class C1589a {

    /* renamed from: e */
    public static C1589a f2651e;

    /* renamed from: a */
    public Context f2652a;

    /* renamed from: b */
    public C1521a f2653b;

    /* renamed from: c */
    public C1522b f2654c;

    /* renamed from: d */
    public String f2655d;

    /* renamed from: com.megvii.meglive_sdk.manager.a$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooO0O0(String str, String str2) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
        }

        public final void run() {
            PhoneFingerManager.getInstance(C1525e.m2307a().f2160a).mo16936cf(this.o0ooOOo, this.o0ooOoO);
        }
    }

    public C1589a(Context context) {
        this.f2652a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static void m2707b(EnumC1568j jVar, AbstractC1588c cVar, boolean z) {
        if (cVar == null) {
            C1525e.m2307a().mo17003a(jVar);
        } else if (z) {
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m2706b(EnumC1568j jVar) {
        C1525e.m2307a().mo17003a(jVar);
    }

    /* renamed from: a */
    public static synchronized C1589a m2698a(Context context) {
        C1589a aVar;
        synchronized (C1589a.class) {
            if (f2651e == null) {
                f2651e = new C1589a(context);
            }
            aVar = f2651e;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo17220a(int i, String str, String str2, String str3) {
        if (i == 0) {
            mo17221a(str, str2, str3);
            return;
        }
        C1525e.m2307a().mo17003a(EnumC1568j.AUTHENTICATION_FAIL);
    }

    /* renamed from: a */
    public final void mo17221a(String str, String str2, String str3) {
        Map<String, Object> h = C1565g.m2639h(this.f2652a);
        if (!h.containsKey("bundleId")) {
            m2707b(EnumC1568j.INVALID_BUNDLE_ID, null, false);
        } else if (TextUtils.isEmpty((String) h.get("bundleId"))) {
            m2707b(EnumC1568j.INVALID_BUNDLE_ID, null, false);
        } else {
            if (System.currentTimeMillis() > ((Long) h.get("expireTime")).longValue()) {
                m2707b(EnumC1568j.INVALID_BUNDLE_ID, null, false);
            } else if (!C1518a.m2292a(this.f2652a)) {
                m2707b(EnumC1568j.NETWORK_ERROR, null, false);
            } else {
                String kk = PhoneFingerManager.getInstance(C1525e.m2307a().f2160a).mo16942kk();
                String ii = PhoneFingerManager.getInstance(C1525e.m2307a().f2160a).mo16938ii();
                String i = C1565g.m2640i(this.f2652a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("biz_token", str);
                    jSONObject.put("os", "android");
                    jSONObject.put("key", this.f2655d);
                    jSONObject.put("language", i);
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("advanced_option", str3);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("3932", "android");
                    jSONObject2.put("6823", ii);
                    jSONObject2.put("7833", kk);
                    jSONObject.put("finger", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", Build.VERSION.RELEASE);
                    jSONObject3.put(Constants.KEY_MODEL, Build.MODEL);
                    jSONObject.put(Constants.KEY_MODEL, jSONObject3);
                    C1571m.m2656b("getLivenessConfig  ", "json = " + jSONObject.toString());
                    C1519b.m2293a().mo16990a(this.f2652a, str2, str, C1459c.m2160a(jSONObject), new OooO00o(kk, str));
                } catch (JSONException e) {
                    e.printStackTrace();
                    m2707b(EnumC1568j.AUTHENTICATION_FAIL, null, false);
                }
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.manager.a$OooO00o */
    public class OooO00o implements AbstractC1587b {
        public final /* synthetic */ AbstractC1588c OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f15086OooO00o;
        public final /* synthetic */ String OooO0O0;

        public OooO00o(String str, String str2) {
            this.f15086OooO00o = str;
            this.OooO0O0 = str2;
        }

        @Override // com.megvii.meglive_sdk.listener.AbstractC1587b
        /* renamed from: a */
        public final void mo17212a(String str) {
            String str2;
            try {
                String optString = new JSONObject(str).optString("result");
                if (optString != null) {
                    byte[] decode = Base64.decode(optString, 0);
                    C1522b unused = C1589a.this.f2654c;
                    str2 = new String(MegDelta.decodeJsonStr(C1589a.this.f2655d, decode));
                } else {
                    str2 = null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    C1571m.m2656b("getLivenessConfig  success", "responseBody = ".concat(String.valueOf(str)));
                    C1571m.m2656b("getLivenessConfig  success", "dataStr = " + jSONObject.toString());
                    if (jSONObject.has("option_code")) {
                        C1565g.m2631a(C1589a.this.f2652a, jSONObject.optInt("option_code", 0));
                    } else {
                        C1565g.m2631a(C1589a.this.f2652a, 0);
                    }
                    if (jSONObject.has("liveness_config")) {
                        C1585z.m2694a(C1589a.this.f2652a, "megvii_liveness_config", jSONObject.getJSONObject("liveness_config").toString());
                        if (jSONObject.has("sls_config")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("sls_config");
                            C1571m.m2655a("slsConfig", jSONObject2.toString());
                            C1585z.m2694a(C1589a.this.f2652a, "megvii_sls_config", jSONObject2.toString());
                            C1589a.m2704a(C1589a.this, jSONObject.optString("finger_config"), this.f15086OooO00o);
                            if (jSONObject.has("sdk_agreement_url")) {
                                C1585z.m2694a(C1589a.this.f2652a, "megvii_liveness_agreeUrl", jSONObject.optString("sdk_agreement_url", ""));
                                C1565g.m2633b(C1589a.this.f2652a, 2);
                            } else {
                                C1565g.m2633b(C1589a.this.f2652a, 1);
                            }
                            C1585z.m2694a(C1589a.this.f2652a, "megvii_liveness_bizToken", this.OooO0O0);
                            C1589a.m2707b(EnumC1568j.LIVENESS_FINISH, this.OooO00o, true);
                            return;
                        }
                        C1589a.m2707b(EnumC1568j.ILLEGAL_PARAMETER, this.OooO00o, false);
                        return;
                    }
                    C1589a.m2707b(EnumC1568j.ILLEGAL_PARAMETER, this.OooO00o, false);
                } catch (JSONException e) {
                    e.printStackTrace();
                    C1589a.m2707b(EnumC1568j.AUTHENTICATION_FAIL, this.OooO00o, false);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                C1589a.m2707b(EnumC1568j.ILLEGAL_PARAMETER, this.OooO00o, false);
            }
        }

        @Override // com.megvii.meglive_sdk.listener.AbstractC1587b
        /* renamed from: a */
        public final void mo17211a(int i, byte[] bArr) {
            C1571m.m2656b("getLivenessConfig failure", "code= " + i + "  responseBody = " + bArr);
            AbstractC1588c cVar = this.OooO00o;
            if (cVar == null) {
                C1589a.m2700a(i, bArr);
            } else {
                C1589a.m2707b(EnumC1568j.ILLEGAL_PARAMETER, cVar, false);
            }
        }
    }

    /* renamed from: a */
    public static void m2701a(EnumC1568j jVar) {
        C1525e.m2307a().mo17003a(jVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2700a(int i, byte[] bArr) {
        if (i == 400) {
            try {
                String optString = new JSONObject(new String(bArr)).optString("error", "");
                if ("BAD_ARGUMENTS: biz_token".equals(optString)) {
                    C1525e.m2307a().mo17003a(EnumC1568j.BIZ_TOKEN_DENIED);
                    return;
                }
                if (!"BAD_ARGUMENTS: bundle_id".equals(optString)) {
                    if (!"BAD_ARGUMENTS: auth_msg".equals(optString)) {
                        C1525e.m2307a().mo17003a(EnumC1568j.ILLEGAL_PARAMETER);
                        return;
                    }
                }
                C1525e.m2307a().mo17003a(EnumC1568j.INVALID_BUNDLE_ID);
                return;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C1525e.m2307a().mo17003a(EnumC1568j.ILLEGAL_PARAMETER);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2704a(C1589a aVar, String str, String str2) {
        new Thread(new OooO0O0(str2, str)).start();
    }
}
