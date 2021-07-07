package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ju */
public abstract class AbstractC4560ju {
    /* renamed from: a */
    public int mo42597a() {
        return 0;
    }

    /* renamed from: a */
    public abstract int mo42595a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public void mo42598a(int i) {
    }

    /* renamed from: a */
    public abstract void m13717a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public byte[] m13718a() {
        return null;
    }

    /* renamed from: b */
    public int mo42600b() {
        return -1;
    }

    /* renamed from: b */
    public int mo42601b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int a = mo42595a(bArr, i + i3, i2 - i3);
            if (a > 0) {
                i3 += a;
            } else {
                throw new C4561jv("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
        }
        return i3;
    }
}
