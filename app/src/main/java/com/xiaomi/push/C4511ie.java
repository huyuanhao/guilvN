package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ie */
public class C4511ie implements AbstractC4532iz<C4511ie, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12561a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12562a = new C4554jp("XmPushActionAckMessage");

    /* renamed from: b */
    public static final C4546jh f12563b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12564c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12565d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12566e = new C4546jh("", (byte) 10, 5);

    /* renamed from: f */
    public static final C4546jh f12567f = new C4546jh("", (byte) 11, 6);

    /* renamed from: g */
    public static final C4546jh f12568g = new C4546jh("", (byte) 11, 7);

    /* renamed from: h */
    public static final C4546jh f12569h = new C4546jh("", (byte) 12, 8);

    /* renamed from: i */
    public static final C4546jh f12570i = new C4546jh("", (byte) 11, 9);

    /* renamed from: j */
    public static final C4546jh f12571j = new C4546jh("", (byte) 11, 10);

    /* renamed from: k */
    public static final C4546jh f12572k = new C4546jh("", (byte) 2, 11);

    /* renamed from: l */
    public static final C4546jh f12573l = new C4546jh("", (byte) 11, 12);

    /* renamed from: m */
    public static final C4546jh f12574m = new C4546jh("", (byte) 11, 13);

    /* renamed from: n */
    public static final C4546jh f12575n = new C4546jh("", (byte) 11, 14);

    /* renamed from: o */
    public static final C4546jh f12576o = new C4546jh("", (byte) 6, 15);

    /* renamed from: p */
    public static final C4546jh f12577p = new C4546jh("", (byte) 6, 16);

    /* renamed from: q */
    public static final C4546jh f12578q = new C4546jh("", (byte) 11, 20);

    /* renamed from: r */
    public static final C4546jh f12579r = new C4546jh("", (byte) 11, 21);

    /* renamed from: s */
    public static final C4546jh f12580s = new C4546jh("", (byte) 8, 22);

    /* renamed from: t */
    public static final C4546jh f12581t = new C4546jh("", (byte) 13, 23);

    /* renamed from: a */
    public int f12582a;

    /* renamed from: a */
    public long f12583a;

    /* renamed from: a */
    public C4510id f12584a;

    /* renamed from: a */
    public C4524ir f12585a;

    /* renamed from: a */
    public String f12586a;

    /* renamed from: a */
    public BitSet f12587a = new BitSet(5);

    /* renamed from: a */
    public Map<String, String> f12588a;

    /* renamed from: a */
    public short f12589a;

    /* renamed from: a */
    public boolean f12590a = false;

    /* renamed from: b */
    public String f12591b;

    /* renamed from: b */
    public short f12592b;

    /* renamed from: c */
    public String f12593c;

    /* renamed from: d */
    public String f12594d;

    /* renamed from: e */
    public String f12595e;

    /* renamed from: f */
    public String f12596f;

    /* renamed from: g */
    public String f12597g;

    /* renamed from: h */
    public String f12598h;

    /* renamed from: i */
    public String f12599i;

    /* renamed from: j */
    public String f12600j;

    /* renamed from: k */
    public String f12601k;

    /* renamed from: l */
    public String f12602l;

    /* renamed from: a */
    public int compareTo(C4511ie ieVar) {
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
        int a16;
        int a17;
        int a18;
        int a19;
        int a20;
        if (!C4511ie.class.equals(ieVar.getClass())) {
            return C4511ie.class.getName().compareTo(ieVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13157a()).compareTo(Boolean.valueOf(ieVar.m13157a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13157a() && (a20 = C4537ja.m13601a(this.f12586a, ieVar.f12586a)) != 0) {
            return a20;
        }
        int compareTo2 = Boolean.valueOf(mo42169b()).compareTo(Boolean.valueOf(ieVar.mo42169b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42169b() && (a19 = C4537ja.m13600a(this.f12584a, ieVar.f12584a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(mo42172c()).compareTo(Boolean.valueOf(ieVar.mo42172c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42172c() && (a18 = C4537ja.m13601a(this.f12591b, ieVar.f12591b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(mo42176d()).compareTo(Boolean.valueOf(ieVar.mo42176d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42176d() && (a17 = C4537ja.m13601a(this.f12593c, ieVar.f12593c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(mo42178e()).compareTo(Boolean.valueOf(ieVar.mo42178e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42178e() && (a16 = C4537ja.m13599a(this.f12583a, ieVar.f12583a)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(mo42180f()).compareTo(Boolean.valueOf(ieVar.mo42180f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42180f() && (a15 = C4537ja.m13601a(this.f12594d, ieVar.f12594d)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(mo42181g()).compareTo(Boolean.valueOf(ieVar.mo42181g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42181g() && (a14 = C4537ja.m13601a(this.f12595e, ieVar.f12595e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(mo42182h()).compareTo(Boolean.valueOf(ieVar.mo42182h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42182h() && (a13 = C4537ja.m13600a(this.f12585a, ieVar.f12585a)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(mo42184i()).compareTo(Boolean.valueOf(ieVar.mo42184i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42184i() && (a12 = C4537ja.m13601a(this.f12596f, ieVar.f12596f)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(mo42185j()).compareTo(Boolean.valueOf(ieVar.mo42185j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo42185j() && (a11 = C4537ja.m13601a(this.f12597g, ieVar.f12597g)) != 0) {
            return a11;
        }
        int compareTo11 = Boolean.valueOf(mo42186k()).compareTo(Boolean.valueOf(ieVar.mo42186k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo42186k() && (a10 = C4537ja.m13607a(this.f12590a, ieVar.f12590a)) != 0) {
            return a10;
        }
        int compareTo12 = Boolean.valueOf(mo42187l()).compareTo(Boolean.valueOf(ieVar.mo42187l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo42187l() && (a9 = C4537ja.m13601a(this.f12598h, ieVar.f12598h)) != 0) {
            return a9;
        }
        int compareTo13 = Boolean.valueOf(mo42188m()).compareTo(Boolean.valueOf(ieVar.mo42188m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo42188m() && (a8 = C4537ja.m13601a(this.f12599i, ieVar.f12599i)) != 0) {
            return a8;
        }
        int compareTo14 = Boolean.valueOf(mo42189n()).compareTo(Boolean.valueOf(ieVar.mo42189n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo42189n() && (a7 = C4537ja.m13601a(this.f12600j, ieVar.f12600j)) != 0) {
            return a7;
        }
        int compareTo15 = Boolean.valueOf(mo42190o()).compareTo(Boolean.valueOf(ieVar.mo42190o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (mo42190o() && (a6 = C4537ja.m13606a(this.f12589a, ieVar.f12589a)) != 0) {
            return a6;
        }
        int compareTo16 = Boolean.valueOf(mo42191p()).compareTo(Boolean.valueOf(ieVar.mo42191p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (mo42191p() && (a5 = C4537ja.m13606a(this.f12592b, ieVar.f12592b)) != 0) {
            return a5;
        }
        int compareTo17 = Boolean.valueOf(mo42192q()).compareTo(Boolean.valueOf(ieVar.mo42192q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (mo42192q() && (a4 = C4537ja.m13601a(this.f12601k, ieVar.f12601k)) != 0) {
            return a4;
        }
        int compareTo18 = Boolean.valueOf(mo42193r()).compareTo(Boolean.valueOf(ieVar.mo42193r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (mo42193r() && (a3 = C4537ja.m13601a(this.f12602l, ieVar.f12602l)) != 0) {
            return a3;
        }
        int compareTo19 = Boolean.valueOf(mo42194s()).compareTo(Boolean.valueOf(ieVar.mo42194s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (mo42194s() && (a2 = C4537ja.m13598a(this.f12582a, ieVar.f12582a)) != 0) {
            return a2;
        }
        int compareTo20 = Boolean.valueOf(mo42195t()).compareTo(Boolean.valueOf(ieVar.mo42195t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!mo42195t() || (a = C4537ja.m13604a(this.f12588a, ieVar.f12588a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4511ie mo42162a(long j) {
        this.f12583a = j;
        mo42166a(true);
        return this;
    }

    /* renamed from: a */
    public C4511ie mo42163a(String str) {
        this.f12591b = str;
        return this;
    }

    /* renamed from: a */
    public C4511ie mo42164a(short s) {
        this.f12589a = s;
        mo42171c(true);
        return this;
    }

    /* renamed from: a */
    public void mo42165a() {
        if (this.f12591b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12593c == null) {
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
                if (mo42178e()) {
                    mo42165a();
                    return;
                }
                throw new C4550jl("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12586a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12584a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12591b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12593c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f12583a = jkVar.m13660a();
                        mo42166a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f12594d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12595e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C4524ir irVar = new C4524ir();
                        this.f12585a = irVar;
                        irVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12596f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f12597g = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 11:
                    if (b == 2) {
                        this.f12590a = jkVar.m13681a();
                        mo42168b(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f12598h = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f12599i = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 14:
                    if (b == 11) {
                        this.f12600j = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 15:
                    if (b == 6) {
                        this.f12589a = jkVar.m13668a();
                        mo42171c(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 16:
                    if (b == 6) {
                        this.f12592b = jkVar.m13668a();
                        mo42175d(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 20:
                    if (b == 11) {
                        this.f12601k = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 21:
                    if (b == 11) {
                        this.f12602l = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 22:
                    if (b == 8) {
                        this.f12582a = jkVar.m13659a();
                        mo42177e(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 23:
                    if (b == 13) {
                        C4548jj a2 = jkVar.m13663a();
                        this.f12588a = new HashMap(a2.f13025a * 2);
                        for (int i = 0; i < a2.f13025a; i++) {
                            this.f12588a.put(jkVar.m13666a(), jkVar.m13666a());
                        }
                        jkVar.mo42589h();
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
    public void mo42166a(boolean z) {
        this.f12587a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13157a() {
        return this.f12586a != null;
    }

    /* renamed from: a */
    public boolean m13158a(C4511ie ieVar) {
        if (ieVar == null) {
            return false;
        }
        boolean a = m13157a();
        boolean a2 = ieVar.m13157a();
        if ((a || a2) && (!a || !a2 || !this.f12586a.equals(ieVar.f12586a))) {
            return false;
        }
        boolean b = mo42169b();
        boolean b2 = ieVar.mo42169b();
        if ((b || b2) && (!b || !b2 || !this.f12584a.m13142a(ieVar.f12584a))) {
            return false;
        }
        boolean c = mo42172c();
        boolean c2 = ieVar.mo42172c();
        if ((c || c2) && (!c || !c2 || !this.f12591b.equals(ieVar.f12591b))) {
            return false;
        }
        boolean d = mo42176d();
        boolean d2 = ieVar.mo42176d();
        if (((d || d2) && (!d || !d2 || !this.f12593c.equals(ieVar.f12593c))) || this.f12583a != ieVar.f12583a) {
            return false;
        }
        boolean f = mo42180f();
        boolean f2 = ieVar.mo42180f();
        if ((f || f2) && (!f || !f2 || !this.f12594d.equals(ieVar.f12594d))) {
            return false;
        }
        boolean g = mo42181g();
        boolean g2 = ieVar.mo42181g();
        if ((g || g2) && (!g || !g2 || !this.f12595e.equals(ieVar.f12595e))) {
            return false;
        }
        boolean h = mo42182h();
        boolean h2 = ieVar.mo42182h();
        if ((h || h2) && (!h || !h2 || !this.f12585a.m13458a(ieVar.f12585a))) {
            return false;
        }
        boolean i = mo42184i();
        boolean i2 = ieVar.mo42184i();
        if ((i || i2) && (!i || !i2 || !this.f12596f.equals(ieVar.f12596f))) {
            return false;
        }
        boolean j = mo42185j();
        boolean j2 = ieVar.mo42185j();
        if ((j || j2) && (!j || !j2 || !this.f12597g.equals(ieVar.f12597g))) {
            return false;
        }
        boolean k = mo42186k();
        boolean k2 = ieVar.mo42186k();
        if ((k || k2) && (!k || !k2 || this.f12590a != ieVar.f12590a)) {
            return false;
        }
        boolean l = mo42187l();
        boolean l2 = ieVar.mo42187l();
        if ((l || l2) && (!l || !l2 || !this.f12598h.equals(ieVar.f12598h))) {
            return false;
        }
        boolean m = mo42188m();
        boolean m2 = ieVar.mo42188m();
        if ((m || m2) && (!m || !m2 || !this.f12599i.equals(ieVar.f12599i))) {
            return false;
        }
        boolean n = mo42189n();
        boolean n2 = ieVar.mo42189n();
        if ((n || n2) && (!n || !n2 || !this.f12600j.equals(ieVar.f12600j))) {
            return false;
        }
        boolean o = mo42190o();
        boolean o2 = ieVar.mo42190o();
        if ((o || o2) && (!o || !o2 || this.f12589a != ieVar.f12589a)) {
            return false;
        }
        boolean p = mo42191p();
        boolean p2 = ieVar.mo42191p();
        if ((p || p2) && (!p || !p2 || this.f12592b != ieVar.f12592b)) {
            return false;
        }
        boolean q = mo42192q();
        boolean q2 = ieVar.mo42192q();
        if ((q || q2) && (!q || !q2 || !this.f12601k.equals(ieVar.f12601k))) {
            return false;
        }
        boolean r = mo42193r();
        boolean r2 = ieVar.mo42193r();
        if ((r || r2) && (!r || !r2 || !this.f12602l.equals(ieVar.f12602l))) {
            return false;
        }
        boolean s = mo42194s();
        boolean s2 = ieVar.mo42194s();
        if ((s || s2) && (!s || !s2 || this.f12582a != ieVar.f12582a)) {
            return false;
        }
        boolean t = mo42195t();
        boolean t2 = ieVar.mo42195t();
        if (t || t2) {
            return t && t2 && this.f12588a.equals(ieVar.f12588a);
        }
        return true;
    }

    /* renamed from: b */
    public C4511ie mo42167b(String str) {
        this.f12593c = str;
        return this;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42165a();
        jkVar.mo42576a(f12562a);
        if (this.f12586a != null && m13157a()) {
            jkVar.mo42573a(f12561a);
            jkVar.mo42577a(this.f12586a);
            jkVar.mo42581b();
        }
        if (this.f12584a != null && mo42169b()) {
            jkVar.mo42573a(f12563b);
            this.f12584a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12591b != null) {
            jkVar.mo42573a(f12564c);
            jkVar.mo42577a(this.f12591b);
            jkVar.mo42581b();
        }
        if (this.f12593c != null) {
            jkVar.mo42573a(f12565d);
            jkVar.mo42577a(this.f12593c);
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12566e);
        jkVar.mo42572a(this.f12583a);
        jkVar.mo42581b();
        if (this.f12594d != null && mo42180f()) {
            jkVar.mo42573a(f12567f);
            jkVar.mo42577a(this.f12594d);
            jkVar.mo42581b();
        }
        if (this.f12595e != null && mo42181g()) {
            jkVar.mo42573a(f12568g);
            jkVar.mo42577a(this.f12595e);
            jkVar.mo42581b();
        }
        if (this.f12585a != null && mo42182h()) {
            jkVar.mo42573a(f12569h);
            this.f12585a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12596f != null && mo42184i()) {
            jkVar.mo42573a(f12570i);
            jkVar.mo42577a(this.f12596f);
            jkVar.mo42581b();
        }
        if (this.f12597g != null && mo42185j()) {
            jkVar.mo42573a(f12571j);
            jkVar.mo42577a(this.f12597g);
            jkVar.mo42581b();
        }
        if (mo42186k()) {
            jkVar.mo42573a(f12572k);
            jkVar.mo42580a(this.f12590a);
            jkVar.mo42581b();
        }
        if (this.f12598h != null && mo42187l()) {
            jkVar.mo42573a(f12573l);
            jkVar.mo42577a(this.f12598h);
            jkVar.mo42581b();
        }
        if (this.f12599i != null && mo42188m()) {
            jkVar.mo42573a(f12574m);
            jkVar.mo42577a(this.f12599i);
            jkVar.mo42581b();
        }
        if (this.f12600j != null && mo42189n()) {
            jkVar.mo42573a(f12575n);
            jkVar.mo42577a(this.f12600j);
            jkVar.mo42581b();
        }
        if (mo42190o()) {
            jkVar.mo42573a(f12576o);
            jkVar.mo42579a(this.f12589a);
            jkVar.mo42581b();
        }
        if (mo42191p()) {
            jkVar.mo42573a(f12577p);
            jkVar.mo42579a(this.f12592b);
            jkVar.mo42581b();
        }
        if (this.f12601k != null && mo42192q()) {
            jkVar.mo42573a(f12578q);
            jkVar.mo42577a(this.f12601k);
            jkVar.mo42581b();
        }
        if (this.f12602l != null && mo42193r()) {
            jkVar.mo42573a(f12579r);
            jkVar.mo42577a(this.f12602l);
            jkVar.mo42581b();
        }
        if (mo42194s()) {
            jkVar.mo42573a(f12580s);
            jkVar.mo42570a(this.f12582a);
            jkVar.mo42581b();
        }
        if (this.f12588a != null && mo42195t()) {
            jkVar.mo42573a(f12581t);
            jkVar.mo42575a(new C4548jj((byte) 11, (byte) 11, this.f12588a.size()));
            for (Map.Entry<String, String> entry : this.f12588a.entrySet()) {
                jkVar.mo42577a(entry.getKey());
                jkVar.mo42577a(entry.getValue());
            }
            jkVar.mo42585d();
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42168b(boolean z) {
        this.f12587a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo42169b() {
        return this.f12584a != null;
    }

    /* renamed from: c */
    public C4511ie mo42170c(String str) {
        this.f12594d = str;
        return this;
    }

    /* renamed from: c */
    public void mo42171c(boolean z) {
        this.f12587a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo42172c() {
        return this.f12591b != null;
    }

    /* renamed from: d */
    public C4511ie mo42174d(String str) {
        this.f12595e = str;
        return this;
    }

    /* renamed from: d */
    public void mo42175d(boolean z) {
        this.f12587a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo42176d() {
        return this.f12593c != null;
    }

    /* renamed from: e */
    public void mo42177e(boolean z) {
        this.f12587a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo42178e() {
        return this.f12587a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4511ie)) {
            return m13158a((C4511ie) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42180f() {
        return this.f12594d != null;
    }

    /* renamed from: g */
    public boolean mo42181g() {
        return this.f12595e != null;
    }

    /* renamed from: h */
    public boolean mo42182h() {
        return this.f12585a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42184i() {
        return this.f12596f != null;
    }

    /* renamed from: j */
    public boolean mo42185j() {
        return this.f12597g != null;
    }

    /* renamed from: k */
    public boolean mo42186k() {
        return this.f12587a.get(1);
    }

    /* renamed from: l */
    public boolean mo42187l() {
        return this.f12598h != null;
    }

    /* renamed from: m */
    public boolean mo42188m() {
        return this.f12599i != null;
    }

    /* renamed from: n */
    public boolean mo42189n() {
        return this.f12600j != null;
    }

    /* renamed from: o */
    public boolean mo42190o() {
        return this.f12587a.get(2);
    }

    /* renamed from: p */
    public boolean mo42191p() {
        return this.f12587a.get(3);
    }

    /* renamed from: q */
    public boolean mo42192q() {
        return this.f12601k != null;
    }

    /* renamed from: r */
    public boolean mo42193r() {
        return this.f12602l != null;
    }

    /* renamed from: s */
    public boolean mo42194s() {
        return this.f12587a.get(4);
    }

    /* renamed from: t */
    public boolean mo42195t() {
        return this.f12588a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (m13157a()) {
            sb.append("debug:");
            String str = this.f12586a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo42169b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12584a;
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
        String str2 = this.f12591b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f12593c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f12583a);
        if (mo42180f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f12594d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42181g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f12595e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42182h()) {
            sb.append(", ");
            sb.append("request:");
            C4524ir irVar = this.f12585a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
        }
        if (mo42184i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f12596f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42185j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f12597g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo42186k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f12590a);
        }
        if (mo42187l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f12598h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo42188m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f12599i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo42189n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f12600j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (mo42190o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f12589a);
        }
        if (mo42191p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f12592b);
        }
        if (mo42192q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f12601k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (mo42193r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f12602l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (mo42194s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f12582a);
        }
        if (mo42195t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f12588a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
