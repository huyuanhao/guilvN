package com.umeng.message;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
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
import java.util.Iterator;
import java.util.Random;
import org.android.agoo.common.AgooConstants;

public class UmengMessageHandler implements UHandler {
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME = "Default";
    public static final String PRIMARY_CHANNEL = "upush_default";

    /* renamed from: a */
    public static int f9994a = 64;

    /* renamed from: b */
    public static final String f9995b = "com.umeng.message.UmengMessageHandler";

    /* renamed from: c */
    public static Date f9996c = null;

    /* renamed from: d */
    public static String f9997d = "9999999999999";

    /* renamed from: g */
    public static final String f9998g = "umeng_push_notification_default_large_icon";

    /* renamed from: h */
    public static final String f9999h = "umeng_push_notification_default_small_icon";

    /* renamed from: i */
    public static final String f10000i = "umeng_push_notification_default_sound";
    public static boolean isChannelSet;

    /* renamed from: e */
    public UMessage f10001e = null;

    /* renamed from: f */
    public int f10002f;

    /* renamed from: a */
    private String m10286a(Context context) {
        String notificationChannelName = PushAgent.getInstance(context).getNotificationChannelName();
        return TextUtils.isEmpty(notificationChannelName) ? DEFAULT_NOTIFICATION_CHANNEL_NAME : notificationChannelName;
    }

    @SuppressLint({"NewApi", "Wakelock"})
    /* renamed from: b */
    private void m10290b(Context context) {
        boolean z;
        try {
            final PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 7) {
                z = new Object() {
                    /* class com.umeng.message.UmengMessageHandler.C37761 */

                    /* renamed from: a */
                    public boolean mo39711a() {
                        return powerManager.isScreenOn();
                    }
                }.mo39711a();
            } else {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9995b, 2, "android os version < 7, skip checking screen on status");
                z = false;
            }
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str = f9995b;
            UMLog.mutlInfo(str, 2, "屏幕开启状态：" + z);
            if (!z) {
                powerManager.newWakeLock(805306374, "MyLock").acquire(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dealWithCustomMessage(Context context, UMessage uMessage) {
    }

    public void dealWithNotificationMessage(Context context, UMessage uMessage) {
        String str;
        String str2;
        Notification.Builder builder;
        UMLog uMLog = UMConfigure.umDebugLog;
        String str3 = f9995b;
        boolean z = false;
        UMLog.mutlInfo(str3, 2, "notify: " + uMessage.getRaw().toString());
        if (!uMessage.hasResourceFromInternet() || MessageSharedPrefs.getInstance(context).hasMessageResourceDownloaded(uMessage.msg_id) || !startDownloadResourceService(context, uMessage)) {
            String lastMessageMsgID = MessageSharedPrefs.getInstance(context).getLastMessageMsgID();
            if ("".equals(lastMessageMsgID)) {
                str = "";
            } else {
                str = lastMessageMsgID.substring(7, 20);
            }
            String str4 = uMessage.msg_id;
            if (str4 == null || 22 != str4.length() || !uMessage.msg_id.startsWith("u")) {
                str2 = f9997d;
            } else {
                MessageSharedPrefs.getInstance(context).setLastMessageMsgID(uMessage.msg_id);
                str2 = uMessage.msg_id.substring(7, 20);
            }
            if ("".equals(str) || str2.compareToIgnoreCase(str) >= 0) {
                z = true;
            }
            MessageSharedPrefs.getInstance(context).removeMessageResouceRecord(uMessage.msg_id);
            Notification notification = getNotification(context, uMessage);
            if (notification != null) {
                int i = notification.icon;
            }
            if (notification == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!isChannelSet) {
                        isChannelSet = true;
                        NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL, m10286a(context), 3);
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
                        if (notificationManager != null) {
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                    builder = new Notification.Builder(context, PRIMARY_CHANNEL);
                } else {
                    builder = new Notification.Builder(context);
                }
                if (!TextUtils.isEmpty(uMessage.expand_image) && Build.VERSION.SDK_INT >= 16) {
                    builder.setStyle(new Notification.BigPictureStyle().bigPicture(getExpandImage(context, uMessage)));
                }
                if (!TextUtils.isEmpty(uMessage.bar_image)) {
                    int smallIconId = getSmallIconId(context, uMessage);
                    if (smallIconId >= 0) {
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C3779c.m10332a(context).mo39734e("upush_bar_image_notification"));
                        remoteViews.setImageViewBitmap(C3779c.m10332a(context).mo39731b("notification_bar_image"), getBarImage(context, uMessage));
                        builder.setContent(remoteViews).setSmallIcon(smallIconId).setTicker(uMessage.ticker).setAutoCancel(true);
                    } else {
                        return;
                    }
                } else if (m10289a(context, builder, uMessage)) {
                    builder.setContentTitle(uMessage.title).setContentText(uMessage.text).setTicker(uMessage.ticker).setAutoCancel(true);
                } else {
                    return;
                }
                notification = builder.getNotification();
            }
            this.f10002f = new Random(System.nanoTime()).nextInt();
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
            m10287a(context, notification, z, uMessage);
        }
    }

