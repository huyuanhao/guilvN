package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.oo000Oo  reason: case insensitive filesystem */
public class C8507oo000Oo implements AbstractC8512oo000o00 {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21640OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Boolean f21641OooO00o;
    public String o0OO00O;
    public String o0OOO0o = "oper";
    public String o0Oo0oo;
    public String o0ooOOo;
    public String o0ooOoO;

    public C8507oo000Oo(Context context, String str, int i, String str2, String str3, long j) {
        String str4;
        this.f21640OooO00o = context;
        this.o0Oo0oo = str;
        this.o0ooOOo = str2;
        this.o0ooOoO = str3;
        if (i == 1) {
            str4 = "maint";
        } else if (i == 2) {
            str4 = "preins";
        } else if (i != 3) {
            this.o0OOO0o = "oper";
            if (AbstractC8452oOooOoO.m20090OooO00o(str, "oper")) {
                C8637oo0OOOO OooO00o2 = C8504oo000OO0.OooO00o().OooO00o(str, j);
                this.o0OO00O = OooO00o2.OooO00o();
                this.f21641OooO00o = Boolean.valueOf(OooO00o2.m20258OooO00o());
            }
            this.OooO00o = j;
        } else {
            str4 = "diffprivacy";
        }
        this.o0OOO0o = str4;
        this.OooO00o = j;
    }

    public C8507oo000Oo(Context context, String str, String str2, String str3, long j) {
        this.f21640OooO00o = context;
        this.o0Oo0oo = str;
        this.o0ooOOo = str2;
        this.o0ooOoO = str3;
        this.o0OOO0o = "oper";
        this.OooO00o = j;
        if (AbstractC8452oOooOoO.m20090OooO00o(str, "oper")) {
            C8637oo0OOOO OooO00o2 = C8504oo000OO0.OooO00o().OooO00o(str, j);
            this.o0OO00O = OooO00o2.OooO00o();
            this.f21641OooO00o = Boolean.valueOf(OooO00o2.m20258OooO00o());
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private void OooO00o() {
        String str;
        String str2;
        int OooO00o2 = AbstractC8453oOooOoOO.OooO00o();
        int OooO0O0 = AbstractC8454oOooOoOo.OooO0O0(this.o0Oo0oo, this.o0OOO0o);
        if (AbstractC8521oo00O00.OooO00o(this.f21640OooO00o, "stat_v2_1", OooO00o2 * 1048576)) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "stat sp file reach max limited size, discard new event");
            C8511oo000o0.OooO00o().OooO00o("", "");
            return;
        }
        SharedPreferences OooO00o3 = AbstractC8521oo00O00.OooO00o(this.f21640OooO00o, "stat_v2_1");
        if (OooO00o3 == null) {
            AbstractC8536oo00OO0O.OooO0OO("EventRecordTask", "event sp is null");
            return;
        }
        C8495oo0000o oo0000o = new C8495oo0000o();
        oo0000o.OooO0Oo(this.o0ooOOo);
        oo0000o.OooO0o(AbstractC8486oo00.OooO0O0(this.o0ooOoO, this.f21640OooO00o));
        oo0000o.OooO0oO(this.o0Oo0oo);
        oo0000o.OooO0o0(this.o0OOO0o);
        oo0000o.OooO0OO(String.valueOf(this.OooO00o));
        oo0000o.OooO00o(this.o0OO00O);
        if (this.f21641OooO00o == null) {
            str = null;
        } else {
            str = this.f21641OooO00o + "";
        }
        oo0000o.OooO0O0(str);
        oo0000o.OooO00o(OooO00o3);
        if ("_default_config_tag".equals(this.o0Oo0oo)) {
            str2 = this.o0Oo0oo;
        } else {
            str2 = this.o0Oo0oo + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.o0OOO0o;
        }
        if (AbstractC8521oo00O00.OooO00o(OooO00o3, OooO0O0 * 1024, str2)) {
            C8511oo000o0.OooO00o().OooO00o(this.o0Oo0oo, this.o0OOO0o);
        }
    }

    public void run() {
        OooO00o();
    }
}
