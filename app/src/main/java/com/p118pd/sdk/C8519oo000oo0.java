package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.util.C1105e;

/* renamed from: com.pd.sdk.oo000oo0  reason: case insensitive filesystem */
public class C8519oo000oo0 {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8514oo000o0o f21650OooO00o = C8515oo000oO.OooO00o();

    public C8519oo000oo0(Context context) {
        this.OooO00o = context;
    }

    public void OooO00o() {
        String str;
        if (AbstractC8453oOooOoOO.m20097OooO00o()) {
            String OooO00o2 = C1105e.OooO00o("ro.product.CustCVersion", "");
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "cust version: %s", OooO00o2);
            String a = this.f21650OooO00o.mo30713a(OooO00o2);
            if (!TextUtils.isEmpty(a)) {
                AbstractC8453oOooOoOO.OooO00o(a);
                SharedPreferences OooO00o3 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "global_v2");
                AbstractC8521oo00O00.m20194OooO00o(OooO00o3, "upload_url", (Object) a);
                AbstractC8521oo00O00.m20194OooO00o(OooO00o3, "upload_url_time", (Object) Long.valueOf(System.currentTimeMillis()));
                AbstractC8453oOooOoOO.m20096OooO00o(false);
                return;
            }
            str = "ServerAddrGetTask() No access to preloaded URL";
        } else {
            str = "ServerAddrGetTask() Not need RetrieveUploadUrl,URL is empty, But the switch is closed !";
        }
        AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", str);
    }
}
