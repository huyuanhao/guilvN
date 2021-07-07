package com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.p072a.AbstractC1283a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.updatesdk.sdk.a.d.b.a.b */
public class C1285b {

    /* renamed from: a */
    public static AbstractC1283a.EnumC1284a f1439a = AbstractC1283a.EnumC1284a.MODE_SUPPORT_UNKNOWN;

    /* renamed from: b */
    public static AbstractC1283a f1440b;

    /* renamed from: a */
    public static AbstractC1283a m1609a() {
        m1610b();
        f1440b = f1439a == AbstractC1283a.EnumC1284a.MODE_SUPPORT_MTK_GEMINI ? C1287d.m1616b() : C1286c.m1613b();
        return f1440b;
    }

    /* renamed from: b */
    public static boolean m1610b() {
        AbstractC1283a.EnumC1284a aVar;
        if (f1439a == AbstractC1283a.EnumC1284a.MODE_SUPPORT_UNKNOWN) {
            if (m1612d()) {
                aVar = AbstractC1283a.EnumC1284a.MODE_SUPPORT_MTK_GEMINI;
            } else if (m1611c()) {
                aVar = AbstractC1283a.EnumC1284a.MODE_SUPPORT_HW_GEMINI;
            } else {
                f1439a = AbstractC1283a.EnumC1284a.MODE_NOT_SUPPORT_GEMINI;
            }
            f1439a = aVar;
            return true;
        } else if (f1439a == AbstractC1283a.EnumC1284a.MODE_SUPPORT_HW_GEMINI || f1439a == AbstractC1283a.EnumC1284a.MODE_SUPPORT_MTK_GEMINI) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m1611c() {
        String str;
        StringBuilder sb;
        String str2;
        boolean z = false;
        try {
            Object c = C1286c.m1614c();
            if (c != null) {
                z = ((Boolean) c.getClass().getMethod("isMultiSimEnabled", new Class[0]).invoke(c, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException e) {
            str = "MSimTelephonyManager.getDefault().isMultiSimEnabled()?" + e.toString();
            C1278a.m1584d("mutiCardFactory", str);
            C1278a.m1580a("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append("MSimTelephonyManager.getDefault().isMultiSimEnabled()");
            str2 = e2.toString();
            sb.append(str2);
            str = sb.toString();
            C1278a.m1584d("mutiCardFactory", str);
            C1278a.m1580a("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append("MSimTelephonyManager.getDefault().isMultiSimEnabled()");
            str2 = e3.toString();
            sb.append(str2);
            str = sb.toString();
            C1278a.m1584d("mutiCardFactory", str);
            C1278a.m1580a("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        }
        C1278a.m1580a("mutiCardFactory", "isHwGeminiSupport1 " + z);
        return z;
    }

    /* renamed from: d */
    public static boolean m1612d() {
        boolean z;
        StringBuilder sb;
        String str;
        try {
            Field declaredField = Class.forName("com.mediatek.common.featureoption.FeatureOption").getDeclaredField("MTK_GEMINI_SUPPORT");
            declaredField.setAccessible(true);
            z = declaredField.getBoolean(null);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e.toString();
        } catch (NoSuchFieldException e2) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e2.toString();
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e3.toString();
        } catch (Exception e4) {
            sb = new StringBuilder();
            sb.append("FeatureOption.MTK_GEMINI_SUPPORT");
            str = e4.toString();
        }
        C1278a.m1580a("mutiCardFactory", "isMtkGeminiSupport " + z);
        return z;
        sb.append(str);
        C1278a.m1582b("mutiCardFactory", sb.toString());
        z = false;
        C1278a.m1580a("mutiCardFactory", "isMtkGeminiSupport " + z);
        return z;
    }
}
