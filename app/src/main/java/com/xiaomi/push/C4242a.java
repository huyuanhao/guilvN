package com.xiaomi.push;

/* renamed from: com.xiaomi.push.a */
public final class C4242a {

    /* renamed from: a */
    public static final C4242a f11337a = new C4242a(new byte[0]);

    /* renamed from: a */
    public volatile int f11338a = 0;

    /* renamed from: a */
    public final byte[] f11339a;

    public C4242a(byte[] bArr) {
        this.f11339a = bArr;
    }

    /* renamed from: a */
    public static C4242a m11617a(byte[] bArr) {
        return m11618a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4242a m11618a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C4242a(bArr2);
    }

    /* renamed from: a */
    public int mo41471a() {
        return this.f11339a.length;
    }

    /* renamed from: a */
    public byte[] m11620a() {
        byte[] bArr = this.f11339a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4242a)) {
            return false;
        }
        byte[] bArr = this.f11339a;
        int length = bArr.length;
        byte[] bArr2 = ((C4242a) obj).f11339a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f11338a;
        if (i == 0) {
            byte[] bArr = this.f11339a;
            int length = bArr.length;
            int i2 = length;
            for (byte b : bArr) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f11338a = i;
        }
        return i;
    }
}
