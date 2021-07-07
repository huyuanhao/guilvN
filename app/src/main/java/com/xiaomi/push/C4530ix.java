package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ix */
public class C4530ix implements AbstractC4532iz<C4530ix, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12972a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12973a = new C4554jp("XmPushActionUnSubscriptionResult");

    /* renamed from: b */
    public static final C4546jh f12974b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12975c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12976d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12977e = new C4546jh("", (byte) 10, 6);

    /* renamed from: f */
    public static final C4546jh f12978f = new C4546jh("", (byte) 11, 7);

    /* renamed from: g */
    public static final C4546jh f12979g = new C4546jh("", (byte) 11, 8);

    /* renamed from: h */
    public static final C4546jh f12980h = new C4546jh("", (byte) 11, 9);

    /* renamed from: i */
    public static final C4546jh f12981i = new C4546jh("", (byte) 11, 10);

    /* renamed from: a */
    public long f12982a;

    /* renamed from: a */
    public C4510id f12983a;

    /* renamed from: a */
    public String f12984a;

    /* renamed from: a */
    public BitSet f12985a = new BitSet(1);

    /* renamed from: b */
    public String f12986b;

    /* renamed from: c */
    public String f12987c;

    /* renamed from: d */
    public String f12988d;

    /* renamed from: e */
    public String f12989e;

    /* renamed from: f */
    public String f12990f;

    /* renamed from: g */
    public String f12991g;

    /* renamed from: a */
    public int compareTo(C4530ix ixVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!C4530ix.class.equals(ixVar.getClass())) {
            return C4530ix.class.getName().compareTo(ixVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13576a()).compareTo(Boolean.valueOf(ixVar.m13576a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13576a() && (a9 = C4537ja.m13601a(this.f12984a, ixVar.f12984a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(m13580b()).compareTo(Boolean.valueOf(ixVar.m13580b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13580b() && (a8 = C4537ja.m13600a(this.f12983a, ixVar.f12983a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo42548c()).compareTo(Boolean.valueOf(ixVar.mo42548c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42548c() && (a7 = C4537ja.m13601a(this.f12986b, ixVar.f12986b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo42550d()).compareTo(Boolean.valueOf(ixVar.mo42550d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42550d() && (a6 = C4537ja.m13601a(this.f12987c, ixVar.f12987c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo42551e()).compareTo(Boolean.valueOf(ixVar.mo42551e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42551e() && (a5 = C4537ja.m13599a(this.f12982a, ixVar.f12982a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo42553f()).compareTo(Boolean.valueOf(ixVar.mo42553f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42553f() && (a4 = C4537ja.m13601a(this.f12988d, ixVar.f12988d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo42554g()).compareTo(Boolean.valueOf(ixVar.mo42554g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42554g() && (a3 = C4537ja.m13601a(this.f12989e, ixVar.f12989e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo42555h()).compareTo(Boolean.valueOf(ixVar.mo42555h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42555h() && (a2 = C4537ja.m13601a(this.f12990f, ixVar.f12990f)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo42557i()).compareTo(Boolean.valueOf(ixVar.mo42557i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo42557i() || (a = C4537ja.m13601a(this.f12991g, ixVar.f12991g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo42545a() {
        return this.f12989e;
    }

    /* renamed from: a */
    public void m13573a() {
        if (this.f12986b == null) {
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
                m13573a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12984a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12983a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12986b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12987c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 10) {
                        this.f12982a = jkVar.m13660a();
                        mo42546a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12988d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12989e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12990f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f12991g = jkVar.m13666a();
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
    public void mo42546a(boolean z) {
        this.f12985a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13576a() {
        return this.f12984a != null;
    }

    /* renamed from: a */
    public boolean m13577a(C4530ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        boolean a = m13576a();
        boolean a2 = ixVar.m13576a();
        if ((a || a2) && (!a || !a2 || !this.f12984a.equals(ixVar.f12984a))) {
            return false;
        }
        boolean b = m13580b();
        boolean b2 = ixVar.m13580b();
        if ((b || b2) && (!b || !b2 || !this.f12983a.m13142a(ixVar.f12983a))) {
            return false;
        }
        boolean c = mo42548c();
        boolean c2 = ixVar.mo42548c();
        if ((c || c2) && (!c || !c2 || !this.f12986b.equals(ixVar.f12986b))) {
            return false;
        }
        boolean d = mo42550d();
        boolean d2 = ixVar.mo42550d();
        if ((d || d2) && (!d || !d2 || !this.f12987c.equals(ixVar.f12987c))) {
            return false;
        }
        boolean e = mo42551e();
        boolean e2 = ixVar.mo42551e();
        if ((e || e2) && (!e || !e2 || this.f12982a != ixVar.f12982a)) {
            return false;
        }
        boolean f = mo42553f();
        boolean f2 = ixVar.mo42553f();
        if ((f || f2) && (!f || !f2 || !this.f12988d.equals(ixVar.f12988d))) {
            return false;
        }
        boolean g = mo42554g();
        boolean g2 = ixVar.mo42554g();
        if ((g || g2) && (!g || !g2 || !this.f12989e.equals(ixVar.f12989e))) {
            return false;
        }
        boolean h = mo42555h();
        boolean h2 = ixVar.mo42555h();
        if ((h || h2) && (!h || !h2 || !this.f12990f.equals(ixVar.f12990f))) {
            return false;
        }
        boolean i = mo42557i();
        boolean i2 = ixVar.mo42557i();
        if (i || i2) {
            return i && i2 && this.f12991g.equals(ixVar.f12991g);
        }
        return true;
    }

    /* renamed from: b */
    public String mo42547b() {
        return this.f12991g;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13573a();
        jkVar.mo42576a(f12973a);
        if (this.f12984a != null && m13576a()) {
            jkVar.mo42573a(f12972a);
            jkVar.mo42577a(this.f12984a);
            jkVar.mo42581b();
        }
        if (this.f12983a != null && m13580b()) {
            jkVar.mo42573a(f12974b);
            this.f12983a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12986b != null) {
            jkVar.mo42573a(f12975c);
            jkVar.mo42577a(this.f12986b);
            jkVar.mo42581b();
        }
        if (this.f12987c != null && mo42550d()) {
            jkVar.mo42573a(f12976d);
            jkVar.mo42577a(this.f12987c);
            jkVar.mo42581b();
        }
        if (mo42551e()) {
            jkVar.mo42573a(f12977e);
            jkVar.mo42572a(this.f12982a);
            jkVar.mo42581b();
        }
        if (this.f12988d != null && mo42553f()) {
            jkVar.mo42573a(f12978f);
            jkVar.mo42577a(this.f12988d);
            jkVar.mo42581b();
        }
        if (this.f12989e != null && mo42554g()) {
            jkVar.mo42573a(f12979g);
            jkVar.mo42577a(this.f12989e);
            jkVar.mo42581b();
        }
        if (this.f12990f != null && mo42555h()) {
            jkVar.mo42573a(f12980h);
            jkVar.mo42577a(this.f12990f);
            jkVar.mo42581b();
        }
        if (this.f12991g != null && mo42557i()) {
            jkVar.mo42573a(f12981i);
            jkVar.mo42577a(this.f12991g);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean m13580b() {
        return this.f12983a != null;
    }

    /* renamed from: c */
    public boolean mo42548c() {
        return this.f12986b != null;
    }

    /* renamed from: d */
    public boolean mo42550d() {
        return this.f12987c != null;
    }

    /* renamed from: e */
    public boolean mo42551e() {
        return this.f12985a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4530ix)) {
            return m13577a((C4530ix) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42553f() {
        return this.f12988d != null;
    }

    /* renamed from: g */
    public boolean mo42554g() {
        return this.f12989e != null;
    }

    /* renamed from: h */
    public boolean mo42555h() {
        return this.f12990f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42557i() {
        return this.f12991g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m13576a()) {
            sb.append("debug:");
            String str = this.f12984a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m13580b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12983a;
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
        String str2 = this.f12986b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo42550d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f12987c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo42551e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f12982a);
        }
        if (mo42553f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f12988d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42554g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f12989e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42555h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f12990f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42557i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f12991g;
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
