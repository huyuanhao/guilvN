package com.p118pd.sdk;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: com.pd.sdk.oo00oooo  reason: case insensitive filesystem */
public final class C8583oo00oooo {
    public static C8583oo00oooo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21702OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f21703OooO00o = new Object();

    public static C8583oo00oooo OooO00o() {
        if (OooO00o == null) {
            OooO0O0();
        }
        return OooO00o;
    }

    public static synchronized void OooO0O0() {
        synchronized (C8583oo00oooo.class) {
            if (OooO00o == null) {
                OooO00o = new C8583oo00oooo();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20234OooO00o() {
        C8511oo000o0.OooO00o().m20184OooO00o();
    }

    public void OooO00o(Context context) {
        synchronized (this.f21703OooO00o) {
            if (this.f21702OooO00o == null) {
                this.f21702OooO00o = context;
                C8511oo000o0.OooO00o().OooO00o(this.f21702OooO00o);
                C8548oo00Oo0O.OooO00o(this.f21702OooO00o);
            }
        }
    }

    public void OooO00o(String str) {
        C8548oo00Oo0O.OooO0O0(str);
    }

    public void OooO00o(String str, int i) {
        C8511oo000o0.OooO00o().OooO00o(str, i);
    }

    public void OooO00o(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        C8511oo000o0.OooO00o().OooO00o(str, i, str2, linkedHashMap);
    }

    public void OooO00o(String str, Context context) {
        C8511oo000o0.OooO00o().OooO00o(str, context);
    }

    public void OooO00o(String str, Context context, int i) {
        C8511oo000o0.OooO00o().OooO00o(str, context, AbstractC8526oo00O0O0.OooO00o(i), AbstractC8453oOooOoOO.OooO0o());
    }

    public void OooO00o(String str, Context context, String str2, String str3) {
        C8511oo000o0.OooO00o().OooO00o(str, str2, str3);
    }

    public void OooO00o(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        C8511oo000o0.OooO00o().OooO00o(str, context, linkedHashMap);
    }

    public void OooO00o(String str, String str2) {
        C8511oo000o0.OooO00o().OooO0O0(str, str2);
    }

    public void OooO00o(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        C8511oo000o0.OooO00o().OooO00o(str, str2, linkedHashMap);
    }

    public void OooO00o(boolean z) {
        C8511oo000o0.OooO00o().OooO00o(z);
    }

    public void OooO0O0(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        C8511oo000o0.OooO00o().OooO0O0(str, i, str2, linkedHashMap);
    }

    public void OooO0O0(String str, Context context) {
        C8511oo000o0.OooO00o().OooO0O0(str, context);
    }

    public void OooO0O0(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        C8511oo000o0.OooO00o().OooO0O0(str, context, linkedHashMap);
    }

    public void OooO0O0(String str, String str2) {
        C8511oo000o0.OooO00o().OooO0OO(str, str2);
    }

    public void OooO0O0(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        C8511oo000o0.OooO00o().OooO0O0(str, str2, linkedHashMap);
    }
}
