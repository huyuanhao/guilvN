package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.ii */
public class C4515ii implements AbstractC4532iz<C4515ii, Object>, Serializable, Cloneable {

    /* renamed from: a */
    public static final C4546jh f12634a = new C4546jh("", (byte) 12, 2);

    /* renamed from: a */
    public static final C4554jp f12635a = new C4554jp("XmPushActionCommand");

    /* renamed from: b */
    public static final C4546jh f12636b = new C4546jh("", (byte) 11, 3);

    /* renamed from: c */
    public static final C4546jh f12637c = new C4546jh("", (byte) 11, 4);

    /* renamed from: d */
    public static final C4546jh f12638d = new C4546jh("", (byte) 11, 5);

    /* renamed from: e */
    public static final C4546jh f12639e = new C4546jh("", (byte) 15, 6);

    /* renamed from: f */
    public static final C4546jh f12640f = new C4546jh("", (byte) 11, 7);

    /* renamed from: g */
    public static final C4546jh f12641g = new C4546jh("", (byte) 11, 9);

    /* renamed from: h */
    public static final C4546jh f12642h = new C4546jh("", (byte) 2, 10);

    /* renamed from: i */
    public static final C4546jh f12643i = new C4546jh("", (byte) 2, 11);

    /* renamed from: j */
    public static final C4546jh f12644j = new C4546jh("", (byte) 10, 12);

    /* renamed from: a */
    public long f12645a;

    /* renamed from: a */
    public C4510id f12646a;

    /* renamed from: a */
    public String f12647a;

    /* renamed from: a */
    public BitSet f12648a = new BitSet(3);

    /* renamed from: a */
    public List<String> f12649a;

    /* renamed from: a */
    public boolean f12650a = false;

    /* renamed from: b */
    public String f12651b;

    /* renamed from: b */
    public boolean f12652b = true;

    /* renamed from: c */
    public String f12653c;

    /* renamed from: d */
    public String f12654d;

    /* renamed from: e */
    public String f12655e;

