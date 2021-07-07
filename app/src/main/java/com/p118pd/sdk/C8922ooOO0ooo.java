package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOO0ooo  reason: case insensitive filesystem */
public class C8922ooOO0ooo {
    public int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22162OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22163OooO00o;
    public int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Map<String, String> f22164OooO0O0 = new HashMap();

    public C8922ooOO0ooo(String str) {
        this.f22162OooO00o = str;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m20573OooO0O0() {
        return this.f22162OooO00o;
    }

    public void OooO00o(int i) {
        if (i >= 0) {
            this.OooO00o = i;
            return;
        }
        throw new IllegalArgumentException("timeout can not be negative");
    }

    public int OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0O0(int i) {
        if (i >= 0) {
            this.OooO0O0 = i;
            return;
        }
        throw new IllegalArgumentException("timeout can not be negative");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m20572OooO00o() {
        return this.f22163OooO00o;
    }

    public void OooO00o(Map<String, String> map) {
        this.f22163OooO00o = map;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Map<String, String> m20574OooO0O0() {
        return this.f22164OooO0O0;
    }

    public C8922ooOO0ooo(String str, Map<String, String> map) {
        this.f22162OooO00o = str;
        this.f22163OooO00o = map;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20571OooO00o() {
        return C8932ooOOO0o.OooO0O0(this.f22163OooO00o);
    }

    public void OooO0O0(Map<String, String> map) {
        this.f22164OooO0O0 = map;
    }

    public void OooO00o(String str, String str2) {
        this.f22164OooO0O0.put(str, str2);
    }

    public String OooO00o(String str) {
        return this.f22164OooO0O0.get(str);
    }
}
