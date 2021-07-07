package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p019a.C0381a;
import com.p118pd.sdk.C7559o0o00OOo;
import java.util.HashMap;
import java.util.Map;

public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String a;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", C7559o0o00OOo.OooO00o(map, "utdid", ""));
            hashMap.put("tid", C7559o0o00OOo.OooO00o(map, "tid", ""));
            hashMap.put("userId", C7559o0o00OOo.OooO00o(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            a = C0381a.m731a(context);
        }
        return a;
    }
}
