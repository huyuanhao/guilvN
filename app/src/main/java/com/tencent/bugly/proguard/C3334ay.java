package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ay */
public final class C3334ay extends AbstractC3357m implements Cloneable {

    /* renamed from: a */
    public String f8079a = "";

    /* renamed from: b */
    public String f8080b = "";

    /* renamed from: c */
    public String f8081c = "";

    /* renamed from: d */
    public String f8082d = "";

    /* renamed from: e */
    public String f8083e = "";

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38481a(this.f8079a, 0);
        String str = this.f8080b;
        if (str != null) {
            lVar.mo38481a(str, 1);
        }
        String str2 = this.f8081c;
        if (str2 != null) {
            lVar.mo38481a(str2, 2);
        }
        String str3 = this.f8082d;
        if (str3 != null) {
            lVar.mo38481a(str3, 3);
        }
        String str4 = this.f8083e;
        if (str4 != null) {
            lVar.mo38481a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8079a = kVar.mo38454a(0, true);
        this.f8080b = kVar.mo38454a(1, false);
        this.f8081c = kVar.mo38454a(2, false);
        this.f8082d = kVar.mo38454a(3, false);
        this.f8083e = kVar.mo38454a(4, false);
    }
}
