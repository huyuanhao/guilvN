package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.taobao.accs.AccsClientConfig;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.C4121p;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p281b.C4052r;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NotifyAdapterUtil {
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    public static final String PUSH_EN = "PUSH";
    public static final String PUSH_ZH = "推送通知";
    public static final String TAG = "NotifyManager";
    public static NotificationManager sNotificationManager = null;
    public static int sNotifyId = 20000000;

    public static boolean cancelNotify(Context context, int i) {
        initAdapter(context);
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return false;
        }
        notificationManager.cancel(i);
        return true;
    }

    public static synchronized void initAdapter(Context context) {
        synchronized (NotifyAdapterUtil.class) {
            if (sNotificationManager == null) {
                sNotificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            }
            if (Build.VERSION.SDK_INT >= 26 && sNotificationManager != null) {
                NotificationChannel notificationChannel = sNotificationManager.getNotificationChannel(AccsClientConfig.DEFAULT_CONFIGTAG);
                if (notificationChannel != null) {
                    CharSequence name = notificationChannel.getName();
                    if (PUSH_ZH.equals(name) || PUSH_EN.equals(name)) {
                        sNotificationManager.deleteNotificationChannel(AccsClientConfig.DEFAULT_CONFIGTAG);
                    }
                }
                NotificationChannel notificationChannel2 = new NotificationChannel(PRIMARY_CHANNEL, isZh(context) ? PUSH_ZH : PUSH_EN, 4);
                notificationChannel2.setLightColor(-16711936);
                notificationChannel2.enableVibration(true);
                notificationChannel2.setLockscreenVisibility(1);
                sNotificationManager.createNotificationChannel(notificationChannel2);
            }
        }
    }

    public static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i) {
        C4146p.m11216d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j, i);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j);
        }
    }

    public static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j) {
        Notification notification;
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int intValue = Integer.valueOf(context.getApplicationInfo().icon).intValue();
        if (Build.VERSION.SDK_INT >= 26) {
            Notification.Builder builder = new Notification.Builder(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
                builder.setExtras(bundle);
            }
            notification = builder.build();
        } else {
            notification = new Notification();
        }
        notification.priority = 2;
        notification.flags = 16;
        notification.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = intValue;
        }
        notification.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, 0);
        if (list == null || list.isEmpty() || (bitmap = list.get(0)) == null) {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = intValue;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        } else {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        }
        Bitmap bitmap2 = null;
        if (list != null && list.size() > 1) {
            bitmap2 = list.get(1);
        }
        if (bitmap2 == null) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        } else if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
        }
        notification.contentView = remoteViews;
        if (Build.VERSION.SDK_INT >= 16 && TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            notification.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        C4146p.m11216d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        notification.defaults = 1;
                    }
                    if (vibrateSetting == 1) {
                        notification.defaults |= 2;
                        notification.vibrate = new long[]{0, 100, 200, 300};
                    }
                }
            } else if (vibrateSetting == 1) {
                notification.defaults = 2;
                notification.vibrate = new long[]{0, 100, 200, 300};
            }
        } else if (ringerMode == 2) {
            notification.defaults = 1;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        new C4052r(packageName, j, insideNotificationItem).mo41217b(intent);
        notification.contentIntent = PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, CommonNetImpl.FLAG_AUTH);
        if (sNotificationManager != null) {
            int r = C4121p.m11080a().mo41133r();
            if (r == 0) {
                sNotificationManager.notify(sNotifyId, notification);
            } else if (r == 1) {
                sNotificationManager.notify((int) j, notification);
            } else {
                C4146p.m11204a(TAG, "unknow notify style " + r);
            }
        }
    }

    public static void pushNotificationBySystem(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i) {
        Bitmap bitmap;
        Notification.Builder builder;
        Bitmap decodeResource;
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        String content = insideNotificationItem.getContent();
        int intValue = Integer.valueOf(context.getApplicationInfo().icon).intValue();
        boolean isShowTime = insideNotificationItem.isShowTime();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        Bitmap bitmap2 = null;
        if (list == null || list.isEmpty()) {
            bitmap = null;
        } else {
            bitmap = list.get(0);
            if (!(bitmap == null || defaultNotifyIcon <= 0 || (decodeResource = BitmapFactory.decodeResource(context.getResources(), defaultNotifyIcon)) == null)) {
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                decodeResource.recycle();
                bitmap = C4132b.m11161a(bitmap, width, height);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
                builder.setExtras(bundle);
            }
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
        } else {
            builder = new Notification.Builder(context);
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            } else if (Build.VERSION.SDK_INT <= 22) {
                builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), intValue));
            }
        }
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId > 0) {
            intValue = defaultSmallIconId;
        }
        builder.setSmallIcon(intValue);
        builder.setContentTitle(title);
        builder.setPriority(2);
        builder.setContentText(content);
        builder.setWhen(isShowTime ? System.currentTimeMillis() : 0);
        builder.setShowWhen(isShowTime);
        builder.setTicker(title);
        int ringerMode = audioManager.getRingerMode();
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        builder.setDefaults(3);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    } else if (ringerMode == 1) {
                        builder.setDefaults(2);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    }
                }
            } else if (ringerMode == 2) {
                builder.setDefaults(2);
                builder.setVibrate(new long[]{0, 100, 200, 300});
            }
        } else if (ringerMode == 2) {
            builder.setDefaults(1);
        }
        if (list != null && list.size() > 1) {
            bitmap2 = list.get(1);
        }
        if (!(i == 1 || bitmap2 == null)) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(content);
            bigPictureStyle.bigPicture(bitmap2);
            builder.setStyle(bigPictureStyle);
        }
        builder.setAutoCancel(true);
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        new C4052r(packageName, j, insideNotificationItem).mo41217b(intent);
        builder.setContentIntent(PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, CommonNetImpl.FLAG_AUTH));
        Notification build = builder.build();
        int r = C4121p.m11080a().mo41133r();
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return;
        }
        if (r == 0) {
            notificationManager.notify(sNotifyId, build);
        } else if (r == 1) {
            notificationManager.notify((int) j, build);
        } else {
            C4146p.m11204a(TAG, "unknow notify style " + r);
        }
    }

    public static boolean repealNotifyById(Context context, int i) {
        int r = C4121p.m11080a().mo41133r();
        if (r == 0) {
            long b = C4153w.m11245b().mo41185b("com.vivo.push.notify_key", -1);
            if (b == ((long) i)) {
                C4146p.m11216d(TAG, "undo showed message " + i);
                C4146p.m11208a(context, "回收已展示的通知： " + i);
                return cancelNotify(context, sNotifyId);
            }
            C4146p.m11216d(TAG, "current showing message id " + b + " not match " + i);
            C4146p.m11208a(context, "与已展示的通知" + b + "与待回收的通知" + i + "不匹配");
            return false;
        } else if (r == 1) {
            return cancelNotify(context, i);
        } else {
            C4146p.m11204a(TAG, "unknow cancle notify style " + r);
            return false;
        }
    }

    public static void setNotifyId(int i) {
        sNotifyId = i;
    }

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }
}