    /* renamed from: a */
    public int compareTo(C4515ii iiVar) {
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
        if (!C4515ii.class.equals(iiVar.getClass())) {
            return C4515ii.class.getName().compareTo(iiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m13230a()).compareTo(Boolean.valueOf(iiVar.m13230a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m13230a() && (a10 = C4537ja.m13600a(this.f12646a, iiVar.f12646a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo42238b()).compareTo(Boolean.valueOf(iiVar.mo42238b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo42238b() && (a9 = C4537ja.m13601a(this.f12647a, iiVar.f12647a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo42241c()).compareTo(Boolean.valueOf(iiVar.mo42241c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo42241c() && (a8 = C4537ja.m13601a(this.f12651b, iiVar.f12651b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo42244d()).compareTo(Boolean.valueOf(iiVar.mo42244d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo42244d() && (a7 = C4537ja.m13601a(this.f12653c, iiVar.f12653c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo42246e()).compareTo(Boolean.valueOf(iiVar.mo42246e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo42246e() && (a6 = C4537ja.m13603a(this.f12649a, iiVar.f12649a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo42248f()).compareTo(Boolean.valueOf(iiVar.mo42248f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo42248f() && (a5 = C4537ja.m13601a(this.f12654d, iiVar.f12654d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo42249g()).compareTo(Boolean.valueOf(iiVar.mo42249g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo42249g() && (a4 = C4537ja.m13601a(this.f12655e, iiVar.f12655e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo42250h()).compareTo(Boolean.valueOf(iiVar.mo42250h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo42250h() && (a3 = C4537ja.m13607a(this.f12650a, iiVar.f12650a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo42252i()).compareTo(Boolean.valueOf(iiVar.mo42252i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo42252i() && (a2 = C4537ja.m13607a(this.f12652b, iiVar.f12652b)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo42253j()).compareTo(Boolean.valueOf(iiVar.mo42253j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo42253j() || (a = C4537ja.m13599a(this.f12645a, iiVar.f12645a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4515ii mo42232a(String str) {
        this.f12647a = str;
        return this;
    }

    /* renamed from: a */
    public C4515ii mo42233a(List<String> list) {
        this.f12649a = list;
        return this;
    }

    /* renamed from: a */
    public String mo42234a() {
        return this.f12653c;
    }

    /* renamed from: a */
    public void m13226a() {
        if (this.f12647a == null) {
            throw new C4550jl("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f12651b == null) {
            throw new C4550jl("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f12653c == null) {
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
                m13226a();
                return;
            }
            switch (a.f13021a) {
                case 2:
                    if (b == 12) {
                        C4510id idVar = new C4510id();
                        this.f12646a = idVar;
                        idVar.mo41828a(jkVar);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f12647a = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f12651b = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f12653c = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 6:
                    if (b == 15) {
                        C4547ji a2 = jkVar.m13662a();
                        this.f12649a = new ArrayList(a2.f13023a);
                        for (int i = 0; i < a2.f13023a; i++) {
                            this.f12649a.add(jkVar.m13666a());
                        }
                        jkVar.mo42590i();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f12654d = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f12655e = jkVar.m13666a();
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 10:
                    if (b == 2) {
                        this.f12650a = jkVar.m13681a();
                        mo42235a(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 11:
                    if (b == 2) {
                        this.f12652b = jkVar.m13681a();
                        mo42237b(true);
                        continue;
                        jkVar.mo42588g();
                    }
                    break;
                case 12:
                    if (b == 10) {
                        this.f12645a = jkVar.m13660a();
                        mo42240c(true);
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
    public void m13228a(String str) {
        if (this.f12649a == null) {
            this.f12649a = new ArrayList();
        }
        this.f12649a.add(str);
    }

    /* renamed from: a */
    public void mo42235a(boolean z) {
        this.f12648a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13230a() {
        return this.f12646a != null;
    }

    /* renamed from: a */
    public boolean m13231a(C4515ii iiVar) {
        if (iiVar == null) {
            return false;
        }
        boolean a = m13230a();
        boolean a2 = iiVar.m13230a();
        if ((a || a2) && (!a || !a2 || !this.f12646a.m13142a(iiVar.f12646a))) {
            return false;
        }
        boolean b = mo42238b();
        boolean b2 = iiVar.mo42238b();
        if ((b || b2) && (!b || !b2 || !this.f12647a.equals(iiVar.f12647a))) {
            return false;
        }
        boolean c = mo42241c();
        boolean c2 = iiVar.mo42241c();
        if ((c || c2) && (!c || !c2 || !this.f12651b.equals(iiVar.f12651b))) {
            return false;
        }
        boolean d = mo42244d();
        boolean d2 = iiVar.mo42244d();
        if ((d || d2) && (!d || !d2 || !this.f12653c.equals(iiVar.f12653c))) {
            return false;
        }
        boolean e = mo42246e();
        boolean e2 = iiVar.mo42246e();
        if ((e || e2) && (!e || !e2 || !this.f12649a.equals(iiVar.f12649a))) {
            return false;
        }
        boolean f = mo42248f();
        boolean f2 = iiVar.mo42248f();
        if ((f || f2) && (!f || !f2 || !this.f12654d.equals(iiVar.f12654d))) {
            return false;
        }
        boolean g = mo42249g();
        boolean g2 = iiVar.mo42249g();
        if ((g || g2) && (!g || !g2 || !this.f12655e.equals(iiVar.f12655e))) {
            return false;
        }
        boolean h = mo42250h();
        boolean h2 = iiVar.mo42250h();
        if ((h || h2) && (!h || !h2 || this.f12650a != iiVar.f12650a)) {
            return false;
        }
        boolean i = mo42252i();
        boolean i2 = iiVar.mo42252i();
        if ((i || i2) && (!i || !i2 || this.f12652b != iiVar.f12652b)) {
            return false;
        }
        boolean j = mo42253j();
        boolean j2 = iiVar.mo42253j();
        if (j || j2) {
            return j && j2 && this.f12645a == iiVar.f12645a;
        }
        return true;
    }

    /* renamed from: b */
    public C4515ii mo42236b(String str) {
        this.f12651b = str;
        return this;
    }

    @Override // com.xiaomi.push.AbstractC4532iz
    /* renamed from: b */
    public void mo41832b(AbstractC4549jk jkVar) {
        m13226a();
        jkVar.mo42576a(f12635a);
        if (this.f12646a != null && m13230a()) {
            jkVar.mo42573a(f12634a);
            this.f12646a.mo41832b(jkVar);
            jkVar.mo42581b();
        }
        if (this.f12647a != null) {
            jkVar.mo42573a(f12636b);
            jkVar.mo42577a(this.f12647a);
            jkVar.mo42581b();
        }
        if (this.f12651b != null) {
            jkVar.mo42573a(f12637c);
            jkVar.mo42577a(this.f12651b);
            jkVar.mo42581b();
        }
        if (this.f12653c != null) {
            jkVar.mo42573a(f12638d);
            jkVar.mo42577a(this.f12653c);
            jkVar.mo42581b();
        }
        if (this.f12649a != null && mo42246e()) {
            jkVar.mo42573a(f12639e);
            jkVar.mo42574a(new C4547ji((byte) 11, this.f12649a.size()));
            for (String str : this.f12649a) {
                jkVar.mo42577a(str);
            }
            jkVar.mo42586e();
            jkVar.mo42581b();
        }
        if (this.f12654d != null && mo42248f()) {
            jkVar.mo42573a(f12640f);
            jkVar.mo42577a(this.f12654d);
            jkVar.mo42581b();
        }
        if (this.f12655e != null && mo42249g()) {
            jkVar.mo42573a(f12641g);
            jkVar.mo42577a(this.f12655e);
            jkVar.mo42581b();
        }
        if (mo42250h()) {
            jkVar.mo42573a(f12642h);
            jkVar.mo42580a(this.f12650a);
            jkVar.mo42581b();
        }
        if (mo42252i()) {
            jkVar.mo42573a(f12643i);
            jkVar.mo42580a(this.f12652b);
            jkVar.mo42581b();
        }
        if (mo42253j()) {
            jkVar.mo42573a(f12644j);
            jkVar.mo42572a(this.f12645a);
            jkVar.mo42581b();
        }
        jkVar.mo42583c();
        jkVar.m13669a();
    }

    /* renamed from: b */
    public void mo42237b(boolean z) {
        this.f12648a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo42238b() {
        return this.f12647a != null;
    }

    /* renamed from: c */
    public C4515ii mo42239c(String str) {
        this.f12653c = str;
        return this;
    }

    /* renamed from: c */
    public void mo42240c(boolean z) {
        this.f12648a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo42241c() {
        return this.f12651b != null;
    }

    /* renamed from: d */
    public C4515ii mo42243d(String str) {
        this.f12654d = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo42244d() {
        return this.f12653c != null;
    }

    /* renamed from: e */
    public C4515ii mo42245e(String str) {
        this.f12655e = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo42246e() {
        return this.f12649a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4515ii)) {
            return m13231a((C4515ii) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo42248f() {
        return this.f12654d != null;
    }

    /* renamed from: g */
    public boolean mo42249g() {
        return this.f12655e != null;
    }

    /* renamed from: h */
    public boolean mo42250h() {
        return this.f12648a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo42252i() {
        return this.f12648a.get(1);
    }

    /* renamed from: j */
    public boolean mo42253j() {
        return this.f12648a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m13230a()) {
            sb.append("target:");
            C4510id idVar = this.f12646a;
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
        String str = this.f12647a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f12651b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f12653c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (mo42246e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f12649a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo42248f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f12654d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo42249g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f12655e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo42250h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f12650a);
        }
        if (mo42252i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f12652b);
        }
        if (mo42253j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f12645a);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
