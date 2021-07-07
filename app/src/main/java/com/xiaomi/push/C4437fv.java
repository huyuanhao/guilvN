package com.xiaomi.push;

import java.util.Map;

/* renamed from: com.xiaomi.push.fv */
public class C4437fv implements Cloneable {

    /* renamed from: a */
    public static String f11977a = "wcc-ml-test10.bj";

    /* renamed from: b */
    public static final String f11978b = C4247ae.f11349a;

    /* renamed from: c */
    public static String f11979c = null;

    /* renamed from: a */
    public int f11980a;

    /* renamed from: a */
    public AbstractC4440fy f11981a;

    /* renamed from: a */
    public boolean f11982a = AbstractC4435fu.f11957a;

    /* renamed from: b */
    public boolean f11983b = true;

    /* renamed from: d */
    public String f11984d;

    /* renamed from: e */
    public String f11985e;

    /* renamed from: f */
    public String f11986f;

    public C4437fv(Map<String, Integer> map, int i, String str, AbstractC4440fy fyVar) {
        m12680a(map, i, str, fyVar);
    }

    /* renamed from: a */
    public static final String mo41912a() {
        String str = f11979c;
        return str != null ? str : C4244ab.m11628a() ? "sandbox.xmpush.xiaomi.com" : C4244ab.m11629b() ? f11978b : "app.chat.xiaomi.net";
    }

    /* renamed from: a */
    public static final void m12679a(String str) {
        f11979c = str;
    }

    /* renamed from: a */
    private void m12680a(Map<String, Integer> map, int i, String str, AbstractC4440fy fyVar) {
        this.f11980a = i;
        this.f11984d = str;
        this.f11981a = fyVar;
    }

    /* renamed from: a */
    public int m12681a() {
        return this.f11980a;
    }

    /* renamed from: a */
    public void mo41913a(boolean z) {
        this.f11982a = z;
    }

    /* renamed from: a */
    public boolean m12683a() {
        return this.f11982a;
    }

    /* renamed from: a */
    public byte[] m12684a() {
        return null;
    }

    /* renamed from: b */
    public String mo41914b() {
        return this.f11986f;
    }

    /* renamed from: b */
    public void mo41915b(String str) {
        this.f11986f = str;
    }

    /* renamed from: c */
    public String mo41916c() {
        if (this.f11985e == null) {
            this.f11985e = mo41912a();
        }
        return this.f11985e;
    }

    /* renamed from: c */
    public void mo41917c(String str) {
        this.f11985e = str;
    }
}
