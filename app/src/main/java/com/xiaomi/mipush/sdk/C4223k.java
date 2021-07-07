package com.xiaomi.mipush.sdk;

import com.xiaomi.push.EnumC4499ht;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.k */
public class C4223k {

    /* renamed from: a */
    public static HashMap<EnumC4216d, C4224a> f11310a = new HashMap<>();

    /* renamed from: com.xiaomi.mipush.sdk.k$a */
    public static class C4224a {

        /* renamed from: a */
        public String f11311a;

        /* renamed from: b */
        public String f11312b;

        public C4224a(String str, String str2) {
            this.f11311a = str;
            this.f11312b = str2;
        }
    }

    static {
        m11574a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI, new C4224a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        m11574a(EnumC4216d.ASSEMBLE_PUSH_FCM, new C4224a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        m11574a(EnumC4216d.ASSEMBLE_PUSH_COS, new C4224a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        m11574a(EnumC4216d.ASSEMBLE_PUSH_FTOS, new C4224a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    /* renamed from: a */
    public static EnumC4212bb m11571a(EnumC4216d dVar) {
        int i = C4225l.f11313a[dVar.ordinal()];
        if (i == 1) {
            return EnumC4212bb.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return EnumC4212bb.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return EnumC4212bb.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return EnumC4212bb.UPLOAD_FTOS_TOKEN;
    }

    /* renamed from: a */
    public static C4224a m11572a(EnumC4216d dVar) {
        return f11310a.get(dVar);
    }

    /* renamed from: a */
    public static EnumC4499ht m11573a(EnumC4216d dVar) {
        return EnumC4499ht.AggregatePushSwitch;
    }

    /* renamed from: a */
    public static void m11574a(EnumC4216d dVar, C4224a aVar) {
        if (aVar != null) {
            f11310a.put(dVar, aVar);
        }
    }
}
