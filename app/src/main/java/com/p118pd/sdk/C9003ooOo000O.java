package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextUtils;
import com.netease.nimlib.sdk.StatusBarNotificationConfig;
import com.umeng.message.entity.UMessage;

/* renamed from: com.pd.sdk.ooOo000O  reason: case insensitive filesystem */
public class C9003ooOo000O {
    public static final String OooO00o = "nim_message_channel_001";
    public static final String OooO0O0 = "Instant messages channel";
    public static final String OooO0OO = "Instant messages notification";
    public static final String OooO0Oo = "nim_message_channel_002";
    public static final String OooO0o = "No disturbing instant messages notification";
    public static final String OooO0o0 = "No disturbing instant messages channel";

    public static String OooO00o(Context context) {
        if (C8880ooO0oOoo.OooO00o(context)) {
            return OooO00o;
        }
        return null;
    }

    public static String OooO0O0(Context context) {
        if (C8880ooO0oOoo.OooO00o(context)) {
            return OooO0Oo;
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20667OooO00o(Context context) {
        NotificationManager notificationManager;
        if (C8880ooO0oOoo.OooO00o(context) && (notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)) != null) {
            if (notificationManager.getNotificationChannel(OooO00o) == null) {
                notificationManager.createNotificationChannel(OooO00o());
            }
            if (notificationManager.getNotificationChannel(OooO0Oo) == null) {
                notificationManager.createNotificationChannel(OooO0O0());
            }
        }
    }

    @TargetApi(26)
    public static NotificationChannel OooO0O0() {
        NotificationChannel notificationChannel = new NotificationChannel(OooO0Oo, OooO0o0, 2);
        notificationChannel.setDescription(OooO0o);
        StatusBarNotificationConfig statusBarNotificationConfig = new StatusBarNotificationConfig();
        statusBarNotificationConfig.showBadge = true;
        if (statusBarNotificationConfig.ledARGB != -1) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(statusBarNotificationConfig.ledARGB);
        }
        if (statusBarNotificationConfig.showBadge) {
            notificationChannel.setShowBadge(true);
        }
        AbstractC8796ooO0000o.OooO0OO("create NIM no disturbing message notification channel, id=nim_message_channel_002");
        return notificationChannel;
    }

    @TargetApi(26)
    public static NotificationChannel OooO00o() {
        NotificationChannel notificationChannel = new NotificationChannel(OooO00o, OooO0O0, 3);
        notificationChannel.setDescription(OooO0OO);
        StatusBarNotificationConfig statusBarNotificationConfig = new StatusBarNotificationConfig();
        statusBarNotificationConfig.vibrate = true;
        statusBarNotificationConfig.showBadge = true;
        notificationChannel.enableVibration(true);
        if (!TextUtils.isEmpty(statusBarNotificationConfig.notificationSound)) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(8);
            notificationChannel.setSound(Uri.parse(statusBarNotificationConfig.notificationSound), builder.build());
        }
        if (statusBarNotificationConfig.ledARGB != -1) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(statusBarNotificationConfig.ledARGB);
        }
        if (statusBarNotificationConfig.showBadge) {
            notificationChannel.setShowBadge(true);
        }
        AbstractC8796ooO0000o.OooO0OO("create NIM message notification channel, id=nim_message_channel_001");
        return notificationChannel;
    }
}
