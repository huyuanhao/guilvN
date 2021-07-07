package com.umeng.commonsdk.proguard;

import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.proguard.p */
public class C3618p implements AbstractC3628t<C3618p, EnumC3624e>, Serializable, Cloneable {

    /* renamed from: A */
    public static final int f9398A = 2;

    /* renamed from: B */
    public static final int f9399B = 3;

    /* renamed from: k */
    public static final Map<EnumC3624e, C3563af> f9400k;

    /* renamed from: l */
    public static final long f9401l = 420342210744516016L;

    /* renamed from: m */
    public static final C3584ax f9402m = new C3584ax("UMEnvelope");

    /* renamed from: n */
    public static final C3574an f9403n = new C3574an("version", (byte) 11, 1);

    /* renamed from: o */
    public static final C3574an f9404o = new C3574an("address", (byte) 11, 2);

    /* renamed from: p */
    public static final C3574an f9405p = new C3574an("signature", (byte) 11, 3);

    /* renamed from: q */
    public static final C3574an f9406q = new C3574an("serial_num", (byte) 8, 4);

    /* renamed from: r */
    public static final C3574an f9407r = new C3574an("ts_secs", (byte) 8, 5);

    /* renamed from: s */
    public static final C3574an f9408s = new C3574an("length", (byte) 8, 6);

    /* renamed from: t */
    public static final C3574an f9409t = new C3574an("entity", (byte) 11, 7);

    /* renamed from: u */
    public static final C3574an f9410u = new C3574an("guid", (byte) 11, 8);

    /* renamed from: v */
    public static final C3574an f9411v = new C3574an("checksum", (byte) 11, 9);

    /* renamed from: w */
    public static final C3574an f9412w = new C3574an("codex", (byte) 8, 10);

    /* renamed from: x */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9413x;

    /* renamed from: y */
    public static final int f9414y = 0;

    /* renamed from: z */
    public static final int f9415z = 1;

    /* renamed from: C */
    public byte f9416C;

    /* renamed from: D */
    public EnumC3624e[] f9417D;

    /* renamed from: a */
    public String f9418a;

    /* renamed from: b */
    public String f9419b;

    /* renamed from: c */
    public String f9420c;

    /* renamed from: d */
    public int f9421d;

    /* renamed from: e */
    public int f9422e;

    /* renamed from: f */
    public int f9423f;

    /* renamed from: g */
    public ByteBuffer f9424g;

    /* renamed from: h */
    public String f9425h;

    /* renamed from: i */
    public String f9426i;

    /* renamed from: j */
    public int f9427j;

