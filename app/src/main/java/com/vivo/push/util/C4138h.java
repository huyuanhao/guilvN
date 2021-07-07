package com.vivo.push.util;

import android.os.Looper;

/* renamed from: com.vivo.push.util.h */
public final class C4138h {
    /* renamed from: a */
    public static void m11169a(String str) {
        if (C4146p.m11210a() && Looper.myLooper() == Looper.getMainLooper()) {
            String str2 = "Operation: " + str + " in main thread!";
            new Throwable();
        }
    }
}
