package com.alipay.apmobilesecuritysdk.p023e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p021c.C0383a;
import com.alipay.apmobilesecuritysdk.p024f.C0400a;
import com.p118pd.sdk.C7559o0o00OOo;
import com.taobao.accs.common.Constants;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.e.e */
public final class C0395e {
    /* renamed from: a */
    public static C0396f m772a(Context context) {
        if (context == null) {
            return null;
        }
        String a = C0400a.m822a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (C7559o0o00OOo.m19210OooO00o(a)) {
            a = C0400a.m823a("device_feature_file_name", "device_feature_file_key");
        }
        if (C7559o0o00OOo.m19210OooO00o(a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            C0396f fVar = new C0396f();
            fVar.mo4189a(jSONObject.getString("imei"));
            fVar.mo4191b(jSONObject.getString(Constants.KEY_IMSI));
            fVar.mo4193c(jSONObject.getString("mac"));
            fVar.mo4195d(jSONObject.getString("bluetoothmac"));
            fVar.mo4197e(jSONObject.getString("gsi"));
            return fVar;
        } catch (Exception e) {
            C0383a.m744a(e);
            return null;
        }
    }
}
