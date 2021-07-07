package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.aa */
public final class C3301aa extends AbstractC3357m implements Cloneable {

    /* renamed from: c */
    public static C3343bg f7937c;

    /* renamed from: d */
    public static C3372y f7938d;

    /* renamed from: e */
    public static final /* synthetic */ boolean f7939e = (!C3301aa.class.desiredAssertionStatus());

    /* renamed from: a */
    public C3343bg f7940a = null;

    /* renamed from: b */
    public C3372y f7941b = null;

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        C3343bg bgVar = this.f7940a;
        if (bgVar != null) {
            lVar.mo38479a((AbstractC3357m) bgVar, 0);
        }
        C3372y yVar = this.f7941b;
        if (yVar != null) {
            lVar.mo38479a((AbstractC3357m) yVar, 1);
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f7939e) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3301aa aaVar = (C3301aa) obj;
        if (!C3358n.m8592a(this.f7940a, aaVar.f7940a) || !C3358n.m8592a(this.f7941b, aaVar.f7941b)) {
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
        if (f7937c == null) {
            f7937c = new C3343bg();
        }
        this.f7940a = (C3343bg) kVar.mo38452a((AbstractC3357m) f7937c, 0, false);
        if (f7938d == null) {
            f7938d = new C3372y();
        }
        this.f7941b = (C3372y) kVar.mo38452a((AbstractC3357m) f7938d, 1, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38432a((AbstractC3357m) this.f7940a, "baseStrategy");
        iVar.mo38432a((AbstractC3357m) this.f7941b, "grayStrategy");
    }
}
