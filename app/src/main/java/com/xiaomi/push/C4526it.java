package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.it */
public class C4526it implements AbstractC4532iz<C4526it, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12889a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12890a = new C4554jp("XmPushActionSubscriptionResult");

    /* renamed from: b */
    public static final C4546jh f12891b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12892c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12893d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12894e = new C4546jh("", (byte) 10, 6);

    /* renamed from: f */
    public static final C4546jh f12895f = new C4546jh("", (byte) 11, 7);

    /* renamed from: g */
    public static final C4546jh f12896g = new C4546jh("", (byte) 11, 8);

    /* renamed from: h */
    public static final C4546jh f12897h = new C4546jh("", (byte) 11, 9);

    /* renamed from: i */
    public static final C4546jh f12898i = new C4546jh("", (byte) 11, 10);

    /* renamed from: a */
    public long f12899a;

    /* renamed from: a */
    public C4510id f12900a;

    /* renamed from: a */
    public String f12901a;

    /* renamed from: a */
    public BitSet f12902a = new BitSet(1);

    /* renamed from: b */
    public String f12903b;

    /* renamed from: c */
    public String f12904c;

    /* renamed from: d */
    public String f12905d;

    /* renamed from: e */
    public String f12906e;

    /* renamed from: f */
    public String f12907f;

    /* renamed from: g */
    public String f12908g;

    /* renamed from: a */
    public int compareTo(C4526it itVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!C4526it.class.equals(itVar.getClass())) {
            return C4526it.class.getName().compareTo(itVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13499a()).compareTo(Boolean.valueOf(itVar.m13499a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13499a() && (a9 = C4537ja.m13601a(this.f12901a, itVar.f12901a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(m13503b()).compareTo(Boolean.valueOf(itVar.m13503b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13503b() && (a8 = C4537ja.m13600a(this.f12900a, itVar.f12900a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo42474c()).compareTo(Boolean.valueOf(itVar.mo42474c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42474c() && (a7 = C4537ja.m13601a(this.f12903b, itVar.f12903b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo42476d()).compareTo(Boolean.valueOf(itVar.mo42476d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42476d() && (a6 = C4537ja.m13601a(this.f12904c, itVar.f12904c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo42477e()).compareTo(Boolean.valueOf(itVar.mo42477e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42477e() && (a5 = C4537ja.m13599a(this.f12899a, itVar.f12899a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo42479f()).compareTo(Boolean.valueOf(itVar.mo42479f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42479f() && (a4 = C4537ja.m13601a(this.f12905d, itVar.f12905d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo42480g()).compareTo(Boolean.valueOf(itVar.mo42480g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42480g() && (a3 = C4537ja.m13601a(this.f12906e, itVar.f12906e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo42481h()).compareTo(Boolean.valueOf(itVar.mo42481h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42481h() && (a2 = C4537ja.m13601a(this.f12907f, itVar.f12907f)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo42483i()).compareTo(Boolean.valueOf(itVar.mo42483i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo42483i() || (a = C4537ja.m13601a(this.f12908g, itVar.f12908g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo42471a() {
        return this.f12906e;
    }

    /* renamed from: a */
    public void m13496a() {
        if (this.f12903b == null) {
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
                m13496a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12901a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12900a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12903b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12904c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 10) {
                        this.f12899a = jkVar.m13660a();
                        mo42472a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12905d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12906e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12907f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f12908g = jkVar.m13666a();
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
    public void mo42472a(boolean z) {
        this.f12902a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13499a() {
        return this.f12901a != null;
    }

    /* renamed from: a */
    public boolean m13500a(C4526it itVar) {
        if (itVar == null) {
            return false;
        }
        boolean a = m13499a();
        boolean a2 = itVar.m13499a();
        if ((a || a2) && (!a || !a2 || !this.f12901a.equals(itVar.f12901a))) {
            return false;
        }
        boolean b = m13503b();
        boolean b2 = itVar.m13503b();
        if ((b || b2) && (!b || !b2 || !this.f12900a.m13142a(itVar.f12900a))) {
            return false;
        }
        boolean c = mo42474c();
        boolean c2 = itVar.mo42474c();
        if ((c || c2) && (!c || !c2 || !this.f12903b.equals(itVar.f12903b))) {
            return false;
        }
        boolean d = mo42476d();
        boolean d2 = itVar.mo42476d();
        if ((d || d2) && (!d || !d2 || !this.f12904c.equals(itVar.f12904c))) {
            return false;
        }
        boolean e = mo42477e();
        boolean e2 = itVar.mo42477e();
        if ((e || e2) && (!e || !e2 || this.f12899a != itVar.f12899a)) {
            return false;
        }
        boolean f = mo42479f();
        boolean f2 = itVar.mo42479f();
        if ((f || f2) && (!f || !f2 || !this.f12905d.equals(itVar.f12905d))) {
            return false;
        }
        boolean g = mo42480g();
        boolean g2 = itVar.mo42480g();
        if ((g || g2) && (!g || !g2 || !this.f12906e.equals(itVar.f12906e))) {
            return false;
        }
        boolean h = mo42481h();
        boolean h2 = itVar.mo42481h();
        if ((h || h2) && (!h || !h2 || !this.f12907f.equals(itVar.f12907f))) {
            return false;
        }
        boolean i = mo42483i();
        boolean i2 = itVar.mo42483i();
        if (i || i2) {
            return i && i2 && this.f12908g.equals(itVar.f12908g);
        }
        return true;
    }

    /* renamed from: b */
    public String mo42473b() {
        return this.f12908g;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13496a();
        jkVar.mo42576a(f12890a);
        if (this.f12901a != null && m13499a()) {
            jkVar.mo42573a(f12889a);
            jkVar.mo42577a(this.f12901a);
            jkVar.mo42581b();
        }
        if (this.f12900a != null && m13503b()) {
            jkVar.mo42573a(f12891b);
            this.f12900a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12903b != null) {
            jkVar.mo42573a(f12892c);
            jkVar.mo42577a(this.f12903b);
            jkVar.mo42581b();
        }
        if (this.f12904c != null && mo42476d()) {
            jkVar.mo42573a(f12893d);
            jkVar.mo42577a(this.f12904c);
            jkVar.mo42581b();
        }
        if (mo42477e()) {
            jkVar.mo42573a(f12894e);
            jkVar.mo42572a(this.f12899a);
            jkVar.mo42581b();
        }
        if (this.f12905d != null && mo42479f()) {
            jkVar.mo42573a(f12895f);
            jkVar.mo42577a(this.f12905d);
            jkVar.mo42581b();
        }
        if (this.f12906e != null && mo42480g()) {
            jkVar.mo42573a(f12896g);
            jkVar.mo42577a(this.f12906e);
            jkVar.mo42581b();
        }
        if (this.f12907f != null && mo42481h()) {
            jkVar.mo42573a(f12897h);
            jkVar.mo42577a(this.f12907f);
            jkVar.mo42581b();
        }
        if (this.f12908g != null && mo42483i()) {
            jkVar.mo42573a(f12898i);
            jkVar.mo42577a(this.f12908g);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean m13503b() {
        return this.f12900a != null;
    }

    /* renamed from: c */
    public boolean mo42474c() {
        return this.f12903b != null;
    }

    /* renamed from: d */
    public boolean mo42476d() {
        return this.f12904c != null;
    }

    /* renamed from: e */
    public boolean mo42477e() {
        return this.f12902a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4526it)) {
            return m13500a((C4526it) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42479f() {
        return this.f12905d != null;
    }

    /* renamed from: g */
    public boolean mo42480g() {
        return this.f12906e != null;
    }

    /* renamed from: h */
    public boolean mo42481h() {
        return this.f12907f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42483i() {
        return this.f12908g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (m13499a()) {
            sb.append("debug:");
            String str = this.f12901a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m13503b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12900a;
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
        String str2 = this.f12903b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo42476d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f12904c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo42477e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f12899a);
        }
        if (mo42479f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f12905d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42480g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f12906e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42481h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f12907f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42483i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f12908g;
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
