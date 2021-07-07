package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.o0OoO0  reason: case insensitive filesystem */
public class C7477o0OoO0 {
    public static C7482o0OoO0OO OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20299OooO00o = "alipay_cashier_statistic_record";

    public static void OooO00o(Context context) {
        if (OooO00o == null) {
            OooO00o = new C7482o0OoO0OO(context);
        }
    }

    public static synchronized void OooO0O0(Context context, String str) {
        synchronized (C7477o0OoO0.class) {
            if (OooO00o != null) {
                OooO00o(context, OooO00o.OooO00o(str));
                OooO00o = null;
            }
        }
    }

    public static void OooO00o(Context context, String str) {
        new Thread(new RunnableC7612o0oO0O00(context, str)).start();
    }

    public static void OooO00o(String str, Throwable th) {
        if (OooO00o != null && th != null && th.getClass() != null) {
            OooO00o.OooO00o(str, th.getClass().getSimpleName(), th);
        }
    }

    public static void OooO00o(String str, String str2, Throwable th, String str3) {
        C7482o0OoO0OO o0ooo0oo = OooO00o;
        if (o0ooo0oo != null) {
            o0ooo0oo.OooO00o(str, str2, th, str3);
        }
    }

    public static void OooO00o(String str, String str2, Throwable th) {
        C7482o0OoO0OO o0ooo0oo = OooO00o;
        if (o0ooo0oo != null) {
            o0ooo0oo.OooO00o(str, str2, th);
        }
    }

    public static void OooO00o(String str, String str2, String str3) {
        C7482o0OoO0OO o0ooo0oo = OooO00o;
        if (o0ooo0oo != null) {
            o0ooo0oo.OooO00o(str, str2, str3);
        }
    }

    public static void OooO00o(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                C7482o0OoO0OO o0ooo0oo = new C7482o0OoO0OO(context);
                o0ooo0oo.OooO00o(str, str2, str3);
                OooO00o(context, o0ooo0oo.OooO00o(""));
            } catch (Throwable th) {
                C7620o0oOOOoo.m19257OooO00o(th);
            }
        }
    }
}
