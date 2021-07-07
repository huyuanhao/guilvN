package com.umeng.commonsdk.stateless;

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
import com.umeng.commonsdk.proguard.C3629u;
import com.umeng.commonsdk.proguard.C3636z;
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

/* renamed from: com.umeng.commonsdk.stateless.b */
public class C3641b implements AbstractC3628t<C3641b, EnumC3647e>, Serializable, Cloneable {

    /* renamed from: A */
    public static final int f9480A = 2;

    /* renamed from: B */
    public static final int f9481B = 3;

    /* renamed from: k */
    public static final Map<EnumC3647e, C3563af> f9482k;

    /* renamed from: l */
    public static final long f9483l = 420342210744516016L;

    /* renamed from: m */
    public static final C3584ax f9484m = new C3584ax("UMSLEnvelope");

    /* renamed from: n */
    public static final C3574an f9485n = new C3574an("version", (byte) 11, 1);

    /* renamed from: o */
    public static final C3574an f9486o = new C3574an("address", (byte) 11, 2);

    /* renamed from: p */
    public static final C3574an f9487p = new C3574an("signature", (byte) 11, 3);

    /* renamed from: q */
    public static final C3574an f9488q = new C3574an("serial_num", (byte) 8, 4);

    /* renamed from: r */
    public static final C3574an f9489r = new C3574an("ts_secs", (byte) 8, 5);

    /* renamed from: s */
    public static final C3574an f9490s = new C3574an("length", (byte) 8, 6);

    /* renamed from: t */
    public static final C3574an f9491t = new C3574an("entity", (byte) 11, 7);

    /* renamed from: u */
    public static final C3574an f9492u = new C3574an("guid", (byte) 11, 8);

    /* renamed from: v */
    public static final C3574an f9493v = new C3574an("checksum", (byte) 11, 9);

    /* renamed from: w */
    public static final C3574an f9494w = new C3574an("codex", (byte) 8, 10);

    /* renamed from: x */
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> f9495x;

    /* renamed from: y */
    public static final int f9496y = 0;

    /* renamed from: z */
    public static final int f9497z = 1;

    /* renamed from: C */
    public byte f9498C;

    /* renamed from: D */
    public EnumC3647e[] f9499D;

    /* renamed from: a */
    public String f9500a;

    /* renamed from: b */
    public String f9501b;

    /* renamed from: c */
    public String f9502c;

    /* renamed from: d */
    public int f9503d;

    /* renamed from: e */
    public int f9504e;

    /* renamed from: f */
    public int f9505f;

    /* renamed from: g */
    public ByteBuffer f9506g;

    /* renamed from: h */
    public String f9507h;

    /* renamed from: i */
    public String f9508i;

    /* renamed from: j */
    public int f9509j;

