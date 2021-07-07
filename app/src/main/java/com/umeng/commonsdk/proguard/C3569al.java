package com.umeng.commonsdk.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.commonsdk.proguard.al */
public class C3569al extends AbstractC3579as {

    /* renamed from: a */
    public static final int f9181a = -65536;

    /* renamed from: b */
    public static final int f9182b = -2147418112;

    /* renamed from: h */
    public static final C3584ax f9183h = new C3584ax();

    /* renamed from: c */
    public boolean f9184c;

    /* renamed from: d */
    public boolean f9185d;

    /* renamed from: e */
    public int f9186e;

    /* renamed from: f */
    public boolean f9187f;

    /* renamed from: i */
    public byte[] f9188i;

    /* renamed from: j */
    public byte[] f9189j;

    /* renamed from: k */
    public byte[] f9190k;

    /* renamed from: l */
    public byte[] f9191l;

    /* renamed from: m */
    public byte[] f9192m;

    /* renamed from: n */
    public byte[] f9193n;

    /* renamed from: o */
    public byte[] f9194o;

    /* renamed from: p */
    public byte[] f9195p;

    /* renamed from: com.umeng.commonsdk.proguard.al$a */
    public static class C3570a implements AbstractC3581au {

        /* renamed from: a */
        public boolean f9196a;

        /* renamed from: b */
        public boolean f9197b;

        /* renamed from: c */
        public int f9198c;

        public C3570a() {
            this(false, true);
        }

        @Override // com.umeng.commonsdk.proguard.AbstractC3581au
        /* renamed from: a */
        public AbstractC3579as mo38950a(AbstractC3597bg bgVar) {
            C3569al alVar = new C3569al(bgVar, this.f9196a, this.f9197b);
            int i = this.f9198c;
            if (i != 0) {
                alVar.mo38925c(i);
            }
            return alVar;
        }

        public C3570a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public C3570a(boolean z, boolean z2, int i) {
            this.f9196a = false;
            this.f9197b = true;
            this.f9196a = z;
            this.f9197b = z2;
            this.f9198c = i;
        }
    }

