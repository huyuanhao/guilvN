package org.json.alipay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: org.json.alipay.c */
public final class C4843c {

    /* renamed from: a */
    public int f13514a;

    /* renamed from: b */
    public Reader f13515b;

    /* renamed from: c */
    public char f13516c;

    /* renamed from: d */
    public boolean f13517d;

    public C4843c(Reader reader) {
        this.f13515b = !reader.markSupported() ? new BufferedReader(reader) : reader;
        this.f13517d = false;
        this.f13514a = 0;
    }

    public C4843c(String str) {
        this(new StringReader(str));
    }

    /* renamed from: a */
    private String m14315a(int i) {
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        int i2 = 0;
        if (this.f13517d) {
            this.f13517d = false;
            cArr[0] = this.f13516c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int read = this.f13515b.read(cArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.f13514a += i2;
        if (i2 >= i) {
            this.f13516c = cArr[i - 1];
            return new String(cArr);
        }
        throw mo45552a("Substring bounds error");
    }

    /* renamed from: a */
    public final JSONException mo45552a(String str) {
        return new JSONException(str + toString());
    }

    /* renamed from: a */
    public final void mo45553a() {
        int i;
        if (this.f13517d || (i = this.f13514a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f13514a = i - 1;
        this.f13517d = true;
    }

    /* renamed from: b */
    public final char mo45554b() {
        if (this.f13517d) {
            this.f13517d = false;
            if (this.f13516c != 0) {
                this.f13514a++;
            }
            return this.f13516c;
        }
        try {
            int read = this.f13515b.read();
            if (read <= 0) {
                this.f13516c = 0;
                return 0;
            }
            this.f13514a++;
            char c = (char) read;
            this.f13516c = c;
            return c;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    /* renamed from: c */
    public final char mo45555c() {
        char b;
        char b2;
        char b3;
        while (true) {
            b = mo45554b();
            if (b == '/') {
                char b4 = mo45554b();
                if (b4 != '*') {
                    if (b4 == '/') {
                        do {
                            b3 = mo45554b();
                            if (b3 == '\n' || b3 == '\r') {
                                break;
                            }
                        } while (b3 != 0);
                    } else {
                        mo45553a();
                        return '/';
                    }
                } else {
                    while (true) {
                        char b5 = mo45554b();
                        if (b5 != 0) {
                            if (b5 == '*') {
                                if (mo45554b() == '/') {
                                    break;
                                }
                                mo45553a();
                            }
                        } else {
                            throw mo45552a("Unclosed comment");
                        }
                    }
                }
            } else if (b == '#') {
                do {
                    b2 = mo45554b();
                    if (b2 == '\n' || b2 == '\r') {
                        break;
                    }
                } while (b2 != 0);
            } else if (b == 0 || b > ' ') {
                return b;
            }
        }
        return b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:56|57|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:42|(2:51|52)(3:48|49|50))|53|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        return new java.lang.Long(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c3, code lost:
        return new java.lang.Double(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c4, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00be */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45556d() {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.C4843c.mo45556d():java.lang.Object");
    }

    public final String toString() {
        return " at character " + this.f13514a;
    }
}
