package com.p118pd.sdk;

import android.os.Build;
import java.io.File;

/* renamed from: com.pd.sdk.o0o00o00  reason: case insensitive filesystem */
public final class C7566o0o00o00 {
    public static C7566o0o00o00 OooO00o = new C7566o0o00o00();

    public static String OooO() {
        return Build.PRODUCT;
    }

    public static C7566o0o00o00 OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19215OooO00o() {
        return "android";
    }

    public static String OooO00o(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19216OooO00o() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i] + C9053ooOoOo.OooO00o).exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[Catch:{ Exception -> 0x0066 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7566o0o00o00.OooO00o(android.content.Context):boolean");
    }

    public static String OooO0O0() {
        return Build.BOARD;
    }

    public static String OooO0OO() {
        return Build.BRAND;
    }

    public static String OooO0Oo() {
        return Build.DEVICE;
    }

    public static String OooO0o() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String OooO0o0() {
        return Build.DISPLAY;
    }

    public static String OooO0oO() {
        return Build.MANUFACTURER;
    }

    public static String OooO0oo() {
        return Build.MODEL;
    }

    public static String OooOO0() {
        return Build.VERSION.RELEASE;
    }

    public static String OooOO0O() {
        return Build.VERSION.SDK;
    }

    public static String OooOO0o() {
        return Build.TAGS;
    }

    public static String OooOOO0() {
        return OooO00o("ro.kernel.qemu", "0");
    }
}
