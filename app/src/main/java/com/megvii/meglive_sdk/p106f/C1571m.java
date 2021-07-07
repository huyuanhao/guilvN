package com.megvii.meglive_sdk.p106f;

/* renamed from: com.megvii.meglive_sdk.f.m */
public final class C1571m {

    /* renamed from: a */
    public static boolean f2607a = false;

    /* renamed from: b */
    public static int f2608b = 2000;

    /* renamed from: a */
    public static void m2655a(String str, String str2) {
        if (f2607a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" === ");
            sb.append(str2);
        }
    }

    /* renamed from: b */
    public static void m2656b(String str, String str2) {
        if (f2607a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" === ");
            sb.append(str2);
        }
    }

    /* renamed from: c */
    public static void m2657c(String str, String str2) {
        if (f2607a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" === ");
            sb.append(str2);
        }
    }

    /* renamed from: a */
    public static void m2654a(String str) {
        int length = str.length();
        int i = f2608b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 100) {
            if (length > i) {
                str.substring(i3, i);
                i2++;
                i3 = i;
                i = f2608b + i;
            } else {
                str.substring(i3, length);
                return;
            }
        }
    }
}
