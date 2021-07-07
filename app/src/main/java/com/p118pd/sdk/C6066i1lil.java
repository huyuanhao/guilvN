package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.i1丨l丨il  reason: invalid class name and case insensitive filesystem */
public class C6066i1lil extends AbstractC5738Lil implements AbstractC5462Ilil {
    public C5424Il1Ll1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5559IlL f17467OooO00o;

    public C6066i1lil(C5424Il1Ll1 r1) {
        this.OooO00o = r1;
    }

    public C6066i1lil(C5559IlL r1) {
        this.f17467OooO00o = r1;
    }

    public static C6066i1lil OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6066i1lil OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6066i1lil)) {
            return (C6066i1lil) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        } else if (obj instanceof I11li1) {
            return new C6066i1lil(C5559IlL.OooO00o(obj));
        } else {
            if (obj instanceof AbstractC5903LlLLL) {
                return new C6066i1lil(C5424Il1Ll1.OooO00o(AbstractC5903LlLLL.OooO00o(obj), false));
            }
            throw new IllegalArgumentException("Couldn't convert from object to DVCSResponse: " + obj.getClass().getName());
        }
    }

    public C5424Il1Ll1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5559IlL m16926OooO00o() {
        return this.f17467OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C5559IlL r0 = this.f17467OooO00o;
        return r0 != null ? r0.m15859OooO0O0() : new ILI1Ll(false, 0, this.OooO00o);
    }

    public String toString() {
        StringBuilder sb;
        String r2;
        if (this.f17467OooO00o != null) {
            sb = new StringBuilder();
            sb.append("DVCSResponse {\ndvCertInfo: ");
            r2 = this.f17467OooO00o.toString();
        } else {
            sb = new StringBuilder();
            sb.append("DVCSResponse {\ndvErrorNote: ");
            r2 = this.OooO00o.toString();
        }
        sb.append(r2);
        sb.append("}\n");
        return sb.toString();
    }
}
