package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bh */
public final class C3344bh extends AbstractC3357m {

    /* renamed from: i */
    public static Map<String, String> f8175i;

    /* renamed from: a */
    public long f8176a = 0;

    /* renamed from: b */
    public byte f8177b = 0;

    /* renamed from: c */
    public String f8178c = "";

    /* renamed from: d */
    public String f8179d = "";

    /* renamed from: e */
    public String f8180e = "";

    /* renamed from: f */
    public Map<String, String> f8181f = null;

    /* renamed from: g */
    public String f8182g = "";

    /* renamed from: h */
    public boolean f8183h = true;

    static {
        HashMap hashMap = new HashMap();
        f8175i = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38478a(this.f8176a, 0);
        lVar.mo38493b(this.f8177b, 1);
        String str = this.f8178c;
        if (str != null) {
            lVar.mo38481a(str, 2);
        }
        String str2 = this.f8179d;
        if (str2 != null) {
            lVar.mo38481a(str2, 3);
        }
        String str3 = this.f8180e;
        if (str3 != null) {
            lVar.mo38481a(str3, 4);
        }
        Map<String, String> map = this.f8181f;
        if (map != null) {
            lVar.mo38483a((Map) map, 5);
        }
        String str4 = this.f8182g;
        if (str4 != null) {
            lVar.mo38481a(str4, 6);
        }
        lVar.mo38485a(this.f8183h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8176a = kVar.mo38451a(this.f8176a, 0, true);
        this.f8177b = kVar.mo38446a(this.f8177b, 1, true);
        this.f8178c = kVar.mo38454a(2, false);
        this.f8179d = kVar.mo38454a(3, false);
        this.f8180e = kVar.mo38454a(4, false);
        this.f8181f = (Map) kVar.mo38453a((Object) f8175i, 5, false);
        this.f8182g = kVar.mo38454a(6, false);
        this.f8183h = kVar.mo38462a(this.f8183h, 7, false);
    }
}
