package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.iw */
public class C4529iw implements AbstractC4532iz<C4529iw, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12955a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12956a = new C4554jp("XmPushActionUnSubscription");

    /* renamed from: b */
    public static final C4546jh f12957b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12958c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12959d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12960e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12961f = new C4546jh("", (byte) 11, 6);

    /* renamed from: g */
    public static final C4546jh f12962g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12963h = new C4546jh("", (byte) 15, 8);

    /* renamed from: a */
    public C4510id f12964a;

    /* renamed from: a */
    public String f12965a;

    /* renamed from: a */
    public List<String> f12966a;

    /* renamed from: b */
    public String f12967b;

    /* renamed from: c */
    public String f12968c;

    /* renamed from: d */
    public String f12969d;

    /* renamed from: e */
    public String f12970e;

    /* renamed from: f */
    public String f12971f;

    /* renamed from: a */
    public int compareTo(C4529iw iwVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!C4529iw.class.equals(iwVar.getClass())) {
            return C4529iw.class.getName().compareTo(iwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13557a()).compareTo(Boolean.valueOf(iwVar.m13557a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13557a() && (a8 = C4537ja.m13601a(this.f12965a, iwVar.f12965a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo42530b()).compareTo(Boolean.valueOf(iwVar.mo42530b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42530b() && (a7 = C4537ja.m13600a(this.f12964a, iwVar.f12964a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo42532c()).compareTo(Boolean.valueOf(iwVar.mo42532c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42532c() && (a6 = C4537ja.m13601a(this.f12967b, iwVar.f12967b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo42535d()).compareTo(Boolean.valueOf(iwVar.mo42535d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42535d() && (a5 = C4537ja.m13601a(this.f12968c, iwVar.f12968c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo42537e()).compareTo(Boolean.valueOf(iwVar.mo42537e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42537e() && (a4 = C4537ja.m13601a(this.f12969d, iwVar.f12969d)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo42539f()).compareTo(Boolean.valueOf(iwVar.mo42539f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42539f() && (a3 = C4537ja.m13601a(this.f12970e, iwVar.f12970e)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo42540g()).compareTo(Boolean.valueOf(iwVar.mo42540g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42540g() && (a2 = C4537ja.m13601a(this.f12971f, iwVar.f12971f)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo42541h()).compareTo(Boolean.valueOf(iwVar.mo42541h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo42541h() || (a = C4537ja.m13603a(this.f12966a, iwVar.f12966a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4529iw mo42527a(String str) {
        this.f12967b = str;
        return this;
    }

    /* renamed from: a */
    public void mo42528a() {
        if (this.f12967b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12968c == null) {
            throw new C4550jl("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f12969d == null) {
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
                mo42528a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12965a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12964a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12967b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12968c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12969d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f12970e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12971f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 15) {
                        C4547ji a2 = jkVar.m13662a();
                        this.f12966a = new ArrayList(a2.f13023a);
                        for (int i = 0; i < a2.f13023a; i++) {
                            this.f12966a.add(jkVar.m13666a());
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
    public boolean m13557a() {
        return this.f12965a != null;
    }

    /* renamed from: a */
    public boolean m13558a(C4529iw iwVar) {
        if (iwVar == null) {
            return false;
        }
        boolean a = m13557a();
        boolean a2 = iwVar.m13557a();
        if ((a || a2) && (!a || !a2 || !this.f12965a.equals(iwVar.f12965a))) {
            return false;
        }
        boolean b = mo42530b();
        boolean b2 = iwVar.mo42530b();
        if ((b || b2) && (!b || !b2 || !this.f12964a.m13142a(iwVar.f12964a))) {
            return false;
        }
        boolean c = mo42532c();
        boolean c2 = iwVar.mo42532c();
        if ((c || c2) && (!c || !c2 || !this.f12967b.equals(iwVar.f12967b))) {
            return false;
        }
        boolean d = mo42535d();
        boolean d2 = iwVar.mo42535d();
        if ((d || d2) && (!d || !d2 || !this.f12968c.equals(iwVar.f12968c))) {
            return false;
        }
        boolean e = mo42537e();
        boolean e2 = iwVar.mo42537e();
        if ((e || e2) && (!e || !e2 || !this.f12969d.equals(iwVar.f12969d))) {
            return false;
        }
        boolean f = mo42539f();
        boolean f2 = iwVar.mo42539f();
        if ((f || f2) && (!f || !f2 || !this.f12970e.equals(iwVar.f12970e))) {
            return false;
        }
        boolean g = mo42540g();
        boolean g2 = iwVar.mo42540g();
        if ((g || g2) && (!g || !g2 || !this.f12971f.equals(iwVar.f12971f))) {
            return false;
        }
        boolean h = mo42541h();
        boolean h2 = iwVar.mo42541h();
        if (h || h2) {
            return h && h2 && this.f12966a.equals(iwVar.f12966a);
        }
        return true;
    }

    /* renamed from: b */
    public C4529iw mo42529b(String str) {
        this.f12968c = str;
        return this;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42528a();
        jkVar.mo42576a(f12956a);
        if (this.f12965a != null && m13557a()) {
            jkVar.mo42573a(f12955a);
            jkVar.mo42577a(this.f12965a);
            jkVar.mo42581b();
        }
        if (this.f12964a != null && mo42530b()) {
            jkVar.mo42573a(f12957b);
            this.f12964a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12967b != null) {
            jkVar.mo42573a(f12958c);
            jkVar.mo42577a(this.f12967b);
            jkVar.mo42581b();
        }
        if (this.f12968c != null) {
            jkVar.mo42573a(f12959d);
            jkVar.mo42577a(this.f12968c);
            jkVar.mo42581b();
        }
        if (this.f12969d != null) {
            jkVar.mo42573a(f12960e);
            jkVar.mo42577a(this.f12969d);
            jkVar.mo42581b();
        }
        if (this.f12970e != null && mo42539f()) {
            jkVar.mo42573a(f12961f);
            jkVar.mo42577a(this.f12970e);
            jkVar.mo42581b();
        }
        if (this.f12971f != null && mo42540g()) {
            jkVar.mo42573a(f12962g);
            jkVar.mo42577a(this.f12971f);
            jkVar.mo42581b();
        }
        if (this.f12966a != null && mo42541h()) {
            jkVar.mo42573a(f12963h);
            jkVar.mo42574a(new C4547ji((byte) 11, this.f12966a.size()));
            for (String str : this.f12966a) {
                jkVar.mo42577a(str);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo42530b() {
        return this.f12964a != null;
    }

    /* renamed from: c */
    public C4529iw mo42531c(String str) {
        this.f12969d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo42532c() {
        return this.f12967b != null;
    }

    /* renamed from: d */
    public C4529iw mo42534d(String str) {
        this.f12970e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo42535d() {
        return this.f12968c != null;
    }

    /* renamed from: e */
    public C4529iw mo42536e(String str) {
        this.f12971f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo42537e() {
        return this.f12969d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4529iw)) {
            return m13558a((C4529iw) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42539f() {
        return this.f12970e != null;
    }

    /* renamed from: g */
    public boolean mo42540g() {
        return this.f12971f != null;
    }

    /* renamed from: h */
    public boolean mo42541h() {
        return this.f12966a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m13557a()) {
            sb.append("debug:");
            String str = this.f12965a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo42530b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12964a;
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
        String str2 = this.f12967b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f12968c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f12969d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (mo42539f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f12970e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42540g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f12971f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42541h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f12966a;
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
