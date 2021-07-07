package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.ooO0O0Oo  reason: case insensitive filesystem */
public class C8828ooO0O0Oo {
    public static boolean OooO00o;
    public static boolean OooO0O0;

    public static boolean OooO00o(Context context, int i) {
        if (!OooO00o) {
            AbstractC8821ooO0O0 OooO00o2 = C8830ooO0O0o0.OooO00o(i);
            OooO0O0 = OooO00o2 != null && OooO00o2.OooO0O0(context);
            OooO00o = true;
        }
        return OooO0O0;
    }
}
