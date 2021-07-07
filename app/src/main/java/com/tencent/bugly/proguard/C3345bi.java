package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bi */
public final class C3345bi extends AbstractC3357m implements Cloneable {

    /* renamed from: f */
    public static ArrayList<C3344bh> f8184f;

    /* renamed from: g */
    public static Map<String, String> f8185g;

    /* renamed from: a */
    public byte f8186a = 0;

    /* renamed from: b */
    public String f8187b = "";

    /* renamed from: c */
    public String f8188c = "";

    /* renamed from: d */
    public ArrayList<C3344bh> f8189d = null;

    /* renamed from: e */
    public Map<String, String> f8190e = null;

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38493b(this.f8186a, 0);
        String str = this.f8187b;
        if (str != null) {
            lVar.mo38481a(str, 1);
        }
        String str2 = this.f8188c;
        if (str2 != null) {
            lVar.mo38481a(str2, 2);
        }
        ArrayList<C3344bh> arrayList = this.f8189d;
        if (arrayList != null) {
            lVar.mo38482a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f8190e;
        if (map != null) {
            lVar.mo38483a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8186a = kVar.mo38446a(this.f8186a, 0, true);
        this.f8187b = kVar.mo38454a(1, false);
        this.f8188c = kVar.mo38454a(2, false);
        if (f8184f == null) {
            f8184f = new ArrayList<>();
            f8184f.add(new C3344bh());
        }
        this.f8189d = (ArrayList) kVar.mo38453a((Object) f8184f, 3, false);
        if (f8185g == null) {
            HashMap hashMap = new HashMap();
            f8185g = hashMap;
            hashMap.put("", "");
        }
        this.f8190e = (Map) kVar.mo38453a((Object) f8185g, 4, false);
    }
}
