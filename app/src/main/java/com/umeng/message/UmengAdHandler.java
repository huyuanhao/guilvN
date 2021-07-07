package com.umeng.message;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.C3779c;
import com.umeng.message.entity.UMessage;
import com.umeng.message.entity.UNotificationItem;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.service.UMJobIntentService;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

public class UmengAdHandler implements UHandler {

    /* renamed from: a */
    public static int f9946a = 64;

    /* renamed from: b */
    public static final String f9947b = "com.umeng.message.UmengAdHandler";

    /* renamed from: c */
    public static Date f9948c = null;

    /* renamed from: d */
    public static String f9949d = "9999999999999";

    /* renamed from: g */
    public static final String f9950g = "umeng_push_notification_default_large_icon";

    /* renamed from: h */
    public static final String f9951h = "umeng_push_notification_default_small_icon";

    /* renamed from: i */
    public static final String f9952i = "umeng_push_notification_default_sound";

    /* renamed from: e */
    public UMessage f9953e = null;

    /* renamed from: f */
    public int f9954f;

    /* renamed from: a */
    private void m10266a(Context context, Notification notification, boolean z, UMessage uMessage) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            int i = this.f9954f;
            if (!C3819h.m10561c(context) || !C3819h.m10557b(context) || PushAgent.getInstance(context).getNotificationOnForeground()) {
                if (MessageSharedPrefs.getInstance(context).getDisplayNotificationNumber() == 1) {
                    if (z) {
                    }
                }
                if (MessageSharedPrefs.getInstance(context).getDisplayNotificationNumber() > 0) {
                    while (MessageNotificationQueue.getInstance().size() >= MessageSharedPrefs.getInstance(context).getDisplayNotificationNumber()) {
                        UNotificationItem pollFirst = MessageNotificationQueue.getInstance().pollFirst();
                        notificationManager.cancel(pollFirst.f10164id);
                        UTrack.getInstance(context).setClearPrevMessage(false);
                        UTrack.getInstance(context).trackMsgDismissed(pollFirst.message);
                    }
                    MessageNotificationQueue.getInstance().addLast(new UNotificationItem(i, uMessage));
                }
                notificationManager.notify(i, notification);
                return;
            }
            UTrack.getInstance(context).setClearPrevMessage(false);
            UTrack.getInstance(context).trackMsgDismissed(uMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dealWithCustomMessage(Context context, UMessage uMessage) {
    }

    public void dealWithNotificationMessage(Context context, UMessage uMessage) {
        String str;
        String str2;
        UMLog uMLog = UMConfigure.umDebugLog;
        String str3 = f9947b;
        boolean z = true;
        UMLog.mutlInfo(str3, 2, "notify: " + uMessage.getRaw().toString());
        if (MessageSharedPrefs.getInstance(context).hasMessageResourceDownloaded(uMessage.msg_id) || !startDownloadResourceService(context, uMessage)) {
            String lastMessageMsgID = MessageSharedPrefs.getInstance(context).getLastMessageMsgID();
            if ("".equals(lastMessageMsgID)) {
                str = "";
            } else {
                str = lastMessageMsgID.substring(7, 20);
            }
            String str4 = uMessage.msg_id;
            if (str4 == null || 22 != str4.length() || !uMessage.msg_id.startsWith("u")) {
                str2 = f9949d;
            } else {
                MessageSharedPrefs.getInstance(context).setLastMessageMsgID(uMessage.msg_id);
                str2 = uMessage.msg_id.substring(7, 20);
            }
            if (!"".equals(str) && str2.compareToIgnoreCase(str) < 0) {
                z = false;
            }
            MessageSharedPrefs.getInstance(context).removeMessageResouceRecord(uMessage.msg_id);
            Notification notification = getNotification(context, uMessage);
            if (notification != null) {
                int i = notification.icon;
            }
            if (notification != null) {
                this.f9954f = new Random(System.nanoTime()).nextInt();
                PendingIntent clickPendingIntent = getClickPendingIntent(context, uMessage);
                notification.deleteIntent = getDismissPendingIntent(context, uMessage);
                notification.contentIntent = clickPendingIntent;
                int notificationDefaults = getNotificationDefaults(context, uMessage);
                if ((notificationDefaults & 1) != 0) {
                    Uri sound = getSound(context, uMessage);
                    if (sound != null) {
                        notification.sound = getSound(context, uMessage);
                    }
                    if (sound != null) {
                        notificationDefaults ^= 1;
                    }
                }
                notification.defaults = notificationDefaults;
                m10266a(context, notification, z, uMessage);
            }
        }
    }

    public PendingIntent getClickPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, NotificationProxyBroadcastReceiver.class);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MSG, uMessage.getRaw().toString());
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_ACTION, 10);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MESSAGE_ID, uMessage.message_id);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_NOTIFICATION_ID, this.f9954f);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_TASK_ID, uMessage.task_id);
        return PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, CommonNetImpl.FLAG_AUTH);
    }

    public PendingIntent getDismissPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, NotificationProxyBroadcastReceiver.class);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MSG, uMessage.getRaw().toString());
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_ACTION, 11);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MESSAGE_ID, uMessage.message_id);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_NOTIFICATION_ID, this.f9954f);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_TASK_ID, uMessage.task_id);
        return PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() + 1), intent, CommonNetImpl.FLAG_AUTH);
    }

    public Bitmap getLargeIcon(Context context, UMessage uMessage) {
        Bitmap bitmap;
        try {
            if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
                try {
                    String optString = new JSONObject(uMessage.custom).optString("img");
                    bitmap = BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + optString.hashCode());
                } catch (Exception unused) {
                }
            } else {
                if (uMessage.isLargeIconFromInternet()) {
                    bitmap = BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.img.hashCode());
                }
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9947b, 2, "bmp is null");
            int i = -1;
            if (!TextUtils.isEmpty(uMessage.largeIcon)) {
                i = C3779c.m10332a(context).mo39733d(uMessage.largeIcon);
            }
            if (i < 0) {
                i = C3779c.m10332a(context).mo39733d("umeng_push_notification_default_large_icon");
            }
            return i > 0 ? BitmapFactory.decodeResource(context.getResources(), i) : bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Notification getNotification(Context context, UMessage uMessage) {
        String str = uMessage.custom;
        if (str == null || str.equals("")) {
            return null;
        }
        try {
            int optInt = new JSONObject(str).optInt("t");
            Notification.Builder builder = new Notification.Builder(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C3779c.m10332a(context).mo39735f("upush_notification"));
            if (optInt == 0) {
                remoteViews.setImageViewBitmap(C3779c.m10332a(context).mo39732c("notification_large_icon1"), getLargeIcon(context, uMessage));
                remoteViews.setViewVisibility(C3779c.m10332a(context).mo39732c("upush_notification1"), 0);
                remoteViews.setViewVisibility(C3779c.m10332a(context).mo39732c("upush_notification2"), 8);
                remoteViews.setTextViewText(C3779c.m10332a(context).mo39732c("notification_title"), uMessage.title);
                remoteViews.setTextViewText(C3779c.m10332a(context).mo39732c("notification_text"), uMessage.text);
                builder.setContent(remoteViews).setTicker(uMessage.ticker).setSmallIcon(getSmallIconId(context, uMessage)).setAutoCancel(true);
                return builder.getNotification();
            } else if (optInt != 1) {
                return null;
            } else {
                remoteViews.setImageViewBitmap(C3779c.m10332a(context).mo39732c("notification_large_icon2"), getLargeIcon(context, uMessage));
                remoteViews.setViewVisibility(C3779c.m10332a(context).mo39732c("upush_notification1"), 8);
                remoteViews.setViewVisibility(C3779c.m10332a(context).mo39732c("upush_notification2"), 0);
                builder.setContent(remoteViews).setTicker(uMessage.ticker).setSmallIcon(getSmallIconId(context, uMessage)).setAutoCancel(true);
                return builder.getNotification();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getNotificationDefaults(Context context, UMessage uMessage) {
        int i;
        boolean isInNoDisturbTime = isInNoDisturbTime(context);
        long muteDuration = ((long) MessageSharedPrefs.getInstance(context).getMuteDuration()) * 1 * 1000;
        int i2 = 0;
        if (!isInNoDisturbTime && (f9948c == null || Calendar.getInstance().getTimeInMillis() - f9948c.getTime() >= muteDuration)) {
            int notificationPlayVibrate = MessageSharedPrefs.getInstance(context).getNotificationPlayVibrate();
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f9947b;
            UMLog.mutlInfo(str, 2, "playVibrate:" + notificationPlayVibrate);
            if (notificationPlayVibrate != 1 && (notificationPlayVibrate == 2 || !uMessage.play_vibrate)) {
                i = 0;
            } else {
                i = 2;
            }
            int notificationPlayLights = MessageSharedPrefs.getInstance(context).getNotificationPlayLights();
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str2 = f9947b;
            UMLog.mutlInfo(str2, 2, "playLights:" + notificationPlayLights);
            if (notificationPlayLights == 1 || (notificationPlayLights != 2 && uMessage.play_lights)) {
                i |= 4;
            }
            int notificationPlaySound = MessageSharedPrefs.getInstance(context).getNotificationPlaySound();
            UMLog uMLog3 = UMConfigure.umDebugLog;
            String str3 = f9947b;
            UMLog.mutlInfo(str3, 2, "playSound:" + notificationPlaySound);
            if (notificationPlaySound == 1 || (notificationPlaySound != 2 && uMessage.play_sound)) {
                i |= 1;
            }
            i2 = i;
            f9948c = Calendar.getInstance().getTime();
            if (uMessage.screen_on) {
                m10265a(context);
            }
        }
        return i2;
    }

    public int getSmallIconId(Context context, UMessage uMessage) {
        int i = -1;
        try {
            if (!TextUtils.isEmpty(uMessage.icon)) {
                i = C3779c.m10332a(context).mo39733d(uMessage.icon);
            }
            if (i < 0) {
                i = C3779c.m10332a(context).mo39733d("umeng_push_notification_default_small_icon");
            }
            if (i < 0) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9947b, 2, "没有自定义图标，改用应用图标");
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
            }
            if (i < 0) {
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9947b, 0, "找不到适当的通知图标，请确保您为此通知指定了一个图标，或者应用已经定义了一个图标");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (new java.io.File(r1).exists() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri getSound(android.content.Context r5, com.umeng.message.entity.UMessage r6) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengAdHandler.getSound(android.content.Context, com.umeng.message.entity.UMessage):android.net.Uri");
    }

    @Override // com.umeng.message.UHandler
    public void handleMessage(Context context, UMessage uMessage) {
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f9947b, 2, "handleMessage");
        dealWithNotificationMessage(context, uMessage);
    }

    public boolean isInNoDisturbTime(Context context) {
        int i = (Calendar.getInstance().get(11) * 60) + Calendar.getInstance().get(12);
        boolean z = i >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute();
        boolean z2 = i <= (PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute();
        if ((PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute() >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute()) {
            if (!z || !z2) {
                return false;
            }
            return true;
        } else if (z || z2) {
            return true;
        }
        return false;
    }

    public void setPrevMessage(UMessage uMessage) {
        this.f9953e = uMessage;
    }

    public boolean startDownloadResourceService(Context context, UMessage uMessage) {
        try {
            Intent intent = new Intent(context, UmengDownloadResourceService.class);
            intent.putExtra(AgooConstants.MESSAGE_BODY, uMessage.getRaw().toString());
            intent.putExtra("id", uMessage.message_id);
            intent.putExtra(AgooConstants.MESSAGE_TASK_ID, uMessage.task_id);
            UMJobIntentService.enqueueWork(context, UmengDownloadResourceService.class, intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @SuppressLint({"NewApi", "Wakelock"})
    /* renamed from: a */
    private void m10265a(Context context) {
        boolean z;
        try {
            final PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 7) {
                z = new Object() {
                    /* class com.umeng.message.UmengAdHandler.C37701 */

                    /* renamed from: a */
                    public boolean mo39679a() {
                        return powerManager.isScreenOn();
                    }
                }.mo39679a();
            } else {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9947b, 0, "android os version < 7, skip checking screen on status");
                z = false;
            }
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str = f9947b;
            UMLog.mutlInfo(str, 2, "屏幕是否处于开启状态:" + z);
            if (!z) {
                powerManager.newWakeLock(805306374, "MyLock").acquire(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m10267a(Context context, Notification.Builder builder, UMessage uMessage) {
        int smallIconId = getSmallIconId(context, uMessage);
        Bitmap largeIcon = getLargeIcon(context, uMessage);
        if (smallIconId < 0) {
            return false;
        }
        builder.setSmallIcon(smallIconId);
        builder.setLargeIcon(largeIcon);
        return true;
    }
}
