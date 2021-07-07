package com.tencent.bugly.beta.utils;

import com.tencent.bugly.proguard.C3321an;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.android.spdy.SoInstallMgrSdk;

/* renamed from: com.tencent.bugly.beta.utils.c */
public class C3250c {

    /* renamed from: u */
    public static HashMap<Long, String> f7521u = new HashMap<>();

    /* renamed from: a */
    public C3248a f7522a = null;

    /* renamed from: b */
    public String f7523b = null;

    /* renamed from: c */
    public long f7524c = 0;

    /* renamed from: d */
    public long f7525d = 0;

    /* renamed from: e */
    public HashMap<String, C3252b> f7526e = null;

    /* renamed from: f */
    public byte[] f7527f = new byte[16];

    /* renamed from: g */
    public long f7528g = 0;

    /* renamed from: h */
    public long f7529h = 0;

    /* renamed from: i */
    public String f7530i = null;

    /* renamed from: j */
    public long f7531j = 0;

    /* renamed from: k */
    public long f7532k = 0;

    /* renamed from: l */
    public long f7533l = 0;

    /* renamed from: m */
    public long f7534m = 0;

    /* renamed from: n */
    public long f7535n = 0;

    /* renamed from: o */
    public long f7536o = 0;

    /* renamed from: p */
    public long f7537p = 0;

    /* renamed from: q */
    public long f7538q = 0;

    /* renamed from: r */
    public long f7539r = 0;

    /* renamed from: s */
    public long f7540s = 0;

    /* renamed from: t */
    public long f7541t = 0;

    /* renamed from: com.tencent.bugly.beta.utils.c$a */
    public static class C3251a {

        /* renamed from: a */
        public long f7542a = -1;

        /* renamed from: b */
        public long f7543b = 0;

        /* renamed from: c */
        public long f7544c = 0;

        /* renamed from: d */
        public long f7545d = -1;

        /* renamed from: e */
        public long f7546e = -1;

        /* renamed from: f */
        public long f7547f = 0;

        /* renamed from: g */
        public long f7548g = 0;

        /* renamed from: h */
        public long f7549h = 0;

        /* renamed from: i */
        public long f7550i = 0;

        /* renamed from: j */
        public long f7551j = 0;

        /* renamed from: a */
        public long mo38059a() {
            return this.f7542a;
        }

        /* renamed from: b */
        public long mo38061b() {
            return this.f7545d;
        }

        /* renamed from: c */
        public long mo38063c() {
            return this.f7546e;
        }

        /* renamed from: d */
        public long mo38065d() {
            return this.f7547f;
        }

        /* renamed from: e */
        public long mo38067e() {
            return this.f7551j;
        }

        /* renamed from: f */
        public synchronized void mo38069f(long j) {
            this.f7547f = j;
        }

        /* renamed from: g */
        public synchronized void mo38070g(long j) {
            this.f7548g = j;
        }

        /* renamed from: h */
        public synchronized void mo38071h(long j) {
            this.f7549h = j;
        }

        /* renamed from: i */
        public synchronized void mo38072i(long j) {
            this.f7550i = j;
        }

        /* renamed from: j */
        public synchronized void mo38073j(long j) {
            this.f7551j = j;
        }

        /* renamed from: a */
        public synchronized void mo38060a(long j) {
            this.f7542a = j;
        }

        /* renamed from: b */
        public synchronized void mo38062b(long j) {
            this.f7543b = j;
        }

        /* renamed from: c */
        public synchronized void mo38064c(long j) {
            this.f7544c = j;
        }

        /* renamed from: d */
        public synchronized void mo38066d(long j) {
            this.f7546e = j;
        }

        /* renamed from: e */
        public synchronized void mo38068e(long j) {
            this.f7545d = j;
        }
    }

    /* renamed from: com.tencent.bugly.beta.utils.c$b */
    public static class C3252b {

        /* renamed from: a */
        public String f7552a = null;

        /* renamed from: b */
        public long f7553b = -1;

        /* renamed from: c */
        public long f7554c = -1;

        /* renamed from: d */
        public long f7555d = 0;

        /* renamed from: e */
        public long f7556e = 0;

        /* renamed from: a */
        public long mo38074a() {
            return this.f7554c;
        }

        /* renamed from: b */
        public synchronized void mo38077b(long j) {
            this.f7554c = j;
        }

