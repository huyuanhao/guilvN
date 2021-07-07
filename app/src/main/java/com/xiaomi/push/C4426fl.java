package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.fl */
public class C4426fl implements AbstractC4532iz<C4426fl, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f11920a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f11921a = new C4554jp("StatsEvents");

    /* renamed from: b */
    public static final C4546jh f11922b = new C4546jh("", (byte) 11, 2);

    /* renamed from: c */
    public static final C4546jh f11923c = new C4546jh("", (byte) 15, 3);

    /* renamed from: a */
    public String f11924a;

    /* renamed from: a */
    public List<C4425fk> f11925a;

    /* renamed from: b */
    public String f11926b;

    public C4426fl() {
    }

    public C4426fl(String str, List<C4425fk> list) {
        this();
        this.f11924a = str;
        this.f11925a = list;
    }

    /* renamed from: a */
    public int compareTo(C4426fl flVar) {
        int a;
        int a2;
        int a3;
        if (!C4426fl.class.equals(flVar.getClass())) {
            return C4426fl.class.getName().compareTo(flVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12587a()).compareTo(Boolean.valueOf(flVar.m12587a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12587a() && (a3 = C4537ja.m13601a(this.f11924a, flVar.f11924a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo41858b()).compareTo(Boolean.valueOf(flVar.mo41858b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo41858b() && (a2 = C4537ja.m13601a(this.f11926b, flVar.f11926b)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo41859c()).compareTo(Boolean.valueOf(flVar.mo41859c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo41859c() || (a = C4537ja.m13603a(this.f11925a, flVar.f11925a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4426fl mo41856a(String str) {
        this.f11926b = str;
        return this;
    }

    /* renamed from: a */
    public void mo41857a() {
        if (this.f11924a == null) {
            throw new C4550jl("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.f11925a == null) {
            throw new C4550jl("Required field 'events' was not present! Struct: " + toString());
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
                mo41857a();
                return;
            }
            short s = a.f13021a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3 && b == 15) {
                        C4547ji a2 = jkVar.m13662a();
                        this.f11925a = new ArrayList(a2.f13023a);
                        for (int i = 0; i < a2.f13023a; i++) {
                            C4425fk fkVar = new C4425fk();
                            fkVar.mo41828a(jkVar);
                            this.f11925a.add(fkVar);
                        }
                        jkVar.mo42590i();
                        jkVar.mo42588g();
                    }
                } else if (b == 11) {
                    this.f11926b = jkVar.m13666a();
                    jkVar.mo42588g();
                }
            } else if (b == 11) {
                this.f11924a = jkVar.m13666a();
                jkVar.mo42588g();
            }
            C4552jn.m13693a(jkVar, b);
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public boolean m12587a() {
        return this.f11924a != null;
    }

    /* renamed from: a */
    public boolean m12588a(C4426fl flVar) {
        if (flVar == null) {
            return false;
        }
        boolean a = m12587a();
        boolean a2 = flVar.m12587a();
        if ((a || a2) && (!a || !a2 || !this.f11924a.equals(flVar.f11924a))) {
            return false;
        }
        boolean b = mo41858b();
        boolean b2 = flVar.mo41858b();
        if ((b || b2) && (!b || !b2 || !this.f11926b.equals(flVar.f11926b))) {
            return false;
        }
        boolean c = mo41859c();
        boolean c2 = flVar.mo41859c();
        if (c || c2) {
            return c && c2 && this.f11925a.equals(flVar.f11925a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo41857a();
        jkVar.mo42576a(f11921a);
        if (this.f11924a != null) {
            jkVar.mo42573a(f11920a);
            jkVar.mo42577a(this.f11924a);
            jkVar.mo42581b();
        }
        if (this.f11926b != null && mo41858b()) {
            jkVar.mo42573a(f11922b);
            jkVar.mo42577a(this.f11926b);
            jkVar.mo42581b();
        }
        if (this.f11925a != null) {
            jkVar.mo42573a(f11923c);
            jkVar.mo42574a(new C4547ji((byte) 12, this.f11925a.size()));
            for (C4425fk fkVar : this.f11925a) {
                fkVar.mo41832b(jkVar);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo41858b() {
        return this.f11926b != null;
    }

    /* renamed from: c */
    public boolean mo41859c() {
        return this.f11925a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4426fl)) {
            return m12588a((C4426fl) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        String str = this.f11924a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo41858b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f11926b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<C4425fk> list = this.f11925a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
