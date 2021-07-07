package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo000OO0  reason: case insensitive filesystem */
public final class C8504oo000OO0 {
    public static C8504oo000OO0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Map<String, C8637oo0OOOO> f21636OooO00o = new HashMap();

    public static C8504oo000OO0 OooO00o() {
        if (OooO00o == null) {
            m20180OooO00o();
        }
        return OooO00o;
    }

    private C8637oo0OOOO OooO00o(String str) {
        if (!this.f21636OooO00o.containsKey(str)) {
            this.f21636OooO00o.put(str, new C8637oo0OOOO());
        }
        return this.f21636OooO00o.get(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static synchronized void m20180OooO00o() {
        synchronized (C8504oo000OO0.class) {
            if (OooO00o == null) {
                OooO00o = new C8504oo000OO0();
            }
        }
    }

    public C8637oo0OOOO OooO00o(String str, long j) {
        C8637oo0OOOO OooO00o2 = OooO00o(str);
        OooO00o2.OooO00o(j);
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20181OooO00o(String str) {
        OooO00o(str).m20257OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20182OooO00o(String str, long j) {
        OooO00o(str).OooO0O0(j);
    }

    public void OooO0O0(String str, long j) {
        OooO00o(str).OooO0OO(j);
    }
}
