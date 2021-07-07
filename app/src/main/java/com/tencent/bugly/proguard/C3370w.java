package com.tencent.bugly.proguard;

import com.p118pd.sdk.C8404oOoo0O00;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.w */
public final class C3370w extends AbstractC3357m implements Cloneable {

    /* renamed from: i */
    public static C3369v f8272i;

    /* renamed from: j */
    public static Map<String, String> f8273j;

    /* renamed from: k */
    public static final /* synthetic */ boolean f8274k = (!C3370w.class.desiredAssertionStatus());

    /* renamed from: a */
    public String f8275a = "";

    /* renamed from: b */
    public long f8276b = 0;

    /* renamed from: c */
    public byte f8277c = 0;

    /* renamed from: d */
    public long f8278d = 0;

    /* renamed from: e */
    public C3369v f8279e = null;

    /* renamed from: f */
    public String f8280f = "";

    /* renamed from: g */
    public int f8281g = 0;

    /* renamed from: h */
    public Map<String, String> f8282h = null;

    public C3370w() {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38481a(this.f8275a, 0);
        lVar.mo38478a(this.f8276b, 1);
        lVar.mo38493b(this.f8277c, 2);
        lVar.mo38478a(this.f8278d, 3);
        C3369v vVar = this.f8279e;
        if (vVar != null) {
            lVar.mo38479a((AbstractC3357m) vVar, 4);
        }
        String str = this.f8280f;
        if (str != null) {
            lVar.mo38481a(str, 5);
        }
        lVar.mo38477a(this.f8281g, 6);
        Map<String, String> map = this.f8282h;
        if (map != null) {
            lVar.mo38483a((Map) map, 7);
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8274k) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3370w wVar = (C3370w) obj;
        if (!C3358n.m8592a(this.f8275a, wVar.f8275a) || !C3358n.m8591a(this.f8276b, wVar.f8276b) || !C3358n.m8589a(this.f8277c, wVar.f8277c) || !C3358n.m8591a(this.f8278d, wVar.f8278d) || !C3358n.m8592a(this.f8279e, wVar.f8279e) || !C3358n.m8592a(this.f8280f, wVar.f8280f) || !C3358n.m8590a(this.f8281g, wVar.f8281g) || !C3358n.m8592a(this.f8282h, wVar.f8282h)) {
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

    public C3370w(String str, long j, byte b, long j2, C3369v vVar, String str2, int i, Map<String, String> map) {
        this.f8275a = str;
        this.f8276b = j;
        this.f8277c = b;
        this.f8278d = j2;
        this.f8279e = vVar;
        this.f8280f = str2;
        this.f8281g = i;
        this.f8282h = map;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8275a = kVar.mo38454a(0, true);
        this.f8276b = kVar.mo38451a(this.f8276b, 1, true);
        this.f8277c = kVar.mo38446a(this.f8277c, 2, true);
        this.f8278d = kVar.mo38451a(this.f8278d, 3, false);
        if (f8272i == null) {
            f8272i = new C3369v();
        }
        this.f8279e = (C3369v) kVar.mo38452a((AbstractC3357m) f8272i, 4, false);
        this.f8280f = kVar.mo38454a(5, false);
        this.f8281g = kVar.mo38449a(this.f8281g, 6, false);
        if (f8273j == null) {
            HashMap hashMap = new HashMap();
            f8273j = hashMap;
            hashMap.put("", "");
        }
        this.f8282h = (Map) kVar.mo38453a((Object) f8273j, 7, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38434a(this.f8275a, "eventType");
        iVar.mo38431a(this.f8276b, C8404oOoo0O00.OooOO0o);
        iVar.mo38426a(this.f8277c, "eventResult");
        iVar.mo38431a(this.f8278d, "eventElapse");
        iVar.mo38432a((AbstractC3357m) this.f8279e, "destAppInfo");
        iVar.mo38434a(this.f8280f, "strategyId");
        iVar.mo38430a(this.f8281g, "updateType");
        iVar.mo38436a((Map) this.f8282h, "reserved");
    }
}
