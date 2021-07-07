package com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.updatesdk.sdk.a.d.b.a.d */
public final class C1287d implements AbstractC1283a {

    /* renamed from: a */
    public static C1287d f1443a;

    /* renamed from: b */
    public static final Object f1444b = new Object();

    /* renamed from: b */
    public static C1287d m1616b() {
        C1287d dVar;
        synchronized (f1444b) {
            if (f1443a == null) {
                f1443a = new C1287d();
            }
            dVar = f1443a;
        }
        return dVar;
    }

    /* renamed from: c */
    public static Object m1617c() {
        StringBuilder sb;
        String str;
        try {
            Class<?> cls = Class.forName("com.mediatek.telephony.TelephonyManagerEx");
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e.toString();
        } catch (SecurityException e2) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e2.toString();
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e3.toString();
        } catch (IllegalAccessException e4) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e4.toString();
        } catch (IllegalArgumentException e5) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e5.toString();
        } catch (InvocationTargetException e6) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e6.toString();
        } catch (Exception e7) {
            sb = new StringBuilder();
            sb.append(" getDefaultTelephonyManagerEx wrong ");
            str = e7.toString();
        }
        sb.append(str);
        C1278a.m1584d("mutiCardMTKImpl", sb.toString());
        return null;
    }

    @Override // com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a.AbstractC1283a
    /* renamed from: a */
    public int mo15894a() {
        StringBuilder sb;
        String str;
        Object c = m1617c();
        if (c == null) {
            return 0;
        }
        try {
            return ((Integer) c.getClass().getMethod("getPreferredDataSubscription", new Class[0]).invoke(c, new Object[0])).intValue();
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e.toString();
            sb.append(str);
            C1278a.m1584d("mutiCardMTKImpl", sb.toString());
            return -1;
        } catch (InvocationTargetException e2) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e2.toString();
            sb.append(str);
            C1278a.m1584d("mutiCardMTKImpl", sb.toString());
            return -1;
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append(" getPreferredDataSubscription wrong ");
            str = e3.toString();
            sb.append(str);
            C1278a.m1584d("mutiCardMTKImpl", sb.toString());
            return -1;
        }
    }
}
