package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.ij */
public class C4516ij implements AbstractC4532iz<C4516ij, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12656a = new C4546jh("", (byte) 12, 2);

    /* renamed from: a */
    public static final C4554jp f12657a = new C4554jp("XmPushActionCommandResult");

    /* renamed from: b */
    public static final C4546jh f12658b = new C4546jh("", (byte) 11, 3);

    /* renamed from: c */
    public static final C4546jh f12659c = new C4546jh("", (byte) 11, 4);

    /* renamed from: d */
    public static final C4546jh f12660d = new C4546jh("", (byte) 11, 5);

    /* renamed from: e */
    public static final C4546jh f12661e = new C4546jh("", (byte) 10, 7);

    /* renamed from: f */
    public static final C4546jh f12662f = new C4546jh("", (byte) 11, 8);

    /* renamed from: g */
    public static final C4546jh f12663g = new C4546jh("", (byte) 11, 9);

    /* renamed from: h */
    public static final C4546jh f12664h = new C4546jh("", (byte) 15, 10);

    /* renamed from: i */
    public static final C4546jh f12665i = new C4546jh("", (byte) 11, 12);

    /* renamed from: j */
    public static final C4546jh f12666j = new C4546jh("", (byte) 2, 13);

    /* renamed from: a */
    public long f12667a;

    /* renamed from: a */
    public C4510id f12668a;

    /* renamed from: a */
    public String f12669a;

    /* renamed from: a */
    public BitSet f12670a = new BitSet(2);

    /* renamed from: a */
    public List<String> f12671a;

    /* renamed from: a */
    public boolean f12672a = true;

    /* renamed from: b */
    public String f12673b;

    /* renamed from: c */
    public String f12674c;

    /* renamed from: d */
    public String f12675d;

    /* renamed from: e */
    public String f12676e;

    /* renamed from: f */
    public String f12677f;

    /* renamed from: a */
    public int compareTo(C4516ij ijVar) {
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
        if (!C4516ij.class.equals(ijVar.getClass())) {
            return C4516ij.class.getName().compareTo(ijVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13254a()).compareTo(Boolean.valueOf(ijVar.m13254a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13254a() && (a10 = C4537ja.m13600a(this.f12668a, ijVar.f12668a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m13259b()).compareTo(Boolean.valueOf(ijVar.m13259b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m13259b() && (a9 = C4537ja.m13601a(this.f12669a, ijVar.f12669a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo42260c()).compareTo(Boolean.valueOf(ijVar.mo42260c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42260c() && (a8 = C4537ja.m13601a(this.f12673b, ijVar.f12673b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo42262d()).compareTo(Boolean.valueOf(ijVar.mo42262d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42262d() && (a7 = C4537ja.m13601a(this.f12674c, ijVar.f12674c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo42263e()).compareTo(Boolean.valueOf(ijVar.mo42263e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42263e() && (a6 = C4537ja.m13599a(this.f12667a, ijVar.f12667a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo42265f()).compareTo(Boolean.valueOf(ijVar.mo42265f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42265f() && (a5 = C4537ja.m13601a(this.f12675d, ijVar.f12675d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo42266g()).compareTo(Boolean.valueOf(ijVar.mo42266g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42266g() && (a4 = C4537ja.m13601a(this.f12676e, ijVar.f12676e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo42267h()).compareTo(Boolean.valueOf(ijVar.mo42267h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42267h() && (a3 = C4537ja.m13603a(this.f12671a, ijVar.f12671a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo42269i()).compareTo(Boolean.valueOf(ijVar.mo42269i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42269i() && (a2 = C4537ja.m13601a(this.f12677f, ijVar.f12677f)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo42270j()).compareTo(Boolean.valueOf(ijVar.mo42270j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo42270j() || (a = C4537ja.m13607a(this.f12672a, ijVar.f12672a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo42256a() {
        return this.f12674c;
    }

    /* renamed from: a */
    public List<String> m13250a() {
        return this.f12671a;
    }

    /* renamed from: a */
    public void m13251a() {
        if (this.f12669a == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12673b == null) {
            throw new C4550jl("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f12674c == null) {
            throw new C4550jl("Required field 'cmdName' was not present! Struct: " + toString());
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
                if (mo42263e()) {
                    m13251a();
                    return;
                }
                throw new C4550jl("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (a.f13021a) {
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12668a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12669a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12673b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12674c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 10) {
                        this.f12667a = jkVar.m13660a();
                        mo42257a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f12675d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12676e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 15) {
                        C4547ji a2 = jkVar.m13662a();
                        this.f12671a = new ArrayList(a2.f13023a);
                        for (int i = 0; i < a2.f13023a; i++) {
                            this.f12671a.add(jkVar.m13666a());
                        }
                        jkVar.mo42590i();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f12677f = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 13:
                    if (b == 2) {
                        this.f12672a = jkVar.m13681a();
                        mo42259b(true);
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
    public void mo42257a(boolean z) {
        this.f12670a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13254a() {
        return this.f12668a != null;
    }

    /* renamed from: a */
    public boolean m13255a(C4516ij ijVar) {
        if (ijVar == null) {
            return false;
        }
        boolean a = m13254a();
        boolean a2 = ijVar.m13254a();
        if ((a || a2) && (!a || !a2 || !this.f12668a.m13142a(ijVar.f12668a))) {
            return false;
        }
        boolean b = m13259b();
        boolean b2 = ijVar.m13259b();
        if ((b || b2) && (!b || !b2 || !this.f12669a.equals(ijVar.f12669a))) {
            return false;
        }
        boolean c = mo42260c();
        boolean c2 = ijVar.mo42260c();
        if ((c || c2) && (!c || !c2 || !this.f12673b.equals(ijVar.f12673b))) {
            return false;
        }
        boolean d = mo42262d();
        boolean d2 = ijVar.mo42262d();
        if (((d || d2) && (!d || !d2 || !this.f12674c.equals(ijVar.f12674c))) || this.f12667a != ijVar.f12667a) {
            return false;
        }
        boolean f = mo42265f();
        boolean f2 = ijVar.mo42265f();
        if ((f || f2) && (!f || !f2 || !this.f12675d.equals(ijVar.f12675d))) {
            return false;
        }
        boolean g = mo42266g();
        boolean g2 = ijVar.mo42266g();
        if ((g || g2) && (!g || !g2 || !this.f12676e.equals(ijVar.f12676e))) {
            return false;
        }
        boolean h = mo42267h();
        boolean h2 = ijVar.mo42267h();
        if ((h || h2) && (!h || !h2 || !this.f12671a.equals(ijVar.f12671a))) {
            return false;
        }
        boolean i = mo42269i();
        boolean i2 = ijVar.mo42269i();
        if ((i || i2) && (!i || !i2 || !this.f12677f.equals(ijVar.f12677f))) {
            return false;
        }
        boolean j = mo42270j();
        boolean j2 = ijVar.mo42270j();
        if (j || j2) {
            return j && j2 && this.f12672a == ijVar.f12672a;
        }
        return true;
    }

    /* renamed from: b */
    public String mo42258b() {
        return this.f12677f;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13251a();
        jkVar.mo42576a(f12657a);
        if (this.f12668a != null && m13254a()) {
            jkVar.mo42573a(f12656a);
            this.f12668a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12669a != null) {
            jkVar.mo42573a(f12658b);
            jkVar.mo42577a(this.f12669a);
            jkVar.mo42581b();
        }
        if (this.f12673b != null) {
            jkVar.mo42573a(f12659c);
            jkVar.mo42577a(this.f12673b);
            jkVar.mo42581b();
        }
        if (this.f12674c != null) {
            jkVar.mo42573a(f12660d);
            jkVar.mo42577a(this.f12674c);
            jkVar.mo42581b();
        }
        jkVar.mo42573a(f12661e);
        jkVar.mo42572a(this.f12667a);
        jkVar.mo42581b();
        if (this.f12675d != null && mo42265f()) {
            jkVar.mo42573a(f12662f);
            jkVar.mo42577a(this.f12675d);
            jkVar.mo42581b();
        }
        if (this.f12676e != null && mo42266g()) {
            jkVar.mo42573a(f12663g);
            jkVar.mo42577a(this.f12676e);
            jkVar.mo42581b();
        }
        if (this.f12671a != null && mo42267h()) {
            jkVar.mo42573a(f12664h);
            jkVar.mo42574a(new C4547ji((byte) 11, this.f12671a.size()));
            for (String str : this.f12671a) {
                jkVar.mo42577a(str);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        if (this.f12677f != null && mo42269i()) {
            jkVar.mo42573a(f12665i);
            jkVar.mo42577a(this.f12677f);
            jkVar.mo42581b();
        }
        if (mo42270j()) {
            jkVar.mo42573a(f12666j);
            jkVar.mo42580a(this.f12672a);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42259b(boolean z) {
        this.f12670a.set(1, z);
    }

    /* renamed from: b */
    public boolean m13259b() {
        return this.f12669a != null;
    }

    /* renamed from: c */
    public boolean mo42260c() {
        return this.f12673b != null;
    }

    /* renamed from: d */
    public boolean mo42262d() {
        return this.f12674c != null;
    }

    /* renamed from: e */
    public boolean mo42263e() {
        return this.f12670a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4516ij)) {
            return m13255a((C4516ij) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42265f() {
        return this.f12675d != null;
    }

    /* renamed from: g */
    public boolean mo42266g() {
        return this.f12676e != null;
    }

    /* renamed from: h */
    public boolean mo42267h() {
        return this.f12671a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42269i() {
        return this.f12677f != null;
    }

    /* renamed from: j */
    public boolean mo42270j() {
        return this.f12670a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m13254a()) {
            sb.append("target:");
            C4510id idVar = this.f12668a;
            if (idVar == null) {
                sb.append("null");
            } else {
                sb.append(idVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f12669a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f12673b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f12674c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f12667a);
        if (mo42265f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f12675d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42266g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f12676e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42267h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f12671a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo42269i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f12677f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo42270j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f12672a);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
