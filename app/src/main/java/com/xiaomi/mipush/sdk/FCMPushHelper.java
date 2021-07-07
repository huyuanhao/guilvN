package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.PushReceiver;
import java.util.Map;

public class FCMPushHelper {
    public static void clearToken(Context context) {
        C4220h.m11558a(context, EnumC4216d.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        C4220h.m11560a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return C4220h.m11564a(context, EnumC4216d.ASSEMBLE_PUSH_FCM) && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get(PushReceiver.BOUND_KEY.pushMsgKey);
        if (!TextUtils.isEmpty(str) && (a = C4220h.m11553a(context)) != null) {
            a.onNotificationMessageArrived(context, C4220h.m11552a(str));
        }
    }

    public static void notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get(PushReceiver.BOUND_KEY.pushMsgKey);
        if (!TextUtils.isEmpty(str) && (a = C4220h.m11553a(context)) != null) {
            a.onReceivePassThroughMessage(context, C4220h.m11552a(str));
        }
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(C4220h.m11565b(EnumC4216d.ASSEMBLE_PUSH_FCM), "fcm", 1, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        C4220h.m11559a(context, EnumC4216d.ASSEMBLE_PUSH_FCM, str);
    }
}
