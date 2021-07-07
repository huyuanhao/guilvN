package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;

/* renamed from: com.pd.sdk.oo0ooOo  reason: case insensitive filesystem */
public class C8771oo0ooOo {

    /* renamed from: com.pd.sdk.oo0ooOo$OooO00o */
    public interface OooO00o {
        void OooO00o();

        void OooO0O0();
    }

    public static void OooO00o(Context context) {
        if (OooO00o()) {
            C8772oo0ooOo0.OooO00o(context);
        }
    }

    public static void OooO0O0(OooO00o oooO00o) {
        if (OooO00o()) {
            C8772oo0ooOo0.OooO0O0(oooO00o);
        }
    }

    public static boolean OooO0OO() {
        if (!OooO00o()) {
            return false;
        }
        return C8772oo0ooOo0.OooO0O0();
    }

    public static void OooO00o(OooO00o oooO00o) {
        if (OooO00o()) {
            C8772oo0ooOo0.OooO00o(oooO00o);
        }
    }

    public static boolean OooO0O0() {
        if (!OooO00o()) {
            return false;
        }
        return C8772oo0ooOo0.OooO00o();
    }

    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 14;
    }
}
