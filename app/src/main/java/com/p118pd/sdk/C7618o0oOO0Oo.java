package com.p118pd.sdk;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0oOO0Oo  reason: case insensitive filesystem */
public class C7618o0oOO0Oo {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19251OooO00o(Context context) throws Exception {
        C7620o0oOOOoo.OooO0O0("TidHelper.resetTID", "resetTID");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m19250OooO00o(context);
            m19253OooO0O0(context);
            C7517o0Ooo00O o0ooo00o = null;
            try {
                o0ooo00o = OooO00o(context);
            } catch (Throwable unused) {
            }
            return !C7517o0Ooo00O.OooO00o(o0ooo00o);
        }
        throw new Exception("不能在主线程中调用此方法");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m19253OooO0O0(Context context) {
        C7518o0Ooo00o.OooO00o(context).m19164OooO00o();
    }

    public static synchronized C7517o0Ooo00O OooO0OO(Context context) {
        synchronized (C7618o0oOO0Oo.class) {
            C7620o0oOOOoo.OooO0O0("TidHelper", "TidHelper.loadOrCreateTID");
            if (context == null) {
                C7477o0OoO0.OooO00o(context, "tid", C7482o0OoO0OO.o0OoOo0, "");
            }
            m19250OooO00o(context);
            C7517o0Ooo00O OooO0Oo = OooO0Oo(context);
            if (C7517o0Ooo00O.OooO00o(OooO0Oo)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return null;
                }
                try {
                    OooO0Oo = OooO00o(context);
                } catch (Throwable unused) {
                }
            }
            return OooO0Oo;
        }
    }

    public static C7517o0Ooo00O OooO0Oo(Context context) {
        m19250OooO00o(context);
        C7517o0Ooo00O OooO00o = OooO00o(context, C7518o0Ooo00o.OooO00o(context));
        if (OooO00o == null) {
            C7620o0oOOOoo.OooO0O0("TidHelper.loadTID", "TidHelper:::loadTID > null");
        } else {
            C7620o0oOOOoo.OooO0O0("TidHelper.loadTID", "TidHelper:::loadTID > " + OooO00o.toString());
        }
        return OooO00o;
    }

    public static String OooO0o0(Context context) {
        m19250OooO00o(context);
        return C7476o0OoO.OooO00o().OooO0OO();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m19252OooO0O0(Context context) {
        m19250OooO00o(context);
        return C7520o0Ooo0O0.m19173OooO00o(context).OooO00o();
    }

    public static C7517o0Ooo00O OooO0O0(Context context) {
        C7518o0Ooo00o OooO00o = C7518o0Ooo00o.OooO00o(context);
        if (OooO00o.m19167OooO0O0()) {
            return null;
        }
        return new C7517o0Ooo00O(OooO00o.m19163OooO00o(), OooO00o.m19166OooO0O0(), OooO00o.OooO00o().longValue());
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static String m19255OooO0Oo(Context context) {
        m19250OooO00o(context);
        return C7476o0OoO.OooO00o().OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19249OooO00o(Context context) {
        m19250OooO00o(context);
        return C7520o0Ooo0O0.m19173OooO00o(context).OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19250OooO00o(Context context) {
        if (context != null) {
            C7515o0Ooo00.OooO00o().OooO00o(context, C7476o0OoO.OooO00o());
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static synchronized String m19254OooO0OO(Context context) {
        String OooO00o;
        synchronized (C7618o0oOO0Oo.class) {
            C7517o0Ooo00O OooO0OO = OooO0OO(context);
            OooO00o = C7517o0Ooo00O.OooO00o(OooO0OO) ? "" : OooO0OO.m19160OooO00o();
        }
        return OooO00o;
    }

    public static C7517o0Ooo00O OooO00o(Context context) throws Exception {
        try {
            C7495o0OoOOo OooO00o = new C7504o0OoOoO0().OooO00o(context);
            if (OooO00o != null) {
                JSONObject jSONObject = new JSONObject(OooO00o.OooO0O0());
                C7518o0Ooo00o OooO00o2 = C7518o0Ooo00o.OooO00o(context);
                String optString = jSONObject.optString("tid");
                String string = jSONObject.getString(C7518o0Ooo00o.OooO);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(string)) {
                    OooO00o2.OooO00o(optString, string);
                }
                return OooO00o(context, OooO00o2);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static C7517o0Ooo00O OooO00o(Context context, C7518o0Ooo00o o0ooo00o) {
        if (o0ooo00o == null || o0ooo00o.m19165OooO00o()) {
            return null;
        }
        return new C7517o0Ooo00O(o0ooo00o.m19163OooO00o(), o0ooo00o.m19166OooO0O0(), o0ooo00o.OooO00o().longValue());
    }
}
