package com.tencent.bugly.proguard;

import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.y */
public final class C3372y extends AbstractC3357m implements Cloneable {

    /* renamed from: q */
    public static C3369v f8286q;

    /* renamed from: r */
    public static C3368u f8287r;

    /* renamed from: s */
    public static C3368u f8288s;

    /* renamed from: t */
    public static Map<String, String> f8289t;

    /* renamed from: u */
    public static final /* synthetic */ boolean f8290u = (!C3372y.class.desiredAssertionStatus());

    /* renamed from: a */
    public String f8291a = "";

    /* renamed from: b */
    public String f8292b = "";

    /* renamed from: c */
    public long f8293c = 0;

    /* renamed from: d */
    public int f8294d = 0;

    /* renamed from: e */
    public C3369v f8295e = null;

    /* renamed from: f */
    public C3368u f8296f = null;

    /* renamed from: g */
    public byte f8297g = 0;

    /* renamed from: h */
    public int f8298h = 0;

    /* renamed from: i */
    public long f8299i = 0;

    /* renamed from: j */
    public C3368u f8300j = null;

    /* renamed from: k */
    public String f8301k = "";

    /* renamed from: l */
    public Map<String, String> f8302l = null;

    /* renamed from: m */
    public String f8303m = "";

    /* renamed from: n */
    public int f8304n = 0;

    /* renamed from: o */
    public long f8305o = 0;

    /* renamed from: p */
    public int f8306p = 0;

    public C3372y() {
    }

    /* renamed from: a */
    public long mo38528a() {
        return this.f8293c;
    }

    /* renamed from: b */
    public C3368u mo38529b() {
        return this.f8296f;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8290u) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3372y yVar = (C3372y) obj;
        if (!C3358n.m8592a(this.f8291a, yVar.f8291a) || !C3358n.m8592a(this.f8292b, yVar.f8292b) || !C3358n.m8591a(this.f8293c, yVar.f8293c) || !C3358n.m8590a(this.f8294d, yVar.f8294d) || !C3358n.m8592a(this.f8295e, yVar.f8295e) || !C3358n.m8592a(this.f8296f, yVar.f8296f) || !C3358n.m8589a(this.f8297g, yVar.f8297g) || !C3358n.m8590a(this.f8298h, yVar.f8298h) || !C3358n.m8591a(this.f8299i, yVar.f8299i) || !C3358n.m8592a(this.f8300j, yVar.f8300j) || !C3358n.m8592a(this.f8301k, yVar.f8301k) || !C3358n.m8592a(this.f8302l, yVar.f8302l) || !C3358n.m8592a(this.f8303m, yVar.f8303m) || !C3358n.m8590a(this.f8304n, yVar.f8304n) || !C3358n.m8591a(this.f8305o, yVar.f8305o) || !C3358n.m8590a(this.f8306p, yVar.f8306p)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38481a(this.f8291a, 0);
        lVar.mo38481a(this.f8292b, 1);
        lVar.mo38478a(this.f8293c, 2);
        lVar.mo38477a(this.f8294d, 3);
        lVar.mo38479a((AbstractC3357m) this.f8295e, 4);
        lVar.mo38479a((AbstractC3357m) this.f8296f, 5);
        lVar.mo38493b(this.f8297g, 6);
        lVar.mo38477a(this.f8298h, 7);
        lVar.mo38478a(this.f8299i, 8);
        C3368u uVar = this.f8300j;
        if (uVar != null) {
            lVar.mo38479a((AbstractC3357m) uVar, 9);
        }
        String str = this.f8301k;
        if (str != null) {
            lVar.mo38481a(str, 10);
        }
        Map<String, String> map = this.f8302l;
        if (map != null) {
            lVar.mo38483a((Map) map, 11);
        }
        String str2 = this.f8303m;
        if (str2 != null) {
            lVar.mo38481a(str2, 12);
        }
        lVar.mo38477a(this.f8304n, 13);
        lVar.mo38478a(this.f8305o, 14);
        lVar.mo38477a(this.f8306p, 15);
    }

    public C3372y(String str, String str2, long j, int i, C3369v vVar, C3368u uVar, byte b, int i2, long j2, C3368u uVar2, String str3, Map<String, String> map, String str4, int i3, long j3, int i4) {
        this.f8291a = str;
        this.f8292b = str2;
        this.f8293c = j;
        this.f8294d = i;
        this.f8295e = vVar;
        this.f8296f = uVar;
        this.f8297g = b;
        this.f8298h = i2;
        this.f8299i = j2;
        this.f8300j = uVar2;
        this.f8301k = str3;
        this.f8302l = map;
        this.f8303m = str4;
        this.f8304n = i3;
        this.f8305o = j3;
        this.f8306p = i4;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8291a = kVar.mo38454a(0, true);
        this.f8292b = kVar.mo38454a(1, true);
        this.f8293c = kVar.mo38451a(this.f8293c, 2, true);
        this.f8294d = kVar.mo38449a(this.f8294d, 3, true);
        if (f8286q == null) {
            f8286q = new C3369v();
        }
        this.f8295e = (C3369v) kVar.mo38452a((AbstractC3357m) f8286q, 4, true);
        if (f8287r == null) {
            f8287r = new C3368u();
        }
        this.f8296f = (C3368u) kVar.mo38452a((AbstractC3357m) f8287r, 5, true);
        this.f8297g = kVar.mo38446a(this.f8297g, 6, true);
        this.f8298h = kVar.mo38449a(this.f8298h, 7, false);
        this.f8299i = kVar.mo38451a(this.f8299i, 8, false);
        if (f8288s == null) {
            f8288s = new C3368u();
        }
        this.f8300j = (C3368u) kVar.mo38452a((AbstractC3357m) f8288s, 9, false);
        this.f8301k = kVar.mo38454a(10, false);
        if (f8289t == null) {
            HashMap hashMap = new HashMap();
            f8289t = hashMap;
            hashMap.put("", "");
        }
        this.f8302l = (Map) kVar.mo38453a((Object) f8289t, 11, false);
        this.f8303m = kVar.mo38454a(12, false);
        this.f8304n = kVar.mo38449a(this.f8304n, 13, false);
        this.f8305o = kVar.mo38451a(this.f8305o, 14, false);
        this.f8306p = kVar.mo38449a(this.f8306p, 15, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38434a(this.f8291a, "title");
        iVar.mo38434a(this.f8292b, "newFeature");
        iVar.mo38431a(this.f8293c, "publishTime");
        iVar.mo38430a(this.f8294d, "publishType");
        iVar.mo38432a((AbstractC3357m) this.f8295e, "appBasicInfo");
        iVar.mo38432a((AbstractC3357m) this.f8296f, "apkBaseInfo");
        iVar.mo38426a(this.f8297g, "updateStrategy");
        iVar.mo38430a(this.f8298h, "popTimes");
        iVar.mo38431a(this.f8299i, "popInterval");
        iVar.mo38432a((AbstractC3357m) this.f8300j, "diffApkInfo");
        iVar.mo38434a(this.f8301k, DispatchConstants.NET_TYPE);
        iVar.mo38436a((Map) this.f8302l, "reserved");
        iVar.mo38434a(this.f8303m, "strategyId");
        iVar.mo38430a(this.f8304n, "status");
        iVar.mo38431a(this.f8305o, "updateTime");
        iVar.mo38430a(this.f8306p, "updateType");
    }
}
