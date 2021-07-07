package com.p118pd.sdk;

import com.umeng.commonsdk.framework.UMModuleRegister;

/* renamed from: com.pd.sdk.ooOoooOO  reason: case insensitive filesystem */
public class C9094ooOoooOO {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22445OooO00o = "hsdk";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22446OooO00o = true;
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f22447OooO0O0 = "alid ";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22448OooO0O0 = false;
    public static String OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final /* synthetic */ boolean f22449OooO0OO = (!C9094ooOoooOO.class.desiredAssertionStatus());
    public static String OooO0Oo = null;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20763OooO00o() {
        C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(500), C9112oooO000O.m20809OooO0O0() ? 900000 : 90000);
    }

    public static String OooO0O0() {
        if (C9111oooO0000.m20791OooO00o(OooO0Oo)) {
            synchronized (OooO0O0) {
                OooO0Oo = C9111oooO0000.OooO00o(C9112oooO000O.OooOO0O(), "https://errlog.umeng.com" + "/api/crashsdk/validate", true);
            }
        }
        return OooO0Oo;
    }

    public static String OooO0OO() {
        byte[] bArr;
        String OooO0O02;
        byte[] OooO00o2;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        OooO00o(sb, "platform", C9120oooO00oO.m20866OooO0oo());
        OooO00o(sb, "pkgname", C9119oooO00o0.f22566OooO00o);
        OooO00o(sb, UMModuleRegister.PROCESS, C9278ooooo0.OooO());
        OooO00o(sb, "version", C9119oooO00o0.m20832OooO00o());
        OooO00o(sb, "cver", "3.2.0.4");
        OooO00o(sb, "ctag", "umeng");
        OooO00o(sb, "inter", C9120oooO00oO.m20860OooO0o() ? "true" : "false");
        OooO00o(sb, "os", "android");
        String sb2 = sb.toString();
        byte[] bArr3 = new byte[16];
        C9092ooOoooO.OooO00o(bArr3, 0, C9110oooO000.m20779OooO00o());
        C9092ooOoooO.OooO00o(bArr3, 4, C9092ooOoooO.OooO00o());
        C9092ooOoooO.OooO00o(bArr3, 8, m20765OooO00o());
        C9092ooOoooO.OooO00o(bArr3, 12, C9119oooO00o0.m20838OooO00o());
        try {
            bArr = C9092ooOoooO.OooO00o(sb2.getBytes(), bArr3, true);
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            bArr = null;
        }
        if (bArr == null || (OooO0O02 = OooO0O0()) == null || (OooO00o2 = C9092ooOoooO.OooO00o(OooO0O02, bArr)) == null) {
            return null;
        }
        try {
            bArr2 = C9092ooOoooO.OooO00o(OooO00o2, bArr3, false);
        } catch (Throwable th2) {
            C9111oooO0000.OooO00o(th2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return new String(bArr2);
        }
        return null;
    }

    public static void OooO00o(int i) {
        if (i == 500) {
            synchronized (OooO00o) {
                OooO0OO = null;
                OooO00o(!C9112oooO000O.m20802OooO00o());
                if (C9111oooO0000.OooO0O0(OooO0OO)) {
                    C9110oooO000.OooO00o(OooO0OO);
                }
            }
        } else if (!f22449OooO0OO) {
            throw new AssertionError();
        }
    }

    public static String OooO00o() {
        try {
            return "inv" + f22447OooO0O0 + "cras" + f22445OooO00o;
        } catch (Throwable th) {
            C9111oooO0000.OooO0O0(th);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(boolean r12) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9094ooOoooOO.OooO00o(boolean):boolean");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20765OooO00o() {
        return new byte[]{6, 0, 23, 8};
    }

    public static StringBuilder OooO00o(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append(C8932ooOOO0o.OooO0Oo);
        sb.append(str2);
        return sb;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20764OooO00o() {
        try {
            if (!C9278ooooo0.m21180OooO00o()) {
                if (!C9112oooO000O.m20811OooO0OO()) {
                    OooO00o(true);
                    return f22446OooO00o;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
    }
}