    public Bitmap getBarImage(Context context, UMessage uMessage) {
        return BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.bar_image.hashCode());
    }

    public PendingIntent getClickPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, NotificationProxyBroadcastReceiver.class);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MSG, uMessage.getRaw().toString());
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_ACTION, 10);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MESSAGE_ID, uMessage.message_id);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_NOTIFICATION_ID, this.f10002f);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_TASK_ID, uMessage.task_id);
        return PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, CommonNetImpl.FLAG_AUTH);
    }

    public PendingIntent getDismissPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, NotificationProxyBroadcastReceiver.class);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MSG, uMessage.getRaw().toString());
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_ACTION, 11);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_MESSAGE_ID, uMessage.message_id);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_NOTIFICATION_ID, this.f10002f);
        intent.putExtra(NotificationProxyBroadcastReceiver.EXTRA_KEY_TASK_ID, uMessage.task_id);
        return PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() + 1), intent, CommonNetImpl.FLAG_AUTH);
    }

    public Bitmap getExpandImage(Context context, UMessage uMessage) {
        return BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.expand_image.hashCode());
    }

    public Bitmap getLargeIcon(Context context, UMessage uMessage) {
        Bitmap bitmap;
        try {
            if (uMessage.isLargeIconFromInternet()) {
                bitmap = BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.img.hashCode());
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
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
        return null;
    }

    public int getNotificationDefaults(Context context, UMessage uMessage) {
        int i;
        boolean isInNoDisturbTime = isInNoDisturbTime(context);
        long muteDuration = ((long) MessageSharedPrefs.getInstance(context).getMuteDuration()) * 1 * 1000;
        int i2 = 0;
        if (!isInNoDisturbTime && (f9996c == null || Calendar.getInstance().getTimeInMillis() - f9996c.getTime() >= muteDuration)) {
            int notificationPlayVibrate = MessageSharedPrefs.getInstance(context).getNotificationPlayVibrate();
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f9995b;
            UMLog.mutlInfo(str, 2, "playVibrate:" + notificationPlayVibrate);
            if (notificationPlayVibrate != 1 && (notificationPlayVibrate == 2 || !uMessage.play_vibrate)) {
                i = 0;
            } else {
                i = 2;
            }
            int notificationPlayLights = MessageSharedPrefs.getInstance(context).getNotificationPlayLights();
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str2 = f9995b;
            UMLog.mutlInfo(str2, 2, "playLights:" + notificationPlayLights);
            if (notificationPlayLights == 1 || (notificationPlayLights != 2 && uMessage.play_lights)) {
                i |= 4;
            }
            int notificationPlaySound = MessageSharedPrefs.getInstance(context).getNotificationPlaySound();
            UMLog uMLog3 = UMConfigure.umDebugLog;
            String str3 = f9995b;
            UMLog.mutlInfo(str3, 2, "playSound:" + notificationPlaySound);
            if (notificationPlaySound == 1 || (notificationPlaySound != 2 && uMessage.play_sound)) {
                i |= 1;
            }
            i2 = i;
            f9996c = Calendar.getInstance().getTime();
            if (uMessage.screen_on) {
                m10290b(context);
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
                UMLog.mutlInfo(f9995b, 2, "没有自定义通知图标，改用应用图标");
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
            }
            if (i < 0) {
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9995b, 0, "找不到适当的通知图标，请确保您为此通知指定了一个图标，或者应用已经定义了一个图标");
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengMessageHandler.getSound(android.content.Context, com.umeng.message.entity.UMessage):android.net.Uri");
    }

    @Override // com.umeng.message.UHandler
    public void handleMessage(Context context, UMessage uMessage) {
        if (UMessage.DISPLAY_TYPE_NOTIFICATION.equals(uMessage.display_type)) {
            dealWithNotificationMessage(context, uMessage);
        } else if ("custom".equals(uMessage.display_type)) {
            UTrack.getInstance(context).setClearPrevMessage(false);
            if (!TextUtils.isEmpty(uMessage.recall)) {
                m10288a(context, uMessage);
            } else {
                dealWithCustomMessage(context, uMessage);
            }
        }
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
        this.f10001e = uMessage;
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

    /* renamed from: a */
    private void m10287a(Context context, Notification notification, boolean z, UMessage uMessage) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            int i = this.f10002f;
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
                } else {
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

    /* renamed from: a */
    private boolean m10289a(Context context, Notification.Builder builder, UMessage uMessage) {
        int smallIconId = getSmallIconId(context, uMessage);
        Bitmap largeIcon = getLargeIcon(context, uMessage);
        if (smallIconId < 0) {
            return false;
        }
        builder.setSmallIcon(smallIconId);
        builder.setLargeIcon(largeIcon);
        return true;
    }

    /* renamed from: a */
    private void m10288a(Context context, UMessage uMessage) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            if (notificationManager != null) {
                Iterator<UNotificationItem> it = MessageNotificationQueue.getInstance().getQueue().iterator();
                while (it.hasNext()) {
                    UNotificationItem next = it.next();
                    if (uMessage.recall.equals(next.message.msg_id)) {
                        notificationManager.cancel(next.f10164id);
                        MessageNotificationQueue.getInstance().remove(next);
                        UTrack.getInstance(context).mo39637a(uMessage);
                        return;
                    }
                }
                UTrack.getInstance(context).mo39639b(uMessage);
            }
        } catch (Exception unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9995b, 0, "通知召回异常");
        }
    }
}
