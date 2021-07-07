package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;

/* renamed from: com.pd.sdk.L1LLi丨i  reason: invalid class name */
public final class L1LLii {
    public static AbstractC9478LILL OooO00o(Context context, LlLI1l11 llLI1l11) {
        AbstractC9478LILL r0;
        int i = Build.VERSION.SDK_INT;
        if (i < 5) {
            r0 = new C9585iI1ll(context);
        } else if (i < 8) {
            r0 = new C6869liI(context);
        } else {
            r0 = new C9630ili1l1(context);
        }
        r0.OooO00o(llLI1l11);
        return r0;
    }
}
