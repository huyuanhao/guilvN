package com.alipay.apmobilesecuritysdk.p022d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p021c.C0383a;
import com.alipay.apmobilesecuritysdk.p023e.C0395e;
import com.alipay.apmobilesecuritysdk.p023e.C0396f;
import com.alipay.apmobilesecuritysdk.p024f.C0400a;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7562o0o00OoO;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.d.c */
public final class C0388c {
    /* renamed from: a */
    public static Map<String, String> m750a(Context context) {
        C7562o0o00OoO OooO00o = C7562o0o00OoO.OooO00o();
        HashMap hashMap = new HashMap();
        C0396f a = C0395e.m772a(context);
        String OooO00o2 = C7562o0o00OoO.OooO00o(context);
        String OooO0O0 = C7562o0o00OoO.OooO0O0(context);
        String OooOO0O = C7562o0o00OoO.OooOO0O(context);
        String OooOOO0 = C7562o0o00OoO.OooOOO0(context);
        if (a != null) {
            if (C7559o0o00OOo.m19210OooO00o(OooO00o2)) {
                OooO00o2 = a.mo4188a();
            }
            if (C7559o0o00OOo.m19210OooO00o(OooO0O0)) {
                OooO0O0 = a.mo4190b();
            }
            if (C7559o0o00OOo.m19210OooO00o(OooOO0O)) {
                OooOO0O = a.mo4192c();
            }
            if (C7559o0o00OOo.m19210OooO00o(OooOOO0)) {
                OooOOO0 = a.mo4196e();
            }
        }
        C0396f fVar = new C0396f(OooO00o2, OooO0O0, OooOO0O, "", OooOOO0);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.mo4188a());
                jSONObject.put(Constants.KEY_IMSI, fVar.mo4190b());
                jSONObject.put("mac", fVar.mo4192c());
                jSONObject.put("bluetoothmac", fVar.mo4194d());
                jSONObject.put("gsi", fVar.mo4196e());
                String jSONObject2 = jSONObject.toString();
                C0400a.m825a("device_feature_file_name", "device_feature_file_key", jSONObject2);
                C0400a.m824a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e) {
                C0383a.m744a(e);
            }
        }
        hashMap.put("AD1", OooO00o2);
        hashMap.put("AD2", OooO0O0);
        hashMap.put("AD3", C7562o0o00OoO.OooO0o(context));
        hashMap.put("AD5", C7562o0o00OoO.OooO0oo(context));
        hashMap.put("AD6", C7562o0o00OoO.OooO(context));
        hashMap.put("AD7", C7562o0o00OoO.OooOO0(context));
        hashMap.put("AD8", OooOO0O);
        hashMap.put("AD9", C7562o0o00OoO.OooOO0o(context));
        hashMap.put("AD10", OooOOO0);
        hashMap.put("AD11", C7562o0o00OoO.OooO0Oo());
        hashMap.put("AD12", OooO00o.m19214OooO00o());
        hashMap.put("AD13", C7562o0o00OoO.OooO0o0());
        hashMap.put("AD14", C7562o0o00OoO.OooO0oO());
        hashMap.put("AD15", C7562o0o00OoO.OooO0oo());
        hashMap.put("AD16", C7562o0o00OoO.OooO());
        hashMap.put("AD17", "");
        hashMap.put("AD19", C7562o0o00OoO.OooOOO(context));
        hashMap.put("AD20", C7562o0o00OoO.OooOO0());
        hashMap.put("AD22", "");
        hashMap.put("AD23", C7562o0o00OoO.OooOOOo(context));
        hashMap.put("AD24", C7559o0o00OOo.OooO0Oo(C7562o0o00OoO.OooO0oO(context)));
        hashMap.put("AD26", C7562o0o00OoO.OooO0o0(context));
        hashMap.put("AD27", C7562o0o00OoO.OooOOOO());
        hashMap.put("AD28", C7562o0o00OoO.OooOOo0());
        hashMap.put("AD29", C7562o0o00OoO.OooOOoo());
        hashMap.put("AD30", C7562o0o00OoO.OooOOOo());
        hashMap.put("AD31", C7562o0o00OoO.OooOOo());
        hashMap.put("AD32", C7562o0o00OoO.OooOOO0());
        hashMap.put("AD33", C7562o0o00OoO.OooOOO());
        hashMap.put("AD34", C7562o0o00OoO.OooOOo(context));
        hashMap.put("AD35", C7562o0o00OoO.OooOOoo(context));
        hashMap.put("AD36", C7562o0o00OoO.OooOOo0(context));
        hashMap.put("AD37", C7562o0o00OoO.OooOO0o());
        hashMap.put("AD38", C7562o0o00OoO.OooOO0O());
        hashMap.put("AD39", C7562o0o00OoO.OooO0OO(context));
        hashMap.put("AD40", C7562o0o00OoO.OooO0Oo(context));
        hashMap.put("AD41", C7562o0o00OoO.OooO0O0());
        hashMap.put("AD42", C7562o0o00OoO.OooO0OO());
        hashMap.put("AL3", C7562o0o00OoO.OooOOOO(context));
        return hashMap;
    }
}
