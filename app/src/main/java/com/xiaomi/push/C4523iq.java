package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.iq */
public class C4523iq implements AbstractC4532iz<C4523iq, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12830a = new C4546jh("", (byte) 11, 1);

    /* renamed from: a */
    public static final C4554jp f12831a = new C4554jp("XmPushActionSendFeedbackResult");

    /* renamed from: b */
    public static final C4546jh f12832b = new C4546jh("", (byte) 12, 2);

    /* renamed from: c */
    public static final C4546jh f12833c = new C4546jh("", (byte) 11, 3);

    /* renamed from: d */
    public static final C4546jh f12834d = new C4546jh("", (byte) 11, 4);

    /* renamed from: e */
    public static final C4546jh f12835e = new C4546jh("", (byte) 10, 6);

    /* renamed from: f */
    public static final C4546jh f12836f = new C4546jh("", (byte) 11, 7);

    /* renamed from: g */
    public static final C4546jh f12837g = new C4546jh("", (byte) 11, 8);

    /* renamed from: a */
    public long f12838a;

    /* renamed from: a */
    public C4510id f12839a;

    /* renamed from: a */
    public String f12840a;

    /* renamed from: a */
    public BitSet f12841a = new BitSet(1);

    /* renamed from: b */
    public String f12842b;

    /* renamed from: c */
    public String f12843c;

    /* renamed from: d */
    public String f12844d;

    /* renamed from: e */
    public String f12845e;

    /* renamed from: a */
    public int compareTo(C4523iq iqVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!C4523iq.class.equals(iqVar.getClass())) {
            return C4523iq.class.getName().compareTo(iqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13442a()).compareTo(Boolean.valueOf(iqVar.m13442a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13442a() && (a7 = C4537ja.m13601a(this.f12840a, iqVar.f12840a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(mo42424b()).compareTo(Boolean.valueOf(iqVar.mo42424b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42424b() && (a6 = C4537ja.m13600a(this.f12839a, iqVar.f12839a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(mo42425c()).compareTo(Boolean.valueOf(iqVar.mo42425c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42425c() && (a5 = C4537ja.m13601a(this.f12842b, iqVar.f12842b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(mo42427d()).compareTo(Boolean.valueOf(iqVar.mo42427d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42427d() && (a4 = C4537ja.m13601a(this.f12843c, iqVar.f12843c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(mo42428e()).compareTo(Boolean.valueOf(iqVar.mo42428e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42428e() && (a3 = C4537ja.m13599a(this.f12838a, iqVar.f12838a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(mo42430f()).compareTo(Boolean.valueOf(iqVar.mo42430f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42430f() && (a2 = C4537ja.m13601a(this.f12844d, iqVar.f12844d)) != 0) {
            return a2;
        }
        int compareTo7 = Boolean.valueOf(mo42431g()).compareTo(Boolean.valueOf(iqVar.mo42431g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!mo42431g() || (a = C4537ja.m13601a(this.f12845e, iqVar.f12845e)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo42422a() {
        if (this.f12842b == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12843c == null) {
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
                if (mo42428e()) {
                    mo42422a();
                    return;
                }
                throw new C4550jl("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a.f13021a) {
                case 1:
                    if (b == 11) {
                        this.f12840a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12839a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12842b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12843c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 10) {
                        this.f12838a = jkVar.m13660a();
                        mo42423a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12844d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12845e = jkVar.m13666a();
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
    public void mo42423a(boolean z) {
        this.f12841a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13442a() {
        return this.f12840a != null;
    }

    /* renamed from: a */
    public boolean m13443a(C4523iq iqVar) {
        if (iqVar == null) {
            return false;
        }
        boolean a = m13442a();
        boolean a2 = iqVar.m13442a();
        if ((a || a2) && (!a || !a2 || !this.f12840a.equals(iqVar.f12840a))) {
            return false;
        }
        boolean b = mo42424b();
        boolean b2 = iqVar.mo42424b();
        if ((b || b2) && (!b || !b2 || !this.f12839a.m13142a(iqVar.f12839a))) {
            return false;
        }
        boolean c = mo42425c();
        boolean c2 = iqVar.mo42425c();
        if ((c || c2) && (!c || !c2 || !this.f12842b.equals(iqVar.f12842b))) {
            return false;
        }
        boolean d = mo42427d();
        boolean d2 = iqVar.mo42427d();
        if (((d || d2) && (!d || !d2 || !this.f12843c.equals(iqVar.f12843c))) || this.f12838a != iqVar.f12838a) {
            return false;
        }
        boolean f = mo42430f();
        boolean f2 = iqVar.mo42430f();
        if ((f || f2) && (!f || !f2 || !this.f12844d.equals(iqVar.f12844d))) {
            return false;
        }
        boolean g = mo42431g();
        boolean g2 = iqVar.mo42431g();
        if (g || g2) {
            return g && g2 && this.f12845e.equals(iqVar.f12845e);
        }
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        mo42422a();
        jkVar.mo42576a(f12831a);
        if (this.f12840a != null && m13442a()) {
            jkVar.mo42573a(f12830a);
            jkVar.mo42577a(this.f12840a);
            jkVar.mo42581b();
        }
        if (this.f12839a != null && mo42424b()) {
            jkVar.mo42573a(f12832b);
            this.f12839a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12842b != null) {
            jkVar.mo42573a(f12833c);
            jkVar.mo42577a(this.f12842b);
            jkVar.mo42581b();
        }
        if (this.f12843c != null) {
            jkVar.mo42573a(f12834d);
            jkVar.mo42577a(this.f12843c);
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12835e);
        jkVar.mo42572a(this.f12838a);
        jkVar.mo42581b();
        if (this.f12844d != null && mo42430f()) {
            jkVar.mo42573a(f12836f);
            jkVar.mo42577a(this.f12844d);
            jkVar.mo42581b();
        }
        if (this.f12845e != null && mo42431g()) {
            jkVar.mo42573a(f12837g);
            jkVar.mo42577a(this.f12845e);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public boolean mo42424b() {
        return this.f12839a != null;
    }

    /* renamed from: c */
    public boolean mo42425c() {
        return this.f12842b != null;
    }

    /* renamed from: d */
    public boolean mo42427d() {
        return this.f12843c != null;
    }

    /* renamed from: e */
    public boolean mo42428e() {
        return this.f12841a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4523iq)) {
            return m13443a((C4523iq) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42430f() {
        return this.f12844d != null;
    }

    /* renamed from: g */
    public boolean mo42431g() {
        return this.f12845e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m13442a()) {
            sb.append("debug:");
            String str = this.f12840a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo42424b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4510id idVar = this.f12839a;
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
        String str2 = this.f12842b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f12843c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f12838a);
        if (mo42430f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f12844d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42431g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f12845e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
