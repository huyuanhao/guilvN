package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.PushReceiver;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4570r;
import com.xiaomi.push.service.C4605ah;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mipush.sdk.h */
public class C4220h {

    /* renamed from: a */
    public static HashMap<String, String> f11305a = new HashMap<>();

    /* renamed from: a */
    public static MiPushMessage m11552a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(MiPushMessage.KEY_MESSAGE_ID)) {
                    miPushMessage.setMessageId(jSONObject.getString(MiPushMessage.KEY_MESSAGE_ID));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has(MiPushMessage.KEY_PASS_THROUGH)) {
                    miPushMessage.setPassThrough(jSONObject.getInt(MiPushMessage.KEY_PASS_THROUGH));
                }
                if (jSONObject.has(MiPushMessage.KEY_NOTIFY_TYPE)) {
                    miPushMessage.setNotifyType(jSONObject.getInt(MiPushMessage.KEY_NOTIFY_TYPE));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has(MiPushMessage.KEY_TOPIC)) {
                    miPushMessage.setTopic(jSONObject.getString(MiPushMessage.KEY_TOPIC));
                }
                if (jSONObject.has(MiPushMessage.KEY_USER_ACCOUNT)) {
                    miPushMessage.setUserAccount(jSONObject.getString(MiPushMessage.KEY_USER_ACCOUNT));
                }
                if (jSONObject.has(MiPushMessage.KEY_NOTIFY_ID)) {
                    miPushMessage.setNotifyId(jSONObject.getInt(MiPushMessage.KEY_NOTIFY_ID));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has(MiPushMessage.KEY_NOTIFIED)) {
                    miPushMessage.setNotified(jSONObject.getBoolean(MiPushMessage.KEY_NOTIFIED));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                    }
                }
            } catch (Exception e) {
                AbstractC4163b.m11306d(e.toString());
            }
        }
        return miPushMessage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.mipush.sdk.PushMessageReceiver m11553a(android.content.Context r5) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r0.<init>(r1)
            java.lang.String r1 = r5.getPackageName()
            r0.setPackage(r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r2 = 32
            r3 = 0
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r2)     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x003e
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x001f:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0051 }
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch:{ Exception -> 0x0051 }
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x001f
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x0051 }
            java.lang.String r4 = r5.getPackageName()     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x001f
            goto L_0x003f
        L_0x003e:
            r1 = r3
        L_0x003f:
            if (r1 == 0) goto L_0x0050
            android.content.pm.ActivityInfo r0 = r1.activityInfo     // Catch:{ Exception -> 0x0051 }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x0051 }
            java.lang.Class r5 = com.xiaomi.push.C4688t.m14219a(r5, r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0051 }
            com.xiaomi.mipush.sdk.PushMessageReceiver r5 = (com.xiaomi.mipush.sdk.PushMessageReceiver) r5     // Catch:{ Exception -> 0x0051 }
            return r5
        L_0x0050:
            return r3
        L_0x0051:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11306d(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4220h.m11553a(android.content.Context):com.xiaomi.mipush.sdk.PushMessageReceiver");
    }

    /* renamed from: a */
    public static synchronized String m11554a(Context context, String str) {
        String str2;
        synchronized (C4220h.class) {
            str2 = f11305a.get(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static String m11555a(EnumC4216d dVar) {
        int i = C4222j.f11309a[dVar.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    /* renamed from: a */
    public static HashMap<String, String> m11556a(Context context, EnumC4216d dVar) {
        StringBuilder sb;
        EnumC4195an anVar;
        HashMap<String, String> hashMap = new HashMap<>();
        String a = m11555a(dVar);
        if (TextUtils.isEmpty(a)) {
            return hashMap;
        }
        int i = C4222j.f11309a[dVar.ordinal()];
        String str = null;
        ApplicationInfo applicationInfo = null;
        if (i != 1) {
            if (i == 2) {
                sb = new StringBuilder();
                sb.append("brand:");
                anVar = EnumC4195an.FCM;
            } else if (i == 3) {
                sb = new StringBuilder();
                sb.append("brand:");
                anVar = EnumC4195an.f11233d;
            } else if (i == 4) {
                sb = new StringBuilder();
                sb.append("brand:");
                anVar = EnumC4195an.f11234e;
            }
            sb.append(anVar.name());
            sb.append(Constants.WAVE_SEPARATOR);
            sb.append("token");
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(m11554a(context, a));
            sb.append(Constants.WAVE_SEPARATOR);
            sb.append("package_name");
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(context.getPackageName());
            str = sb.toString();
        } else {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e) {
                AbstractC4163b.m11306d(e.toString());
            }
            int i2 = -1;
            if (applicationInfo != null) {
                i2 = applicationInfo.metaData.getInt("com.huawei.hms.client.appid");
            }
            str = "brand:" + C4226m.m11575a(context).name() + Constants.WAVE_SEPARATOR + "token" + Constants.COLON_SEPARATOR + m11554a(context, a) + Constants.WAVE_SEPARATOR + "package_name" + Constants.COLON_SEPARATOR + context.getPackageName() + Constants.WAVE_SEPARATOR + Constants.APP_ID + Constants.COLON_SEPARATOR + i2;
        }
        hashMap.put(Constants.ASSEMBLE_PUSH_REG_INFO, str);
        return hashMap;
    }

    /* renamed from: a */
    public static void m11557a(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a = m11555a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
        String a2 = m11555a(EnumC4216d.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(a, "")) && TextUtils.isEmpty(sharedPreferences.getString(a2, ""))) {
            z = true;
        }
        if (z) {
            C4204aw.m11444a(context).mo41397a(2, a);
        }
    }

    /* renamed from: a */
    public static void m11558a(Context context, EnumC4216d dVar) {
        String a = m11555a(dVar);
        if (!TextUtils.isEmpty(a)) {
            C4570r.m13744a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a, ""));
        }
    }

    /* renamed from: a */
    public static void m11559a(Context context, EnumC4216d dVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            String a = m11555a(dVar);
            if (TextUtils.isEmpty(a)) {
                AbstractC4163b.m11301a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            String string = sharedPreferences.getString(a, "");
            if (TextUtils.isEmpty(string) || !str.equals(string)) {
                AbstractC4163b.m11301a("ASSEMBLE_PUSH : send token upload");
                m11561a(dVar, str);
                EnumC4212bb a2 = C4223k.m11571a(dVar);
                if (a2 != null) {
                    C4204aw.m11444a(context).mo41408a((String) null, a2, dVar);
                    return;
                }
                return;
            }
            AbstractC4163b.m11301a("ASSEMBLE_PUSH : do not need to send token");
        }
    }

    /* renamed from: a */
    public static void m11560a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey(PushReceiver.BOUND_KEY.pushMsgKey)) {
            intent.putExtra(PushMessageHelper.KEY_MESSAGE, m11552a(extras.getString(PushReceiver.BOUND_KEY.pushMsgKey)));
        }
    }

    /* renamed from: a */
    public static synchronized void m11561a(EnumC4216d dVar, String str) {
        synchronized (C4220h.class) {
            String a = m11555a(dVar);
            if (TextUtils.isEmpty(a)) {
                AbstractC4163b.m11301a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            } else if (TextUtils.isEmpty(str)) {
                AbstractC4163b.m11301a("ASSEMBLE_PUSH : token is null");
            } else {
                f11305a.put(a, str);
            }
        }
    }

    /* renamed from: a */
    public static void m11562a(String str, int i) {
        MiTinyDataClient.upload("hms_push_error", str, 1, "error code = " + i);
    }

    /* renamed from: a */
    public static boolean m11563a(Context context) {
        if (context == null) {
            return false;
        }
        return C4274az.m11735b(context);
    }

    /* renamed from: a */
    public static boolean m11564a(Context context, EnumC4216d dVar) {
        if (C4223k.m11573a(dVar) != null) {
            return C4605ah.m13919a(context).mo42661a(C4223k.m11573a(dVar).mo42043a(), true);
        }
        return false;
    }

    /* renamed from: b */
    public static String m11565b(EnumC4216d dVar) {
        int i = C4222j.f11309a[dVar.ordinal()];
        if (i == 1) {
            return "hms_push_error";
        }
        if (i == 2) {
            return "fcm_push_error";
        }
        if (i == 3) {
            return "cos_push_error";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    /* renamed from: b */
    public static void m11566b(Context context) {
        C4217e.m11541a(context).register();
    }

    /* renamed from: b */
    public static void m11567b(Context context, EnumC4216d dVar, String str) {
        C4251ai.m11641a(context).mo41474a(new RunnableC4221i(str, context, dVar));
    }

    /* renamed from: c */
    public static void m11568c(Context context) {
        C4217e.m11541a(context).unregister();
    }

    /* renamed from: d */
    public static synchronized void m11570d(Context context, EnumC4216d dVar, String str) {
        synchronized (C4220h.class) {
            String a = m11555a(dVar);
            if (TextUtils.isEmpty(a)) {
                AbstractC4163b.m11301a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            C4570r.m13744a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a, str));
            AbstractC4163b.m11301a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }
}
