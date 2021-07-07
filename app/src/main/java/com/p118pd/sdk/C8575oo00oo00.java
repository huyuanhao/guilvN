package com.p118pd.sdk;

import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00oo00  reason: case insensitive filesystem */
public class C8575oo00oo00 implements AbstractC8474oOoooO00 {
    public static C8575oo00oo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21685OooO00o;

    public C8575oo00oo00(Context context) {
        this.f21685OooO00o = context;
    }

    public static C8575oo00oo00 OooO00o(Context context) {
        C8575oo00oo00 oo00oo00;
        synchronized (C8470oOooo0o0.class) {
            if (OooO00o == null) {
                OooO00o = new C8575oo00oo00(context);
            }
            oo00oo00 = OooO00o;
        }
        return oo00oo00;
    }

    public void OooO00o() {
        C8470oOooo0o0.OooO00o().m20131OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8474oOoooO00
    public void OooO00o(JSONObject jSONObject) {
        try {
            jSONObject.putOpt("HappenTime", new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()));
            jSONObject.putOpt("Eventid", 907121999);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("logCrashHandler", "logHandlerExc json put value error");
        }
        Bundle bundle = new Bundle();
        bundle.putString("MetaData", jSONObject.toString());
        C8569oo00oOOo.OooO00o("logCrashHandler", "CrashMsg", String.valueOf(907121999), bundle);
    }

    public void OooO00o(String[] strArr) {
        C8470oOooo0o0.OooO00o().OooO00o(this.f21685OooO00o, strArr, this);
    }
}
