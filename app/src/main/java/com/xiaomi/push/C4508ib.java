package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ib */
public class C4508ib implements AbstractC4532iz<C4508ib, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12514a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12515a = new C4554jp("PushMetaInfo");

    /* renamed from: b */
    public static final C4546jh f12516b = new C4546jh("", (byte) 10, 2);

    /* renamed from: c */
    public static final C4546jh f12517c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12518d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12519e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12520f = new C4546jh("", (byte) 8, 6);

    /* renamed from: g */
    public static final C4546jh f12521g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12522h = new C4546jh("", (byte) 8, 8);

    /* renamed from: i */
    public static final C4546jh f12523i = new C4546jh("", (byte) 8, 9);

    /* renamed from: j */
    public static final C4546jh f12524j = new C4546jh("", (byte) 13, 10);

    /* renamed from: k */
    public static final C4546jh f12525k = new C4546jh("", (byte) 13, 11);

    /* renamed from: l */
    public static final C4546jh f12526l = new C4546jh("", (byte) 2, 12);

    /* renamed from: m */
    public static final C4546jh f12527m = new C4546jh("", (byte) 13, 13);

    /* renamed from: a */
    public int f12528a;

    /* renamed from: a */
    public long f12529a;

    /* renamed from: a */
    public String f12530a;

    /* renamed from: a */
    public BitSet f12531a;

    /* renamed from: a */
    public Map<String, String> f12532a;

    /* renamed from: a */
    public boolean f12533a;

    /* renamed from: b */
    public int f12534b;

    /* renamed from: b */
    public String f12535b;

    /* renamed from: b */
    public Map<String, String> f12536b;

    /* renamed from: c */
    public int f12537c;

    /* renamed from: c */
    public String f12538c;

    /* renamed from: c */
    public Map<String, String> f12539c;

    /* renamed from: d */
    public String f12540d;

    /* renamed from: e */
    public String f12541e;

    public C4508ib() {
        this.f12531a = new BitSet(5);
        this.f12533a = false;
    }

    public C4508ib(C4508ib ibVar) {
        BitSet bitSet = new BitSet(5);
        this.f12531a = bitSet;
        bitSet.clear();
        this.f12531a.or(ibVar.f12531a);
        if (ibVar.m13103a()) {
            this.f12530a = ibVar.f12530a;
        }
        this.f12529a = ibVar.f12529a;
        if (ibVar.m13119c()) {
            this.f12535b = ibVar.f12535b;
        }
        if (ibVar.m13123d()) {
            this.f12538c = ibVar.f12538c;
        }
        if (ibVar.mo42134e()) {
            this.f12540d = ibVar.f12540d;
        }
        this.f12528a = ibVar.f12528a;
        if (ibVar.mo42137g()) {
            this.f12541e = ibVar.f12541e;
        }
        this.f12534b = ibVar.f12534b;
        this.f12537c = ibVar.f12537c;
        if (ibVar.mo42141j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : ibVar.f12532a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f12532a = hashMap;
        }
        if (ibVar.mo42142k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : ibVar.f12536b.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f12536b = hashMap2;
        }
        this.f12533a = ibVar.f12533a;
        if (ibVar.mo42145n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : ibVar.f12539c.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.f12539c = hashMap3;
        }
    }

    /* renamed from: a */
    public int mo42113a() {
        return this.f12528a;
    }

    /* renamed from: a */
    public int compareTo(C4508ib ibVar) {
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
        int a13;
        if (!C4508ib.class.equals(ibVar.getClass())) {
            return C4508ib.class.getName().compareTo(ibVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13103a()).compareTo(Boolean.valueOf(ibVar.m13103a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13103a() && (a13 = C4537ja.m13601a(this.f12530a, ibVar.f12530a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(m13113b()).compareTo(Boolean.valueOf(ibVar.m13113b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13113b() && (a12 = C4537ja.m13599a(this.f12529a, ibVar.f12529a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(m13119c()).compareTo(Boolean.valueOf(ibVar.m13119c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m13119c() && (a11 = C4537ja.m13601a(this.f12535b, ibVar.f12535b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(m13123d()).compareTo(Boolean.valueOf(ibVar.m13123d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m13123d() && (a10 = C4537ja.m13601a(this.f12538c, ibVar.f12538c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(mo42134e()).compareTo(Boolean.valueOf(ibVar.mo42134e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42134e() && (a9 = C4537ja.m13601a(this.f12540d, ibVar.f12540d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(mo42136f()).compareTo(Boolean.valueOf(ibVar.mo42136f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42136f() && (a8 = C4537ja.m13598a(this.f12528a, ibVar.f12528a)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(mo42137g()).compareTo(Boolean.valueOf(ibVar.mo42137g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42137g() && (a7 = C4537ja.m13601a(this.f12541e, ibVar.f12541e)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(mo42138h()).compareTo(Boolean.valueOf(ibVar.mo42138h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42138h() && (a6 = C4537ja.m13598a(this.f12534b, ibVar.f12534b)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(mo42140i()).compareTo(Boolean.valueOf(ibVar.mo42140i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42140i() && (a5 = C4537ja.m13598a(this.f12537c, ibVar.f12537c)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(mo42141j()).compareTo(Boolean.valueOf(ibVar.mo42141j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo42141j() && (a4 = C4537ja.m13604a(this.f12532a, ibVar.f12532a)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(mo42142k()).compareTo(Boolean.valueOf(ibVar.mo42142k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo42142k() && (a3 = C4537ja.m13604a(this.f12536b, ibVar.f12536b)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(mo42144m()).compareTo(Boolean.valueOf(ibVar.mo42144m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo42144m() && (a2 = C4537ja.m13607a(this.f12533a, ibVar.f12533a)) != 0) {
            return a2;
        }
        int compareTo13 = Boolean.valueOf(mo42145n()).compareTo(Boolean.valueOf(ibVar.mo42145n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!mo42145n() || (a = C4537ja.m13604a(this.f12539c, ibVar.f12539c)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long m13092a() {
        return this.f12529a;
    }

    /* renamed from: a */
    public C4508ib m13093a() {
        return new C4508ib(this);
    }

    /* renamed from: a */
    public C4508ib mo42115a(int i) {
        this.f12528a = i;
        mo42124b(true);
        return this;
    }

    /* renamed from: a */
    public C4508ib mo42116a(String str) {
        this.f12530a = str;
        return this;
    }

    /* renamed from: a */
    public C4508ib mo42117a(Map<String, String> map) {
        this.f12532a = map;
        return this;
    }

    /* renamed from: a */
    public String m13097a() {
        return this.f12530a;
    }

    /* renamed from: a */
    public Map<String, String> m13098a() {
        return this.f12532a;
    }

    /* renamed from: a */
    public void m13099a() {
        if (this.f12530a == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: a */
    public void mo41828a(AbstractC4549jk jkVar) {
        jkVar.m13665a();
        while (true) {
            C4546jh a = jkVar.m13661a();
            byte b = a.f13019a;
            if (b == 0) {
                jkVar.mo42587f();
                if (m13113b()) {
                    m13099a();
                    return;
                }
                throw new C4550jl("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i = 0;
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12530a = jkVar.m13666a();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 2:
                    if (b == 10) {
                        this.f12529a = jkVar.m13660a();
                        mo42119a(true);
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 3:
                    if (b == 11) {
                        this.f12535b = jkVar.m13666a();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 4:
                    if (b == 11) {
                        this.f12538c = jkVar.m13666a();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 5:
                    if (b == 11) {
                        this.f12540d = jkVar.m13666a();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 6:
                    if (b == 8) {
                        this.f12528a = jkVar.m13659a();
                        mo42124b(true);
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 7:
                    if (b == 11) {
                        this.f12541e = jkVar.m13666a();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 8:
                    if (b == 8) {
                        this.f12534b = jkVar.m13659a();
                        mo42128c(true);
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 9:
                    if (b == 8) {
                        this.f12537c = jkVar.m13659a();
                        mo42132d(true);
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 10:
                    if (b == 13) {
                        C4548jj a2 = jkVar.m13663a();
                        this.f12532a = new HashMap(a2.f13025a * 2);
                        while (i < a2.f13025a) {
                            this.f12532a.put(jkVar.m13666a(), jkVar.m13666a());
                            i++;
                        }
                        jkVar.mo42589h();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 11:
                    if (b == 13) {
                        C4548jj a3 = jkVar.m13663a();
                        this.f12536b = new HashMap(a3.f13025a * 2);
                        while (i < a3.f13025a) {
                            this.f12536b.put(jkVar.m13666a(), jkVar.m13666a());
                            i++;
                        }
                        jkVar.mo42589h();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 12:
                    if (b == 2) {
                        this.f12533a = jkVar.m13681a();
                        mo42133e(true);
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                case 13:
                    if (b == 13) {
                        C4548jj a4 = jkVar.m13663a();
                        this.f12539c = new HashMap(a4.f13025a * 2);
                        while (i < a4.f13025a) {
                            this.f12539c.put(jkVar.m13666a(), jkVar.m13666a());
                            i++;
                        }
                        jkVar.mo42589h();
                        break;
                    }
                    C4552jn.m13693a(jkVar, b);
                    break;
                default:
                    C4552jn.m13693a(jkVar, b);
                    break;
            }
            jkVar.mo42588g();
        }
    }

    /* renamed from: a */
    public void mo42118a(String str, String str2) {
        if (this.f12532a == null) {
            this.f12532a = new HashMap();
        }
        this.f12532a.put(str, str2);
    }

    /* renamed from: a */
    public void mo42119a(boolean z) {
        this.f12531a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13103a() {
        return this.f12530a != null;
    }

    /* renamed from: a */
    public boolean m13104a(C4508ib ibVar) {
        if (ibVar == null) {
            return false;
        }
        boolean a = m13103a();
        boolean a2 = ibVar.m13103a();
        if (((a || a2) && (!a || !a2 || !this.f12530a.equals(ibVar.f12530a))) || this.f12529a != ibVar.f12529a) {
            return false;
        }
        boolean c = m13119c();
        boolean c2 = ibVar.m13119c();
        if ((c || c2) && (!c || !c2 || !this.f12535b.equals(ibVar.f12535b))) {
            return false;
        }
        boolean d = m13123d();
        boolean d2 = ibVar.m13123d();
        if ((d || d2) && (!d || !d2 || !this.f12538c.equals(ibVar.f12538c))) {
            return false;
        }
        boolean e = mo42134e();
        boolean e2 = ibVar.mo42134e();
        if ((e || e2) && (!e || !e2 || !this.f12540d.equals(ibVar.f12540d))) {
            return false;
        }
        boolean f = mo42136f();
        boolean f2 = ibVar.mo42136f();
        if ((f || f2) && (!f || !f2 || this.f12528a != ibVar.f12528a)) {
            return false;
        }
        boolean g = mo42137g();
        boolean g2 = ibVar.mo42137g();
        if ((g || g2) && (!g || !g2 || !this.f12541e.equals(ibVar.f12541e))) {
            return false;
        }
        boolean h = mo42138h();
        boolean h2 = ibVar.mo42138h();
        if ((h || h2) && (!h || !h2 || this.f12534b != ibVar.f12534b)) {
            return false;
        }
        boolean i = mo42140i();
        boolean i2 = ibVar.mo42140i();
        if ((i || i2) && (!i || !i2 || this.f12537c != ibVar.f12537c)) {
            return false;
        }
        boolean j = mo42141j();
        boolean j2 = ibVar.mo42141j();
        if ((j || j2) && (!j || !j2 || !this.f12532a.equals(ibVar.f12532a))) {
            return false;
        }
        boolean k = mo42142k();
        boolean k2 = ibVar.mo42142k();
        if ((k || k2) && (!k || !k2 || !this.f12536b.equals(ibVar.f12536b))) {
            return false;
        }
        boolean m = mo42144m();
        boolean m2 = ibVar.mo42144m();
        if ((m || m2) && (!m || !m2 || this.f12533a != ibVar.f12533a)) {
            return false;
        }
        boolean n = mo42145n();
        boolean n2 = ibVar.mo42145n();
        if (n || n2) {
            return n && n2 && this.f12539c.equals(ibVar.f12539c);
        }
        return true;
    }

    /* renamed from: b */
    public int mo42120b() {
        return this.f12534b;
    }

    /* renamed from: b */
    public C4508ib mo42121b(int i) {
        this.f12534b = i;
        mo42128c(true);
        return this;
    }

    /* renamed from: b */
    public C4508ib mo42122b(String str) {
        this.f12535b = str;
        return this;
    }

    /* renamed from: b */
    public String m13108b() {
        return this.f12535b;
    }

    /* renamed from: b */
    public Map<String, String> m13109b() {
        return this.f12536b;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13099a();
        jkVar.mo42576a(f12515a);
        if (this.f12530a != null) {
            jkVar.mo42573a(f12514a);
            jkVar.mo42577a(this.f12530a);
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12516b);
        jkVar.mo42572a(this.f12529a);
        jkVar.mo42581b();
        if (this.f12535b != null && m13119c()) {
            jkVar.mo42573a(f12517c);
            jkVar.mo42577a(this.f12535b);
            jkVar.mo42581b();
        }
        if (this.f12538c != null && m13123d()) {
            jkVar.mo42573a(f12518d);
            jkVar.mo42577a(this.f12538c);
            jkVar.mo42581b();
        }
        if (this.f12540d != null && mo42134e()) {
            jkVar.mo42573a(f12519e);
            jkVar.mo42577a(this.f12540d);
            jkVar.mo42581b();
        }
        if (mo42136f()) {
            jkVar.mo42573a(f12520f);
            jkVar.mo42570a(this.f12528a);
            jkVar.mo42581b();
        }
        if (this.f12541e != null && mo42137g()) {
            jkVar.mo42573a(f12521g);
            jkVar.mo42577a(this.f12541e);
            jkVar.mo42581b();
        }
        if (mo42138h()) {
            jkVar.mo42573a(f12522h);
            jkVar.mo42570a(this.f12534b);
            jkVar.mo42581b();
        }
        if (mo42140i()) {
            jkVar.mo42573a(f12523i);
            jkVar.mo42570a(this.f12537c);
            jkVar.mo42581b();
        }
        if (this.f12532a != null && mo42141j()) {
            jkVar.mo42573a(f12524j);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12532a.size()));
            for (Map.Entry<String, String> entry : this.f12532a.entrySet()) {
                jkVar.mo42577a(entry.getKey());
                jkVar.mo42577a(entry.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        if (this.f12536b != null && mo42142k()) {
            jkVar.mo42573a(f12525k);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12536b.size()));
            for (Map.Entry<String, String> entry2 : this.f12536b.entrySet()) {
                jkVar.mo42577a(entry2.getKey());
                jkVar.mo42577a(entry2.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        if (mo42144m()) {
            jkVar.mo42573a(f12526l);
            jkVar.mo42580a(this.f12533a);
            jkVar.mo42581b();
        }
        if (this.f12539c != null && mo42145n()) {
            jkVar.mo42573a(f12527m);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12539c.size()));
            for (Map.Entry<String, String> entry3 : this.f12539c.entrySet()) {
                jkVar.mo42577a(entry3.getKey());
                jkVar.mo42577a(entry3.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42123b(String str, String str2) {
        if (this.f12536b == null) {
            this.f12536b = new HashMap();
        }
        this.f12536b.put(str, str2);
    }

    /* renamed from: b */
    public void mo42124b(boolean z) {
        this.f12531a.set(1, z);
    }

    /* renamed from: b */
    public boolean m13113b() {
        return this.f12531a.get(0);
    }

    /* renamed from: c */
    public int mo42125c() {
        return this.f12537c;
    }

    /* renamed from: c */
    public C4508ib mo42126c(int i) {
        this.f12537c = i;
        mo42132d(true);
        return this;
    }

    /* renamed from: c */
    public C4508ib mo42127c(String str) {
        this.f12538c = str;
        return this;
    }

    /* renamed from: c */
    public String m13117c() {
        return this.f12538c;
    }

    /* renamed from: c */
    public void mo42128c(boolean z) {
        this.f12531a.set(2, z);
    }

    /* renamed from: c */
    public boolean m13119c() {
        return this.f12535b != null;
    }

    /* renamed from: d */
    public C4508ib mo42130d(String str) {
        this.f12540d = str;
        return this;
    }

    /* renamed from: d */
    public String mo42131d() {
        return this.f12540d;
    }

    /* renamed from: d */
    public void mo42132d(boolean z) {
        this.f12531a.set(3, z);
    }

    /* renamed from: d */
    public boolean m13123d() {
        return this.f12538c != null;
    }

    /* renamed from: e */
    public void mo42133e(boolean z) {
        this.f12531a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo42134e() {
        return this.f12540d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4508ib)) {
            return m13104a((C4508ib) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42136f() {
        return this.f12531a.get(1);
    }

    /* renamed from: g */
    public boolean mo42137g() {
        return this.f12541e != null;
    }

    /* renamed from: h */
    public boolean mo42138h() {
        return this.f12531a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42140i() {
        return this.f12531a.get(3);
    }

    /* renamed from: j */
    public boolean mo42141j() {
        return this.f12532a != null;
    }

    /* renamed from: k */
    public boolean mo42142k() {
        return this.f12536b != null;
    }

    /* renamed from: l */
    public boolean mo42143l() {
        return this.f12533a;
    }

    /* renamed from: m */
    public boolean mo42144m() {
        return this.f12531a.get(4);
    }

    /* renamed from: n */
    public boolean mo42145n() {
        return this.f12539c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f12530a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f12529a);
        if (m13119c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f12535b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m13123d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f12538c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo42134e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f12540d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42136f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f12528a);
        }
        if (mo42137g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f12541e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42138h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f12534b);
        }
        if (mo42140i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f12537c);
        }
        if (mo42141j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f12532a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo42142k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f12536b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (mo42144m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f12533a);
        }
        if (mo42145n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f12539c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