    public C3569al(AbstractC3597bg bgVar) {
        this(bgVar, false, true);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: A */
    public ByteBuffer mo38906A() throws C3636z {
        int w = mo38946w();
        mo38927d(w);
        if (this.f9244g.mo38977h() >= w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f9244g.mo38975f(), this.f9244g.mo38976g(), w);
            this.f9244g.mo38971a(w);
            return wrap;
        }
        byte[] bArr = new byte[w];
        this.f9244g.mo38979d(bArr, 0, w);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38907a() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38915a(C3577aq aqVar) throws C3636z {
        if (this.f9185d) {
            mo38910a(-2147418112 | aqVar.f9238b);
            mo38918a(aqVar.f9237a);
            mo38910a(aqVar.f9239c);
            return;
        }
        mo38918a(aqVar.f9237a);
        mo38908a(aqVar.f9238b);
        mo38910a(aqVar.f9239c);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38917a(C3584ax axVar) {
    }

    /* renamed from: b */
    public String mo38922b(int i) throws C3636z {
        try {
            mo38927d(i);
            byte[] bArr = new byte[i];
            this.f9244g.mo38979d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C3636z("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: b */
    public void mo38923b() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: c */
    public void mo38924c() {
    }

    /* renamed from: c */
    public void mo38925c(int i) {
        this.f9186e = i;
        this.f9187f = true;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: d */
    public void mo38926d() throws C3636z {
        mo38908a((byte) 0);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: e */
    public void mo38928e() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: f */
    public void mo38929f() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: g */
    public void mo38930g() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: h */
    public C3577aq mo38931h() throws C3636z {
        int w = mo38946w();
        if (w < 0) {
            if ((-65536 & w) == -2147418112) {
                return new C3577aq(mo38949z(), (byte) (w & 255), mo38946w());
            }
            throw new C3580at(4, "Bad version in readMessageBegin");
        } else if (!this.f9184c) {
            return new C3577aq(mo38922b(w), mo38944u(), mo38946w());
        } else {
            throw new C3580at(4, "Missing version in readMessageBegin, old client?");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: i */
    public void mo38932i() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: j */
    public C3584ax mo38933j() {
        return f9183h;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: k */
    public void mo38934k() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: l */
    public C3574an mo38935l() throws C3636z {
        short s;
        byte u = mo38944u();
        if (u == 0) {
            s = 0;
        } else {
            s = mo38945v();
        }
        return new C3574an("", u, s);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: m */
    public void mo38936m() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: n */
    public C3576ap mo38937n() throws C3636z {
        return new C3576ap(mo38944u(), mo38944u(), mo38946w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: o */
    public void mo38938o() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: p */
    public C3575ao mo38939p() throws C3636z {
        return new C3575ao(mo38944u(), mo38946w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: q */
    public void mo38940q() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: r */
    public C3583aw mo38941r() throws C3636z {
        return new C3583aw(mo38944u(), mo38946w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: s */
    public void mo38942s() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: t */
    public boolean mo38943t() throws C3636z {
        return mo38944u() == 1;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: u */
    public byte mo38944u() throws C3636z {
        if (this.f9244g.mo38977h() >= 1) {
            byte b = this.f9244g.mo38975f()[this.f9244g.mo38976g()];
            this.f9244g.mo38971a(1);
            return b;
        }
        m9272a(this.f9192m, 0, 1);
        return this.f9192m[0];
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: v */
    public short mo38945v() throws C3636z {
        byte[] bArr = this.f9193n;
        int i = 0;
        if (this.f9244g.mo38977h() >= 2) {
            bArr = this.f9244g.mo38975f();
            i = this.f9244g.mo38976g();
            this.f9244g.mo38971a(2);
        } else {
            m9272a(this.f9193n, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: w */
    public int mo38946w() throws C3636z {
        byte[] bArr = this.f9194o;
        int i = 0;
        if (this.f9244g.mo38977h() >= 4) {
            bArr = this.f9244g.mo38975f();
            i = this.f9244g.mo38976g();
            this.f9244g.mo38971a(4);
        } else {
            m9272a(this.f9194o, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: x */
    public long mo38947x() throws C3636z {
        byte[] bArr = this.f9195p;
        int i = 0;
        if (this.f9244g.mo38977h() >= 8) {
            bArr = this.f9244g.mo38975f();
            i = this.f9244g.mo38976g();
            this.f9244g.mo38971a(8);
        } else {
            m9272a(this.f9195p, 0, 8);
        }
        return ((long) (bArr[i + 7] & 255)) | (((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: y */
    public double mo38948y() throws C3636z {
        return Double.longBitsToDouble(mo38947x());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: z */
    public String mo38949z() throws C3636z {
        int w = mo38946w();
        if (this.f9244g.mo38977h() < w) {
            return mo38922b(w);
        }
        try {
            String str = new String(this.f9244g.mo38975f(), this.f9244g.mo38976g(), w, "UTF-8");
            this.f9244g.mo38971a(w);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C3636z("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public C3569al(AbstractC3597bg bgVar, boolean z, boolean z2) {
        super(bgVar);
        this.f9184c = false;
        this.f9185d = true;
        this.f9187f = false;
        this.f9188i = new byte[1];
        this.f9189j = new byte[2];
        this.f9190k = new byte[4];
        this.f9191l = new byte[8];
        this.f9192m = new byte[1];
        this.f9193n = new byte[2];
        this.f9194o = new byte[4];
        this.f9195p = new byte[8];
        this.f9184c = z;
        this.f9185d = z2;
    }

    /* renamed from: d */
    public void mo38927d(int i) throws C3636z {
        if (i < 0) {
            throw new C3580at("Negative length: " + i);
        } else if (this.f9187f) {
            int i2 = this.f9186e - i;
            this.f9186e = i2;
            if (i2 < 0) {
                throw new C3580at("Message length exceeded: " + i);
            }
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38912a(C3574an anVar) throws C3636z {
        mo38908a(anVar.f9230b);
        mo38920a(anVar.f9231c);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38914a(C3576ap apVar) throws C3636z {
        mo38908a(apVar.f9234a);
        mo38908a(apVar.f9235b);
        mo38910a(apVar.f9236c);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38913a(C3575ao aoVar) throws C3636z {
        mo38908a(aoVar.f9232a);
        mo38910a(aoVar.f9233b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38916a(C3583aw awVar) throws C3636z {
        mo38908a(awVar.f9254a);
        mo38910a(awVar.f9255b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38921a(boolean z) throws C3636z {
        mo38908a(z ? (byte) 1 : 0);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38908a(byte b) throws C3636z {
        byte[] bArr = this.f9188i;
        bArr[0] = b;
        this.f9244g.mo38968b(bArr, 0, 1);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38920a(short s) throws C3636z {
        byte[] bArr = this.f9189j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f9244g.mo38968b(bArr, 0, 2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38910a(int i) throws C3636z {
        byte[] bArr = this.f9190k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f9244g.mo38968b(bArr, 0, 4);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38911a(long j) throws C3636z {
        byte[] bArr = this.f9191l;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        this.f9244g.mo38968b(bArr, 0, 8);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38909a(double d) throws C3636z {
        mo38911a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38918a(String str) throws C3636z {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo38910a(bytes.length);
            this.f9244g.mo38968b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3636z("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: a */
    public void mo38919a(ByteBuffer byteBuffer) throws C3636z {
        int limit = byteBuffer.limit() - byteBuffer.position();
        mo38910a(limit);
        this.f9244g.mo38968b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    /* renamed from: a */
    private int m9272a(byte[] bArr, int i, int i2) throws C3636z {
        mo38927d(i2);
        return this.f9244g.mo38979d(bArr, i, i2);
    }
}
