package com.p118pd.sdk;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: com.pd.sdk.o00O0OO0  reason: case insensitive filesystem */
public final class C7058o00O0OO0 {
    public static C7060o00O0OOo OooO00o(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C7060o00O0OOo.OooO00o((Object) configuration.getLocales());
        }
        return C7060o00O0OOo.OooO00o(configuration.locale);
    }
}
