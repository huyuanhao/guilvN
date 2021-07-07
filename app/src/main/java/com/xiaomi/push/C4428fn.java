package com.xiaomi.push;

import android.text.TextUtils;
import com.p118pd.sdk.C7402o0OOOOoo;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.service.C4628av;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.fn */
public class C4428fn {

    /* renamed from: a */
    public static long f11927a = 0;

    /* renamed from: a */
    public static final byte[] f11928a = new byte[0];

    /* renamed from: b */
    public static String f11929b = (C4470gw.m12830a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    public C4387em.C4388a f11930a;

    /* renamed from: a */
    public String f11931a;

    /* renamed from: a */
    public short f11932a;

    /* renamed from: b */
    public byte[] f11933b;

    public C4428fn() {
        this.f11932a = 2;
        this.f11933b = f11928a;
        this.f11931a = null;
        this.f11930a = new C4387em.C4388a();
    }

    public C4428fn(C4387em.C4388a aVar, short s, byte[] bArr) {
        this.f11932a = 2;
        this.f11933b = f11928a;
        this.f11931a = null;
        this.f11930a = aVar;
        this.f11932a = s;
        this.f11933b = bArr;
    }

    @Deprecated
    /* renamed from: a */
    public static C4428fn m12594a(AbstractC4456gl glVar, String str) {
        int i;
        C4428fn fnVar = new C4428fn();
        try {
            i = Integer.parseInt(glVar.mo41967k());
        } catch (Exception e) {
            AbstractC4163b.m11301a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        fnVar.mo41866a(i);
        fnVar.mo41868a(glVar.mo41966j());
        fnVar.mo41875c(glVar.mo41971m());
        fnVar.mo41873b(glVar.mo41973n());
        fnVar.mo41869a("XMLMSG", (String) null);
        try {
            fnVar.mo41871a(glVar.m12784a().getBytes(C7402o0OOOOoo.OooOO0), str);
            if (TextUtils.isEmpty(str)) {
                fnVar.mo41870a((short) 3);
            } else {
                fnVar.mo41870a((short) 2);
                fnVar.mo41869a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            AbstractC4163b.m11301a("Blob setPayload err： " + e2.getMessage());
        }
        return fnVar;
    }

    /* renamed from: a */
    public static C4428fn mo41865a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            C4387em.C4388a aVar = new C4387em.C4388a();
            aVar.mo41682a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new C4428fn(aVar, s, bArr);
        } catch (Exception e) {
            AbstractC4163b.m11301a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    /* renamed from: d */
    public static synchronized String m12596d() {
        String sb;
        synchronized (C4428fn.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f11929b);
            long j = f11927a;
            f11927a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public int mo41864a() {
        return this.f11930a.mo41704c();
    }

    /* renamed from: a */
    public String m12598a() {
        return this.f11930a.m12239c();
    }

    /* renamed from: a */
    public ByteBuffer m12599a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(mo41874c());
        }
        byteBuffer.putShort(this.f11932a);
        byteBuffer.putShort((short) this.f11930a.mo41679a());
        byteBuffer.putInt(this.f11933b.length);
        int position = byteBuffer.position();
        this.f11930a.m12145a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f11930a.mo41679a());
        byteBuffer.position(position + this.f11930a.mo41679a());
        byteBuffer.put(this.f11933b);
        return byteBuffer;
    }

    /* renamed from: a */
    public short m12600a() {
        return this.f11932a;
    }

    /* renamed from: a */
    public void mo41866a(int i) {
        this.f11930a.mo41699a(i);
    }

    /* renamed from: a */
    public void mo41867a(long j, String str, String str2) {
        if (j != 0) {
            this.f11930a.mo41700a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f11930a.mo41701a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f11930a.mo41703b(str2);
        }
    }

    /* renamed from: a */
    public void mo41868a(String str) {
        this.f11930a.mo41711e(str);
    }

    /* renamed from: a */
    public void mo41869a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f11930a.mo41706c(str);
            this.f11930a.m12223a();
            if (!TextUtils.isEmpty(str2)) {
                this.f11930a.mo41709d(str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("command should not be empty");
    }

    /* renamed from: a */
    public void mo41870a(short s) {
        this.f11932a = s;
    }

    /* renamed from: a */
    public void mo41871a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11930a.mo41705c(1);
            this.f11933b = C4628av.m14006a(C4628av.m14004a(str, mo41876e()), bArr);
            return;
        }
        this.f11930a.mo41705c(0);
        this.f11933b = bArr;
    }

    /* renamed from: a */
    public boolean m12607a() {
        return this.f11930a.mo41717j();
    }

    /* renamed from: a */
    public byte[] m12608a() {
        return this.f11933b;
    }

    /* renamed from: a */
    public byte[] m12609a(String str) {
        if (this.f11930a.mo41710e() == 1) {
            return C4628av.m14006a(C4628av.m14004a(str, mo41876e()), this.f11933b);
        }
        if (this.f11930a.mo41710e() == 0) {
            return this.f11933b;
        }
        AbstractC4163b.m11301a("unknow cipher = " + this.f11930a.mo41710e());
        return this.f11933b;
    }

    /* renamed from: b */
    public int mo41872b() {
        return this.f11930a.mo41712f();
    }

    /* renamed from: b */
    public String m12611b() {
        return this.f11930a.m12244d();
    }

    /* renamed from: b */
    public void mo41873b(String str) {
        this.f11931a = str;
    }

    /* renamed from: c */
    public int mo41874c() {
        return this.f11930a.mo41685b() + 8 + this.f11933b.length;
    }

    /* renamed from: c */
    public String m12614c() {
        return this.f11930a.m12252f();
    }

    /* renamed from: c */
    public void mo41875c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf(C8932ooOOO0o.OooO0OO, indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f11930a.mo41700a(parseLong);
                this.f11930a.mo41701a(substring);
                this.f11930a.mo41703b(substring2);
            } catch (Exception e) {
                AbstractC4163b.m11301a("Blob parse user err " + e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public String mo41876e() {
        String e = this.f11930a.m12248e();
        if ("ID_NOT_AVAILABLE".equals(e)) {
            return null;
        }
        if (this.f11930a.mo41714g()) {
            return e;
        }
        String d = m12596d();
        this.f11930a.mo41711e(d);
        return d;
    }

    /* renamed from: f */
    public String mo41877f() {
        return this.f11931a;
    }

    /* renamed from: g */
    public String mo41878g() {
        if (!this.f11930a.m12235b()) {
            return null;
        }
        return Long.toString(this.f11930a.m12221a()) + "@" + this.f11930a.m12228a() + C8932ooOOO0o.OooO0OO + this.f11930a.m12234b();
    }

    public String toString() {
        return "Blob [chid=" + mo41864a() + "; Id=" + mo41876e() + "; cmd=" + m12598a() + "; type=" + ((int) m12600a()) + "; from=" + mo41878g() + " ]";
    }
}
