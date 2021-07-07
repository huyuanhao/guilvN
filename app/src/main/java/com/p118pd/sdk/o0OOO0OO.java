package com.p118pd.sdk;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.o0OOO0OO */
public class o0OOO0OO {
    public static AtomicInteger OooO00o = new AtomicInteger(0);

    public static String OooO00o(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        if (str != null) {
            sb.append(str);
            sb.append('.');
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(OooO00o.incrementAndGet() & Integer.MAX_VALUE);
        }
        return sb.toString();
    }
}
