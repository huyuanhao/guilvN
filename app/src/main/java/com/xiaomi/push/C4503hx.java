package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.hx */
public class C4503hx implements AbstractC4532iz<C4503hx, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12398a = new C4546jh("", (byte) 8, 1);

    /* renamed from: a */
    public static final C4554jp f12399a = new C4554jp("NormalConfig");

    /* renamed from: b */
    public static final C4546jh f12400b = new C4546jh("", (byte) 15, 2);

    /* renamed from: c */
    public static final C4546jh f12401c = new C4546jh("", (byte) 8, 3);

    /* renamed from: a */
    public int f12402a;

    /* renamed from: a */
    public EnumC4500hu f12403a;

    /* renamed from: a */
    public BitSet f12404a = new BitSet(1);

    /* renamed from: a */
    public List<C4505hz> f12405a;

    /* renamed from: a */
    public int mo42057a() {
        return this.f12402a;
    }

    /* renamed from: a */
    public int compareTo(C4503hx hxVar) {
        int a;
        int a2;
        int a3;
        if (!C4503hx.class.equals(hxVar.getClass())) {
            return C4503hx.class.getName().compareTo(hxVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12998a()).compareTo(Boolean.valueOf(hxVar.m12998a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12998a() && (a3 = C4537ja.m13598a(this.f12402a, hxVar.f12402a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo42060b()).compareTo(Boolean.valueOf(hxVar.mo42060b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42060b() && (a2 = C4537ja.m13603a(this.f12405a, hxVar.f12405a)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo42061c()).compareTo(Boolean.valueOf(hxVar.mo42061c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo42061c() || (a = C4537ja.m13600a(this.f12403a, hxVar.f12403a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public EnumC4500hu m12994a() {
        return this.f12403a;
    }

    /* renamed from: a */
    public void m12995a() {
        if (this.f12405a == null) {
            throw new C4550jl("Required field 'configItems' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: a */
    public void mo41828a(AbstractC4549jk jkVar) {
        jkVar.m13665a();
        while (true) {
            C4546jh a = jkVar.m13661a();
            byte b = a.f13019a;
            if (b == 0) {
                break;
            }
            short s = a.f13021a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3 && b == 8) {
                        this.f12403a = EnumC4500hu.m12976a(jkVar.m13659a());
                        jkVar.mo42588g();
                    }
                } else if (b == 15) {
                    C4547ji a2 = jkVar.m13662a();
                    this.f12405a = new ArrayList(a2.f13023a);
                    for (int i = 0; i < a2.f13023a; i++) {
                        C4505hz hzVar = new C4505hz();
                        hzVar.mo41828a(jkVar);
                        this.f12405a.add(hzVar);
                    }
                    jkVar.mo42590i();
                    jkVar.mo42588g();
                }
            } else if (b == 8) {
                this.f12402a = jkVar.m13659a();
                mo42059a(true);
                jkVar.mo42588g();
            }
            C4552jn.m13693a(jkVar, b);
            jkVar.mo42588g();
        }
        jkVar.mo42587f();
        if (m12998a()) {
            m12995a();
            return;
        }
        throw new C4550jl("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo42059a(boolean z) {
        this.f12404a.set(0, z);
    }

    /* renamed from: a */
    public boolean m12998a() {
        return this.f12404a.get(0);
    }

    /* renamed from: a */
    public boolean m12999a(C4503hx hxVar) {
        if (hxVar == null || this.f12402a != hxVar.f12402a) {
            return false;
        }
        boolean b = mo42060b();
        boolean b2 = hxVar.mo42060b();
        if ((b || b2) && (!b || !b2 || !this.f12405a.equals(hxVar.f12405a))) {
            return false;
        }
        boolean c = mo42061c();
        boolean c2 = hxVar.mo42061c();
        if (c || c2) {
            return c && c2 && this.f12403a.equals(hxVar.f12403a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m12995a();
        jkVar.mo42576a(f12399a);
        jkVar.mo42573a(f12398a);
        jkVar.mo42570a(this.f12402a);
        jkVar.mo42581b();
        if (this.f12405a != null) {
            jkVar.mo42573a(f12400b);
            jkVar.mo42574a(new C4547ji((byte) 12, this.f12405a.size()));
            for (C4505hz hzVar : this.f12405a) {
                hzVar.mo41832b(jkVar);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        if (this.f12403a != null && mo42061c()) {
            jkVar.mo42573a(f12401c);
            jkVar.mo42570a(this.f12403a.mo42044a());
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo42060b() {
        return this.f12405a != null;
    }

    /* renamed from: c */
    public boolean mo42061c() {
        return this.f12403a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4503hx)) {
            return m12999a((C4503hx) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f12402a);
        sb.append(", ");
        sb.append("configItems:");
        List<C4505hz> list = this.f12405a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (mo42061c()) {
            sb.append(", ");
            sb.append("type:");
            EnumC4500hu huVar = this.f12403a;
            if (huVar == null) {
                sb.append("null");
            } else {
                sb.append(huVar);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
