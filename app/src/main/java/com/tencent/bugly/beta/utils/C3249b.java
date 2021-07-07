package com.tencent.bugly.beta.utils;

import com.p118pd.sdk.O0O00O;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.tencent.bugly.beta.utils.b */
public class C3249b {

    /* renamed from: a */
    public String f7515a = null;

    /* renamed from: b */
    public C3248a f7516b = null;

    /* renamed from: c */
    public long f7517c = 0;

    /* renamed from: d */
    public long f7518d = 0;

    /* renamed from: e */
    public String f7519e = null;

    /* renamed from: f */
    public final HashMap<Long, String> f7520f;

    public C3249b(String str, long j, long j2) {
        HashMap<Long, String> hashMap = new HashMap<>();
        this.f7520f = hashMap;
        hashMap.put(1L, "armeabi-v4");
        this.f7520f.put(2L, "armeabi-v4t");
        this.f7520f.put(3L, "armeabi-v5t");
        this.f7520f.put(4L, "armeabi-v5te");
        this.f7520f.put(5L, "armeabi-v5tej");
        this.f7520f.put(6L, "armeabi-v6");
        this.f7520f.put(7L, "armeabi-v6kz");
        this.f7520f.put(8L, "armeabi-v6t2");
        this.f7520f.put(9L, "armeabi-v6k");
        this.f7520f.put(10L, "armeabi-v7a");
        this.f7520f.put(11L, "armeabi-v6-m");
        this.f7520f.put(12L, "armeabi-v6s-m");
        this.f7520f.put(13L, "armeabi-v7e-m");
        this.f7520f.put(14L, "armeabi-v8a");
        this.f7515a = str;
        this.f7517c = j;
        this.f7518d = j2;
    }

    /* renamed from: a */
    private boolean m7839a() {
        return 0 != this.f7518d;
    }

    /* renamed from: b */
    private synchronized void m7841b() {
        if (this.f7516b != null) {
            if (this.f7516b.mo38047a()) {
                this.f7516b = null;
            }
        }
    }

    /* renamed from: c */
    private synchronized boolean m7842c() {
        if (!m7839a()) {
            return false;
        }
        if (this.f7516b != null) {
            m7841b();
        }
        try {
            C3248a aVar = new C3248a(this.f7515a, this.f7517c);
            this.f7516b = aVar;
            if (!aVar.mo38050b(this.f7518d)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /* renamed from: d */
    private synchronized String m7843d() {
        StringBuilder sb;
        sb = new StringBuilder();
        while (true) {
            try {
                char b = (char) this.f7516b.mo38049b();
                if (b != 0) {
                    sb.append(b);
                }
            } catch (IOException e) {
                e.getMessage();
                return null;
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    private String m7844e() {
        return m7843d();
    }

    /* renamed from: f */
    private synchronized boolean m7845f() {
        try {
            if (65 != this.f7516b.mo38054f()) {
                return false;
            }
            long h = this.f7516b.mo38056h();
            String e = m7844e();
            if (e == null || !e.equals("aeabi")) {
                return false;
            }
            long length = h - ((long) e.length());
            while (length > 0) {
                long f = this.f7516b.mo38054f();
                long h2 = this.f7516b.mo38056h() - 5;
                if (1 == f) {
                    return m7840a(h2);
                }
                this.f7516b.mo38050b(h2);
            }
            return true;
        } catch (IOException e2) {
            e2.getMessage();
            return false;
        }
    }

    /* renamed from: g */
    private boolean m7846g() {
        if (!m7842c()) {
            m7841b();
            return false;
        }
        m7845f();
        m7841b();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m7840a(long r5) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.utils.C3249b.m7840a(long):boolean");
    }

    /* renamed from: a */
    public static String m7838a(String str, long j, long j2) {
        C3249b bVar = new C3249b(str, j, j2);
        if (!bVar.m7846g()) {
            return null;
        }
        return bVar.f7519e;
    }

    /* renamed from: a */
    public static synchronized long m7837a(C3248a aVar) throws IOException {
        long j;
        byte b;
        synchronized (C3249b.class) {
            j = 0;
            long j2 = 0;
            do {
                b = aVar.mo38049b();
                j |= (((long) b) & 127) << ((int) j2);
                j2 += 7;
            } while ((b & O0O00O.OooO00o) != 0);
        }
        return j;
    }
}
