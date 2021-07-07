package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.tencent.bugly.proguard.z */
public final class C3373z extends AbstractC3357m implements Cloneable {

    /* renamed from: e */
    public static Map<String, String> f8307e;

    /* renamed from: f */
    public static final /* synthetic */ boolean f8308f = (!C3373z.class.desiredAssertionStatus());

    /* renamed from: a */
    public int f8309a = 0;

    /* renamed from: b */
    public String f8310b = "";

    /* renamed from: c */
    public long f8311c = 0;

    /* renamed from: d */
    public Map<String, String> f8312d = null;

    public C3373z() {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38477a(this.f8309a, 0);
        String str = this.f8310b;
        if (str != null) {
            lVar.mo38481a(str, 1);
        }
        lVar.mo38478a(this.f8311c, 2);
        Map<String, String> map = this.f8312d;
        if (map != null) {
            lVar.mo38483a((Map) map, 3);
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8308f) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3373z zVar = (C3373z) obj;
        if (!C3358n.m8590a(this.f8309a, zVar.f8309a) || !C3358n.m8592a(this.f8310b, zVar.f8310b) || !C3358n.m8591a(this.f8311c, zVar.f8311c) || !C3358n.m8592a(this.f8312d, zVar.f8312d)) {
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

    public C3373z(int i, String str, long j, Map<String, String> map) {
        this.f8309a = i;
        this.f8310b = str;
        this.f8311c = j;
        this.f8312d = map;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8309a = kVar.mo38449a(this.f8309a, 0, false);
        this.f8310b = kVar.mo38454a(1, false);
        this.f8311c = kVar.mo38451a(this.f8311c, 2, false);
        if (f8307e == null) {
            HashMap hashMap = new HashMap();
            f8307e = hashMap;
            hashMap.put("", "");
        }
        this.f8312d = (Map) kVar.mo38453a((Object) f8307e, 3, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38430a(this.f8309a, AgooConstants.MESSAGE_FLAG);
        iVar.mo38434a(this.f8310b, "localStrategyId");
        iVar.mo38431a(this.f8311c, "localStrategyTime");
        iVar.mo38436a((Map) this.f8312d, "reserved");
    }
}
