package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

public class COSPushHelper {

    /* renamed from: a */
    public static long f11190a;

    /* renamed from: a */
    public static volatile boolean f11191a;

    public static void convertMessage(Intent intent) {
        C4220h.m11560a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f11190a;
            if (j <= 0 || j + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL <= elapsedRealtime) {
                f11190a = elapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f11191a;
    }

    public static boolean hasNetwork(Context context) {
        return C4220h.m11563a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a = C4217e.m11541a(context).mo41447a(EnumC4216d.ASSEMBLE_PUSH_COS);
        if (a != null) {
            AbstractC4163b.m11301a("ASSEMBLE_PUSH :  register cos when network change!");
            a.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            f11191a = z;
        }
    }

    public static void uploadToken(Context context, String str) {
        C4220h.m11559a(context, EnumC4216d.ASSEMBLE_PUSH_COS, str);
    }
}
