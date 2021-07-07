package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ir */
public class C4524ir implements AbstractC4532iz<C4524ir, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12846a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12847a = new C4554jp("XmPushActionSendMessage");

    /* renamed from: b */
    public static final C4546jh f12848b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12849c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12850d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12851e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12852f = new C4546jh("", (byte) 11, 6);

    /* renamed from: g */
    public static final C4546jh f12853g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12854h = new C4546jh("", (byte) 12, 8);

    /* renamed from: i */
    public static final C4546jh f12855i = new C4546jh("", (byte) 2, 9);

    /* renamed from: j */
    public static final C4546jh f12856j = new C4546jh("", (byte) 13, 10);

    /* renamed from: k */
    public static final C4546jh f12857k = new C4546jh("", (byte) 11, 11);

    /* renamed from: l */
    public static final C4546jh f12858l = new C4546jh("", (byte) 11, 12);

    /* renamed from: a */
    public C4507ia f12859a;

    /* renamed from: a */
    public C4510id f12860a;

    /* renamed from: a */
    public String f12861a;

    /* renamed from: a */
    public BitSet f12862a = new BitSet(1);

    /* renamed from: a */
    public Map<String, String> f12863a;

    /* renamed from: a */
    public boolean f12864a = true;

    /* renamed from: b */
    public String f12865b;

    /* renamed from: c */
    public String f12866c;

    /* renamed from: d */
    public String f12867d;

    /* renamed from: e */
    public String f12868e;

    /* renamed from: f */
    public String f12869f;

    /* renamed from: g */
    public String f12870g;

    /* renamed from: h */
    public String f12871h;

    /* renamed from: a */
    public int compareTo(C4524ir irVar) {
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
        int a11;
        int a12;
        if (!C4524ir.class.equals(irVar.getClass())) {
            return C4524ir.class.getName().compareTo(irVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13457a()).compareTo(Boolean.valueOf(irVar.m13457a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13457a() && (a12 = C4537ja.m13601a(this.f12861a, irVar.f12861a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(m13461b()).compareTo(Boolean.valueOf(irVar.m13461b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13461b() && (a11 = C4537ja.m13600a(this.f12860a, irVar.f12860a)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(m13463c()).compareTo(Boolean.valueOf(irVar.m13463c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m13463c() && (a10 = C4537ja.m13601a(this.f12865b, irVar.f12865b)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(m13465d()).compareTo(Boolean.valueOf(irVar.m13465d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m13465d() && (a9 = C4537ja.m13601a(this.f12866c, irVar.f12866c)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(m13467e()).compareTo(Boolean.valueOf(irVar.m13467e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m13467e() && (a8 = C4537ja.m13601a(this.f12867d, irVar.f12867d)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(m13469f()).compareTo(Boolean.valueOf(irVar.m13469f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m13469f() && (a7 = C4537ja.m13601a(this.f12868e, irVar.f12868e)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(mo42444g()).compareTo(Boolean.valueOf(irVar.mo42444g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42444g() && (a6 = C4537ja.m13601a(this.f12869f, irVar.f12869f)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(mo42445h()).compareTo(Boolean.valueOf(irVar.mo42445h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42445h() && (a5 = C4537ja.m13600a(this.f12859a, irVar.f12859a)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(mo42447i()).compareTo(Boolean.valueOf(irVar.mo42447i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42447i() && (a4 = C4537ja.m13607a(this.f12864a, irVar.f12864a)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(mo42448j()).compareTo(Boolean.valueOf(irVar.mo42448j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo42448j() && (a3 = C4537ja.m13604a(this.f12863a, irVar.f12863a)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(mo42449k()).compareTo(Boolean.valueOf(irVar.mo42449k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo42449k() && (a2 = C4537ja.m13601a(this.f12870g, irVar.f12870g)) != 0) {
            return a2;
        }
        int compareTo12 = Boolean.valueOf(mo42450l()).compareTo(Boolean.valueOf(irVar.mo42450l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!mo42450l() || (a = C4537ja.m13601a(this.f12871h, irVar.f12871h)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4507ia mo42435a() {
        return this.f12859a;
    }

    /* renamed from: a */
    public String m13453a() {
        return this.f12865b;
    }

    /* renamed from: a */
    public void m13454a() {
        if (this.f12865b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12866c == null) {
            throw new C4550jl("Required field 'appId' was not present! Struct: " + toString());
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
                m13454a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12861a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12860a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12865b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12866c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12867d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f12868e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12869f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C4507ia iaVar = new C4507ia();
                        this.f12859a = iaVar;
                        iaVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 2) {
                        this.f12864a = jkVar.m13681a();
                        mo42436a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 13) {
                        C4548jj a2 = jkVar.m13663a();
                        this.f12863a = new HashMap(a2.f13025a * 2);
                        for (int i = 0; i < a2.f13025a; i++) {
                            this.f12863a.put(jkVar.m13666a(), jkVar.m13666a());
                        }
                        jkVar.mo42589h();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f12870g = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f12871h = jkVar.m13666a();
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
    public void mo42436a(boolean z) {
        this.f12862a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13457a() {
        return this.f12861a != null;
    }

    /* renamed from: a */
    public boolean m13458a(C4524ir irVar) {
        if (irVar == null) {
            return false;
        }
        boolean a = m13457a();
        boolean a2 = irVar.m13457a();
        if ((a || a2) && (!a || !a2 || !this.f12861a.equals(irVar.f12861a))) {
            return false;
        }
        boolean b = m13461b();
        boolean b2 = irVar.m13461b();
        if ((b || b2) && (!b || !b2 || !this.f12860a.m13142a(irVar.f12860a))) {
            return false;
        }
        boolean c = m13463c();
        boolean c2 = irVar.m13463c();
        if ((c || c2) && (!c || !c2 || !this.f12865b.equals(irVar.f12865b))) {
            return false;
        }
        boolean d = m13465d();
        boolean d2 = irVar.m13465d();
        if ((d || d2) && (!d || !d2 || !this.f12866c.equals(irVar.f12866c))) {
            return false;
        }
        boolean e = m13467e();
        boolean e2 = irVar.m13467e();
        if ((e || e2) && (!e || !e2 || !this.f12867d.equals(irVar.f12867d))) {
            return false;
        }
        boolean f = m13469f();
        boolean f2 = irVar.m13469f();
        if ((f || f2) && (!f || !f2 || !this.f12868e.equals(irVar.f12868e))) {
            return false;
        }
        boolean g = mo42444g();
        boolean g2 = irVar.mo42444g();
        if ((g || g2) && (!g || !g2 || !this.f12869f.equals(irVar.f12869f))) {
            return false;
        }
        boolean h = mo42445h();
        boolean h2 = irVar.mo42445h();
        if ((h || h2) && (!h || !h2 || !this.f12859a.m13066a(irVar.f12859a))) {
            return false;
        }
        boolean i = mo42447i();
        boolean i2 = irVar.mo42447i();
        if ((i || i2) && (!i || !i2 || this.f12864a != irVar.f12864a)) {
            return false;
        }
        boolean j = mo42448j();
        boolean j2 = irVar.mo42448j();
        if ((j || j2) && (!j || !j2 || !this.f12863a.equals(irVar.f12863a))) {
            return false;
        }
        boolean k = mo42449k();
        boolean k2 = irVar.mo42449k();
        if ((k || k2) && (!k || !k2 || !this.f12870g.equals(irVar.f12870g))) {
            return false;
        }
        boolean l = mo42450l();
        boolean l2 = irVar.mo42450l();
        if (l || l2) {
            return l && l2 && this.f12871h.equals(irVar.f12871h);
        }
        return true;
    }

    /* renamed from: b */
    public String mo42437b() {
        return this.f12866c;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13454a();
        jkVar.mo42576a(f12847a);
        if (this.f12861a != null && m13457a()) {
            jkVar.mo42573a(f12846a);
            jkVar.mo42577a(this.f12861a);
            jkVar.mo42581b();
        }
        if (this.f12860a != null && m13461b()) {
            jkVar.mo42573a(f12848b);
            this.f12860a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12865b != null) {
            jkVar.mo42573a(f12849c);
            jkVar.mo42577a(this.f12865b);
            jkVar.mo42581b();
        }
        if (this.f12866c != null) {
            jkVar.mo42573a(f12850d);
            jkVar.mo42577a(this.f12866c);
            jkVar.mo42581b();
        }
        if (this.f12867d != null && m13467e()) {
            jkVar.mo42573a(f12851e);
            jkVar.mo42577a(this.f12867d);
            jkVar.mo42581b();
        }
        if (this.f12868e != null && m13469f()) {
            jkVar.mo42573a(f12852f);
            jkVar.mo42577a(this.f12868e);
            jkVar.mo42581b();
        }
        if (this.f12869f != null && mo42444g()) {
            jkVar.mo42573a(f12853g);
            jkVar.mo42577a(this.f12869f);
            jkVar.mo42581b();
        }
        if (this.f12859a != null && mo42445h()) {
            jkVar.mo42573a(f12854h);
            this.f12859a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (mo42447i()) {
            jkVar.mo42573a(f12855i);
            jkVar.mo42580a(this.f12864a);
            jkVar.mo42581b();
        }
        if (this.f12863a != null && mo42448j()) {
            jkVar.mo42573a(f12856j);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12863a.size()));
            for (Map.Entry<String, String> entry : this.f12863a.entrySet()) {
                jkVar.mo42577a(entry.getKey());
                jkVar.mo42577a(entry.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        if (this.f12870g != null && mo42449k()) {
            jkVar.mo42573a(f12857k);
            jkVar.mo42577a(this.f12870g);
            jkVar.mo42581b();
        }
        if (this.f12871h != null && mo42450l()) {
            jkVar.mo42573a(f12858l);
            jkVar.mo42577a(this.f12871h);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean m13461b() {
        return this.f12860a != null;
    }

    /* renamed from: c */
    public String mo42438c() {
        return this.f12868e;
    }

    /* renamed from: c */
    public boolean m13463c() {
        return this.f12865b != null;
    }

    /* renamed from: d */
    public String mo42440d() {
        return this.f12869f;
    }

    /* renamed from: d */
    public boolean m13465d() {
        return this.f12866c != null;
    }

    /* renamed from: e */
    public String mo42441e() {
        return this.f12870g;
    }

    /* renamed from: e */
    public boolean m13467e() {
        return this.f12867d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4524ir)) {
            return m13458a((C4524ir) obj);
        }
        return false;
    }

    /* renamed from: f */
    public String mo42443f() {
        return this.f12871h;
    }

    /* renamed from: f */
    public boolean m13469f() {
        return this.f12868e != null;
    }

    /* renamed from: g */
    public boolean mo42444g() {
        return this.f12869f != null;
    }

    /* renamed from: h */
    public boolean mo42445h() {
        return this.f12859a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42447i() {
        return this.f12862a.get(0);
    }

    /* renamed from: j */
    public boolean mo42448j() {
        return this.f12863a != null;
    }

    /* renamed from: k */
    public boolean mo42449k() {
        return this.f12870g != null;
    }

    /* renamed from: l */
    public boolean mo42450l() {
        return this.f12871h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (m13457a()) {
            sb.append("debug:");
            String str = this.f12861a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m13461b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12860a;
            if (idVar == null) {
                sb.append("null");
            } else {
                sb.append(idVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f12865b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f12866c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m13467e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f12867d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m13469f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f12868e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42444g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f12869f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42445h()) {
            sb.append(", ");
            sb.append("message:");
            C4507ia iaVar = this.f12859a;
            if (iaVar == null) {
                sb.append("null");
            } else {
                sb.append(iaVar);
            }
        }
        if (mo42447i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f12864a);
        }
        if (mo42448j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f12863a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo42449k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f12870g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo42450l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f12871h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