    /* renamed from: com.umeng.commonsdk.stateless.b$a */
    public static class C3643a extends AbstractC3593bc<C3641b> {
        public C3643a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, C3641b bVar) throws C3636z {
            asVar.mo38933j();
            while (true) {
                C3574an l = asVar.mo38935l();
                byte b = l.f9230b;
                if (b == 0) {
                    asVar.mo38934k();
                    if (!bVar.mo39145m()) {
                        throw new C3580at("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    } else if (!bVar.mo39148p()) {
                        throw new C3580at("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    } else if (bVar.mo39151s()) {
                        bVar.mo39110G();
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
                                bVar.f9500a = asVar.mo38949z();
                                bVar.mo39116a(true);
                                break;
                            }
                        case 2:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9501b = asVar.mo38949z();
                                bVar.mo39120b(true);
                                break;
                            }
                        case 3:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9502c = asVar.mo38949z();
                                bVar.mo39124c(true);
                                break;
                            }
                        case 4:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9503d = asVar.mo38946w();
                                bVar.mo39127d(true);
                                break;
                            }
                        case 5:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9504e = asVar.mo38946w();
                                bVar.mo39132e(true);
                                break;
                            }
                        case 6:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9505f = asVar.mo38946w();
                                bVar.mo39134f(true);
                                break;
                            }
                        case 7:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9506g = asVar.mo38906A();
                                bVar.mo39135g(true);
                                break;
                            }
                        case 8:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9507h = asVar.mo38949z();
                                bVar.mo39138h(true);
                                break;
                            }
                        case 9:
                            if (b != 11) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9508i = asVar.mo38949z();
                                bVar.mo39140i(true);
                                break;
                            }
                        case 10:
                            if (b != 8) {
                                C3582av.m9431a(asVar, b);
                                break;
                            } else {
                                bVar.f9509j = asVar.mo38946w();
                                bVar.mo39141j(true);
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
        public void mo38893a(AbstractC3579as asVar, C3641b bVar) throws C3636z {
            bVar.mo39110G();
            asVar.mo38917a(C3641b.f9484m);
            if (bVar.f9500a != null) {
                asVar.mo38912a(C3641b.f9485n);
                asVar.mo38918a(bVar.f9500a);
                asVar.mo38924c();
            }
            if (bVar.f9501b != null) {
                asVar.mo38912a(C3641b.f9486o);
                asVar.mo38918a(bVar.f9501b);
                asVar.mo38924c();
            }
            if (bVar.f9502c != null) {
                asVar.mo38912a(C3641b.f9487p);
                asVar.mo38918a(bVar.f9502c);
                asVar.mo38924c();
            }
            asVar.mo38912a(C3641b.f9488q);
            asVar.mo38910a(bVar.f9503d);
            asVar.mo38924c();
            asVar.mo38912a(C3641b.f9489r);
            asVar.mo38910a(bVar.f9504e);
            asVar.mo38924c();
            asVar.mo38912a(C3641b.f9490s);
            asVar.mo38910a(bVar.f9505f);
            asVar.mo38924c();
            if (bVar.f9506g != null) {
                asVar.mo38912a(C3641b.f9491t);
                asVar.mo38919a(bVar.f9506g);
                asVar.mo38924c();
            }
            if (bVar.f9507h != null) {
                asVar.mo38912a(C3641b.f9492u);
                asVar.mo38918a(bVar.f9507h);
                asVar.mo38924c();
            }
            if (bVar.f9508i != null) {
                asVar.mo38912a(C3641b.f9493v);
                asVar.mo38918a(bVar.f9508i);
                asVar.mo38924c();
            }
            if (bVar.mo39109F()) {
                asVar.mo38912a(C3641b.f9494w);
                asVar.mo38910a(bVar.f9509j);
                asVar.mo38924c();
            }
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.stateless.b$b */
    public static class C3644b implements AbstractC3592bb {
        public C3644b() {
        }

        /* renamed from: a */
        public C3643a mo38897b() {
            return new C3643a();
        }
    }

    /* renamed from: com.umeng.commonsdk.stateless.b$c */
    public static class C3645c extends AbstractC3594bd<C3641b> {
        public C3645c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, C3641b bVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38918a(bVar.f9500a);
            ayVar.mo38918a(bVar.f9501b);
            ayVar.mo38918a(bVar.f9502c);
            ayVar.mo38910a(bVar.f9503d);
            ayVar.mo38910a(bVar.f9504e);
            ayVar.mo38910a(bVar.f9505f);
            ayVar.mo38919a(bVar.f9506g);
            ayVar.mo38918a(bVar.f9507h);
            ayVar.mo38918a(bVar.f9508i);
            BitSet bitSet = new BitSet();
            if (bVar.mo39109F()) {
                bitSet.set(0);
            }
            ayVar.mo38961a(bitSet, 1);
            if (bVar.mo39109F()) {
                ayVar.mo38910a(bVar.f9509j);
            }
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, C3641b bVar) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            bVar.f9500a = ayVar.mo38949z();
            bVar.mo39116a(true);
            bVar.f9501b = ayVar.mo38949z();
            bVar.mo39120b(true);
            bVar.f9502c = ayVar.mo38949z();
            bVar.mo39124c(true);
            bVar.f9503d = ayVar.mo38946w();
            bVar.mo39127d(true);
            bVar.f9504e = ayVar.mo38946w();
            bVar.mo39132e(true);
            bVar.f9505f = ayVar.mo38946w();
            bVar.mo39134f(true);
            bVar.f9506g = ayVar.mo38906A();
            bVar.mo39135g(true);
            bVar.f9507h = ayVar.mo38949z();
            bVar.mo39138h(true);
            bVar.f9508i = ayVar.mo38949z();
            bVar.mo39140i(true);
            if (ayVar.mo38962b(1).get(0)) {
                bVar.f9509j = ayVar.mo38946w();
                bVar.mo39141j(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.stateless.b$d */
    public static class C3646d implements AbstractC3592bb {
        public C3646d() {
        }

        /* renamed from: a */
        public C3645c mo38897b() {
            return new C3645c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9495x = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3644b());
        f9495x.put(AbstractC3594bd.class, new C3646d());
        EnumMap enumMap = new EnumMap(EnumC3647e.class);
        enumMap.put((Object) EnumC3647e.VERSION, (Object) new C3563af("version", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3647e.ADDRESS, (Object) new C3563af("address", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3647e.SIGNATURE, (Object) new C3563af("signature", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3647e.SERIAL_NUM, (Object) new C3563af("serial_num", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3647e.TS_SECS, (Object) new C3563af("ts_secs", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3647e.LENGTH, (Object) new C3563af("length", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3647e.ENTITY, (Object) new C3563af("entity", (byte) 1, new C3564ag((byte) 11, true)));
        enumMap.put((Object) EnumC3647e.GUID, (Object) new C3563af("guid", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3647e.CHECKSUM, (Object) new C3563af("checksum", (byte) 1, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3647e.CODEX, (Object) new C3563af("codex", (byte) 2, new C3564ag((byte) 8)));
        Map<EnumC3647e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9482k = unmodifiableMap;
        C3563af.m9266a(C3641b.class, unmodifiableMap);
    }

    public C3641b() {
        this.f9498C = 0;
        this.f9499D = new EnumC3647e[]{EnumC3647e.CODEX};
    }

    /* renamed from: A */
    public String mo39104A() {
        return this.f9508i;
    }

    /* renamed from: B */
    public void mo39105B() {
        this.f9508i = null;
    }

    /* renamed from: C */
    public boolean mo39106C() {
        return this.f9508i != null;
    }

    /* renamed from: D */
    public int mo39107D() {
        return this.f9509j;
    }

    /* renamed from: E */
    public void mo39108E() {
        this.f9498C = C3625q.m9603b(this.f9498C, 3);
    }

    /* renamed from: F */
    public boolean mo39109F() {
        return C3625q.m9599a(this.f9498C, 3);
    }

    /* renamed from: G */
    public void mo39110G() throws C3636z {
        if (this.f9500a == null) {
            throw new C3580at("Required field 'version' was not present! Struct: " + toString());
        } else if (this.f9501b == null) {
            throw new C3580at("Required field 'address' was not present! Struct: " + toString());
        } else if (this.f9502c == null) {
            throw new C3580at("Required field 'signature' was not present! Struct: " + toString());
        } else if (this.f9506g == null) {
            throw new C3580at("Required field 'entity' was not present! Struct: " + toString());
        } else if (this.f9507h == null) {
            throw new C3580at("Required field 'guid' was not present! Struct: " + toString());
        } else if (this.f9508i == null) {
            throw new C3580at("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public C3641b deepCopy() {
        return new C3641b(this);
    }

    /* renamed from: b */
    public String mo39119b() {
        return this.f9500a;
    }

    /* renamed from: c */
    public void mo39123c() {
        this.f9500a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        this.f9500a = null;
        this.f9501b = null;
        this.f9502c = null;
        mo39127d(false);
        this.f9503d = 0;
        mo39132e(false);
        this.f9504e = 0;
        mo39134f(false);
        this.f9505f = 0;
        this.f9506g = null;
        this.f9507h = null;
        this.f9508i = null;
        mo39141j(false);
        this.f9509j = 0;
    }

    /* renamed from: d */
    public boolean mo39128d() {
        return this.f9500a != null;
    }

    /* renamed from: e */
    public String mo39131e() {
        return this.f9501b;
    }

    /* renamed from: f */
    public void mo39133f() {
        this.f9501b = null;
    }

    /* renamed from: g */
    public boolean mo39136g() {
        return this.f9501b != null;
    }

    /* renamed from: h */
    public String mo39137h() {
        return this.f9502c;
    }

    /* renamed from: i */
    public void mo39139i() {
        this.f9502c = null;
    }

    /* renamed from: j */
    public boolean mo39142j() {
        return this.f9502c != null;
    }

    /* renamed from: k */
    public int mo39143k() {
        return this.f9503d;
    }

    /* renamed from: l */
    public void mo39144l() {
        this.f9498C = C3625q.m9603b(this.f9498C, 0);
    }

    /* renamed from: m */
    public boolean mo39145m() {
        return C3625q.m9599a(this.f9498C, 0);
    }

    /* renamed from: n */
    public int mo39146n() {
        return this.f9504e;
    }

    /* renamed from: o */
    public void mo39147o() {
        this.f9498C = C3625q.m9603b(this.f9498C, 1);
    }

    /* renamed from: p */
    public boolean mo39148p() {
        return C3625q.m9599a(this.f9498C, 1);
    }

    /* renamed from: q */
    public int mo39149q() {
        return this.f9505f;
    }

    /* renamed from: r */
    public void mo39150r() {
        this.f9498C = C3625q.m9603b(this.f9498C, 2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        f9495x.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    /* renamed from: s */
    public boolean mo39151s() {
        return C3625q.m9599a(this.f9498C, 2);
    }

    /* renamed from: t */
    public byte[] mo39152t() {
        mo39114a(C3629u.m9634c(this.f9506g));
        ByteBuffer byteBuffer = this.f9506g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMSLEnvelope(");
        sb.append("version:");
        String str = this.f9500a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f9501b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f9502c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f9503d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f9504e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f9505f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f9506g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C3629u.m9630a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f9507h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f9508i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (mo39109F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f9509j);
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    /* renamed from: u */
    public ByteBuffer mo39154u() {
        return this.f9506g;
    }

    /* renamed from: v */
    public void mo39155v() {
        this.f9506g = null;
    }

    /* renamed from: w */
    public boolean mo39156w() {
        return this.f9506g != null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        f9495x.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: x */
    public String mo39157x() {
        return this.f9507h;
    }

    /* renamed from: y */
    public void mo39158y() {
        this.f9507h = null;
    }

    /* renamed from: z */
    public boolean mo39159z() {
        return this.f9507h != null;
    }

    /* renamed from: com.umeng.commonsdk.stateless.b$e */
    public enum EnumC3647e implements AbstractC3553aa {
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
        public static final Map<String, EnumC3647e> f9520k = new HashMap();

        /* renamed from: l */
        public final short f9522l;

        /* renamed from: m */
        public final String f9523m;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3647e.class).iterator();
            while (it.hasNext()) {
                EnumC3647e eVar = (EnumC3647e) it.next();
                f9520k.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3647e(short s, String str) {
            this.f9522l = s;
            this.f9523m = str;
        }

        /* renamed from: a */
        public static EnumC3647e m9735a(int i) {
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
        public static EnumC3647e m9737b(int i) {
            EnumC3647e a = m9735a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9523m;
        }

        /* renamed from: a */
        public static EnumC3647e m9736a(String str) {
            return f9520k.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9522l;
        }
    }

    /* renamed from: a */
    public C3641b mo39113a(String str) {
        this.f9500a = str;
        return this;
    }

    /* renamed from: b */
    public C3641b mo39118b(String str) {
        this.f9501b = str;
        return this;
    }

    /* renamed from: c */
    public C3641b mo39122c(String str) {
        this.f9502c = str;
        return this;
    }

    /* renamed from: d */
    public void mo39127d(boolean z) {
        this.f9498C = C3625q.m9591a(this.f9498C, 0, z);
    }

    /* renamed from: e */
    public void mo39132e(boolean z) {
        this.f9498C = C3625q.m9591a(this.f9498C, 1, z);
    }

    /* renamed from: f */
    public void mo39134f(boolean z) {
        this.f9498C = C3625q.m9591a(this.f9498C, 2, z);
    }

    /* renamed from: g */
    public void mo39135g(boolean z) {
        if (!z) {
            this.f9506g = null;
        }
    }

    /* renamed from: h */
    public void mo39138h(boolean z) {
        if (!z) {
            this.f9507h = null;
        }
    }

    /* renamed from: i */
    public void mo39140i(boolean z) {
        if (!z) {
            this.f9508i = null;
        }
    }

    /* renamed from: j */
    public void mo39141j(boolean z) {
        this.f9498C = C3625q.m9591a(this.f9498C, 3, z);
    }

    /* renamed from: a */
    public void mo39116a(boolean z) {
        if (!z) {
            this.f9500a = null;
        }
    }

    /* renamed from: b */
    public void mo39120b(boolean z) {
        if (!z) {
            this.f9501b = null;
        }
    }

    /* renamed from: c */
    public void mo39124c(boolean z) {
        if (!z) {
            this.f9502c = null;
        }
    }

    /* renamed from: d */
    public C3641b mo39126d(String str) {
        this.f9507h = str;
        return this;
    }

    /* renamed from: e */
    public C3641b mo39130e(String str) {
        this.f9508i = str;
        return this;
    }

    public C3641b(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f9500a = str;
        this.f9501b = str2;
        this.f9502c = str3;
        this.f9503d = i;
        mo39127d(true);
        this.f9504e = i2;
        mo39132e(true);
        this.f9505f = i3;
        mo39134f(true);
        this.f9506g = byteBuffer;
        this.f9507h = str4;
        this.f9508i = str5;
    }

    /* renamed from: a */
    public C3641b mo39112a(int i) {
        this.f9503d = i;
        mo39127d(true);
        return this;
    }

    /* renamed from: b */
    public C3641b mo39117b(int i) {
        this.f9504e = i;
        mo39132e(true);
        return this;
    }

    /* renamed from: c */
    public C3641b mo39121c(int i) {
        this.f9505f = i;
        mo39134f(true);
        return this;
    }

    /* renamed from: d */
    public C3641b mo39125d(int i) {
        this.f9509j = i;
        mo39141j(true);
        return this;
    }

    /* renamed from: e */
    public EnumC3647e fieldForId(int i) {
        return EnumC3647e.m9735a(i);
    }

    /* renamed from: a */
    public C3641b mo39115a(byte[] bArr) {
        mo39114a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public C3641b mo39114a(ByteBuffer byteBuffer) {
        this.f9506g = byteBuffer;
        return this;
    }

    /* renamed from: a */
    private void m9667a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m9666a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9498C = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    public C3641b(C3641b bVar) {
        this.f9498C = 0;
        this.f9499D = new EnumC3647e[]{EnumC3647e.CODEX};
        this.f9498C = bVar.f9498C;
        if (bVar.mo39128d()) {
            this.f9500a = bVar.f9500a;
        }
        if (bVar.mo39136g()) {
            this.f9501b = bVar.f9501b;
        }
        if (bVar.mo39142j()) {
            this.f9502c = bVar.f9502c;
        }
        this.f9503d = bVar.f9503d;
        this.f9504e = bVar.f9504e;
        this.f9505f = bVar.f9505f;
        if (bVar.mo39156w()) {
            this.f9506g = C3629u.m9635d(bVar.f9506g);
        }
        if (bVar.mo39159z()) {
            this.f9507h = bVar.f9507h;
        }
        if (bVar.mo39106C()) {
            this.f9508i = bVar.f9508i;
        }
        this.f9509j = bVar.f9509j;
    }
}
