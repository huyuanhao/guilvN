package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.oo00Ooo  reason: case insensitive filesystem */
public class C8553oo00Ooo {
    @SuppressLint({"StaticFieldLeak"})
    public static C8553oo00Ooo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f21669OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21670OooO00o;

    public static C8553oo00Ooo OooO00o() {
        if (OooO00o == null) {
            m20209OooO00o();
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static synchronized void m20209OooO00o() {
        synchronized (C8553oo00Ooo.class) {
            if (OooO00o == null) {
                OooO00o = new C8553oo00Ooo();
            }
        }
    }

    private void OooO0O0() {
        String OooO0Oo = AbstractC8456oOooOoo0.m20112OooO0Oo();
        String OooO0o0 = AbstractC8456oOooOoo0.OooO0o0();
        String[] OooO00o2 = AbstractC8456oOooOoo0.m20107OooO00o();
        int OooO0Oo2 = AbstractC8456oOooOoo0.OooO0Oo();
        if (TextUtils.isEmpty(OooO0Oo) || TextUtils.isEmpty(OooO0o0)) {
            C8569oo00oOOo.m20218OooO00o();
            AbstractC8456oOooOoo0.m20105OooO00o();
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "log server init failure, Parameter error!");
            return;
        }
        C8476oOoooO0o.OooO00o().OooO00o(this.f21670OooO00o);
        C8569oo00oOOo.OooO00o().OooO00o(this.f21670OooO00o);
        if (OooO0Oo2 == 1) {
            C8575oo00oo00.OooO00o(this.f21670OooO00o).OooO00o(OooO00o2);
        } else {
            C8575oo00oo00.OooO00o(this.f21670OooO00o).OooO00o();
        }
    }

    public void OooO00o(Context context) {
        synchronized (f21669OooO00o) {
            if (this.f21670OooO00o == null) {
                this.f21670OooO00o = context;
                OooO0O0();
            }
        }
    }

    public void OooO00o(boolean z) {
        if (this.f21670OooO00o == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "refreshLogConfig(): LogServer need to init first!");
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "refreshLogConfig() is executed.");
        if (z) {
            C8555oo00OooO.OooO00o(this.f21670OooO00o);
        }
        OooO0O0();
    }
}
