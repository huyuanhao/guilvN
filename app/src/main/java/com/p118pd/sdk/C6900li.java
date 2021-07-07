package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨丨i  reason: invalid class name and case insensitive filesystem */
public class C6900li implements AbstractC6317ilLi {
    public C6175iLLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public il1l1l f19042OooO00o;
    public C6175iLLl OooO0O0;

    public C6175iLLl OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public il1l1l m18067OooO00o() {
        return this.f19042OooO00o;
    }

    public void OooO00o(C6175iLLl r1) {
        this.OooO00o = r1;
    }

    public void OooO00o(il1l1l r1) {
        this.f19042OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        try {
            if (!(obj instanceof il1l1l)) {
                return false;
            }
            il1l1l r1 = (il1l1l) obj;
            if (this.OooO00o != null && !this.OooO00o.OooO00o(r1.OooO00o())) {
                return false;
            }
            if (this.OooO0O0 != null && !this.OooO0O0.OooO00o(r1.OooO0O0())) {
                return false;
            }
            if (this.f19042OooO00o != null) {
                return this.f19042OooO00o.equals(obj);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public C6175iLLl OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0O0(C6175iLLl r1) {
        this.OooO0O0 = r1;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        C6900li r0 = new C6900li();
        r0.f19042OooO00o = this.f19042OooO00o;
        C6175iLLl r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o((C6175iLLl) r1.clone());
        }
        C6175iLLl r12 = this.OooO0O0;
        if (r12 != null) {
            r0.OooO0O0((C6175iLLl) r12.clone());
        }
        return r0;
    }
}
