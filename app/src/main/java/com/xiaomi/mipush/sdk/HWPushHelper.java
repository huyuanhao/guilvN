package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.huawei.hms.support.api.push.PushReceiver;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import org.json.JSONArray;
import org.json.JSONObject;

public class HWPushHelper {

    /* renamed from: a */
    public static boolean f11194a;

    public static void convertMessage(Intent intent) {
        C4220h.m11560a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return C4220h.m11563a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String a = C4220h.m11555a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String a2 = C4220h.m11554a(context, a);
        String a3 = C4194am.m11405a(context).mo41387a(EnumC4212bb.UPLOAD_HUAWEI_TOKEN);
        return !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && "synced".equals(a3);
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return f11194a;
    }

    public static void notifyHmsNotificationMessageClicked(Context context, String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has(PushReceiver.BOUND_KEY.pushMsgKey)) {
                            str2 = jSONObject.getString(PushReceiver.BOUND_KEY.pushMsgKey);
                            break;
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                AbstractC4163b.m11306d(e.toString());
            }
        }
        PushMessageReceiver a = C4220h.m11553a(context);
        if (a != null) {
            MiPushMessage a2 = C4220h.m11552a(str2);
            if (!a2.getExtra().containsKey("notify_effect")) {
                a.onNotificationMessageClicked(context, a2);
            }
        }
    }

    public static void notifyHmsPassThoughMessageArrived(Context context, String str) {
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    str2 = jSONObject.getString("content");
                }
            }
        } catch (Exception e) {
            AbstractC4163b.m11306d(e.toString());
        }
        PushMessageReceiver a = C4220h.m11553a(context);
        if (a != null) {
            a.onReceivePassThroughMessage(context, C4220h.m11552a(str2));
        }
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager a = C4217e.m11541a(context).mo41447a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
        if (a != null) {
            a.register();
        }
    }

    public static void reportError(String str, int i) {
        C4220h.m11562a(str, i);
    }

    public static synchronized void setConnectTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void setGetTokenTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
        }
    }

    public static void setNeedConnect(boolean z) {
        f11194a = z;
    }

    public static synchronized boolean shouldGetToken(Context context) {
        boolean z;
        synchronized (HWPushHelper.class) {
            z = false;
            if (Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1)) > 172800000) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized boolean shouldTryConnect(Context context) {
        boolean z;
        synchronized (HWPushHelper.class) {
            z = false;
            if (Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1)) > WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
                z = true;
            }
        }
        return z;
    }

    public static void uploadToken(Context context, String str) {
        C4220h.m11559a(context, EnumC4216d.ASSEMBLE_PUSH_HUAWEI, str);
    }
}
