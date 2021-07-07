package com.alipay.apmobilesecuritysdk.p022d;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.apmobilesecuritysdk.p023e.C0398h;
import com.p118pd.sdk.C7559o0o00OOo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.b */
public final class C0387b {
    /* renamed from: a */
    public static synchronized Map<String, String> m749a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (C0387b.class) {
            hashMap = new HashMap();
            String OooO00o = C7559o0o00OOo.OooO00o(map, "tid", "");
            String OooO00o2 = C7559o0o00OOo.OooO00o(map, "utdid", "");
            String OooO00o3 = C7559o0o00OOo.OooO00o(map, "userId", "");
            String OooO00o4 = C7559o0o00OOo.OooO00o(map, DispatchConstants.APP_NAME, "");
            String OooO00o5 = C7559o0o00OOo.OooO00o(map, "appKeyClient", "");
            String OooO00o6 = C7559o0o00OOo.OooO00o(map, "tmxSessionId", "");
            String f = C0398h.m800f(context);
            String OooO00o7 = C7559o0o00OOo.OooO00o(map, "sessionId", "");
            hashMap.put("AC1", OooO00o);
            hashMap.put("AC2", OooO00o2);
            hashMap.put("AC3", "");
            hashMap.put("AC4", f);
            hashMap.put("AC5", OooO00o3);
            hashMap.put("AC6", OooO00o6);
            hashMap.put("AC7", "");
            hashMap.put("AC8", OooO00o4);
            hashMap.put("AC9", OooO00o5);
            if (C7559o0o00OOo.m19212OooO0O0(OooO00o7)) {
                hashMap.put("AC10", OooO00o7);
            }
        }
        return hashMap;
    }
}
