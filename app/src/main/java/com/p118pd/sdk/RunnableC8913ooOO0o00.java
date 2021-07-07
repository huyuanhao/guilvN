package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.pd.sdk.ooOO0o00  reason: case insensitive filesystem */
public class RunnableC8913ooOO0o00 implements Runnable {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C8910ooOO0Ooo f22140OooO00o;
    public final String o0ooOOo;
    public String o0ooOoO;

    public RunnableC8913ooOO0o00(Context context, C8910ooOO0Ooo oooo0ooo, String str, String str2) {
        this.OooO00o = context;
        this.o0ooOOo = str;
        this.f22140OooO00o = oooo0ooo;
        this.o0ooOoO = str2;
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    public void run() {
        String str = this.o0ooOoO;
        if (str != null && str.length() != 0) {
            C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
            HashMap hashMap = new HashMap();
            hashMap.put("logFile", logParamsManager.OooO0OO());
            hashMap.put("commonParams", logParamsManager.OooO00o(this.OooO00o));
            hashMap.put("logs", this.o0ooOoO);
            if (C8741oo0oOo0.OooO0Oo(logParamsManager.OooO0o0())) {
                hashMap.put("sourceMapUrl", logParamsManager.OooO0o0());
            }
            C8922ooOO0ooo OooO0O0 = C8932ooOOO0o.OooO0O0(this.o0ooOOo, (Map<String, String>) hashMap);
            OooO0O0.OooO00o("content-encoding", "gzip");
            C8924ooOOO00 OooO0O02 = C8932ooOOO0o.OooO0O0(OooO0O0);
            if (OooO0O02 == null && C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str2 = LogCollectorManager.TAG;
            }
            if (OooO0O02.OooO00o() == 200) {
                if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                    String str3 = LogCollectorManager.TAG;
                    OooO0O02.m20575OooO00o();
                }
                try {
                    JSONObject jSONObject = (JSONObject) new JSONTokener(OooO0O02.m20575OooO00o()).nextValue();
                    if (jSONObject.getInt("code") == 0) {
                        this.f22140OooO00o.OooO0O0();
                    } else if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                        String str4 = LogCollectorManager.TAG;
                        jSONObject.getString("message");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
