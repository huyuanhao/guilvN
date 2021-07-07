package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.if */
public class C4512if implements AbstractC4532iz<C4512if, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12603a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12604a = new C4554jp("XmPushActionAckNotification");

    /* renamed from: b */
    public static final C4546jh f12605b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12606c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12607d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12608e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12609f = new C4546jh("", (byte) 10, 7);

    /* renamed from: g */
    public static final C4546jh f12610g = new C4546jh("", (byte) 11, 8);

    /* renamed from: h */
    public static final C4546jh f12611h = new C4546jh("", (byte) 13, 9);

    /* renamed from: i */
    public static final C4546jh f12612i = new C4546jh("", (byte) 11, 10);

    /* renamed from: j */
    public static final C4546jh f12613j = new C4546jh("", (byte) 11, 11);

    /* renamed from: a */
    public long f12614a = 0;

    /* renamed from: a */
    public C4510id f12615a;

    /* renamed from: a */
    public String f12616a;

    /* renamed from: a */
    public BitSet f12617a = new BitSet(1);

    /* renamed from: a */
    public Map<String, String> f12618a;

    /* renamed from: b */
    public String f12619b;

    /* renamed from: c */
    public String f12620c;

    /* renamed from: d */
    public String f12621d;

    /* renamed from: e */
    public String f12622e;

    /* renamed from: f */
    public String f12623f;

    /* renamed from: g */
    public String f12624g;

    /* renamed from: a */
    public int compareTo(C4512if ifVar) {
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
        if (!C4512if.class.equals(ifVar.getClass())) {
            return C4512if.class.getName().compareTo(ifVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13192a()).compareTo(Boolean.valueOf(ifVar.m13192a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13192a() && (a10 = C4537ja.m13601a(this.f12616a, ifVar.f12616a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo42200b()).compareTo(Boolean.valueOf(ifVar.mo42200b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42200b() && (a9 = C4537ja.m13600a(this.f12615a, ifVar.f12615a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo42201c()).compareTo(Boolean.valueOf(ifVar.mo42201c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42201c() && (a8 = C4537ja.m13601a(this.f12619b, ifVar.f12619b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo42203d()).compareTo(Boolean.valueOf(ifVar.mo42203d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42203d() && (a7 = C4537ja.m13601a(this.f12620c, ifVar.f12620c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo42204e()).compareTo(Boolean.valueOf(ifVar.mo42204e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42204e() && (a6 = C4537ja.m13601a(this.f12621d, ifVar.f12621d)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo42206f()).compareTo(Boolean.valueOf(ifVar.mo42206f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42206f() && (a5 = C4537ja.m13599a(this.f12614a, ifVar.f12614a)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo42207g()).compareTo(Boolean.valueOf(ifVar.mo42207g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42207g() && (a4 = C4537ja.m13601a(this.f12622e, ifVar.f12622e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo42208h()).compareTo(Boolean.valueOf(ifVar.mo42208h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42208h() && (a3 = C4537ja.m13604a(this.f12618a, ifVar.f12618a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo42210i()).compareTo(Boolean.valueOf(ifVar.mo42210i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42210i() && (a2 = C4537ja.m13601a(this.f12623f, ifVar.f12623f)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo42211j()).compareTo(Boolean.valueOf(ifVar.mo42211j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo42211j() || (a = C4537ja.m13601a(this.f12624g, ifVar.f12624g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo42198a() {
        return this.f12619b;
    }

    /* renamed from: a */
    public Map<String, String> m13188a() {
        return this.f12618a;
    }

    /* renamed from: a */
    public void m13189a() {
        if (this.f12619b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
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
                m13189a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12616a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12615a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12619b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12620c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12621d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 10) {
                        this.f12614a = jkVar.m13660a();
                        mo42199a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12622e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 13) {
                        C4548jj a2 = jkVar.m13663a();
                        this.f12618a = new HashMap(a2.f13025a * 2);
                        for (int i = 0; i < a2.f13025a; i++) {
                            this.f12618a.put(jkVar.m13666a(), jkVar.m13666a());
                        }
                        jkVar.mo42589h();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f12623f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f12624g = jkVar.m13666a();
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
    public void mo42199a(boolean z) {
        this.f12617a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13192a() {
        return this.f12616a != null;
    }

    /* renamed from: a */
    public boolean m13193a(C4512if ifVar) {
        if (ifVar == null) {
            return false;
        }
        boolean a = m13192a();
        boolean a2 = ifVar.m13192a();
        if ((a || a2) && (!a || !a2 || !this.f12616a.equals(ifVar.f12616a))) {
            return false;
        }
        boolean b = mo42200b();
        boolean b2 = ifVar.mo42200b();
        if ((b || b2) && (!b || !b2 || !this.f12615a.m13142a(ifVar.f12615a))) {
            return false;
        }
        boolean c = mo42201c();
        boolean c2 = ifVar.mo42201c();
        if ((c || c2) && (!c || !c2 || !this.f12619b.equals(ifVar.f12619b))) {
            return false;
        }
        boolean d = mo42203d();
        boolean d2 = ifVar.mo42203d();
        if ((d || d2) && (!d || !d2 || !this.f12620c.equals(ifVar.f12620c))) {
            return false;
        }
        boolean e = mo42204e();
        boolean e2 = ifVar.mo42204e();
        if ((e || e2) && (!e || !e2 || !this.f12621d.equals(ifVar.f12621d))) {
            return false;
        }
        boolean f = mo42206f();
        boolean f2 = ifVar.mo42206f();
        if ((f || f2) && (!f || !f2 || this.f12614a != ifVar.f12614a)) {
            return false;
        }
        boolean g = mo42207g();
        boolean g2 = ifVar.mo42207g();
        if ((g || g2) && (!g || !g2 || !this.f12622e.equals(ifVar.f12622e))) {
            return false;
        }
        boolean h = mo42208h();
        boolean h2 = ifVar.mo42208h();
        if ((h || h2) && (!h || !h2 || !this.f12618a.equals(ifVar.f12618a))) {
            return false;
        }
        boolean i = mo42210i();
        boolean i2 = ifVar.mo42210i();
        if ((i || i2) && (!i || !i2 || !this.f12623f.equals(ifVar.f12623f))) {
            return false;
        }
        boolean j = mo42211j();
        boolean j2 = ifVar.mo42211j();
        if (j || j2) {
            return j && j2 && this.f12624g.equals(ifVar.f12624g);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13189a();
        jkVar.mo42576a(f12604a);
        if (this.f12616a != null && m13192a()) {
            jkVar.mo42573a(f12603a);
            jkVar.mo42577a(this.f12616a);
            jkVar.mo42581b();
        }
        if (this.f12615a != null && mo42200b()) {
            jkVar.mo42573a(f12605b);
            this.f12615a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12619b != null) {
            jkVar.mo42573a(f12606c);
            jkVar.mo42577a(this.f12619b);
            jkVar.mo42581b();
        }
        if (this.f12620c != null && mo42203d()) {
            jkVar.mo42573a(f12607d);
            jkVar.mo42577a(this.f12620c);
            jkVar.mo42581b();
        }
        if (this.f12621d != null && mo42204e()) {
            jkVar.mo42573a(f12608e);
            jkVar.mo42577a(this.f12621d);
            jkVar.mo42581b();
        }
        if (mo42206f()) {
            jkVar.mo42573a(f12609f);
            jkVar.mo42572a(this.f12614a);
            jkVar.mo42581b();
        }
        if (this.f12622e != null && mo42207g()) {
            jkVar.mo42573a(f12610g);
            jkVar.mo42577a(this.f12622e);
            jkVar.mo42581b();
        }
        if (this.f12618a != null && mo42208h()) {
            jkVar.mo42573a(f12611h);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12618a.size()));
            for (Map.Entry<String, String> entry : this.f12618a.entrySet()) {
                jkVar.mo42577a(entry.getKey());
                jkVar.mo42577a(entry.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        if (this.f12623f != null && mo42210i()) {
            jkVar.mo42573a(f12612i);
            jkVar.mo42577a(this.f12623f);
            jkVar.mo42581b();
        }
        if (this.f12624g != null && mo42211j()) {
            jkVar.mo42573a(f12613j);
            jkVar.mo42577a(this.f12624g);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo42200b() {
        return this.f12615a != null;
    }

    /* renamed from: c */
    public boolean mo42201c() {
        return this.f12619b != null;
    }

    /* renamed from: d */
    public boolean mo42203d() {
        return this.f12620c != null;
    }

    /* renamed from: e */
    public boolean mo42204e() {
        return this.f12621d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4512if)) {
            return m13193a((C4512if) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42206f() {
        return this.f12617a.get(0);
    }

    /* renamed from: g */
    public boolean mo42207g() {
        return this.f12622e != null;
    }

    /* renamed from: h */
    public boolean mo42208h() {
        return this.f12618a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42210i() {
        return this.f12623f != null;
    }

    /* renamed from: j */
    public boolean mo42211j() {
        return this.f12624g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m13192a()) {
            sb.append("debug:");
            String str = this.f12616a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo42200b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12615a;
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
        String str2 = this.f12619b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo42203d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f12620c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo42204e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f12621d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42206f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f12614a);
        }
        if (mo42207g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f12622e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42208h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f12618a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo42210i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f12623f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42211j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f12624g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
