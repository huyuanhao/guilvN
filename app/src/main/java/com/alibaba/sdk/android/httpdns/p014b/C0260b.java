package com.alibaba.sdk.android.httpdns.p014b;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.p015c.C0268a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.b */
public class C0260b {

    /* renamed from: a */
    public static AbstractC0264f f574a;

    /* renamed from: a */
    public static C0268a f575a;

    /* renamed from: a */
    public static boolean f576a;

    /* renamed from: a */
    public static List<C0263e> m436a() {
        ArrayList arrayList = new ArrayList();
        if (!f576a) {
            return arrayList;
        }
        arrayList.addAll(f574a.mo3957a());
        return arrayList;
    }

    /* renamed from: a */
    public static void m437a(Context context) {
        m438a(context, null);
    }

    /* renamed from: a */
    public static void m438a(Context context, C0268a aVar) {
        f574a = new C0259a(context);
        f575a = aVar;
        if (aVar == null) {
            f575a = C0268a.m469a();
        }
    }

    /* renamed from: a */
    public static void m439a(C0263e eVar) {
        if (eVar != null) {
            f574a.mo3958a(eVar);
        }
    }

    /* renamed from: a */
    public static void m440a(boolean z) {
        f576a = z;
    }

    /* renamed from: a */
    public static boolean m441a() {
        return f576a;
    }

    /* renamed from: b */
    public static void m442b(Context context) {
        if (context != null) {
            f575a.m474c(context);
        }
    }

    /* renamed from: b */
    public static void m443b(C0263e eVar) {
        if (eVar != null) {
            f574a.mo3959b(eVar);
        }
    }

    /* renamed from: g */
    public static String m444g() {
        return f575a.mo3970g();
    }
}
