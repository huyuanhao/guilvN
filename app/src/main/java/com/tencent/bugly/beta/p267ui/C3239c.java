package com.tencent.bugly.beta.p267ui;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3372y;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Locale;

/* renamed from: com.tencent.bugly.beta.ui.c */
public class C3239c {

    /* renamed from: a */
    public static C3239c f7439a = new C3239c();

    /* renamed from: b */
    public DownloadTask f7440b;

    /* renamed from: c */
    public String f7441c = (this.f7446h.getPackageName() + ".beta.DOWNLOAD_NOTIFY");

    /* renamed from: d */
    public C3372y f7442d;

    /* renamed from: e */
    public AbstractC3238b f7443e;

    /* renamed from: f */
    public NotificationManager f7444f = ((NotificationManager) this.f7446h.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION));

    /* renamed from: g */
    public Notification f7445g;

    /* renamed from: h */
    public Context f7446h = C3226e.f7357E.f7406s;

    /* renamed from: i */
    public boolean f7447i = true;

    /* renamed from: j */
    public long f7448j;

    /* renamed from: k */
    public NotificationCompat.OooO0OO f7449k;

    public C3239c() {
        this.f7446h.registerReceiver(new BetaReceiver(), new IntentFilter(this.f7441c));
        m7786b();
    }

    /* renamed from: b */
    private void m7786b() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("001", "bugly_upgrade", 2);
            notificationChannel.setDescription("bugly upgrade");
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[]{0});
            this.f7444f.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: a */
    public void mo38019a(DownloadTask downloadTask) {
        ApplicationInfo applicationInfo;
        this.f7440b = downloadTask;
        this.f7448j = downloadTask.getSavedLength();
        boolean isNeededNotify = downloadTask.isNeededNotify();
        this.f7447i = isNeededNotify;
        if (isNeededNotify && C3226e.f7357E.f7375R) {
            this.f7444f.cancel(1000);
            Intent intent = new Intent(this.f7441c);
            intent.putExtra("request", 1);
            if (this.f7449k == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        this.f7449k = new NotificationCompat.OooO0OO(this.f7446h, "001");
                    } catch (Throwable unused) {
                        this.f7449k = new NotificationCompat.OooO0OO(this.f7446h);
                    }
                } else {
                    this.f7449k = new NotificationCompat.OooO0OO(this.f7446h);
                }
            }
            NotificationCompat.OooO0OO oooO0OO = this.f7449k;
            NotificationCompat.OooO0OO OooO0OO = oooO0OO.OooO0o0((CharSequence) (Beta.strNotificationDownloading + C3226e.f7357E.f7412y)).OooO0OO((CharSequence) C3226e.f7357E.f7412y);
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[2];
            objArr[0] = Beta.strNotificationDownloading;
            long j = 0;
            if (this.f7440b.getTotalLength() != 0) {
                j = (this.f7440b.getSavedLength() * 100) / this.f7440b.getTotalLength();
            }
            objArr[1] = Integer.valueOf((int) j);
            OooO0OO.OooO0O0((CharSequence) String.format(locale, "%s %d%%", objArr)).OooO00o(PendingIntent.getBroadcast(this.f7446h, 1, intent, CommonNetImpl.FLAG_AUTH)).OooO00o(false);
            C3226e eVar = C3226e.f7357E;
            int i = eVar.f7393f;
            if (i > 0) {
                this.f7449k.OooO0oO(i);
            } else {
                PackageInfo packageInfo = eVar.f7413z;
                if (!(packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null)) {
                    this.f7449k.OooO0oO(applicationInfo.icon);
                }
            }
            try {
                if (C3226e.f7357E.f7394g > 0 && this.f7446h.getResources().getDrawable(C3226e.f7357E.f7394g) != null) {
                    this.f7449k.m14503OooO00o(C3222a.m7754a(this.f7446h.getResources().getDrawable(C3226e.f7357E.f7394g)));
                }
            } catch (Resources.NotFoundException e) {
                C3321an.m8354c(C3239c.class, "[initNotify] " + e.getMessage(), new Object[0]);
            }
            Notification OooO00o = this.f7449k.m14500OooO00o();
            this.f7445g = OooO00o;
            this.f7444f.notify(1000, OooO00o);
        }
    }

    /* renamed from: a */
    public void mo38018a() {
        DownloadTask downloadTask;
        if (this.f7447i && (downloadTask = this.f7440b) != null && C3226e.f7357E.f7375R) {
            if (downloadTask.getSavedLength() - this.f7448j > 307200 || this.f7440b.getStatus() == 1 || this.f7440b.getStatus() == 5 || this.f7440b.getStatus() == 3) {
                this.f7448j = this.f7440b.getSavedLength();
                if (this.f7440b.getStatus() == 1) {
                    this.f7449k.OooO00o(true).OooO0O0((CharSequence) Beta.strNotificationClickToInstall).OooO0OO((CharSequence) String.format("%s %s", C3226e.f7357E.f7412y, Beta.strNotificationDownloadSucc));
                } else if (this.f7440b.getStatus() == 5) {
                    this.f7449k.OooO00o(false).OooO0O0((CharSequence) Beta.strNotificationClickToRetry).OooO0OO((CharSequence) String.format("%s %s", C3226e.f7357E.f7412y, Beta.strNotificationDownloadError));
                } else {
                    long j = 0;
                    if (this.f7440b.getStatus() == 2) {
                        NotificationCompat.OooO0OO OooO0OO = this.f7449k.OooO0OO((CharSequence) C3226e.f7357E.f7412y);
                        Locale locale = Locale.getDefault();
                        Object[] objArr = new Object[2];
                        objArr[0] = Beta.strNotificationDownloading;
                        if (this.f7440b.getTotalLength() != 0) {
                            j = (this.f7440b.getSavedLength() * 100) / this.f7440b.getTotalLength();
                        }
                        objArr[1] = Integer.valueOf((int) j);
                        OooO0OO.OooO0O0((CharSequence) String.format(locale, "%s %d%%", objArr)).OooO00o(false);
                    } else if (this.f7440b.getStatus() == 3) {
                        NotificationCompat.OooO0OO OooO0OO2 = this.f7449k.OooO0OO((CharSequence) C3226e.f7357E.f7412y);
                        Locale locale2 = Locale.getDefault();
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = Beta.strNotificationClickToContinue;
                        if (this.f7440b.getTotalLength() != 0) {
                            j = (this.f7440b.getSavedLength() * 100) / this.f7440b.getTotalLength();
                        }
                        objArr2[1] = Integer.valueOf((int) j);
                        OooO0OO2.OooO0O0((CharSequence) String.format(locale2, "%s %d%%", objArr2)).OooO00o(false);
                    }
                }
                Notification OooO00o = this.f7449k.m14500OooO00o();
                this.f7445g = OooO00o;
                this.f7444f.notify(1000, OooO00o);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo38020a(C3372y yVar, AbstractC3238b bVar) {
        this.f7442d = yVar;
        this.f7443e = bVar;
        this.f7444f.cancel(1001);
        Intent intent = new Intent(this.f7441c);
        intent.putExtra("request", 2);
        if (this.f7449k == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.f7449k = new NotificationCompat.OooO0OO(this.f7446h, "001");
                } catch (Throwable unused) {
                    this.f7449k = new NotificationCompat.OooO0OO(this.f7446h);
                }
            } else {
                this.f7449k = new NotificationCompat.OooO0OO(this.f7446h);
            }
        }
        NotificationCompat.OooO0OO oooO0OO = this.f7449k;
        oooO0OO.OooO0o0((CharSequence) (C3226e.f7357E.f7412y + Beta.strNotificationHaveNewVersion)).OooO0OO((CharSequence) String.format("%s %s", C3226e.f7357E.f7412y, Beta.strNotificationHaveNewVersion)).OooO00o(PendingIntent.getBroadcast(this.f7446h, 2, intent, CommonNetImpl.FLAG_AUTH)).OooO00o(true).OooO0O0((CharSequence) String.format("%s.%s", yVar.f8295e.f8264d, Integer.valueOf(yVar.f8295e.f8263c)));
        if (C3226e.f7357E.f7393f > 0) {
            this.f7449k.OooO0oO(C3226e.f7357E.f7393f);
        } else if (!(C3226e.f7357E.f7413z == null || C3226e.f7357E.f7413z.applicationInfo == null)) {
            this.f7449k.OooO0oO(C3226e.f7357E.f7413z.applicationInfo.icon);
        }
        if (C3226e.f7357E.f7394g > 0 && this.f7446h.getResources().getDrawable(C3226e.f7357E.f7394g) != null) {
            this.f7449k.m14503OooO00o(C3222a.m7754a(this.f7446h.getResources().getDrawable(C3226e.f7357E.f7394g)));
        }
        Notification OooO00o = this.f7449k.m14500OooO00o();
        this.f7445g = OooO00o;
        this.f7444f.notify(1001, OooO00o);
    }
}
