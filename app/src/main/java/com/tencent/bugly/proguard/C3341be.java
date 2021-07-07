package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.be */
public final class C3341be extends AbstractC3357m {

    /* renamed from: i */
    public static byte[] f8148i;

    /* renamed from: j */
    public static Map<String, String> f8149j;

    /* renamed from: a */
    public byte f8150a = 0;

    /* renamed from: b */
    public int f8151b = 0;

    /* renamed from: c */
    public byte[] f8152c = null;

    /* renamed from: d */
    public String f8153d = "";

    /* renamed from: e */
    public long f8154e = 0;

    /* renamed from: f */
    public String f8155f = "";

    /* renamed from: g */
    public String f8156g = "";

    /* renamed from: h */
    public Map<String, String> f8157h = null;

    static {
        byte[] bArr = new byte[1];
        f8148i = bArr;
        bArr[0] = 0;
        HashMap hashMap = new HashMap();
        f8149j = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38493b(this.f8150a, 0);
        lVar.mo38477a(this.f8151b, 1);
        byte[] bArr = this.f8152c;
        if (bArr != null) {
            lVar.mo38486a(bArr, 2);
        }
        String str = this.f8153d;
        if (str != null) {
            lVar.mo38481a(str, 3);
        }
        lVar.mo38478a(this.f8154e, 4);
        String str2 = this.f8155f;
        if (str2 != null) {
            lVar.mo38481a(str2, 5);
        }
        String str3 = this.f8156g;
        if (str3 != null) {
            lVar.mo38481a(str3, 6);
        }
        Map<String, String> map = this.f8157h;
        if (map != null) {
            lVar.mo38483a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8150a = kVar.mo38446a(this.f8150a, 0, true);
        this.f8151b = kVar.mo38449a(this.f8151b, 1, true);
        this.f8152c = kVar.mo38463a(f8148i, 2, false);
        this.f8153d = kVar.mo38454a(3, false);
        this.f8154e = kVar.mo38451a(this.f8154e, 4, false);
        this.f8155f = kVar.mo38454a(5, false);
        this.f8156g = kVar.mo38454a(6, false);
        this.f8157h = (Map) kVar.mo38453a((Object) f8149j, 7, false);
    }
}
