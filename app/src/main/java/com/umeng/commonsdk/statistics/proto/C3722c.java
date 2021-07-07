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
import com.umeng.commonsdk.proguard.C3565ah;
import com.umeng.commonsdk.proguard.C3566ai;
import com.umeng.commonsdk.proguard.C3568ak;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3574an;
import com.umeng.commonsdk.proguard.C3575ao;
import com.umeng.commonsdk.proguard.C3576ap;
import com.umeng.commonsdk.proguard.C3580at;
import com.umeng.commonsdk.proguard.C3582av;
import com.umeng.commonsdk.proguard.C3584ax;
import com.umeng.commonsdk.proguard.C3585ay;
import com.umeng.commonsdk.proguard.C3595be;
import com.umeng.commonsdk.proguard.C3636z;
import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.c */
public class C3722c implements AbstractC3628t<C3722c, EnumC3728e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<EnumC3728e, C3563af> f9745d;

    /* renamed from: e */
    public static final long f9746e = -5764118265293965743L;

    /* renamed from: f */
    public static final C3584ax f9747f = new C3584ax("IdTracking");

    /* renamed from: g */
    public static final C3574an f9748g = new C3574an("snapshots", (byte) 13, 1);

    /* renamed from: h */
    public static final C3574an f9749h = new C3574an("journals", (byte) 15, 2);

    /* renamed from: i */
    public static final C3574an f9750i = new C3574an("checksum", (byte) 11, 3);

    /* renamed from: j */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9751j;

    /* renamed from: a */
    public Map<String, C3715b> f9752a;

    /* renamed from: b */
    public List<C3708a> f9753b;

    /* renamed from: c */
    public String f9754c;

    /* renamed from: k */
    public EnumC3728e[] f9755k;

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    public static class C3724a extends AbstractC3593bc<C3722c> {
        public C3724a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3722c cVar) throws C3636z {
            asVar.mo38933j();
            while (true) {
                C3574an l = asVar.mo38935l();
                byte b = l.f9230b;
                if (b == 0) {
                    asVar.mo38934k();
                    cVar.mo39402n();
                    return;
                }
                short s = l.f9231c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C3582av.m9431a(asVar, b);
                        } else if (b == 11) {
                            cVar.f9754c = asVar.mo38949z();
                            cVar.mo39391c(true);
                        } else {
                            C3582av.m9431a(asVar, b);
                        }
                    } else if (b == 15) {
                        C3575ao p = asVar.mo38939p();
                        cVar.f9753b = new ArrayList(p.f9233b);
                        while (i < p.f9233b) {
                            C3708a aVar = new C3708a();
                            aVar.read(asVar);
                            cVar.f9753b.add(aVar);
                            i++;
                        }
                        asVar.mo38940q();
                        cVar.mo39389b(true);
                    } else {
                        C3582av.m9431a(asVar, b);
                    }
                } else if (b == 13) {
                    C3576ap n = asVar.mo38937n();
                    cVar.f9752a = new HashMap(n.f9236c * 2);
                    while (i < n.f9236c) {
                        String z = asVar.mo38949z();
                        C3715b bVar = new C3715b();
                        bVar.read(asVar);
                        cVar.f9752a.put(z, bVar);
                        i++;
                    }
                    asVar.mo38938o();
                    cVar.mo39387a(true);
                } else {
                    C3582av.m9431a(asVar, b);
                }
                asVar.mo38936m();
            }
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, C3722c cVar) throws C3636z {
            cVar.mo39402n();
            asVar.mo38917a(C3722c.f9747f);
            if (cVar.f9752a != null) {
                asVar.mo38912a(C3722c.f9748g);
                asVar.mo38914a(new C3576ap((byte) 11, (byte) 12, cVar.f9752a.size()));
                for (Map.Entry<String, C3715b> entry : cVar.f9752a.entrySet()) {
                    asVar.mo38918a(entry.getKey());
                    entry.getValue().write(asVar);
                }
                asVar.mo38928e();
                asVar.mo38924c();
            }
            if (cVar.f9753b != null && cVar.mo39398j()) {
                asVar.mo38912a(C3722c.f9749h);
                asVar.mo38913a(new C3575ao((byte) 12, cVar.f9753b.size()));
                for (C3708a aVar : cVar.f9753b) {
                    aVar.write(asVar);
                }
                asVar.mo38929f();
                asVar.mo38924c();
            }
            if (cVar.f9754c != null && cVar.mo39401m()) {
                asVar.mo38912a(C3722c.f9750i);
                asVar.mo38918a(cVar.f9754c);
                asVar.mo38924c();
            }
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$b */
    public static class C3725b implements AbstractC3592bb {
        public C3725b() {
        }

        /* renamed from: a */
        public C3724a mo38897b() {
            return new C3724a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    public static class C3726c extends AbstractC3594bd<C3722c> {
        public C3726c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3722c cVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38910a(cVar.f9752a.size());
            for (Map.Entry<String, C3715b> entry : cVar.f9752a.entrySet()) {
                ayVar.mo38918a(entry.getKey());
                entry.getValue().write(ayVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.mo39398j()) {
                bitSet.set(0);
            }
            if (cVar.mo39401m()) {
                bitSet.set(1);
            }
            ayVar.mo38961a(bitSet, 2);
            if (cVar.mo39398j()) {
                ayVar.mo38910a(cVar.f9753b.size());
                for (C3708a aVar : cVar.f9753b) {
                    aVar.write(ayVar);
                }
            }
            if (cVar.mo39401m()) {
                ayVar.mo38918a(cVar.f9754c);
            }
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3722c cVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            C3576ap apVar = new C3576ap((byte) 11, (byte) 12, ayVar.mo38946w());
            cVar.f9752a = new HashMap(apVar.f9236c * 2);
            for (int i = 0; i < apVar.f9236c; i++) {
                String z = ayVar.mo38949z();
                C3715b bVar = new C3715b();
                bVar.read(ayVar);
                cVar.f9752a.put(z, bVar);
            }
            cVar.mo39387a(true);
            BitSet b = ayVar.mo38962b(2);
            if (b.get(0)) {
                C3575ao aoVar = new C3575ao((byte) 12, ayVar.mo38946w());
                cVar.f9753b = new ArrayList(aoVar.f9233b);
                for (int i2 = 0; i2 < aoVar.f9233b; i2++) {
                    C3708a aVar = new C3708a();
                    aVar.read(ayVar);
                    cVar.f9753b.add(aVar);
                }
                cVar.mo39389b(true);
            }
            if (b.get(1)) {
                cVar.f9754c = ayVar.mo38949z();
                cVar.mo39391c(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$d */
    public static class C3727d implements AbstractC3592bb {
        public C3727d() {
        }

        /* renamed from: a */
        public C3726c mo38897b() {
            return new C3726c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9751j = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3725b());
        f9751j.put(AbstractC3594bd.class, new C3727d());
        EnumMap enumMap = new EnumMap(EnumC3728e.class);
        enumMap.put((Object) EnumC3728e.SNAPSHOTS, (Object) new C3563af("snapshots", (byte) 1, new C3566ai((byte) 13, new C3564ag((byte) 11), new C3568ak((byte) 12, C3715b.class))));
        enumMap.put((Object) EnumC3728e.JOURNALS, (Object) new C3563af("journals", (byte) 2, new C3565ah((byte) 15, new C3568ak((byte) 12, C3708a.class))));
        enumMap.put((Object) EnumC3728e.CHECKSUM, (Object) new C3563af("checksum", (byte) 2, new C3564ag((byte) 11)));
        Map<EnumC3728e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9745d = unmodifiableMap;
        C3563af.m9266a(C3722c.class, unmodifiableMap);
    }

    public C3722c() {
        this.f9755k = new EnumC3728e[]{EnumC3728e.JOURNALS, EnumC3728e.CHECKSUM};
    }

    /* renamed from: a */
    public C3722c deepCopy() {
        return new C3722c(this);
    }

    /* renamed from: b */
    public int mo39388b() {
        Map<String, C3715b> map = this.f9752a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C3715b> mo39390c() {
        return this.f9752a;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9752a = null;
        this.f9753b = null;
        this.f9754c = null;
    }

    /* renamed from: d */
    public void mo39392d() {
        this.f9752a = null;
    }

    /* renamed from: e */
    public boolean mo39393e() {
        return this.f9752a != null;
    }

    /* renamed from: f */
    public int mo39394f() {
        List<C3708a> list = this.f9753b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: g */
    public Iterator<C3708a> mo39395g() {
        List<C3708a> list = this.f9753b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: h */
    public List<C3708a> mo39396h() {
        return this.f9753b;
    }

    /* renamed from: i */
    public void mo39397i() {
        this.f9753b = null;
    }

    /* renamed from: j */
    public boolean mo39398j() {
        return this.f9753b != null;
    }

    /* renamed from: k */
    public String mo39399k() {
        return this.f9754c;
    }

    /* renamed from: l */
    public void mo39400l() {
        this.f9754c = null;
    }

    /* renamed from: m */
    public boolean mo39401m() {
        return this.f9754c != null;
    }

    /* renamed from: n */
    public void mo39402n() throws C3636z {
        if (this.f9752a == null) {
            throw new C3580at("Required field 'snapshots' was not present! Struct: " + toString());
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9751j.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, C3715b> map = this.f9752a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (mo39398j()) {
            sb.append(", ");
            sb.append("journals:");
            List<C3708a> list = this.f9753b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo39401m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f9754c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9751j.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    public enum EnumC3728e implements AbstractC3553aa {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d */
        public static final Map<String, EnumC3728e> f9759d = new HashMap();

        /* renamed from: e */
        public final short f9761e;

        /* renamed from: f */
        public final String f9762f;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3728e.class).iterator();
            while (it.hasNext()) {
                EnumC3728e eVar = (EnumC3728e) it.next();
                f9759d.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3728e(short s, String str) {
            this.f9761e = s;
            this.f9762f = str;
        }

        /* renamed from: a */
        public static EnumC3728e m10120a(int i) {
            if (i == 1) {
                return SNAPSHOTS;
            }
            if (i == 2) {
                return JOURNALS;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static EnumC3728e m10122b(int i) {
            EnumC3728e a = m10120a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9762f;
        }

        /* renamed from: a */
        public static EnumC3728e m10121a(String str) {
            return f9759d.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9761e;
        }
    }

    /* renamed from: a */
    public void mo39386a(String str, C3715b bVar) {
        if (this.f9752a == null) {
            this.f9752a = new HashMap();
        }
        this.f9752a.put(str, bVar);
    }

    /* renamed from: b */
    public void mo39389b(boolean z) {
        if (!z) {
            this.f9753b = null;
        }
    }

    /* renamed from: c */
    public void mo39391c(boolean z) {
        if (!z) {
            this.f9754c = null;
        }
    }

    public C3722c(Map<String, C3715b> map) {
        this();
        this.f9752a = map;
    }

    public C3722c(C3722c cVar) {
        this.f9755k = new EnumC3728e[]{EnumC3728e.JOURNALS, EnumC3728e.CHECKSUM};
        if (cVar.mo39393e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, C3715b> entry : cVar.f9752a.entrySet()) {
                hashMap.put(entry.getKey(), new C3715b(entry.getValue()));
            }
            this.f9752a = hashMap;
        }
        if (cVar.mo39398j()) {
            ArrayList arrayList = new ArrayList();
            for (C3708a aVar : cVar.f9753b) {
                arrayList.add(new C3708a(aVar));
            }
            this.f9753b = arrayList;
        }
        if (cVar.mo39401m()) {
            this.f9754c = cVar.f9754c;
        }
    }

    /* renamed from: a */
    public C3722c mo39384a(Map<String, C3715b> map) {
        this.f9752a = map;
        return this;
    }

    /* renamed from: a */
    public void mo39387a(boolean z) {
        if (!z) {
            this.f9752a = null;
        }
    }

    /* renamed from: a */
    public void mo39385a(C3708a aVar) {
        if (this.f9753b == null) {
            this.f9753b = new ArrayList();
        }
        this.f9753b.add(aVar);
    }

    /* renamed from: a */
    public C3722c mo39383a(List<C3708a> list) {
        this.f9753b = list;
        return this;
    }

    /* renamed from: a */
    public C3722c mo39382a(String str) {
        this.f9754c = str;
        return this;
    }

    /* renamed from: a */
    public EnumC3728e fieldForId(int i) {
        return EnumC3728e.m10120a(i);
    }

    /* renamed from: a */
    private void m10080a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m10079a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }
}
