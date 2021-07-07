package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ig */
public class C4513ig implements AbstractC4532iz<C4513ig, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12625a = new C4546jh("", (byte) 8, 1);

    /* renamed from: a */
    public static final C4554jp f12626a = new C4554jp("XmPushActionCheckClientInfo");

    /* renamed from: b */
    public static final C4546jh f12627b = new C4546jh("", (byte) 8, 2);

    /* renamed from: a */
    public int f12628a;

    /* renamed from: a */
    public BitSet f12629a = new BitSet(2);

    /* renamed from: b */
    public int f12630b;

    /* renamed from: a */
    public int compareTo(C4513ig igVar) {
        int a;
        int a2;
        if (!C4513ig.class.equals(igVar.getClass())) {
            return C4513ig.class.getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13209a()).compareTo(Boolean.valueOf(igVar.m13209a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13209a() && (a2 = C4537ja.m13598a(this.f12628a, igVar.f12628a)) != 0) {
            return a2;
        }
        int compareTo2 = Boolean.valueOf(mo42219b()).compareTo(Boolean.valueOf(igVar.mo42219b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo42219b() || (a = C4537ja.m13598a(this.f12630b, igVar.f12630b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4513ig mo42214a(int i) {
        this.f12628a = i;
        mo42216a(true);
        return this;
    }

    /* renamed from: a */
    public void mo42215a() {
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
                if (s == 2 && b == 8) {
                    this.f12630b = jkVar.m13659a();
                    mo42218b(true);
                    jkVar.mo42588g();
                }
            } else if (b == 8) {
                this.f12628a = jkVar.m13659a();
                mo42216a(true);
                jkVar.mo42588g();
            }
            C4552jn.m13693a(jkVar, b);
            jkVar.mo42588g();
        }
        jkVar.mo42587f();
        if (!m13209a()) {
            throw new C4550jl("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        } else if (mo42219b()) {
            mo42215a();
        } else {
            throw new C4550jl("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo42216a(boolean z) {
        this.f12629a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13209a() {
        return this.f12629a.get(0);
    }

    /* renamed from: a */
    public boolean m13210a(C4513ig igVar) {
        return igVar != null && this.f12628a == igVar.f12628a && this.f12630b == igVar.f12630b;
    }

    /* renamed from: b */
    public C4513ig mo42217b(int i) {
        this.f12630b = i;
        mo42218b(true);
        return this;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42215a();
        jkVar.mo42576a(f12626a);
        jkVar.mo42573a(f12625a);
        jkVar.mo42570a(this.f12628a);
        jkVar.mo42581b();
        jkVar.mo42573a(f12627b);
        jkVar.mo42570a(this.f12630b);
        jkVar.mo42581b();
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42218b(boolean z) {
        this.f12629a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo42219b() {
        return this.f12629a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4513ig)) {
            return m13210a((C4513ig) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(" + "miscConfigVersion:" + this.f12628a + ", " + "pluginConfigVersion:" + this.f12630b + C3848l.f10402t;
    }
}