        /* renamed from: c */
        public synchronized void mo38078c(long j) {
            this.f7555d = j;
        }

        /* renamed from: d */
        public synchronized void mo38079d(long j) {
            this.f7556e = j;
        }

        /* renamed from: a */
        public synchronized void mo38076a(String str) {
            this.f7552a = str;
        }

        /* renamed from: a */
        public synchronized void mo38075a(long j) {
            this.f7553b = j;
        }
    }

    public C3250c(String str) {
        this.f7523b = str;
        f7521u.put(3L, SoInstallMgrSdk.X86);
        f7521u.put(7L, SoInstallMgrSdk.X86);
        f7521u.put(8L, SoInstallMgrSdk.MIPS);
        f7521u.put(10L, SoInstallMgrSdk.MIPS);
        f7521u.put(40L, SoInstallMgrSdk.ARMEABI);
        f7521u.put(62L, "x86_64");
        f7521u.put(183L, "arm64-v8a");
    }

    /* renamed from: a */
    private long m7847a(byte b) {
        if (1 == b) {
            return 32;
        }
        return 2 == b ? 64 : 0;
    }

    /* renamed from: b */
    private String m7852b() {
        return this.f7530i;
    }

    /* renamed from: c */
    private long m7854c() {
        return this.f7534m;
    }

    /* renamed from: d */
    private long m7855d() {
        return this.f7540s;
    }

    /* renamed from: e */
    private long m7856e() {
        return this.f7541t;
    }

    /* renamed from: f */
    private boolean m7857f() {
        if (!m7863l()) {
            return false;
        }
        if (!m7858g()) {
            m7861j();
            return false;
        }
        m7861j();
        return true;
    }

