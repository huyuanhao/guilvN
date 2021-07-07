package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.vivo.push.PushClientConstants;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4563l;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.ai */
public class C4190ai {
    /* renamed from: a */
    public static HashMap<String, String> m11403a(Context context, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("appToken", C4209b.m11491a(context).mo41428b());
            hashMap.put("regId", MiPushClient.getRegId(context));
            hashMap.put("appId", C4209b.m11491a(context).m11495a());
            hashMap.put("regResource", C4209b.m11491a(context).mo41433e());
            if (!C4563l.m13731d()) {
                String g = C4506i.m13049g(context);
                if (!TextUtils.isEmpty(g)) {
                    hashMap.put("imeiMd5", C4285bf.m11800a(g));
                }
            }
            hashMap.put("isMIUI", String.valueOf(C4563l.m13726a()));
            hashMap.put("miuiVersion", C4563l.m13723a());
            hashMap.put("devId", C4506i.m13034a(context, true));
            hashMap.put(Constants.KEY_MODEL, Build.MODEL);
            hashMap.put(PushClientConstants.TAG_PKG_NAME, context.getPackageName());
            hashMap.put("sdkVersion", "3_7_0");
            hashMap.put("androidVersion", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("os", Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL);
            hashMap.put("andId", C4506i.m13047e(context));
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("clientInterfaceId", str);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