    /* renamed from: com.umeng.commonsdk.proguard.p$a */
    public static class C3620a extends AbstractC3593bc<C3618p> {
        public C3620a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3618p pVar) throws C3636z {
            asVar.mo38933j();
            while (true) {
                C3574an l = asVar.mo38935l();
                byte b = l.f9230b;
                if (b == 0) {
                    asVar.mo38934k();
                    if (!pVar.mo39039m()) {
                        throw new C3580at("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    } else if (!pVar.mo39042p()) {
                        throw new C3580at("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    } else if (pVar.mo39045s()) {
                        pVar.mo39002G();
                        return;
                    } else {
                        throw new C3580at("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                } else {
                    switch (l.f9231c) {
                        case 1:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9418a = asVar.mo38949z();
                                pVar.mo39008a(true);
                                break;
                            }
                        case 2:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9419b = asVar.mo38949z();
                                pVar.mo39012b(true);
                                break;
                            }
                        case 3:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9420c = asVar.mo38949z();
                                pVar.mo39016c(true);
                                break;
                            }
                        case 4:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9421d = asVar.mo38946w();
                                pVar.mo39019d(true);
                                break;
                            }
                        case 5:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9422e = asVar.mo38946w();
                                pVar.mo39025e(true);
                                break;
                            }
                        case 6:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9423f = asVar.mo38946w();
                                pVar.mo39027f(true);
                                break;
                            }
                        case 7:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9424g = asVar.mo38906A();
                                pVar.mo39029g(true);
                                break;
                            }
                        case 8:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9425h = asVar.mo38949z();
                                pVar.mo39032h(true);
                                break;
                            }
                        case 9:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9426i = asVar.mo38949z();
                                pVar.mo39034i(true);
                                break;
                            }
                        case 10:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                pVar.f9427j = asVar.mo38946w();
                                pVar.mo39035j(true);
                                break;
                            }
                        default:
                            C3582av.m9431a(asVar, b);
                            break;
                    }
                    asVar.mo38936m();
                }
            }
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, C3618p pVar) throws C3636z {
            pVar.mo39002G();
            asVar.mo38917a(C3618p.f9402m);
            if (pVar.f9418a != null) {
                asVar.mo38912a(C3618p.f9403n);
                asVar.mo38918a(pVar.f9418a);
                asVar.mo38924c();
            }
            if (pVar.f9419b != null) {
                asVar.mo38912a(C3618p.f9404o);
                asVar.mo38918a(pVar.f9419b);
                asVar.mo38924c();
            }
            if (pVar.f9420c != null) {
                asVar.mo38912a(C3618p.f9405p);
                asVar.mo38918a(pVar.f9420c);
                asVar.mo38924c();
            }
            asVar.mo38912a(C3618p.f9406q);
            asVar.mo38910a(pVar.f9421d);
            asVar.mo38924c();
            asVar.mo38912a(C3618p.f9407r);
            asVar.mo38910a(pVar.f9422e);
            asVar.mo38924c();
            asVar.mo38912a(C3618p.f9408s);
            asVar.mo38910a(pVar.f9423f);
            asVar.mo38924c();
            if (pVar.f9424g != null) {
                asVar.mo38912a(C3618p.f9409t);
                asVar.mo38919a(pVar.f9424g);
                asVar.mo38924c();
            }
            if (pVar.f9425h != null) {
                asVar.mo38912a(C3618p.f9410u);
                asVar.mo38918a(pVar.f9425h);
                asVar.mo38924c();
            }
            if (pVar.f9426i != null) {
                asVar.mo38912a(C3618p.f9411v);
                asVar.mo38918a(pVar.f9426i);
                asVar.mo38924c();
            }
            if (pVar.mo39001F()) {
                asVar.mo38912a(C3618p.f9412w);
                asVar.mo38910a(pVar.f9427j);
                asVar.mo38924c();
            }
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.p$b */
    public static class C3621b implements AbstractC3592bb {
        public C3621b() {
        }

        /* renamed from: a */
        public C3620a mo38897b() {
            return new C3620a();
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.p$c */
    public static class C3622c extends AbstractC3594bd<C3618p> {
        public C3622c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3618p pVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38918a(pVar.f9418a);
            ayVar.mo38918a(pVar.f9419b);
            ayVar.mo38918a(pVar.f9420c);
            ayVar.mo38910a(pVar.f9421d);
            ayVar.mo38910a(pVar.f9422e);
            ayVar.mo38910a(pVar.f9423f);
            ayVar.mo38919a(pVar.f9424g);
            ayVar.mo38918a(pVar.f9425h);
            ayVar.mo38918a(pVar.f9426i);
            BitSet bitSet = new BitSet();
            if (pVar.mo39001F()) {
                bitSet.set(0);
            }
            ayVar.mo38961a(bitSet, 1);
            if (pVar.mo39001F()) {
                ayVar.mo38910a(pVar.f9427j);
            }
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3618p pVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            pVar.f9418a = ayVar.mo38949z();
            pVar.mo39008a(true);
            pVar.f9419b = ayVar.mo38949z();
            pVar.mo39012b(true);
            pVar.f9420c = ayVar.mo38949z();
            pVar.mo39016c(true);
            pVar.f9421d = ayVar.mo38946w();
            pVar.mo39019d(true);
            pVar.f9422e = ayVar.mo38946w();
            pVar.mo39025e(true);
            pVar.f9423f = ayVar.mo38946w();
            pVar.mo39027f(true);
            pVar.f9424g = ayVar.mo38906A();
            pVar.mo39029g(true);
            pVar.f9425h = ayVar.mo38949z();
            pVar.mo39032h(true);
            pVar.f9426i = ayVar.mo38949z();
            pVar.mo39034i(true);
            if (ayVar.mo38962b(1).get(0)) {
                pVar.f9427j = ayVar.mo38946w();
                pVar.mo39035j(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.p$d */
    public static class C3623d implements AbstractC3592bb {
        public C3623d() {
        }

        /* renamed from: a */
        public C3622c mo38897b() {
            return new C3622c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9413x = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3621b());
        f9413x.put(AbstractC3594bd.class, new C3623d());
        EnumMap enumMap = new EnumMap(EnumC3624e.class);
        enumMap.put((Object) EnumC3624e.VERSION, (Object) new C3563af("version", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3624e.ADDRESS, (Object) new C3563af("address", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3624e.SIGNATURE, (Object) new C3563af("signature", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3624e.SERIAL_NUM, (Object) new C3563af("serial_num", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3624e.TS_SECS, (Object) new C3563af("ts_secs", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3624e.LENGTH, (Object) new C3563af("length", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3624e.ENTITY, (Object) new C3563af("entity", (byte) 1, new C3564ag((byte) 11, true)));
        enumMap.put((Object) EnumC3624e.GUID, (Object) new C3563af("guid", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3624e.CHECKSUM, (Object) new C3563af("checksum", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3624e.CODEX, (Object) new C3563af("codex", (byte) 2, new C3564ag((byte) 8)));
        Map<EnumC3624e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9400k = unmodifiableMap;
        C3563af.m9266a(C3618p.class, unmodifiableMap);
    }

    public C3618p() {
        this.f9416C = 0;
        this.f9417D = new EnumC3624e[]{EnumC3624e.CODEX};
    }

    /* renamed from: A */
    public String mo38996A() {
        return this.f9426i;
    }

    /* renamed from: B */
    public void mo38997B() {
        this.f9426i = null;
    }

    /* renamed from: C */
    public boolean mo38998C() {
        return this.f9426i != null;
    }

    /* renamed from: D */
    public int mo38999D() {
        return this.f9427j;
    }

    /* renamed from: E */
    public void mo39000E() {
        this.f9416C = C3625q.m9603b(this.f9416C, 3);
    }

    /* renamed from: F */
    public boolean mo39001F() {
        return C3625q.m9599a(this.f9416C, 3);
    }

    /* renamed from: G */
    public void mo39002G() throws C3636z {
        if (this.f9418a == null) {
            throw new C3580at("Required field 'version' was not present! Struct: " + toString());
        } else if (this.f9419b == null) {
            throw new C3580at("Required field 'address' was not present! Struct: " + toString());
        } else if (this.f9420c == null) {
            throw new C3580at("Required field 'signature' was not present! Struct: " + toString());
        } else if (this.f9424g == null) {
            throw new C3580at("Required field 'entity' was not present! Struct: " + toString());
        } else if (this.f9425h == null) {
            throw new C3580at("Required field 'guid' was not present! Struct: " + toString());
        } else if (this.f9426i == null) {
            throw new C3580at("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public C3618p deepCopy() {
        return new C3618p(this);
    }

    /* renamed from: b */
    public String mo39011b() {
        return this.f9418a;
    }

    /* renamed from: c */
    public void mo39015c() {
        this.f9418a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9418a = null;
        this.f9419b = null;
        this.f9420c = null;
        mo39019d(false);
        this.f9421d = 0;
        mo39025e(false);
        this.f9422e = 0;
        mo39027f(false);
        this.f9423f = 0;
        this.f9424g = null;
        this.f9425h = null;
        this.f9426i = null;
        mo39035j(false);
        this.f9427j = 0;
    }

    /* renamed from: d */
    public boolean mo39020d() {
        return this.f9418a != null;
    }

    /* renamed from: e */
    public String mo39024e() {
        return this.f9419b;
    }

    /* renamed from: f */
    public void mo39026f() {
        this.f9419b = null;
    }

    /* renamed from: g */
    public boolean mo39030g() {
        return this.f9419b != null;
    }

    /* renamed from: h */
    public String mo39031h() {
        return this.f9420c;
    }

    /* renamed from: i */
    public void mo39033i() {
        this.f9420c = null;
    }

    /* renamed from: j */
    public boolean mo39036j() {
        return this.f9420c != null;
    }

    /* renamed from: k */
    public int mo39037k() {
        return this.f9421d;
    }

    /* renamed from: l */
    public void mo39038l() {
        this.f9416C = C3625q.m9603b(this.f9416C, 0);
    }

    /* renamed from: m */
    public boolean mo39039m() {
        return C3625q.m9599a(this.f9416C, 0);
    }

    /* renamed from: n */
    public int mo39040n() {
        return this.f9422e;
    }

    /* renamed from: o */
    public void mo39041o() {
        this.f9416C = C3625q.m9603b(this.f9416C, 1);
    }

    /* renamed from: p */
    public boolean mo39042p() {
        return C3625q.m9599a(this.f9416C, 1);
    }

    /* renamed from: q */
    public int mo39043q() {
        return this.f9423f;
    }

    /* renamed from: r */
    public void mo39044r() {
        this.f9416C = C3625q.m9603b(this.f9416C, 2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9413x.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    /* renamed from: s */
    public boolean mo39045s() {
        return C3625q.m9599a(this.f9416C, 2);
    }

    /* renamed from: t */
    public byte[] mo39046t() {
        mo39006a(C3629u.m9634c(this.f9424g));
        ByteBuffer byteBuffer = this.f9424g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f9418a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f9419b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f9420c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f9421d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f9422e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f9423f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f9424g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C3629u.m9630a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f9425h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f9426i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (mo39001F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f9427j);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    /* renamed from: u */
    public ByteBuffer mo39048u() {
        return this.f9424g;
    }

    /* renamed from: v */
    public void mo39049v() {
        this.f9424g = null;
    }

    /* renamed from: w */
    public boolean mo39050w() {
        return this.f9424g != null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9413x.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: x */
    public String mo39051x() {
        return this.f9425h;
    }

    /* renamed from: y */
    public void mo39052y() {
        this.f9425h = null;
    }

    /* renamed from: z */
    public boolean mo39053z() {
        return this.f9425h != null;
    }

    /* renamed from: com.umeng.commonsdk.proguard.p$e */
    public enum EnumC3624e implements AbstractC3553aa {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");
        

        /* renamed from: k */
        public static final Map<String, EnumC3624e> f9438k = new HashMap();

        /* renamed from: l */
        public final short f9440l;

        /* renamed from: m */
        public final String f9441m;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3624e.class).iterator();
            while (it.hasNext()) {
                EnumC3624e eVar = (EnumC3624e) it.next();
                f9438k.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3624e(short s, String str) {
            this.f9440l = s;
            this.f9441m = str;
        }

        /* renamed from: a */
        public static EnumC3624e m9586a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static EnumC3624e m9588b(int i) {
            EnumC3624e a = m9586a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9441m;
        }

        /* renamed from: a */
        public static EnumC3624e m9587a(String str) {
            return f9438k.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9440l;
        }
    }

    /* renamed from: a */
    public C3618p mo39005a(String str) {
        this.f9418a = str;
        return this;
    }

    /* renamed from: b */
    public C3618p mo39010b(String str) {
        this.f9419b = str;
        return this;
    }

    /* renamed from: c */
    public C3618p mo39014c(String str) {
        this.f9420c = str;
        return this;
    }

    /* renamed from: d */
    public void mo39019d(boolean z) {
        this.f9416C = C3625q.m9591a(this.f9416C, 0, z);
    }

    /* renamed from: e */
    public void mo39025e(boolean z) {
        this.f9416C = C3625q.m9591a(this.f9416C, 1, z);
    }

    /* renamed from: f */
    public void mo39027f(boolean z) {
        this.f9416C = C3625q.m9591a(this.f9416C, 2, z);
    }

    /* renamed from: g */
    public void mo39029g(boolean z) {
        if (!z) {
            this.f9424g = null;
        }
    }

    /* renamed from: h */
    public void mo39032h(boolean z) {
        if (!z) {
            this.f9425h = null;
        }
    }

    /* renamed from: i */
    public void mo39034i(boolean z) {
        if (!z) {
            this.f9426i = null;
        }
    }

    /* renamed from: j */
    public void mo39035j(boolean z) {
        this.f9416C = C3625q.m9591a(this.f9416C, 3, z);
    }

    /* renamed from: a */
    public void mo39008a(boolean z) {
        if (!z) {
            this.f9418a = null;
        }
    }

    /* renamed from: b */
    public void mo39012b(boolean z) {
        if (!z) {
            this.f9419b = null;
        }
    }

    /* renamed from: c */
    public void mo39016c(boolean z) {
        if (!z) {
            this.f9420c = null;
        }
    }

    /* renamed from: d */
    public C3618p mo39018d(String str) {
        this.f9425h = str;
        return this;
    }

    /* renamed from: e */
    public C3618p mo39023e(String str) {
        this.f9426i = str;
        return this;
    }

    public C3618p(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f9418a = str;
        this.f9419b = str2;
        this.f9420c = str3;
        this.f9421d = i;
        mo39019d(true);
        this.f9422e = i2;
        mo39025e(true);
        this.f9423f = i3;
        mo39027f(true);
        this.f9424g = byteBuffer;
        this.f9425h = str4;
        this.f9426i = str5;
    }

    /* renamed from: a */
    public C3618p mo39004a(int i) {
        this.f9421d = i;
        mo39019d(true);
        return this;
    }

    /* renamed from: b */
    public C3618p mo39009b(int i) {
        this.f9422e = i;
        mo39025e(true);
        return this;
    }

    /* renamed from: c */
    public C3618p mo39013c(int i) {
        this.f9423f = i;
        mo39027f(true);
        return this;
    }

    /* renamed from: d */
    public C3618p mo39017d(int i) {
        this.f9427j = i;
        mo39035j(true);
        return this;
    }

    /* renamed from: e */
    public EnumC3624e fieldForId(int i) {
        return EnumC3624e.m9586a(i);
    }

    /* renamed from: a */
    public C3618p mo39007a(byte[] bArr) {
        mo39006a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public C3618p mo39006a(ByteBuffer byteBuffer) {
        this.f9424g = byteBuffer;
        return this;
    }

    /* renamed from: a */
    private void m9518a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m9517a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9416C = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    public C3618p(C3618p pVar) {
        this.f9416C = 0;
        this.f9417D = new EnumC3624e[]{EnumC3624e.CODEX};
        this.f9416C = pVar.f9416C;
        if (pVar.mo39020d()) {
            this.f9418a = pVar.f9418a;
        }
        if (pVar.mo39030g()) {
            this.f9419b = pVar.f9419b;
        }
        if (pVar.mo39036j()) {
            this.f9420c = pVar.f9420c;
        }
        this.f9421d = pVar.f9421d;
        this.f9422e = pVar.f9422e;
        this.f9423f = pVar.f9423f;
        if (pVar.mo39050w()) {
            this.f9424g = C3629u.m9635d(pVar.f9424g);
        }
        if (pVar.mo39053z()) {
            this.f9425h = pVar.f9425h;
        }
        if (pVar.mo38998C()) {
            this.f9426i = pVar.f9426i;
        }
        this.f9427j = pVar.f9427j;
    }
}
