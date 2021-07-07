package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000o0O  reason: case insensitive filesystem */
public class C8513oo000o0O {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21647OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;

    public C8513oo000o0O(String str, String str2, String str3, String str4, Context context) {
        this.OooO00o = context;
        this.f21647OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
        this.OooO0Oo = str4;
    }

    public void OooO00o() {
        AbstractC8536oo00OO0O.OooO0O0("IMEventReportTask", "Stream Event run!");
        C8492oo0000O0 oo0000o0 = new C8492oo0000O0(this.OooO00o);
        long currentTimeMillis = System.currentTimeMillis();
        oo0000o0.OooO0o(this.OooO0Oo);
        oo0000o0.OooO0o0(this.OooO0O0);
        oo0000o0.OooO0Oo(this.OooO0OO);
        oo0000o0.OooO0OO(currentTimeMillis + "");
        oo0000o0.OooO0oO(this.f21647OooO00o);
        if ("oper".equals(this.OooO0O0) && AbstractC8452oOooOoO.m20090OooO00o(this.f21647OooO00o, "oper")) {
            C8637oo0OOOO OooO00o2 = C8504oo000OO0.OooO00o().OooO00o(this.f21647OooO00o, currentTimeMillis);
            String OooO00o3 = OooO00o2.OooO00o();
            Boolean valueOf = Boolean.valueOf(OooO00o2.m20258OooO00o());
            oo0000o0.OooO00o(OooO00o3);
            oo0000o0.OooO0O0(valueOf + "");
        }
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        if (!AbstractC8521oo00O00.OooO00o(this.OooO00o, "backup_event", 5242880)) {
            SharedPreferences OooO00o4 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "backup_event");
            JSONObject OooO00o5 = oo0000o0.OooO00o();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(OooO00o5);
            AbstractC8521oo00O00.m20194OooO00o(OooO00o4, AbstractC8526oo00O0O0.OooO00o(this.f21647OooO00o, this.OooO0O0, replace), (Object) jSONArray.toString());
        } else {
            AbstractC8536oo00OO0O.OooO0O0("IMEventReportTask", "backup file reach max limited size, discard new event ");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(oo0000o0);
        C8525oo00O0O.OooO0O0(new C8503oo000OO(this.OooO00o, arrayList, this.OooO0O0, this.f21647OooO00o, AbstractC8453oOooOoOO.OooO0o(), replace));
    }
}
