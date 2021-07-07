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
import com.umeng.commonsdk.proguard.C3568ak;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3574an;
import com.umeng.commonsdk.proguard.C3580at;
import com.umeng.commonsdk.proguard.C3582av;
import com.umeng.commonsdk.proguard.C3584ax;
import com.umeng.commonsdk.proguard.C3585ay;
import com.umeng.commonsdk.proguard.C3595be;
import com.umeng.commonsdk.proguard.C3617o;
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

public class Response implements AbstractC3628t<Response, EnumC3707e>, Serializable, Cloneable {
    public static final C3574an IMPRINT_FIELD_DESC = new C3574an(C3617o.f9334U, (byte) 12, 3);
    public static final C3574an MSG_FIELD_DESC = new C3574an("msg", (byte) 11, 2);
    public static final C3574an RESP_CODE_FIELD_DESC = new C3574an("resp_code", (byte) 8, 1);
    public static final C3584ax STRUCT_DESC = new C3584ax("Response");
    public static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<EnumC3707e, C3563af> metaDataMap;
    public static final Map<Class<? extends AbstractC3591ba>, AbstractC3592bb> schemes;
    public static final long serialVersionUID = -4549277923241195391L;
    public byte __isset_bitfield;
    public C3729d imprint;
    public String msg;
    public EnumC3707e[] optionals;
    public int resp_code;

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    public static class C3703a extends AbstractC3593bc<Response> {
        public C3703a() {
        }

        /* renamed from: a */
        public void mo38895b(AbstractC3579as asVar, Response response) throws C3636z {
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
                        } else if (b == 12) {
                            C3729d dVar = new C3729d();
                            response.imprint = dVar;
                            dVar.read(asVar);
                            response.setImprintIsSet(true);
                        } else {
                            C3582av.m9431a(asVar, b);
                        }
                    } else if (b == 11) {
                        response.msg = asVar.mo38949z();
                        response.setMsgIsSet(true);
                    } else {
                        C3582av.m9431a(asVar, b);
                    }
                } else if (b == 8) {
                    response.resp_code = asVar.mo38946w();
                    response.setResp_codeIsSet(true);
                } else {
                    C3582av.m9431a(asVar, b);
                }
                asVar.mo38936m();
            }
            asVar.mo38934k();
            if (response.isSetResp_code()) {
                response.validate();
                return;
            }
            throw new C3580at("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
        }

        /* renamed from: b */
        public void mo38893a(AbstractC3579as asVar, Response response) throws C3636z {
            response.validate();
            asVar.mo38917a(Response.STRUCT_DESC);
            asVar.mo38912a(Response.RESP_CODE_FIELD_DESC);
            asVar.mo38910a(response.resp_code);
            asVar.mo38924c();
            if (response.msg != null && response.isSetMsg()) {
                asVar.mo38912a(Response.MSG_FIELD_DESC);
                asVar.mo38918a(response.msg);
                asVar.mo38924c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                asVar.mo38912a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(asVar);
                asVar.mo38924c();
            }
            asVar.mo38926d();
            asVar.mo38923b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    public static class C3704b implements AbstractC3592bb {
        public C3704b() {
        }

        /* renamed from: a */
        public C3703a mo38897b() {
            return new C3703a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    public static class C3705c extends AbstractC3594bd<Response> {
        public C3705c() {
        }

        /* renamed from: a */
        public void mo38893a(AbstractC3579as asVar, Response response) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            ayVar.mo38910a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            ayVar.mo38961a(bitSet, 2);
            if (response.isSetMsg()) {
                ayVar.mo38918a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(ayVar);
            }
        }

        /* renamed from: b */
        public void mo38895b(AbstractC3579as asVar, Response response) throws C3636z {
            C3585ay ayVar = (C3585ay) asVar;
            response.resp_code = ayVar.mo38946w();
            response.setResp_codeIsSet(true);
            BitSet b = ayVar.mo38962b(2);
            if (b.get(0)) {
                response.msg = ayVar.mo38949z();
                response.setMsgIsSet(true);
            }
            if (b.get(1)) {
                C3729d dVar = new C3729d();
                response.imprint = dVar;
                dVar.read(ayVar);
                response.setImprintIsSet(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    public static class C3706d implements AbstractC3592bb {
        public C3706d() {
        }

        /* renamed from: a */
        public C3705c mo38897b() {
            return new C3705c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(AbstractC3593bc.class, new C3704b());
        schemes.put(AbstractC3594bd.class, new C3706d());
        EnumMap enumMap = new EnumMap(EnumC3707e.class);
        enumMap.put((Object) EnumC3707e.RESP_CODE, (Object) new C3563af("resp_code", (byte) 1, new C3564ag((byte) 8)));
        enumMap.put((Object) EnumC3707e.MSG, (Object) new C3563af("msg", (byte) 2, new C3564ag((byte) 11)));
        enumMap.put((Object) EnumC3707e.IMPRINT, (Object) new C3563af(C3617o.f9334U, (byte) 2, new C3568ak((byte) 12, C3729d.class)));
        Map<EnumC3707e, C3563af> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        C3563af.m9266a(Response.class, unmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = 0;
        this.optionals = new EnumC3707e[]{EnumC3707e.MSG, EnumC3707e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            read(new C3571am(new C3595be(objectInputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3571am(new C3595be(objectOutputStream)));
        } catch (C3636z e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public C3729d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return C3625q.m9599a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void read(AbstractC3579as asVar) throws C3636z {
        schemes.get(asVar.mo38959D()).mo38897b().mo38895b(asVar, this);
    }

    public Response setImprint(C3729d dVar) {
        this.imprint = dVar;
        return this;
    }

    public void setImprintIsSet(boolean z) {
        if (!z) {
            this.imprint = null;
        }
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z) {
        if (!z) {
            this.msg = null;
        }
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = C3625q.m9591a(this.__isset_bitfield, 0, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            C3729d dVar = this.imprint;
            if (dVar == null) {
                sb.append("null");
            } else {
                sb.append(dVar);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = C3625q.m9603b(this.__isset_bitfield, 0);
    }

    public void validate() throws C3636z {
        C3729d dVar = this.imprint;
        if (dVar != null) {
            dVar.mo39429l();
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public void write(AbstractC3579as asVar) throws C3636z {
        schemes.get(asVar.mo38959D()).mo38897b().mo38893a(asVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum EnumC3707e implements AbstractC3553aa {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, C3617o.f9334U);
        

        /* renamed from: d */
        public static final Map<String, EnumC3707e> f9698d = new HashMap();

        /* renamed from: e */
        public final short f9700e;

        /* renamed from: f */
        public final String f9701f;

        /* access modifiers changed from: public */
        static {
            Iterator it = EnumSet.allOf(EnumC3707e.class).iterator();
            while (it.hasNext()) {
                EnumC3707e eVar = (EnumC3707e) it.next();
                f9698d.put(eVar.mo38867b(), eVar);
            }
        }

        /* access modifiers changed from: public */
        EnumC3707e(short s, String str) {
            this.f9700e = s;
            this.f9701f = str;
        }

        /* renamed from: a */
        public static EnumC3707e m9986a(int i) {
            if (i == 1) {
                return RESP_CODE;
            }
            if (i == 2) {
                return MSG;
            }
            if (i != 3) {
                return null;
            }
            return IMPRINT;
        }

        /* renamed from: b */
        public static EnumC3707e m9988b(int i) {
            EnumC3707e a = m9986a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: b */
        public String mo38867b() {
            return this.f9701f;
        }

        /* renamed from: a */
        public static EnumC3707e m9987a(String str) {
            return f9698d.get(str);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3553aa
        /* renamed from: a */
        public short mo38866a() {
            return this.f9700e;
        }
    }

    /* Return type fixed from 'com.umeng.commonsdk.statistics.proto.Response' to match base method */
    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public AbstractC3628t<Response, EnumC3707e> deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3628t
    public EnumC3707e fieldForId(int i) {
        return EnumC3707e.m9986a(i);
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = 0;
        this.optionals = new EnumC3707e[]{EnumC3707e.MSG, EnumC3707e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new C3729d(response.imprint);
        }
    }
}
