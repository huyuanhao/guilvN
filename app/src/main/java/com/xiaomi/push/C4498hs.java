package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hs */
public class C4498hs implements AbstractC4532iz<C4498hs, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12249a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12250a = new C4554jp("ClientUploadDataItem");

    /* renamed from: b */
    public static final C4546jh f12251b = new C4546jh("", (byte) 11, 2);

    /* renamed from: c */
    public static final C4546jh f12252c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12253d = new C4546jh("", (byte) 10, 4);

    /* renamed from: e */
    public static final C4546jh f12254e = new C4546jh("", (byte) 10, 5);

    /* renamed from: f */
    public static final C4546jh f12255f = new C4546jh("", (byte) 2, 6);

    /* renamed from: g */
    public static final C4546jh f12256g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12257h = new C4546jh("", (byte) 11, 8);

    /* renamed from: i */
    public static final C4546jh f12258i = new C4546jh("", (byte) 11, 9);

    /* renamed from: j */
    public static final C4546jh f12259j = new C4546jh("", (byte) 13, 10);

    /* renamed from: k */
    public static final C4546jh f12260k = new C4546jh("", (byte) 11, 11);

    /* renamed from: a */
    public long f12261a;

    /* renamed from: a */
    public String f12262a;

    /* renamed from: a */
    public BitSet f12263a = new BitSet(3);

    /* renamed from: a */
    public Map<String, String> f12264a;

    /* renamed from: a */
    public boolean f12265a;

    /* renamed from: b */
    public long f12266b;

    /* renamed from: b */
    public String f12267b;

    /* renamed from: c */
    public String f12268c;

    /* renamed from: d */
    public String f12269d;

    /* renamed from: e */
    public String f12270e;

    /* renamed from: f */
    public String f12271f;

    /* renamed from: g */
    public String f12272g;

    /* renamed from: a */
    public int compareTo(C4498hs hsVar) {
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
        if (!C4498hs.class.equals(hsVar.getClass())) {
            return C4498hs.class.getName().compareTo(hsVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12949a()).compareTo(Boolean.valueOf(hsVar.m12949a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12949a() && (a11 = C4537ja.m13601a(this.f12262a, hsVar.f12262a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m12956b()).compareTo(Boolean.valueOf(hsVar.m12956b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12956b() && (a10 = C4537ja.m13601a(this.f12267b, hsVar.f12267b)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(m12960c()).compareTo(Boolean.valueOf(hsVar.m12960c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12960c() && (a9 = C4537ja.m13601a(this.f12268c, hsVar.f12268c)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(m12963d()).compareTo(Boolean.valueOf(hsVar.m12963d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m12963d() && (a8 = C4537ja.m13599a(this.f12261a, hsVar.f12261a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(m12966e()).compareTo(Boolean.valueOf(hsVar.m12966e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m12966e() && (a7 = C4537ja.m13599a(this.f12266b, hsVar.f12266b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(mo42034f()).compareTo(Boolean.valueOf(hsVar.mo42034f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42034f() && (a6 = C4537ja.m13607a(this.f12265a, hsVar.f12265a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(mo42036g()).compareTo(Boolean.valueOf(hsVar.mo42036g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42036g() && (a5 = C4537ja.m13601a(this.f12269d, hsVar.f12269d)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(mo42037h()).compareTo(Boolean.valueOf(hsVar.mo42037h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42037h() && (a4 = C4537ja.m13601a(this.f12270e, hsVar.f12270e)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(mo42039i()).compareTo(Boolean.valueOf(hsVar.mo42039i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42039i() && (a3 = C4537ja.m13601a(this.f12271f, hsVar.f12271f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(mo42040j()).compareTo(Boolean.valueOf(hsVar.mo42040j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo42040j() && (a2 = C4537ja.m13604a(this.f12264a, hsVar.f12264a)) != 0) {
            return a2;
        }
        int compareTo11 = Boolean.valueOf(mo42041k()).compareTo(Boolean.valueOf(hsVar.mo42041k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!mo42041k() || (a = C4537ja.m13601a(this.f12272g, hsVar.f12272g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long mo42016a() {
        return this.f12266b;
    }

    /* renamed from: a */
    public C4498hs mo42017a(long j) {
        this.f12261a = j;
        m12948a(true);
        return this;
    }

    /* renamed from: a */
    public C4498hs mo42018a(String str) {
        this.f12262a = str;
        return this;
    }

    /* renamed from: a */
    public C4498hs mo42019a(boolean z) {
        this.f12265a = z;
        mo42026c(true);
        return this;
    }

    /* renamed from: a */
    public String m12945a() {
        return this.f12262a;
    }

    /* renamed from: a */
    public void m12946a() {
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
                m12946a();
                return;
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12262a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 11) {
                        this.f12267b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12268c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 10) {
                        this.f12261a = jkVar.m13660a();
                        m12948a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f12266b = jkVar.m13660a();
                        mo42023b(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 2) {
                        this.f12265a = jkVar.m13681a();
                        mo42026c(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12269d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12270e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12271f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 13) {
                        C4548jj a2 = jkVar.m13663a();
                        this.f12264a = new HashMap(a2.f13025a * 2);
                        for (int i = 0; i < a2.f13025a; i++) {
                            this.f12264a.put(jkVar.m13666a(), jkVar.m13666a());
                        }
                        jkVar.mo42589h();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f12272g = jkVar.m13666a();
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
    public void m12948a(boolean z) {
        this.f12263a.set(0, z);
    }

    /* renamed from: a */
    public boolean m12949a() {
        return this.f12262a != null;
    }

    /* renamed from: a */
    public boolean m12950a(C4498hs hsVar) {
        if (hsVar == null) {
            return false;
        }
        boolean a = m12949a();
        boolean a2 = hsVar.m12949a();
        if ((a || a2) && (!a || !a2 || !this.f12262a.equals(hsVar.f12262a))) {
            return false;
        }
        boolean b = m12956b();
        boolean b2 = hsVar.m12956b();
        if ((b || b2) && (!b || !b2 || !this.f12267b.equals(hsVar.f12267b))) {
            return false;
        }
        boolean c = m12960c();
        boolean c2 = hsVar.m12960c();
        if ((c || c2) && (!c || !c2 || !this.f12268c.equals(hsVar.f12268c))) {
            return false;
        }
        boolean d = m12963d();
        boolean d2 = hsVar.m12963d();
        if ((d || d2) && (!d || !d2 || this.f12261a != hsVar.f12261a)) {
            return false;
        }
        boolean e = m12966e();
        boolean e2 = hsVar.m12966e();
        if ((e || e2) && (!e || !e2 || this.f12266b != hsVar.f12266b)) {
            return false;
        }
        boolean f = mo42034f();
        boolean f2 = hsVar.mo42034f();
        if ((f || f2) && (!f || !f2 || this.f12265a != hsVar.f12265a)) {
            return false;
        }
        boolean g = mo42036g();
        boolean g2 = hsVar.mo42036g();
        if ((g || g2) && (!g || !g2 || !this.f12269d.equals(hsVar.f12269d))) {
            return false;
        }
        boolean h = mo42037h();
        boolean h2 = hsVar.mo42037h();
        if ((h || h2) && (!h || !h2 || !this.f12270e.equals(hsVar.f12270e))) {
            return false;
        }
        boolean i = mo42039i();
        boolean i2 = hsVar.mo42039i();
        if ((i || i2) && (!i || !i2 || !this.f12271f.equals(hsVar.f12271f))) {
            return false;
        }
        boolean j = mo42040j();
        boolean j2 = hsVar.mo42040j();
        if ((j || j2) && (!j || !j2 || !this.f12264a.equals(hsVar.f12264a))) {
            return false;
        }
        boolean k = mo42041k();
        boolean k2 = hsVar.mo42041k();
        if (k || k2) {
            return k && k2 && this.f12272g.equals(hsVar.f12272g);
        }
        return true;
    }

    /* renamed from: b */
    public C4498hs mo42020b(long j) {
        this.f12266b = j;
        mo42023b(true);
        return this;
    }

    /* renamed from: b */
    public C4498hs mo42021b(String str) {
        this.f12267b = str;
        return this;
    }

    /* renamed from: b */
    public String mo42022b() {
        return this.f12268c;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m12946a();
        jkVar.mo42576a(f12250a);
        if (this.f12262a != null && m12949a()) {
            jkVar.mo42573a(f12249a);
            jkVar.mo42577a(this.f12262a);
            jkVar.mo42581b();
        }
        if (this.f12267b != null && m12956b()) {
            jkVar.mo42573a(f12251b);
            jkVar.mo42577a(this.f12267b);
            jkVar.mo42581b();
        }
        if (this.f12268c != null && m12960c()) {
            jkVar.mo42573a(f12252c);
            jkVar.mo42577a(this.f12268c);
            jkVar.mo42581b();
        }
        if (m12963d()) {
            jkVar.mo42573a(f12253d);
            jkVar.mo42572a(this.f12261a);
            jkVar.mo42581b();
        }
        if (m12966e()) {
            jkVar.mo42573a(f12254e);
            jkVar.mo42572a(this.f12266b);
            jkVar.mo42581b();
        }
        if (mo42034f()) {
            jkVar.mo42573a(f12255f);
            jkVar.mo42580a(this.f12265a);
            jkVar.mo42581b();
        }
        if (this.f12269d != null && mo42036g()) {
            jkVar.mo42573a(f12256g);
            jkVar.mo42577a(this.f12269d);
            jkVar.mo42581b();
        }
        if (this.f12270e != null && mo42037h()) {
            jkVar.mo42573a(f12257h);
            jkVar.mo42577a(this.f12270e);
            jkVar.mo42581b();
        }
        if (this.f12271f != null && mo42039i()) {
            jkVar.mo42573a(f12258i);
            jkVar.mo42577a(this.f12271f);
            jkVar.mo42581b();
        }
        if (this.f12264a != null && mo42040j()) {
            jkVar.mo42573a(f12259j);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12264a.size()));
            for (Map.Entry<String, String> entry : this.f12264a.entrySet()) {
                jkVar.mo42577a(entry.getKey());
                jkVar.mo42577a(entry.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        if (this.f12272g != null && mo42041k()) {
            jkVar.mo42573a(f12260k);
            jkVar.mo42577a(this.f12272g);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42023b(boolean z) {
        this.f12263a.set(1, z);
    }

    /* renamed from: b */
    public boolean m12956b() {
        return this.f12267b != null;
    }

    /* renamed from: c */
    public C4498hs mo42024c(String str) {
        this.f12268c = str;
        return this;
    }

    /* renamed from: c */
    public String mo42025c() {
        return this.f12270e;
    }

    /* renamed from: c */
    public void mo42026c(boolean z) {
        this.f12263a.set(2, z);
    }

    /* renamed from: c */
    public boolean m12960c() {
        return this.f12268c != null;
    }

    /* renamed from: d */
    public C4498hs mo42028d(String str) {
        this.f12269d = str;
        return this;
    }

    /* renamed from: d */
    public String mo42029d() {
        return this.f12271f;
    }

    /* renamed from: d */
    public boolean m12963d() {
        return this.f12263a.get(0);
    }

    /* renamed from: e */
    public C4498hs mo42030e(String str) {
        this.f12270e = str;
        return this;
    }

    /* renamed from: e */
    public String mo42031e() {
        return this.f12272g;
    }

    /* renamed from: e */
    public boolean m12966e() {
        return this.f12263a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4498hs)) {
            return m12950a((C4498hs) obj);
        }
        return false;
    }

    /* renamed from: f */
    public C4498hs mo42033f(String str) {
        this.f12271f = str;
        return this;
    }

    /* renamed from: f */
    public boolean mo42034f() {
        return this.f12263a.get(2);
    }

    /* renamed from: g */
    public C4498hs mo42035g(String str) {
        this.f12272g = str;
        return this;
    }

    /* renamed from: g */
    public boolean mo42036g() {
        return this.f12269d != null;
    }

    /* renamed from: h */
    public boolean mo42037h() {
        return this.f12270e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42039i() {
        return this.f12271f != null;
    }

    /* renamed from: j */
    public boolean mo42040j() {
        return this.f12264a != null;
    }

    /* renamed from: k */
    public boolean mo42041k() {
        return this.f12272g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m12949a()) {
            sb.append("channel:");
            String str = this.f12262a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m12956b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f12267b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m12960c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f12268c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m12963d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f12261a);
            z = false;
        }
        if (m12966e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f12266b);
            z = false;
        }
        if (mo42034f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f12265a);
            z = false;
        }
        if (mo42036g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f12269d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (mo42037h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f12270e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (mo42039i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f12271f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (mo42040j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f12264a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (mo42041k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f12272g;
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
