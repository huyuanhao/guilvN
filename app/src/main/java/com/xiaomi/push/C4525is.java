package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.is */
public class C4525is implements AbstractC4532iz<C4525is, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12872a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12873a = new C4554jp("XmPushActionSubscription");

    /* renamed from: b */
    public static final C4546jh f12874b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12875c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12876d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12877e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12878f = new C4546jh("", (byte) 11, 6);

    /* renamed from: g */
    public static final C4546jh f12879g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12880h = new C4546jh("", (byte) 15, 8);

    /* renamed from: a */
    public C4510id f12881a;

    /* renamed from: a */
    public String f12882a;

    /* renamed from: a */
    public List<String> f12883a;

    /* renamed from: b */
    public String f12884b;

    /* renamed from: c */
    public String f12885c;

    /* renamed from: d */
    public String f12886d;

    /* renamed from: e */
    public String f12887e;

    /* renamed from: f */
    public String f12888f;

    /* renamed from: a */
    public int compareTo(C4525is isVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!C4525is.class.equals(isVar.getClass())) {
            return C4525is.class.getName().compareTo(isVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13480a()).compareTo(Boolean.valueOf(isVar.m13480a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13480a() && (a8 = C4537ja.m13601a(this.f12882a, isVar.f12882a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo42456b()).compareTo(Boolean.valueOf(isVar.mo42456b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42456b() && (a7 = C4537ja.m13600a(this.f12881a, isVar.f12881a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo42458c()).compareTo(Boolean.valueOf(isVar.mo42458c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42458c() && (a6 = C4537ja.m13601a(this.f12884b, isVar.f12884b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo42461d()).compareTo(Boolean.valueOf(isVar.mo42461d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42461d() && (a5 = C4537ja.m13601a(this.f12885c, isVar.f12885c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo42463e()).compareTo(Boolean.valueOf(isVar.mo42463e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42463e() && (a4 = C4537ja.m13601a(this.f12886d, isVar.f12886d)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo42465f()).compareTo(Boolean.valueOf(isVar.mo42465f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42465f() && (a3 = C4537ja.m13601a(this.f12887e, isVar.f12887e)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo42466g()).compareTo(Boolean.valueOf(isVar.mo42466g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42466g() && (a2 = C4537ja.m13601a(this.f12888f, isVar.f12888f)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo42467h()).compareTo(Boolean.valueOf(isVar.mo42467h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo42467h() || (a = C4537ja.m13603a(this.f12883a, isVar.f12883a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4525is mo42453a(String str) {
        this.f12884b = str;
        return this;
    }

    /* renamed from: a */
    public void mo42454a() {
        if (this.f12884b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12885c == null) {
            throw new C4550jl("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f12886d == null) {
            throw new C4550jl("Required field 'topic' was not present! Struct: " + toString());
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
                mo42454a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12882a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12881a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12884b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12885c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12886d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f12887e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12888f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 15) {
                        C4547ji a2 = jkVar.m13662a();
                        this.f12883a = new ArrayList(a2.f13023a);
                        for (int i = 0; i < a2.f13023a; i++) {
                            this.f12883a.add(jkVar.m13666a());
                        }
                        jkVar.mo42590i();
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
    public boolean m13480a() {
        return this.f12882a != null;
    }

    /* renamed from: a */
    public boolean m13481a(C4525is isVar) {
        if (isVar == null) {
            return false;
        }
        boolean a = m13480a();
        boolean a2 = isVar.m13480a();
        if ((a || a2) && (!a || !a2 || !this.f12882a.equals(isVar.f12882a))) {
            return false;
        }
        boolean b = mo42456b();
        boolean b2 = isVar.mo42456b();
        if ((b || b2) && (!b || !b2 || !this.f12881a.m13142a(isVar.f12881a))) {
            return false;
        }
        boolean c = mo42458c();
        boolean c2 = isVar.mo42458c();
        if ((c || c2) && (!c || !c2 || !this.f12884b.equals(isVar.f12884b))) {
            return false;
        }
        boolean d = mo42461d();
        boolean d2 = isVar.mo42461d();
        if ((d || d2) && (!d || !d2 || !this.f12885c.equals(isVar.f12885c))) {
            return false;
        }
        boolean e = mo42463e();
        boolean e2 = isVar.mo42463e();
        if ((e || e2) && (!e || !e2 || !this.f12886d.equals(isVar.f12886d))) {
            return false;
        }
        boolean f = mo42465f();
        boolean f2 = isVar.mo42465f();
        if ((f || f2) && (!f || !f2 || !this.f12887e.equals(isVar.f12887e))) {
            return false;
        }
        boolean g = mo42466g();
        boolean g2 = isVar.mo42466g();
        if ((g || g2) && (!g || !g2 || !this.f12888f.equals(isVar.f12888f))) {
            return false;
        }
        boolean h = mo42467h();
        boolean h2 = isVar.mo42467h();
        if (h || h2) {
            return h && h2 && this.f12883a.equals(isVar.f12883a);
        }
        return true;
    }

    /* renamed from: b */
    public C4525is mo42455b(String str) {
        this.f12885c = str;
        return this;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42454a();
        jkVar.mo42576a(f12873a);
        if (this.f12882a != null && m13480a()) {
            jkVar.mo42573a(f12872a);
            jkVar.mo42577a(this.f12882a);
            jkVar.mo42581b();
        }
        if (this.f12881a != null && mo42456b()) {
            jkVar.mo42573a(f12874b);
            this.f12881a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12884b != null) {
            jkVar.mo42573a(f12875c);
            jkVar.mo42577a(this.f12884b);
            jkVar.mo42581b();
        }
        if (this.f12885c != null) {
            jkVar.mo42573a(f12876d);
            jkVar.mo42577a(this.f12885c);
            jkVar.mo42581b();
        }
        if (this.f12886d != null) {
            jkVar.mo42573a(f12877e);
            jkVar.mo42577a(this.f12886d);
            jkVar.mo42581b();
        }
        if (this.f12887e != null && mo42465f()) {
            jkVar.mo42573a(f12878f);
            jkVar.mo42577a(this.f12887e);
            jkVar.mo42581b();
        }
        if (this.f12888f != null && mo42466g()) {
            jkVar.mo42573a(f12879g);
            jkVar.mo42577a(this.f12888f);
            jkVar.mo42581b();
        }
        if (this.f12883a != null && mo42467h()) {
            jkVar.mo42573a(f12880h);
            jkVar.mo42574a(new C4547ji((byte) 11, this.f12883a.size()));
            for (String str : this.f12883a) {
                jkVar.mo42577a(str);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo42456b() {
        return this.f12881a != null;
    }

    /* renamed from: c */
    public C4525is mo42457c(String str) {
        this.f12886d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo42458c() {
        return this.f12884b != null;
    }

    /* renamed from: d */
    public C4525is mo42460d(String str) {
        this.f12887e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo42461d() {
        return this.f12885c != null;
    }

    /* renamed from: e */
    public C4525is mo42462e(String str) {
        this.f12888f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo42463e() {
        return this.f12886d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4525is)) {
            return m13481a((C4525is) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42465f() {
        return this.f12887e != null;
    }

    /* renamed from: g */
    public boolean mo42466g() {
        return this.f12888f != null;
    }

    /* renamed from: h */
    public boolean mo42467h() {
        return this.f12883a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m13480a()) {
            sb.append("debug:");
            String str = this.f12882a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo42456b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12881a;
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
        String str2 = this.f12884b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f12885c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f12886d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (mo42465f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f12887e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42466g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f12888f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42467h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f12883a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
