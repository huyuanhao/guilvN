package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.jg */
public class C4544jg extends AbstractC4549jk {

    /* renamed from: a */
    public static final C4554jp f13003a = new C4554jp();

    /* renamed from: a */
    public int f13004a;

    /* renamed from: a */
    public boolean f13005a = false;

    /* renamed from: a */
    public byte[] f13006a = new byte[1];

    /* renamed from: b */
    public boolean f13007b = true;

    /* renamed from: b */
    public byte[] f13008b = new byte[2];

    /* renamed from: c */
    public boolean f13009c = false;

    /* renamed from: c */
    public byte[] f13010c = new byte[4];

    /* renamed from: d */
    public byte[] f13011d = new byte[8];

    /* renamed from: e */
    public byte[] f13012e = new byte[1];

    /* renamed from: f */
    public byte[] f13013f = new byte[2];

    /* renamed from: g */
    public byte[] f13014g = new byte[4];

    /* renamed from: h */
    public byte[] f13015h = new byte[8];

    /* renamed from: com.xiaomi.push.jg$a */
    public static class C4545a implements AbstractC4551jm {

        /* renamed from: a */
        public int f13016a;

        /* renamed from: a */
        public boolean f13017a;

        /* renamed from: b */
        public boolean f13018b;

        public C4545a() {
            this(false, true);
        }

        public C4545a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public C4545a(boolean z, boolean z2, int i) {
            this.f13017a = false;
            this.f13018b = true;
            this.f13017a = z;
            this.f13018b = z2;
            this.f13016a = i;
        }

        @Override // com.xiaomi.push.AbstractC4551jm
        /* renamed from: a */
        public AbstractC4549jk mo42592a(AbstractC4560ju juVar) {
            C4544jg jgVar = new C4544jg(juVar, this.f13017a, this.f13018b);
            int i = this.f13016a;
            if (i != 0) {
                jgVar.mo42582b(i);
            }
            return jgVar;
        }
    }

    public C4544jg(AbstractC4560ju juVar, boolean z, boolean z2) {
        super(juVar);
        this.f13005a = z;
        this.f13007b = z2;
    }

