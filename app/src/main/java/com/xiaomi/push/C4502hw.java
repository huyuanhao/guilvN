package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hw */
public class C4502hw implements AbstractC4532iz<C4502hw, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12390a = new C4546jh("", (byte) 10, 1);

    /* renamed from: a */
    public static final C4554jp f12391a = new C4554jp("DataCollectionItem");

    /* renamed from: b */
    public static final C4546jh f12392b = new C4546jh("", (byte) 8, 2);

    /* renamed from: c */
    public static final C4546jh f12393c = new C4546jh("", (byte) 11, 3);

    /* renamed from: a */
    public long f12394a;

    /* renamed from: a */
    public EnumC4496hq f12395a;

    /* renamed from: a */
    public String f12396a;

    /* renamed from: a */
    public BitSet f12397a = new BitSet(1);

    /* renamed from: a */
    public int compareTo(C4502hw hwVar) {
        int a;
        int a2;
        int a3;
        if (!C4502hw.class.equals(hwVar.getClass())) {
            return C4502hw.class.getName().compareTo(hwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12987a()).compareTo(Boolean.valueOf(hwVar.m12987a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12987a() && (a3 = C4537ja.m13599a(this.f12394a, hwVar.f12394a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo42051b()).compareTo(Boolean.valueOf(hwVar.mo42051b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42051b() && (a2 = C4537ja.m13600a(this.f12395a, hwVar.f12395a)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo42052c()).compareTo(Boolean.valueOf(hwVar.mo42052c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo42052c() || (a = C4537ja.m13601a(this.f12396a, hwVar.f12396a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4502hw mo42046a(long j) {
        this.f12394a = j;
        mo42050a(true);
        return this;
    }

    /* renamed from: a */
    public C4502hw mo42047a(EnumC4496hq hqVar) {
        this.f12395a = hqVar;
        return this;
    }

    /* renamed from: a */
    public C4502hw mo42048a(String str) {
        this.f12396a = str;
        return this;
    }

    /* renamed from: a */
    public String mo42049a() {
        return this.f12396a;
    }

    /* renamed from: a */
    public void m12984a() {
        if (this.f12395a == null) {
            throw new C4550jl("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.f12396a == null) {
            throw new C4550jl("Required field 'content' was not present! Struct: " + toString());
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
                    if (s == 3 && b == 11) {
                        this.f12396a = jkVar.m13666a();
                        jkVar.mo42588g();
                    }
                } else if (b == 8) {
                    this.f12395a = EnumC4496hq.m12930a(jkVar.m13659a());
                    jkVar.mo42588g();
                }
            } else if (b == 10) {
                this.f12394a = jkVar.m13660a();
                mo42050a(true);
                jkVar.mo42588g();
            }
            C4552jn.m13693a(jkVar, b);
            jkVar.mo42588g();
        }
        jkVar.mo42587f();
        if (m12987a()) {
            m12984a();
            return;
        }
        throw new C4550jl("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo42050a(boolean z) {
        this.f12397a.set(0, z);
    }

    /* renamed from: a */
    public boolean m12987a() {
        return this.f12397a.get(0);
    }

    /* renamed from: a */
    public boolean m12988a(C4502hw hwVar) {
        if (hwVar == null || this.f12394a != hwVar.f12394a) {
            return false;
        }
        boolean b = mo42051b();
        boolean b2 = hwVar.mo42051b();
        if ((b || b2) && (!b || !b2 || !this.f12395a.equals(hwVar.f12395a))) {
            return false;
        }
        boolean c = mo42052c();
        boolean c2 = hwVar.mo42052c();
        if (c || c2) {
            return c && c2 && this.f12396a.equals(hwVar.f12396a);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m12984a();
        jkVar.mo42576a(f12391a);
        jkVar.mo42573a(f12390a);
        jkVar.mo42572a(this.f12394a);
        jkVar.mo42581b();
        if (this.f12395a != null) {
            jkVar.mo42573a(f12392b);
            jkVar.mo42570a(this.f12395a.mo42007a());
            jkVar.mo42581b();
        }
        if (this.f12396a != null) {
            jkVar.mo42573a(f12393c);
            jkVar.mo42577a(this.f12396a);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo42051b() {
        return this.f12395a != null;
    }

    /* renamed from: c */
    public boolean mo42052c() {
        return this.f12396a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4502hw)) {
            return m12988a((C4502hw) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f12394a);
        sb.append(", ");
        sb.append("collectionType:");
        EnumC4496hq hqVar = this.f12395a;
        if (hqVar == null) {
            sb.append("null");
        } else {
            sb.append(hqVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f12396a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
