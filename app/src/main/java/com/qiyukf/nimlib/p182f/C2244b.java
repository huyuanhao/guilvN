package com.qiyukf.nimlib.p182f;

import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.StatusBarNotificationConfig;
import com.qiyukf.unicorn.p209b.C2437b;
import com.umeng.message.entity.UMessage;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.qiyukf.nimlib.f.b */
public final class C2244b {

    /* renamed from: k */
    public static C2244b f4464k;

    /* renamed from: a */
    public Context f4465a = C2180b.m4471a();

    /* renamed from: b */
    public SimpleDateFormat f4466b = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /* renamed from: c */
    public NotificationManager f4467c = ((NotificationManager) this.f4465a.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION));

    /* renamed from: d */
    public Map<String, C2313a> f4468d = new HashMap();

    /* renamed from: e */
    public String f4469e;

    /* renamed from: f */
    public String f4470f;

    /* renamed from: g */
    public String f4471g;

    /* renamed from: h */
    public String f4472h = (this.f4465a.getPackageName() + ".unicorn");

    /* renamed from: i */
    public int f4473i;

    /* renamed from: j */
    public long f4474j = 0;

    public C2244b() {
        C22451 r0 = new BroadcastReceiver() {
            /* class com.qiyukf.nimlib.p182f.C2244b.C22451 */

            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                    C2244b.m4693a(C2244b.this);
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        C2244b.m4693a(C2244b.this);
                    }
                } else if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    C2205d.m4579c(false);
                }
            }
        };
        C2205d.m4579c(true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C2180b.m4471a().registerReceiver(r0, intentFilter);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4467c.createNotificationChannel(new NotificationChannel(this.f4472h, this.f4465a.getString(C2364R.string.ysf_app_name), 3));
        }
    }

    /* renamed from: a */
    private int m4690a(StatusBarNotificationConfig statusBarNotificationConfig) {
        int i = statusBarNotificationConfig.notificationSmallIconId;
        return i == 0 ? this.f4465a.getApplicationInfo().icon : i;
    }

    /* renamed from: a */
    private Bitmap m4691a(IMMessage iMMessage) {
        if (C2180b.m4479d().userInfoProvider != null && this.f4468d.size() <= 1) {
            String str = C2452d.m5373e().statusBarNotificationConfig != null ? C2452d.m5373e().statusBarNotificationConfig.bigIconUri : null;
            if (TextUtils.isEmpty(str)) {
                UserInfoProvider userInfoProvider = C2180b.m4479d().userInfoProvider;
                if (iMMessage.getSessionType() == SessionTypeEnum.P2P || iMMessage.getSessionType() == SessionTypeEnum.Ysf) {
                    UserInfoProvider.UserInfo userInfo = userInfoProvider.getUserInfo(iMMessage.getFromAccount() + iMMessage.getUuid());
                    if (userInfo != null) {
                        str = userInfo.getAvatar();
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    int a = C1862c.m3540a(72.0f);
                    Bitmap a2 = C1870a.m3562a(str);
                    if (a2 == null) {
                        a2 = C1870a.m3563a(str, a, a);
                    }
                    if (a2 != null && (a2.getWidth() < (a << 1) / 3 || a2.getWidth() > (a * 3) / 2)) {
                        a2 = Bitmap.createScaledBitmap(a2, a, a, false);
                    }
                    if (a2 == null) {
                        C1870a.m3566a(str, a, a, (ImageLoaderListener) null);
                    }
                    return a2;
                } catch (Throwable th) {
                    th.printStackTrace();
                    C1709a.m3011a("MN", "user custom image loader exception");
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m4692a() {
        if (m4697c()) {
            m4695b().m4698d();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4693a(C2244b bVar) {
        C2205d.m4579c(true);
        String d = C2205d.m4581d();
        if (!TextUtils.isEmpty(d) && bVar.f4468d.containsKey(d)) {
            m4692a();
        }
    }

    /* renamed from: a */
    public static void m4694a(C2313a aVar, String str, int i) {
        if (m4697c()) {
            m4695b().m4696b(aVar, str, i);
        }
    }

    /* renamed from: b */
    public static C2244b m4695b() {
        if (f4464k == null) {
            f4464k = new C2244b();
        }
        return f4464k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r5.compareTo(r4) > 0) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0233  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m4696b(com.qiyukf.nimlib.p195h.C2313a r12, java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p182f.C2244b.m4696b(com.qiyukf.nimlib.h.a, java.lang.String, int):void");
    }

    /* renamed from: c */
    public static boolean m4697c() {
        return C2452d.m5373e().statusBarNotificationConfig != null && C2437b.m5289l();
    }

    /* renamed from: d */
    private synchronized void m4698d() {
        this.f4467c.cancel(EnumC2246c.MESSAGE.mo34872a(), 0);
        this.f4473i = 0;
        this.f4468d.clear();
    }

    /* renamed from: e */
    private String m4699e() {
        String str;
        if (this.f4465a.getApplicationInfo().labelRes == 0) {
            PackageManager packageManager = this.f4465a.getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f4465a.getPackageName(), 0);
                str = (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "");
            } catch (Exception unused) {
                str = null;
            }
        } else {
            Context context = this.f4465a;
            str = context.getString(context.getApplicationInfo().labelRes);
        }
        return TextUtils.isEmpty(str) ? this.f4465a.getString(C2364R.string.ysf_msg_notify_default_title) : str;
    }
}
