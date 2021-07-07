package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bb */
public final class C3338bb extends AbstractC3357m {

    /* renamed from: A */
    public static ArrayList<C3337ba> f8091A = new ArrayList<>();

    /* renamed from: B */
    public static Map<String, String> f8092B;

    /* renamed from: C */
    public static Map<String, String> f8093C;

    /* renamed from: v */
    public static Map<String, String> f8094v;

    /* renamed from: w */
    public static C3335az f8095w = new C3335az();

    /* renamed from: x */
    public static C3334ay f8096x = new C3334ay();

    /* renamed from: y */
    public static ArrayList<C3334ay> f8097y = new ArrayList<>();

    /* renamed from: z */
    public static ArrayList<C3334ay> f8098z = new ArrayList<>();

    /* renamed from: a */
    public String f8099a = "";

    /* renamed from: b */
    public long f8100b = 0;

    /* renamed from: c */
    public String f8101c = "";

    /* renamed from: d */
    public String f8102d = "";

    /* renamed from: e */
    public String f8103e = "";

    /* renamed from: f */
    public String f8104f = "";

    /* renamed from: g */
    public String f8105g = "";

    /* renamed from: h */
    public Map<String, String> f8106h = null;

    /* renamed from: i */
    public String f8107i = "";

    /* renamed from: j */
    public C3335az f8108j = null;

    /* renamed from: k */
    public int f8109k = 0;

    /* renamed from: l */
    public String f8110l = "";

    /* renamed from: m */
    public String f8111m = "";

    /* renamed from: n */
    public C3334ay f8112n = null;

    /* renamed from: o */
    public ArrayList<C3334ay> f8113o = null;

    /* renamed from: p */
    public ArrayList<C3334ay> f8114p = null;

    /* renamed from: q */
    public ArrayList<C3337ba> f8115q = null;

    /* renamed from: r */
    public Map<String, String> f8116r = null;

    /* renamed from: s */
    public Map<String, String> f8117s = null;

    /* renamed from: t */
    public String f8118t = "";

    /* renamed from: u */
    public boolean f8119u = true;

    static {
        HashMap hashMap = new HashMap();
        f8094v = hashMap;
        hashMap.put("", "");
        f8097y.add(new C3334ay());
        f8098z.add(new C3334ay());
        f8091A.add(new C3337ba());
        HashMap hashMap2 = new HashMap();
        f8092B = hashMap2;
        hashMap2.put("", "");
        HashMap hashMap3 = new HashMap();
        f8093C = hashMap3;
        hashMap3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38481a(this.f8099a, 0);
        lVar.mo38478a(this.f8100b, 1);
        lVar.mo38481a(this.f8101c, 2);
        String str = this.f8102d;
        if (str != null) {
            lVar.mo38481a(str, 3);
        }
        String str2 = this.f8103e;
        if (str2 != null) {
            lVar.mo38481a(str2, 4);
        }
        String str3 = this.f8104f;
        if (str3 != null) {
            lVar.mo38481a(str3, 5);
        }
        String str4 = this.f8105g;
        if (str4 != null) {
            lVar.mo38481a(str4, 6);
        }
        Map<String, String> map = this.f8106h;
        if (map != null) {
            lVar.mo38483a((Map) map, 7);
        }
        String str5 = this.f8107i;
        if (str5 != null) {
            lVar.mo38481a(str5, 8);
        }
        C3335az azVar = this.f8108j;
        if (azVar != null) {
            lVar.mo38479a((AbstractC3357m) azVar, 9);
        }
        lVar.mo38477a(this.f8109k, 10);
        String str6 = this.f8110l;
        if (str6 != null) {
            lVar.mo38481a(str6, 11);
        }
        String str7 = this.f8111m;
        if (str7 != null) {
            lVar.mo38481a(str7, 12);
        }
        C3334ay ayVar = this.f8112n;
        if (ayVar != null) {
            lVar.mo38479a((AbstractC3357m) ayVar, 13);
        }
        ArrayList<C3334ay> arrayList = this.f8113o;
        if (arrayList != null) {
            lVar.mo38482a((Collection) arrayList, 14);
        }
        ArrayList<C3334ay> arrayList2 = this.f8114p;
        if (arrayList2 != null) {
            lVar.mo38482a((Collection) arrayList2, 15);
        }
        ArrayList<C3337ba> arrayList3 = this.f8115q;
        if (arrayList3 != null) {
            lVar.mo38482a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f8116r;
        if (map2 != null) {
            lVar.mo38483a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f8117s;
        if (map3 != null) {
            lVar.mo38483a((Map) map3, 18);
        }
        String str8 = this.f8118t;
        if (str8 != null) {
            lVar.mo38481a(str8, 19);
        }
        lVar.mo38485a(this.f8119u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8099a = kVar.mo38454a(0, true);
        this.f8100b = kVar.mo38451a(this.f8100b, 1, true);
        this.f8101c = kVar.mo38454a(2, true);
        this.f8102d = kVar.mo38454a(3, false);
        this.f8103e = kVar.mo38454a(4, false);
        this.f8104f = kVar.mo38454a(5, false);
        this.f8105g = kVar.mo38454a(6, false);
        this.f8106h = (Map) kVar.mo38453a((Object) f8094v, 7, false);
        this.f8107i = kVar.mo38454a(8, false);
        this.f8108j = (C3335az) kVar.mo38452a((AbstractC3357m) f8095w, 9, false);
        this.f8109k = kVar.mo38449a(this.f8109k, 10, false);
        this.f8110l = kVar.mo38454a(11, false);
        this.f8111m = kVar.mo38454a(12, false);
        this.f8112n = (C3334ay) kVar.mo38452a((AbstractC3357m) f8096x, 13, false);
        this.f8113o = (ArrayList) kVar.mo38453a((Object) f8097y, 14, false);
        this.f8114p = (ArrayList) kVar.mo38453a((Object) f8098z, 15, false);
        this.f8115q = (ArrayList) kVar.mo38453a((Object) f8091A, 16, false);
        this.f8116r = (Map) kVar.mo38453a((Object) f8092B, 17, false);
        this.f8117s = (Map) kVar.mo38453a((Object) f8093C, 18, false);
        this.f8118t = kVar.mo38454a(19, false);
        this.f8119u = kVar.mo38462a(this.f8119u, 20, false);
    }
}
