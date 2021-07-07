package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000OO  reason: case insensitive filesystem */
public class C8503oo000OO implements AbstractC8512oo000o00 {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8514oo000o0o f21634OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<C8492oo0000O0> f21635OooO00o;
    public String o0OOO0o;
    public String o0Oo0oo = "";
    public String o0ooOOo;
    public String o0ooOoO;

    public C8503oo000OO(Context context, List<C8492oo0000O0> list, String str, String str2, String str3, String str4) {
        this.OooO00o = context;
        this.f21635OooO00o = list;
        this.o0ooOoO = str;
        this.f21634OooO00o = C8515oo000oO.OooO00o();
        this.o0ooOOo = str2;
        this.o0OOO0o = str3;
        this.o0Oo0oo = str4;
    }

    private boolean OooO00o(C8498oo0000oo oo0000oo) {
        JSONObject OooO00o2 = oo0000oo.OooO00o();
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "appActionDatas is null, no data report");
            return false;
        }
        try {
            byte[] OooO00o3 = C8523oo00O00O.OooO00o(OooO00o2.toString().getBytes("UTF-8"));
            SharedPreferences OooO00o4 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "global_v2");
            String OooO00o5 = AbstractC8526oo00O0O0.OooO00o(this.o0ooOOo, this.o0ooOoO, this.o0Oo0oo);
            AbstractC8536oo00OO0O.OooO0O0("DataSendTask", "Record the data reqID being reported,reqID: " + OooO00o5);
            AbstractC8521oo00O00.m20194OooO00o(OooO00o4, "request_id", (Object) OooO00o5);
            return this.f21634OooO00o.OooO00o(OooO00o3, this.o0ooOoO, this.o0ooOOo, this.o0Oo0oo);
        } catch (UnsupportedEncodingException unused) {
            AbstractC8536oo00OO0O.OooO0OO("DataSendTask", "sendData():  getBytes - Unsupported coding format!!");
            return false;
        }
    }

    public void run() {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", " begin to send event data TYPE : %s, TAG : %s ,reqID:" + this.o0Oo0oo, this.o0ooOoO, this.o0ooOOo);
        if ("preins".equals(this.o0ooOoO) && TextUtils.isEmpty(AbstractC8453oOooOoOO.OooO0oo())) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "upload url now : preins ,reqID:" + this.o0Oo0oo);
            new C8519oo000oo0(this.OooO00o).OooO00o();
        }
        C8498oo0000oo OooO00o2 = C8517oo000oOo.OooO00o(this.f21635OooO00o, this.o0ooOoO, this.o0ooOOo, this.o0OOO0o, this.o0Oo0oo);
        C8492oo0000O0[] OooO00o3 = OooO00o2.m20178OooO00o();
        if (OooO00o3.length == 0) {
            AbstractC8536oo00OO0O.OooO0OO("DataSendTask", "Data is out of date and no data is reported.reqID:" + this.o0Oo0oo);
            return;
        }
        boolean OooO00o4 = OooO00o(OooO00o2);
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "data send result: %s ,reqID:" + this.o0Oo0oo, Boolean.valueOf(OooO00o4));
        C8525oo00O0O.OooO00o(new C8509oo000Ooo(this.OooO00o, OooO00o3, this.o0ooOOo, this.o0ooOoO, this.o0Oo0oo, OooO00o4));
    }
}
