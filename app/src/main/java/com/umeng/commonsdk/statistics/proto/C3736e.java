package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.AbstractC3553aa;
import com.umeng.commonsdk.proguard.AbstractC3579as;
import com.umeng.commonsdk.proguard.AbstractC3591ba;
import com.umeng.commonsdk.proguard.AbstractC3592bb;
import com.umeng.commonsdk.proguard.AbstractC3593bc;
import com.umeng.commonsdk.proguard.AbstractC3594bd;
import com.umeng.commonsdk.proguard.AbstractC3628t;
import com.umeng.commonsdk.proguard.C3563af;
import com.umeng.commonsdk.proguard.C3564ag;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3574an;
import com.umeng.commonsdk.proguard.C3580at;
import com.umeng.commonsdk.proguard.C3582av;
import com.umeng.commonsdk.proguard.C3584ax;
import com.umeng.commonsdk.proguard.C3585ay;
import com.umeng.commonsdk.proguard.C3595be;
import com.umeng.commonsdk.proguard.C3625q;
import com.umeng.commonsdk.proguard.C3636z;
import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.e */
public class C3736e implements AbstractC3628t<C3736e, EnumC3742e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<EnumC3742e, C3563af> f9782d;

    /* renamed from: e */
    public static final long f9783e = 7501688097813630241L;

    /* renamed from: f */
    public static final C3584ax f9784f = new C3584ax("ImprintValue");

    /* renamed from: g */
    public static final C3574an f9785g = new C3574an("value", (byte) 11, 1);

    /* renamed from: h */
    public static final C3574an f9786h = new C3574an("ts", (byte) 10, 2);

    /* renamed from: i */
    public static final C3574an f9787i = new C3574an("guid", (byte) 11, 3);

    /* renamed from: j */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9788j;

    /* renamed from: k */
    public static final int f9789k = 0;

    /* renamed from: a */
    public String f9790a;

    /* renamed from: b */
    public long f9791b;

    /* renamed from: c */
    public String f9792c;

    /* renamed from: l */
    public byte f9793l;

    /* renamed from: m */
    public EnumC3742e[] f9794m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    public static class C3738a extends AbstractC3593bc<C3736e> {
        public C3738a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3736e eVar) throws C3636z {
            asVar.mo38933j();
            while (true) {
                C3574an l = asVar.mo38935l();
                byte b = l.f9230b;
                if (b == 0) {
                    break;
                }
                short s = l.f9231c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C3582av.m9431a(asVar, b);
                        } else if (b == 11) {
                            eVar.f9792c = asVar.mo38949z();
                            eVar.mo39446c(true);
                        } else {
                            C3582av.m9431a(asVar, b);
                        }
                    } else if (b == 10) {
                        eVar.f9791b = asVar.mo38947x();
                        eVar.mo39444b(true);
                    } else {
                        C3582av.m9431a(asVar, b);
                    }
                } else if (b == 11) {
                    eVar.f9790a = asVar.mo38949z();
                    eVar.mo39441a(true);
                } else {
                    C3582av.m9431a(asVar, b);
                }
                asVar.mo38936m();
            }
            asVar.mo38934k();
            if (eVar.mo39450g()) {
                eVar.mo39454k();
                return;
            }
            throw new C3580at("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, C3736e eVar) throws C3636z {
            eVar.mo39454k();
            asVar.mo38917a(C3736e.f9784f);
            if (eVar.f9790a != null && eVar.mo39447d()) {
                asVar.mo38912a(C3736e.f9785g);
                asVar.mo38918a(eVar.f9790a);
                asVar.mo38924c();
            }
            asVar.mo38912a(C3736e.f9786h);
            asVar.mo38911a(eVar.f9791b);
            asVar.mo38924c();
            if (eVar.f9792c != null) {
                asVar.mo38912a(C3736e.f9787i);
                asVar.mo38918a(eVar.f9792c);
                asVar.mo38924c();
            }
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$b */
    public static class C3739b implements AbstractC3592bb {
        public C3739b() {
        }

        /* renamed from: a */
        public C3738a mo38897b() {
            return new C3738a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    public static class C3740c extends AbstractC3594bd<C3736e> {
        public C3740c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3736e eVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38911a(eVar.f9791b);
            ayVar.mo38918a(eVar.f9792c);
            BitSet bitSet = new BitSet();
            if (eVar.mo39447d()) {
                bitSet.set(0);
            }
            ayVar.mo38961a(bitSet, 1);
            if (eVar.mo39447d()) {
                ayVar.mo38918a(eVar.f9790a);
            }
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3736e eVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            eVar.f9791b = ayVar.mo38947x();
            eVar.mo39444b(true);
            eVar.f9792c = ayVar.mo38949z();
            eVar.mo39446c(true);
            if (ayVar.mo38962b(1).get(0)) {
                eVar.f9790a = ayVar.mo38949z();
                eVar.mo39441a(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$d */
    public static class C3741d implements AbstractC3592bb {
        public C3741d() {
        }

        /* renamed from: a */
        public C3740c mo38897b() {
            return new C3740c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9788j = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3739b());
        f9788j.put(AbstractC3594bd.class, new C3741d());
        EnumMap enumMap = new EnumMap(EnumC3742e.class);
        enumMap.put((Object) EnumC3742e.VALUE, (Object) new C3563af("value", (byte) 2, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3742e.TS, (Object) new C3563af("ts", (byte) 1, new C3564ag((byte) 10)));
        enumMap.put((Object) EnumC3742e.GUID, (Object) new C3563af("guid", (byte) 1, new C3564ag((byte) 11)));
        Map<EnumC3742e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9782d = unmodifiableMap;
        C3563af.m9266a(C3736e.class, unmodifiableMap);
    }

    public C3736e() {
        this.f9793l = 0;
        this.f9794m = new EnumC3742e[]{EnumC3742e.VALUE};
    }

    /* renamed from: a */
    public C3736e deepCopy() {
        return new C3736e(this);
    }

    /* renamed from: b */
    public String mo39443b() {
        return this.f9790a;
    }

    /* renamed from: c */
    public void mo39445c() {
        this.f9790a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9790a = null;
        mo39444b(false);
        this.f9791b = 0;
        this.f9792c = null;
    }

    /* renamed from: d */
    public boolean mo39447d() {
        return this.f9790a != null;
    }

    /* renamed from: e */
    public long mo39448e() {
        return this.f9791b;
    }

    /* renamed from: f */
    public void mo39449f() {
        this.f9793l = C3625q.m9603b(this.f9793l, 0);
    }

    /* renamed from: g */
    public boolean mo39450g() {
        return C3625q.m9599a(this.f9793l, 0);
    }

    /* renamed from: h */
    public String mo39451h() {
        return this.f9792c;
    }

    /* renamed from: i */
    public void mo39452i() {
        this.f9792c = null;
    }

    /* renamed from: j */
    public boolean mo39453j() {
        return this.f9792c != null;
    }

    /* renamed from: k */
    public void mo39454k() throws C3636z {
        if (this.f9792c == null) {
            throw new C3580at("Required field 'guid' was not present! Struct: " + toString());
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9788j.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (mo39447d()) {
            sb.append("value:");
            String str = this.f9790a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f9791b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f9792c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9788j.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    public enum EnumC3742e implements AbstractC3553aa {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");
        

        /* renamed from: d */
        public static final Map<String, EnumC3742e> f9798d = new HashMap();

        /* renamed from: e */
        public final short f9800e;

        /* renamed from: f */
        public final String f9801f;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3742e.class).iterator();
            while (it.hasNext()) {
                EnumC3742e eVar = (EnumC3742e) it.next();
                f9798d.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3742e(short s, String str) {
            this.f9800e = s;
            this.f9801f = str;
        }

        /* renamed from: a */
        public static EnumC3742e m10204a(int i) {
            if (i == 1) {
                return VALUE;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return GUID;
        }

        /* renamed from: b */
        public static EnumC3742e m10206b(int i) {
            EnumC3742e a = m10204a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9801f;
        }

        /* renamed from: a */
        public static EnumC3742e m10205a(String str) {
            return f9798d.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9800e;
        }
    }

    /* renamed from: a */
    public C3736e mo39440a(String str) {
        this.f9790a = str;
        return this;
    }

    /* renamed from: b */
    public void mo39444b(boolean z) {
        this.f9793l = C3625q.m9591a(this.f9793l, 0, z);
    }

    /* renamed from: c */
    public void mo39446c(boolean z) {
        if (!z) {
            this.f9792c = null;
        }
    }

    /* renamed from: a */
    public void mo39441a(boolean z) {
        if (!z) {
            this.f9790a = null;
        }
    }

    /* renamed from: b */
    public C3736e mo39442b(String str) {
        this.f9792c = str;
        return this;
    }

    public C3736e(long j, String str) {
        this();
        this.f9791b = j;
        mo39444b(true);
        this.f9792c = str;
    }

    /* renamed from: a */
    public C3736e mo39439a(long j) {
        this.f9791b = j;
        mo39444b(true);
        return this;
    }

    /* renamed from: a */
    public EnumC3742e fieldForId(int i) {
        return EnumC3742e.m10204a(i);
    }

    /* renamed from: a */
    private void m10169a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    public C3736e(C3736e eVar) {
        this.f9793l = 0;
        this.f9794m = new EnumC3742e[]{EnumC3742e.VALUE};
        this.f9793l = eVar.f9793l;
        if (eVar.mo39447d()) {
            this.f9790a = eVar.f9790a;
        }
        this.f9791b = eVar.f9791b;
        if (eVar.mo39453j()) {
            this.f9792c = eVar.f9792c;
        }
    }

    /* renamed from: a */
    private void m10168a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9793l = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }
}
