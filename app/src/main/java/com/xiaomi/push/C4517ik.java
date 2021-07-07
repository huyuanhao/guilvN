package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ik */
public class C4517ik implements AbstractC4532iz<C4517ik, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12678a = new C4546jh("", (byte) 8, 1);

    /* renamed from: a */
    public static final C4554jp f12679a = new C4554jp("XmPushActionContainer");

    /* renamed from: b */
    public static final C4546jh f12680b = new C4546jh("", (byte) 2, 2);

    /* renamed from: c */
    public static final C4546jh f12681c = new C4546jh("", (byte) 2, 3);

    /* renamed from: d */
    public static final C4546jh f12682d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12683e = new C4546jh("", (byte) 11, 5);

    /* renamed from: f */
    public static final C4546jh f12684f = new C4546jh("", (byte) 11, 6);

    /* renamed from: g */
    public static final C4546jh f12685g = new C4546jh("", (byte) 12, 7);

    /* renamed from: h */
    public static final C4546jh f12686h = new C4546jh("", (byte) 12, 8);

    /* renamed from: a */
    public EnumC4494ho f12687a;

    /* renamed from: a */
    public C4508ib f12688a;

    /* renamed from: a */
    public C4510id f12689a;

    /* renamed from: a */
    public String f12690a;

    /* renamed from: a */
    public ByteBuffer f12691a;

    /* renamed from: a */
    public BitSet f12692a = new BitSet(2);

    /* renamed from: a */
    public boolean f12693a = true;

    /* renamed from: b */
    public String f12694b;

    /* renamed from: b */
    public boolean f12695b = true;

    /* renamed from: a */
    public int compareTo(C4517ik ikVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!C4517ik.class.equals(ikVar.getClass())) {
            return C4517ik.class.getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13281a()).compareTo(Boolean.valueOf(ikVar.m13281a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13281a() && (a8 = C4537ja.m13600a(this.f12687a, ikVar.f12687a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo42283c()).compareTo(Boolean.valueOf(ikVar.mo42283c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42283c() && (a7 = C4537ja.m13607a(this.f12693a, ikVar.f12693a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo42285d()).compareTo(Boolean.valueOf(ikVar.mo42285d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42285d() && (a6 = C4537ja.m13607a(this.f12695b, ikVar.f12695b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo42286e()).compareTo(Boolean.valueOf(ikVar.mo42286e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42286e() && (a5 = C4537ja.m13600a(this.f12691a, ikVar.f12691a)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo42288f()).compareTo(Boolean.valueOf(ikVar.mo42288f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42288f() && (a4 = C4537ja.m13601a(this.f12690a, ikVar.f12690a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo42289g()).compareTo(Boolean.valueOf(ikVar.mo42289g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42289g() && (a3 = C4537ja.m13601a(this.f12694b, ikVar.f12694b)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo42290h()).compareTo(Boolean.valueOf(ikVar.mo42290h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42290h() && (a2 = C4537ja.m13600a(this.f12689a, ikVar.f12689a)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo42292i()).compareTo(Boolean.valueOf(ikVar.mo42292i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo42292i() || (a = C4537ja.m13600a(this.f12688a, ikVar.f12688a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public EnumC4494ho mo42273a() {
        return this.f12687a;
    }

    /* renamed from: a */
    public C4508ib m13270a() {
        return this.f12688a;
    }

    /* renamed from: a */
    public C4517ik mo42274a(EnumC4494ho hoVar) {
        this.f12687a = hoVar;
        return this;
    }

    /* renamed from: a */
    public C4517ik mo42275a(C4508ib ibVar) {
        this.f12688a = ibVar;
        return this;
    }

    /* renamed from: a */
    public C4517ik mo42276a(C4510id idVar) {
        this.f12689a = idVar;
        return this;
    }

    /* renamed from: a */
    public C4517ik mo42277a(String str) {
        this.f12690a = str;
        return this;
    }

    /* renamed from: a */
    public C4517ik mo42278a(ByteBuffer byteBuffer) {
        this.f12691a = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C4517ik mo42279a(boolean z) {
        this.f12693a = z;
        m13280a(true);
        return this;
    }

    /* renamed from: a */
    public String m13277a() {
        return this.f12690a;
    }

    /* renamed from: a */
    public void m13278a() {
        if (this.f12687a == null) {
            throw new C4550jl("Required field 'action' was not present! Struct: " + toString());
        } else if (this.f12691a == null) {
            throw new C4550jl("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.f12689a == null) {
            throw new C4550jl("Required field 'target' was not present! Struct: " + toString());
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
                if (!mo42283c()) {
                    throw new C4550jl("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                } else if (mo42285d()) {
                    m13278a();
                    return;
                } else {
                    throw new C4550jl("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
            } else {
                switch (a.f13021a) {
                    case 1:
                        if (b == 8) {
                            this.f12687a = EnumC4494ho.m12927a(jkVar.m13659a());
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 2:
                        if (b == 2) {
                            this.f12693a = jkVar.m13681a();
                            m13280a(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 3:
                        if (b == 2) {
                            this.f12695b = jkVar.m13681a();
                            m13288b(true);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 4:
                        if (b == 11) {
                            this.f12691a = jkVar.m13667a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 5:
                        if (b == 11) {
                            this.f12690a = jkVar.m13666a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 6:
                        if (b == 11) {
                            this.f12694b = jkVar.m13666a();
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 7:
                        if (b == 12) {
                            C4510id idVar = new C4510id();
                            this.f12689a = idVar;
                            idVar.mo41828a(jkVar);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                    case 8:
                        if (b == 12) {
                            C4508ib ibVar = new C4508ib();
                            this.f12688a = ibVar;
                            ibVar.mo41828a(jkVar);
                            continue;
                            jkVar.mo42588g();
                        }
                        break;
                }
                C4552jn.m13693a(jkVar, b);
                jkVar.mo42588g();
            }
        }
    }

    /* renamed from: a */
    public void m13280a(boolean z) {
        this.f12692a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13281a() {
        return this.f12687a != null;
    }

    /* renamed from: a */
    public boolean m13282a(C4517ik ikVar) {
        if (ikVar == null) {
            return false;
        }
        boolean a = m13281a();
        boolean a2 = ikVar.m13281a();
        if (((a || a2) && (!a || !a2 || !this.f12687a.equals(ikVar.f12687a))) || this.f12693a != ikVar.f12693a || this.f12695b != ikVar.f12695b) {
            return false;
        }
        boolean e = mo42286e();
        boolean e2 = ikVar.mo42286e();
        if ((e || e2) && (!e || !e2 || !this.f12691a.equals(ikVar.f12691a))) {
            return false;
        }
        boolean f = mo42288f();
        boolean f2 = ikVar.mo42288f();
        if ((f || f2) && (!f || !f2 || !this.f12690a.equals(ikVar.f12690a))) {
            return false;
        }
        boolean g = mo42289g();
        boolean g2 = ikVar.mo42289g();
        if ((g || g2) && (!g || !g2 || !this.f12694b.equals(ikVar.f12694b))) {
            return false;
        }
        boolean h = mo42290h();
        boolean h2 = ikVar.mo42290h();
        if ((h || h2) && (!h || !h2 || !this.f12689a.m13142a(ikVar.f12689a))) {
            return false;
        }
        boolean i = mo42292i();
        boolean i2 = ikVar.mo42292i();
        if (i || i2) {
            return i && i2 && this.f12688a.m13104a(ikVar.f12688a);
        }
        return true;
    }

    /* renamed from: a */
    public byte[] m13283a() {
        mo42278a(C4537ja.m13610a(this.f12691a));
        return this.f12691a.array();
    }

    /* renamed from: b */
    public C4517ik mo42280b(String str) {
        this.f12694b = str;
        return this;
    }

    /* renamed from: b */
    public C4517ik mo42281b(boolean z) {
        this.f12695b = z;
        m13288b(true);
        return this;
    }

    /* renamed from: b */
    public String mo42282b() {
        return this.f12694b;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13278a();
        jkVar.mo42576a(f12679a);
        if (this.f12687a != null) {
            jkVar.mo42573a(f12678a);
            jkVar.mo42570a(this.f12687a.mo42005a());
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12680b);
        jkVar.mo42580a(this.f12693a);
        jkVar.mo42581b();
        jkVar.mo42573a(f12681c);
        jkVar.mo42580a(this.f12695b);
        jkVar.mo42581b();
        if (this.f12691a != null) {
            jkVar.mo42573a(f12682d);
            jkVar.mo42578a(this.f12691a);
            jkVar.mo42581b();
        }
        if (this.f12690a != null && mo42288f()) {
            jkVar.mo42573a(f12683e);
            jkVar.mo42577a(this.f12690a);
            jkVar.mo42581b();
        }
        if (this.f12694b != null && mo42289g()) {
            jkVar.mo42573a(f12684f);
            jkVar.mo42577a(this.f12694b);
            jkVar.mo42581b();
        }
        if (this.f12689a != null) {
            jkVar.mo42573a(f12685g);
            this.f12689a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12688a != null && mo42292i()) {
            jkVar.mo42573a(f12686h);
            this.f12688a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void m13288b(boolean z) {
        this.f12692a.set(1, z);
    }

    /* renamed from: b */
    public boolean m13289b() {
        return this.f12693a;
    }

    /* renamed from: c */
    public boolean mo42283c() {
        return this.f12692a.get(0);
    }

    /* renamed from: d */
    public boolean mo42285d() {
        return this.f12692a.get(1);
    }

    /* renamed from: e */
    public boolean mo42286e() {
        return this.f12691a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4517ik)) {
            return m13282a((C4517ik) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42288f() {
        return this.f12690a != null;
    }

    /* renamed from: g */
    public boolean mo42289g() {
        return this.f12694b != null;
    }

    /* renamed from: h */
    public boolean mo42290h() {
        return this.f12689a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42292i() {
        return this.f12688a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        EnumC4494ho hoVar = this.f12687a;
        if (hoVar == null) {
            sb.append("null");
        } else {
            sb.append(hoVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f12693a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f12695b);
        sb.append(", ");
        sb.append("pushAction:");
        ByteBuffer byteBuffer = this.f12691a;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C4537ja.m13611a(byteBuffer, sb);
        }
        if (mo42288f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f12690a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (mo42289g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f12694b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        C4510id idVar = this.f12689a;
        if (idVar == null) {
            sb.append("null");
        } else {
            sb.append(idVar);
        }
        if (mo42292i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C4508ib ibVar = this.f12688a;
            if (ibVar == null) {
                sb.append("null");
            } else {
                sb.append(ibVar);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
