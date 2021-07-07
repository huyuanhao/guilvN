package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.iv */
public class C4528iv implements AbstractC4532iz<C4528iv, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12935a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12936a = new C4554jp("XmPushActionUnRegistrationResult");

    /* renamed from: b */
    public static final C4546jh f12937b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12938c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12939d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12940e = new C4546jh("", (byte) 10, 6);

    /* renamed from: f */
    public static final C4546jh f12941f = new C4546jh("", (byte) 11, 7);

    /* renamed from: g */
    public static final C4546jh f12942g = new C4546jh("", (byte) 11, 8);

    /* renamed from: h */
    public static final C4546jh f12943h = new C4546jh("", (byte) 10, 9);

    /* renamed from: i */
    public static final C4546jh f12944i = new C4546jh("", (byte) 10, 10);

    /* renamed from: a */
    public long f12945a;

    /* renamed from: a */
    public C4510id f12946a;

    /* renamed from: a */
    public String f12947a;

    /* renamed from: a */
    public BitSet f12948a = new BitSet(3);

    /* renamed from: b */
    public long f12949b;

    /* renamed from: b */
    public String f12950b;

    /* renamed from: c */
    public long f12951c;

    /* renamed from: c */
    public String f12952c;

    /* renamed from: d */
    public String f12953d;

    /* renamed from: e */
    public String f12954e;

    /* renamed from: a */
    public int compareTo(C4528iv ivVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!C4528iv.class.equals(ivVar.getClass())) {
            return C4528iv.class.getName().compareTo(ivVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13540a()).compareTo(Boolean.valueOf(ivVar.m13540a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13540a() && (a9 = C4537ja.m13601a(this.f12947a, ivVar.f12947a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo42513b()).compareTo(Boolean.valueOf(ivVar.mo42513b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42513b() && (a8 = C4537ja.m13600a(this.f12946a, ivVar.f12946a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo42515c()).compareTo(Boolean.valueOf(ivVar.mo42515c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42515c() && (a7 = C4537ja.m13601a(this.f12950b, ivVar.f12950b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo42517d()).compareTo(Boolean.valueOf(ivVar.mo42517d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42517d() && (a6 = C4537ja.m13601a(this.f12952c, ivVar.f12952c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo42518e()).compareTo(Boolean.valueOf(ivVar.mo42518e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42518e() && (a5 = C4537ja.m13599a(this.f12945a, ivVar.f12945a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo42520f()).compareTo(Boolean.valueOf(ivVar.mo42520f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42520f() && (a4 = C4537ja.m13601a(this.f12953d, ivVar.f12953d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo42521g()).compareTo(Boolean.valueOf(ivVar.mo42521g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42521g() && (a3 = C4537ja.m13601a(this.f12954e, ivVar.f12954e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo42522h()).compareTo(Boolean.valueOf(ivVar.mo42522h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42522h() && (a2 = C4537ja.m13599a(this.f12949b, ivVar.f12949b)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo42524i()).compareTo(Boolean.valueOf(ivVar.mo42524i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo42524i() || (a = C4537ja.m13599a(this.f12951c, ivVar.f12951c)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo42510a() {
        return this.f12954e;
    }

    /* renamed from: a */
    public void m13537a() {
        if (this.f12950b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12952c == null) {
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
                if (mo42518e()) {
                    m13537a();
                    return;
                }
                throw new C4550jl("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12947a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12946a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12950b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12952c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 10) {
                        this.f12945a = jkVar.m13660a();
                        mo42511a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12953d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12954e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 10) {
                        this.f12949b = jkVar.m13660a();
                        mo42512b(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 10) {
                        this.f12951c = jkVar.m13660a();
                        mo42514c(true);
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
    public void mo42511a(boolean z) {
        this.f12948a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13540a() {
        return this.f12947a != null;
    }

    /* renamed from: a */
    public boolean m13541a(C4528iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean a = m13540a();
        boolean a2 = ivVar.m13540a();
        if ((a || a2) && (!a || !a2 || !this.f12947a.equals(ivVar.f12947a))) {
            return false;
        }
        boolean b = mo42513b();
        boolean b2 = ivVar.mo42513b();
        if ((b || b2) && (!b || !b2 || !this.f12946a.m13142a(ivVar.f12946a))) {
            return false;
        }
        boolean c = mo42515c();
        boolean c2 = ivVar.mo42515c();
        if ((c || c2) && (!c || !c2 || !this.f12950b.equals(ivVar.f12950b))) {
            return false;
        }
        boolean d = mo42517d();
        boolean d2 = ivVar.mo42517d();
        if (((d || d2) && (!d || !d2 || !this.f12952c.equals(ivVar.f12952c))) || this.f12945a != ivVar.f12945a) {
            return false;
        }
        boolean f = mo42520f();
        boolean f2 = ivVar.mo42520f();
        if ((f || f2) && (!f || !f2 || !this.f12953d.equals(ivVar.f12953d))) {
            return false;
        }
        boolean g = mo42521g();
        boolean g2 = ivVar.mo42521g();
        if ((g || g2) && (!g || !g2 || !this.f12954e.equals(ivVar.f12954e))) {
            return false;
        }
        boolean h = mo42522h();
        boolean h2 = ivVar.mo42522h();
        if ((h || h2) && (!h || !h2 || this.f12949b != ivVar.f12949b)) {
            return false;
        }
        boolean i = mo42524i();
        boolean i2 = ivVar.mo42524i();
        if (i || i2) {
            return i && i2 && this.f12951c == ivVar.f12951c;
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13537a();
        jkVar.mo42576a(f12936a);
        if (this.f12947a != null && m13540a()) {
            jkVar.mo42573a(f12935a);
            jkVar.mo42577a(this.f12947a);
            jkVar.mo42581b();
        }
        if (this.f12946a != null && mo42513b()) {
            jkVar.mo42573a(f12937b);
            this.f12946a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12950b != null) {
            jkVar.mo42573a(f12938c);
            jkVar.mo42577a(this.f12950b);
            jkVar.mo42581b();
        }
        if (this.f12952c != null) {
            jkVar.mo42573a(f12939d);
            jkVar.mo42577a(this.f12952c);
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12940e);
        jkVar.mo42572a(this.f12945a);
        jkVar.mo42581b();
        if (this.f12953d != null && mo42520f()) {
            jkVar.mo42573a(f12941f);
            jkVar.mo42577a(this.f12953d);
            jkVar.mo42581b();
        }
        if (this.f12954e != null && mo42521g()) {
            jkVar.mo42573a(f12942g);
            jkVar.mo42577a(this.f12954e);
            jkVar.mo42581b();
        }
        if (mo42522h()) {
            jkVar.mo42573a(f12943h);
            jkVar.mo42572a(this.f12949b);
            jkVar.mo42581b();
        }
        if (mo42524i()) {
            jkVar.mo42573a(f12944i);
            jkVar.mo42572a(this.f12951c);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42512b(boolean z) {
        this.f12948a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo42513b() {
        return this.f12946a != null;
    }

    /* renamed from: c */
    public void mo42514c(boolean z) {
        this.f12948a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo42515c() {
        return this.f12950b != null;
    }

    /* renamed from: d */
    public boolean mo42517d() {
        return this.f12952c != null;
    }

    /* renamed from: e */
    public boolean mo42518e() {
        return this.f12948a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4528iv)) {
            return m13541a((C4528iv) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42520f() {
        return this.f12953d != null;
    }

    /* renamed from: g */
    public boolean mo42521g() {
        return this.f12954e != null;
    }

    /* renamed from: h */
    public boolean mo42522h() {
        return this.f12948a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42524i() {
        return this.f12948a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (m13540a()) {
            sb.append("debug:");
            String str = this.f12947a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo42513b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12946a;
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
        String str2 = this.f12950b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f12952c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f12945a);
        if (mo42520f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f12953d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42521g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f12954e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42522h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f12949b);
        }
        if (mo42524i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f12951c);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
