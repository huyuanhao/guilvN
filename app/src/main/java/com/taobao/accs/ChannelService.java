package com.taobao.accs;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import com.taobao.accs.base.BaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3190t;
import com.umeng.message.entity.UMessage;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;

public class ChannelService extends BaseService {
    public static final int DEFAULT_FORGROUND_V = 21;
    public static final int NOTIFY_ID = 9371;
    public static int SDK_VERSION_CODE = Constants.SDK_VERSION_CODE;
    public static final String SUPPORT_FOREGROUND_VERSION_KEY = "support_foreground_v";
    public static final String TAG = "ChannelService";

    /* renamed from: id */
    public static final String f6817id = "accs_agoo_normal_channel";
    public static ChannelService mInstance;
    public boolean mFristStarted = true;
    public AtomicInteger notificationId = new AtomicInteger(0);
    public NotificationManager notificationManager;
    public ScheduledFuture scheduledFuture;
    public ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public static class KernelService extends Service {

        /* renamed from: a */
        public static KernelService f6818a;

        /* renamed from: b */
        public Context f6819b;

        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            f6818a = this;
            this.f6819b = getApplicationContext();
        }

        public void onDestroy() {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.m7598e(ChannelService.TAG, "onDestroy", th, new Object[0]);
            }
            f6818a = null;
            super.onDestroy();
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            try {
                ThreadPoolExecutorFactory.execute(new RunnableC3088b(this));
            } catch (Throwable th) {
                ALog.m7598e(ChannelService.TAG, " onStartCommand", th, new Object[0]);
            }
            return super.onStartCommand(intent, i, i2);
        }
    }

    @TargetApi(26)
    /* renamed from: com.taobao.accs.ChannelService$a */
    public class RunnableC3082a implements Runnable {

        /* renamed from: a */
        public int f6820a;

        /* renamed from: c */
        public int f6822c = 0;

        public RunnableC3082a(int i) {
            this.f6820a = i;
        }

        public void run() {
            try {
                ALog.m7600i(ChannelService.TAG, "scan foreground notification times: ", Integer.valueOf(this.f6822c));
                int i = this.f6822c;
                this.f6822c = i + 1;
                if (i >= 100) {
                    ALog.m7599e(ChannelService.TAG, "schedule 10s, but not find foreground notification, try to stop foreground", new Object[0]);
                    ChannelService.this.scheduledFuture.cancel(false);
                    ChannelService.mInstance.stopForeground(true);
                    return;
                }
                StatusBarNotification[] activeNotifications = ChannelService.this.notificationManager.getActiveNotifications();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification.getNotification() != null && ChannelService.f6817id.equals(statusBarNotification.getNotification().getChannelId())) {
                        if (statusBarNotification.getId() == this.f6820a) {
                            synchronized (ChannelService.class) {
                                ChannelService.this.scheduledFuture.cancel(false);
                                ALog.m7600i(ChannelService.TAG, "find foreground notification try to delete it", new Object[0]);
                                ChannelService.this.notificationManager.deleteNotificationChannel(ChannelService.f6817id);
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static ChannelService getInstance() {
        return mInstance;
    }

    public static int getSupportForegroundVer(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(SUPPORT_FOREGROUND_VERSION_KEY, 21);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "getSupportForegroundVer fail:", th, "key", SUPPORT_FOREGROUND_VERSION_KEY);
            return 21;
        }
    }

    public static void startKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, KernelService.class);
                intent.setPackage(context.getPackageName());
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "startKernel", th, new Object[0]);
        }
    }

    public static void stopKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, KernelService.class);
                intent.setPackage(context.getPackageName());
                context.stopService(intent);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "stopKernel", th, new Object[0]);
        }
    }

    @TargetApi(26)
    public void foreground() {
        ApplicationInfo applicationInfo;
        try {
            this.scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.notificationManager = (NotificationManager) mInstance.getApplicationContext().getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            try {
                applicationInfo = mInstance.getPackageManager().getApplicationInfo(mInstance.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                applicationInfo = null;
            }
            synchronized (ChannelService.class) {
                NotificationChannel notificationChannel = new NotificationChannel(f6817id, "后台服务", 1);
                notificationChannel.setSound(null, null);
                notificationChannel.setShowBadge(false);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                this.notificationManager.createNotificationChannel(notificationChannel);
                Notification.Builder builder = new Notification.Builder(mInstance, notificationChannel.getId());
                if (applicationInfo != null) {
                    builder.setSmallIcon(applicationInfo.icon);
                    builder.setContentText("正在运行…");
                }
                ALog.m7599e(TAG, "start foreground", new Object[0]);
                if (this.scheduledFuture != null) {
                    this.scheduledFuture.cancel(true);
                }
                mInstance.startForeground(this.notificationId.incrementAndGet(), builder.build());
                this.scheduledFuture = this.scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC3082a(this.notificationId.get()), 100, 100, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "start foreground error", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.BaseService
    public void onCreate() {
        super.onCreate();
        GlobalClientInfo.f6858a = getApplicationContext();
        mInstance = this;
        int i = Build.VERSION.SDK_INT;
        if (i < 18) {
            try {
                startForeground(NOTIFY_ID, new Notification());
            } catch (Throwable th) {
                ALog.m7598e(TAG, "ChannelService onCreate", th, new Object[0]);
            }
        } else if (i >= 26 && C3190t.m7704d() && AgooConstants.TAOBAO_PACKAGE.equals(getApplicationContext().getPackageName())) {
            foreground();
        }
    }

    @Override // com.taobao.accs.base.BaseService
    public void onDestroy() {
        if (Build.VERSION.SDK_INT < 18) {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.m7598e(TAG, "ChannelService onDestroy", th, new Object[0]);
            }
        }
        stopKernel(getApplicationContext());
        ScheduledFuture scheduledFuture2 = this.scheduledFuture;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.scheduledThreadPoolExecutor;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledThreadPoolExecutor2.shutdown();
        }
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.BaseService
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mFristStarted) {
            this.mFristStarted = false;
            startKernel(getApplicationContext());
        }
        return super.onStartCommand(intent, i, i2);
    }
}
