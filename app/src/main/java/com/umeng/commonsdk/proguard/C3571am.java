package com.umeng.commonsdk.proguard;

import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.O0O00O;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.commonsdk.proguard.am */
public class C3571am extends AbstractC3579as {

    /* renamed from: d */
    public static final C3584ax f9199d = new C3584ax("");

    /* renamed from: e */
    public static final C3574an f9200e = new C3574an("", (byte) 0, 0);

    /* renamed from: f */
    public static final byte[] f9201f;

    /* renamed from: h */
    public static final byte f9202h = -126;

    /* renamed from: i */
    public static final byte f9203i = 1;

    /* renamed from: j */
    public static final byte f9204j = 31;

    /* renamed from: k */
    public static final byte f9205k = -32;

    /* renamed from: l */
    public static final int f9206l = 5;

    /* renamed from: a */
    public byte[] f9207a;

    /* renamed from: b */
    public byte[] f9208b;

    /* renamed from: c */
    public byte[] f9209c;

    /* renamed from: m */
    public C3626r f9210m;

    /* renamed from: n */
    public short f9211n;

    /* renamed from: o */
    public C3574an f9212o;

    /* renamed from: p */
    public Boolean f9213p;

    /* renamed from: q */
    public final long f9214q;

    /* renamed from: r */
    public byte[] f9215r;

    /* renamed from: com.umeng.commonsdk.proguard.am$b */
    public static class C3573b {

        /* renamed from: a */
        public static final byte f9217a = 1;

        /* renamed from: b */
        public static final byte f9218b = 2;

        /* renamed from: c */
        public static final byte f9219c = 3;

        /* renamed from: d */
        public static final byte f9220d = 4;

        /* renamed from: e */
        public static final byte f9221e = 5;

        /* renamed from: f */
        public static final byte f9222f = 6;

        /* renamed from: g */
        public static final byte f9223g = 7;

        /* renamed from: h */
        public static final byte f9224h = 8;

        /* renamed from: i */
        public static final byte f9225i = 9;

        /* renamed from: j */
        public static final byte f9226j = 10;

        /* renamed from: k */
        public static final byte f9227k = 11;

        /* renamed from: l */
        public static final byte f9228l = 12;
    }

    static {
        byte[] bArr = new byte[16];
        f9201f = bArr;
        bArr[0] = 0;
        bArr[2] = 1;
        bArr[3] = 3;
        bArr[6] = 4;
        bArr[8] = 5;
        bArr[10] = 6;
        bArr[4] = 7;
        bArr[11] = 8;
        bArr[15] = 9;
        bArr[14] = 10;
        bArr[13] = 11;
        bArr[12] = 12;
    }

    public C3571am(AbstractC3597bg bgVar, long j) {
        super(bgVar);
        this.f9210m = new C3626r(15);
        this.f9211n = 0;
        this.f9212o = null;
        this.f9213p = null;
        this.f9207a = new byte[5];
        this.f9208b = new byte[10];
        this.f9215r = new byte[1];
        this.f9209c = new byte[1];
        this.f9214q = j;
    }

