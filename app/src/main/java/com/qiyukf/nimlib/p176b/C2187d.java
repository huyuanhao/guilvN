package com.qiyukf.nimlib.p176b;

import com.qiyukf.basesdk.C1708a;
import com.umeng.commonsdk.proguard.C3617o;

/* renamed from: com.qiyukf.nimlib.b.d */
public final class C2187d {

    /* renamed from: com.qiyukf.nimlib.b.d$a */
    public enum EnumC2188a {
        TEST("t", "imtest.netease.im:8000", "http://imtest.netease.im/lbs/conf"),
        PRE_REL(C3617o.f9365as, "106.2.34.102:8080", "http://223.252.220.223/lbsrc/conf.jsp"),
        REL("r", "link.netease.im:8080", "https://lbs.netease.im/lbs/conf.jsp");
        

        /* renamed from: d */
        public String f4371d;

        /* renamed from: e */
        public String f4372e;

        /* renamed from: f */
        public String f4373f;

        /* access modifiers changed from: public */
        EnumC2188a(String str, String str2, String str3) {
            this.f4371d = str;
            this.f4372e = str2;
            this.f4373f = str3;
        }
    }

    /* renamed from: a */
    public static int m4514a() {
        return C2189e.m4520b();
    }

    /* renamed from: b */
    public static boolean m4515b() {
        return C2189e.m4519a();
    }

    /* renamed from: c */
    public static void m4516c() {
        C2189e.m4521c();
    }

    /* renamed from: d */
    public static boolean m4517d() {
        return C2189e.f4374a == EnumC2188a.PRE_REL;
    }

    /* renamed from: e */
    public static boolean m4518e() {
        return C1708a.m3005d() != null;
    }
}
