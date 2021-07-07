package com.tencent.bugly.beta.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import okhttp3.internal.p288ws.WebSocketProtocol;

/* renamed from: com.tencent.bugly.beta.utils.a */
public class C3248a {

    /* renamed from: a */
    public static long f7504a = -1;

    /* renamed from: b */
    public static long f7505b = 0;

    /* renamed from: c */
    public static long f7506c = 1;

    /* renamed from: d */
    public byte[] f7507d;

    /* renamed from: e */
    public byte[] f7508e;

    /* renamed from: f */
    public byte[] f7509f;

    /* renamed from: g */
    public long f7510g;

    /* renamed from: h */
    public String f7511h;

    /* renamed from: i */
    public BufferedInputStream f7512i;

    /* renamed from: j */
    public long f7513j;

    /* renamed from: k */
    public long f7514k;

    public C3248a(String str) throws Exception {
        this.f7507d = new byte[2];
        this.f7508e = new byte[4];
        this.f7509f = new byte[8];
        this.f7510g = f7506c;
        this.f7511h = null;
        this.f7512i = null;
        this.f7513j = 0;
        this.f7514k = 0;
        this.f7511h = str;
        this.f7512i = new BufferedInputStream(new FileInputStream(this.f7511h));
        this.f7513j = 0;
        this.f7514k = 0;
    }

    /* renamed from: a */
    public synchronized void mo38046a(long j) {
        this.f7510g = j;
    }

    /* renamed from: b */
    public synchronized boolean mo38050b(long j) {
        if (this.f7512i == null) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        long j2 = j;
        while (j2 > 0) {
            try {
                j2 -= this.f7512i.skip(j2);
            } catch (IOException unused) {
                return false;
            }
        }
        this.f7513j += j;
        return true;
    }

    /* renamed from: c */
    public synchronized short mo38051c() throws IOException {
        if (this.f7512i == null) {
            return 0;
        }
        this.f7512i.read(this.f7507d);
        short a = m7816a(this.f7507d, this.f7510g);
        this.f7513j += 2;
        this.f7514k += 2;
        return a;
    }

    /* renamed from: d */
    public synchronized int mo38052d() throws IOException {
        if (this.f7512i == null) {
            return 0;
        }
        this.f7512i.read(this.f7508e);
        int b = m7817b(this.f7508e, this.f7510g);
        this.f7513j += 4;
        this.f7514k += 4;
        return b;
    }

    /* renamed from: e */
    public synchronized long mo38053e() throws IOException {
        if (this.f7512i == null) {
            return 0;
        }
        this.f7512i.read(this.f7509f);
        long c = m7820c(this.f7509f, this.f7510g);
        this.f7513j += 8;
        this.f7514k += 8;
        return c;
    }

    /* renamed from: f */
    public synchronized long mo38054f() throws IOException {
        return ((long) mo38049b()) & 255;
    }

    /* renamed from: g */
    public synchronized long mo38055g() throws IOException {
        return ((long) mo38051c()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    /* renamed from: h */
    public synchronized long mo38056h() throws IOException {
        return ((long) mo38052d()) & 4294967295L;
    }

    /* renamed from: i */
    public synchronized long mo38057i() throws IOException {
        return mo38053e();
    }

    /* renamed from: f */
    public static int m7823f(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return -1;
        }
        return (int) m7824g(bArr);
    }

    /* renamed from: g */
    public static long m7824g(byte[] bArr) {
        if (bArr == null || bArr.length > 8) {
            return -1;
        }
        long j = 0;
        for (byte b : bArr) {
            j = (j << 8) | (((long) b) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public synchronized boolean mo38047a() {
        try {
            if (this.f7512i != null) {
                this.f7512i.close();
            }
            this.f7512i = null;
            this.f7511h = null;
            this.f7513j = 0;
            this.f7514k = 0;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m7819c(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return -1;
        }
        return (int) m7821d(bArr);
    }

    /* renamed from: d */
    public static long m7821d(byte[] bArr) {
        if (bArr == null || bArr.length > 8) {
            return -1;
        }
        long j = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            j = (j << 8) | (((long) bArr[length]) & 255);
        }
        return j;
    }

    /* renamed from: e */
    public static short m7822e(byte[] bArr) {
        if (bArr == null || bArr.length > 2) {
            return -1;
        }
        return (short) m7823f(bArr);
    }

    /* renamed from: b */
    public synchronized byte mo38049b() throws IOException {
        if (this.f7512i == null) {
            return 0;
        }
        byte read = (byte) this.f7512i.read();
        this.f7513j++;
        this.f7514k++;
        return read;
    }

    /* renamed from: c */
    public static long m7820c(byte[] bArr, long j) {
        if (j == f7506c) {
            return m7821d(bArr);
        }
        return m7824g(bArr);
    }

    /* renamed from: a */
    public synchronized boolean mo38048a(byte[] bArr) {
        try {
            this.f7512i.read(bArr);
            this.f7513j += (long) bArr.length;
            this.f7514k += (long) bArr.length;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    public C3248a(String str, long j) throws Exception {
        this.f7507d = new byte[2];
        this.f7508e = new byte[4];
        this.f7509f = new byte[8];
        this.f7510g = f7506c;
        this.f7511h = null;
        this.f7512i = null;
        this.f7513j = 0;
        this.f7514k = 0;
        this.f7511h = str;
        this.f7510g = j;
        this.f7512i = new BufferedInputStream(new FileInputStream(this.f7511h));
        this.f7513j = 0;
        this.f7514k = 0;
    }

    /* renamed from: b */
    public static short m7818b(byte[] bArr) {
        if (bArr == null || bArr.length > 2) {
            return -1;
        }
        return (short) m7819c(bArr);
    }

    /* renamed from: b */
    public static int m7817b(byte[] bArr, long j) {
        if (j == f7506c) {
            return m7819c(bArr);
        }
        return m7823f(bArr);
    }

    /* renamed from: a */
    public static short m7816a(byte[] bArr, long j) {
        if (j == f7506c) {
            return m7818b(bArr);
        }
        return m7822e(bArr);
    }
}