    /* renamed from: a */
    private int m13618a(byte[] bArr, int i, int i2) {
        mo42584c(i2);
        return ((AbstractC4549jk) this).f13027a.mo42601b(bArr, i, i2);
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public byte mo42569a() {
        if (((AbstractC4549jk) this).f13027a.mo42600b() >= 1) {
            byte b = ((AbstractC4549jk) this).f13027a.m13718a()[((AbstractC4549jk) this).f13027a.mo42597a()];
            ((AbstractC4549jk) this).f13027a.mo42598a(1);
            return b;
        }
        m13618a(this.f13012e, 0, 1);
        return this.f13012e[0];
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public double m13620a() {
        return Double.longBitsToDouble(m13622a());
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public int m13621a() {
        byte[] bArr = this.f13014g;
        int i = 0;
        if (((AbstractC4549jk) this).f13027a.mo42600b() >= 4) {
            bArr = ((AbstractC4549jk) this).f13027a.m13718a();
            i = ((AbstractC4549jk) this).f13027a.mo42597a();
            ((AbstractC4549jk) this).f13027a.mo42598a(4);
        } else {
            m13618a(this.f13014g, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public long m13622a() {
        byte[] bArr = this.f13015h;
        int i = 0;
        if (((AbstractC4549jk) this).f13027a.mo42600b() >= 8) {
            bArr = ((AbstractC4549jk) this).f13027a.m13718a();
            i = ((AbstractC4549jk) this).f13027a.mo42597a();
            ((AbstractC4549jk) this).f13027a.mo42598a(8);
        } else {
            m13618a(this.f13015h, 0, 8);
        }
        return ((long) (bArr[i + 7] & 255)) | (((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8);
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4546jh m13623a() {
        byte a = mo42569a();
        return new C4546jh("", a, a == 0 ? 0 : m13631a());
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4547ji m13624a() {
        return new C4547ji(mo42569a(), m13621a());
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4548jj m13625a() {
        return new C4548jj(mo42569a(), mo42569a(), m13621a());
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4553jo m13626a() {
        return new C4553jo(mo42569a(), m13621a());
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4554jp m13627a() {
        return f13003a;
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public String m13628a() {
        int a = m13621a();
        if (((AbstractC4549jk) this).f13027a.mo42600b() < a) {
            return mo42570a(a);
        }
        try {
            String str = new String(((AbstractC4549jk) this).f13027a.m13718a(), ((AbstractC4549jk) this).f13027a.mo42597a(), a, "UTF-8");
            ((AbstractC4549jk) this).f13027a.mo42598a(a);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C4542je("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public String mo42570a(int i) {
        try {
            mo42584c(i);
            byte[] bArr = new byte[i];
            ((AbstractC4549jk) this).f13027a.mo42601b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C4542je("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public ByteBuffer m13630a() {
        int a = m13621a();
        mo42584c(a);
        if (((AbstractC4549jk) this).f13027a.mo42600b() >= a) {
            ByteBuffer wrap = ByteBuffer.wrap(((AbstractC4549jk) this).f13027a.m13718a(), ((AbstractC4549jk) this).f13027a.mo42597a(), a);
            ((AbstractC4549jk) this).f13027a.mo42598a(a);
            return wrap;
        }
        byte[] bArr = new byte[a];
        ((AbstractC4549jk) this).f13027a.mo42601b(bArr, 0, a);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public short m13631a() {
        byte[] bArr = this.f13013f;
        int i = 0;
        if (((AbstractC4549jk) this).f13027a.mo42600b() >= 2) {
            bArr = ((AbstractC4549jk) this).f13027a.m13718a();
            i = ((AbstractC4549jk) this).f13027a.mo42597a();
            ((AbstractC4549jk) this).f13027a.mo42598a(2);
        } else {
            m13618a(this.f13013f, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void m13632a() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42571a(byte b) {
        byte[] bArr = this.f13006a;
        bArr[0] = b;
        ((AbstractC4549jk) this).f13027a.m13717a(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void m13634a(int i) {
        byte[] bArr = this.f13010c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        ((AbstractC4549jk) this).f13027a.m13717a(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42572a(long j) {
        byte[] bArr = this.f13011d;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        ((AbstractC4549jk) this).f13027a.m13717a(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42573a(C4546jh jhVar) {
        mo42571a(jhVar.f13019a);
        mo42579a(jhVar.f13021a);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42574a(C4547ji jiVar) {
        mo42571a(jiVar.f13022a);
        m13634a(jiVar.f13023a);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42575a(C4548jj jjVar) {
        mo42571a(jjVar.f13024a);
        mo42571a(jjVar.f13026b);
        m13634a(jjVar.f13025a);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42576a(C4554jp jpVar) {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42577a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m13634a(bytes.length);
            ((AbstractC4549jk) this).f13027a.m13717a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C4542je("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42578a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        m13634a(limit);
        ((AbstractC4549jk) this).f13027a.m13717a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42579a(short s) {
        byte[] bArr = this.f13008b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        ((AbstractC4549jk) this).f13027a.m13717a(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public void mo42580a(boolean z) {
        mo42571a(z ? (byte) 1 : 0);
    }

    @Override // com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public boolean m13644a() {
        return mo42569a() == 1;
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: b */
    public void mo42581b() {
    }

    /* renamed from: b */
    public void mo42582b(int i) {
        this.f13004a = i;
        this.f13009c = true;
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: c */
    public void mo42583c() {
        mo42571a((byte) 0);
    }

    /* renamed from: c */
    public void mo42584c(int i) {
        if (i < 0) {
            throw new C4542je("Negative length: " + i);
        } else if (this.f13009c) {
            int i2 = this.f13004a - i;
            this.f13004a = i2;
            if (i2 < 0) {
                throw new C4542je("Message length exceeded: " + i);
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: d */
    public void mo42585d() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: e */
    public void mo42586e() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: f */
    public void mo42587f() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: g */
    public void mo42588g() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: h */
    public void mo42589h() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: i */
    public void mo42590i() {
    }

    @Override // com.xiaomi.push.AbstractC4549jk
    /* renamed from: j */
    public void mo42591j() {
    }
}
