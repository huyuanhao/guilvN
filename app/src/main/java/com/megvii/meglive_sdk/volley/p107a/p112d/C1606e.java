package com.megvii.meglive_sdk.volley.p107a.p112d;

import com.megvii.meglive_sdk.volley.p107a.AbstractC1615h;
import com.megvii.meglive_sdk.volley.p107a.C1610f;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1611a;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1612b;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import java.io.Serializable;

/* renamed from: com.megvii.meglive_sdk.volley.a.d.e */
public final class C1606e implements AbstractC1615h, Serializable, Cloneable {

    /* renamed from: a */
    public final C1610f f2842a;

    /* renamed from: b */
    public final int f2843b;

    /* renamed from: c */
    public final String f2844c;

    public C1606e(C1610f fVar, int i, String str) {
        this.f2842a = (C1610f) C1611a.m2771a(fVar, AbstractC7726o0ooOOoo.OooO0o0);
        this.f2843b = C1611a.m2770a(i, "Status code");
        this.f2844c = str;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1615h
    /* renamed from: a */
    public final C1610f mo17312a() {
        return this.f2842a;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1615h
    /* renamed from: b */
    public final int mo17313b() {
        return this.f2843b;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1615h
    /* renamed from: c */
    public final String mo17314c() {
        return this.f2844c;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        C1605d dVar = C1605d.f2841b;
        C1611a.m2771a(this, "Status line");
        C1612b a = C1605d.m2762a();
        int a2 = C1605d.m2761a(mo17312a()) + 1 + 3 + 1;
        String c = mo17314c();
        if (c != null) {
            a2 += c.length();
        }
        a.mo17327a(a2);
        C1610f a3 = mo17312a();
        C1611a.m2771a(a3, "Protocol version");
        a.mo17327a(C1605d.m2761a(a3));
        a.mo17328a(a3.mo17319a());
        a.mo17326a('/');
        a.mo17328a(Integer.toString(a3.mo17320b()));
        a.mo17326a('.');
        a.mo17328a(Integer.toString(a3.mo17321c()));
        a.mo17326a(' ');
        a.mo17328a(Integer.toString(mo17313b()));
        a.mo17326a(' ');
        if (c != null) {
            a.mo17328a(c);
        }
        return a.toString();
    }
}
