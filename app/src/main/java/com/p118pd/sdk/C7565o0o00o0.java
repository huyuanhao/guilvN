package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.pd.sdk.o0o00o0  reason: case insensitive filesystem */
public class C7565o0o00o0 {
    public static String OooO00o(Context context, String str, String str2) {
        synchronized (C7565o0o00o0.class) {
            String str3 = null;
            if (context != null) {
                if (!C7559o0o00OOo.m19210OooO00o(str) && !C7559o0o00OOo.m19210OooO00o(str2)) {
                    try {
                        String OooO00o = C7568o0o00oO.OooO00o(context, str, str2, "");
                        if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
                            return null;
                        }
                        str3 = C7558o0o00OOO.OooO0O0(C7558o0o00OOO.OooO00o(), OooO00o);
                        return str3;
                    } catch (Throwable unused) {
                    }
                }
            }
            return null;
        }
    }

    public static void OooO00o(Context context, String str, String str2, String str3) {
        synchronized (C7565o0o00o0.class) {
            if (!C7559o0o00OOo.m19210OooO00o(str) && !C7559o0o00OOo.m19210OooO00o(str2) && context != null) {
                try {
                    String OooO00o = C7558o0o00OOO.OooO00o(C7558o0o00OOO.OooO00o(), str3);
                    HashMap hashMap = new HashMap();
                    hashMap.put(str2, OooO00o);
                    C7568o0o00oO.OooO00o(context, str, hashMap);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
