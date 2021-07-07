package com.p118pd.sdk;

import android.content.Context;
import org.json.JSONException;

/* renamed from: com.pd.sdk.oOooo0O  reason: case insensitive filesystem */
public class RunnableC8465oOooo0O implements Runnable {
    public Context OooO00o;

    public RunnableC8465oOooo0O(Context context) {
        this.OooO00o = context;
    }

    public void run() {
        AbstractC8536oo00OO0O.OooO0O0("ABTest/ReadCacheDataTask", "read cache task running");
        try {
            C8463oOooo00O.OooO00o().m20119OooO00o(AbstractC8486oo00.OooO00o((String) C8592oo0O00O0.OooO00o(C8592oo0O00O0.OooO00o(this.OooO00o, "abtest"), "exp_data", (Object) ""), this.OooO00o));
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ABTest/ReadCacheDataTask", "experiment data error");
        }
        C8463oOooo00O.OooO00o().OooO00o(true);
        C8463oOooo00O.OooO00o().OooO0O0(false);
    }
}
