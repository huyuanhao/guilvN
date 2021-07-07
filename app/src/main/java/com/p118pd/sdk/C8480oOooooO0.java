package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.oOooooO0  reason: case insensitive filesystem */
public final class C8480oOooooO0 {
    public static C8480oOooooO0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f21605OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map<String, oo000000> f21606OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8483oOooooo f21607OooO00o = new C8483oOooooo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8488oo00000 f21608OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8489oo00000O f21609OooO00o = new C8489oo00000O();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21610OooO00o = false;

    public static C8480oOooooO0 OooO00o() {
        if (OooO00o == null) {
            OooO0O0();
        }
        return OooO00o;
    }

    public static synchronized void OooO0O0() {
        synchronized (C8480oOooooO0.class) {
            if (OooO00o == null) {
                OooO00o = new C8480oOooooO0();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8483oOooooo m20150OooO00o() {
        return this.f21607OooO00o;
    }

    public oo000000 OooO00o(String str) {
        return f21606OooO00o.get(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8488oo00000 m20151OooO00o() {
        C8488oo00000 oo00000;
        synchronized (f21605OooO00o) {
            oo00000 = this.f21608OooO00o;
        }
        return oo00000;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8489oo00000O m20152OooO00o() {
        return this.f21609OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<String> m20153OooO00o() {
        return f21606OooO00o.keySet();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20154OooO00o() {
        synchronized (f21605OooO00o) {
            this.f21608OooO00o = null;
            this.f21610OooO00o = false;
        }
    }

    public void OooO00o(C8488oo00000 oo00000) {
        synchronized (f21605OooO00o) {
            this.f21608OooO00o = oo00000;
            this.f21610OooO00o = true;
        }
    }

    public void OooO00o(String str, oo000000 oo000000) {
        f21606OooO00o.put(str, oo000000);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20155OooO00o() {
        boolean z;
        synchronized (f21605OooO00o) {
            z = this.f21610OooO00o;
        }
        return z;
    }
}
