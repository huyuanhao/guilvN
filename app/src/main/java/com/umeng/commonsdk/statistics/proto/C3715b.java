package com.umeng.commonsdk.statistics.proto;

import com.facebook.react.animated.InterpolationAnimatedNode;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.b */
public class C3715b implements AbstractC3628t<C3715b, EnumC3721e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<EnumC3721e, C3563af> f9725d;

    /* renamed from: e */
    public static final long f9726e = -6496538196005191531L;

    /* renamed from: f */
    public static final C3584ax f9727f = new C3584ax("IdSnapshot");

    /* renamed from: g */
    public static final C3574an f9728g = new C3574an(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, (byte) 11, 1);

    /* renamed from: h */
    public static final C3574an f9729h = new C3574an("ts", (byte) 10, 2);

    /* renamed from: i */
    public static final C3574an f9730i = new C3574an("version", (byte) 8, 3);

    /* renamed from: j */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9731j;

    /* renamed from: k */
    public static final int f9732k = 0;

    /* renamed from: l */
    public static final int f9733l = 1;

    /* renamed from: a */
    public String f9734a;

    /* renamed from: b */
    public long f9735b;

    /* renamed from: c */
    public int f9736c;

    /* renamed from: m */
    public byte f9737m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    public static class C3717a extends AbstractC3593bc<C3715b> {
        public C3717a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3715b bVar) throws C3636z {
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
                        } else if (b == 8) {
                            bVar.f9736c = asVar.mo38946w();
                            bVar.mo39364c(true);
                        } else {
                            C3582av.m9431a(asVar, b);
                        }
                    } else if (b == 10) {
                        bVar.f9735b = asVar.mo38947x();
                        bVar.mo39362b(true);
                    } else {
                        C3582av.m9431a(asVar, b);
                    }
                } else if (b == 11) {
                    bVar.f9734a = asVar.mo38949z();
                    bVar.mo39359a(true);
                } else {
                    C3582av.m9431a(asVar, b);
                }
                asVar.mo38936m();
            }
            asVar.mo38934k();
            if (!bVar.mo39368g()) {
                throw new C3580at("Required field 'ts' was not found in serialized data! Struct: " + toString());
            } else if (bVar.mo39371j()) {
                bVar.mo39372k();
            } else {
                throw new C3580at("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, C3715b bVar) throws C3636z {
            bVar.mo39372k();
            asVar.mo38917a(C3715b.f9727f);
            if (bVar.f9734a != null) {
                asVar.mo38912a(C3715b.f9728g);
                asVar.mo38918a(bVar.f9734a);
                asVar.mo38924c();
            }
            asVar.mo38912a(C3715b.f9729h);
            asVar.mo38911a(bVar.f9735b);
            asVar.mo38924c();
            asVar.mo38912a(C3715b.f9730i);
            asVar.mo38910a(bVar.f9736c);
            asVar.mo38924c();
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b */
    public static class C3718b implements AbstractC3592bb {
        public C3718b() {
        }

        /* renamed from: a */
        public C3717a mo38897b() {
            return new C3717a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    public static class C3719c extends AbstractC3594bd<C3715b> {
        public C3719c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3715b bVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38918a(bVar.f9734a);
            ayVar.mo38911a(bVar.f9735b);
            ayVar.mo38910a(bVar.f9736c);
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3715b bVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            bVar.f9734a = ayVar.mo38949z();
            bVar.mo39359a(true);
            bVar.f9735b = ayVar.mo38947x();
            bVar.mo39362b(true);
            bVar.f9736c = ayVar.mo38946w();
            bVar.mo39364c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$d */
    public static class C3720d implements AbstractC3592bb {
        public C3720d() {
        }

        /* renamed from: a */
        public C3719c mo38897b() {
            return new C3719c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9731j = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3718b());
        f9731j.put(AbstractC3594bd.class, new C3720d());
        EnumMap enumMap = new EnumMap(EnumC3721e.class);
        enumMap.put((Object) EnumC3721e.IDENTITY, (Object) new C3563af(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3721e.TS, (Object) new C3563af("ts", (byte) 1, new C3564ag((byte) 10)));
        enumMap.put((Object) EnumC3721e.VERSION, (Object) new C3563af("version", (byte) 1, new C3564ag((byte) 8)));
        Map<EnumC3721e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9725d = unmodifiableMap;
        C3563af.m9266a(C3715b.class, unmodifiableMap);
    }

    public C3715b() {
        this.f9737m = 0;
    }

    /* renamed from: a */
    public C3715b deepCopy() {
        return new C3715b(this);
    }

    /* renamed from: b */
    public String mo39361b() {
        return this.f9734a;
    }

    /* renamed from: c */
    public void mo39363c() {
        this.f9734a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9734a = null;
        mo39362b(false);
        this.f9735b = 0;
        mo39364c(false);
        this.f9736c = 0;
    }

    /* renamed from: d */
    public boolean mo39365d() {
        return this.f9734a != null;
    }

    /* renamed from: e */
    public long mo39366e() {
        return this.f9735b;
    }

    /* renamed from: f */
    public void mo39367f() {
        this.f9737m = C3625q.m9603b(this.f9737m, 0);
    }

    /* renamed from: g */
    public boolean mo39368g() {
        return C3625q.m9599a(this.f9737m, 0);
    }

    /* renamed from: h */
    public int mo39369h() {
        return this.f9736c;
    }

    /* renamed from: i */
    public void mo39370i() {
        this.f9737m = C3625q.m9603b(this.f9737m, 1);
    }

    /* renamed from: j */
    public boolean mo39371j() {
        return C3625q.m9599a(this.f9737m, 1);
    }

    /* renamed from: k */
    public void mo39372k() throws C3636z {
        if (this.f9734a == null) {
            throw new C3580at("Required field 'identity' was not present! Struct: " + toString());
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9731j.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f9734a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f9735b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f9736c);
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9731j.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    public enum EnumC3721e implements AbstractC3553aa {
        IDENTITY(1, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY),
        TS(2, "ts"),
        VERSION(3, "version");
        

        /* renamed from: d */
        public static final Map<String, EnumC3721e> f9741d = new HashMap();

        /* renamed from: e */
        public final short f9743e;

        /* renamed from: f */
        public final String f9744f;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3721e.class).iterator();
            while (it.hasNext()) {
                EnumC3721e eVar = (EnumC3721e) it.next();
                f9741d.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3721e(short s, String str) {
            this.f9743e = s;
            this.f9744f = str;
        }

        /* renamed from: a */
        public static EnumC3721e m10074a(int i) {
            if (i == 1) {
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
        }

        /* renamed from: b */
        public static EnumC3721e m10076b(int i) {
            EnumC3721e a = m10074a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9744f;
        }

        /* renamed from: a */
        public static EnumC3721e m10075a(String str) {
            return f9741d.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9743e;
        }
    }

    /* renamed from: a */
    public C3715b mo39358a(String str) {
        this.f9734a = str;
        return this;
    }

    /* renamed from: b */
    public void mo39362b(boolean z) {
        this.f9737m = C3625q.m9591a(this.f9737m, 0, z);
    }

    /* renamed from: c */
    public void mo39364c(boolean z) {
        this.f9737m = C3625q.m9591a(this.f9737m, 1, z);
    }

    public C3715b(String str, long j, int i) {
        this();
        this.f9734a = str;
        this.f9735b = j;
        mo39362b(true);
        this.f9736c = i;
        mo39364c(true);
    }

    /* renamed from: a */
    public void mo39359a(boolean z) {
        if (!z) {
            this.f9734a = null;
        }
    }

    /* renamed from: b */
    public EnumC3721e fieldForId(int i) {
        return EnumC3721e.m10074a(i);
    }

    /* renamed from: a */
    public C3715b mo39357a(long j) {
        this.f9735b = j;
        mo39362b(true);
        return this;
    }

    /* renamed from: a */
    public C3715b mo39356a(int i) {
        this.f9736c = i;
        mo39364c(true);
        return this;
    }

    /* renamed from: a */
    private void m10039a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    public C3715b(C3715b bVar) {
        this.f9737m = 0;
        this.f9737m = bVar.f9737m;
        if (bVar.mo39365d()) {
            this.f9734a = bVar.f9734a;
        }
        this.f9735b = bVar.f9735b;
        this.f9736c = bVar.f9736c;
    }

    /* renamed from: a */
    private void m10038a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9737m = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }
}
