package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.hr */
public class C4497hr implements AbstractC4532iz<C4497hr, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12246a = new C4546jh("", (byte) 15, 1);

    /* renamed from: a */
    public static final C4554jp f12247a = new C4554jp("ClientUploadData");

    /* renamed from: a */
    public List<C4498hs> f12248a;

    /* renamed from: a */
    public int mo42008a() {
        List<C4498hs> list = this.f12248a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public int compareTo(C4497hr hrVar) {
        int a;
        if (!C4497hr.class.equals(hrVar.getClass())) {
            return C4497hr.class.getName().compareTo(hrVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12937a()).compareTo(Boolean.valueOf(hrVar.m12937a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m12937a() || (a = C4537ja.m13603a(this.f12248a, hrVar.f12248a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void m12934a() {
        if (this.f12248a == null) {
            throw new C4550jl("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo42010a(C4498hs hsVar) {
        if (this.f12248a == null) {
            this.f12248a = new ArrayList();
        }
        this.f12248a.add(hsVar);
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
                m12934a();
                return;
            }
            if (a.f13021a == 1 && b == 15) {
                C4547ji a2 = jkVar.m13662a();
                this.f12248a = new ArrayList(a2.f13023a);
                for (int i = 0; i < a2.f13023a; i++) {
                    C4498hs hsVar = new C4498hs();
                    hsVar.mo41828a(jkVar);
                    this.f12248a.add(hsVar);
                }
                jkVar.mo42590i();
            } else {
                C4552jn.m13693a(jkVar, b);
            }
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public boolean m12937a() {
        return this.f12248a != null;
    }

    /* renamed from: a */
    public boolean m12938a(C4497hr hrVar) {
        if (hrVar == null) {
            return false;
        }
        boolean a = m12937a();
        boolean a2 = hrVar.m12937a();
        if (a || a2) {
            return a && a2 && this.f12248a.equals(hrVar.f12248a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m12934a();
        jkVar.mo42576a(f12247a);
        if (this.f12248a != null) {
            jkVar.mo42573a(f12246a);
            jkVar.mo42574a(new C4547ji((byte) 12, this.f12248a.size()));
            for (C4498hs hsVar : this.f12248a) {
                hsVar.mo41832b(jkVar);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4497hr)) {
            return m12938a((C4497hr) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        List<C4498hs> list = this.f12248a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
