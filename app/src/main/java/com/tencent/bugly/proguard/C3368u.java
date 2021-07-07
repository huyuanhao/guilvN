package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.u */
public final class C3368u extends AbstractC3357m implements Cloneable {

    /* renamed from: f */
    public static final /* synthetic */ boolean f8254f = (!C3368u.class.desiredAssertionStatus());

    /* renamed from: a */
    public String f8255a = "";

    /* renamed from: b */
    public String f8256b = "";

    /* renamed from: c */
    public String f8257c = "";

    /* renamed from: d */
    public long f8258d = 0;

    /* renamed from: e */
    public String f8259e = "";

    public C3368u() {
    }

    /* renamed from: a */
    public String mo38515a() {
        return this.f8256b;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8254f) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3368u uVar = (C3368u) obj;
        if (!C3358n.m8592a(this.f8255a, uVar.f8255a) || !C3358n.m8592a(this.f8256b, uVar.f8256b) || !C3358n.m8592a(this.f8257c, uVar.f8257c) || !C3358n.m8591a(this.f8258d, uVar.f8258d) || !C3358n.m8592a(this.f8259e, uVar.f8259e)) {
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
        lVar.mo38481a(this.f8255a, 0);
        lVar.mo38481a(this.f8256b, 1);
        String str = this.f8257c;
        if (str != null) {
            lVar.mo38481a(str, 2);
        }
        lVar.mo38478a(this.f8258d, 3);
        String str2 = this.f8259e;
        if (str2 != null) {
            lVar.mo38481a(str2, 4);
        }
    }

    public C3368u(String str, String str2, String str3, long j, String str4) {
        this.f8255a = str;
        this.f8256b = str2;
        this.f8257c = str3;
        this.f8258d = j;
        this.f8259e = str4;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8255a = kVar.mo38454a(0, true);
        this.f8256b = kVar.mo38454a(1, true);
        this.f8257c = kVar.mo38454a(2, false);
        this.f8258d = kVar.mo38451a(this.f8258d, 3, true);
        this.f8259e = kVar.mo38454a(4, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38434a(this.f8255a, "apkMd5");
        iVar.mo38434a(this.f8256b, "apkUrl");
        iVar.mo38434a(this.f8257c, "manifestMd5");
        iVar.mo38431a(this.f8258d, "fileSize");
        iVar.mo38434a(this.f8259e, "signatureMd5");
    }
}
