package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bg */
public final class C3343bg extends AbstractC3357m implements Cloneable {

    /* renamed from: m */
    public static C3342bf f8160m = new C3342bf();

    /* renamed from: n */
    public static Map<String, String> f8161n;

    /* renamed from: o */
    public static final /* synthetic */ boolean f8162o = (!C3343bg.class.desiredAssertionStatus());

    /* renamed from: a */
    public boolean f8163a = true;

    /* renamed from: b */
    public boolean f8164b = true;

    /* renamed from: c */
    public boolean f8165c = true;

    /* renamed from: d */
    public String f8166d = "";

    /* renamed from: e */
    public String f8167e = "";

    /* renamed from: f */
    public C3342bf f8168f = null;

    /* renamed from: g */
    public Map<String, String> f8169g = null;

    /* renamed from: h */
    public long f8170h = 0;

    /* renamed from: i */
    public String f8171i = "";

    /* renamed from: j */
    public String f8172j = "";

    /* renamed from: k */
    public int f8173k = 0;

    /* renamed from: l */
    public int f8174l = 0;

    static {
        HashMap hashMap = new HashMap();
        f8161n = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38485a(this.f8163a, 0);
        lVar.mo38485a(this.f8164b, 1);
        lVar.mo38485a(this.f8165c, 2);
        String str = this.f8166d;
        if (str != null) {
            lVar.mo38481a(str, 3);
        }
        String str2 = this.f8167e;
        if (str2 != null) {
            lVar.mo38481a(str2, 4);
        }
        C3342bf bfVar = this.f8168f;
        if (bfVar != null) {
            lVar.mo38479a((AbstractC3357m) bfVar, 5);
        }
        Map<String, String> map = this.f8169g;
        if (map != null) {
            lVar.mo38483a((Map) map, 6);
        }
        lVar.mo38478a(this.f8170h, 7);
        String str3 = this.f8171i;
        if (str3 != null) {
            lVar.mo38481a(str3, 8);
        }
        String str4 = this.f8172j;
        if (str4 != null) {
            lVar.mo38481a(str4, 9);
        }
        lVar.mo38477a(this.f8173k, 10);
        lVar.mo38477a(this.f8174l, 11);
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8162o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3343bg bgVar = (C3343bg) obj;
        if (!C3358n.m8593a(this.f8163a, bgVar.f8163a) || !C3358n.m8593a(this.f8164b, bgVar.f8164b) || !C3358n.m8593a(this.f8165c, bgVar.f8165c) || !C3358n.m8592a(this.f8166d, bgVar.f8166d) || !C3358n.m8592a(this.f8167e, bgVar.f8167e) || !C3358n.m8592a(this.f8168f, bgVar.f8168f) || !C3358n.m8592a(this.f8169g, bgVar.f8169g) || !C3358n.m8591a(this.f8170h, bgVar.f8170h) || !C3358n.m8592a(this.f8171i, bgVar.f8171i) || !C3358n.m8592a(this.f8172j, bgVar.f8172j) || !C3358n.m8590a(this.f8173k, bgVar.f8173k) || !C3358n.m8590a(this.f8174l, bgVar.f8174l)) {
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
    public void mo38326a(C3354k kVar) {
        this.f8163a = kVar.mo38462a(this.f8163a, 0, true);
        this.f8164b = kVar.mo38462a(this.f8164b, 1, true);
        this.f8165c = kVar.mo38462a(this.f8165c, 2, true);
        this.f8166d = kVar.mo38454a(3, false);
        this.f8167e = kVar.mo38454a(4, false);
        this.f8168f = (C3342bf) kVar.mo38452a((AbstractC3357m) f8160m, 5, false);
        this.f8169g = (Map) kVar.mo38453a((Object) f8161n, 6, false);
        this.f8170h = kVar.mo38451a(this.f8170h, 7, false);
        this.f8171i = kVar.mo38454a(8, false);
        this.f8172j = kVar.mo38454a(9, false);
        this.f8173k = kVar.mo38449a(this.f8173k, 10, false);
        this.f8174l = kVar.mo38449a(this.f8174l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38438a(this.f8163a, "enable");
        iVar.mo38438a(this.f8164b, "enableUserInfo");
        iVar.mo38438a(this.f8165c, "enableQuery");
        iVar.mo38434a(this.f8166d, "url");
        iVar.mo38434a(this.f8167e, "expUrl");
        iVar.mo38432a((AbstractC3357m) this.f8168f, "security");
        iVar.mo38436a((Map) this.f8169g, "valueMap");
        iVar.mo38431a(this.f8170h, "strategylastUpdateTime");
        iVar.mo38434a(this.f8171i, "httpsUrl");
        iVar.mo38434a(this.f8172j, "httpsExpUrl");
        iVar.mo38430a(this.f8173k, "eventRecordCount");
        iVar.mo38430a(this.f8174l, "eventTimeInterval");
    }
}
