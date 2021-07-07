package com.megvii.apo.util;

import com.megvii.apo.C1471c;

/* renamed from: com.megvii.apo.util.e */
public final class C1495e {

    /* renamed from: a */
    public static final boolean f2015a = C1471c.f1969a;

    /* renamed from: a */
    public static void m2257a(String str) {
        if (f2015a) {
            StringBuilder sb = new StringBuilder("--thread name-->");
            sb.append(Thread.currentThread().getName().toString());
            sb.append("--thread id-->");
            sb.append(Thread.currentThread().getId());
            sb.append("--");
            sb.append(str);
        }
    }

    /* renamed from: a */
    public static void m2258a(Throwable th) {
        if (f2015a) {
            th.printStackTrace();
        }
    }
}
