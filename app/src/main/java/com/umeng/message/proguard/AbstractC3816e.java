package com.umeng.message.proguard;

/* renamed from: com.umeng.message.proguard.e */
public abstract class AbstractC3816e {

    /* renamed from: a */
    public static final int f10322a = 2;

    /* renamed from: b */
    public static final int f10323b = 76;

    /* renamed from: c */
    public static final int f10324c = 64;

    /* renamed from: d */
    public static final int f10325d = 255;

    /* renamed from: e */
    public static final byte f10326e = 61;

    /* renamed from: m */
    public static final int f10327m = 8192;

    /* renamed from: f */
    public final byte f10328f = 61;

    /* renamed from: g */
    public final int f10329g;

    /* renamed from: h */
    public byte[] f10330h;

    /* renamed from: i */
    public int f10331i;

    /* renamed from: j */
    public boolean f10332j;

    /* renamed from: k */
    public int f10333k;

    /* renamed from: l */
    public int f10334l;

    /* renamed from: n */
    public final int f10335n;

    /* renamed from: o */
    public final int f10336o;

    /* renamed from: p */
    public final int f10337p;

    /* renamed from: q */
    public int f10338q;

    public AbstractC3816e(int i, int i2, int i3, int i4) {
        this.f10335n = i;
        this.f10336o = i2;
        this.f10329g = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.f10337p = i4;
    }

    /* renamed from: a */
    private void mo39870a() {
        byte[] bArr = this.f10330h;
        if (bArr == null) {
            this.f10330h = new byte[mo39881d()];
            this.f10331i = 0;
            this.f10338q = 0;
            return;
        }
        byte[] bArr2 = new byte[(bArr.length * 2)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f10330h = bArr2;
    }

    /* renamed from: c */
    public static boolean m10514c(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    /* renamed from: e */
    private void m10515e() {
        this.f10330h = null;
        this.f10331i = 0;
        this.f10338q = 0;
        this.f10333k = 0;
        this.f10334l = 0;
        this.f10332j = false;
    }

    /* renamed from: a */
    public abstract void mo39869a(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public abstract void mo39871b(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public boolean mo39876b() {
        return this.f10330h != null;
    }

    /* renamed from: b */
    public abstract boolean mo39872b(byte b);

    /* renamed from: c */
    public int mo39878c() {
        if (this.f10330h != null) {
            return this.f10331i - this.f10338q;
        }
        return 0;
    }

    /* renamed from: d */
    public int mo39881d() {
        return 8192;
    }

    /* renamed from: d */
    public boolean mo39882d(String str) {
        return mo39877b(C3813b.m10488f(str), true);
    }

    /* renamed from: j */
    public String mo39883j(byte[] bArr) {
        return C3813b.m10487f(mo39885l(bArr));
    }

    /* renamed from: k */
    public byte[] mo39884k(byte[] bArr) {
        m10515e();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo39871b(bArr, 0, bArr.length);
        mo39871b(bArr, 0, -1);
        int i = this.f10331i;
        byte[] bArr2 = new byte[i];
        mo39879c(bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: l */
    public byte[] mo39885l(byte[] bArr) {
        m10515e();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo39869a(bArr, 0, bArr.length);
        mo39869a(bArr, 0, -1);
        int i = this.f10331i - this.f10338q;
        byte[] bArr2 = new byte[i];
        mo39879c(bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: m */
    public String mo39886m(byte[] bArr) {
        return C3813b.m10487f(mo39885l(bArr));
    }

    /* renamed from: n */
    public boolean mo39887n(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (61 == bArr[i] || mo39872b(bArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public long mo39888o(byte[] bArr) {
        int length = bArr.length;
        int i = this.f10335n;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.f10336o);
        int i2 = this.f10329g;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.f10337p)) : j;
    }

    /* renamed from: b */
    public Object mo39875b(Object obj) throws Exception {
        if (obj instanceof byte[]) {
            return mo39884k((byte[]) obj);
        }
        if (obj instanceof String) {
            return mo39880c((String) obj);
        }
        throw new Exception("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    /* renamed from: c */
    public int mo39879c(byte[] bArr, int i, int i2) {
        if (this.f10330h == null) {
            return this.f10332j ? -1 : 0;
        }
        int min = Math.min(mo39878c(), i2);
        System.arraycopy(this.f10330h, this.f10338q, bArr, i, min);
        int i3 = this.f10338q + min;
        this.f10338q = i3;
        if (i3 >= this.f10331i) {
            this.f10330h = null;
        }
        return min;
    }

    /* renamed from: b */
    public boolean mo39877b(byte[] bArr, boolean z) {
        for (int i = 0; i < bArr.length; i++) {
            if (!(mo39872b(bArr[i]) || (z && (bArr[i] == 61 || m10514c(bArr[i]))))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo39874a(int i) {
        byte[] bArr = this.f10330h;
        if (bArr == null || bArr.length < this.f10331i + i) {
            mo39870a();
        }
    }

    /* renamed from: c */
    public byte[] mo39880c(String str) {
        return mo39884k(C3813b.m10488f(str));
    }

    /* renamed from: a */
    public Object mo39873a(Object obj) throws Exception {
        if (obj instanceof byte[]) {
            return mo39885l((byte[]) obj);
        }
        throw new Exception("Parameter supplied to Base-N encode is not a byte[]");
    }
}
