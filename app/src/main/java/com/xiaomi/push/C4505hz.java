package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hz */
public class C4505hz implements AbstractC4532iz<C4505hz, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12452a = new C4546jh("", (byte) 8, 1);

    /* renamed from: a */
    public static final C4554jp f12453a = new C4554jp("OnlineConfigItem");

    /* renamed from: b */
    public static final C4546jh f12454b = new C4546jh("", (byte) 8, 2);

    /* renamed from: c */
    public static final C4546jh f12455c = new C4546jh("", (byte) 2, 3);

    /* renamed from: d */
    public static final C4546jh f12456d = new C4546jh("", (byte) 8, 4);

    /* renamed from: e */
    public static final C4546jh f12457e = new C4546jh("", (byte) 10, 5);

    /* renamed from: f */
    public static final C4546jh f12458f = new C4546jh("", (byte) 11, 6);

    /* renamed from: g */
    public static final C4546jh f12459g = new C4546jh("", (byte) 2, 7);

    /* renamed from: a */
    public int f12460a;

    /* renamed from: a */
    public long f12461a;

    /* renamed from: a */
    public String f12462a;

    /* renamed from: a */
    public BitSet f12463a = new BitSet(6);

    /* renamed from: a */
    public boolean f12464a;

    /* renamed from: b */
    public int f12465b;

    /* renamed from: b */
    public boolean f12466b;

    /* renamed from: c */
    public int f12467c;

    /* renamed from: a */
    public int mo42067a() {
        return this.f12460a;
    }

    /* renamed from: a */
    public int compareTo(C4505hz hzVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!C4505hz.class.equals(hzVar.getClass())) {
            return C4505hz.class.getName().compareTo(hzVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13010a()).compareTo(Boolean.valueOf(hzVar.m13010a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13010a() && (a7 = C4537ja.m13598a(this.f12460a, hzVar.f12460a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(m13015b()).compareTo(Boolean.valueOf(hzVar.m13015b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13015b() && (a6 = C4537ja.m13598a(this.f12465b, hzVar.f12465b)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(m13018c()).compareTo(Boolean.valueOf(hzVar.m13018c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m13018c() && (a5 = C4537ja.m13607a(this.f12464a, hzVar.f12464a)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(mo42076d()).compareTo(Boolean.valueOf(hzVar.mo42076d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42076d() && (a4 = C4537ja.m13598a(this.f12467c, hzVar.f12467c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(mo42078e()).compareTo(Boolean.valueOf(hzVar.mo42078e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42078e() && (a3 = C4537ja.m13599a(this.f12461a, hzVar.f12461a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(mo42081f()).compareTo(Boolean.valueOf(hzVar.mo42081f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42081f() && (a2 = C4537ja.m13601a(this.f12462a, hzVar.f12462a)) != 0) {
            return a2;
        }
        int compareTo7 = Boolean.valueOf(mo42083h()).compareTo(Boolean.valueOf(hzVar.mo42083h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!mo42083h() || (a = C4537ja.m13607a(this.f12466b, hzVar.f12466b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long m13005a() {
        return this.f12461a;
    }

    /* renamed from: a */
    public String m13006a() {
        return this.f12462a;
    }

    /* renamed from: a */
    public void m13007a() {
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
                m13007a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 8) {
                        this.f12460a = jkVar.m13659a();
                        mo42069a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 8) {
                        this.f12465b = jkVar.m13659a();
                        mo42071b(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 2) {
                        this.f12464a = jkVar.m13681a();
                        mo42073c(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 8) {
                        this.f12467c = jkVar.m13659a();
                        mo42075d(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f12461a = jkVar.m13660a();
                        mo42077e(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f12462a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 2) {
                        this.f12466b = jkVar.m13681a();
                        mo42080f(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
            }
            C4552jn.m13693a(jkVar, b);
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public void mo42069a(boolean z) {
        this.f12463a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13010a() {
        return this.f12463a.get(0);
    }

    /* renamed from: a */
    public boolean m13011a(C4505hz hzVar) {
        if (hzVar == null) {
            return false;
        }
        boolean a = m13010a();
        boolean a2 = hzVar.m13010a();
        if ((a || a2) && (!a || !a2 || this.f12460a != hzVar.f12460a)) {
            return false;
        }
        boolean b = m13015b();
        boolean b2 = hzVar.m13015b();
        if ((b || b2) && (!b || !b2 || this.f12465b != hzVar.f12465b)) {
            return false;
        }
        boolean c = m13018c();
        boolean c2 = hzVar.m13018c();
        if ((c || c2) && (!c || !c2 || this.f12464a != hzVar.f12464a)) {
            return false;
        }
        boolean d = mo42076d();
        boolean d2 = hzVar.mo42076d();
        if ((d || d2) && (!d || !d2 || this.f12467c != hzVar.f12467c)) {
            return false;
        }
        boolean e = mo42078e();
        boolean e2 = hzVar.mo42078e();
        if ((e || e2) && (!e || !e2 || this.f12461a != hzVar.f12461a)) {
            return false;
        }
        boolean f = mo42081f();
        boolean f2 = hzVar.mo42081f();
        if ((f || f2) && (!f || !f2 || !this.f12462a.equals(hzVar.f12462a))) {
            return false;
        }
        boolean h = mo42083h();
        boolean h2 = hzVar.mo42083h();
        if (h || h2) {
            return h && h2 && this.f12466b == hzVar.f12466b;
        }
        return true;
    }

    /* renamed from: b */
    public int mo42070b() {
        return this.f12465b;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13007a();
        jkVar.mo42576a(f12453a);
        if (m13010a()) {
            jkVar.mo42573a(f12452a);
            jkVar.mo42570a(this.f12460a);
            jkVar.mo42581b();
        }
        if (m13015b()) {
            jkVar.mo42573a(f12454b);
            jkVar.mo42570a(this.f12465b);
            jkVar.mo42581b();
        }
        if (m13018c()) {
            jkVar.mo42573a(f12455c);
            jkVar.mo42580a(this.f12464a);
            jkVar.mo42581b();
        }
        if (mo42076d()) {
            jkVar.mo42573a(f12456d);
            jkVar.mo42570a(this.f12467c);
            jkVar.mo42581b();
        }
        if (mo42078e()) {
            jkVar.mo42573a(f12457e);
            jkVar.mo42572a(this.f12461a);
            jkVar.mo42581b();
        }
        if (this.f12462a != null && mo42081f()) {
            jkVar.mo42573a(f12458f);
            jkVar.mo42577a(this.f12462a);
            jkVar.mo42581b();
        }
        if (mo42083h()) {
            jkVar.mo42573a(f12459g);
            jkVar.mo42580a(this.f12466b);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42071b(boolean z) {
        this.f12463a.set(1, z);
    }

    /* renamed from: b */
    public boolean m13015b() {
        return this.f12463a.get(1);
    }

    /* renamed from: c */
    public int mo42072c() {
        return this.f12467c;
    }

    /* renamed from: c */
    public void mo42073c(boolean z) {
        this.f12463a.set(2, z);
    }

    /* renamed from: c */
    public boolean m13018c() {
        return this.f12463a.get(2);
    }

    /* renamed from: d */
    public void mo42075d(boolean z) {
        this.f12463a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo42076d() {
        return this.f12463a.get(3);
    }

    /* renamed from: e */
    public void mo42077e(boolean z) {
        this.f12463a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo42078e() {
        return this.f12463a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4505hz)) {
            return m13011a((C4505hz) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo42080f(boolean z) {
        this.f12463a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo42081f() {
        return this.f12462a != null;
    }

    /* renamed from: g */
    public boolean mo42082g() {
        return this.f12466b;
    }

    /* renamed from: h */
    public boolean mo42083h() {
        return this.f12463a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m13010a()) {
            sb.append("key:");
            sb.append(this.f12460a);
            z = false;
        } else {
            z = true;
        }
        if (m13015b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f12465b);
            z = false;
        }
        if (m13018c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f12464a);
            z = false;
        }
        if (mo42076d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f12467c);
            z = false;
        }
        if (mo42078e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f12461a);
            z = false;
        }
        if (mo42081f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f12462a;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
        } else {
            z2 = z;
        }
        if (mo42083h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f12466b);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
