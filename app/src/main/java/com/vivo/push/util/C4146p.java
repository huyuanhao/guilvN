package com.vivo.push.util;

import android.content.Context;

/* renamed from: com.vivo.push.util.p */
public final class C4146p {

    /* renamed from: a */
    public static final AbstractC4145o f11123a = new C4144n();

    /* renamed from: b */
    public static boolean f11124b = C4156z.m11267b("persist.sys.log.ctrl", "no").equals("yes");

    /* renamed from: c */
    public static boolean f11125c;

    /* renamed from: a */
    public static boolean m11210a() {
        return f11124b;
    }

    /* renamed from: b */
    public static int m11211b(String str, String str2) {
        return f11123a.mo41198b(str, str2);
    }

    /* renamed from: c */
    public static int m11214c(String str, String str2) {
        return f11123a.mo41201c(str, str2);
    }

    /* renamed from: d */
    public static int m11216d(String str, String str2) {
        return f11123a.mo41203d(str, str2);
    }

    /* renamed from: e */
    public static int m11217e(String str, String str2) {
        return f11123a.mo41204e(str, str2);
    }

    /* renamed from: a */
    public static void m11209a(boolean z) {
        f11124b = z;
        f11125c = z;
    }

    /* renamed from: b */
    public static int m11212b(String str, String str2, Throwable th) {
        return f11123a.mo41199b(str, str2, th);
    }

    /* renamed from: c */
    public static void m11215c(Context context, String str) {
        f11123a.mo41202c(context, str);
    }

    /* renamed from: b */
    public static void m11213b(Context context, String str) {
        f11123a.mo41200b(context, str);
    }

    /* renamed from: a */
    public static int m11204a(String str, String str2) {
        return f11123a.mo41193a(str, str2);
    }

    /* renamed from: a */
    public static int m11206a(String str, Throwable th) {
        return f11123a.mo41195a(str, th);
    }

    /* renamed from: a */
    public static int m11205a(String str, String str2, Throwable th) {
        return f11123a.mo41194a(str, str2, th);
    }

    /* renamed from: a */
    public static String m11207a(Throwable th) {
        return f11123a.mo41196a(th);
    }

    /* renamed from: a */
    public static void m11208a(Context context, String str) {
        f11123a.mo41197a(context, str);
    }
}
