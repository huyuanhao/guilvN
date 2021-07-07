package com.umeng.commonsdk.statistics.proto;

import com.p118pd.sdk.C8404oOoo0O00;
import com.umeng.commonsdk.proguard.AbstractC3553aa;
import com.umeng.commonsdk.proguard.AbstractC3579as;
import com.umeng.commonsdk.proguard.AbstractC3591ba;
import com.umeng.commonsdk.proguard.AbstractC3592bb;
import com.umeng.commonsdk.proguard.AbstractC3593bc;
import com.umeng.commonsdk.proguard.AbstractC3594bd;
import com.umeng.commonsdk.proguard.AbstractC3628t;
import com.umeng.commonsdk.proguard.C3563af;
import com.umeng.commonsdk.proguard.C3564ag;
import com.umeng.commonsdk.proguard.C3566ai;
import com.umeng.commonsdk.proguard.C3568ak;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3574an;
import com.umeng.commonsdk.proguard.C3576ap;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.d */
public class C3729d implements AbstractC3628t<C3729d, EnumC3735e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<EnumC3735e, C3563af> f9763d;

    /* renamed from: e */
    public static final long f9764e = 2846460275012375038L;

    /* renamed from: f */
    public static final C3584ax f9765f = new C3584ax("Imprint");

    /* renamed from: g */
    public static final C3574an f9766g = new C3574an(C8404oOoo0O00.OooOO0, (byte) 13, 1);

    /* renamed from: h */
    public static final C3574an f9767h = new C3574an("version", (byte) 8, 2);

    /* renamed from: i */
    public static final C3574an f9768i = new C3574an("checksum", (byte) 11, 3);

    /* renamed from: j */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9769j;

    /* renamed from: k */
    public static final int f9770k = 0;

    /* renamed from: a */
    public Map<String, C3736e> f9771a;

    /* renamed from: b */
    public int f9772b;

    /* renamed from: c */
    public String f9773c;

    /* renamed from: l */
    public byte f9774l;

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    public static class C3731a extends AbstractC3593bc<C3729d> {
        public C3731a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3729d dVar) throws C3636z {
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
                            dVar.f9773c = asVar.mo38949z();
                            dVar.mo39420c(true);
                        } else {
                            C3582av.m9431a(asVar, b);
                        }
                    } else if (b == 8) {
                        dVar.f9772b = asVar.mo38946w();
                        dVar.mo39418b(true);
                    } else {
                        C3582av.m9431a(asVar, b);
                    }
                } else if (b == 13) {
                    C3576ap n = asVar.mo38937n();
                    dVar.f9771a = new HashMap(n.f9236c * 2);
                    for (int i = 0; i < n.f9236c; i++) {
                        String z = asVar.mo38949z();
                        C3736e eVar = new C3736e();
                        eVar.read(asVar);
                        dVar.f9771a.put(z, eVar);
                    }
                    asVar.mo38938o();
                    dVar.mo39415a(true);
                } else {
                    C3582av.m9431a(asVar, b);
                }
                asVar.mo38936m();
            }
            asVar.mo38934k();
            if (dVar.mo39425h()) {
                dVar.mo39429l();
                return;
            }
            throw new C3580at("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, C3729d dVar) throws C3636z {
            dVar.mo39429l();
            asVar.mo38917a(C3729d.f9765f);
            if (dVar.f9771a != null) {
                asVar.mo38912a(C3729d.f9766g);
                asVar.mo38914a(new C3576ap((byte) 11, (byte) 12, dVar.f9771a.size()));
                for (Map.Entry<String, C3736e> entry : dVar.f9771a.entrySet()) {
                    asVar.mo38918a(entry.getKey());
                    entry.getValue().write(asVar);
                }
                asVar.mo38928e();
                asVar.mo38924c();
            }
            asVar.mo38912a(C3729d.f9767h);
            asVar.mo38910a(dVar.f9772b);
            asVar.mo38924c();
            if (dVar.f9773c != null) {
                asVar.mo38912a(C3729d.f9768i);
                asVar.mo38918a(dVar.f9773c);
                asVar.mo38924c();
            }
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    public static class C3732b implements AbstractC3592bb {
        public C3732b() {
        }

        /* renamed from: a */
        public C3731a mo38897b() {
            return new C3731a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    public static class C3733c extends AbstractC3594bd<C3729d> {
        public C3733c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3729d dVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38910a(dVar.f9771a.size());
            for (Map.Entry<String, C3736e> entry : dVar.f9771a.entrySet()) {
                ayVar.mo38918a(entry.getKey());
                entry.getValue().write(ayVar);
            }
            ayVar.mo38910a(dVar.f9772b);
            ayVar.mo38918a(dVar.f9773c);
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3729d dVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            C3576ap apVar = new C3576ap((byte) 11, (byte) 12, ayVar.mo38946w());
            dVar.f9771a = new HashMap(apVar.f9236c * 2);
            for (int i = 0; i < apVar.f9236c; i++) {
                String z = ayVar.mo38949z();
                C3736e eVar = new C3736e();
                eVar.read(ayVar);
                dVar.f9771a.put(z, eVar);
            }
            dVar.mo39415a(true);
            dVar.f9772b = ayVar.mo38946w();
            dVar.mo39418b(true);
            dVar.f9773c = ayVar.mo38949z();
            dVar.mo39420c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d */
    public static class C3734d implements AbstractC3592bb {
        public C3734d() {
        }

        /* renamed from: a */
        public C3733c mo38897b() {
            return new C3733c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9769j = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3732b());
        f9769j.put(AbstractC3594bd.class, new C3734d());
        EnumMap enumMap = new EnumMap(EnumC3735e.class);
        enumMap.put((Object) EnumC3735e.PROPERTY, (Object) new C3563af(C8404oOoo0O00.OooOO0, (byte) 1, new C3566ai((byte) 13, new C3564ag((byte) 11), new C3568ak((byte) 12, C3736e.class))));
        enumMap.put((Object) EnumC3735e.VERSION, (Object) new C3563af("version", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3735e.CHECKSUM, (Object) new C3563af("checksum", (byte) 1, new C3564ag((byte) 11)));
        Map<EnumC3735e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9763d = unmodifiableMap;
        C3563af.m9266a(C3729d.class, unmodifiableMap);
    }

    public C3729d() {
        this.f9774l = 0;
    }

    /* renamed from: a */
    public C3729d deepCopy() {
        return new C3729d(this);
    }

    /* renamed from: b */
    public int mo39416b() {
        Map<String, C3736e> map = this.f9771a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C3736e> mo39419c() {
        return this.f9771a;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9771a = null;
        mo39418b(false);
        this.f9772b = 0;
        this.f9773c = null;
    }

    /* renamed from: d */
    public void mo39421d() {
        this.f9771a = null;
    }

    /* renamed from: e */
    public boolean mo39422e() {
        return this.f9771a != null;
    }

    /* renamed from: f */
    public int mo39423f() {
        return this.f9772b;
    }

    /* renamed from: g */
    public void mo39424g() {
        this.f9774l = C3625q.m9603b(this.f9774l, 0);
    }

    /* renamed from: h */
    public boolean mo39425h() {
        return C3625q.m9599a(this.f9774l, 0);
    }

    /* renamed from: i */
    public String mo39426i() {
        return this.f9773c;
    }

    /* renamed from: j */
    public void mo39427j() {
        this.f9773c = null;
    }

    /* renamed from: k */
    public boolean mo39428k() {
        return this.f9773c != null;
    }

    /* renamed from: l */
    public void mo39429l() throws C3636z {
        if (this.f9771a == null) {
            throw new C3580at("Required field 'property' was not present! Struct: " + toString());
        } else if (this.f9773c == null) {
            throw new C3580at("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9769j.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, C3736e> map = this.f9771a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f9772b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f9773c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9769j.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    public enum EnumC3735e implements AbstractC3553aa {
        PROPERTY(1, C8404oOoo0O00.OooOO0),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d */
        public static final Map<String, EnumC3735e> f9778d = new HashMap();

        /* renamed from: e */
        public final short f9780e;

        /* renamed from: f */
        public final String f9781f;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3735e.class).iterator();
            while (it.hasNext()) {
                EnumC3735e eVar = (EnumC3735e) it.next();
                f9778d.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3735e(short s, String str) {
            this.f9780e = s;
            this.f9781f = str;
        }

        /* renamed from: a */
        public static EnumC3735e m10163a(int i) {
            if (i == 1) {
                return PROPERTY;
            }
            if (i == 2) {
                return VERSION;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static EnumC3735e m10165b(int i) {
            EnumC3735e a = m10163a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9781f;
        }

        /* renamed from: a */
        public static EnumC3735e m10164a(String str) {
            return f9778d.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9780e;
        }
    }

    /* renamed from: a */
    public void mo39414a(String str, C3736e eVar) {
        if (this.f9771a == null) {
            this.f9771a = new HashMap();
        }
        this.f9771a.put(str, eVar);
    }

    /* renamed from: b */
    public void mo39418b(boolean z) {
        this.f9774l = C3625q.m9591a(this.f9774l, 0, z);
    }

    /* renamed from: c */
    public void mo39420c(boolean z) {
        if (!z) {
            this.f9773c = null;
        }
    }

    public C3729d(Map<String, C3736e> map, int i, String str) {
        this();
        this.f9771a = map;
        this.f9772b = i;
        mo39418b(true);
        this.f9773c = str;
    }

    /* renamed from: b */
    public EnumC3735e fieldForId(int i) {
        return EnumC3735e.m10163a(i);
    }

    /* renamed from: a */
    public C3729d mo39413a(Map<String, C3736e> map) {
        this.f9771a = map;
        return this;
    }

    /* renamed from: a */
    public void mo39415a(boolean z) {
        if (!z) {
            this.f9771a = null;
        }
    }

    /* renamed from: a */
    public C3729d mo39411a(int i) {
        this.f9772b = i;
        mo39418b(true);
        return this;
    }

    public C3729d(C3729d dVar) {
        this.f9774l = 0;
        this.f9774l = dVar.f9774l;
        if (dVar.mo39422e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, C3736e> entry : dVar.f9771a.entrySet()) {
                hashMap.put(entry.getKey(), new C3736e(entry.getValue()));
            }
            this.f9771a = hashMap;
        }
        this.f9772b = dVar.f9772b;
        if (dVar.mo39428k()) {
            this.f9773c = dVar.f9773c;
        }
    }

    /* renamed from: a */
    public C3729d mo39412a(String str) {
        this.f9773c = str;
        return this;
    }

    /* renamed from: a */
    private void m10126a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m10125a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9774l = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }
}
