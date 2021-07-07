package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.o0o00o0O  reason: case insensitive filesystem */
public final class C7567o0o00o0O {
    public static String OooO00o(String str) {
        String str2;
        try {
            str2 = C7570o0o00oOO.OooO00o(str);
        } catch (Throwable unused) {
            str2 = "";
        }
        if (!C7559o0o00OOo.m19210OooO00o(str2)) {
            return str2;
        }
        return C7564o0o00o.OooO00o(".SystemConfig" + File.separator + str);
    }
}
