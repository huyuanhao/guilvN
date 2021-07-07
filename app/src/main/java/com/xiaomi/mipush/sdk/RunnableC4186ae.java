package com.xiaomi.mipush.sdk;

import android.text.TextUtils;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4269au;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.service.C4609ak;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.ae */
public final class RunnableC4186ae implements Runnable {
    public void run() {
        if (C4563l.m13731d()) {
            return;
        }
        if (C4506i.m13048f(MiPushClient.sContext) != null || C4269au.m11702a(MiPushClient.sContext).m11706a()) {
            C4520in inVar = new C4520in();
            inVar.mo42314b(C4209b.m11491a(MiPushClient.sContext).m11495a());
            inVar.mo42317c("client_info_update");
            inVar.mo42307a(C4609ak.m13938a());
            inVar.mo42309a(new HashMap());
            String str = "";
            String f = C4506i.m13048f(MiPushClient.sContext);
            if (!TextUtils.isEmpty(f)) {
                str = str + C4285bf.m11800a(f);
            }
            String h = C4506i.m13050h(MiPushClient.sContext);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(h)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP + h;
            }
            if (!TextUtils.isEmpty(str)) {
                inVar.m13318a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
            }
            C4269au.m11702a(MiPushClient.sContext).mo41498a(inVar.m13318a());
            int a = C4506i.m13028a();
            if (a >= 0) {
                inVar.m13318a().put("space_id", Integer.toString(a));
            }
            C4204aw.m11444a(MiPushClient.sContext).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, (C4508ib) null);
        }
    }
}
