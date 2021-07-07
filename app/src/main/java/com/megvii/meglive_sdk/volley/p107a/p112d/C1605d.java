package com.megvii.meglive_sdk.volley.p107a.p112d;

import com.megvii.meglive_sdk.volley.p107a.AbstractC1594a;
import com.megvii.meglive_sdk.volley.p107a.C1610f;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1611a;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1612b;

/* renamed from: com.megvii.meglive_sdk.volley.a.d.d */
public final class C1605d {
    @Deprecated

    /* renamed from: a */
    public static final C1605d f2840a = new C1605d();

    /* renamed from: b */
    public static final C1605d f2841b = new C1605d();

    /* renamed from: a */
    public static C1612b m2762a() {
        return new C1612b();
    }

    /* renamed from: a */
    public static int m2761a(C1610f fVar) {
        return fVar.mo17319a().length() + 4;
    }

    /* renamed from: a */
    public static C1612b m2763a(AbstractC1594a aVar) {
        C1611a.m2771a(aVar, "Header");
        C1612b bVar = new C1612b();
        String a = aVar.mo17297a();
        String b = aVar.mo17298b();
        int length = a.length() + 2;
        if (b != null) {
            length += b.length();
        }
        bVar.mo17327a(length);
        bVar.mo17328a(a);
        bVar.mo17328a(": ");
        if (b != null) {
            bVar.mo17328a(b);
        }
        return bVar;
    }
}
