package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ih */
public class C4514ih implements AbstractC4532iz<C4514ih, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12631a = new C4546jh("", (byte) 15, 1);

    /* renamed from: a */
    public static final C4554jp f12632a = new C4554jp("XmPushActionCollectData");

    /* renamed from: a */
    public List<C4502hw> f12633a;

    /* renamed from: a */
    public int compareTo(C4514ih ihVar) {
        int a;
        if (!C4514ih.class.equals(ihVar.getClass())) {
            return C4514ih.class.getName().compareTo(ihVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13219a()).compareTo(Boolean.valueOf(ihVar.m13219a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m13219a() || (a = C4537ja.m13603a(this.f12633a, ihVar.f12633a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4514ih mo42225a(List<C4502hw> list) {
        this.f12633a = list;
        return this;
    }

    /* renamed from: a */
    public void mo42226a() {
        if (this.f12633a == null) {
            throw new C4550jl("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
                mo42226a();
                return;
            }
            if (a.f13021a == 1 && b == 15) {
                C4547ji a2 = jkVar.m13662a();
                this.f12633a = new ArrayList(a2.f13023a);
                for (int i = 0; i < a2.f13023a; i++) {
                    C4502hw hwVar = new C4502hw();
                    hwVar.mo41828a(jkVar);
                    this.f12633a.add(hwVar);
                }
                jkVar.mo42590i();
            } else {
                C4552jn.m13693a(jkVar, b);
            }
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public boolean m13219a() {
        return this.f12633a != null;
    }

    /* renamed from: a */
    public boolean m13220a(C4514ih ihVar) {
        if (ihVar == null) {
            return false;
        }
        boolean a = m13219a();
        boolean a2 = ihVar.m13219a();
        if (a || a2) {
            return a && a2 && this.f12633a.equals(ihVar.f12633a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42226a();
        jkVar.mo42576a(f12632a);
        if (this.f12633a != null) {
            jkVar.mo42573a(f12631a);
            jkVar.mo42574a(new C4547ji((byte) 12, this.f12633a.size()));
            for (C4502hw hwVar : this.f12633a) {
                hwVar.mo41832b(jkVar);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4514ih)) {
            return m13220a((C4514ih) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        List<C4502hw> list = this.f12633a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
