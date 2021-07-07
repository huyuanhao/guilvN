package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.pd.sdk.o0o00oO0  reason: case insensitive filesystem */
public final class C7569o0o00oO0 {
    public static synchronized void OooO00o(Context context, String str, String str2, String str3) {
        synchronized (C7569o0o00oO0.class) {
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