    /* renamed from: E */
    private int m9318E() throws C3636z {
        int i = 0;
        if (this.f9244g.mo38977h() >= 5) {
            byte[] f = this.f9244g.mo38975f();
            int g = this.f9244g.mo38976g();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte b = f[g + i];
                i2 |= (b & O0O00O.OooO0O0) << i3;
                if ((b & O0O00O.OooO00o) != 128) {
                    this.f9244g.mo38971a(i + 1);
                    return i2;
                }
                i3 += 7;
                i++;
            }
        } else {
            int i4 = 0;
            while (true) {
                byte u = mo38944u();
                i |= (u & O0O00O.OooO0O0) << i4;
                if ((u & O0O00O.OooO00o) != 128) {
                    return i;
                }
                i4 += 7;
            }
        }
    }

    /* renamed from: F */
    private long m9319F() throws C3636z {
        int i = 0;
        long j = 0;
        if (this.f9244g.mo38977h() >= 10) {
            byte[] f = this.f9244g.mo38975f();
            int g = this.f9244g.mo38976g();
            long j2 = 0;
            int i2 = 0;
            while (true) {
                byte b = f[g + i];
                j2 |= ((long) (b & O0O00O.OooO0O0)) << i2;
                if ((b & O0O00O.OooO00o) != 128) {
                    this.f9244g.mo38971a(i + 1);
                    return j2;
                }
                i2 += 7;
                i++;
            }
        } else {
            while (true) {
                byte u = mo38944u();
                j |= ((long) (u & O0O00O.OooO0O0)) << i;
                if ((u & O0O00O.OooO00o) != 128) {
                    return j;
                }
                i += 7;
            }
        }
    }

    /* renamed from: c */
    private int m9327c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: c */
    private long m9328c(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c */
    private boolean m9329c(byte b) {
        int i = b & 15;
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    private long m9331d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: e */
    private byte[] m9334e(int i) throws C3636z {
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        this.f9244g.mo38979d(bArr, 0, i);
        return bArr;
    }

    /* renamed from: f */
    private void m9335f(int i) throws C3580at {
        if (i >= 0) {
            long j = this.f9214q;
            if (j != -1 && ((long) i) > j) {
                throw new C3580at("Length exceeded max allowed: " + i);
            }
            return;
        }
        throw new C3580at("Negative length: " + i);
    }

    /* renamed from: g */
    private int m9336g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: A */
    public ByteBuffer mo38906A() throws C3636z {
        int E = m9318E();
        m9335f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.f9244g.mo38979d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: B */
    public void mo38951B() {
        this.f9210m.mo39063c();
        this.f9211n = 0;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38907a() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38915a(C3577aq aqVar) throws C3636z {
        m9324b(f9202h);
        m9332d(((aqVar.f9238b << 5) & -32) | 1);
        mo38962b(aqVar.f9239c);
        mo38918a(aqVar.f9237a);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: b */
    public void mo38923b() throws C3636z {
        this.f9211n = this.f9210m.mo39060a();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: c */
    public void mo38924c() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: d */
    public void mo38926d() throws C3636z {
        m9324b((byte) 0);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: e */
    public void mo38928e() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: f */
    public void mo38929f() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: g */
    public void mo38930g() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: h */
    public C3577aq mo38931h() throws C3636z {
        byte u = mo38944u();
        if (u == -126) {
            byte u2 = mo38944u();
            byte b = (byte) (u2 & f9204j);
            if (b == 1) {
                int E = m9318E();
                return new C3577aq(mo38949z(), (byte) ((u2 >> 5) & 3), E);
            }
            throw new C3580at("Expected version 1 but got " + ((int) b));
        }
        throw new C3580at("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(u));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: i */
    public void mo38932i() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: j */
    public C3584ax mo38933j() throws C3636z {
        this.f9210m.mo39061a(this.f9211n);
        this.f9211n = 0;
        return f9199d;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: k */
    public void mo38934k() throws C3636z {
        this.f9211n = this.f9210m.mo39060a();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: l */
    public C3574an mo38935l() throws C3636z {
        short s;
        byte u = mo38944u();
        if (u == 0) {
            return f9200e;
        }
        short s2 = (short) ((u & 240) >> 4);
        if (s2 == 0) {
            s = mo38945v();
        } else {
            s = (short) (this.f9211n + s2);
        }
        byte b = (byte) (u & 15);
        C3574an anVar = new C3574an("", m9330d(b), s);
        if (m9329c(u)) {
            this.f9213p = b == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f9211n = anVar.f9231c;
        return anVar;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: m */
    public void mo38936m() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: n */
    public C3576ap mo38937n() throws C3636z {
        byte b;
        int E = m9318E();
        if (E == 0) {
            b = 0;
        } else {
            b = mo38944u();
        }
        return new C3576ap(m9330d((byte) (b >> 4)), m9330d((byte) (b & 15)), E);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: o */
    public void mo38938o() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: p */
    public C3575ao mo38939p() throws C3636z {
        byte u = mo38944u();
        int i = (u >> 4) & 15;
        if (i == 15) {
            i = m9318E();
        }
        return new C3575ao(m9330d(u), i);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: q */
    public void mo38940q() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: r */
    public C3583aw mo38941r() throws C3636z {
        return new C3583aw(mo38939p());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: s */
    public void mo38942s() throws C3636z {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: t */
    public boolean mo38943t() throws C3636z {
        Boolean bool = this.f9213p;
        if (bool == null) {
            return mo38944u() == 1;
        }
        boolean booleanValue = bool.booleanValue();
        this.f9213p = null;
        return booleanValue;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: u */
    public byte mo38944u() throws C3636z {
        if (this.f9244g.mo38977h() > 0) {
            byte b = this.f9244g.mo38975f()[this.f9244g.mo38976g()];
            this.f9244g.mo38971a(1);
            return b;
        }
        this.f9244g.mo38979d(this.f9209c, 0, 1);
        return this.f9209c[0];
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: v */
    public short mo38945v() throws C3636z {
        return (short) m9336g(m9318E());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: w */
    public int mo38946w() throws C3636z {
        return m9336g(m9318E());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: x */
    public long mo38947x() throws C3636z {
        return m9331d(m9319F());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: y */
    public double mo38948y() throws C3636z {
        byte[] bArr = new byte[8];
        this.f9244g.mo38979d(bArr, 0, 8);
        return Double.longBitsToDouble(m9320a(bArr));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: z */
    public String mo38949z() throws C3636z {
        int E = m9318E();
        m9335f(E);
        if (E == 0) {
            return "";
        }
        try {
            if (this.f9244g.mo38977h() < E) {
                return new String(m9334e(E), "UTF-8");
            }
            String str = new String(this.f9244g.mo38975f(), this.f9244g.mo38976g(), E, "UTF-8");
            this.f9244g.mo38971a(E);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C3636z("UTF-8 not supported!");
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.am$a */
    public static class C3572a implements AbstractC3581au {

        /* renamed from: a */
        public final long f9216a;

        public C3572a() {
            this.f9216a = -1;
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3581au
        /* renamed from: a */
        public AbstractC3579as mo38950a(AbstractC3597bg bgVar) {
            return new C3571am(bgVar, this.f9216a);
        }

        public C3572a(int i) {
            this.f9216a = (long) i;
        }
    }

    /* renamed from: b */
    private void mo38962b(int i) throws C3636z {
        int i2 = 0;
        while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
            this.f9207a[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        byte[] bArr = this.f9207a;
        bArr[i2] = (byte) i;
        this.f9244g.mo38968b(bArr, 0, i2 + 1);
    }

    /* renamed from: d */
    private void m9332d(int i) throws C3636z {
        m9324b((byte) i);
    }

    /* renamed from: d */
    private byte m9330d(byte b) throws C3580at {
        byte b2 = (byte) (b & 15);
        switch (b2) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 10;
            case 7:
                return 4;
            case 8:
                return 11;
            case 9:
                return 15;
            case 10:
                return C3587az.f9268l;
            case 11:
                return 13;
            case 12:
                return 12;
            default:
                throw new C3580at("don't know what type: " + ((int) b2));
        }
    }

    /* renamed from: e */
    private byte m9333e(byte b) {
        return f9201f[b];
    }

    /* renamed from: b */
    private void m9326b(long j) throws C3636z {
        int i = 0;
        while ((-128 & j) != 0) {
            this.f9208b[i] = (byte) ((int) ((127 & j) | 128));
            j >>>= 7;
            i++;
        }
        byte[] bArr = this.f9208b;
        bArr[i] = (byte) ((int) j);
        this.f9244g.mo38968b(bArr, 0, i + 1);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38917a(C3584ax axVar) throws C3636z {
        this.f9210m.mo39061a(this.f9211n);
        this.f9211n = 0;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38912a(C3574an anVar) throws C3636z {
        if (anVar.f9230b == 2) {
            this.f9212o = anVar;
        } else {
            m9322a(anVar, (byte) -1);
        }
    }

    /* renamed from: b */
    private void m9324b(byte b) throws C3636z {
        byte[] bArr = this.f9215r;
        bArr[0] = b;
        this.f9244g.mo38978b(bArr);
    }

    /* renamed from: a */
    private void m9322a(C3574an anVar, byte b) throws C3636z {
        if (b == -1) {
            b = m9333e(anVar.f9230b);
        }
        short s = anVar.f9231c;
        short s2 = this.f9211n;
        if (s <= s2 || s - s2 > 15) {
            m9324b(b);
            mo38920a(anVar.f9231c);
        } else {
            m9332d(b | ((s - s2) << 4));
        }
        this.f9211n = anVar.f9231c;
    }

    public C3571am(AbstractC3597bg bgVar) {
        this(bgVar, -1);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38914a(C3576ap apVar) throws C3636z {
        int i = apVar.f9236c;
        if (i == 0) {
            m9332d(0);
            return;
        }
        mo38962b(i);
        m9332d(m9333e(apVar.f9235b) | (m9333e(apVar.f9234a) << 4));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38913a(C3575ao aoVar) throws C3636z {
        mo38952a(aoVar.f9232a, aoVar.f9233b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38916a(C3583aw awVar) throws C3636z {
        mo38952a(awVar.f9254a, awVar.f9255b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38921a(boolean z) throws C3636z {
        C3574an anVar = this.f9212o;
        byte b = 1;
        if (anVar != null) {
            if (!z) {
                b = 2;
            }
            m9322a(anVar, b);
            this.f9212o = null;
            return;
        }
        if (!z) {
            b = 2;
        }
        m9324b(b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38908a(byte b) throws C3636z {
        m9324b(b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38920a(short s) throws C3636z {
        mo38962b(m9327c((int) s));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38910a(int i) throws C3636z {
        mo38962b(m9327c(i));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38911a(long j) throws C3636z {
        m9326b(m9328c(j));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38909a(double d) throws C3636z {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m9321a(Double.doubleToLongBits(d), bArr, 0);
        this.f9244g.mo38978b(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38918a(String str) throws C3636z {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m9323a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3636z("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38919a(ByteBuffer byteBuffer) throws C3636z {
        m9323a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: a */
    private void m9323a(byte[] bArr, int i, int i2) throws C3636z {
        mo38962b(i2);
        this.f9244g.mo38968b(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo38952a(byte b, int i) throws C3636z {
        if (i <= 14) {
            m9332d(m9333e(b) | (i << 4));
            return;
        }
        m9332d(m9333e(b) | 240);
        mo38962b(i);
    }

    /* renamed from: a */
    private void m9321a(long j, byte[] bArr, int i) {
        bArr[i + 0] = (byte) ((int) (j & 255));
        bArr[i + 1] = (byte) ((int) ((j >> 8) & 255));
        bArr[i + 2] = (byte) ((int) ((j >> 16) & 255));
        bArr[i + 3] = (byte) ((int) ((j >> 24) & 255));
        bArr[i + 4] = (byte) ((int) ((j >> 32) & 255));
        bArr[i + 5] = (byte) ((int) ((j >> 40) & 255));
        bArr[i + 6] = (byte) ((int) ((j >> 48) & 255));
        bArr[i + 7] = (byte) ((int) ((j >> 56) & 255));
    }

    /* renamed from: a */
    private long m9320a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }
}
