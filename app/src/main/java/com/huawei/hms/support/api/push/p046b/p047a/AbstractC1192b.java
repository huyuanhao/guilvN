package com.huawei.hms.support.api.push.p046b.p047a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1191c;
import com.huawei.hms.support.api.push.p046b.p049b.C1197d;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.push.b.a.b */
public abstract class AbstractC1192b {
    /* renamed from: a */
    public static String m1284a(Context context, String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            str2 = C1197d.m1297b(context, new C1191c(context, str).mo15700b("token_info_v2"));
        } catch (Exception e) {
            C1202a.m1320d("PushDataEncrypterManager", "getSecureData" + e.getMessage());
        }
        if (TextUtils.isEmpty(str2)) {
            C1202a.m1316a("PushDataEncrypterManager", "getSecureData not exist");
        }
        return str2;
    }

    /* renamed from: b */
    public static void m1286b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                new C1191c(context, str).mo15702d("token_info_v2");
            } catch (Exception e) {
                C1202a.m1320d("PushDataEncrypterManager", "removeSecureData" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static boolean m1285a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C1191c(context, str).mo15699a("token_info_v2", C1197d.m1296a(context, str2));
    }
}
