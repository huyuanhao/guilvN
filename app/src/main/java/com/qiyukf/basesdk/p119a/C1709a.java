package com.qiyukf.basesdk.p119a;

import android.text.TextUtils;
import android.util.Log;
import com.p118pd.sdk.C8932ooOOO0o;

/* renamed from: com.qiyukf.basesdk.a.a */
public final class C1709a {

    /* renamed from: a */
    public static C1713c f3081a = null;

    /* renamed from: b */
    public static int f3082b = 3;

    /* renamed from: a */
    public static C1713c m3009a() {
        return f3081a;
    }

    /* renamed from: a */
    public static void m3010a(int i, String str, String str2, Throwable th) {
        if (i >= f3082b) {
            long currentTimeMillis = System.currentTimeMillis();
            long id = Thread.currentThread().getId();
            Log.println(i, str, id + C8932ooOOO0o.OooO0OO + str2 + '\n' + Log.getStackTraceString(th));
            try {
                if (f3081a != null) {
                    f3081a.mo33866a(str, currentTimeMillis, str2, th);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m3011a(String str, String str2) {
        m3010a(4, str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m3012a(String str, String str2, int i, boolean z) {
        f3082b = i;
        if (!TextUtils.isEmpty(str)) {
            C1713c cVar = f3081a;
            if (cVar == null) {
                f3081a = new C1713c(str, str2, z);
            } else {
                cVar.mo33865a(str);
            }
        }
    }

    /* renamed from: a */
    public static void m3013a(String str, String str2, Throwable th) {
        m3010a(4, str, str2, th);
    }

    /* renamed from: b */
    public static void m3014b(String str, String str2) {
        m3010a(2, str, str2, (Throwable) null);
    }

    /* renamed from: b */
    public static void m3015b(String str, String str2, Throwable th) {
        m3010a(6, str, str2, th);
    }

    /* renamed from: c */
    public static void m3016c(String str, String str2) {
        m3015b(str, str2, null);
    }

    /* renamed from: c */
    public static void m3017c(String str, String str2, Throwable th) {
        m3010a(3, str, str2, th);
    }

    /* renamed from: d */
    public static void m3018d(String str, String str2) {
        m3010a(3, str, str2, (Throwable) null);
    }

    /* renamed from: d */
    public static void m3019d(String str, String str2, Throwable th) {
        m3010a(5, str, str2, th);
    }

    /* renamed from: e */
    public static void m3020e(String str, String str2) {
        m3010a(5, str, str2, (Throwable) null);
    }
}
