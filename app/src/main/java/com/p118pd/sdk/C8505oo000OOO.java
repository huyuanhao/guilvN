package com.p118pd.sdk;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000OOO  reason: case insensitive filesystem */
public class C8505oo000OOO implements AbstractC8474oOoooO00 {
    public static C8505oo000OOO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21637OooO00o;

    public C8505oo000OOO(Context context) {
        this.f21637OooO00o = context;
    }

    public static C8505oo000OOO OooO00o(Context context) {
        C8505oo000OOO oo000ooo;
        synchronized (C8470oOooo0o0.class) {
            if (OooO00o == null) {
                OooO00o = new C8505oo000OOO(context);
            }
            oo000ooo = OooO00o;
        }
        return oo000ooo;
    }

    public void OooO00o() {
        C8470oOooo0o0.OooO00o().OooO00o(this.f21637OooO00o, this);
    }

    @Override // com.p118pd.sdk.AbstractC8474oOoooO00
    public void OooO00o(JSONObject jSONObject) {
        C8525oo00O0O.OooO00o(new C8507oo000Oo(this.f21637OooO00o, "_instance_ex_tag", "$AppOnCrash", jSONObject.toString(), System.currentTimeMillis()));
    }

    public void OooO0O0() {
        C8470oOooo0o0.OooO00o().OooO0O0();
    }
}
