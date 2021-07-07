package com.alipay.apmobilesecuritysdk.p022d;

import android.content.Context;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7560o0o00Oo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.a */
public final class C0386a {
    /* renamed from: a */
    public static synchronized Map<String, String> m748a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (C0386a.class) {
            String OooO00o = C7559o0o00OOo.OooO00o(map, "appchannel", "");
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            C7560o0o00Oo.OooO00o();
            hashMap.put("AA2", C7560o0o00Oo.OooO00o(context));
            hashMap.put("AA3", "APPSecuritySDK-ALIPAYSDK");
            hashMap.put("AA4", "3.4.0.201910161639");
            hashMap.put("AA6", OooO00o);
        }
        return hashMap;
    }
}
