package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.in */
public class C4520in implements AbstractC4532iz<C4520in, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12702a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12703a = new C4554jp("XmPushActionNotification");

    /* renamed from: b */
    public static final C4546jh f12704b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12705c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12706d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12707e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12708f = new C4546jh("", (byte) 2, 6);

    /* renamed from: g */
    public static final C4546jh f12709g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12710h = new C4546jh("", (byte) 13, 8);

    /* renamed from: i */
    public static final C4546jh f12711i = new C4546jh("", (byte) 11, 9);

    /* renamed from: j */
    public static final C4546jh f12712j = new C4546jh("", (byte) 11, 10);

    /* renamed from: k */
    public static final C4546jh f12713k = new C4546jh("", (byte) 11, 12);

    /* renamed from: l */
    public static final C4546jh f12714l = new C4546jh("", (byte) 11, 13);

    /* renamed from: m */
    public static final C4546jh f12715m = new C4546jh("", (byte) 11, 14);

    /* renamed from: n */
    public static final C4546jh f12716n = new C4546jh("", (byte) 10, 15);

    /* renamed from: o */
    public static final C4546jh f12717o = new C4546jh("", (byte) 2, 20);

    /* renamed from: a */
    public long f12718a;

    /* renamed from: a */
    public C4510id f12719a;

    /* renamed from: a */
    public String f12720a;

    /* renamed from: a */
    public ByteBuffer f12721a;

    /* renamed from: a */
    public BitSet f12722a;

    /* renamed from: a */
    public Map<String, String> f12723a;

    /* renamed from: a */
    public boolean f12724a;

    /* renamed from: b */
    public String f12725b;

    /* renamed from: b */
    public boolean f12726b;

    /* renamed from: c */
    public String f12727c;

    /* renamed from: d */
    public String f12728d;

    /* renamed from: e */
    public String f12729e;

    /* renamed from: f */
    public String f12730f;

    /* renamed from: g */
    public String f12731g;

    /* renamed from: h */
    public String f12732h;

    /* renamed from: i */
    public String f12733i;

    public C4520in() {
        this.f12722a = new BitSet(3);
        this.f12724a = true;
        this.f12726b = false;
    }

    public C4520in(String str, boolean z) {
        this();
        this.f12725b = str;
        this.f12724a = z;
        m13322a(true);
    }

    /* renamed from: a */
    public int compareTo(C4520in inVar) {
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
        int a14;
        int a15;
        if (!C4520in.class.equals(inVar.getClass())) {
            return C4520in.class.getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13323a()).compareTo(Boolean.valueOf(inVar.m13323a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13323a() && (a15 = C4537ja.m13601a(this.f12720a, inVar.f12720a)) != 0) {
            return a15;
        }
        int compareTo2 = Boolean.valueOf(m13330b()).compareTo(Boolean.valueOf(inVar.m13330b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13330b() && (a14 = C4537ja.m13600a(this.f12719a, inVar.f12719a)) != 0) {
            return a14;
        }
        int compareTo3 = Boolean.valueOf(m13334c()).compareTo(Boolean.valueOf(inVar.m13334c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m13334c() && (a13 = C4537ja.m13601a(this.f12725b, inVar.f12725b)) != 0) {
            return a13;
        }
        int compareTo4 = Boolean.valueOf(mo42322d()).compareTo(Boolean.valueOf(inVar.mo42322d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42322d() && (a12 = C4537ja.m13601a(this.f12727c, inVar.f12727c)) != 0) {
            return a12;
        }
        int compareTo5 = Boolean.valueOf(mo42323e()).compareTo(Boolean.valueOf(inVar.mo42323e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42323e() && (a11 = C4537ja.m13601a(this.f12728d, inVar.f12728d)) != 0) {
            return a11;
        }
        int compareTo6 = Boolean.valueOf(mo42325f()).compareTo(Boolean.valueOf(inVar.mo42325f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42325f() && (a10 = C4537ja.m13607a(this.f12724a, inVar.f12724a)) != 0) {
            return a10;
        }
        int compareTo7 = Boolean.valueOf(mo42326g()).compareTo(Boolean.valueOf(inVar.mo42326g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42326g() && (a9 = C4537ja.m13601a(this.f12729e, inVar.f12729e)) != 0) {
            return a9;
        }
        int compareTo8 = Boolean.valueOf(mo42327h()).compareTo(Boolean.valueOf(inVar.mo42327h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42327h() && (a8 = C4537ja.m13604a(this.f12723a, inVar.f12723a)) != 0) {
            return a8;
        }
        int compareTo9 = Boolean.valueOf(mo42329i()).compareTo(Boolean.valueOf(inVar.mo42329i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42329i() && (a7 = C4537ja.m13601a(this.f12730f, inVar.f12730f)) != 0) {
            return a7;
        }
        int compareTo10 = Boolean.valueOf(mo42330j()).compareTo(Boolean.valueOf(inVar.mo42330j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo42330j() && (a6 = C4537ja.m13601a(this.f12731g, inVar.f12731g)) != 0) {
            return a6;
        }
        int compareTo11 = Boolean.valueOf(mo42331k()).compareTo(Boolean.valueOf(inVar.mo42331k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo42331k() && (a5 = C4537ja.m13601a(this.f12732h, inVar.f12732h)) != 0) {
            return a5;
        }
        int compareTo12 = Boolean.valueOf(mo42332l()).compareTo(Boolean.valueOf(inVar.mo42332l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo42332l() && (a4 = C4537ja.m13601a(this.f12733i, inVar.f12733i)) != 0) {
            return a4;
        }
        int compareTo13 = Boolean.valueOf(mo42333m()).compareTo(Boolean.valueOf(inVar.mo42333m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo42333m() && (a3 = C4537ja.m13600a(this.f12721a, inVar.f12721a)) != 0) {
            return a3;
        }
        int compareTo14 = Boolean.valueOf(mo42334n()).compareTo(Boolean.valueOf(inVar.mo42334n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo42334n() && (a2 = C4537ja.m13599a(this.f12718a, inVar.f12718a)) != 0) {
            return a2;
        }
        int compareTo15 = Boolean.valueOf(mo42335o()).compareTo(Boolean.valueOf(inVar.mo42335o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!mo42335o() || (a = C4537ja.m13607a(this.f12726b, inVar.f12726b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4520in mo42307a(String str) {
        this.f12725b = str;
        return this;
    }

    /* renamed from: a */
    public C4520in mo42308a(ByteBuffer byteBuffer) {
        this.f12721a = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C4520in mo42309a(Map<String, String> map) {
        this.f12723a = map;
        return this;
    }

    /* renamed from: a */
    public C4520in mo42310a(boolean z) {
        this.f12724a = z;
        m13322a(true);
        return this;
    }

    /* renamed from: a */
    public C4520in mo42311a(byte[] bArr) {
        mo42308a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public String mo42312a() {
        return this.f12725b;
    }

    /* renamed from: a */
    public Map<String, String> m13318a() {
        return this.f12723a;
    }

    /* renamed from: a */
    public void m13319a() {
        if (this.f12725b == null) {
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
                if (mo42325f()) {
                    m13319a();
                    return;
                }
                throw new C4550jl("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12720a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12719a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12725b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12727c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12728d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 2) {
                        this.f12724a = jkVar.m13681a();
                        m13322a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12729e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 13) {
                        C4548jj a2 = jkVar.m13663a();
                        this.f12723a = new HashMap(a2.f13025a * 2);
                        for (int i = 0; i < a2.f13025a; i++) {
                            this.f12723a.put(jkVar.m13666a(), jkVar.m13666a());
                        }
                        jkVar.mo42589h();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12730f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f12731g = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f12732h = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f12733i = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 14:
                    if (b == 11) {
                        this.f12721a = jkVar.m13667a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 15:
                    if (b == 10) {
                        this.f12718a = jkVar.m13660a();
                        mo42316b(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 20:
                    if (b == 2) {
                        this.f12726b = jkVar.m13681a();
                        mo42319c(true);
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
    public void mo42313a(String str, String str2) {
        if (this.f12723a == null) {
            this.f12723a = new HashMap();
        }
        this.f12723a.put(str, str2);
    }

    /* renamed from: a */
    public void m13322a(boolean z) {
        this.f12722a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13323a() {
        return this.f12720a != null;
    }

    /* renamed from: a */
    public boolean m13324a(C4520in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean a = m13323a();
        boolean a2 = inVar.m13323a();
        if ((a || a2) && (!a || !a2 || !this.f12720a.equals(inVar.f12720a))) {
            return false;
        }
        boolean b = m13330b();
        boolean b2 = inVar.m13330b();
        if ((b || b2) && (!b || !b2 || !this.f12719a.m13142a(inVar.f12719a))) {
            return false;
        }
        boolean c = m13334c();
        boolean c2 = inVar.m13334c();
        if ((c || c2) && (!c || !c2 || !this.f12725b.equals(inVar.f12725b))) {
            return false;
        }
        boolean d = mo42322d();
        boolean d2 = inVar.mo42322d();
        if ((d || d2) && (!d || !d2 || !this.f12727c.equals(inVar.f12727c))) {
            return false;
        }
        boolean e = mo42323e();
        boolean e2 = inVar.mo42323e();
        if (((e || e2) && (!e || !e2 || !this.f12728d.equals(inVar.f12728d))) || this.f12724a != inVar.f12724a) {
            return false;
        }
        boolean g = mo42326g();
        boolean g2 = inVar.mo42326g();
        if ((g || g2) && (!g || !g2 || !this.f12729e.equals(inVar.f12729e))) {
            return false;
        }
        boolean h = mo42327h();
        boolean h2 = inVar.mo42327h();
        if ((h || h2) && (!h || !h2 || !this.f12723a.equals(inVar.f12723a))) {
            return false;
        }
        boolean i = mo42329i();
        boolean i2 = inVar.mo42329i();
        if ((i || i2) && (!i || !i2 || !this.f12730f.equals(inVar.f12730f))) {
            return false;
        }
        boolean j = mo42330j();
        boolean j2 = inVar.mo42330j();
        if ((j || j2) && (!j || !j2 || !this.f12731g.equals(inVar.f12731g))) {
            return false;
        }
        boolean k = mo42331k();
        boolean k2 = inVar.mo42331k();
        if ((k || k2) && (!k || !k2 || !this.f12732h.equals(inVar.f12732h))) {
            return false;
        }
        boolean l = mo42332l();
        boolean l2 = inVar.mo42332l();
        if ((l || l2) && (!l || !l2 || !this.f12733i.equals(inVar.f12733i))) {
            return false;
        }
        boolean m = mo42333m();
        boolean m2 = inVar.mo42333m();
        if ((m || m2) && (!m || !m2 || !this.f12721a.equals(inVar.f12721a))) {
            return false;
        }
        boolean n = mo42334n();
        boolean n2 = inVar.mo42334n();
        if ((n || n2) && (!n || !n2 || this.f12718a != inVar.f12718a)) {
            return false;
        }
        boolean o = mo42335o();
        boolean o2 = inVar.mo42335o();
        if (o || o2) {
            return o && o2 && this.f12726b == inVar.f12726b;
        }
        return true;
    }

    /* renamed from: a */
    public byte[] m13325a() {
        mo42308a(C4537ja.m13610a(this.f12721a));
        return this.f12721a.array();
    }

    /* renamed from: b */
    public C4520in mo42314b(String str) {
        this.f12727c = str;
        return this;
    }

    /* renamed from: b */
    public String mo42315b() {
        return this.f12727c;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13319a();
        jkVar.mo42576a(f12703a);
        if (this.f12720a != null && m13323a()) {
            jkVar.mo42573a(f12702a);
            jkVar.mo42577a(this.f12720a);
            jkVar.mo42581b();
        }
        if (this.f12719a != null && m13330b()) {
            jkVar.mo42573a(f12704b);
            this.f12719a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12725b != null) {
            jkVar.mo42573a(f12705c);
            jkVar.mo42577a(this.f12725b);
            jkVar.mo42581b();
        }
        if (this.f12727c != null && mo42322d()) {
            jkVar.mo42573a(f12706d);
            jkVar.mo42577a(this.f12727c);
            jkVar.mo42581b();
        }
        if (this.f12728d != null && mo42323e()) {
            jkVar.mo42573a(f12707e);
            jkVar.mo42577a(this.f12728d);
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12708f);
        jkVar.mo42580a(this.f12724a);
        jkVar.mo42581b();
        if (this.f12729e != null && mo42326g()) {
            jkVar.mo42573a(f12709g);
            jkVar.mo42577a(this.f12729e);
            jkVar.mo42581b();
        }
        if (this.f12723a != null && mo42327h()) {
            jkVar.mo42573a(f12710h);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12723a.size()));
            for (Map.Entry<String, String> entry : this.f12723a.entrySet()) {
                jkVar.mo42577a(entry.getKey());
                jkVar.mo42577a(entry.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        if (this.f12730f != null && mo42329i()) {
            jkVar.mo42573a(f12711i);
            jkVar.mo42577a(this.f12730f);
            jkVar.mo42581b();
        }
        if (this.f12731g != null && mo42330j()) {
            jkVar.mo42573a(f12712j);
            jkVar.mo42577a(this.f12731g);
            jkVar.mo42581b();
        }
        if (this.f12732h != null && mo42331k()) {
            jkVar.mo42573a(f12713k);
            jkVar.mo42577a(this.f12732h);
            jkVar.mo42581b();
        }
        if (this.f12733i != null && mo42332l()) {
            jkVar.mo42573a(f12714l);
            jkVar.mo42577a(this.f12733i);
            jkVar.mo42581b();
        }
        if (this.f12721a != null && mo42333m()) {
            jkVar.mo42573a(f12715m);
            jkVar.mo42578a(this.f12721a);
            jkVar.mo42581b();
        }
        if (mo42334n()) {
            jkVar.mo42573a(f12716n);
            jkVar.mo42572a(this.f12718a);
            jkVar.mo42581b();
        }
        if (mo42335o()) {
            jkVar.mo42573a(f12717o);
            jkVar.mo42580a(this.f12726b);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42316b(boolean z) {
        this.f12722a.set(1, z);
    }

    /* renamed from: b */
    public boolean m13330b() {
        return this.f12719a != null;
    }

    /* renamed from: c */
    public C4520in mo42317c(String str) {
        this.f12728d = str;
        return this;
    }

    /* renamed from: c */
    public String mo42318c() {
        return this.f12730f;
    }

    /* renamed from: c */
    public void mo42319c(boolean z) {
        this.f12722a.set(2, z);
    }

    /* renamed from: c */
    public boolean m13334c() {
        return this.f12725b != null;
    }

    /* renamed from: d */
    public C4520in mo42321d(String str) {
        this.f12730f = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo42322d() {
        return this.f12727c != null;
    }

    /* renamed from: e */
    public boolean mo42323e() {
        return this.f12728d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4520in)) {
            return m13324a((C4520in) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42325f() {
        return this.f12722a.get(0);
    }

    /* renamed from: g */
    public boolean mo42326g() {
        return this.f12729e != null;
    }

    /* renamed from: h */
    public boolean mo42327h() {
        return this.f12723a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42329i() {
        return this.f12730f != null;
    }

    /* renamed from: j */
    public boolean mo42330j() {
        return this.f12731g != null;
    }

    /* renamed from: k */
    public boolean mo42331k() {
        return this.f12732h != null;
    }

    /* renamed from: l */
    public boolean mo42332l() {
        return this.f12733i != null;
    }

    /* renamed from: m */
    public boolean mo42333m() {
        return this.f12721a != null;
    }

    /* renamed from: n */
    public boolean mo42334n() {
        return this.f12722a.get(1);
    }

    /* renamed from: o */
    public boolean mo42335o() {
        return this.f12722a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (m13323a()) {
            sb.append("debug:");
            String str = this.f12720a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m13330b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12719a;
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
        String str2 = this.f12725b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo42322d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f12727c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo42323e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f12728d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f12724a);
        if (mo42326g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f12729e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42327h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f12723a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo42329i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f12730f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42330j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f12731g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo42331k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f12732h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo42332l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f12733i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo42333m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f12721a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                C4537ja.m13611a(byteBuffer, sb);
            }
        }
        if (mo42334n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f12718a);
        }
        if (mo42335o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f12726b);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
