package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bd */
public final class C3340bd extends AbstractC3357m {

    /* renamed from: y */
    public static byte[] f8122y;

    /* renamed from: z */
    public static Map<String, String> f8123z;

    /* renamed from: a */
    public int f8124a = 0;

    /* renamed from: b */
    public String f8125b = "";

    /* renamed from: c */
    public String f8126c = "";

    /* renamed from: d */
    public String f8127d = "";

    /* renamed from: e */
    public String f8128e = "";

    /* renamed from: f */
    public String f8129f = "";

    /* renamed from: g */
    public int f8130g = 0;

    /* renamed from: h */
    public byte[] f8131h = null;

    /* renamed from: i */
    public String f8132i = "";

    /* renamed from: j */
    public String f8133j = "";

    /* renamed from: k */
    public Map<String, String> f8134k = null;

    /* renamed from: l */
    public String f8135l = "";

    /* renamed from: m */
    public long f8136m = 0;

    /* renamed from: n */
    public String f8137n = "";

    /* renamed from: o */
    public String f8138o = "";

    /* renamed from: p */
    public String f8139p = "";

    /* renamed from: q */
    public long f8140q = 0;

    /* renamed from: r */
    public String f8141r = "";

    /* renamed from: s */
    public String f8142s = "";

    /* renamed from: t */
    public String f8143t = "";

    /* renamed from: u */
    public String f8144u = "";

    /* renamed from: v */
    public String f8145v = "";

    /* renamed from: w */
    public String f8146w = "";

    /* renamed from: x */
    public String f8147x = "";

    static {
        byte[] bArr = new byte[1];
        f8122y = bArr;
        bArr[0] = 0;
        HashMap hashMap = new HashMap();
        f8123z = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38477a(this.f8124a, 0);
        lVar.mo38481a(this.f8125b, 1);
        lVar.mo38481a(this.f8126c, 2);
        lVar.mo38481a(this.f8127d, 3);
        String str = this.f8128e;
        if (str != null) {
            lVar.mo38481a(str, 4);
        }
        lVar.mo38481a(this.f8129f, 5);
        lVar.mo38477a(this.f8130g, 6);
        lVar.mo38486a(this.f8131h, 7);
        String str2 = this.f8132i;
        if (str2 != null) {
            lVar.mo38481a(str2, 8);
        }
        String str3 = this.f8133j;
        if (str3 != null) {
            lVar.mo38481a(str3, 9);
        }
        Map<String, String> map = this.f8134k;
        if (map != null) {
            lVar.mo38483a((Map) map, 10);
        }
        String str4 = this.f8135l;
        if (str4 != null) {
            lVar.mo38481a(str4, 11);
        }
        lVar.mo38478a(this.f8136m, 12);
        String str5 = this.f8137n;
        if (str5 != null) {
            lVar.mo38481a(str5, 13);
        }
        String str6 = this.f8138o;
        if (str6 != null) {
            lVar.mo38481a(str6, 14);
        }
        String str7 = this.f8139p;
        if (str7 != null) {
            lVar.mo38481a(str7, 15);
        }
        lVar.mo38478a(this.f8140q, 16);
        String str8 = this.f8141r;
        if (str8 != null) {
            lVar.mo38481a(str8, 17);
        }
        String str9 = this.f8142s;
        if (str9 != null) {
            lVar.mo38481a(str9, 18);
        }
        String str10 = this.f8143t;
        if (str10 != null) {
            lVar.mo38481a(str10, 19);
        }
        String str11 = this.f8144u;
        if (str11 != null) {
            lVar.mo38481a(str11, 20);
        }
        String str12 = this.f8145v;
        if (str12 != null) {
            lVar.mo38481a(str12, 21);
        }
        String str13 = this.f8146w;
        if (str13 != null) {
            lVar.mo38481a(str13, 22);
        }
        String str14 = this.f8147x;
        if (str14 != null) {
            lVar.mo38481a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8124a = kVar.mo38449a(this.f8124a, 0, true);
        this.f8125b = kVar.mo38454a(1, true);
        this.f8126c = kVar.mo38454a(2, true);
        this.f8127d = kVar.mo38454a(3, true);
        this.f8128e = kVar.mo38454a(4, false);
        this.f8129f = kVar.mo38454a(5, true);
        this.f8130g = kVar.mo38449a(this.f8130g, 6, true);
        this.f8131h = kVar.mo38463a(f8122y, 7, true);
        this.f8132i = kVar.mo38454a(8, false);
        this.f8133j = kVar.mo38454a(9, false);
        this.f8134k = (Map) kVar.mo38453a((Object) f8123z, 10, false);
        this.f8135l = kVar.mo38454a(11, false);
        this.f8136m = kVar.mo38451a(this.f8136m, 12, false);
        this.f8137n = kVar.mo38454a(13, false);
        this.f8138o = kVar.mo38454a(14, false);
        this.f8139p = kVar.mo38454a(15, false);
        this.f8140q = kVar.mo38451a(this.f8140q, 16, false);
        this.f8141r = kVar.mo38454a(17, false);
        this.f8142s = kVar.mo38454a(18, false);
        this.f8143t = kVar.mo38454a(19, false);
        this.f8144u = kVar.mo38454a(20, false);
        this.f8145v = kVar.mo38454a(21, false);
        this.f8146w = kVar.mo38454a(22, false);
        this.f8147x = kVar.mo38454a(23, false);
    }
}
