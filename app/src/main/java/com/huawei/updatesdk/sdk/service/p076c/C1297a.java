package com.huawei.updatesdk.sdk.service.p076c;

import com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.sdk.service.c.a */
public class C1297a {

    /* renamed from: a */
    public static final Map<String, Class> f1462a = new HashMap();

    /* renamed from: a */
    public static C1302d m1664a(String str) throws InstantiationException, IllegalAccessException {
        Class cls = f1462a.get(str);
        if (cls != null) {
            return (C1302d) cls.newInstance();
        }
        throw new InstantiationException("ResponseBean class not found, method:" + str);
    }

    /* renamed from: a */
    public static void m1665a(String str, Class cls) {
        f1462a.put(str, cls);
    }
}
