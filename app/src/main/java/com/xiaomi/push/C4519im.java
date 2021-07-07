package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.im */
public class C4519im implements AbstractC4532iz<C4519im, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12699a = new C4546jh("", (byte) 15, 1);

    /* renamed from: a */
    public static final C4554jp f12700a = new C4554jp("XmPushActionNormalConfig");

    /* renamed from: a */
    public List<C4503hx> f12701a;

    /* renamed from: a */
    public int compareTo(C4519im imVar) {
        int a;
        if (!C4519im.class.equals(imVar.getClass())) {
            return C4519im.class.getName().compareTo(imVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13308a()).compareTo(Boolean.valueOf(imVar.m13308a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m13308a() || (a = C4537ja.m13603a(this.f12701a, imVar.f12701a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public List<C4503hx> mo42301a() {
        return this.f12701a;
    }

    /* renamed from: a */
    public void m13306a() {
        if (this.f12701a == null) {
            throw new C4550jl("Required field 'normalConfigs' was not present! Struct: " + toString());
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
                m13306a();
                return;
            }
            if (a.f13021a == 1 && b == 15) {
                C4547ji a2 = jkVar.m13662a();
                this.f12701a = new ArrayList(a2.f13023a);
                for (int i = 0; i < a2.f13023a; i++) {
                    C4503hx hxVar = new C4503hx();
                    hxVar.mo41828a(jkVar);
                    this.f12701a.add(hxVar);
                }
                jkVar.mo42590i();
            } else {
                C4552jn.m13693a(jkVar, b);
            }
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public boolean m13308a() {
        return this.f12701a != null;
    }

    /* renamed from: a */
    public boolean m13309a(C4519im imVar) {
        if (imVar == null) {
            return false;
        }
        boolean a = m13308a();
        boolean a2 = imVar.m13308a();
        if (a || a2) {
            return a && a2 && this.f12701a.equals(imVar.f12701a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13306a();
        jkVar.mo42576a(f12700a);
        if (this.f12701a != null) {
            jkVar.mo42573a(f12699a);
            jkVar.mo42574a(new C4547ji((byte) 12, this.f12701a.size()));
            for (C4503hx hxVar : this.f12701a) {
                hxVar.mo41832b(jkVar);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4519im)) {
            return m13309a((C4519im) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<C4503hx> list = this.f12701a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
