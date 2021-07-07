package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.il */
public class C4518il implements AbstractC4532iz<C4518il, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12696a = new C4546jh("", (byte) 15, 1);

    /* renamed from: a */
    public static final C4554jp f12697a = new C4554jp("XmPushActionCustomConfig");

    /* renamed from: a */
    public List<C4505hz> f12698a;

    /* renamed from: a */
    public int compareTo(C4518il ilVar) {
        int a;
        if (!C4518il.class.equals(ilVar.getClass())) {
            return C4518il.class.getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13301a()).compareTo(Boolean.valueOf(ilVar.m13301a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m13301a() || (a = C4537ja.m13603a(this.f12698a, ilVar.f12698a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public List<C4505hz> mo42295a() {
        return this.f12698a;
    }

    /* renamed from: a */
    public void m13299a() {
        if (this.f12698a == null) {
            throw new C4550jl("Required field 'customConfigs' was not present! Struct: " + toString());
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
                jkVar.mo42587f();
                m13299a();
                return;
            }
            if (a.f13021a == 1 && b == 15) {
                C4547ji a2 = jkVar.m13662a();
                this.f12698a = new ArrayList(a2.f13023a);
                for (int i = 0; i < a2.f13023a; i++) {
                    C4505hz hzVar = new C4505hz();
                    hzVar.mo41828a(jkVar);
                    this.f12698a.add(hzVar);
                }
                jkVar.mo42590i();
            } else {
                C4552jn.m13693a(jkVar, b);
            }
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public boolean m13301a() {
        return this.f12698a != null;
    }

    /* renamed from: a */
    public boolean m13302a(C4518il ilVar) {
        if (ilVar == null) {
            return false;
        }
        boolean a = m13301a();
        boolean a2 = ilVar.m13301a();
        if (a || a2) {
            return a && a2 && this.f12698a.equals(ilVar.f12698a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13299a();
        jkVar.mo42576a(f12697a);
        if (this.f12698a != null) {
            jkVar.mo42573a(f12696a);
            jkVar.mo42574a(new C4547ji((byte) 12, this.f12698a.size()));
            for (C4505hz hzVar : this.f12698a) {
                hzVar.mo41832b(jkVar);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4518il)) {
            return m13302a((C4518il) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<C4505hz> list = this.f12698a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
