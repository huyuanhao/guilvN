package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.id */
public class C4510id implements AbstractC4532iz<C4510id, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12547a = new C4546jh("", (byte) 10, 1);

    /* renamed from: a */
    public static final C4554jp f12548a = new C4554jp("Target");

    /* renamed from: b */
    public static final C4546jh f12549b = new C4546jh("", (byte) 11, 2);

    /* renamed from: c */
    public static final C4546jh f12550c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12551d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12552e = new C4546jh("", (byte) 2, 5);

    /* renamed from: f */
    public static final C4546jh f12553f = new C4546jh("", (byte) 11, 7);

    /* renamed from: a */
    public long f12554a = 5;

    /* renamed from: a */
    public String f12555a;

    /* renamed from: a */
    public BitSet f12556a = new BitSet(2);

    /* renamed from: a */
    public boolean f12557a = false;

    /* renamed from: b */
    public String f12558b = "xiaomi.com";

    /* renamed from: c */
    public String f12559c = "";

    /* renamed from: d */
    public String f12560d;

    /* renamed from: a */
    public int compareTo(C4510id idVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        if (!C4510id.class.equals(idVar.getClass())) {
            return C4510id.class.getName().compareTo(idVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13141a()).compareTo(Boolean.valueOf(idVar.m13141a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13141a() && (a6 = C4537ja.m13599a(this.f12554a, idVar.f12554a)) != 0) {
            return a6;
        }
        int compareTo2 = Boolean.valueOf(mo42152b()).compareTo(Boolean.valueOf(idVar.mo42152b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42152b() && (a5 = C4537ja.m13601a(this.f12555a, idVar.f12555a)) != 0) {
            return a5;
        }
        int compareTo3 = Boolean.valueOf(mo42153c()).compareTo(Boolean.valueOf(idVar.mo42153c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42153c() && (a4 = C4537ja.m13601a(this.f12558b, idVar.f12558b)) != 0) {
            return a4;
        }
        int compareTo4 = Boolean.valueOf(mo42155d()).compareTo(Boolean.valueOf(idVar.mo42155d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42155d() && (a3 = C4537ja.m13601a(this.f12559c, idVar.f12559c)) != 0) {
            return a3;
        }
        int compareTo5 = Boolean.valueOf(mo42156e()).compareTo(Boolean.valueOf(idVar.mo42156e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42156e() && (a2 = C4537ja.m13607a(this.f12557a, idVar.f12557a)) != 0) {
            return a2;
        }
        int compareTo6 = Boolean.valueOf(mo42158f()).compareTo(Boolean.valueOf(idVar.mo42158f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!mo42158f() || (a = C4537ja.m13601a(this.f12560d, idVar.f12560d)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo42149a() {
        if (this.f12555a == null) {
            throw new C4550jl("Required field 'userId' was not present! Struct: " + toString());
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
                break;
            }
            short s = a.f13021a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s == 7 && b == 11) {
                                    this.f12560d = jkVar.m13666a();
                                    jkVar.mo42588g();
                                }
                            } else if (b == 2) {
                                this.f12557a = jkVar.m13681a();
                                mo42151b(true);
                                jkVar.mo42588g();
                            }
                        } else if (b == 11) {
                            this.f12559c = jkVar.m13666a();
                            jkVar.mo42588g();
                        }
                    } else if (b == 11) {
                        this.f12558b = jkVar.m13666a();
                        jkVar.mo42588g();
                    }
                } else if (b == 11) {
                    this.f12555a = jkVar.m13666a();
                    jkVar.mo42588g();
                }
            } else if (b == 10) {
                this.f12554a = jkVar.m13660a();
                mo42150a(true);
                jkVar.mo42588g();
            }
            C4552jn.m13693a(jkVar, b);
            jkVar.mo42588g();
        }
        jkVar.mo42587f();
        if (m13141a()) {
            mo42149a();
            return;
        }
        throw new C4550jl("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo42150a(boolean z) {
        this.f12556a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13141a() {
        return this.f12556a.get(0);
    }

    /* renamed from: a */
    public boolean m13142a(C4510id idVar) {
        if (idVar == null || this.f12554a != idVar.f12554a) {
            return false;
        }
        boolean b = mo42152b();
        boolean b2 = idVar.mo42152b();
        if ((b || b2) && (!b || !b2 || !this.f12555a.equals(idVar.f12555a))) {
            return false;
        }
        boolean c = mo42153c();
        boolean c2 = idVar.mo42153c();
        if ((c || c2) && (!c || !c2 || !this.f12558b.equals(idVar.f12558b))) {
            return false;
        }
        boolean d = mo42155d();
        boolean d2 = idVar.mo42155d();
        if ((d || d2) && (!d || !d2 || !this.f12559c.equals(idVar.f12559c))) {
            return false;
        }
        boolean e = mo42156e();
        boolean e2 = idVar.mo42156e();
        if ((e || e2) && (!e || !e2 || this.f12557a != idVar.f12557a)) {
            return false;
        }
        boolean f = mo42158f();
        boolean f2 = idVar.mo42158f();
        if (f || f2) {
            return f && f2 && this.f12560d.equals(idVar.f12560d);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42149a();
        jkVar.mo42576a(f12548a);
        jkVar.mo42573a(f12547a);
        jkVar.mo42572a(this.f12554a);
        jkVar.mo42581b();
        if (this.f12555a != null) {
            jkVar.mo42573a(f12549b);
            jkVar.mo42577a(this.f12555a);
            jkVar.mo42581b();
        }
        if (this.f12558b != null && mo42153c()) {
            jkVar.mo42573a(f12550c);
            jkVar.mo42577a(this.f12558b);
            jkVar.mo42581b();
        }
        if (this.f12559c != null && mo42155d()) {
            jkVar.mo42573a(f12551d);
            jkVar.mo42577a(this.f12559c);
            jkVar.mo42581b();
        }
        if (mo42156e()) {
            jkVar.mo42573a(f12552e);
            jkVar.mo42580a(this.f12557a);
            jkVar.mo42581b();
        }
        if (this.f12560d != null && mo42158f()) {
            jkVar.mo42573a(f12553f);
            jkVar.mo42577a(this.f12560d);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42151b(boolean z) {
        this.f12556a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo42152b() {
        return this.f12555a != null;
    }

    /* renamed from: c */
    public boolean mo42153c() {
        return this.f12558b != null;
    }

    /* renamed from: d */
    public boolean mo42155d() {
        return this.f12559c != null;
    }

    /* renamed from: e */
    public boolean mo42156e() {
        return this.f12556a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4510id)) {
            return m13142a((C4510id) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42158f() {
        return this.f12560d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f12554a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f12555a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo42153c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f12558b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo42155d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f12559c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo42156e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f12557a);
        }
        if (mo42158f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f12560d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
