package com.qiyukf.nimlib;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.service.NimService;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nimlib.d */
public final class C2205d {

    /* renamed from: a */
    public static StatusCode f4389a = StatusCode.UNLOGIN;

    /* renamed from: b */
    public static boolean f4390b;

    /* renamed from: c */
    public static boolean f4391c;

    /* renamed from: d */
    public static boolean f4392d;

    /* renamed from: e */
    public static String f4393e = "";

    /* renamed from: f */
    public static int f4394f;

    /* renamed from: g */
    public static int f4395g;

    /* renamed from: h */
    public static ArrayList<C2107a> f4396h;

    /* renamed from: a */
    public static void m4568a(int i) {
        f4395g = i;
    }

    /* renamed from: a */
    public static void m4569a(Context context) {
        String str = context.getApplicationInfo().processName;
        String b = m4575b(context);
        String a = C1863d.m3546a(context);
        if (TextUtils.equals(a, str)) {
            m4576b(1);
        }
        if (TextUtils.equals(a, b)) {
            m4576b(2);
        }
    }

    /* renamed from: a */
    public static void m4570a(StatusCode statusCode) {
        f4389a = statusCode;
    }

    /* renamed from: a */
    public static void m4571a(String str) {
        f4393e = str;
    }

    /* renamed from: a */
    public static void m4572a(ArrayList<C2107a> arrayList) {
        f4396h = arrayList;
    }

    /* renamed from: a */
    public static final void m4573a(boolean z) {
        f4390b = z;
    }

    /* renamed from: a */
    public static final boolean m4574a() {
        return f4390b;
    }

    /* renamed from: b */
    public static String m4575b(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context, NimService.class), 128).processName;
        } catch (PackageManager.NameNotFoundException e) {
            C1709a.m3015b("getServiceProcessName is error", "", e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m4576b(int i) {
        f4394f = i | f4394f;
    }

    /* renamed from: b */
    public static final void m4577b(boolean z) {
        f4391c = z;
    }

    /* renamed from: b */
    public static final boolean m4578b() {
        return f4391c;
    }

    /* renamed from: c */
    public static final void m4579c(boolean z) {
        f4392d = z;
    }

    /* renamed from: c */
    public static final boolean m4580c() {
        return f4392d;
    }

    /* renamed from: d */
    public static String m4581d() {
        return f4393e;
    }

    /* renamed from: e */
    public static StatusCode m4582e() {
        return f4389a;
    }

    /* renamed from: f */
    public static boolean m4583f() {
        return (f4394f & 1) != 0;
    }

    /* renamed from: g */
    public static boolean m4584g() {
        return (f4394f & 2) != 0;
    }

    /* renamed from: h */
    public static int m4585h() {
        return f4395g;
    }

    /* renamed from: i */
    public static ArrayList<C2107a> m4586i() {
        return f4396h;
    }
}
