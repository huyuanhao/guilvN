package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.fk */
public class C4425fk implements AbstractC4532iz<C4425fk, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f11898a = new C4546jh("", (byte) 3, 1);

    /* renamed from: a */
    public static final C4554jp f11899a = new C4554jp("StatsEvent");

    /* renamed from: b */
    public static final C4546jh f11900b = new C4546jh("", (byte) 8, 2);

    /* renamed from: c */
    public static final C4546jh f11901c = new C4546jh("", (byte) 8, 3);

    /* renamed from: d */
    public static final C4546jh f11902d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f11903e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f11904f = new C4546jh("", (byte) 8, 6);

    /* renamed from: g */
    public static final C4546jh f11905g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f11906h = new C4546jh("", (byte) 11, 8);

    /* renamed from: i */
    public static final C4546jh f11907i = new C4546jh("", (byte) 8, 9);

    /* renamed from: j */
    public static final C4546jh f11908j = new C4546jh("", (byte) 8, 10);

    /* renamed from: a */
    public byte f11909a;

    /* renamed from: a */
    public int f11910a;

    /* renamed from: a */
    public String f11911a;

    /* renamed from: a */
    public BitSet f11912a = new BitSet(6);

    /* renamed from: b */
    public int f11913b;

    /* renamed from: b */
    public String f11914b;

    /* renamed from: c */
    public int f11915c;

    /* renamed from: c */
    public String f11916c;

    /* renamed from: d */
    public int f11917d;

    /* renamed from: d */
    public String f11918d;

    /* renamed from: e */
    public int f11919e;

    /* renamed from: a */
    public int compareTo(C4425fk fkVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!C4425fk.class.equals(fkVar.getClass())) {
            return C4425fk.class.getName().compareTo(fkVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12560a()).compareTo(Boolean.valueOf(fkVar.m12560a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12560a() && (a10 = C4537ja.m13597a(this.f11909a, fkVar.f11909a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo41834b()).compareTo(Boolean.valueOf(fkVar.mo41834b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo41834b() && (a9 = C4537ja.m13598a(this.f11910a, fkVar.f11910a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo41838c()).compareTo(Boolean.valueOf(fkVar.mo41838c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo41838c() && (a8 = C4537ja.m13598a(this.f11913b, fkVar.f11913b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo41843d()).compareTo(Boolean.valueOf(fkVar.mo41843d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo41843d() && (a7 = C4537ja.m13601a(this.f11911a, fkVar.f11911a)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo41845e()).compareTo(Boolean.valueOf(fkVar.mo41845e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo41845e() && (a6 = C4537ja.m13601a(this.f11914b, fkVar.f11914b)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo41848f()).compareTo(Boolean.valueOf(fkVar.mo41848f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo41848f() && (a5 = C4537ja.m13598a(this.f11915c, fkVar.f11915c)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo41849g()).compareTo(Boolean.valueOf(fkVar.mo41849g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo41849g() && (a4 = C4537ja.m13601a(this.f11916c, fkVar.f11916c)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo41850h()).compareTo(Boolean.valueOf(fkVar.mo41850h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo41850h() && (a3 = C4537ja.m13601a(this.f11918d, fkVar.f11918d)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo41852i()).compareTo(Boolean.valueOf(fkVar.mo41852i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo41852i() && (a2 = C4537ja.m13598a(this.f11917d, fkVar.f11917d)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo41853j()).compareTo(Boolean.valueOf(fkVar.mo41853j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo41853j() || (a = C4537ja.m13598a(this.f11919e, fkVar.f11919e)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4425fk mo41824a(byte b) {
        this.f11909a = b;
        mo41829a(true);
        return this;
    }

    /* renamed from: a */
    public C4425fk mo41825a(int i) {
        this.f11910a = i;
        mo41833b(true);
        return this;
    }

    /* renamed from: a */
    public C4425fk mo41826a(String str) {
        this.f11911a = str;
        return this;
    }

    /* renamed from: a */
    public void mo41827a() {
        if (this.f11911a == null) {
            throw new C4550jl("Required field 'connpt' was not present! Struct: " + toString());
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
                if (!m12560a()) {
                    throw new C4550jl("Required field 'chid' was not found in serialized data! Struct: " + toString());
                } else if (!mo41834b()) {
                    throw new C4550jl("Required field 'type' was not found in serialized data! Struct: " + toString());
                } else if (mo41838c()) {
                    mo41827a();
                    return;
                } else {
                    throw new C4550jl("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
            } else {
                switch (a.f13021a) {
                    case 1:
                        if (b == 3) {
                            this.f11909a = jkVar.mo42569a();
                            mo41829a(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 2:
                        if (b == 8) {
                            this.f11910a = jkVar.m13659a();
                            mo41833b(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 3:
                        if (b == 8) {
                            this.f11913b = jkVar.m13659a();
                            mo41837c(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 4:
                        if (b == 11) {
                            this.f11911a = jkVar.m13666a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 5:
                        if (b == 11) {
                            this.f11914b = jkVar.m13666a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 6:
                        if (b == 8) {
                            this.f11915c = jkVar.m13659a();
                            mo41842d(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 7:
                        if (b == 11) {
                            this.f11916c = jkVar.m13666a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 8:
                        if (b == 11) {
                            this.f11918d = jkVar.m13666a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 9:
                        if (b == 8) {
                            this.f11917d = jkVar.m13659a();
                            mo41844e(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 10:
                        if (b == 8) {
                            this.f11919e = jkVar.m13659a();
                            mo41847f(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                }
                C4552jn.m13693a(jkVar, b);
                jkVar.mo42588g();
            }
        }
    }

    /* renamed from: a */
    public void mo41829a(boolean z) {
        this.f11912a.set(0, z);
    }

    /* renamed from: a */
    public boolean m12560a() {
        return this.f11912a.get(0);
    }

    /* renamed from: a */
    public boolean m12561a(C4425fk fkVar) {
        if (fkVar == null || this.f11909a != fkVar.f11909a || this.f11910a != fkVar.f11910a || this.f11913b != fkVar.f11913b) {
            return false;
        }
        boolean d = mo41843d();
        boolean d2 = fkVar.mo41843d();
        if ((d || d2) && (!d || !d2 || !this.f11911a.equals(fkVar.f11911a))) {
            return false;
        }
        boolean e = mo41845e();
        boolean e2 = fkVar.mo41845e();
        if ((e || e2) && (!e || !e2 || !this.f11914b.equals(fkVar.f11914b))) {
            return false;
        }
        boolean f = mo41848f();
        boolean f2 = fkVar.mo41848f();
        if ((f || f2) && (!f || !f2 || this.f11915c != fkVar.f11915c)) {
            return false;
        }
        boolean g = mo41849g();
        boolean g2 = fkVar.mo41849g();
        if ((g || g2) && (!g || !g2 || !this.f11916c.equals(fkVar.f11916c))) {
            return false;
        }
        boolean h = mo41850h();
        boolean h2 = fkVar.mo41850h();
        if ((h || h2) && (!h || !h2 || !this.f11918d.equals(fkVar.f11918d))) {
            return false;
        }
        boolean i = mo41852i();
        boolean i2 = fkVar.mo41852i();
        if ((i || i2) && (!i || !i2 || this.f11917d != fkVar.f11917d)) {
            return false;
        }
        boolean j = mo41853j();
        boolean j2 = fkVar.mo41853j();
        if (j || j2) {
            return j && j2 && this.f11919e == fkVar.f11919e;
        }
        return true;
    }

    /* renamed from: b */
    public C4425fk mo41830b(int i) {
        this.f11913b = i;
        mo41837c(true);
        return this;
    }

    /* renamed from: b */
    public C4425fk mo41831b(String str) {
        this.f11914b = str;
        return this;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo41827a();
        jkVar.mo42576a(f11899a);
        jkVar.mo42573a(f11898a);
        jkVar.mo42571a(this.f11909a);
        jkVar.mo42581b();
        jkVar.mo42573a(f11900b);
        jkVar.mo42570a(this.f11910a);
        jkVar.mo42581b();
        jkVar.mo42573a(f11901c);
        jkVar.mo42570a(this.f11913b);
        jkVar.mo42581b();
        if (this.f11911a != null) {
            jkVar.mo42573a(f11902d);
            jkVar.mo42577a(this.f11911a);
            jkVar.mo42581b();
        }
        if (this.f11914b != null && mo41845e()) {
            jkVar.mo42573a(f11903e);
            jkVar.mo42577a(this.f11914b);
            jkVar.mo42581b();
        }
        if (mo41848f()) {
            jkVar.mo42573a(f11904f);
            jkVar.mo42570a(this.f11915c);
            jkVar.mo42581b();
        }
        if (this.f11916c != null && mo41849g()) {
            jkVar.mo42573a(f11905g);
            jkVar.mo42577a(this.f11916c);
            jkVar.mo42581b();
        }
        if (this.f11918d != null && mo41850h()) {
            jkVar.mo42573a(f11906h);
            jkVar.mo42577a(this.f11918d);
            jkVar.mo42581b();
        }
        if (mo41852i()) {
            jkVar.mo42573a(f11907i);
            jkVar.mo42570a(this.f11917d);
            jkVar.mo42581b();
        }
        if (mo41853j()) {
            jkVar.mo42573a(f11908j);
            jkVar.mo42570a(this.f11919e);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo41833b(boolean z) {
        this.f11912a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo41834b() {
        return this.f11912a.get(1);
    }

    /* renamed from: c */
    public C4425fk mo41835c(int i) {
        this.f11915c = i;
        mo41842d(true);
        return this;
    }

    /* renamed from: c */
    public C4425fk mo41836c(String str) {
        this.f11916c = str;
        return this;
    }

    /* renamed from: c */
    public void mo41837c(boolean z) {
        this.f11912a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo41838c() {
        return this.f11912a.get(2);
    }

    /* renamed from: d */
    public C4425fk mo41840d(int i) {
        this.f11917d = i;
        mo41844e(true);
        return this;
    }

    /* renamed from: d */
    public C4425fk mo41841d(String str) {
        this.f11918d = str;
        return this;
    }

    /* renamed from: d */
    public void mo41842d(boolean z) {
        this.f11912a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo41843d() {
        return this.f11911a != null;
    }

    /* renamed from: e */
    public void mo41844e(boolean z) {
        this.f11912a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo41845e() {
        return this.f11914b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4425fk)) {
            return m12561a((C4425fk) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo41847f(boolean z) {
        this.f11912a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo41848f() {
        return this.f11912a.get(3);
    }

    /* renamed from: g */
    public boolean mo41849g() {
        return this.f11916c != null;
    }

    /* renamed from: h */
    public boolean mo41850h() {
        return this.f11918d != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo41852i() {
        return this.f11912a.get(4);
    }

    /* renamed from: j */
    public boolean mo41853j() {
        return this.f11912a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append((int) this.f11909a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f11910a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f11913b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f11911a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo41845e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f11914b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo41848f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f11915c);
        }
        if (mo41849g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f11916c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo41850h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f11918d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo41852i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f11917d);
        }
        if (mo41853j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f11919e);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
