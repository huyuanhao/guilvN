package com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.updatesdk.sdk.a.d.b.a.c */
public class C1286c implements AbstractC1283a {

    /* renamed from: a */
    public static C1286c f1441a;

    /* renamed from: b */
    public static final Object f1442b = new Object();

    /* renamed from: b */
    public static C1286c m1613b() {
        C1286c cVar;
        synchronized (f1442b) {
            if (f1441a == null) {
                f1441a = new C1286c();
            }
            cVar = f1441a;
        }
        return cVar;
    }

    /* renamed from: c */
    public static Object m1614c() {
        StringBuilder sb;
        String str;
        try {
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e.toString();
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e2.toString();
        } catch (IllegalArgumentException e3) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e3.toString();
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e4.toString();
        } catch (ClassNotFoundException e5) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e5.toString();
        } catch (Exception e6) {
            sb = new StringBuilder();
            sb.append(" getDefaultMSimTelephonyManager wrong ");
            str = e6.toString();
        }
        sb.append(str);
        C1278a.m1584d("MutiCardHwImpl", sb.toString());
        return null;
    }

    @Override // com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a.AbstractC1283a
    /* renamed from: a */
    public int mo15894a() {
        StringBuilder sb;
        String str;
        try {
            Object c = m1614c();
            if (c != null) {
                return ((Integer) c.getClass().getMethod("getPreferredDataSubscription", new Class[0]).invoke(c, new Object[0])).intValue();
            }
            return 0;
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e.toString();
            sb.append(str);
            C1278a.m1584d("MutiCardHwImpl", sb.toString());
            return -1;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e2.toString();
            sb.append(str);
            C1278a.m1584d("MutiCardHwImpl", sb.toString());
            return -1;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e3.toString();
            sb.append(str);
            C1278a.m1584d("MutiCardHwImpl", sb.toString());
            return -1;
        }
    }
}