    /* renamed from: g */
    private synchronized boolean m7858g() {
        if (!m7859h()) {
            return false;
        }
        try {
            this.f7528g = this.f7522a.mo38055g();
            long g = this.f7522a.mo38055g();
            this.f7529h = g;
            this.f7530i = m7848a(g, this.f7524c);
            this.f7531j = this.f7522a.mo38056h();
            if (32 == this.f7524c) {
                long h = this.f7522a.mo38056h();
                this.f7531j = h;
                this.f7532k = h;
                this.f7533l = this.f7522a.mo38056h();
                this.f7534m = this.f7522a.mo38056h();
            } else if (64 != this.f7524c) {
                return false;
            } else {
                long i = this.f7522a.mo38057i();
                this.f7531j = i;
                this.f7532k = i;
                this.f7533l = this.f7522a.mo38057i();
                this.f7534m = this.f7522a.mo38057i();
            }
            this.f7535n = this.f7522a.mo38056h();
            this.f7536o = this.f7522a.mo38055g();
            this.f7537p = this.f7522a.mo38055g();
            this.f7538q = this.f7522a.mo38055g();
            this.f7539r = this.f7522a.mo38055g();
            this.f7540s = this.f7522a.mo38055g();
            this.f7541t = this.f7522a.mo38055g();
            return true;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
    }

    /* renamed from: h */
    private synchronized boolean m7859h() {
        if (!this.f7522a.mo38048a(this.f7527f)) {
            return false;
        }
        if (!m7850a(this.f7527f)) {
            String str = "Not a elf file: " + this.f7523b;
            return false;
        }
        long a = m7847a(this.f7527f[4]);
        this.f7524c = a;
        if (0 == a) {
            String str2 = "File format error: " + ((int) this.f7527f[4]);
            return false;
        }
        long b = m7851b(this.f7527f[5]);
        this.f7525d = b;
        if (C3248a.f7504a == b) {
            String str3 = "Endian error: " + ((int) this.f7527f[5]);
            return false;
        }
        this.f7522a.mo38046a(b);
        return true;
    }

    /* renamed from: i */
    private synchronized boolean m7860i() {
        HashMap<String, C3252b> a = m7849a(m7854c(), m7855d(), m7856e());
        this.f7526e = a;
        if (a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private synchronized void m7861j() {
        if (this.f7522a != null) {
            if (this.f7522a.mo38047a()) {
                this.f7522a = null;
            }
        }
    }

    /* renamed from: k */
    private synchronized boolean m7862k() {
        if (this.f7522a != null) {
            m7861j();
        }
        try {
            this.f7522a = new C3248a(this.f7523b, this.f7525d);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private synchronized boolean m7863l() {
        if (this.f7522a != null) {
            m7861j();
        }
        try {
            this.f7522a = new C3248a(this.f7523b);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private synchronized C3251a m7864m() {
        C3251a aVar = new C3251a();
        try {
            aVar.mo38060a(this.f7522a.mo38056h());
            aVar.mo38062b(this.f7522a.mo38056h());
            if (32 == this.f7524c) {
                aVar.mo38064c(this.f7522a.mo38056h());
                aVar.mo38068e(this.f7522a.mo38056h());
                aVar.mo38066d(this.f7522a.mo38056h());
                aVar.mo38069f(this.f7522a.mo38056h());
            } else if (64 != this.f7524c) {
                return null;
            } else {
                aVar.mo38064c(this.f7522a.mo38057i());
                aVar.mo38068e(this.f7522a.mo38057i());
                aVar.mo38066d(this.f7522a.mo38057i());
                aVar.mo38069f(this.f7522a.mo38057i());
            }
            aVar.mo38070g(this.f7522a.mo38056h());
            aVar.mo38071h(this.f7522a.mo38056h());
            if (32 == this.f7524c) {
                aVar.mo38072i(this.f7522a.mo38056h());
                aVar.mo38073j(this.f7522a.mo38056h());
            } else if (64 != this.f7524c) {
                return null;
            } else {
                aVar.mo38072i(this.f7522a.mo38057i());
                aVar.mo38073j(this.f7522a.mo38057i());
            }
            return aVar;
        } catch (IOException e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public synchronized String mo38058a() {
        if (!m7857f()) {
            return null;
        }
        String b = m7852b();
        if (!b.equals(SoInstallMgrSdk.ARMEABI)) {
            return b;
        }
        if (!m7860i()) {
            return b;
        }
        C3252b bVar = this.f7526e.get(".ARM.attributes");
        if (bVar == null) {
            return b;
        }
        return C3249b.m7838a(this.f7523b, this.f7525d, bVar.mo38074a());
    }

    /* renamed from: b */
    private long m7851b(byte b) {
        if (1 == b) {
            return C3248a.f7506c;
        }
        if (2 == b) {
            return C3248a.f7505b;
        }
        return C3248a.f7504a;
    }

    /* renamed from: b */
    private synchronized HashMap<String, C3252b> m7853b(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            C3321an.m8356d("The SO file is invalid or has a shell.", new Object[0]);
            return null;
        }
        Vector vector = new Vector();
        for (int i = 0; ((long) i) < j; i++) {
            vector.add(m7864m());
        }
        C3251a aVar = (C3251a) vector.get((int) j2);
        long length = new File(this.f7523b).length();
        C3321an.m8355c("File length = %d", Long.valueOf(length));
        if (aVar.mo38063c() >= length) {
            C3321an.m8356d("The SO file is invalid or has a shell.", new Object[0]);
            return null;
        }
        C3253d dVar = new C3253d(this.f7523b, aVar.mo38063c(), aVar.mo38065d());
        HashMap<String, C3252b> hashMap = new HashMap<>();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            C3251a aVar2 = (C3251a) it.next();
            String a = dVar.mo38080a(aVar2.mo38059a());
            C3252b bVar = new C3252b();
            bVar.mo38076a(a);
            bVar.mo38075a(aVar2.mo38061b());
            bVar.mo38077b(aVar2.mo38063c());
            bVar.mo38078c(aVar2.mo38065d());
            bVar.mo38079d(aVar2.mo38067e());
            hashMap.put(a, bVar);
        }
        dVar.mo38081a();
        return hashMap;
    }

    /* renamed from: a */
    public static String m7848a(long j, long j2) {
        String str = f7521u.get(Long.valueOf(j));
        return (64 != j2 || !str.equals(SoInstallMgrSdk.MIPS)) ? str : "mips64";
    }

    /* renamed from: a */
    public static boolean m7850a(byte[] bArr) {
        if (bArr.length >= 3 && Byte.MAX_VALUE == bArr[0] && 69 == bArr[1] && 76 == bArr[2] && 70 == bArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private synchronized HashMap<String, C3252b> m7849a(long j, long j2, long j3) {
        if (!m7862k()) {
            m7861j();
            return null;
        } else if (!this.f7522a.mo38050b(j)) {
            m7861j();
            return null;
        } else {
            HashMap<String, C3252b> b = m7853b(j2, j3);
            m7861j();
            return b;
        }
    }
}
