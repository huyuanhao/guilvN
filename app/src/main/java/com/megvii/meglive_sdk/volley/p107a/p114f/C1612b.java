package com.megvii.meglive_sdk.volley.p107a.p114f;

import java.io.Serializable;

/* renamed from: com.megvii.meglive_sdk.volley.a.f.b */
public final class C1612b implements Serializable {

    /* renamed from: a */
    public int f2852a;

    /* renamed from: b */
    public char[] f2853b = new char[64];

    public C1612b() {
        C1611a.m2770a(64, "Buffer capacity");
    }

    /* renamed from: b */
    private void m2772b(int i) {
        char[] cArr = new char[Math.max(this.f2853b.length << 1, i)];
        System.arraycopy(this.f2853b, 0, cArr, 0, this.f2852a);
        this.f2853b = cArr;
    }

    /* renamed from: a */
    public final void mo17328a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f2852a + length;
        if (i > this.f2853b.length) {
            m2772b(i);
        }
        str.getChars(0, length, this.f2853b, this.f2852a);
        this.f2852a = i;
    }

    public final String toString() {
        return new String(this.f2853b, 0, this.f2852a);
    }

    /* renamed from: a */
    public final void mo17326a(char c) {
        int i = this.f2852a + 1;
        if (i > this.f2853b.length) {
            m2772b(i);
        }
        this.f2853b[this.f2852a] = c;
        this.f2852a = i;
    }

    /* renamed from: a */
    public final void mo17327a(int i) {
        if (i > 0) {
            int length = this.f2853b.length;
            int i2 = this.f2852a;
            if (i > length - i2) {
                m2772b(i2 + i);
            }
        }
    }
}
