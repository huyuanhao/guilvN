package com.umeng.commonsdk.statistics.proto;

import anet.channel.strategy.dispatch.DispatchConstants;
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

/* renamed from: com.umeng.commonsdk.statistics.proto.a */
public class C3708a implements AbstractC3628t<C3708a, EnumC3714e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final Map<EnumC3714e, C3563af> f9702e;

    /* renamed from: f */
    public static final long f9703f = 9132678615281394583L;

    /* renamed from: g */
    public static final C3584ax f9704g = new C3584ax("IdJournal");

    /* renamed from: h */
    public static final C3574an f9705h = new C3574an(DispatchConstants.DOMAIN, (byte) 11, 1);

    /* renamed from: i */
    public static final C3574an f9706i = new C3574an("old_id", (byte) 11, 2);

    /* renamed from: j */
    public static final C3574an f9707j = new C3574an("new_id", (byte) 11, 3);

    /* renamed from: k */
    public static final C3574an f9708k = new C3574an("ts", (byte) 10, 4);

    /* renamed from: l */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9709l;

    /* renamed from: m */
    public static final int f9710m = 0;

    /* renamed from: a */
    public String f9711a;

    /* renamed from: b */
    public String f9712b;

    /* renamed from: c */
    public String f9713c;

    /* renamed from: d */
    public long f9714d;

    /* renamed from: n */
    public byte f9715n;

    /* renamed from: o */
    public EnumC3714e[] f9716o;

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    public static class C3710a extends AbstractC3593bc<C3708a> {
        public C3710a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3708a aVar) throws C3636z {
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
                            if (s != 4) {
                                C3582av.m9431a(asVar, b);
                            } else if (b == 10) {
                                aVar.f9714d = asVar.mo38947x();
                                aVar.mo39336d(true);
                            } else {
                                C3582av.m9431a(asVar, b);
                            }
                        } else if (b == 11) {
                            aVar.f9713c = asVar.mo38949z();
                            aVar.mo39335c(true);
                        } else {
                            C3582av.m9431a(asVar, b);
                        }
                    } else if (b == 11) {
                        aVar.f9712b = asVar.mo38949z();
                        aVar.mo39332b(true);
                    } else {
                        C3582av.m9431a(asVar, b);
                    }
                } else if (b == 11) {
                    aVar.f9711a = asVar.mo38949z();
                    aVar.mo39329a(true);
                } else {
                    C3582av.m9431a(asVar, b);
                }
                asVar.mo38936m();
            }
            asVar.mo38934k();
            if (aVar.mo39346m()) {
                aVar.mo39347n();
                return;
            }
            throw new C3580at("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, C3708a aVar) throws C3636z {
            aVar.mo39347n();
            asVar.mo38917a(C3708a.f9704g);
            if (aVar.f9711a != null) {
                asVar.mo38912a(C3708a.f9705h);
                asVar.mo38918a(aVar.f9711a);
                asVar.mo38924c();
            }
            if (aVar.f9712b != null && aVar.mo39340g()) {
                asVar.mo38912a(C3708a.f9706i);
                asVar.mo38918a(aVar.f9712b);
                asVar.mo38924c();
            }
            if (aVar.f9713c != null) {
                asVar.mo38912a(C3708a.f9707j);
                asVar.mo38918a(aVar.f9713c);
                asVar.mo38924c();
            }
            asVar.mo38912a(C3708a.f9708k);
            asVar.mo38911a(aVar.f9714d);
            asVar.mo38924c();
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$b */
    public static class C3711b implements AbstractC3592bb {
        public C3711b() {
        }

        /* renamed from: a */
        public C3710a mo38897b() {
            return new C3710a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    public static class C3712c extends AbstractC3594bd<C3708a> {
        public C3712c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3708a aVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38918a(aVar.f9711a);
            ayVar.mo38918a(aVar.f9713c);
            ayVar.mo38911a(aVar.f9714d);
            BitSet bitSet = new BitSet();
            if (aVar.mo39340g()) {
                bitSet.set(0);
            }
            ayVar.mo38961a(bitSet, 1);
            if (aVar.mo39340g()) {
                ayVar.mo38918a(aVar.f9712b);
            }
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3708a aVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            aVar.f9711a = ayVar.mo38949z();
            aVar.mo39329a(true);
            aVar.f9713c = ayVar.mo38949z();
            aVar.mo39335c(true);
            aVar.f9714d = ayVar.mo38947x();
            aVar.mo39336d(true);
            if (ayVar.mo38962b(1).get(0)) {
                aVar.f9712b = ayVar.mo38949z();
                aVar.mo39332b(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$d */
    public static class C3713d implements AbstractC3592bb {
        public C3713d() {
        }

        /* renamed from: a */
        public C3712c mo38897b() {
            return new C3712c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9709l = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3711b());
        f9709l.put(AbstractC3594bd.class, new C3713d());
        EnumMap enumMap = new EnumMap(EnumC3714e.class);
        enumMap.put((Object) EnumC3714e.DOMAIN, (Object) new C3563af(DispatchConstants.DOMAIN, (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3714e.OLD_ID, (Object) new C3563af("old_id", (byte) 2, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3714e.NEW_ID, (Object) new C3563af("new_id", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3714e.TS, (Object) new C3563af("ts", (byte) 1, new C3564ag((byte) 10)));
        Map<EnumC3714e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9702e = unmodifiableMap;
        C3563af.m9266a(C3708a.class, unmodifiableMap);
    }

    public C3708a() {
        this.f9715n = 0;
        this.f9716o = new EnumC3714e[]{EnumC3714e.OLD_ID};
    }

    /* renamed from: a */
    public C3708a deepCopy() {
        return new C3708a(this);
    }

    /* renamed from: b */
    public String mo39331b() {
        return this.f9711a;
    }

    /* renamed from: c */
    public void mo39334c() {
        this.f9711a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9711a = null;
        this.f9712b = null;
        this.f9713c = null;
        mo39336d(false);
        this.f9714d = 0;
    }

    /* renamed from: d */
    public boolean mo39337d() {
        return this.f9711a != null;
    }

    /* renamed from: e */
    public String mo39338e() {
        return this.f9712b;
    }

    /* renamed from: f */
    public void mo39339f() {
        this.f9712b = null;
    }

    /* renamed from: g */
    public boolean mo39340g() {
        return this.f9712b != null;
    }

    /* renamed from: h */
    public String mo39341h() {
        return this.f9713c;
    }

    /* renamed from: i */
    public void mo39342i() {
        this.f9713c = null;
    }

    /* renamed from: j */
    public boolean mo39343j() {
        return this.f9713c != null;
    }

    /* renamed from: k */
    public long mo39344k() {
        return this.f9714d;
    }

    /* renamed from: l */
    public void mo39345l() {
        this.f9715n = C3625q.m9603b(this.f9715n, 0);
    }

    /* renamed from: m */
    public boolean mo39346m() {
        return C3625q.m9599a(this.f9715n, 0);
    }

    /* renamed from: n */
    public void mo39347n() throws C3636z {
        if (this.f9711a == null) {
            throw new C3580at("Required field 'domain' was not present! Struct: " + toString());
        } else if (this.f9713c == null) {
            throw new C3580at("Required field 'new_id' was not present! Struct: " + toString());
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9709l.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f9711a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo39340g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f9712b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f9713c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f9714d);
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9709l.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    public enum EnumC3714e implements AbstractC3553aa {
        DOMAIN(1, DispatchConstants.DOMAIN),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");
        

        /* renamed from: e */
        public static final Map<String, EnumC3714e> f9721e = new HashMap();

        /* renamed from: f */
        public final short f9723f;

        /* renamed from: g */
        public final String f9724g;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3714e.class).iterator();
            while (it.hasNext()) {
                EnumC3714e eVar = (EnumC3714e) it.next();
                f9721e.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3714e(short s, String str) {
            this.f9723f = s;
            this.f9724g = str;
        }

        /* renamed from: a */
        public static EnumC3714e m10033a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        /* renamed from: b */
        public static EnumC3714e m10035b(int i) {
            EnumC3714e a = m10033a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9724g;
        }

        /* renamed from: a */
        public static EnumC3714e m10034a(String str) {
            return f9721e.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9723f;
        }
    }

    /* renamed from: a */
    public C3708a mo39328a(String str) {
        this.f9711a = str;
        return this;
    }

    /* renamed from: b */
    public C3708a mo39330b(String str) {
        this.f9712b = str;
        return this;
    }

    /* renamed from: c */
    public C3708a mo39333c(String str) {
        this.f9713c = str;
        return this;
    }

    /* renamed from: d */
    public void mo39336d(boolean z) {
        this.f9715n = C3625q.m9591a(this.f9715n, 0, z);
    }

    /* renamed from: a */
    public void mo39329a(boolean z) {
        if (!z) {
            this.f9711a = null;
        }
    }

    /* renamed from: b */
    public void mo39332b(boolean z) {
        if (!z) {
            this.f9712b = null;
        }
    }

    /* renamed from: c */
    public void mo39335c(boolean z) {
        if (!z) {
            this.f9713c = null;
        }
    }

    public C3708a(String str, String str2, long j) {
        this();
        this.f9711a = str;
        this.f9713c = str2;
        this.f9714d = j;
        mo39336d(true);
    }

    /* renamed from: a */
    public C3708a mo39327a(long j) {
        this.f9714d = j;
        mo39336d(true);
        return this;
    }

    /* renamed from: a */
    public EnumC3714e fieldForId(int i) {
        return EnumC3714e.m10033a(i);
    }

    /* renamed from: a */
    private void m9992a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    public C3708a(C3708a aVar) {
        this.f9715n = 0;
        this.f9716o = new EnumC3714e[]{EnumC3714e.OLD_ID};
        this.f9715n = aVar.f9715n;
        if (aVar.mo39337d()) {
            this.f9711a = aVar.f9711a;
        }
        if (aVar.mo39340g()) {
            this.f9712b = aVar.f9712b;
        }
        if (aVar.mo39343j()) {
            this.f9713c = aVar.f9713c;
        }
        this.f9714d = aVar.f9714d;
    }

    /* renamed from: a */
    private void m9991a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9715n = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }
}
