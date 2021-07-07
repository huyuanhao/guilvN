package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.PushReceiver;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.Map;

public class FTOSPushHelper {

    /* renamed from: a */
    public static long f11192a;

    /* renamed from: a */
    public static volatile boolean f11193a;

    /* renamed from: a */
    public static void m11357a(Context context) {
        AbstractPushManager a = C4217e.m11541a(context).mo41447a(EnumC4216d.ASSEMBLE_PUSH_FTOS);
        if (a != null) {
            AbstractC4163b.m11301a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f11192a;
            if (j <= 0 || j + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL <= elapsedRealtime) {
                f11192a = elapsedRealtime;
                m11357a(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f11193a;
    }

    public static boolean hasNetwork(Context context) {
        return C4220h.m11563a(context);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        if (map != null && map.containsKey(PushReceiver.BOUND_KEY.pushMsgKey)) {
            String str = map.get(PushReceiver.BOUND_KEY.pushMsgKey);
            if (!TextUtils.isEmpty(str) && (a = C4220h.m11553a(context)) != null) {
                MiPushMessage a2 = C4220h.m11552a(str);
                if (!a2.getExtra().containsKey("notify_effect")) {
                    a.onNotificationMessageClicked(context, a2);
                }
            }
        }
    }

    public static void setNeedRegister(boolean z) {
        f11193a = z;
    }

    public static void uploadToken(Context context, String str) {
        C4220h.m11559a(context, EnumC4216d.ASSEMBLE_PUSH_FTOS, str);
    }
}
