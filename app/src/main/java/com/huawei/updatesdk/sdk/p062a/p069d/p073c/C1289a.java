package com.huawei.updatesdk.sdk.p062a.p069d.p073c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a.C1285b;
import com.p118pd.sdk.C9040ooOoOO;

/* renamed from: com.huawei.updatesdk.sdk.a.d.c.a */
public class C1289a {

    /* renamed from: a */
    public static final Uri f1445a = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: b */
    public static final Uri f1446b = Uri.parse("content://telephony/carriers/preferapn/0");

    /* renamed from: c */
    public static final Uri f1447c = Uri.parse("content://telephony/carriers/preferapn/1");

    /* renamed from: com.huawei.updatesdk.sdk.a.d.c.a$a */
    public static class C1290a {

        /* renamed from: a */
        public String f1448a;

        /* renamed from: b */
        public String f1449b;

        /* renamed from: c */
        public String f1450c;

        /* renamed from: a */
        public String mo15895a() {
            return this.f1448a;
        }

        /* renamed from: a */
        public void mo15896a(String str) {
            this.f1448a = str;
        }

        /* renamed from: b */
        public String mo15897b() {
            return this.f1449b;
        }

        /* renamed from: b */
        public void mo15898b(String str) {
            this.f1449b = str;
        }

        /* renamed from: c */
        public void mo15899c(String str) {
            this.f1450c = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1289a.C1290a m1621a(android.content.Context r6) throws java.lang.SecurityException {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1289a.m1621a(android.content.Context):com.huawei.updatesdk.sdk.a.d.c.a$a");
    }

    /* renamed from: b */
    public static boolean m1622b(Context context) {
        try {
            C1290a a = m1621a(context);
            if (a != null) {
                return a.mo15897b() != null && a.mo15897b().contains(C9040ooOoOO.OooO0Oo);
            }
            return true;
        } catch (SecurityException e) {
            C1278a.m1581a("ApnUtil", "isWap(), SecurityException: ", e);
            return false;
        }
    }

    /* renamed from: c */
    public static Cursor m1623c(Context context) {
        return context.getContentResolver().query(f1445a, null, null, null, null);
    }

    /* renamed from: d */
    public static Cursor m1624d(Context context) {
        Cursor cursor;
        if (C1285b.m1609a().mo15894a() == 0) {
            cursor = m1626f(context);
            if (cursor == null) {
                cursor = m1625e(context);
            }
        } else {
            cursor = m1625e(context);
            if (cursor == null) {
                cursor = m1626f(context);
            }
        }
        return cursor == null ? m1623c(context) : cursor;
    }

    /* renamed from: e */
    public static Cursor m1625e(Context context) {
        return context.getContentResolver().query(f1447c, null, null, null, null);
    }

    /* renamed from: f */
    public static Cursor m1626f(Context context) {
        return context.getContentResolver().query(f1446b, null, null, null, null);
    }
}
